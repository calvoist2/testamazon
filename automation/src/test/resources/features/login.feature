Feature: Login on Amazon
  @smoke
  Scenario: Valid login
  Given I type the user "seleniumviafaratest@gmail.com"
  And I click the continue button
  And I type the password "CBTW1994$"
  When I click the sign in button
  Then I should see user "Viafara" displayed


@smoke
Scenario: Invalid user
  Given I type the user "s"
  And I click the continue button
  Then I should see error "Wrong or invalid email address" displayed
