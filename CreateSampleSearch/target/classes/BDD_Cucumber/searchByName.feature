
Feature: Search by name in Browser
  I want to search by name in the web browser
  
  @browser
  Scenario: Search By Text in Browser
    Given I load the browser and search for the text
    And I search for the ducks
    And I scroll through the links
    Then I validate the final ducks image page
   
