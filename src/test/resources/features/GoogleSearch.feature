Feature: Google search

  Background:

    Given I navigate to google

  Scenario Outline: Search for fruits on google

    And I type the word <fruit> in
    When I click search
    Then The results are displayed

    Examples:
      | fruit    |
      | apples   |
      | cucumber |

  Scenario: Read terms and conditions

    When I click terms and conditions
    Then A new page opens


