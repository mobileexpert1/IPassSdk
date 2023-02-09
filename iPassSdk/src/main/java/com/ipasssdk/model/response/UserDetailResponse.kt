package com.ipasssdk.model.response


class UserDetailResponse {
    var workflow  = WorkflowModel()
    var account = AccountModel()
    var createdAt :String? = null
    var startedAt :String? = null
    var completedAt :String? = null
    var credentials = ArrayList<CredentialsModel>()
    var decision  = UserDecisionModel()
    var steps  = StepsModel()
    var capabilities :CapabilitiesModel? = null
}