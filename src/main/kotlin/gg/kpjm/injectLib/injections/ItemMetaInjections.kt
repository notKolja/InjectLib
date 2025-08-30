package gg.kpjm.injectLib.injections

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Color
import org.bukkit.inventory.meta.ItemMeta
import org.jetbrains.annotations.ApiStatus

@ApiStatus.Experimental
class ItemMetaInjections {

    companion object {

        /**
         * sets the displayname with minimessage
         */
        fun ItemMeta.setMiniMessageDisplayName(s: String) {
            this.displayName(MiniMessage.miniMessage().deserialize(s))
        }

        /**
         * adds a float to the CustomModelData of a ItemMeta
         * float
         */
        fun ItemMeta.setCustomModelData(f: Float) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.floats = listOf(f)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * adds a string to the CustomModelData of a ItemMeta
         * string
         */
        fun ItemMeta.setCustomModelData(s: String) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.strings = listOf(s)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * adds a color to the CustomModelData of a ItemMeta
         * color
         */
        fun ItemMeta.setCustomModelData(c: Color) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.colors = listOf(c)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * adds a flag to the CustomModelData of a ItemMeta
         * boolean
         */
        fun ItemMeta.setCustomModelData(b: Boolean) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.flags = listOf(b)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * checks if the ItemMeta has a CustomModelData
         */
        fun ItemMeta.hasCustomModelData(): Boolean {
            return hasCustomModelDataComponent()
        }


        /**
         * checks if the ItemMeta has a specific CustomModelData
         * float
         */
        fun ItemMeta.hasCustomModelData(f: Float): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.floats.contains(f)
        }

        /**
         * checks if the ItemMeta has a specific CustomModelData
         * string
         */
        fun ItemMeta.hasCustomModelData(s: String): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.strings.contains(s)
        }

        /**
         * checks if the ItemMeta has a specific CustomModelData
         * color
         */
        fun ItemMeta.hasCustomModelData(c: Color): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.colors.contains(c)
        }

        /**
         * checks if the ItemMeta has a specific CustomModelData
         * boolean
         */
        fun ItemMeta.hasCustomModelData(b: Boolean): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.flags.contains(b)
        }
    }

}