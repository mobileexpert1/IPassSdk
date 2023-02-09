package com.ipasssdk.model.response

class CapabilitiesListModel {

    var id : String? = null
    var credentials = ArrayList<CredentialsModel>()
    var decision = UserDecisionModel()
    var data = CapabilitiesDataResponse()

}
