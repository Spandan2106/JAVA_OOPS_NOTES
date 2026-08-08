# JAVA_OOPS_NOTES

This repository contains a collection of simple Java applications demonstrating various Object-Oriented Programming (OOP) principles and Design Patterns.

## Table of Contents

- [Purpose](#purpose)
- [Included Design Patterns](#included-design-patterns)
- [How to Run](#how-to-run)
- [Contributing](#contributing)

## Purpose

The main goal of this project is to provide clear and concise examples of common design patterns for educational purposes. Each example is self-contained in its own file and can be compiled and run independently.

## Included Design Patterns

*   **Factory Method Pattern:** `Factory_Application.java`
    *   Creates objects without specifying the exact class of object that will be created.
*   **Singleton Pattern:** `Singletone_Application.java` (Note: filename contains a typo)
    *   Ensures a class has only one instance and provides a global point of access to it.
*   **Strategy Pattern:** `ExampleApplication_Stategy.java` (Note: filename contains a typo)
    *   Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
*   **Abstract Factory Pattern:** `Abstract_Application.java`
    *   Lets you produce families of related objects (e.g., products from the same brand) without specifying their concrete classes.
*   **Builder Pattern:** `Builder_Application.java`
    *   Lets you construct complex objects step by step, allowing for different representations of an object using the same construction process.
*   **MVC Pattern:** `MVCPattern.java`
    *   Simple design of MVC.
## How to Run

You can compile and run each example using the Java Development Kit (JDK).

1.  **Compile the Java file:**

    ```sh
    # For Factory Pattern
    javac Factory_Application.java

    # For Singleton Pattern
    javac Singletone_Application.java

    # For Strategy Pattern
    javac ExampleApplication_Stategy.java

    # For Abstract Factory Pattern
    javac Abstract_Application.java

    # For Builder Pattern
    javac Builder_Application.java

    # For MVC Pattern
    javac MVCPattern.java
    ```

2.  **Run the compiled class:**

    ```sh
    java Factory_Application
    java Singletone_Application
    java ExampleApplication_Stategy
    java Abstract_Application
    java Builder_Application
    java MVCPattern
    ```

## Contributing

Contributions are welcome! If you would like to add a new design pattern example or improve an existing one, please see the CONTRIBUTING.md file for guidelines.