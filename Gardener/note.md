notes

## Todo
 [X] Setup Java Gradle + ~~Sprint Boot Java App~~ JAX-RS
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
<!-- make bootrun   # Runs via bootRun -->
make run       # Builds + runs the jar directly
make test      # Runs tests
make clean     # Cleans the build folder
```

## Swagger UI
http://localhost:8080/swagger-ui.html


## Git

```
git log --oneline --graph --decorate --all --color | less -R

git log --graph --decorate --all --color | less -R

alias graph="git log --oneline --graph --decorate --all --color | less -R"

```
#  1. Clean the cache
bazel clean --expunge
bazel run //:server

<!-- bazel run //java/myapp:myapp -->
# or if you have root-level target

# Start Server
bazel clean
<!-- bazel run //src/java/myapp:server
 -->
bazel build //src/java/myapp:server
bazel run //src/java/myapp:server -- server

<!-- If expecting a yaml config file -->
bazel run //src/java/myapp:server -- server path/to/config.yaml 

# See file structures
tree src/java/myapp

