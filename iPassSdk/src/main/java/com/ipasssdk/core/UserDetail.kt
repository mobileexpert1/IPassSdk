package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.WorkflowRequest
import com.ipasssdk.model.response.BaseModel
import com.ipasssdk.model.response.UserDetailParsedModel
import com.ipasssdk.model.response.UserDetailResponse
import com.ipasssdk.model.response.WorkflowResponse
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object UserDetail {

    @RequiresApi(Build.VERSION_CODES.O)
    fun userDetail(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workflowExecutionId: String,
        completion: ResultListener<BaseModel<UserDetailParsedModel>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .userDetail(token,accountId, workflowExecutionId)
                .enqueue(object : Callback<BaseModel<UserDetailParsedModel>> {
                    override fun onResponse(
                        call: Call<BaseModel<UserDetailParsedModel>>,
                        response: Response<BaseModel<UserDetailParsedModel>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                             completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<UserDetailParsedModel>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


}