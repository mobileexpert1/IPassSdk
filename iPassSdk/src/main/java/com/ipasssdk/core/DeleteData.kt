package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.ErrorModel
import com.ipasssdk.model.response.WorkflowResponse
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object DeleteData {

    @RequiresApi(Build.VERSION_CODES.O)
    fun deleteAccountData(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workFlowExecutionId: String,
        completion: ResultListener<BaseModel<ErrorModel>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .deleteAccountData(token,accountId,workFlowExecutionId)
                .enqueue(object : Callback<BaseModel<ErrorModel>> {
                    override fun onResponse(
                        call: Call<BaseModel<ErrorModel>>,
                        response: Response<BaseModel<ErrorModel>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ErrorModel>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun deleteAllData(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workFlowExecutionId: String,
        completion: ResultListener<BaseModel<ErrorModel>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .deleteAllData(token,accountId, workFlowExecutionId,)
                .enqueue(object : Callback<BaseModel<ErrorModel>> {
                    override fun onResponse(
                        call: Call<BaseModel<ErrorModel>>,
                        response: Response<BaseModel<ErrorModel>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ErrorModel>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }

}