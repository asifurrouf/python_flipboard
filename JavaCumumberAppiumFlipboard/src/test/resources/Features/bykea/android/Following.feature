Feature: Result is visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Following
    Given Scroll to Down
    Then ScrollDown
    Then ScrollDown
    Then ScrollDown
    Then ScrollDown
    Then ScrollDown
    Then ScrollDown
    Then ScrollDown
    Then Click on Follow
