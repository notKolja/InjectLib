# InjectLib

A lightweight Kotlin library for **Paper/Spigot 1.21+** that provides essential extensions and utilities to streamline plugin development.

## 🚀 Quick Start

InjectLib reduces boilerplate code and simplifies common Minecraft plugin development tasks with an intuitive API designed specifically for Kotlin.

## 📦 Installation

[![JitPack](https://jitpack.io/v/notKolja/InjectLib.svg)](https://jitpack.io/#notKolja/InjectLib)

### Maven
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
        <version>0.1.0</version>
    </dependency>
</dependencies>
```

### Gradle (Kotlin DSL)
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.notKolja:InjectLib:0.1.0")
}
```

### Gradle (Groovy DSL)
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.notKolja:InjectLib:0.1.0'
}
```

> 📋 **Complete Setup Guide:** For detailed installation instructions and repository configuration, visit our [GitHub repository](https://github.com/notKolja/InjectLib).

## ✨ Features

### 💬 Enhanced Messaging System

InjectLib provides a powerful messaging system with MiniMessage support and customizable prefixes.

#### Default Configuration
- **Default Prefix:** `<dark_gray>[<gold>Inject<green>Lib<dark_gray>]`
- **Customizable:** `InjectLib.prefix = "<gray>[<red>MyPlugin<gray>]"`
- **MiniMessage Support:** Full compatibility with modern text formatting

#### Usage Examples

```kotlin
class MyCommand : CommandExecutor {
    override fun onCommand(
        sender: CommandSender, 
        command: Command, 
        label: String, 
        args: Array<out String>
    ): Boolean {
        if (sender !is Player) return false
        
        when (sender.name) {
            "MrMintet" -> {
                // Send message without prefix
                sender.sendMiniMessage("<red>MrMintet smells like <rainbow>FLOWERS")
            }
            "ProteinPeter" -> {
                // Send message with prefix
                sender.sendMiniMessageWithPrefix("<red>ProteinPeter has <gold>golden hair")
            }
        }
        return true
    }
}
```

#### Available Methods
- `Player.sendMiniMessage(message: String)` - Send formatted message without prefix
- `Player.sendMiniMessageWithPrefix(message: String)` - Send formatted message with prefix
- `Player.sendActionBar(message: String)` - Send action bar message

### 🔧 Utility Functions

#### Number Formatting
Format numeric values with German-style locale formatting, perfect for economy plugins.

```kotlin
val price = 1234.56
val formattedPrice = price.formatToEuroString() // "1.234,56 €"
val withoutSymbol = price.formatToEuroString(stripSymbol = true) // "1.234,56"
```

#### ItemMeta Extensions
Enhanced ItemMeta handling with flexible custom model data assignment.

```kotlin
val item = ItemStack(Material.DIAMOND_SWORD)
item.itemMeta = item.itemMeta?.apply {
    setCustomModelDataFromFloat(1.5f) // Converts float to appropriate integer value
}
```

## 📚 Documentation

### Resources
- **[📖 GitHub Wiki](https://github.com/notKolja/InjectLib/wiki)** - Complete documentation and guides
- **[🔧 API Reference](https://github.com/notKolja/InjectLib/wiki/API)** - Detailed method documentation
- **[🚀 Getting Started](https://github.com/notKolja/InjectLib/wiki/Getting-Started)** - Step-by-step tutorial
- **[💡 Examples](https://github.com/notKolja/InjectLib/wiki/Examples)** - Code samples and use cases

### Requirements
- **Minecraft:** Paper/Spigot 1.21+
- **Language:** Kotlin
- **Java Version:** 21+

## 🤝 Contributing

We welcome contributions! Here's how you can help:

1. **🐛 Report Issues:** Found a bug? [Open an issue](https://github.com/notKolja/InjectLib/issues)
2. **💡 Feature Requests:** Have an idea? [Start a discussion](https://github.com/notKolja/InjectLib/discussions)
3. **🔧 Pull Requests:** Ready to contribute code? [Submit a PR](https://github.com/notKolja/InjectLib/pulls)

### Development Setup
```bash
git clone https://github.com/notKolja/InjectLib.git
cd InjectLib
./gradlew build
```

## 📋 Roadmap

InjectLib is actively developed with exciting features planned:

- **Configuration Management** - YAML/JSON config utilities
- **Database Integration** - SQLite and MySQL helpers  
- **Event System Extensions** - Enhanced event handling
- **GUI Framework** - Inventory GUI builder
- **Permission Management** - Advanced permission utilities

## ⚠️ Alpha Notice

**InjectLib is currently in Alpha development.**

- Breaking changes may occur between versions
- Not recommended for production use yet
- Comprehensive testing is ongoing
- Documentation is being expanded

## 📜 License

This project is licensed under the [MIT License](https://github.com/notKolja/InjectLib/blob/master/LICENSE).

## 🔗 Links

- **[GitHub Repository](https://github.com/notKolja/InjectLib)**
- **[Issue Tracker](https://github.com/notKolja/InjectLib/issues)**
- **[Discussions](https://github.com/notKolja/InjectLib/discussions)**
- **[Releases](https://github.com/notKolja/InjectLib/releases)**

---

**Made with ❤️ for the Minecraft development community**

> *InjectLib helps you build better plugins faster, with less boilerplate and fewer mistakes.*
