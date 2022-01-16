Feature: Home page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button

  @initial
  Scenario: Login By FaceBook
    Given click on FaceBook Button
