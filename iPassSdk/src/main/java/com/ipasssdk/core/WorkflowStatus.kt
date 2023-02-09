package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.InitiateAccountRequest
import com.ipasssdk.model.request.WorkflowRequest
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.InitiateAccountResponse
import com.ipasssdk.model.response.ParsedModel
import com.ipasssdk.model.response.WorkflowResponse
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object WorkflowStatus {

    @RequiresApi(Build.VERSION_CODES.O)
    fun workflowStatus(
        context: Context,
        x_api_key: String,
        token: String,
        request: WorkflowRequest,
        completion: ResultListener<BaseModel<ParsedModel>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .workflowStatus(token,request.account.id!!, request.workflowExecution.id!!)
                .enqueue(object : Callback<BaseModel<ParsedModel>> {
                    override fun onResponse(
                        call: Call<BaseModel<ParsedModel>>,
                        response: Response<BaseModel<ParsedModel>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                             completion.onError(ErrorHandler(response,"statusParse"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<ParsedModel>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }

}