@test8
@Login
Feature: Accounts Odd Rows Validation

  Scenario: Print first 5 odd rows from Accounts table
    When user navigates to Accounts page
    Then first five odd rows should be displayed