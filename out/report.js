$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber.features/search-in-google.feature");
formatter.feature({
  "line": 1,
  "name": "Add address to user account",
  "description": "",
  "id": "add-address-to-user-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Add address data to user account",
  "description": "",
  "id": "add-address-to-user-account;add-address-data-to-user-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Page https://prod-kurs.coderslab.pl/ opened in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "fill Email",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User fill Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Submit Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User see accountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click Addresses",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "enter parametr1 \u003calias\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter parametr2 \u003caddress\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter parametr3 \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter parametr4 \u003cpostcode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter parametr5 \u003ccountry\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter parametr6 \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "submit AddressData",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "address data are added",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "address data are deleted",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "add-address-to-user-account;add-address-data-to-user-account;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "postcode",
        "country",
        "phone"
      ],
      "line": 23,
      "id": "add-address-to-user-account;add-address-data-to-user-account;;1"
    },
    {
      "cells": [
        "agakk",
        "Wiosenna 13",
        "Poznań",
        "61-677",
        "United Kingdom",
        "678489789"
      ],
      "line": 24,
      "id": "add-address-to-user-account;add-address-data-to-user-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Add address data to user account",
  "description": "",
  "id": "add-address-to-user-account;add-address-data-to-user-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Page https://prod-kurs.coderslab.pl/ opened in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "fill Email",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User fill Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Submit Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User see accountPage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click Addresses",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "enter parametr1 agakk",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter parametr2 Wiosenna 13",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter parametr3 Poznań",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "enter parametr4 61-677",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter parametr5 United Kingdom",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter parametr6 678489789",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "submit AddressData",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "address data are added",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "address data are deleted",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://prod-kurs.coderslab.pl/",
      "offset": 5
    }
  ],
  "location": "userDataSteps.openPageInBrowser(String)"
});
formatter.result({
  "duration": 5539781900,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.userClickSignIn()"
});
formatter.result({
  "duration": 689112300,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.fillEmail()"
});
formatter.result({
  "duration": 276328500,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.enterPassword()"
});
formatter.result({
  "duration": 188708300,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.submitSignInButton()"
});
formatter.result({
  "duration": 899057300,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.accountPage()"
});
formatter.result({
  "duration": 44781200,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.clickAddressesButton()"
});
formatter.result({
  "duration": 614912700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " agakk",
      "offset": 15
    }
  ],
  "location": "userDataSteps.enterAlias(String)"
});
formatter.result({
  "duration": 155679800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Wiosenna 13",
      "offset": 15
    }
  ],
  "location": "userDataSteps.enterAddress(String)"
});
formatter.result({
  "duration": 139144000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Poznań",
      "offset": 15
    }
  ],
  "location": "userDataSteps.enterCity(String)"
});
formatter.result({
  "duration": 157106600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " 61-677",
      "offset": 15
    }
  ],
  "location": "userDataSteps.enterPostcode(String)"
});
formatter.result({
  "duration": 134848600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " United Kingdom",
      "offset": 15
    }
  ],
  "location": "userDataSteps.enterCountry(String)"
});
formatter.result({
  "duration": 136184200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " 678489789",
      "offset": 15
    }
  ],
  "location": "userDataSteps.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 120306600,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.submitAddressData()"
});
formatter.result({
  "duration": 694963700,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.addressBodyPage()"
});
formatter.result({
  "duration": 188326600,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.deleteAddressData()"
});
formatter.result({
  "duration": 945817400,
  "status": "passed"
});
formatter.match({
  "location": "userDataSteps.closeBrowser()"
});
formatter.result({
  "duration": 337904400,
  "status": "passed"
});
});