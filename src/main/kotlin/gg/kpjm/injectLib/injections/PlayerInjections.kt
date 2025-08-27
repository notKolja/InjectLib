package gg.kpjm.injectLib.injections

import gg.kpjm.injectLib.InjectLib.Companion.prefix
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.entity.Player

class PlayerInjections {

    companion object {
        fun Player.sendMiniMessage(s: String) {
            sendMessage(MiniMessage.miniMessage().deserialize(s))
        }

        fun Player.sendMiniMessageWithPrefix(s: String) {
            sendMessage(MiniMessage.miniMessage().deserialize("$prefix $s"))
        }
    }

}