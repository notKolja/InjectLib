package gg.kpjm.injectLib.injections

import gg.kpjm.injectLib.InjectLib.Companion.plugin
import org.bukkit.Server
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class ServerInjections {

    companion object {
        fun Server.addListener(
            listener: Listener
        ) {
            if (plugin != null) {
                this.pluginManager.registerEvents(listener, plugin!!)
            } else {
                logger.severe("plugin is null")
            }
        }
    }
}