Feature: Add people works properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: add people
    Given click on Profile Button
    Then click on Find Friend
