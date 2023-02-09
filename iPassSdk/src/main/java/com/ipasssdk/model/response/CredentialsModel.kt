package com.ipasssdk.model.response

class CredentialsModel {
    var id: String? = null
    var category: String? = null
    var allowedChannels = ArrayList<String>()
    var parts = ArrayList<UserDetailPartsModel>()
    var api = ApiModel()

}