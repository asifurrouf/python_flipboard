Feature: Image download properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on Post Save image to device
    Given Go to Daily Edition
    Then Tap on Post
    Then Tap on Post
    Then Tap on More Button
    Then Tap on Post Save image