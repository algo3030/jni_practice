plugins {
    id("java")
    id("application")
    kotlin("jvm")
}

group = "space.algolab"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
}

application{
    mainClass = "space.algolab.Main"
}

tasks.named<JavaExec>("run") {
    dependsOn(":c:assembleReleaseShared")
    val cLib = project(":c")
    jvmArgs = listOf("-Djava.library.path=${cLib.layout.buildDirectory.get()}/lib/main/release/shared")
}

tasks.test {
    useJUnitPlatform()
}



kotlin {
    jvmToolchain(22)
}