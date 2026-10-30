plugins {
    id("net.fabricmc.fabric-loom") version "1.15-SNAPSHOT"
    kotlin("jvm") version "2.4.21"
}

val modVersion: String by project
val minecraftVersion: String by project
val loaderVersion: String by project
val fabricApiVersion: String by project
val fabricKotlinVersion: String by project

version = modVersion
group = "com.example.my"

base {
    archivesName.set("my")
}

dependencies {
    minecraft("com.mojang:minecraft:$minecraftVersion")

    implementation("net.fabricmc:fabric-loader:$loaderVersion")
    implementation("net.fabricmc.fabric-api:fabric-api:$fabricApiVersion")
    implementation("net.fabricmc:fabric-language-kotlin:$fabricKotlinVersion")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(25)
    options.encoding = "UTF-8"
}

java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_25
    targetCompatibility = JavaVersion.VERSION_25
}
