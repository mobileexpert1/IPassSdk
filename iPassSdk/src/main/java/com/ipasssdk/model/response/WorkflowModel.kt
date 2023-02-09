package com.ipasssdk.model.response

class WorkflowModel {
    var id: String? = null
    var href: String? = null
    var definitionKey: String? = null
    var status: String? = null
    var customerInternalReference: String? = null
    var credentials:ArrayList<CredentialsModel>? = null
}