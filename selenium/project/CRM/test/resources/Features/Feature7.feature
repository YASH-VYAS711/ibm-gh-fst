@test7
@Login
Feature: Leads Phone Number Validation

  Scenario: Verify phone number from lead info popup
    Given user navigates to leads page
    When user clicks on lead info icon
    Then phone number should be displayed