Feature: login to application feature

  Scenario: S1-login with valid data
    Given open browser
    When user enter username
    And user enter password
    And user click on login button
    Then home page should be visible


 # Scenario: login with valid data
 # Given open browser
 # When user enter username
 # When user enter password
 # When user click on login button
 # Then home page should be visible