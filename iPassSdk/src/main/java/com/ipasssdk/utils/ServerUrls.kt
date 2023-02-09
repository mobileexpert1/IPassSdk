package com.ipasssdk.utils

object ServerUrls {
    const val base_url = "https://api.ipass-mena.com/api/v1/"

    const val url_jwt_token = "ipass/create/jwttoken"
    const val url_initiate_account = "ipass/account/token"
    const val url_workflow_status = "ipass/workflow/status"
    const val url_user_detail = "ipass/detail/user"

    const val url_front_image = "get/front/image"
    const val url_back_image = "get/back/image"
    const val url_face_image = "get/face/image"

    const val url_live_ness_image1 = "get/liveness/image1"
    const val url_live_ness_image2 = "get/liveness/image2"
    const val url_live_ness_image3 = "get/liveness/image3"
    const val url_live_ness_image4 = "get/liveness/image4"
    const val url_live_ness_image5 = "get/liveness/image5"
    const val url_live_ness_image6 = "get/liveness/image6"

    const val url_delete_account_data = "delete/account/data"
    const val url_delete_all_data = "delete/alldata"

    const val url_kyc_initate_account = "kyc/initate/account"
    const val url_kyc_prepare_data = "kyc/prepare_data"
    const val url_kyc_put_prepare_data = "kyc/putprepare/data"
    const val url_kyc_user_detail = "ipass/kyc/user/detail"
    const val url_kyc_workflow_status = "ipass/kyc/workflow/status"

    const val url_social_media_phone = "ipass/social/media/phone"
    const val url_social_media_email = "ipass/social/media/email"

    const val url_upload_passport = "ipass/passport/postdata"
    const val url_upload_driving_license = "ipass/driving/postdata"
    const val url_upload_id_card_front = "ipass/idcard/postfrntdata"
    const val url_upload_id_card_back = "ipass/idcard/postbackdata"

    const val url_get_passport_image = "ipass/passport/getdata"
    const val url_get_driving_license_image = "ipass/driving/getdata"
    const val url_get_id_card_front_image = "ipass/idcard/getfrntdata"
    const val url_get_id_card_back_image = "ipass/idcard/getbackdata"


}
