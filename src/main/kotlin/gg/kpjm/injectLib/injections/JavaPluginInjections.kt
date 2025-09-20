package gg.kpjm.injectLib.injections

import org.bukkit.command.CommandExecutor
import org.bukkit.command.TabCompleter
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class JavaPluginInjections {
    companion object {
        fun JavaPlugin.addCommand(
            commandName: String,
            executor: CommandExecutor,
            tabCompleter: TabCompleter? = null
        ) {
            val command = this.getCommand(commandName)!!

            command.setExecutor(executor)

            if (tabCompleter != null) {
                command.tabCompleter = tabCompleter
            }


        }
    }
}