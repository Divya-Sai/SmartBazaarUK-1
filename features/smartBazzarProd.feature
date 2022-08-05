Feature: This is used to test production application of smartBazaar UK
  Scenario: Seacrh a Product from Search box
    Given I can see "Chrome" browser
    When I enter the smartbazaar link "https://stage.smartbazaar.co.uk/"
    Then I enter the product name "Bangles" in the SearchBox
    And I click on Search Symbol
    And I close the browser
