buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Dependencies.Android.classpath)
        classpath(Dependencies.Kotlin.classpath)
        classpath(Dependencies.Remal.classpath)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
    apply(plugin = Dependencies.Remal.checkUpdatesPlugin)
}

subprojects {
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }
}