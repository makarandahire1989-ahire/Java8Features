# Java8Features

A small collection of Java 8 examples demonstrating streams and functional interfaces.  
This repository is intended as a lightweight learning playground and contains short example classes that illustrate specific Java 8 features.

## Contents / Highlights

- `src/Main.java` — simple example used by the IDE template (prints greetings, demonstrates a basic loop).
- `src/com/dumbbrains/StreamsTesting.java` — examples of java.util.stream usage (map, filter, collect, joining, counting, toSet).
- `src/com/dumbbrains/functionalInterfaces/DoubleFunctionExample.java` — example using `java.util.function.DoubleFunction`.
- `src/com/dumbbrains/functionalInterfaces/ToIntFunctionExample.java` — example using `java.util.function.ToIntFunction`.
- Other small examples under `src/com/dumbbrains/...` showing functional interfaces and consumers/suppliers.

## Prerequisites

- Java 8 (JDK 8) or newer installed.
- If using the command line, ensure `javac` and `java` are on your PATH (or set `JAVA_HOME` to your JDK).
- Recommended IDE: IntelliJ IDEA (project files and sample run configurations are IDE-friendly).

## Notes about `main` methods in this repo

Many example classes use `static void main()` (no `String[] args` parameter). Some IDEs (like IntelliJ) will still run these as "Run" targets, but the standard Java launcher (`java`) expects the signature `public static void main(String[] args)`. For CLI execution you have two options:

Option A — Add an `ExampleRunner` (recommended, minimal change): create a small runner with a standard `main(String[] args)` that calls the existing parameterless `main()` methods.

Option B — Edit each example to use the standard signature:
```java
public static void main(String[] args) {
    // existing body...
}