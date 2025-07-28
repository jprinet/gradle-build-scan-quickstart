import java.time.Duration

plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()

    //timeout = Duration.ofMillis(5000)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
