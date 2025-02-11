

---

# Conversion and Manipulation in Java

## Overview

This Java program demonstrates essential concepts in handling data types, conversions, mathematical operations, and string manipulation. It covers conversions between numbers and strings, formatting numeric output, usage of static constants and methods in the `Math` class, character handling with the `Character` class, autoboxing and unboxing, and reversing strings. The program is designed with explanatory comments to illustrate each concept.

## Table of Contents

- [Project Structure](#project-structure)
- [Program Details](#program-details)
  - [Number Classes](#number-classes)
  - [Conversions Between Numbers and Strings](#conversions-between-numbers-and-strings)
  - [Formatting Number Output](#formatting-number-output)
  - [Static Constants and Methods in Math Class](#static-constants-and-methods-in-math-class)
  - [Character Class](#character-class)
  - [String Manipulation - Reversing a String](#string-manipulation---reversing-a-string)
  - [Autoboxing and Unboxing](#autoboxing-and-unboxing)
- [How to Run the Program](#how-to-run-the-program)

---

## Project Structure

- **`ConversionAndManipulation.java`**: Main program file containing all the code.
- **`reverseString` method**: A utility method to reverse a given string.

---

## Program Details

### Number Classes

Java's wrapper classes (`Integer`, `Double`, etc.) allow primitive data types to be treated as objects. This can be useful for using collections (like `List<Integer>` instead of `int[]`), and provides useful methods for type conversions and operations.

For example:
```java
int num = 1234;
Integer boxedInt = num; // Autoboxing - primitive to Integer object
```

### Conversions Between Numbers and Strings

Java allows seamless conversion between numbers and strings:

1. **Converting Number to String**:
   - We use `Integer.toString(int)` to convert an integer to a string.
   - Example: `Integer.toString(1234)` will return `"1234"` as a string.

   ```java
   int num = 1234;
   String numStr = Integer.toString(num);
   ```

2. **Converting String to Number**:
   - We use `Integer.parseInt(String)` to convert a string back to an integer.
   - Example: `Integer.parseInt("5678")` will return `5678` as an integer.

   ```java
   String strNum = "5678";
   int convertedNum = Integer.parseInt(strNum);
   ```

### Formatting Number Output

To format numbers for output, we use the `DecimalFormat` class. This helps in rounding, grouping, or formatting the output for readability or requirements.

```java
double decimalNum = 1234.56789;
DecimalFormat decimalFormat = new DecimalFormat("#.##");
System.out.println("Formatted Number: " + decimalFormat.format(decimalNum));
```

In the example, `DecimalFormat("#.##")` rounds `decimalNum` to two decimal places, outputting `1234.57`.

### Static Constants and Methods in Math Class

The `java.lang.Math` class provides mathematical functions and constants as static methods and fields:

1. **Constants**:
   - `Math.PI` is a constant representing the mathematical value π (pi).

2. **Methods**:
   - `Math.pow(x, y)`: Raises `x` to the power `y`.
   - `Math.sqrt(x)`: Calculates the square root of `x`.

   ```java
   double areaOfCircle = Math.PI * Math.pow(5, 2); // Area of circle with radius 5
   double sqrtValue = Math.sqrt(25);
   ```

### Character Class

The `Character` class provides methods for character manipulation:

1. **Character Check**:
   - `Character.isUpperCase(char)`: Checks if a character is uppercase.
2. **Character Conversion**:
   - `Character.toLowerCase(char)`: Converts a character to lowercase.

   ```java
   char ch = 'A';
   System.out.println("Is Uppercase? " + Character.isUpperCase(ch)); // true
   System.out.println("Lowercase: " + Character.toLowerCase(ch)); // 'a'
   ```

### String Manipulation - Reversing a String

String manipulation is a fundamental part of Java programming. Here, we reverse a string using `StringBuilder`:

1. `StringBuilder` is a mutable sequence of characters. It is efficient for operations that modify the string.

2. `StringBuilder.reverse()` reverses the characters in the sequence.

   ```java
   public static String reverseString(String str) {
       StringBuilder sb = new StringBuilder(str);
       return sb.reverse().toString();
   }
   ```

In this program, we use the `reverseString` method to reverse any given string, showcasing a basic string manipulation technique.

### Autoboxing and Unboxing

Autoboxing and unboxing are features that allow seamless conversion between primitives and wrapper types:

1. **Autoboxing**: Converting a primitive (e.g., `int`) into its wrapper class (`Integer`) automatically.
   ```java
   Integer boxedInt = num; // Autoboxing
   ```

2. **Unboxing**: Converting an object of a wrapper class to its corresponding primitive type automatically.
   ```java
   int unboxedInt = boxedInt; // Unboxing
   ```

These conversions allow primitive types and their wrapper classes to be used interchangeably in many cases.

---

## How to Run the Program

1. **Clone or Download the Project**.
2. **Open a Terminal** and navigate to the project folder.
3. Compile the Java file using:
   ```bash
   javac ConversionAndManipulation.java
   ```
4. Run the compiled program:
   ```bash
   java ConversionAndManipulation
   ```

