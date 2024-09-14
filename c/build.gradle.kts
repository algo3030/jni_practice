plugins {
    id("cpp-library")
}

group = "space.algolab"
version = "1.0-SNAPSHOT"

tasks.withType<CppCompile> {
    dependsOn(":java:classes")
}

library{
    linkage = listOf(Linkage.STATIC, Linkage.SHARED)
    targetMachines = listOf(machines.linux.x86_64)
    privateHeaders{
        // for jni.h
        val javaHome = System.getProperty("java.home")
        from("$javaHome/include")
        from("$javaHome/include/linux")
        // for generated header
        val javaProject = project(":java")
        from("${javaProject.layout.buildDirectory.get()}/generated/sources/headers/java/main")
    }
}