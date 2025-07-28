plugins {
    id("com.gradle.develocity") version("4.1")
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "gradle-build-scan-quickstart"

develocity {
    server.set("https://ge.solutions-team.gradle.com")

    buildScan {
        uploadInBackground.set(false)
    }
}
