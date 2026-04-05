# Java Learning Journey
This repository contains my Java practice and notes as I learn Java step by step.

## Goals
- Understand Java fundamentals
- Practice object-oriented programming
- Build a strong programming foundation in Java for Software Development.
  My Java learning from basics to OOP
## Topics covered so far
- Variables and data types
- User input using Scanner
- Java Input Handling (7/02/26)
  I learned about an issue when using 'Scanner' to accept 'int' or 'double' input before a 'String'.
     **Problem**
  When switching from numeric input to 'nextLine', the input buffer keeps the newline character, causing the string input to be skipped.
     **Solution**
  Consume the leftover newline using an extra 'scanner.nextLine()'.
  This helped me understand how Java handles input internally.
  -Rectangle Area Calculator(9/02/26)
  I created a simple Java program that calculates the area of a rectangle using user input.
  -**Concepts practiced**
  Using 'Scanner' for user input
  Working with 'double' values
  Basic arithmetic operations
  Output formating
  -**Formula**
  Area= lenth*width
  -Mad Libs Game(11/02/26)
  A simple interactive console game. The program asks the user for different words and generates a funny story using the provided input.
  **-Concepts practiced**
  -Scanner
  -String concatenation
  -Console output formatting
  Arithmetic Operations Practice(12/02/2026)
  A Java program demonstrating basic arithmetic operators;
  - Addition(+)
  - Subtraction(-)
  - Multiplication(*)
  - Division(%)
  - Modulus(%)
    **Concepts practiced**
    - Integer and double calculations
    - Order of operations
    - Console output
  ## Augmented Assignment Operators(12/2/2026)
  A Java program demonstrating the use of:
  - += (addition assignment)
  - -= ( subtraction assignment)
  - *= ( multiplication assignment)
  - /= ( division assignment)
  - %= ( modulus assignment)
  ## Concepts practiced:
  - Updating variable values
  - Short-hand arithmetic operations
  - Understanding operator behavior
## Increment and Decrement Operators(12/2/2026)
A Java program demonstrating :
- Post-increment (x++)
- Pre-increment (++x)
- Post-decrement (x--)
- Pre-decrement (--x)
### Concepts practiced:
- Understanding operator behavior
- Difference between pre and post operations
- Variable value updates
## Shopping Cart Program(14/02/2026)
A console-based Java program that simulates a simple shopping cart.
### Features
- Accepts product name
- Accepts quantity
- Accepts price per item
- Calculates total cost
- Displays formatted output
### Concepts Practiced:
- A Scanner for user input
- Arithmetic calculations
- Working with double values
- Basic program structure
- Console output formatting
## If Statements Practice(16/02/2026)
A Java program demonstrating decision-making using;
- if
- else if
- else
### Concepts Practiced:
- Conditional logic
- Comparison operators(>,<,==)
## Mixed Data Types and Input Practice(16/02/2026)
A Java program that accepts
- String input
- Integer input
- Boolean input
### Concepts Practiced:
- Scanner for different data types
- nextLine(), nextInt(), nextBoolean()
- Handling input buffer issues
- Variable declaration and initialization
## Random Number Practice(17/02/2026) 
A Java program demonstrating how to generate random numbers using:
- Random class
### Concepts Practiced
- Importing classes
- Generating random integers
- Working with ranges
- Basic program
## Math Functions Practice(20/02/2026)
A Java program demonstrating commonly used methods from the Math class.
### Functions Used:
- Math.max()
- Math.main()
- Math.sprt()
- Math.pow()
- Math.abs()
- Math.round()
- Math.ceil()
- Math.floor()
### Concepts Practiced:
- Using built-in Java methods
- Working with double values
- Performing advanced calculations
## Hypoteuse Calculator(20/02/2026)
A Java program that calculates the hypotenuse of a right triangle using the Pythagorean theorem.
Formula used: c= sqrt(a2 + b2)
### Concepts Practiced:
-Math.sqrt()
-Math.pow()
-User input handling
-Mathematical formulas in code
## Geometry Calculator(20/02/2026)
A Java program that calculates:
- Circumference of a circle
- Area of a circle
- Volume of a sphere
### Formulas Used:
Circumference = 2 × π × r  
Area = π × r²  
Volume = (4/3) × π × r³  
### Concepts Practiced:
- Math. PI
- Math.pow()
- Working with double
- printf formatting (%.2f)
- Mathematical computations
## Printf Formatting Practice(21/02/2026)
A Java program demonstrating formatted output using `System.out.printf().
### Data Types Used:
- String (%s)
- int (%d)
- double (%.2f)
- boolean (%b)
- char (%c)
### Concepts Practiced:
- Output formatting
- Multiple variables in one line
- Controlling decimal places
## Advanced Printf Formatting(21/02/2026)
A Java program demonstrating advanced formatting flags in `System.out.printf()`.
### Concepts Practiced:
- + flag (always show sign)
- , flag (comma grouping separator)
- ( flag (negative numbers in parentheses)
- space flag (leading space for positive numbers)
- Combining flags with precision
## Printf Width and Padding.(23/2/2026)
A Java program demonstrating width formatting and text alignment using `System.out.printf()`.
### Concepts Practiced:
- Setting field width
- Zero padding (0 flag)
- Right-justified padding (default behavior)
- Left-justified padding (- flag)
- Combining width with precision
---
## Compound Interest Calculator(28/02/2026)
A Java program that calculates compound interest using the formula:
A = P(1 + r/n)^(nt)
### Concepts Practiced:
- Mathematical formulas
- Math.pow()
- User-defined variables
- Formatted output using printf
- Precision control
## Nested If Statements(28/02/2026)
A Java program demonstrating the use of nested if statements to evaluate multiple conditions.
### Concepts Practiced:
- Conditional logic
- Nested decision structures
- Logical comparison operators
- Structured branching
## Useful String Methods(03/03/2026)
A Java program demonstrating commonly used String methods.
### Concepts Practiced:
- length()
- toUpperCase() and toLowerCase()
- trim()
- substring()
- equals() and equalsIgnoreCase()
- contains()
- replace()
- charAt()
## Substring Method(4/03/2026)
A Java program demonstrating how to extract parts of a String using the substring() method.
### Concepts Practiced:
- substring(beginIndex)
- substring(beginIndex, endIndex)
- Understanding index positions
- Extracting portions of text
- Avoiding StringIndexOutOfBoundsException
## Weight Conversion Program(5/03/2026)
A Java program that converts weight between kilograms and pounds using user input.
### Concepts Practiced:
- Scanner input handling
- if-else if-else statements
- Arithmetic calculations with double
- Formatted output using printf
- Unit conversion logic
## Ternary Operator(7/03/2026)
A Java program demonstrating the use of the ternary operator as a shorthand for if-else statements.
### Concepts Practiced:
- Conditional expressions
- Ternary operator syntax (condition ? value1 : value2)
- Simplifying simple if-else logic
## Temperature Conversion program using ternary Operator(7/03/2026)
A Java program that converts temperature between Celsius and Fahrenheit using the ternary operator.
### Concepts Practiced:
- Scanner input handling
- Conditional logic with ternary operator
- Arithmetic calculations with double
- Formatted output using printf
- Temperature conversion formulas
## Enhanced Switch Statement(9/03/2026)
A Java program demonstrating the modern enhanced switch syntax using arrow labels.
### Concepts Practiced:
- Modern switch syntax (->)
- Cleaner case handling
- Eliminating break statements
- Improved readability of conditional branching
## Simple Calculator(11/03/2026)
A Java program that performs basic arithmetic operations based on user input.
### Concepts Practiced:
- Scanner input handling
- switch statement for operation selection
- if-else logic for validation
- Boolean operators (&&, ||)
- Arithmetic calculations
## Logical Operators(13/03/2026)
A Java program demonstrating the use of logical operators to combine multiple conditions.
### Concepts Practiced:
- Logical AND (&&)
- Logical OR (||)
- Logical NOT (!)
- Combining conditions in if statements
## Username Setup Program(13/03/2026)
A Java program that allows users to create a username with input validation.
### Concepts Practiced:
- Scanner input handling
- if-else statements
- Logical operators (&&, ||)
- User input validation
- Conditional branching
## Name Input Validation(14/03/2026)
A Java program that ensures the user enters a name by preventing empty input using a while loop.
### Concepts Practiced:
- while loop repetition
- User input validation
- String method isEmpty()
- Scanner input handling
## While Loop Practice(14/03/2026)
Java programs demonstrating how while loops can repeat actions until a condition changes.
### Concepts Practiced:
- while loop syntax
- Input validation using loops
- Repeating user interaction
- Program termination using conditions
## Do-While Loop Practice(14/03/2026)
A Java program demonstrating the use of a do-while loop to validate user input.
### Concepts Practiced:
- do-while loop structure
- Input validation
- Scanner input handling
- Ensuring a value is not negative
## Number Range Validation(16/03/2026)
A Java program that repeatedly prompts the user to enter a number between 1 and 10 until a valid value is provided.
### Concepts Practiced:
- while loop repetition
- Logical OR operator (||)
- Input validation
- Scanner user input
## Number Guessing Game(17/03/2026)
A Java program where the user guesses a randomly generated number between 1 and 100.
### Concepts Practiced:
- Random number generation
- do-while and while loops
- if-else conditional logic
- User input handling with Scanner
- Counting attempts
- Input validation
## For Loop Practice(20/03/2026)
A Java program that uses a for loop to repeat an action based on user input.
### Concepts Practiced:
- for loop syntax
- Loop initialization, condition, and increment
- User-controlled iteration
- Incrementing values
## Countdown Timer(20/03/2026)
A Java program that counts down from 60 seconds to 0 using a for loop and Thread.sleep.
### Concepts Practiced:
- for loop countdown logic
- Time delay using Thread.sleep()
- Sequential output
- Basic time-based simulation
## Nested Loops(21/03/2026)
A Java program demonstrating the use of nested loops to repeat actions within another loop.
### Concepts Practiced:
- Nested loop structure
- Outer and inner loop control
- Pattern generation
- Repetitive structured output
## Matrix Pattern(21/03/2026)
A Java program that prints a 5x4 matrix using a symbol (*) with nested loops.
### Concepts Practiced:
- Nested loops
- Row and column structure
- Pattern generation
- Console output formatting
## Methods in Java(24/03/2026)
Java programs demonstrating how to create and use methods for code reusability and structured programming.
### Concepts Practiced:
- Creating methods
- Calling methods
- Passing parameters (String, int, double)
- Returning values from methods
- Using static methods
- Method reusability
- Combining methods with user input and formatted output
### Programs:
- Happy Birthday Method (prints formatted message using parameters)
- Square Method (returns square of a number)
- Cube Method (returns cube of a number)
- Full Name Method (combines first, middle, and last name)
- Age Eligibility Checker (returns a boolean to determine credit card sign-up eligibility)
## Method Overloading(25/03/2026)
Java programs demonstrating method overloading by using the same method name with different parameters.
### Concepts Practiced:
- Method overloading
- Same method name with different parameter lists
- Compile-time polymorphism
- Returning values from overloaded methods
- Using different data types (double, String)
### Programs:
- Addition Overloading (adding 2, 3, and 4 numbers)
- Pizza Ingredients Overloading (returns ingredients based on pizza type)
## Variable Scope(27/03/2026)
A Java program demonstrating the difference between local and class variables.
### Concepts Practiced:
- Local variables (defined inside methods)
- Class variables (defined outside methods)
- Variable accessibility
- Scope limitations
## Banking Program
A menu-driven Java application that allows users to check their balance, deposit, withdraw, or exit.
### Concepts Practiced:
- Methods for modular design
- User input handling with Scanner
- Conditional logic (if, else if, else)
- Formatted output using printf
- Menu-driven program structure
- Shared resources across methods (Scanner)
## Dice Roller Program(31/03/2026)
A Java program that simulates rolling one or more dice and displays the results using ASCII art.
### Concepts Practiced:
- Random number generation
- User input handling with Scanner
- for loop iteration
- Conditional validation using if statements
- switch statement for handling dice faces
- Methods for modular design
- ASCII output formatting
## Arrays in Java(02/04/2026)
Java programs demonstrating basic array operations and manipulation.
### Concepts Practiced:
- Creating and initializing arrays
- Accessing array elements
- Using Arrays.sort()
- Using Arrays.fill()
- Iterating with for loop
- Iterating with enhanced for loop (for-each)
- Dynamic array input using Scanner
- Searching elements using linear search
### Programs:
- Array Basics (sorting, filling, iteration)
- User Input Array (stores and prints user-provided values dynamically)
- Array Search (linear search for integers and strings using loops and boolean flags)
## Varargs in Java(5/04/2026)
Java programs demonstrating the use of variable-length arguments (varargs) to handle multiple inputs.
### Concepts Practiced:
- Variable-length arguments (int... numbers)
- Treating varargs as arrays
- Flexible method parameters
- Looping through dynamic inputs
- Returning computed results
### Programs:
- VarArgs Sum (calculates sum of integers)
- VarArgs Average (calculates average of numbers)
## Learning approach
- Practice-based learning
- Small examples for each concept
- Consistent progress updates on GitHub
