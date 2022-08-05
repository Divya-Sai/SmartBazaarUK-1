Feature: This is used to test mouse hover in SmartBazaar UK Application
  Scenario: testing click action
    Given I can see "Chrome" browser
    When I enter the smartbazaar link "https://stage.smartbazaar.co.uk/"
    Then I validate the title of the Page is "Smartbazaar - Home"
    And I click on Seasonal from menu options
    And I validate the title of the Page is "Smartbazaar - Dominican Mango (each)"