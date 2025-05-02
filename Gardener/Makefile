# Makefile for Java + Gradle Project using Shadow Plugin

# Variables
GRADLEW = ./gradlew
JAR_NAME = my-backend-app-1.0.0.jar
JAR_PATH = build/libs/$(JAR_NAME)
CONFIG = config.yml

# Default target
.PHONY: all
all: build

# Build the fat JAR using the Shadow plugin
.PHONY: build
build:
	$(GRADLEW) shadowJar

# Run the application with the specified configuration
.PHONY: run
run: build
	java -jar $(JAR_PATH) server $(CONFIG)

# Build and run the application
.PHONY: server
server: build run

# Run tests
.PHONY: test
test:
	$(GRADLEW) test

# Clean the build directory
.PHONY: clean
clean:
	$(GRADLEW) clean