import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    application
    java
    id("com.github.johnrengelman.shadow") version "7.1.2"
}


group = "com.example"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.dropwizard:dropwizard-core:2.1.0")
    implementation("com.google.inject:guice:5.1.0")
    implementation("ru.vyarus:dropwizard-guicey:5.4.0")
}


application {
    mainClass.set("com.example.mybackend.MyApp")
}

tasks.named<ShadowJar>("shadowJar") {
    mergeServiceFiles()
    manifest {
        attributes(mapOf("Main-Class" to "com.example.mybackend.MyApp"))
    }
    archiveClassifier.set("") // Optional: Removes the '-all' suffix from the JAR name
}
