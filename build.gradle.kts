plugins {
    id("fabric-loom") version "1.10-SNAPSHOT"
    kotlin("jvm") version "2.4.21"
}

val modVersion: String by project
val minecraftVersion: String by project
val loaderVersion: String by project
val fabricApiVersion: String by project
val fabricKotlinVersion: String by project

version = modVersion
group = "hui.hui.hui.my_mo"

base {
    archivesName.set("my_mo")
}

dependencies {
    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:$loaderVersion")
    modImplementation("net.fabricmc.fabric-api:fabric-api:$fabricApiVersion")
    modImplementation("net.fabricmc:fabric-language-kotlin:$fabricKotlinVersion")
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
