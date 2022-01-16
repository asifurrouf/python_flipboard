Feature: Home page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button

  @initial
  Scenario: Login By Mail
    Given click on Email Button
    Then Select a mail
    Then Fill password on Password Field
    Then click on LogIn Button Red
