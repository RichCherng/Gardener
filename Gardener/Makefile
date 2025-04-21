APP_NAME=gardener-service
JAR_FILE=build/libs/$(APP_NAME)-0.0.1-SNAPSHOT.jar

.PHONY: run build clean test jar bootrun

## Build the project
build:
	./gradlew build

## Run the Spring Boot app via bootRun
bootrun:
	./gradlew bootRun

## Clean build artifacts
clean:
	./gradlew clean

clean-build:
	./gradlew clean build --refresh-dependencies

## Run tests
test:
	./gradlew test

## Build the executable JAR
jar:
	./gradlew bootJar

## Run the app via JAR file
run: jar
	java -jar $(JAR_FILE)
