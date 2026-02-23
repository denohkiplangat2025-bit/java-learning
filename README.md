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
## Learning approach
- Practice-based learning
- Small examples for each concept
- Consistent progress updates on GitHub
