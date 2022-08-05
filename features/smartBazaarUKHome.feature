Feature: SmartBazaar UK Login Page
  Scenario: I can Login sucessfully with valid credentials
    Given I can see "Chrome" browser
    When I enter the smartbazaar link "https://stage.smartbazaar.co.uk/"
    Then I validate the title of the Page is "Smartbazaar - Home"
    Then I click on LoginDropDown
    And  I validate the title of the Page is "Smartbazaar - My account"
    And  I enter the username as "username"
    And I enter the password as "Password"
    Then I click on LoginButtonInAccountPage
    And  I close the browser