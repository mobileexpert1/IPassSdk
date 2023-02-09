package com.ipasssdk.utils

import org.json.JSONObject
import retrofit2.Response

fun ErrorHandler(response: Response<out Any>?, jsonKey: String): String {
    var errorResponse = ""
    val jObjError = JSONObject(response?.errorBody()!!.string())



    errorResponse = if (jObjError.getJSONObject("error").has("user")) {
        jObjError.getJSONObject("error").getJSONObject("user").getString("detail")
    } else if (jObjError.getJSONObject("error").has("resParse")) {

        jObjError.getJSONObject("error").getJSONObject("resParse")
            .getJSONObject("error").getJSONObject("innererror").getString("message")

    } else {
        if (jObjError.getJSONObject("error").getJSONObject(jsonKey).getString("detail") == "[]") {
            jObjError.getJSONObject("error").getJSONObject(jsonKey).getString("title")
        } else {
            jObjError.getJSONObject("error").getJSONObject(jsonKey).getString("detail")
        }
    }
    return errorResponse
}
