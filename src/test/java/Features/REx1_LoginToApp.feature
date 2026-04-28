Feature: login functionality

  Background:
    Given user is on Swag lab login
    When user enter username on swaglab login page "standard_user"


  Scenario: TC1:login with valid credentials
    And user enter password on swaglab login page "secret_sauce"
    And user click on login btn on swaglab login page
    Then home page visible with logo text "Swag Labs"

    Scenario: TC2:Login with invalid credentials
      And user enter password on swaglab login page "xyz"
      And user click on login btn on swaglab login page
      Then login failed error message should be visible message "Epic sadface: Username and password do not match any user in this service"