package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.ImageDocumentRequest
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.GetDocumentResParseData
import com.ipasssdk.model.response.GetDocumentResponse
import com.ipasssdk.model.response.PostDocumentResponse
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object DrivingLicenceData {

    @RequiresApi(Build.VERSION_CODES.O)
    fun uploadDrivingLicence(
        context: Context,
        x_api_key: String,
        token: String,
        request: ImageDocumentRequest,
        completion: ResultListener<BaseModel<PostDocumentResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .uploadDrivingLicenceImage(token,request).enqueue(object :
                    Callback<BaseModel<PostDocumentResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<PostDocumentResponse>>,
                        response: Response<BaseModel<PostDocumentResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, ""))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<PostDocumentResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }

    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun getDrivingLicenseImageData(
        context: Context,
        x_api_key: String,
        token: String,
        apimId: String,
        completion: ResultListener<BaseModel<GetDocumentResParseData>>,
    ) {

        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .getDrivingLicenseImageData(token,apimId).enqueue(object :
                    Callback<BaseModel<GetDocumentResParseData>> {
                    override fun onResponse(
                        call: Call<BaseModel<GetDocumentResParseData>>,
                        response: Response<BaseModel<GetDocumentResParseData>>
                    ) {
                        if (response.isSuccessful) {
                            if (response.body()!!.message == "Fail") {
                                completion.onError(
                                    response.body()!!.error?.resParse?.errorCodeResponse!!
                                        .innererror!!.message!!
                                )
                            } else {
                                completion.onSuccess(response.body()!!)
                            }
                        } else {
                            completion.onError(ErrorHandler(response, "user"))
                        }
                    }

                    override fun onFailure(
                        call: Call<BaseModel<GetDocumentResParseData>>,
                        t: Throwable
                    ) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }

    }


}