package gg.kpjm.injectLib

import org.bukkit.plugin.java.JavaPlugin

class InjectLib : JavaPlugin() {

    companion object {
        @JvmStatic
        lateinit var prefix: String
            private set
    }

    override fun onEnable() {
        prefix = "<dark_gray>[<gold>Inject<green>Lib<dark_gray>]"
    }

    override fun onDisable() {

    }
}
