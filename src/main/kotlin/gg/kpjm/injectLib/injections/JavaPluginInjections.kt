package gg.kpjm.injectLib.injections

import io.papermc.paper.command.brigadier.BasicCommand
import io.papermc.paper.command.brigadier.Commands
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.event.Listener
import org.bukkit.inventory.Inventory
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

        fun JavaPlugin.addPaperCommand(
            name: String,
            description: String = "",
            aliases: List<String> = emptyList(),
            permission: String? = null,
            command: BasicCommand
        ) {
            lifecycleManager.registerEventHandler(LifecycleEvents.COMMANDS) { event ->
                event.registrar().register(name, description, aliases, command).also { registered ->
                    if (permission != null) {

                    }
                }
            }
        }

    }
}