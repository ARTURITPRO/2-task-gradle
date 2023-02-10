# clevertec-plugin-file-image
### 1. Для генерации плагина выполнить: clevertec-plugin-file-image -> run gradle.build
### 2. Для публикации плагина в локальном репозитории выполнить: clevertec-plugin-file-image -> Tasks -> publishing -> publishToMavenLocal
### 3. В локальном репозитории появится плагин:  C:\Users\UsersName\.m2\repository\ru.clevertec.pluginFileImage:ru.clevertec.pluginFileImage.gradle.plugin:1.0
### 4. Для подключения плагина заменить build.gradle в корне clevertec-plugin-file-image на:

buildscript {
repositories {
mavenLocal()
}
dependencies {
classpath 'ru.clevertec.pluginFileImage:ru.clevertec.pluginFileImage.gradle.plugin:1.0'
}
}
plugins {
// Apply the Java Gradle plugin development plugin to add support for developing Gradle plugins
id 'java-gradle-plugin'
id 'maven-publish'
id 'com.gradle.plugin-publish' version '0.19.0'
}

plugins {
id 'java'
}

apply plugin: 'ru.clevertec.pluginFileImage'

group 'ru.clevertec'
version '1.0'

subprojects {
repositories {
mavenCentral()
mavenLocal()
}
}

# При необходимости нужно заменить (targetFile = "I://rabbit.png") I -> на название своего локального диска в классе MyPlugin