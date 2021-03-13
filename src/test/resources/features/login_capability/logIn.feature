Feature: logIn feature

  @smokeTest
  Scenario: Able to connect to my account.
    Given I am on login page and click login
    When I input an valid email and password
    Then I am on home page