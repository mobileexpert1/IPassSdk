package com.ipasssdk.model.response

class BreachDetailData {
  var   haveibeenpwned_listed:Boolean? = null
  var   number_of_breaches:String? = null
  var   first_breach:String? = null
  var   breaches = ArrayList<BreachesData>()

}