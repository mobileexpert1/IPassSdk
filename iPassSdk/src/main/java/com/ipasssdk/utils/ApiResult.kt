package com.ipasssdk.utils

sealed class ApiResult<out T> {
    data class Success<out Any>(val data: Any) : ApiResult<Any>()
    data class Failure<out Any>(val error: Any) : ApiResult<Any>()
}
