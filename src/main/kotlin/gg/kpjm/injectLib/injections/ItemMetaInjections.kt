package gg.kpjm.injectLib.injections

import net.kyori.adventure.text.minimessage.MiniMessage
import org.bukkit.Color
import org.bukkit.inventory.meta.ItemMeta
import org.jetbrains.annotations.ApiStatus

@ApiStatus.Experimental
class ItemMetaInjections {

    companion object {

        /**
         * Parses the provided MiniMessage string and applies it as the display
         * name of this item meta.
         *
         * @param s MiniMessage string to deserialize.
         */
        fun ItemMeta.setMiniMessageDisplayName(s: String) {
            this.displayName(MiniMessage.miniMessage().deserialize(s))
        }

        /**
         * Replaces the custom model data with a single float value.
         *
         * @param f Float to store in the custom model data component.
         */
        fun ItemMeta.setCustomModelData(f: Float) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.floats = listOf(f)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * Replaces the custom model data with a single string value.
         *
         * @param s String to store in the custom model data component.
         */
        fun ItemMeta.setCustomModelData(s: String) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.strings = listOf(s)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * Replaces the custom model data with a single color value.
         *
         * @param c Color to store in the custom model data component.
         */
        fun ItemMeta.setCustomModelData(c: Color) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.colors = listOf(c)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * Replaces the custom model data with a single boolean flag.
         *
         * @param b Boolean flag to store in the custom model data component.
         */
        fun ItemMeta.setCustomModelData(b: Boolean) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.flags = listOf(b)
            this.setCustomModelDataComponent(modelDataComponent)
        }

        /**
         * Determines whether this item meta contains any custom model data.
         */
        fun ItemMeta.hasCustomModelData(): Boolean {
            return hasCustomModelDataComponent()
        }

        /**
         * Checks if the custom model data contains the specified float value.
         *
         * @param f Float value to look for.
         */
        fun ItemMeta.hasCustomModelData(f: Float): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.floats.contains(f)
        }

        /**
         * Checks if the custom model data contains the specified string value.
         *
         * @param s String value to look for.
         */
        fun ItemMeta.hasCustomModelData(s: String): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.strings.contains(s)
        }

        /**
         * Checks if the custom model data contains the specified color value.
         *
         * @param c Color value to look for.
         */
        fun ItemMeta.hasCustomModelData(c: Color): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.colors.contains(c)
        }

        /**
         * Checks if the custom model data contains the specified boolean flag.
         *
         * @param b Boolean flag to look for.
         */
        fun ItemMeta.hasCustomModelData(b: Boolean): Boolean {
            val modelDataComponent = this.customModelDataComponent
            return modelDataComponent.flags.contains(b)
        }

        fun ItemMeta.customModelDataFloat(): Float {
            if (hasCustomModelDataComponent()) {
                val modelDataComponent = this.customModelDataComponent
                return modelDataComponent.floats[0]
            }
            return 0f
        }
    }

}
