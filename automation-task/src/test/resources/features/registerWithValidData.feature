Feature: Register with valid data

  Scenario: Verify if you can register on CRA page with valid data
    Given  user enters valid data to username field
    And    user enters  valid data to password field
    When   user clicks on Register button
    Then   user verifies that the logout button is present on the page
