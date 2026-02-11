plugins {
    `java-library`
}

description = "The JNI classes, also known as the JVM bindings."
group = "io.github.sineaggi"

dependencies {
    implementation(project(":java-loader"))
}

val generatedHeaders = configurations.consumable("generatedHeaders")

artifacts {
    add(generatedHeaders.name, tasks.compileJava.flatMap { it.options.headerOutputDirectory })
}
