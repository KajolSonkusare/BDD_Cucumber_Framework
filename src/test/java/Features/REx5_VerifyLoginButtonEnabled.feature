Feature: login feature

  Scenario: verify login button is enabled
    Given user is on Swag lab login
    And wait for 2 seconds
    Then login button should be enabled