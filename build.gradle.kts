plugins {
    java
    //id("dev.nokee.jni-library")
    // todo: `jni-library`
}

description = "The JNI library as the consumer would expect."
group = "io.github.sineaggi"

tasks.withType<JavaCompile>().configureEach {
    options.release = 22
}

//library {
//    dependencies {
//        api(projects.javaJni)
//        nativeImplementation(projects.cppJni)
//    }
//}

testing {
    suites {
        named<JvmTestSuite>("test") {
            useJUnitJupiter("6.1.0-M1")
            dependencies {
                implementation(project(":jni-extract"))
            }
        }
    }
}
