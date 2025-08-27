package gg.kpjm.injectLib

import org.bukkit.plugin.java.JavaPlugin

class InjectLib : JavaPlugin() {

    companion object {
        lateinit var prefix: String
            private set
    }

    override fun onEnable() {
        saveDefaultConfig()
        reloadConfig()

        prefix = config.getString("prefix") ?: "<dark_gray>[<gold>Inject<green>Lib<dark_gray>]"
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
