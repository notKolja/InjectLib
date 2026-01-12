package gg.kpjm.injectLib

import org.bukkit.plugin.java.JavaPlugin

class InjectLib : JavaPlugin() {

    companion object {
        @JvmStatic
        var prefix: String = "<dark_gray>[<gold>Inject<green>Lib<dark_gray>]"
        @JvmStatic
        var plugin: JavaPlugin? = null
    }

    override fun onEnable() {
    }

    override fun onDisable() {
    }
}
