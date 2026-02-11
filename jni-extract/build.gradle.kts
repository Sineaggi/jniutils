plugins {
    `java-library`
}

val generatedSourcesDir = layout.buildDirectory.dir("generated/sources/jextract/java/main")

val generateJextractSources by tasks.registering(Exec::class) {
    outputs.dir(generatedSourcesDir)
    val jextractHome = providers.gradleProperty("jextract_home")
    inputs.dir(jextractHome)
    val jdk22Home = providers.gradleProperty("jdk22_home")
    inputs.dir(jdk22Home)
    inputs.file(layout.projectDirectory.file("includes.txt"))
    commandLine(
        "cmd",
        "/c",
        file(jextractHome.get()).resolve("bin/jextract").absolutePath,
        file("header.h"),
        "-I", file(jdk22Home.get()).resolve("include").absolutePath,
        "-I", file(jdk22Home.get()).resolve("include/win32").absolutePath,
        "--source",
        "--target-package", "com.sineaggi.jniutils.internal.jni",
        "@includes.txt",
        "-l", "jawt",
        "--output", "$projectDir/src/main/java/",
    )
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 22
    options.compilerArgs = listOf("--enable-preview")
}
