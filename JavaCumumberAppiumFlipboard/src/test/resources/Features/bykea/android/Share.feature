Feature: Share post works properly

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on "Share"
    Given click on more
    Then click on share
    Then share on FaceBook