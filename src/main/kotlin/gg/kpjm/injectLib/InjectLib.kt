package gg.kpjm.injectLib

import org.bukkit.plugin.java.JavaPlugin

class InjectLib : JavaPlugin() {

    companion object {
        private val prefixes = mutableMapOf<JavaPlugin, String>()

        var plugin: JavaPlugin? = null
            set(value) {
                field = value
                if (value != null && !prefixes.containsKey(value)) {
                    prefixes[value] = "<gray>» " // default
                }
            }

        var prefix: String
            get() = plugin?.let { prefixes[it] } ?: "<gray>» "
            set(value) {
                plugin?.let { prefixes[it] = value }
            }
    }

    override fun onEnable() {
    }

    override fun onDisable() {
    }
}
