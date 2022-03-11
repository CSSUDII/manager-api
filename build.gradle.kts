plugins {
    kotlin("jvm") version "1.5.10"
    java
    `maven-publish`
}

group = "org.cssudii"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.cssudii"
            artifactId = "manager"
            version = "0.0.1"

            from(components["java"])
        }
    }
}