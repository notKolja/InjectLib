package gg.kpjm.injectLib.injections

import gg.kpjm.injectLib.InjectLib.Companion.prefix
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.title.TitlePart
import org.bukkit.entity.Player

class PlayerInjections {

    companion object {

        /**
         * Sends a message to the player in MiniMessage format
         */
        fun Player.sendMiniMessage(s: String) {
            sendMessage(MiniMessage.miniMessage().deserialize(s))
        }

        /**
         * Sends a message to the player in MiniMessage format with the prefix
         */
        fun Player.sendMiniMessageWithPrefix(s: String) {
            sendMessage(MiniMessage.miniMessage().deserialize("$prefix $s"))
        }

        /**
         * Sends an actionbar to the player in MiniMessage format
         */
        fun Player.sendMiniMessageActionBar(s: String) {
            sendActionBar(MiniMessage.miniMessage().deserialize(s))
        }

        /**
         * Sends an actionbar to the player in MiniMessage format with the prefix
         */
        fun Player.sendMiniMessageActionBarWithPrefix(s: String) {
            sendActionBar(MiniMessage.miniMessage().deserialize("$prefix $s"))
        }
    }

}