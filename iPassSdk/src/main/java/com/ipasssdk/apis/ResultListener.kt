package com.ipasssdk.apis

interface ResultListener<T> {
    fun onSuccess(t: Any?)
    fun onError(exception: String)
}
