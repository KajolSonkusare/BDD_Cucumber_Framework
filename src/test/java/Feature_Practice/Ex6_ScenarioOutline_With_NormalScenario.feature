Feature: login feature with Scenario outline

  Scenario Outline: S8-login to application
    Given user in at Signup page
    When user enters "<Name>" inside form
    And user enters age as <Age>
    And user confirm gender as "<Gender>"
    Then user gets created

    Examples:
      | Name    |  Age | Gender |
      | Swapnil | 33   | Male    |
      | Kajol   | 29   | Female  |
      |Viyaansh | 01   | Male    |


    Scenario: S9-login to application
    Given user in at Signup page
    When user enters "Swapnil" inside form
    And user enters age as 33
    And user confirm gender as "Male"
    Then user gets created
