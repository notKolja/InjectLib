package gg.kpjm.injectLib.injections

import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

object InventoryInjections {

    fun Inventory.fillBorder(v1: ItemStack) {
        val size = this.size
        val rows = size / 9

        for (i in 0..8) {
            this.setItem(i, v1)
        }

        for (i in (size - 9) until size) {
            this.setItem(i, v1)
        }

        for (row in 1 until (rows - 1)) {
            this.setItem(row * 9, v1)           // Linke Spalte
            this.setItem(row * 9 + 8, v1)       // Rechte Spalte
        }
    }

}