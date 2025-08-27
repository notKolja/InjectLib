package gg.kpjm.injectLib

import org.bukkit.plugin.java.JavaPlugin

class InjectLib : JavaPlugin() {

    companion object {
        @JvmStatic
        var prefix: String = "<dark_gray>[<gold>Inject<green>Lib<dark_gray>]"
    }

    override fun onEnable() {
        prefix = "<dark_gray>[<gold>Inject<green>Lib<dark_gray>]"
    }

    override fun onDisable() {

    }
}
