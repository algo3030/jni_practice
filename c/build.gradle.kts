plugins {
    id("cpp-library")
}

group = "space.algolab"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<CppCompile> {
    dependsOn(":java:classes")
}

library{
    val javaProject = project(":java")
    publicHeaders.from(file("${javaProject.layout.buildDirectory}/generated/sources/headers/java/main"))

    linkage = listOf(Linkage.STATIC, Linkage.SHARED)
    targetMachines = listOf(machines.linux.x86_64)
    privateHeaders{
        val javaHome = System.getProperty("JAVA_HOME")
        from("~/$javaHome/include")
        from("~/$javaHome/include/linux")
    }
}