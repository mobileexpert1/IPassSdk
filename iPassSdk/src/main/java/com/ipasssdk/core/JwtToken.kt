package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.response.UserModel
import com.ipasssdk.model.request.TokenRequest
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object JwtToken {

    @RequiresApi(Build.VERSION_CODES.O)
    fun token(
        context: Context,
        token:String,
        request: TokenRequest,
        completion: ResultListener<BaseModel<UserModel>>
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient("")?.create(ApiInterface::class.java)!!
                .jwtToken(token,request).enqueue(object :
                    Callback<BaseModel<UserModel>> {
                    override fun onResponse(
                        call: Call<BaseModel<UserModel>>,
                        response: Response<BaseModel<UserModel>>
                    ) {
                        print("Response ==> $response")
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,"user"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<UserModel>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }

    }

}