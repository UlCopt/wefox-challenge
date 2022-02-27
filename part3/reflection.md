# Reflection

## About the project
I created a Selenium-Java framework, because it's the type of project I have more experience with. On the other hand,  I used Cucumber because is oriented to the behavior,
I like the way to focus the test in that direction because is clear
what scenarios we cover with our tests.  I use Gradle to manage the external dependencies,
when I create a new java framework, I always try to use Gradle over Maven, in my opinion, is easy to read and maintain,
vs XML file from Maven, especially, when the project escalates with a lot of new dependencies on the time.

## Approach
The project is focused on the UI layer, testing and verifying the web app, and focused on one test regarding,
how to add a product to the cart.
The approach was first, to make some manual tests to be clear about what pages should be automated,
and after determinate the flow, I began coding.

I use the Page Model Object pattern, the idea was isolated all the actions and managers over to one class: BasePage, 
and the specific Pages only have the elements, and call the actions (click, write, select, etc.) from the BasePage. 
I use too Picocontainer to handle the data between all the scenarios when is used Cucumber.

## Automation Test
As I said before, this is a UI layer test, a functional one, oriented to verify scenarios. Usually is used to stable releases,
because take more time coding and running test, and if the page still have changes could break some flows,
this type of test should be the last one, with the goal to make assure the critical and main flows working fine.
Could be E2E if we have the possibility to have access to an API or Database to validate more accurately
when the UI trigger any change, for example we could know the amount of keychains before to access to the product page
and validate if all of them are shown on the webpage.

As for the previous paragraph,
when I said that the test is functional, we also have another different type of test:

### Unit
- Is oriented to verify the functions and the minimum part of the code.
- Is fast to write and quick to run.
- Most cases the developer who makes the code is responsible to make their proper tests
- Combined with TDD practices, assure have a better and more resilient code
- the cons if the coverage is low, is easy to don't know if any small change can break the application

### Integration
- Is oriented to verify communication with other components and modules.
- Take more time to write the code and more time to execute them.
- In my experience this is a mix between Dev and QA, working together helps a creation more robust test cases
- the cons take time to execute and is needed an environment test to execute.

### Functional
- Is oriented to scenarios or flows, and functional options
- Trait to emulate a final user
- We can test all the layers and integration components
- Among all the kinds of tests, this is the one that consumes the most time, both to code and to run.
- As take time to coder and execute them, we need to be conscious of what tests have more priority to the final client.

