
# Spark Word Count Application (Java)

## Overview

This is a simple Apache Spark Word Count application built using Java. The project demonstrates how to process large text files and count word frequencies using Apache Spark. It reads an input text file, splits it into words, and outputs the count of each word in the file.

## Prerequisites

Before running this project, ensure you have the following installed:

- **Java 8 or later**
- **Apache Maven**
- **Apache Spark** (installed via Homebrew or other means)
- **Git**

## Project Structure

The project follows a typical Maven structure:

```
.
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── tan
│   │           └── jerry
│   │               └── sparkwordcount
│   │                   └── WordCount.java
│   └── test
│       └── java
│           └── tan
│               └── jerry
│                   └── sparkwordcount
│                       └── WordCountTest.java
└── input.txt
```

## How to Run the Project

### Step 1: Clone the Repository

If you haven't already cloned the repository, use the following command:

```bash
git clone https://github.com/the-real-jerry-tan/SparkWordCount.git
cd SparkWordCount
```

### Step 2: Install Dependencies

Ensure you have Maven installed and run the following command to install the required dependencies:

```bash
mvn clean install
```

This will compile the project and package it into a jar.

### Step 3: Run the Application

Once the project is built, you can run the application using the `java -cp` command. Ensure that Spark is installed via Homebrew or another method. Here's how to run the project:

```bash
java -cp "target/spark-wordcount-1.0-SNAPSHOT.jar:/usr/local/Cellar/apache-spark/3.4.1/libexec/jars/*" tan.jerry.sparkwordcount.WordCount
```

- Adjust the Spark jars path according to your installation. The `*` wildcard ensures all necessary Spark libraries are included in the classpath.

### Step 4: View the Output

The application will process the `input.txt` file and print the word counts to the console.

## Running Tests

To run the unit tests, use the following command:

```bash
mvn test
```

This will run the test cases defined in `WordCountTest.java`.

## Troubleshooting

- Ensure that the Spark dependencies are correctly included in the classpath when running the application.
- Verify that Spark is installed correctly by running `spark-shell --version` to check the installation.
- If you encounter `ClassNotFoundException`, double-check the classpath used in the `java -cp` command to ensure that all dependencies are included.

## License

This project is © 2024 Jerry Tan. All Rights Reserved.
