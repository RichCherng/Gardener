plugins {
    java
    application
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

val jerseyVersion = "2.38"
val jettyVersion = "9.4.53.v20231009"  // latest Jetty 9.x that uses javax.servlet

dependencies {
    // Jersey core
    implementation("org.glassfish.jersey.core:jersey-server:$jerseyVersion")
    implementation("org.glassfish.jersey.containers:jersey-container-servlet:$jerseyVersion")
    implementation("org.glassfish.jersey.containers:jersey-container-jetty-http:$jerseyVersion")
    implementation("org.glassfish.jersey.inject:jersey-hk2:$jerseyVersion")

    // ✅ JAX-RS API for javax.ws.rs
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")

    // ✅ Servlet API for Jetty 9 (javax.servlet)
    implementation("javax.servlet:javax.servlet-api:4.0.1")

    // Jetty core (javax version)
    implementation("org.eclipse.jetty:jetty-server:$jettyVersion")
    implementation("org.eclipse.jetty:jetty-servlet:$jettyVersion")

    // Guice
    implementation("com.google.inject:guice:7.0.0")

    // ✅ Swagger Core + JAX-RS Integration
    implementation("io.swagger.core.v3:swagger-jaxrs2:2.2.21")
    implementation("io.swagger.core.v3:swagger-integration:2.2.21")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.21")
    implementation("io.swagger.core.v3:swagger-core:2.2.21")
    implementation("io.swagger.core.v3:swagger-models:2.2.21")

    // ✅ Serve Swagger UI static content
    implementation("org.webjars:swagger-ui:4.15.5")

    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

application {
    mainClass.set("app.GardenerApp")
}

tasks.test {
    useJUnitPlatform()
}