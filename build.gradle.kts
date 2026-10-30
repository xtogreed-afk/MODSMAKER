plugins {
    id("fabric-loom") version "1.10-SNAPSHOT"
}

val modVersion: String by project
val minecraftVersion: String by project
val loaderVersion: String by project

version = modVersion
group = "com.example.my"

base {
    archivesName.set("my")
}

dependencies {
    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:$loaderVersion")
}

tasks.withType<JavaCompile>().configureEach {
    options.release.set(17)
    options.encoding = "UTF-8"
}

java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
