plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.4")
    implementation("org.springframework.boot:spring-boot-starter-security:2.6.4")
    runtimeOnly("com.h2database:h2:2.1.210")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.6.4")
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")

    implementation("com.auth0:java-jwt:3.19.0")
}

application {
    mainClass.set("head.Main")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
