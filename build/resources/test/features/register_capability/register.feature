Feature: register feature
  Description: Bla, bla
  @smokeTest
  Scenario: Can't create new account with non unique email.
    Given I am on Home page and click sign up
    When I input name and email andy@homeiqinc.com
    Then Error message is displayed

