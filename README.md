# java-ntu-assignments

Java coursework assignments for Module 3 Java and SpringBoot.

## Structure

```
assignment3_1/
├── SimpleCalculator.java   # Console calculator (+, -, *, /) with input validation
└── PersonalInfo.java       # Class demo: fields, constructors, getters/setters, boxing/unboxing

assignment3_2/
└── ControlAssignment.java  # Control flow demo: divisibility, transport by budget, Chinese zodiac

assignment3_4/
└── DataStructuresAssignment.java  # Collections demo: ArrayList, LinkedList, HashMap, HashSet
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

### assignment3_2/ControlAssignment.java

A console-based control flow demonstration that runs three mini tasks using one shared `Scanner`:
- Divisibility check: determines whether a number is divisible by 3, 5, both, or neither.
- Budget ride selector: recommends transport based on budget ranges (`taxi`, `train`, `bus`, or `walk`).
- Chinese zodiac lookup: maps a birth year to one of the 12 zodiac signs and handles invalid year input.

### assignment3_4/DataStructuresAssignment.java

A console-based collections demonstration that runs three mini tasks:
- Product inventory (`ArrayList`): builds a list of products, adds two, removes one, then prints the count and contents.
- Recently viewed items (`LinkedList`): simulates a "recently viewed" queue capped at 5 items, removes the oldest as new ones are added.
- Student grades and course codes (`HashMap`/`HashSet`): stores student-to-grade lookups, looks up a grade by name, and adds course codes to a set to demonstrate uniqueness (duplicates are rejected).

## Running

Each file is a standalone class with its own `main` method.

From inside `assignment3_1/`:

```bash
javac SimpleCalculator.java && java SimpleCalculator
javac PersonalInfo.java && java PersonalInfo
```

From inside `assignment3_2/`:

```bash
javac ControlAssignment.java && java ControlAssignment
```

From inside `assignment3_4/`:

```bash
javac DataStructuresAssignment.java && java DataStructuresAssignment
```
