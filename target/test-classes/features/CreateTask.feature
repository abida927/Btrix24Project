Feature: Create Task
  Verify that user can create new task by clicking on tasks on activity stream

  Background:
  Given user is on the landing page

  Scenario Outline:
    When user enter "<username>" and "<password>"
    Then homepage logo should display
    Then send "<message>" on task
#    Then verify task has sent

    Examples:
      |username               |password|         message|
      |hr65@cybertekschool.com|UserUser|create message 1|
      |hr66@cybertekschool.com|UserUser|create message 2|


