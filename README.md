# InjectLib
A lightweight Kotlin library for **Paper/Spigot 1.21+** that provides useful extensions and helper functions for plugin development. Perfect for reducing boilerplate and utilizing modern MiniMessage texts.

## ✨ Features
- **MiniMessage Messaging**
  - `Player.sendMiniMessage(text)`
  - `Player.sendMiniMessageWithPrefix(text)`
  - `Player.sendMiniMessageActionBar(text)`
  - `Player.sendMiniMessageActionBarWithPrefix(text)`
  
  Default prefix: `<dark_gray>[<gold>Inject<green>Lib<dark_gray>]`
  Prefix settable via: `InjectLib.setPrefix("<red>Mini<dark_purple>Message")`
  
- **ItemMeta Extension**
  - `ItemMeta.setCustomModelData(float)` – sets Custom Model Data via a float value.
- **Number Formatting (Euro)**
  - `Double.formatEuro()` → `10,000.00 €`
  - `Double.formatEuroWithoutSymbol()` → `10,000.00`

## 📦 Installation
**Maven**
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.notKolja</groupId>
        <artifactId>InjectLib</artifactId>
        <version>0.1.1</version>
    </dependency>
</dependencies>
```
**Gradle Kotlin DSL**
```kotlin
repositories {
    maven("https://jitpack.io")
}
dependencies {
    implementation("com.github.notKolja:InjectLib:0.1.1")
}
```
**Gradle Groovy DSL**
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    implementation 'com.github.notKolja:InjectLib:0.1.1'
}
```

## 📚 Requirements
- Minecraft: Paper/Spigot **1.21+**
- Language: **Kotlin**
- Java Version: **21+**

## ⚠️ Note (Alpha)
InjectLib is currently in **Alpha**:
- API may change
- Not recommended for production use
- Tests and documentation are continuously being expanded

## 🤝 Contributing
1. Report issues: [Issues](https://github.com/notKolja/InjectLib/issues)
2. Discuss ideas: [Discussions](https://github.com/notKolja/InjectLib/discussions)
3. Contribute code: Pull requests welcome!

## 📜 License
Released under the [MIT License](https://github.com/notKolja/InjectLib/blob/master/LICENSE).

---
*Made with ❤️ for the Minecraft plugin community.*
