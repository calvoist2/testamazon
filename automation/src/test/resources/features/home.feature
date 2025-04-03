Feature: Home page search
  @smoke
  Scenario: Search for specific medicine
    Given I close the alert
    When I type the value "Tramadol"
    Then I should see related values