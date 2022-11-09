Feature: Registration with invalid password data

Scenario Outline: Verify if user can register with invalid password data
Given user enters valid data to username field
And User inputs invalid data in the password box <password>
When user clicks on Register button
Then User verifies that Registration failed message is displayed on page

Examples:
| password |
| Kity9    |
| kitty9   |
| KITTY9   |
| Kitten   |
|          |
| Котенок9 |