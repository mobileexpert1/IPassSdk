package com.ipasssdk.model.response

class DocumentModel {
    var docType:String? = null
    var boundingRegions:ArrayList<BoundingRegionsModel>? = null
    var fields:String? = null
    var confidence:String? = null
    var spans:ArrayList<SpanModel>? = null

}