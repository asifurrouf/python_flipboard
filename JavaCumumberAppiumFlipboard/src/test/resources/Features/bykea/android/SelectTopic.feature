Feature: Login page visible

  Background: user click on getStarted
    Given click getStarted


  @initial
  Scenario: user click on topic
    Given click on news
    Then click on Technology
    Then click on Sports
    Then click on Continue
