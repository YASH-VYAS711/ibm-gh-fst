@test9
@Login
Feature: Leads Table Validation

  Scenario: Print first 10 lead rows
    When user navigates to Leads page
    Then first ten lead rows should be displayed