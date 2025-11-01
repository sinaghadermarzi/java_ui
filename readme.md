# Java UI Project

A simple Maven-based Java project for testing GUI APIs and UI development.

## Project Structure

```
java_ui/
├── pom.xml                     # Maven configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── HelloWorld.java
│   └── test/
│       └── java/
│           └── com/example/
│               └── HelloWorldTest.java
└── README.md
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
- **Maven: compile** - Compile the project
- **Maven: test** - Run unit tests
- **Maven: package** - Build JAR file
- **Maven: clean** - Clean build artifacts

### Building the Project

```bash
# Compile the project
mvn compile

# Run tests
mvn test

# Package the application
mvn package

# Run the application
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
# Or run the compiled JAR
java -jar target/java-ui-1.0-SNAPSHOT.jar
```

### Development

This project is set up with:
- Maven for dependency management and building
- JUnit 5 for testing
- Java 17 as the target version
- Standard Maven directory structure

Feel free to add GUI frameworks like JavaFX, Swing, or AWT as needed for your UI development.