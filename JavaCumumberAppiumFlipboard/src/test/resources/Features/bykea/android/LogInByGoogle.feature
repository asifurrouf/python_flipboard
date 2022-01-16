Feature: Home page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button

  @initial
  Scenario: Login By Google
    Given click on Google Button
    Then Select a mail
