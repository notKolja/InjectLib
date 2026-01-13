package gg.kpjm.injectLib.injections

import gg.kpjm.injectLib.InjectLib.Companion.prefix
import io.papermc.paper.entity.TeleportFlag
import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Location
import org.bukkit.entity.Player

class PlayerInjections {

    companion object {

        /**
         * Sends a chat message parsed from a MiniMessage string.
         *
         * @param s MiniMessage string to send.
         */
        fun Player.sendMiniMessage(s: String) {
            sendMessage(MiniMessage.miniMessage().deserialize(s))
        }

        /**
         * Sends a chat message with the plugin prefix parsed from a MiniMessage string.
         *
         * @param s MiniMessage string to send after the prefix.
         */
        fun Player.sendMiniMessageWithPrefix(s: String) {
            sendMessage(MiniMessage.miniMessage().deserialize("$prefix$s"))
        }

        /**
         * Displays an action bar message parsed from a MiniMessage string.
         *
         * @param s MiniMessage string to display.
         */
        fun Player.sendMiniMessageActionBar(s: String) {
            sendActionBar(MiniMessage.miniMessage().deserialize(s))
        }

        /**
         * Displays an action bar message with the plugin prefix parsed from a MiniMessage string.
         *
         * @param s MiniMessage string to display after the prefix.
         */
        fun Player.sendMiniMessageActionBarWithPrefix(s: String) {
            sendActionBar(MiniMessage.miniMessage().deserialize("$prefix $s"))
        }

        fun Player.teleportWithPassengers(loc: Location) {
            teleport(loc, TeleportFlag.EntityState.RETAIN_PASSENGERS)
        }

        fun Player.teleportWithVehicles(loc: Location) {
            teleport(loc, TeleportFlag.EntityState.RETAIN_VEHICLE)
        }

        fun Player.teleportOpenInventory(loc: Location) {
            teleport(loc, TeleportFlag.EntityState.RETAIN_OPEN_INVENTORY)
        }
    }

}
