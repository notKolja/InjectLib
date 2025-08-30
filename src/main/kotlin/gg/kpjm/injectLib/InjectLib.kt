package gg.kpjm.injectLib

import gg.kpjm.injectLib.injections.DoubleInjections.Companion.formatCurrency
import gg.kpjm.injectLib.injections.IntegerInjections.Companion.translateRoman
import org.bukkit.inventory.meta.ItemMeta
import org.bukkit.plugin.java.JavaPlugin
import java.util.Locale

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
