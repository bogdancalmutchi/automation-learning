@Olx
Feature: Search something on olx

  Scenario: Search for items

    Given I navigate to olx
    When I search for "Far Cry 5"
    And I search only in "Constanta"
    And The suggestions contain "Constanta"
    And I click the search button
    Then The results are displayed