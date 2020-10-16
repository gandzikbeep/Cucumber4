Feature: Application Login-feature Account
#  Background:
#    Given validate the browser
#    When Browser is triggered
#    Then check if browser is started
  @PortalTest
  Scenario: Home page default login1-feature Account
    Given User is on NetBanking landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"
  @PortalTest
  Scenario: Home page default login2-feature Account
    Given User is on NetBanking landing page
    When User login into application with "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"
  @PortalTest
  Scenario: Home page default login2a-feature Account
    Given User is on NetBanking landing page
    When User login into application with "ann" and password "7777"
    Then Home page is populated
    And Cards displayed are "false"
  @PortalTest
  Scenario: Home page default login3-feature Account
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abcd.com | Australia | 3242353 |
    Then Home page is populated
    And Cards displayed are "false"
  @PortalTest
  Scenario Outline: Home page default login4-feature Account
    Given User is on NetBanking landing page
    When User login into application with <Username> and password <password>
    Then Home page is populated
    And Cards displayed are "false"

    Examples:
      | Username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |