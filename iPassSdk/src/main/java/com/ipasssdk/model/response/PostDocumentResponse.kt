package com.ipasssdk.model.response

import com.google.gson.annotations.SerializedName

class PostDocumentResponse {

    @SerializedName("content-length")
    var content_length: String? = null

    @SerializedName("operation-location")
    var operation_location: String? = null

    @SerializedName("x-envoy-upstream-service-time")
    var x_envoy_upstream_service_time: String? = null

    @SerializedName("apim-request-id")
    var apim_request_id: String? = null

    @SerializedName("strict-transport-security")
    var strict_transport_security: String? = null

    @SerializedName("x-content-type-options")
    var x_content_type_options: String? = null

    @SerializedName("x-ms-region")
    var x_ms_region: String? = null

    @SerializedName("date")
    var date: String? = null

    @SerializedName("connection")
    var connection: String? = null


}