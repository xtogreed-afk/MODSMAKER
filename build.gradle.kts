plugins {
    `java-library`
    id("net.minecraftforge.gradle") version "[6.0.24,6.2)"
}

version = "1.0.0"
group = "com.hui.tw"

base {
    archivesName.set("tw")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

minecraft {
    mappings("official", "1.20.1")
}

dependencies {
    minecraft("net.minecraftforge:forge:1.20.1-47.4.28")
}

tasks.named<Jar>("jar") {
    finalizedBy("reobfJar")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}
