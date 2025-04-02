Feature: Login on Amazon
  @smoke
  Scenario: Valid login
  Given I type the user "seleniumviafaratest@gmail.com"
  And I click the continue button
  And I type the password "CBTW1994$"
  When I click the sign in button
  Then I should see user "Viafara" displayed
