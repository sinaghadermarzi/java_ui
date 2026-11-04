# Java UI Project

A simple Maven-based Java project for testing GUI APIs and UI development. The current application,
`com.example.HelloWorld`, opens a plain AWT `Frame` titled "Hello AWT" containing one "Click Me" button
(100x75, `FlowLayout`, sized with `pack()`). Nothing is wired to the button yet, and the frame has no close
handler, so stop the program from the terminal (Ctrl+C) or the IDE.

## Project Structure

```
java_ui/
├── pom.xml                     # Maven configuration
├── .vscode/                    # VS Code launch/tasks/settings
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── HelloWorld.java      # AWT frame with a button
│   └── test/
│       └── java/
│           └── com/example/
│               └── HelloWorldTest.java  # JUnit 5 placeholder (one empty test)
└── readme.md
```

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
- VS Code with Java Extension Pack (recommended)

### VS Code Setup
This project includes VS Code configuration files:
- **`.vscode/launch.json`** - Debug/run configurations
- **`.vscode/tasks.json`** - Build tasks for Maven
- **`.vscode/settings.json`** - Java project settings

#### Available VS Code Commands:
- **Run HelloWorld** - Execute the main application
- **Debug HelloWorld** - Debug the main application with breakpoints
- **Run Current File** - Run any Java file with a main method

#### Available VS Code Tasks:
- **compile** - Compile the project
- **test** - Run unit tests
- **package** - Build JAR file
- **clean** - Clean build artifacts

### Building the Project

```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Package the application
mvn package

# Run the application (after mvn compile)
java -cp target/classes com.example.HelloWorld
# Or run the compiled JAR (the manifest names com.example.HelloWorld as the main class)
java -jar target/java-ui-1.0-SNAPSHOT.jar
```

The application opens a window, so it needs a display; on a headless machine it fails with a
`HeadlessException`.

### Development

This project is set up with:
- Maven for dependency management and building
- JUnit 5 (5.9.2, via surefire) for testing
- Java 17 as the target version
- Standard Maven directory structure
- Plain AWT from the JDK; no extra GUI dependencies

Swing is available from the JDK as well. JavaFX is not bundled with Java 17 and would need to be added to
`pom.xml` as a dependency.