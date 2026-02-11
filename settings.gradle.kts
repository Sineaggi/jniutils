dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "jniutils"

include("cpp-jni")
include("java-jni")
include("java-loader")
include("jni-extract")
