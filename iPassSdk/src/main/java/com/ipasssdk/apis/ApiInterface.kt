package com.ipasssdk.apis

import com.ipasssdk.model.request.*
import com.ipasssdk.model.response.*
import com.ipasssdk.utils.ServerUrls
import retrofit2.Call
import retrofit2.http.*


/**
 * Interface for endpoint methods
 */

interface ApiInterface {

    @POST(ServerUrls.url_jwt_token)
    fun jwtToken(
        @Query("token") token: String,
        @Body tokenRequest: TokenRequest
    ): Call<BaseModel<UserModel>>


    @POST(ServerUrls.url_initiate_account)
    fun initiateAccount(
        @Query("token") token: String,
        @Body initiateAccountRequest: InitiateAccountRequest
    ): Call<BaseModel<InitiateAccountResponse>>


    @GET(ServerUrls.url_workflow_status)
    fun workflowStatus(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId") workflowExecutionId: String,
    ): Call<BaseModel<ParsedModel>>


    @GET(ServerUrls.url_user_detail)
    fun userDetail(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId") workflowExecutionId: String,
    ): Call<BaseModel<UserDetailParsedModel>>


    @GET(ServerUrls.url_front_image)
    fun frontImage(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>


    @GET(ServerUrls.url_back_image)
    fun backImage(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>


    @GET(ServerUrls.url_face_image)
    fun faceImage(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>


    @GET(ServerUrls.url_live_ness_image1)
    fun liveNessImage1(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>

    @GET(ServerUrls.url_live_ness_image2)
    fun liveNessImage2(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>

    @GET(ServerUrls.url_live_ness_image3)
    fun liveNessImage3(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>

    @GET(ServerUrls.url_live_ness_image4)
    fun liveNessImage4(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>

    @GET(ServerUrls.url_live_ness_image5)
    fun liveNessImage5(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>

    @GET(ServerUrls.url_live_ness_image6)
    fun liveNessImage6(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
    ): Call<BaseModel<ImageResponse>>

    @DELETE(ServerUrls.url_delete_account_data)
    fun deleteAccountData(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId") workFlowExecutionId: String,
    ): Call<BaseModel<ErrorModel>>


    @DELETE(ServerUrls.url_delete_all_data)
    fun deleteAllData(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId")  workFlowExecutionId: String,
    ): Call<BaseModel<ErrorModel>>


    @PUT(ServerUrls.url_kyc_initate_account)
    fun kycInitiateAccount(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Body kycInitiateAccount: KycInitiateAccountRequest
    ): Call<BaseModel<KycInitiateAccountResponse>>

    @POST(ServerUrls.url_kyc_prepare_data)
    fun kycPrepareData(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("credentialId") credentialId: String,
        @Query("workflowExecutionId") workflowExecutionId: String,
        @Body kycPrepareData: KycPrepareDataRequest
    ): Call<BaseModel<KycPrepareDataResponse>>

    @PUT(ServerUrls.url_kyc_put_prepare_data)
    fun kycPutPrepareData(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId") workflowExecutionId: String,
    ): Call<BaseModel<KycPutPrepareResponse>>


    @GET(ServerUrls.url_kyc_workflow_status)
    fun kycWorkflowStatus(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId") workflowExecutionId: String,
    ): Call<BaseModel<KycWorkflowStatusResponse>>


    @GET(ServerUrls.url_kyc_user_detail)
    fun kycUserDetail(
        @Query("token") token: String,
        @Query("accountId") accountId: String,
        @Query("workflowExecutionId") workflowExecutionId: String,
    ): Call<BaseModel<UserDetailParsedModel>>


    @POST(ServerUrls.url_social_media_phone)
    fun socialMediaPhone(
        @Query("token") token: String,
        @Body socialMediaPhoneRequest: SocialMediaPhoneRequest
    ): Call<BaseModel<SocialMediaParseResponse>>


    @POST(ServerUrls.url_social_media_email)
    fun socialMediaEmail(
        @Query("token") token: String,
        @Body socialMediaEmailRequest: SocialMediaEmailRequest
    ): Call<BaseModel<SocialMediaParseResponse>>


    @POST(ServerUrls.url_upload_passport)
    fun uploadPassportImage(
        @Query("token") token: String,
        @Body imageDocumentRequest: ImageDocumentRequest
    ): Call<BaseModel<PostDocumentResponse>>

    @GET(ServerUrls.url_get_passport_image)
    fun getPassportImageData(
        @Query("token") token: String,
        @Query("apimId") apimId: String,
    ): Call<BaseModel<GetDocumentResParseData>>

    @POST(ServerUrls.url_upload_driving_license)
    fun uploadDrivingLicenceImage(
        @Query("token") token: String,
        @Body imageDocumentRequest: ImageDocumentRequest
    ): Call<BaseModel<PostDocumentResponse>>

    @GET(ServerUrls.url_get_driving_license_image)
    fun getDrivingLicenseImageData(
        @Query("token") token: String,
        @Query("apimId") apimId: String,
    ): Call<BaseModel<GetDocumentResParseData>>

    @POST(ServerUrls.url_upload_id_card_front)
    fun uploadIdCardFrontImage(
        @Query("token") token: String,
        @Body imageDocumentRequest: ImageDocumentRequest
    ): Call<BaseModel<PostDocumentResponse>>

    @GET(ServerUrls.url_get_id_card_front_image)
    fun getIdCardFrontImage(
        @Query("token") token: String,
        @Query("apimId") apimId: String,
    ): Call<BaseModel<GetDocumentResParseData>>

    @POST(ServerUrls.url_upload_id_card_back)
    fun uploadIdCardBackImage(
        @Query("token") token: String,
        @Body imageDocumentRequest: ImageDocumentRequest
    ): Call<BaseModel<PostDocumentResponse>>

    @GET(ServerUrls.url_get_id_card_back_image)
    fun getIdCardBackImage(
        @Query("token") token: String,
        @Query("apimId") apimId: String,
    ): Call<BaseModel<GetDocumentResParseData>>


}
