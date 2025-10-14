# Unit testing I. workshop exercise
## Exercise 1: Classic Unit Testing - Achieving Full Coverage
**Goal:** Your goal is to write a complete suite of unit tests for the Animal, Lion, and Parrot classes from our Virtual Zoo project. The objective is to achieve 100% code coverage for these classes, ensuring that every line and every logical branch of our code is verified.

**Context:** You are given a fully functional **Virtual Zoo** application. While the `Zoo` class simulates the application, our focus is on ensuring the core "building blocks". You will be provided with a starting point, `AnimalTest.java`, which contains a single example test case. Your job is to expand upon this foundation.
### Instructions
1. **Review the Code:** Take a moment to read through the `Animal.java`, `Lion.java` and `Parrot.java` classes. Pay close attention to the logic inside the `Animal` constructor. These contain conditions and branches that will need specific tests.
2. **Examine the Starter Test:** Open the provided `AnimalTest.java`. Understand how the first test case is structured using the *Arrange, Act, Assert* pattern.
3. **Expand the Test Suite:** Your task is to add more test methods to cover the following scenarios. The goal is to make every line in `Animal.java` turn green when you "Run with Coverage".
   * Constructor Logic: The constructor has special rules. You need to test them.
4. You also need to **test** the `Lion` and `Parrot` classes. According to best practices, these tests should be in their own files (e.g.: `LionTest.java`, `ParrotTest.java`). Think about what makes a Lion or Parrot unique. What specific behavior should you test for them?
5. **Run with Coverage:** Periodically run your tests using IntelliJ's "Run with Coverage" feature to see your progress. Identify any red lines in Animal, Lion and Parrot.java and write the specific test needed to turn them green.

Note: You do not need to write tests for the `Zoo.java` class. Our focus is solely on the unit tests for the animal models.

## Exercise 2: Test-Driven Development (TDD)
**Goal:** Your goal is to implement the `getHealthStatus()` method in the `Animal` class using the *Test-Driven Development (TDD)* workflow. You will follow the "Red-Green-Refactor" cycle step-by-step.

**Context:** Imagine you are tasked with adding a new feature: determining an animal's health status. Before you write a single line of implementation code, you will first write a test that defines what the feature should do.
### Instructions
You will complete this task in three small iterations. For each iteration, you must follow the cycle: **write a failing test first, then write the code to make it pass**.
### Requirements
* when the health > 80, the `getHealthStatus()` method shall return `Healthy and Happy`
* when health is between 50 and 80 (inclusive), the `getHealthStatus()` method shall return `A bit tired`
* when health < 50, the `getHealthStatus()` method shall return `Looks weak`
### Hints
* Each requirement will guide one full "Red-Green" iteration. The steps for the first iteration are detailed below as a guide.
  * Iteration 1: The "Healthy" Case (health > 80)
    * **RED:** In `AnimalTest.java`, write a new test method called `testGetHealthStatus_WhenHealthy`. In this test, create an animal with health greater than 80 (e.g., 95) and assert that `getHealthStatus()` returns `Healthy and Happy`. Run this test. It must fail. This is the "Red" phase.
    * **GREEN:** Now, go to Animal.java. Write the absolute minimum amount of code inside `getHealthStatus()` to make the test pass. Run the test again. It must pass. This is the "Green" phase.

