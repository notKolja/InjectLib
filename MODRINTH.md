# InjectLib

Eine leichte Kotlin-Bibliothek für **Paper/Spigot 1.21+**, die nützliche Erweiterungen und Hilfsfunktionen für die Plugin-Entwicklung bereitstellt. Ideal, um Boilerplate zu reduzieren und moderne MiniMessage-Texte zu nutzen.

## ✨ Features

- **MiniMessage-Messaging**
  - `Player.sendMiniMessage(text)`
  - `Player.sendMiniMessageWithPrefix(text)`
  - `Player.sendMiniMessageActionBar(text)`
  - `Player.sendMiniMessageActionBarWithPrefix(text)`
  Standardpräfix: `<dark_gray>[<gold>Inject<green>Lib<dark_gray>]`

- **ItemMeta-Erweiterung**
  - `ItemMeta.setCustomModelData(float)` – setzt Custom-Model-Data über einen Float-Wert.

- **Zahlenformatierung (Euro)**
  - `Double.formatEuro()` → `10.000,00 €`
  - `Double.formatEuroWithoutSymbol()` → `10.000,00`

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

## 📚 Voraussetzungen

- Minecraft: Paper/Spigot **1.21+**
- Sprache: **Kotlin**
- Java-Version: **21+**

## ⚠️ Hinweis (Alpha)

InjectLib befindet sich aktuell in **Alpha**:
- API kann sich ändern
- Nicht für produktiven Einsatz empfohlen
- Tests und Dokumentation werden laufend erweitert

## 🤝 Mitwirken

1. Probleme melden: [Issues](https://github.com/notKolja/InjectLib/issues)
2. Ideen diskutieren: [Discussions](https://github.com/notKolja/InjectLib/discussions)
3. Code beitragen: Pull-Requests willkommen!

## 📜 Lizenz

Veröffentlicht unter der [MIT-Lizenz](https://github.com/notKolja/InjectLib/blob/master/LICENSE).

---

*Made with ❤️ for the Minecraft plugin community.*
