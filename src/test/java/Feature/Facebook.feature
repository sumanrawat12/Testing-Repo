@tag
Feature: Login Facebook

  @tag2
  Scenario Outline: Facebook Login
    Given Open Facebook on Chrome Browser
    When Give Username "<username>" and Password "<password>" 
    Then Now Facebook is logged in

    Examples: 
      | username  | password |
      | sumanrawat12@gmail.com |   Shree143 |

