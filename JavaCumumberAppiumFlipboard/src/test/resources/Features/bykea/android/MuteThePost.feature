Feature: Post profile mute

  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button


  @initial
  Scenario: Tap on "Mute the post"
    Given click on more
    Then Tap on Mute the post
