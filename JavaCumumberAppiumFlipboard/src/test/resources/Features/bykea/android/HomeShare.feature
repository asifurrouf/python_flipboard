Feature: History page page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Share
    Given click on Profile Button
    Then click on Share Button
    Then share on FaceBook