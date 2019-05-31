$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featureFiles/ContactUs.feature");
formatter.feature({
  "name": "ContactUs",
  "description": "  Description: Each scenarios on this feature will be a differnt functionality of ContactUs",
  "keyword": "Feature"
});
formatter.background({
  "name": "User launch the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on homepage of Masherqbank",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDef.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Contact Us Page at footer",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDef.userClickOnContactUsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the page title is \u0027Contact us | Personal Banking | Mashreq Bank\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.validatePageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Submitting the form without entering any details should indicate an error and specify which fields are required",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ContactUs"
    }
  ]
});
formatter.step({
  "name": "Verify user reached to Contact Us Page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.userVerifyContactUsForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Submit button of contact us form",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsStepDef.userClickOnSubmitBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Error is displayed for I am looking to text box",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.userVerifyErrorOnContactUsForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify I am looking to… field is a dropdown with \u00274\u0027 choices",
  "keyword": "And "
});
formatter.match({
  "location": "ContactUsStepDef.userVerifyReachOutProductionOptionCount(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on homepage of Masherqbank",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDef.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Contact Us Page at footer",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDef.userClickOnContactUsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the page title is \u0027Contact us | Personal Banking | Mashreq Bank\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.validatePageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Select sub products options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ContactUs"
    }
  ]
});
formatter.step({
  "name": "User verify The \u0027-- Select Sub Product -- \u0027 field is initially empty",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.userVerifyDefaultValueOfSelectSubProduct(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select the \u0027Loans\u0027 from Product dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsStepDef.selectValueFromProductDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Select Sub products have \u00276\u0027 options including \u0027Home Loan UAE Resident\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.user_Verify_Select_Sub_products_have_options_including_Home_Loan_UAE_Resident(int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on homepage of Masherqbank",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDef.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Contact Us Page at footer",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDef.userClickOnContactUsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the page title is \u0027Contact us | Personal Banking | Mashreq Bank\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.validatePageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Error for Mobile number with less than 7 didgit",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ContactUs"
    }
  ]
});
formatter.step({
  "name": "User enter the mobile number \u002795408\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsStepDef.enterMobileNumber(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Error is displayed when user enter less than 7 digit in mobile number",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.userVerifyErrorForInCorrectMobileNo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the mobile number \u00279540883\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "ContactUsStepDef.enterMobileNumber(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify No Error is displayed when user enter 7 digit number",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepDef.userVerifyNoErrorMesageForCorrectMobileNo()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/featureFiles/Homepage.feature");
formatter.feature({
  "name": "Homepage",
  "description": "  Description: Each scenarios on this feature will be a differnt functionality of home page",
  "keyword": "Feature"
});
formatter.background({
  "name": "User launch the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on homepage of Masherqbank",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDef.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Navigation bar at desktop deivces",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Homepage"
    }
  ]
});
formatter.step({
  "name": "Validate the page title is \u0027Best Consumer Digital Bank UAE | Personal Banking | Mashreq Bank\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.validatePageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Navigation bar is displayed to user",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.verifyNavigationBarIsDisplayedToUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \u00279\u0027 items displayed at navigation bar",
  "rows": [
    {
      "cells": [
        "Corporate"
      ]
    },
    {
      "cells": [
        "Business"
      ]
    },
    {
      "cells": [
        "International"
      ]
    },
    {
      "cells": [
        "Private Banking"
      ]
    },
    {
      "cells": [
        "Al Islami"
      ]
    },
    {
      "cells": [
        "Gold"
      ]
    },
    {
      "cells": [
        "Mashreq Securities"
      ]
    },
    {
      "cells": [
        "Mashreq Capital"
      ]
    },
    {
      "cells": [
        "Mashreq Global Services"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.verifyItemsDisplayedAtNavigationBar(int,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on homepage of Masherqbank",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDef.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Mashreq News should be displayed on the homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Homepage"
    }
  ]
});
formatter.step({
  "name": "User verify News box should be visible on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.verifyNewsBoxIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the title of News box should be \u0027Mashreq News\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.userVerifyNewsBoxTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User launch the application",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on homepage of Masherqbank",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepDef.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify “Contact Us” at the footer of homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Homepage"
    }
  ]
});
formatter.step({
  "name": "User verify \u0027Contact Us\u0027 is visible at homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.userVerifyContactUsAtFooter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Contact Us Page at footer",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDef.userClickOnContactUsLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the page title is \u0027Contact us | Personal Banking | Mashreq Bank\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDef.validatePageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user reached to Contact Us Page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDef.userVerifyContactUsForm()"
});
formatter.result({
  "status": "passed"
});
});