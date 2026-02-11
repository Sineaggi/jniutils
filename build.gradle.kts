plugins {
    java
    //id("dev.nokee.jni-library")
    // todo: `jni-library`
}

description = "The JNI library as the consumer would expect."

tasks.withType<JavaCompile>().configureEach {
    options.release = 22
}

//library {
//    dependencies {
//        api(projects.javaJni)
//        nativeImplementation(projects.cppJni)
//    }
//}

repositories {
    mavenCentral()
}

testing {
    suites {
        named<JvmTestSuite>("test") {
            useJUnitJupiter(libs.versions.junit)
            dependencies {
                implementation(projects.jniExtract)
            }
        }
    }
}

tasks.withType<JavaCompile>().configureEach {
}

tasks.test {
}
