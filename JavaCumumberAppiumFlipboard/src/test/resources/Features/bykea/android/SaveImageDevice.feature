Feature: Image download properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on "Save image to device"
    Given click on more
    Then click on Save image to device
