Feature: SmartBazaar UK Select options from Main Menu Categories
  Scenario: I can Login sucessfully with valid credentials
    Given I can see "Chrome" browser
    When I enter the smartbazaar link "https://stage.smartbazaar.co.uk/"
    Then I validate the title of the Page is "Smartbazaar - Home"
 #   And I click on Select Category dropDown
   And I enter text in SearchBox "Meera Anti Dandruff Shampoo (180ml)"
    Then I click on SearchIcon
