package one.devos.nautical.desolatedpastels.client.screens

import com.mojang.blaze3d.systems.RenderSystem
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.entity.player.Inventory
import one.devos.nautical.desolatedpastels.DesolatedPastels.MOD_ID
import one.devos.nautical.desolatedpastels.client.menus.ShardCreatorMenu

class ShardCreatorScreen(menu: ShardCreatorMenu, playerInventory: Inventory, title: Component) :
    AbstractContainerScreen<ShardCreatorMenu>(menu, playerInventory, title) {
    val SHARD_CREATOR_TEXTURE: ResourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, "textures/gui/container/shard_creator_nonfinal.png")
    val SHARD_CREATOR_BURN_PROGRESS_TEXTURE: ResourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, "shard_creator/burn_progress")
    val SHARD_CREATOR_LIT_PROGRESS_TEXTURE: ResourceLocation = ResourceLocation.fromNamespaceAndPath(MOD_ID, "shard_creator/lit_progress")

    override fun render(guiGraphics: GuiGraphics, mouseX: Int, mouseY: Int, partialTick: Float) {
        renderBg(guiGraphics, partialTick, mouseX, mouseY)

        super.render(guiGraphics, mouseX, mouseY, partialTick)
        this.renderTooltip(guiGraphics, mouseX, mouseY)
    }
    override fun renderBg(guiGraphics: GuiGraphics, partialTick: Float, mouseX: Int, mouseY: Int) {
        val x = (this.width - this.imageWidth) / 2
        val y = (this.height - this.imageHeight) / 2

        guiGraphics.blit(SHARD_CREATOR_TEXTURE, x, y, 0, 0, imageWidth, imageHeight)
        guiGraphics.blitSprite(SHARD_CREATOR_BURN_PROGRESS_TEXTURE, 24, 16, 0, 0,x + 112, y + 33, 24, 16)
        guiGraphics.blitSprite(SHARD_CREATOR_LIT_PROGRESS_TEXTURE, 14, 14, 0, 0,x + 81, y + 36, 14, 14)
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f)
    }

    override fun init() {
        super.init()

        titleLabelX = (imageWidth - font.width(title)) / 2
    }
}