package com.ipasssdk.model.response

import com.google.gson.annotations.SerializedName

class ErrorData {
    @SerializedName("error")
    var errorCodeResponse :ErrorCodeResponse? = null

}