plugins {
    java
    checkstyle
//    application
}

//application {
//    mainClass = "hexlet.code.App"
//}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    compileOnly("org.projectlombok:lombok:1.18.34")
//    annotationProcessor("org.projectlombok:lombok:1.18.34")

    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.1")
}

tasks.test {
    useJUnitPlatform()
}