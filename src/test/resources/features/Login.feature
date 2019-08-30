Feature: Login
  As a user I should able to login

  Background:
    Given user is on the landing page

  Scenario  : login as different user test
    When user enter "<username>" and "<password>"
      | username                | password |
      | hr65@cybertekschool.com | UserUser |
      | hr66@cybertekschool.com | UserUser |
    Then homepage logo should display
















