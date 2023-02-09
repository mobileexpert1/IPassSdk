package com.ipasssdk.core

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.InitiateAccountRequest
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.InitiateAccountResponse
import com.ipasssdk.ui.WebViewActivity
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object InitiateAccount {

    @RequiresApi(Build.VERSION_CODES.O)
    fun initiateAccount(
        context: Context,
        x_api_key: String,
        token: String,
        request: InitiateAccountRequest,
        completion: ResultListener<BaseModel<InitiateAccountResponse>>,
    ) {

        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .initiateAccount(token,request).enqueue(object :
                    Callback<BaseModel<InitiateAccountResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<InitiateAccountResponse>>,
                        response: Response<BaseModel<InitiateAccountResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "user"))
                        }
                    }

                    override fun onFailure(
                        call: Call<BaseModel<InitiateAccountResponse>>,
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