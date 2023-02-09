package com.ipasssdk.model.response

import com.ipasssdk.model.request.WebModel

class AccountDataModel {
    var timestamp:String? = null
    var account:AccountModel? = null
    var web: WebModel? = null
    var sdk:SDKModel? = null
    var workflowExecution = WorkflowExecutionModel()
}