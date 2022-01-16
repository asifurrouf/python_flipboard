Feature: Home page visible

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button

  @initial
  Scenario: Tap on Post View on web
    Given Go to Daily Edition
    Then Tap on Post
    Then Tap on Post
    Then Tap on Post
    Then Tap on Post
    Then Tap on More Button
    Then Click on Show Less Like This