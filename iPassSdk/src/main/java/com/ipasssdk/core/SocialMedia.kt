package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.SocialMediaEmailRequest
import com.ipasssdk.model.request.SocialMediaPhoneRequest
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.SocialMediaParseResponse
import com.ipasssdk.model.response.WorkflowResponse
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object SocialMedia {

    @RequiresApi(Build.VERSION_CODES.O)
    fun socialMediaPhone(
        context: Context,
        x_api_key: String,
        token: String,
        socialMediaPhoneRequest: SocialMediaPhoneRequest,

        completion: ResultListener<BaseModel<SocialMediaParseResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .socialMediaPhone(token,socialMediaPhoneRequest)
                .enqueue(object : Callback<BaseModel<SocialMediaParseResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<SocialMediaParseResponse>>,
                        response: Response<BaseModel<SocialMediaParseResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,""))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<SocialMediaParseResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun socialMediaEmail(
        context: Context,
        x_api_key: String,
        token: String,
        socialMediaEmailRequest: SocialMediaEmailRequest,

        completion: ResultListener<BaseModel<SocialMediaParseResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .socialMediaEmail(token,socialMediaEmailRequest)
                .enqueue(object : Callback<BaseModel<SocialMediaParseResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<SocialMediaParseResponse>>,
                        response: Response<BaseModel<SocialMediaParseResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,""))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<SocialMediaParseResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


}