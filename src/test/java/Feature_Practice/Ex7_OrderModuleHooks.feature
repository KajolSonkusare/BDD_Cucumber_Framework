Feature: place order feature

  Background:
    Given  user should get logged in
    And user should be at orders page

  Scenario: S1-fetch currently placed order
    When user click on current orders
    Then  user should see currently placed order

    Scenario: S2-fetch previously placed order
      When  user click on past orders
      Then  user should see previously placed order

      Scenario: S3-fetch canceled order info
        When user click on cancel orders
        Then user should see canceled order info