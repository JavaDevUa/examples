plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.4")
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")
    // https://mvnrepository.com/artifact/javax.validation/validation-api
    implementation("javax.validation:validation-api:2.0.1.Final")
// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation
    implementation("org.springframework.boot:spring-boot-starter-validation:2.6.5")

}

application {
    mainClass.set("head.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
