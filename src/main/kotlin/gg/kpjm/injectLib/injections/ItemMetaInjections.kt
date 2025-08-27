package gg.kpjm.injectLib.injections

import org.bukkit.inventory.meta.ItemMeta
import org.jetbrains.annotations.ApiStatus

class ItemMetaInjections {

    companion object {

        @ApiStatus.Experimental
        fun ItemMeta.setCustomModelData(f: Float) {
            val modelDataComponent = this.customModelDataComponent
            modelDataComponent.floats = listOf(f)
            this.setCustomModelDataComponent(modelDataComponent)
        }
    }

}