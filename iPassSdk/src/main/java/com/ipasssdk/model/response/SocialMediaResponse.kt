package com.ipasssdk.model.response

class SocialMediaResponse {

    var number: String? = null
    var email: String? = null
    var score: String? = null
    var valid: String? = null
    var disposable: String? = null
    var type: String? = null
    var carrier: String? = null
    var country: String? = null
    var deliverable: String? = null
    var domain_details = DomainData()
    var account_details = SocialAccountDetailData()
    var breach_details = BreachDetailData()
    var applied_rules = ArrayList<AppliedRulesData>()


}