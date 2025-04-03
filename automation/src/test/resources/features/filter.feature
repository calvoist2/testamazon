Feature: Page filters
  @smoke
  Scenario Outline: Filter by price
    Given I close the alert
    And I type the value "Tramadol"
    When I fill the min value with <min> and the max value with <max>
    Then I should see values inside the range of <min> and <max>
    Examples:
      | min   | max  |
      |    0  |   60 |
      |    20 |   90 |