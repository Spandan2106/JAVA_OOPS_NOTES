# ☕ Java OOP Notes & Practicals

<div align="center">

### Core Java • Object-Oriented Programming • Design Patterns • Practical Lab Programs

A structured collection of Java notes, programming examples, OOP implementations, design patterns, GUI applications, and college practical programs.

<p>
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java" />
  <img src="https://img.shields.io/badge/JDK-8%2B-red?style=for-the-badge&logo=openjdk" alt="JDK 8+" />
  <img src="https://img.shields.io/badge/GUI-Swing%20%26%20AWT-blue?style=for-the-badge" alt="Swing and AWT" />
  <img src="https://img.shields.io/badge/Design%20Patterns-GoF-green?style=for-the-badge" alt="GoF Design Patterns" />
  <img src="https://img.shields.io/badge/Status-Active%20Development-brightgreen?style=for-the-badge" alt="Active Development" />
  <img src="https://img.shields.io/badge/License-Apache%202.0-blueviolet?style=for-the-badge" alt="Apache 2.0" />
</p>

[Explore Repository](#-repository-structure) · [OOP Concepts](#-core-object-oriented-programming) · [Design Patterns](#-design-patterns-implemented) · [Practical Programs](#-practical-programs) · [How to Run](#-compilation-and-execution) · [Contributing](#-contributing)

</div>

---

## 📌 About the Repository

**Java OOP Notes & Practicals** is a learning-oriented repository containing Java source code and practical implementations for understanding Core Java, Object-Oriented Programming (OOP), software design patterns, GUI programming, and common academic programming exercises.

The repository brings together foundational programming concepts and more structured software design examples. It is intended to serve as a reference for students learning Java, preparing for practical examinations, revising OOP concepts, and exploring reusable software design techniques.

### 🎯 Objectives

- Understand Java syntax, classes, objects, and methods through practical examples.
- Explore inheritance, abstraction, interfaces, and polymorphism.
- Study object relationships and real-world domain models.
- Learn commonly used Gang of Four (GoF) design patterns.
- Understand the Model-View-Controller (MVC) architectural pattern.
- Practice Java Swing and AWT GUI programming.
- Explore Java Applets for historical and academic purposes.
- Practice arithmetic, numerical series, bitwise operations, input/output, and other programming exercises.
- Learn the fundamentals of exception handling, packages, multithreading, and collections.

### 👨‍🎓 Who Is This For?

- Students studying Java and Object-Oriented Programming.
- Learners preparing for college practicals, viva examinations, and lab assessments.
- Beginners who want to understand design patterns through Java examples.
- Developers revising Core Java concepts and object-oriented design.

---

## 📂 Repository Structure

The repository contains standalone Java source files alongside organized directories for practical assignments, GUI programs, Applets, and package demonstrations.

```text
JAVA_OOPS_NOTES/
│
├── Applet/                     # Java Applet lifecycle examples
├── AppletPrograms/             # Additional Applet demonstrations
├── Java Swing Codes/           # Swing GUI and event-handling programs
├── JavaPackageTest/            # Packages, imports, and access modifiers
├── Practicals/                 # Academic practical assignments
│   ├── Compute.java
│   ├── Compute1.java
│   ├── Compute2.java
│   ├── Compute3.java
│   ├── Compute4.java
│   ├── Compute5.java
│   ├── Compute6.java
│   └── Compute8.java
│
├── Animal.java                 # Animal hierarchy examples
├── Dog.java                    # Inheritance and polymorphism
├── Cat.java
├── Vehicle.java
├── Car.java
├── Bus.java
│
├── Bank.java                   # Banking domain examples
├── BankAccount.java
├── SavingsAccount.java
├── CurrentAccount.java
│
├── Employee.java               # Employee and payroll examples
├── Manager.java
├── Developer.java
├── Intern.java
├── ContractEmployee.java
│
├── Student.java                # Student and academic examples
├── StudentCollection.java
├── Grader.java
├── Result.java
│
├── Singletone_Application.java # Singleton Pattern
├── Factory_Application.java    # Factory Method Pattern
├── Abstract_Application.java   # Abstract Factory Pattern
├── Builder_Application.java    # Builder Pattern
├── Prototype.java              # Prototype Pattern
├── DecoratorDemo.java          # Decorator Pattern
├── ExampleApplication_Stategy.java # Strategy Pattern
├── ObserverPatternDemo.java    # Observer Pattern
├── IteratorPattern.java        # Iterator Pattern
├── MVCPattern.java              # MVC Architecture
│
├── ThreadDemo.java             # Multithreading examples
├── leftshift.java              # Bitwise left shift
├── rightshift.java             # Bitwise right shift
├── bitwisenot.java             # Bitwise NOT
├── inout.java                  # Input/output examples
├── sum1.java                   # Arithmetic exercises
├── sum2.java
│
├── CONTRIBUTING.md             # Contribution guidelines
├── LICENSE                     # Repository license
└── README.md                   # Repository documentation
```

> **Note:** The tree above highlights the main directories and examples described in this repository. Filenames and directory contents may change as the repository evolves. Consult the actual source files for the current implementation.

---

## 🧠 Core Object-Oriented Programming

The repository includes classes and examples demonstrating object-oriented programming concepts using practical domain models.

| Concept | Examples / Related Classes |
|---|---|
| Classes and Objects | Student, Employee, BankAccount |
| Inheritance | Animal, Dog, Cat, Vehicle, Car, Bus |
| Abstraction | Shape, abstract classes, and related implementations |
| Interfaces | Interface-based implementations and contracts |
| Polymorphism | Parent-child relationships and method behavior |
| Method Overloading | Multiple method signatures |
| Method Overriding | Specialized behavior in derived classes |
| Constructors | Object initialization and parameterized constructors |
| `super` Keyword | Accessing superclass constructors and members |
| Access Modifiers | Public, private, protected, and package-private access |
| Static Members | Class-level fields and methods |
| Exception Handling | Handling runtime errors and exceptional conditions |
| Packages | Package declarations, imports, and visibility |
| Collections | Working with collections of objects |
| Multithreading | Thread lifecycle, Runnable, and thread priorities |

### 🏦 Real-World Domain Models

#### Banking System

Examples involving banking-related classes:

- `Bank.java`
- `BankAccount.java`
- `SavingsAccount.java`
- `CurrentAccount.java`

These classes can be used to explore account hierarchies, shared behavior, specialized account types, and object relationships.

#### Employee and Payroll System

Examples involving employee roles:

- `Employee.java`
- `Manager.java`
- `Developer.java`
- `Intern.java`
- `ContractEmployee.java`

These examples provide a context for understanding inheritance, specialized employee behavior, and payroll-related computations.

#### Student and Academic System

Examples involving academic records and student operations:

- `Student.java`
- `StudentCollection.java`
- `Grader.java`
- `Result.java`

These examples support practice with object modeling, student records, collections, and grade-related computations.

#### Animal and Vehicle Hierarchies

Examples involving:

- `Animal`, `Dog`, and `Cat`
- `Vehicle`, `Car`, and `Bus`

These are familiar models for learning class hierarchies, inheritance, and polymorphic behavior.

---

## 🏗️ Design Patterns Implemented

Design patterns provide reusable approaches to recurring software design problems. This repository includes examples of several creational, structural, behavioral, and architectural patterns.

### 🧩 Creational Patterns

| Pattern | Source File | Purpose |
|---|---|---|
| Singleton | `Singletone_Application.java` | Restricts instantiation to a single instance managed by the class. |
| Factory Method | `Factory_Application.java` | Delegates object creation to specialized creator implementations. |
| Abstract Factory | `Abstract_Application.java` | Creates families of related objects through common interfaces. |
| Builder | `Builder_Application.java` | Constructs complex objects through a step-by-step process. |
| Prototype | `Prototype.java` | Creates new objects by copying existing instances. |

### 🎨 Structural Patterns

| Pattern | Source File | Purpose |
|---|---|---|
| Decorator | `DecoratorDemo.java` | Adds behavior to objects without modifying their underlying class. |

### ⚙️ Behavioral Patterns

| Pattern | Source File | Purpose |
|---|---|---|
| Strategy | `ExampleApplication_Stategy.java` | Encapsulates interchangeable algorithms behind a common interface. |
| Observer | `ObserverPatternDemo.java` | Notifies dependent objects when an observed state changes. |
| Iterator | `IteratorPattern.java` | Traverses a collection without exposing its internal representation. |

### 🏛️ Architectural Pattern

| Pattern | Source File | Purpose |
|---|---|---|
| Model-View-Controller (MVC) | `MVCPattern.java` | Separates application data, presentation, and control logic. |

**Suggested learning order:** Start with Singleton and Factory Method, continue with Builder and Prototype, then explore Decorator, Strategy, Observer, Iterator, and finally MVC.

> These implementations are educational examples. Their thread safety, error handling, extensibility, and production readiness depend on the actual source code.

---

## 🧪 Practical Programs

The `Practicals/` directory contains Java programs intended for academic lab work and programming practice.

The repository also contains standalone examples for arithmetic, input/output, bitwise operations, and other foundational programming concepts.

### Topics to Practice

- User input and console output.
- Arithmetic expressions and numerical computations.
- Conditional statements and loops.
- Numerical series and mathematical calculations.
- Classes, methods, and object creation.
- Inheritance and polymorphism.
- Exception handling.
- Arrays and collections.
- Packages and access modifiers.
- Multithreading.
- Basic GUI interaction.

### Example: Compile and Run a Practical

If a practical contains a public class named `Compute`, run:

```bash
javac Compute.java
java Compute
```

Run these commands from the directory containing the source file, and replace `Compute` with the actual public class name when working with another program.

---

## 🖥️ GUI Programming: Swing and AWT

The `Java Swing Codes/` directory contains desktop GUI examples using Java's Swing and AWT libraries.

Topics relevant to these examples include:

- Creating windows and frames.
- Using buttons, labels, text fields, and other components.
- Arranging components with layout managers.
- Handling button clicks and other GUI events.
- Separating interface components from event-handling logic.

Swing and AWT are useful for learning event-driven programming and desktop application fundamentals.

---

## ☕ Java Applets

The repository includes Applet examples under:

- `Applet/`
- `AppletPrograms/`

These programs can help with understanding traditional Applet lifecycle methods and older Java GUI concepts.

**Compatibility note:** Java Applets are a legacy technology. Modern browsers do not support Java Applets, and the Applet API was deprecated and subsequently removed from modern JDK releases. For historical college practicals, use a compatible older Java environment and an appropriate legacy viewer, where available.

For modern desktop GUI development, prefer Swing or JavaFX rather than starting a new project with Applets.

---

## 🧵 Multithreading and Concurrency

The repository includes `ThreadDemo.java` for exploring Java threading concepts.

Topics to investigate include:

- Creating a thread using the `Thread` class.
- Implementing the `Runnable` interface.
- Starting and executing threads.
- Understanding thread lifecycle and scheduling.
- Exploring thread priorities.
- Observing concurrent program execution.

Thread priorities are scheduling hints and do not guarantee execution order.

---

## 🔢 Bitwise Operations

The repository includes examples for fundamental bitwise operators:

| Source File | Operation |
|---|---|
| `leftshift.java` | Left shift (`<<`) |
| `rightshift.java` | Right shift (`>>`) |
| `bitwisenot.java` | Bitwise complement (`~`) |

These programs are useful for understanding binary operations, integer representations, and low-level computation.

---

## 🛠️ Technology Stack and Prerequisites

| Technology | Usage |
|---|---|
| Java | Primary programming language |
| JDK 8+ | General compilation and execution target, subject to API compatibility |
| `javac` | Java source-code compiler |
| Java Virtual Machine (JVM) | Executes compatible Java bytecode |
| Swing and AWT | Desktop GUI programming |
| Command Line / Terminal | Compiling and running programs |
| VS Code, IntelliJ IDEA, or Eclipse | Optional development environments |
| Git and GitHub | Version control and repository hosting |

### Prerequisites

1. Install a JDK compatible with the program you want to execute.
2. Ensure `java` and `javac` are available in your terminal.
3. Identify the source file's public class name.
4. Check whether the file uses a package declaration or depends on other classes.
5. Use a compatible JDK for legacy Applet exercises.

Verify your installation:

```bash
java -version
javac -version
```

---

## 🚀 Compilation and Execution

Most examples can be compiled and executed individually. The commands below assume that the terminal is in the directory containing the source file and that the program does not require additional dependencies.

### 1. Clone the Repository

```bash
git clone https://github.com/Spandan2106/JAVA_OOPS_NOTES.git
cd JAVA_OOPS_NOTES
```

### 2. Compile a Java File

```bash
javac FileName.java
```

Replace `FileName.java` with the source file you want to compile.

### 3. Run the Compiled Class

```bash
java FileName
```

Use the class name without the `.java` extension. If the class belongs to a named package, run it using its fully qualified class name from the appropriate classpath root.

### 4. Run a Design Pattern Example

**Singleton**

```bash
javac Singletone_Application.java
java Singletone_Application
```

**Factory Method**

```bash
javac Factory_Application.java
java Factory_Application
```

**Strategy**

```bash
javac ExampleApplication_Stategy.java
java ExampleApplication_Stategy
```

**Multithreading**

```bash
javac ThreadDemo.java
java ThreadDemo
```

These examples assume that the filenames, public class names, and entry points match the commands shown.

### 5. Compile Multiple Files

If several source files belong to the same program, compile them together:

```bash
javac FileA.java FileB.java Main.java
java Main
```

For a simple directory of compatible, independent Java files, you may also use:

```bash
javac *.java
```

**Important:** Compiling every Java file in the repository at once may fail if the files contain duplicate public class names, incompatible APIs, package differences, multiple dependencies, or legacy Applet code. Compile individual examples or related groups of source files instead.

### Windows PowerShell Example

```powershell
cd "E:\TMSL\GitHub\JAVA_OOPS_NOTES"

javac Singletone_Application.java
java Singletone_Application
```

Replace the directory path with the actual location of your cloned repository.

---

## 📚 Recommended Learning Path

For a structured learning experience, follow this progression:

1. **Java fundamentals:** Variables, data types, operators, control flow, methods, and input/output.
2. **Classes and objects:** Constructors, fields, methods, static members, and access modifiers.
3. **OOP relationships:** Inheritance, abstract classes, interfaces, and polymorphism.
4. **Core Java features:** Exceptions, packages, arrays, collections, and multithreading.
5. **Practical programming:** Work through the programs in `Practicals/`.
6. **GUI programming:** Explore Swing, AWT, and event handling.
7. **Design patterns:** Study the creational, structural, and behavioral examples.
8. **Software architecture:** Understand the MVC example and the separation of responsibilities.
9. **Independent practice:** Modify existing examples, write variations, and explain the design decisions in your own words.

For college practical preparation, prioritize writing programs independently, tracing execution, explaining output, and answering viva questions about the concepts demonstrated.

---

## 🤝 Contributing

Contributions, corrections, and educational improvements are welcome.

You can contribute by:

- Improving code readability and documentation.
- Correcting errors in existing examples.
- Adding new Java practical programs.
- Improving explanations of OOP concepts.
- Adding design pattern demonstrations.
- Including useful test cases and sample outputs.
- Improving compatibility notes and execution instructions.

### Contribution Workflow

1. Fork this repository.
2. Create a feature branch.
3. Make your changes.
4. Test the affected program or programs.
5. Commit your changes with a descriptive message.
6. Push your branch to your fork.
7. Open a pull request describing your changes.

Example commands:

```bash
git checkout -b feature/NewFeature
git add .
git commit -m "Add NewFeature example"
git push origin feature/NewFeature
```

See [`CONTRIBUTING.md`](CONTRIBUTING.md) for additional guidelines.

---

## 📄 License

This repository is distributed under the Apache License 2.0, subject to the terms of the [`LICENSE`](LICENSE) file.

Please review the license before reusing or redistributing code from this repository.

---

## ⭐ Support the Repository

If these notes and practical examples help you learn Java or prepare for your examinations, consider giving the repository a star.

- **Repository:** [Spandan2106/JAVA_OOPS_NOTES](https://github.com/Spandan2106/JAVA_OOPS_NOTES)
- **Issues:** [Report a bug or suggest an improvement](https://github.com/Spandan2106/JAVA_OOPS_NOTES/issues)
- **Contributions:** [Contribute to the repository](https://github.com/Spandan2106/JAVA_OOPS_NOTES/pulls)

---

<div align="center">

**Learn the concepts. Write the code. Understand the design.**

Made for learning, practicing, and mastering Java OOP.

</div>
