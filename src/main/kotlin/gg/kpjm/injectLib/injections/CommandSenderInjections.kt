package gg.kpjm.injectLib.injections

import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class CommandSenderInjections {

    fun CommandSender.player(): Player? {
        if (this is Player) return this
        return null
    }
}