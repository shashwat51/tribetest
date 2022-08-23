# tribetest
Tribetest
Added a maven Project .

To run this .
We need 
Windows machine
Google chrome Browser.
https://chromedriver.chromium.org/downloads

updates needed after downloading and importing the files.


1) update the automation/src/main/java/com/tribe/config/Config.java
with the location of chromedriver.exe executable

2) Username and passwords and URL are currently hardcoded into 
/automation/src/main/java/test/automation/App.java
 or 
 /automation/src/test/java/test/automation/AppTest.java
 
 In case there is no Junit plugin isntalled the App.java class culd be run directly from main .
 Otherwise feel free to use AppTest.java to enable Junit reports.
 
 I timeboxed my work to 4 hours so was not able to achieve a few things in time but definitey open to disucss ideas and exend the framework to 
 include and support mutiple features.
