package com.ipasssdk.core

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.ipasssdk.apis.ResultListener
import com.ipasssdk.model.request.*
import com.ipasssdk.model.response.*
import com.ipasssdk.utils.Constants
import com.ipasssdk.utils.InternetConnectionService

object IPassSDK {

    @RequiresApi(Build.VERSION_CODES.O)
    fun getJwtToken(
        context: Context,
        token: String,
        request: TokenRequest,
        completion: ResultListener<BaseModel<UserModel>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }

        if (request.email!!.isEmpty()) {
            completion.onError("email is empty")
            return
        }

//        if(request.email!!.isEmpty()){
//            completion.onError("Invalid Email")
//            return
//        }

        if (request.password!!.isEmpty()) {
            completion.onError("password is empty")
            return
        }

        if (request.first_name!!.isEmpty()) {
            completion.onError("First name is empty")
            return
        }

        if (request.last_name!!.isEmpty()) {
            completion.onError("Last name is empty")
            return
        }

        JwtToken.token(context, token, request, completion)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun initiateAccount(
        context: Context,
        token: String,
        x_api_key: String,
        request: InitiateAccountRequest,
        completion: ResultListener<BaseModel<InitiateAccountResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        InitiateAccount.initiateAccount(context, x_api_key, token, request, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun workflowStatus(
        context: Context,
        token: String,
        x_api_key: String,
        request: WorkflowRequest,
        completion: ResultListener<BaseModel<ParsedModel>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        WorkflowStatus.workflowStatus(context, x_api_key, token, request, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun userDetails(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workflowExecutionId: String,
        completion: ResultListener<BaseModel<UserDetailParsedModel>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        UserDetail.userDetail(context, x_api_key, token, accountId, workflowExecutionId, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun frontImage(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.frontImage(context, x_api_key, token, accountId, credentialId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun backImage(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.backImage(context, x_api_key, token, accountId, credentialId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun faceImage(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.faceImage(context, x_api_key, token, accountId, credentialId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage1(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.liveNessImage1(context, x_api_key, token, accountId, credentialId, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage2(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.liveNessImage2(context, x_api_key, token, accountId, credentialId, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage3(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.liveNessImage3(context, x_api_key, token, accountId, credentialId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage4(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.liveNessImage4(context, x_api_key, token, accountId, credentialId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage5(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.liveNessImage5(context, x_api_key, token, accountId, credentialId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun liveNessImage6(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        credentialId: String,
        completion: ResultListener<BaseModel<ImageResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        GetImages.liveNessImage6(context, x_api_key, token, accountId, credentialId, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun deleteAccountData(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workFlowExecutionId: String,
        completion: ResultListener<BaseModel<ErrorModel>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        DeleteData.deleteAccountData(context, x_api_key, token, accountId,workFlowExecutionId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun deleteAllData(
        context: Context, x_api_key: String, token: String, accountId: String,
        workFlowExecutionId:String,
        completion: ResultListener<BaseModel<ErrorModel>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        DeleteData.deleteAllData(context, x_api_key, token, accountId, workFlowExecutionId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun kycInitiateAccount(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        kycInitiateAccount: KycInitiateAccountRequest,
        completion: ResultListener<BaseModel<KycInitiateAccountResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        KYC.kycInitiateAccount(context, x_api_key, token, accountId, kycInitiateAccount, completion)
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
        completion: ResultListener<BaseModel<KycPrepareDataResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        KYC.kycPrepareData(
            context,
            x_api_key,
            token,
            accountId,
            credentialId,
            workflowExecutionId,
            kycPrepareData,
            completion
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun kycPutPrepareData(
        context: Context, x_api_key: String,
        token: String, accountId: String, workflowExecutionId: String,

        completion: ResultListener<BaseModel<KycPutPrepareResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        KYC.kycPutPrepareData(
            context, x_api_key, token, accountId, workflowExecutionId, completion
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun kycWorkflowStatus(
        context: Context, x_api_key: String,
        token: String, accountId: String, workflowExecutionId: String,

        completion: ResultListener<BaseModel<KycWorkflowStatusResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        KYC.kycWorkflowStatus(
            context, x_api_key, token, accountId, workflowExecutionId, completion
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun kycUserDetail(
        context: Context,
        x_api_key: String,
        token: String,
        accountId: String,
        workflowExecutionId: String,
        completion: ResultListener<BaseModel<UserDetailParsedModel>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }

        KYC.kycUserDetail(
            context, x_api_key, token, accountId, workflowExecutionId, completion
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun socialMediaEmail(
        context: Context,
        x_api_key: String,
        token: String,
       socialMediaRequest:SocialMediaEmailRequest,
        completion: ResultListener<BaseModel<SocialMediaParseResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }

        SocialMedia.socialMediaEmail(
            context, x_api_key, token,socialMediaRequest,  completion
        )
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun socialMediaPhone(
        context: Context,
        x_api_key: String,
        token: String,
       socialMediaRequest:SocialMediaPhoneRequest,
        completion: ResultListener<BaseModel<SocialMediaParseResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }

        SocialMedia.socialMediaPhone(
            context, x_api_key, token,socialMediaRequest,  completion
        )
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun uploadPassportImage(
        context: Context,
        x_api_key: String,
        token: String,
        request: ImageDocumentRequest,
        completion: ResultListener<BaseModel<PostDocumentResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        PassportData.uploadPassportImage(context, x_api_key, token, request, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getPassportImageData(
        context: Context,
        x_api_key: String,
        token: String,
        apimId: String,
        completion: ResultListener<BaseModel<GetDocumentResParseData>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        PassportData.getPassportImageData(context, x_api_key, token, apimId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun uploadDrivingLicence(
        context: Context,
        x_api_key: String,
        token: String,
        request: ImageDocumentRequest,
        completion: ResultListener<BaseModel<PostDocumentResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        DrivingLicenceData.uploadDrivingLicence(context, x_api_key, token, request, completion)
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun getDrivingLicenseImageData(
        context: Context,
        x_api_key: String,
        token: String,
        apimId: String,
        completion: ResultListener<BaseModel<GetDocumentResParseData>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        DrivingLicenceData.getDrivingLicenseImageData(context, x_api_key, token, apimId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun uploadIdCardFrontImage(
        context: Context,
        x_api_key: String,
        token: String,
        request: ImageDocumentRequest,
        completion: ResultListener<BaseModel<PostDocumentResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        IdCardData.uploadIdCardFrontImage(context, x_api_key, token, request, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getIdCardFrontImage(
        context: Context,
        x_api_key: String,
        token: String,
        apimId: String,
        completion: ResultListener<BaseModel<GetDocumentResParseData>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        IdCardData.getIdCardFrontImage(context, x_api_key, token, apimId, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun uploadIdCardBackImage(
        context: Context,
        x_api_key: String,
        token: String,
        request: ImageDocumentRequest,
        completion: ResultListener<BaseModel<PostDocumentResponse>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        IdCardData.uploadIdCardBackImage(context, x_api_key, token, request, completion)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getIdCardBackImage(
        context: Context,
        x_api_key: String,
        token: String,
        apimId: String,
        completion: ResultListener<BaseModel<GetDocumentResParseData>>
    ) {
        if (!InternetConnectionService.networkAvailable(context)) {
            completion.onError(Constants.NO_INTERNET_TEXT)
            return
        }
        IdCardData.getIdCardBackImage(context, x_api_key, token, apimId, completion)
    }

}
