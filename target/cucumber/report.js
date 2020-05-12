$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "Submit Data to webdriverunivercity.com using contact us form",
  "description": "I want to fill the contact us from and sumbit the data",
  "id": "submit-data-to-webdriverunivercity.com-using-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6050683200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "submit-data-to-webdriverunivercity.com-using-contact-us-form;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I navigate to webdriveruniversity contact us from",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter a valid first name",
  "rows": [
    {
      "cells": [
        "John",
        "Loke",
        "Poshni"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I enter a valid last name",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter valid comments",
  "rows": [
    {
      "cells": [
        "eample comments one",
        "example comments two",
        "example comments three"
      ],
      "line": 29
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on submit button on the page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "The information should be successfully submmited via contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsFormSteps.i_navigate_to_webdriveruniversity_contact_us_from()"
});
formatter.result({
  "duration": 1564019100,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsFormSteps.i_enter_a_valid_first_name(DataTable)"
});
formatter.result({
  "duration": 135758500,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsFormSteps.i_enter_a_valid_last_name()"
});
formatter.result({
  "duration": 116920500,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsFormSteps.i_enter_a_valid_email_address()"
});
formatter.result({
  "duration": 133753500,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsFormSteps.i_enter_valid_comments(DataTable)"
});
formatter.result({
  "duration": 460515900,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsFormSteps.i_click_on_submit_button_on_the_page()"
});
formatter.result({
  "duration": 2341071400,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsFormSteps.the_information_should_be_successfully_submmited_via_contact_us_form()"
});
formatter.result({
  "duration": 66547300,
  "status": "passed"
});
formatter.after({
  "duration": 736521600,
  "status": "passed"
});
formatter.uri("products.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Products",
  "description": "Validate promo code in products page",
  "id": "products",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Validate Promo code alert is visible when clicking on special offers link",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I navigate to \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click on \"\u003celement\u003e\" button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should be presented with promo alert with messsage as \"\u003cpromo\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;",
  "rows": [
    {
      "cells": [
        "url",
        "element",
        "promo"
      ],
      "line": 29,
      "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;1"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Page-Object-Model/products.html#",
        "#container-special-offers",
        "NEWCUSTOMER773322"
      ],
      "line": 30,
      "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;2"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Page-Object-Model/products.html#",
        "#container-product2",
        "NEWCUSTOMER773322"
      ],
      "line": 31,
      "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;3"
    },
    {
      "cells": [
        "http://webdriveruniversity.com/Page-Object-Model/products.html#",
        "#container-product2",
        "NEWCUSTOMER7733212"
      ],
      "line": 32,
      "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5559182100,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Validate Promo code alert is visible when clicking on special offers link",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I navigate to \"http://webdriveruniversity.com/Page-Object-Model/products.html#\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click on \"#container-special-offers\" button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should be presented with promo alert with messsage as \"NEWCUSTOMER773322\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Page-Object-Model/products.html#",
      "offset": 15
    }
  ],
  "location": "ProductsSteps.i_navigate_to(String)"
});
formatter.result({
  "duration": 1685849300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#container-special-offers",
      "offset": 12
    }
  ],
  "location": "ProductsSteps.i_click_on_button(String)"
});
formatter.result({
  "duration": 300936600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NEWCUSTOMER773322",
      "offset": 60
    }
  ],
  "location": "ProductsSteps.user_should_be_presented_with_promo_alert_with_messsage_as(String)"
});
formatter.result({
  "duration": 3099813400,
  "status": "passed"
});
formatter.after({
  "duration": 682147200,
  "status": "passed"
});
formatter.before({
  "duration": 5678727800,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Validate Promo code alert is visible when clicking on special offers link",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I navigate to \"http://webdriveruniversity.com/Page-Object-Model/products.html#\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click on \"#container-product2\" button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should be presented with promo alert with messsage as \"NEWCUSTOMER773322\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Page-Object-Model/products.html#",
      "offset": 15
    }
  ],
  "location": "ProductsSteps.i_navigate_to(String)"
});
formatter.result({
  "duration": 1615434100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#container-product2",
      "offset": 12
    }
  ],
  "location": "ProductsSteps.i_click_on_button(String)"
});
formatter.result({
  "duration": 1310759500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NEWCUSTOMER773322",
      "offset": 60
    }
  ],
  "location": "ProductsSteps.user_should_be_presented_with_promo_alert_with_messsage_as(String)"
});
formatter.result({
  "duration": 2393212200,
  "status": "passed"
});
formatter.after({
  "duration": 944701700,
  "status": "passed"
});
formatter.before({
  "duration": 5549199000,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Validate Promo code alert is visible when clicking on special offers link",
  "description": "",
  "id": "products;validate-promo-code-alert-is-visible-when-clicking-on-special-offers-link;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 24,
  "name": "I navigate to \"http://webdriveruniversity.com/Page-Object-Model/products.html#\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I click on \"#container-product2\" button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should be presented with promo alert with messsage as \"NEWCUSTOMER7733212\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://webdriveruniversity.com/Page-Object-Model/products.html#",
      "offset": 15
    }
  ],
  "location": "ProductsSteps.i_navigate_to(String)"
});
formatter.result({
  "duration": 1237113100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#container-product2",
      "offset": 12
    }
  ],
  "location": "ProductsSteps.i_click_on_button(String)"
});
formatter.result({
  "duration": 1635400800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NEWCUSTOMER7733212",
      "offset": 60
    }
  ],
  "location": "ProductsSteps.user_should_be_presented_with_promo_alert_with_messsage_as(String)"
});
formatter.result({
  "duration": 2862426400,
  "error_message": "java.lang.AssertionError: expected [NEWCUSTOMER7733212] but found [NEWCUSTOMER773322]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat PageObjects.ProductsPageObjects.validatePromoCode(ProductsPageObjects.java:32)\r\n\tat stepDefinitions.ProductsSteps.user_should_be_presented_with_promo_alert_with_messsage_as(ProductsSteps.java:24)\r\n\tat ✽.Then User should be presented with promo alert with messsage as \"NEWCUSTOMER7733212\"(products.feature:26)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2216397700,
  "status": "passed"
});
});