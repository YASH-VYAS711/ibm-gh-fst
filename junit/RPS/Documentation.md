# Changes to Existing Code

Several modifications were made to improve the reliability and maintainability of the Rock-Paper-Scissors application.

* Renamed the `results` class to `Results` to follow Java naming conventions.
* Fixed a critical bug in `RPSGame.java` where the machine's choice was mistakenly passed as both the machine and user inputs.
* Added proper handling for the **Export** and **Exit** menu options.
* Replaced generic `Exception` usage with `IllegalArgumentException` for better exception handling.
* Moved initialization of the move map in `Values.java` from the constructor to a static block to prevent `NullPointerException`.
* Added default cases in `GameUi.java` to prevent invalid inputs from causing runtime errors.
* Corrected the export functionality to ensure that user and machine inputs are written under the appropriate columns.
* Added checks to prevent exporting when no games have been played.
* Improved error messages and removed stack trace printing from user-facing code.
* Added resource management by properly closing the `Scanner`.
* Enhanced file export functionality to save game history reliably.

---

# Challenges to Create the Test Cases

Developing unit tests for the application presented several challenges.

### 1. Heavy Usage of Static Variables

The `Results` class stores game history and scores using static variables. Since these variables retain values across tests, each test had to reset the state before execution using `@BeforeEach`.

### 2. Testing Console-Based Methods

Methods such as `GameUi.showInput()` print directly to the console. Since they do not return values, verifying output required focusing on exception behavior instead of printed content.

### 3. Random Number Generation

The `GenerateRandom()` method produces unpredictable values. Instead of checking specific values, test cases validated whether the generated numbers remained within the expected range of 0 to 2.

### 4. File Export Validation

Testing file creation required checking whether the output file existed after invoking the export method and deleting the file afterward to avoid side effects.

### 5. Main Method Testing

The `main()` method continuously waits for user input and contains an infinite loop. Due to its interactive nature, direct unit testing was avoided, and individual components were tested independently.

### 6. Dependency Between Classes

The `Results` class interacts with both `Values` and `GameUi`, making isolated testing difficult. Test cases focused primarily on verifying score updates and history management.

### 7. Exception Handling Verification

Special care was required to ensure that invalid inputs such as empty strings, null values, alphabetic characters, and out-of-range numbers correctly threw `IllegalArgumentException`.

---

# Learning Outcomes

Through the development and testing of the Rock-Paper-Scissors application, several concepts and practices were learned.

### Object-Oriented Programming

* Applied encapsulation by organizing data and methods into separate classes.
* Used abstraction to hide validation and random number generation logic behind methods.
* Established associations among classes to separate responsibilities.

### Exception Handling

* Learned to use `try-catch` blocks effectively.
* Replaced generic exceptions with more meaningful exception types.
* Improved robustness by handling invalid user inputs gracefully.

### Unit Testing with JUnit 5

* Created unit tests using annotations such as `@Test` and `@BeforeEach`.
* Used assertions including `assertEquals()`, `assertTrue()`, and `assertThrows()`.
* Verified functionality independently without relying on manual execution.

### File Handling

* Implemented exporting of game results using `FileWriter`.
* Learned how to validate file creation and manage I/O exceptions.

### Debugging and Error Prevention

* Identified and fixed logical bugs and potential runtime exceptions.
* Prevented `NullPointerException` by properly initializing shared resources.
* Added boundary checks and default cases to improve stability.

### Software Design

* Improved code readability and maintainability by separating user interface, game logic, validation, and data handling.
* Understood the importance of modular design and low coupling between classes.

### Testing Strategy

* Learned to isolate components and test them individually.
* Recognized the limitations of testing interactive methods and static state.
* Developed an understanding of edge cases and boundary conditions to ensure software reliability.

Overall, the project provided practical experience in Java programming, object-oriented design, exception handling, file operations, debugging, and automated unit testing using JUnit 5.

