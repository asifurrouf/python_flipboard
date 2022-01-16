Feature: All the page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Home
    Given Go to Daily Edition
    Then Swipe to Right
    Then Swipe to Right

