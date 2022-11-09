Feature: Register with invalid username data

  Scenario Outline: Verify if user can register with invalid username data
    Given User enters invalid username <username>
    And User enters valid data for password <password>
    When user clicks on Register button
    Then User verifies that Registration failed message is displayed on page

    Examples:
      | username | password |
      | Ca7      | Kitten99 |
      | cat7     | Kitten99 |
      | CAT7     | Kitten99 |
      | Catt     | Kitten99 |
      |          | Kitten99 |
      | Кот7     | Kitten99 |
