plugins {
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    java
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation("com.google.inject:guice:7.0.0")
    implementation("javax.servlet:javax.servlet-api:4.0.1") // for servlet binding (if needed)
    implementation("org.eclipse.jetty:jetty-server:11.0.14") // or any HTTP server
}

tasks.test {
    useJUnitPlatform()
}
