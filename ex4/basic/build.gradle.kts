plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.4")

//    implementation("org.springframework.boot:spring-boot-starter-security:2.6.4")

    implementation("org.springframework.boot:spring-boot-devtools:2.6.4")
// https://mvnrepository.com/artifact/com.h2database/h2

//    implementation("com.h2database:h2:2.1.210")
    runtimeOnly("com.h2database:h2:2.1.210")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.6.4")

    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.22")

    annotationProcessor("org.projectlombok:lombok:1.18.22")


    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
//    implementation("org.slf4j:slf4j-api:1.7.36")
// https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
//    implementation("org.slf4j:slf4j-simple:1.7.36")

}

application {
    mainClass.set("pack.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}


//configurations {
//    all {
//
//        exclude("org.springframework.boot", "spring-boot-starter-logging")
//
//
////        exclude group: 'org.springframework.boot', module: 'spring-boot-starter-logging'
////        exclude group: 'ch.qos.logback', module: 'logback-classic'
////        exclude group: 'org.apache.logging.log4j', module: 'log4j-to-slf4j'
//    }
//}
