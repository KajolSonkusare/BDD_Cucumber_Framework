Feature: Login to application

  Scenario:S2-login with valid credentials
    Given open browser
    When user enter username
    And user enter password
    And user click on login button
    Then home page should be visible

    Scenario: S3-login with invalid credentials
      Given open browser
      When user enter username
      And user enter wrong password
      When  user click on login button
      Then error msg should be visible
