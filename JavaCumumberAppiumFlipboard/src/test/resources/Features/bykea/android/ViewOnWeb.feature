Feature: Home page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on "View on web"
    Given click on more
    Then click on View on web
