Zeynep Ermis NHS Project


I tried to check eligibility of a user from Wales with only one condition. According to requirement, we can increase the number of the condition to increase the covarage of the tests.

Additionally I created some additional negative scenario test cases to check date entry functionallity.

 
 ### to run the project from cmd

 
 ```cmd
 mvn verify 
 ```
  
 - to run with chrome browser (since default browser is chrome)
 
 - to run with firefox browser
 
 ```cmd
 mvn verify -Dbrowser=firefox
 ```
 
 - to run with specific test from the suit
 
 ```cmd
 mvn verify -Dcucumber.options=" --tags @eligibility" 
 ```
