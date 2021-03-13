Feature: Test Background feature


  @smokeTest
  Background: Able to connect to my account
    Given I am on login page and click login
    When I input an valid email and password
    Then I am on home page

  Scenario: Adding a item
    Given I am on home page an click add a item
    When I input all criteria for adding a item
    Then I see an success message