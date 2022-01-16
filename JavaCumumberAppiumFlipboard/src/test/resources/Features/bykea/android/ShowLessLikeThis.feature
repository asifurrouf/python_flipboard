Feature: Post unfollow works properly


  Background: user click on getStarted
    Given click getStarted
    Then click on Login Button
    Then Tap on FaceBook Button


  @initial
  Scenario: Tap on "Show less like this"
    Given click on more
    Then Tap on Show Less Like This