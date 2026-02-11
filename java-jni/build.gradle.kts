plugins {
    `java-library`
}

description = "The JNI classes, also known as the JVM bindings."

dependencies {
    implementation(projects.javaLoader)
}

val generatedHeaders = configurations.consumable("generatedHeaders")

artifacts {
    add(generatedHeaders.name, tasks.compileJava.flatMap { it.options.headerOutputDirectory })
}
