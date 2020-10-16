Feature: Application Login-feature Login

@RegTest
  Scenario: Home page default login1 -feature Login
    Given User is on NetBanking landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"
@MobileTest
  Scenario: Home page default login2-feature Login
    Given User is on NetBanking landing page
    When User login into application with "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"
@SmokeTest
  Scenario: Home page default login2a-feature Login
    Given User is on NetBanking landing page
    When User login into application with "ann" and password "7777"
    Then Home page is populated
    And Cards displayed are "false"

  Scenario: Home page default login3-feature Login
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abcd.com | Australia | 3242353 |
    Then Home page is populated
    And Cards displayed are "false"

  Scenario Outline: Home page default login4-feature Login
    Given User is on NetBanking landing page
    When User login into application with <Username> and password <password>
    Then Home page is populated
    And Cards displayed are "false"

    Examples:
      | Username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |