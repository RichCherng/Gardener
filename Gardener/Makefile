APP_NAME=gardener
JAR_FILE=build/libs/$(APP_NAME)-all.jar
MAIN_CLASS=app.MainApp

.PHONY: run build clean test jar

# Compile and build
build:
	./gradlew build

# Run the app via Gradle application plugin
run:
	./gradlew run

# Clean build artifacts
clean:
	./gradlew clean

# Run tests
test:
	./gradlew test

# Create a fat/uber JAR (optional if using Shadow plugin)
jar:
	./gradlew jar

# Run the app directly with Java (if you built an uber/fat jar)
runjar: jar
	java -cp $(JAR_FILE) $(MAIN_CLASS)