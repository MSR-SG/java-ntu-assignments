# java-ntu-assignments

Java coursework assignments for Module 3 Java and SpringBoot.

## Structure

```
assignment3_1/
├── SimpleCalculator.java   # Console calculator (+, -, *, /) with input validation
└── PersonalInfo.java       # Class demo: fields, constructors, getters/setters, boxing/unboxing
```

### assignment3_1/SimpleCalculator.java

A console-based calculator that:
- Prompts for two numbers and an operator (`+`, `-`, `*`, `/`).
- Re-prompts on invalid (non-numeric) input instead of crashing or aborting the calculation.
- Guards against division by zero.
- Loops to perform repeated calculations until the user answers `N` to "continue?".

### assignment3_1/PersonalInfo.java

A simple data class (`name`, `age`, `height`, `isStudent`, `grade`) demonstrating:
- Constructor-based field initialization with getters/setters.
- `age` as an `Integer` wrapper, with a `main` method illustrating autoboxing (`int` → `Integer`) and unboxing (`Integer` → `int`).

## Running

Each file is a standalone class with its own `main` method. From inside `assignment3_1/`:

```bash
javac SimpleCalculator.java && java SimpleCalculator
javac PersonalInfo.java && java PersonalInfo
```
