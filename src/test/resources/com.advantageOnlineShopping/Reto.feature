Feature: register new account and buy laptop

  @RegisterNewAccount
  Scenario: Create new account
    Given Jorse is on the portal web
    When Jorse enters the data for you registration
    Then Jorse is inside the portal web


