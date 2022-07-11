Given Test Cases to script:
---------------------------

1. Write a test that validates that the team has only 4 foreign players
2. Write a test that validates that there is at least one wicket keeper


Foreign Players and Wicket Keepers count :
------------------------------------------
Created two separate "ReturnForeignPlayersCount" and "ReturnWicketKeepersCount" java classes in main/java to calculate Foreign Players and Wicket keepers count from the given json file

Test Methods for validation:
---------------------------
Created "verifyForeignPlayersExistence" and "verifyWicketKeeperExistence" test methods under "RCBTestCases" class in test/java for both the given test cases.

In test methods captured the count and asserting them if the count is matching as per the test cases

Execution:
---------
1. To execute test cases select "RCBTestCases.java" >> Right Click >> Select "Run As" >> Click on "TestNG Test"  OR

2. Select testng.xml >> Right Click >> Select "Run As" >> Click on "TestNG Suite"