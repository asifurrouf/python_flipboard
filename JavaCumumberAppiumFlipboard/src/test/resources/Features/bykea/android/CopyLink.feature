Feature: Post link copy  properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on "Copy link"
    Given click on more
    Then click on copy Link