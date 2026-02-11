plugins {
    `java-library`
}

val generatedSourcesDir = layout.buildDirectory.dir("generated/sources/jextract/java/main")

val generateJextractSources by tasks.registering(Exec::class) {
    outputs.dir(generatedSourcesDir)
    val jextractHome = providers.gradleProperty("jextract_home")
    inputs.dir(jextractHome)
    val jdk21Home = providers.gradleProperty("jdk21_home")
    inputs.dir(jdk21Home)
    inputs.file(layout.projectDirectory.file("includes.txt"))
    commandLine(
        "cmd",
        "/c",
        file(jextractHome.get()).resolve("bin/jextract").absolutePath,
        file("header.h"),
        "-I", file(jdk21Home.get()).resolve("include").absolutePath,
        "-I", file(jdk21Home.get()).resolve("include/win32").absolutePath,
        "--source",
        "--target-package", "com.sineaggi.jniutils.internal.jni",
        "@includes.txt",
        "-l", "jawt",
        "--output", "$projectDir/src/main/java/",
    )
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(21))

tasks.withType<JavaCompile>().configureEach {
    options.release = 21
    options.compilerArgs = listOf("--enable-preview")
}
