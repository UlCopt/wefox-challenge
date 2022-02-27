# wefox-challenge
Java Selenium Cucumber Gradle project

## Prerequisites
- MacOS with Chrome Browser version 98 installed
- Gradle 7.3.3 or above
- Java 8 or above

##  How to run Local (MacOs Chrome Driver)
Open a terminal and run the next commands
Clone repo
```
git clone git@github.com:UlCopt/wefox-challenge.git
cd wefox-challenge/part2
```

Run tests on mac m1 chip
```
gradle test -Dbrowser=local-chrome-macos-m1    
```

Run tests on mac intel chip
```
gradle test -Dbrowser=local-chrome-macos-intel    
```

Report
```
part2/target/report.html       
```


Troubleshooting Webdriver macOs Catalina or above

- Open terminal and navigate to path where your chromedriver file is located 
- execute any one of the below commands     
Example:
```
cd src/test/resources/webdriver/macos 
xattr -d com.apple.quarantine chromedriverIntel
xattr -d com.apple.quarantine chromedriverM1  
```

