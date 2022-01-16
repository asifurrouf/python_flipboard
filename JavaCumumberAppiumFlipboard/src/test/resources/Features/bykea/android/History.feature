Feature: History page page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: History
    Given click on Profile Button
    Then click on History Button