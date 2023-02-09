package com.ipasssdk.model.request

class InitiateAccountRequest {
    var customerInternalReference: String? = null
    var workflowDefinition = WorkflowDefinitionModel()
    var callbackUrl: String? = null
    var userReference: String? = null
    var tokenLifetime: String? = null
    var web: WebModel? = null
}


