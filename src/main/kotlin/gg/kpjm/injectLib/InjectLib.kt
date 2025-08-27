package gg.kpjm.injectLib

import org.bukkit.plugin.java.JavaPlugin

class InjectLib : JavaPlugin() {

    companion object {
        var prefix = "<dark_gray>[<gold>Inject<green>Lib<dark_gray>]"
    }

    fun setPrefix(s: String) {
        prefix = s
    }

    override fun onEnable() {

    }

    override fun onDisable() {

    }
}
