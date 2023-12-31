plugins {
    id("java")
}

group = "imp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter");
    testImplementation ("com.codeborne:selenide:6.19.0")
}

tasks.test {
    useJUnitPlatform()
}