package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ApiClient
import com.ipasssdk.apis.ApiInterface
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.KycInitiateAccountRequest
import com.ipasssdk.model.request.KycPrepareDataRequest
import com.ipasssdk.model.response.*
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.ErrorHandler
import com.ipasssdk.utils.InternetConnectionService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object KYC {


    @RequiresApi(Build.VERSION_CODES.O)
    fun kycInitiateAccount(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        kycInitiateAccountRequest: KycInitiateAccountRequest,
        completion: ResultListener<BaseModel<KycInitiateAccountResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .kycInitiateAccount(token,accountId, kycInitiateAccountRequest)
                .enqueue(object : Callback<BaseModel<KycInitiateAccountResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<KycInitiateAccountResponse>>,
                        response: Response<BaseModel<KycInitiateAccountResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,"bdy"))
                        }
                    }

                    override fun onFailure(
                        call: Call<BaseModel<KycInitiateAccountResponse>>,
                        t: Throwable
                    ) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun kycPrepareData(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        workflowExecutionId: String,
        kycPrepareData: KycPrepareDataRequest,
        completion: ResultListener<BaseModel<KycPrepareDataResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .kycPrepareData(token,accountId, credentialId, workflowExecutionId, kycPrepareData)
                .enqueue(object : Callback<BaseModel<KycPrepareDataResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<KycPrepareDataResponse>>,
                        response: Response<BaseModel<KycPrepareDataResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "parseBody"))
                        }
                    }

                    override fun onFailure(
                        call: Call<BaseModel<KycPrepareDataResponse>>,
                        t: Throwable
                    ) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun kycPutPrepareData(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workflowExecutionId: String,
        completion: ResultListener<BaseModel<KycPutPrepareResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .kycPutPrepareData(token,accountId, workflowExecutionId)
                .enqueue(object : Callback<BaseModel<KycPutPrepareResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<KycPutPrepareResponse>>,
                        response: Response<BaseModel<KycPutPrepareResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response,""))
                        }
                    }

                    override fun onFailure(call: Call<BaseModel<KycPutPrepareResponse>>, t: Throwable) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun kycWorkflowStatus(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workflowExecutionId: String,
        completion: ResultListener<BaseModel<KycWorkflowStatusResponse>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .kycWorkflowStatus(token,accountId, workflowExecutionId)
                .enqueue(object : Callback<BaseModel<KycWorkflowStatusResponse>> {
                    override fun onResponse(
                        call: Call<BaseModel<KycWorkflowStatusResponse>>,
                        response: Response<BaseModel<KycWorkflowStatusResponse>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, "statusParse"))
                        }
                    }

                    override fun onFailure(
                        call: Call<BaseModel<KycWorkflowStatusResponse>>,
                        t: Throwable
                    ) {
                        completion.onError(t.message.toString())
                    }
                })
        } else {
            completion.onError(Constants.NO_INTERNET_TEXT)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun kycUserDetail(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workflowExecutionId: String,
        completion: ResultListener<BaseModel<UserDetailParsedModel>>,
    ) {
        if (InternetConnectionService.networkAvailable(context)) {
            ApiClient(x_api_key)?.create(ApiInterface::class.java)!!
                .kycUserDetail(token,accountId, workflowExecutionId)
                .enqueue(object : Callback<BaseModel<UserDetailParsedModel>> {
                    override fun onResponse(
                        call: Call<BaseModel<UserDetailParsedModel>>,
                        response: Response<BaseModel<UserDetailParsedModel>>
                    ) {
                        if (response.isSuccessful) {
                            completion.onSuccess(response.body()!!)
                        } else {
                            completion.onError(ErrorHandler(response, ""))
                        }
                    }

                    override fun onFailure(
                        call: Call<BaseModel<UserDetailParsedModel>>,
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