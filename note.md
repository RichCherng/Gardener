notes

## Todo
 [X] Setup Java Gradle + Sprint Boot Java App
   [ ] Use GUI injection
   [ ] Setup Logging
   [ ] Setup Configuration loader
 [ ] Setup Swagger UI Integration
 [ ] Setup Unit Test (Optional)
 [ ] Setup React Web App 
   [ ] Servce by the server
   [ ] Move the code to other repo
   [ ] (For Dev environment, use submodule)



## To Run
```
Command         |	What It Does
./gradlew build	| Compiles code, runs tests, packages into a .jar
./gradlew run	| Runs the main class (if using plain Java app, not Spring Boot)
./gradlew test	| Runs unit tests
./gradlew clean	| Deletes the build/ directory
./gradlew tasks	| Lists available Gradle tasks
./gradlew bootJar |	Builds the executable Spring Boot .jar
```


## Using Makefile
```
make build     # Compiles and packages the project
make bootrun   # Runs via bootRun
make run       # Builds + runs the jar directly
make test      # Runs tests
make clean     # Cleans the build folder
```