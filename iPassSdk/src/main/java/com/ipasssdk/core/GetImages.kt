package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.ImageResponse
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object GetImages {


    @RequiresApi(Build.VERSION_CODES.O)
    fun frontImage(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .frontImage(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,"parseBody"))
                              }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun backImage(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .backImage(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun faceImage(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .faceImage(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage1(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .liveNessImage1(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,"parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage2(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .liveNessImage2(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage3(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .liveNessImage3(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage4(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .liveNessImage4(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage5(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .liveNessImage5(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage6(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .liveNessImage6(token,accountId, credentialId)
                .enqueue(object : Callback<BaseModel<ImageResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<ImageResponse>>,
                        response: Response<BaseModel<ImageResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ImageResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


}