Feature: Registration with same username

Scenario: Verify if user can register with same username
    Given user enter an username
    And user enters  valid data to password field
    When user clicks on Register button
    And user clicks on logout button
    Then user verifies that the register button is present
    And user enter an username
    And user enters  valid data to password field
    Then user clicks on Register button
    Then User verifies that Registration failed message is displayed on page