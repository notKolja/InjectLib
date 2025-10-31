package gg.kpjm.injectLib.injections

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage

class StringInjections {

    companion object {
        fun String.translateLegacy(): Component {
            var message = this

            if (!message.contains("<italic>")) {
                message = "<!italic>$message"
            }

            message = message.replace("(&[bB])".toRegex(), "§b")
                .replace("(&[aA])".toRegex(), "§a")
                .replace("(&[cC])".toRegex(), "§c")
                .replace("(&[eE])".toRegex(), "§e")
                .replace("(&[dD])".toRegex(), "§d")
                .replace("(&[fF])".toRegex(), "§f")
                .replace("(&0)".toRegex(), "§0")
                .replace("(&1)".toRegex(), "§1")
                .replace("(&2)".toRegex(), "§2")
                .replace("(&3)".toRegex(), "§3")
                .replace("(&4)".toRegex(), "§4")
                .replace("(&5)".toRegex(), "§5")
                .replace("(&6)".toRegex(), "§6")
                .replace("(&7)".toRegex(), "§7")
                .replace("(&8)".toRegex(), "§8")
                .replace("(&9)".toRegex(), "§9")


            message = message.replace("§0", "<black>")
                .replace("§1", "<dark_blue>")
                .replace("§2", "<dark_green>")
                .replace("§3", "<dark_aqua>")
                .replace("§4", "<dark_red>")
                .replace("§5", "<dark_purple>")
                .replace("§6", "<gold>")
                .replace("§7", "<gray>")
                .replace("§8", "<dark_gray>")
                .replace("§9", "<blue>")
                .replace("§a", "<green>")
                .replace("§b", "<aqua>")
                .replace("§c", "<red>")
                .replace("§d", "<light_purple>")
                .replace("§e", "<yellow>")
                .replace("§f", "<white>")

            message = message.replace("(&[lL])".toRegex(), "§l")
                .replace("(&[oO])".toRegex(), "§o")
                .replace("(&[kK])".toRegex(), "§k")
                .replace("(&[mM])".toRegex(), "§m")
                .replace("(&[nN])".toRegex(), "§n")
                .replace("(&[rR])".toRegex(), "§r")

            message = message.replace("§l", "<bold>")
                .replace("§o", "<italic>")
                .replace("§n", "<underlined>")
                .replace("§m", "<strikethrough>")
                .replace("§k", "<obfuscated>")
                .replace("§r", "<reset>")

            return MiniMessage.miniMessage().deserialize(message)
        }
    }
}