$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HCM.feature");
formatter.feature({
  "line": 1,
  "name": "HCM UAT Service Request",
  "description": "",
  "id": "hcm-uat-service-request",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "I raised new Service Request",
  "description": "",
  "id": "hcm-uat-service-request;i-raised-new-service-request",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Expense"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I Login with user credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I navigate to Employee page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I clicked on Expenses tab",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I entered mandatory fields and click on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see Thank you! This case has been routed for approval.",
  "keyword": "Then "
});
formatter.match({
  "location": "HCM_ServiceRequest.i_Login_with_user_credentials()"
});
formatter.result({
  "duration": 7046105200,
  "status": "passed"
});
formatter.match({
  "location": "HCM_ServiceRequest.i_navigate_to_Employee_page()"
});
formatter.result({
  "duration": 30924783500,
  "status": "passed"
});
formatter.match({
  "location": "HCM_ServiceRequest.i_clicked_on_Expenses_tab()"
});
formatter.result({
  "duration": 4851810900,
  "status": "passed"
});
formatter.match({
  "location": "HCM_ServiceRequest.i_entered_mandatory_fields_and_click_on_Submit_button()"
});
formatter.result({
  "duration": 35322372800,
  "status": "passed"
});
formatter.match({
  "location": "HCM_ServiceRequest.i_should_see_Thank_you_This_case_has_been_routed_for_approval()"
});
formatter.result({
  "duration": 64064500,
  "status": "passed"
});
});