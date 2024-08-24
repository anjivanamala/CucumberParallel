@smoke
Feature: Second Example

  Scenario: Example two
Given I login to Google
When I Search for Gayathri
Then Gayathri Profile should be displayed

  Scenario: Example two and two
    Given I login to Google
    When I Search for Anji
    Then Anji Profile should be displayed