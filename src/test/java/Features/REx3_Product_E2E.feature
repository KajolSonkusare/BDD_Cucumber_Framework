Feature: product feature
Background:
   Given user is on Swag lab login
    When  user enter username on swaglab login page "standard_user"
    And wait for 2 seconds
    And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swaglab login page
    And wait for 3 seconds

    Scenario: TC3:Verify home page contains 6 products
      When user click on backpack products add to cart btn
      And user click on cart link
      And user click on checkout button
      And user enter FN as "abc"
      And user enter LN as "xyz"
      And user click on zip code as "1111"
      And user click on continue button
      And user click on Finish button
      Then order success message should be visible with message "Thank you for your order!"