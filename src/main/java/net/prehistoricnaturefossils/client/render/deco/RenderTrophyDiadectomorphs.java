package net.prehistoricnaturefossils.client.render.deco;

import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.client.model.ModelSkeletonTrophyDiadectomorphs;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityTrophyDiadectomorphs;

public class RenderTrophyDiadectomorphs extends TileEntitySpecialRenderer<TileEntityTrophyDiadectomorphs> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diadectomorphs_trophy.png");
    private final ModelSkeletonTrophyDiadectomorphs modelSkeleton;

    public RenderTrophyDiadectomorphs() {
        this.modelSkeleton = new ModelSkeletonTrophyDiadectomorphs();
    }

    @Override
    public void render(TileEntityTrophyDiadectomorphs entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        EnumFacing facing = EnumFacing.UP;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockSlabBase.FACING);
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        this.bindTexture(TEXTURE);

        GlStateManager.enableAlpha();
        ModelSkeletonTrophyDiadectomorphs modelSkeleton = this.modelSkeleton;
        double scale = 0.1F * RenderDisplayWallMount.scaler;

        double offset = 0.14;
        if (facing == EnumFacing.UP) {
            GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
        }
        if (facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
        }
        if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 1F, 0F, 0F);
        }
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 1F, 0F, 0F);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 0F, 1F);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 0F, 0F, 1F);
        }
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        GlStateManager.scale(scale, scale, scale);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);

        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Arrow to show location:
        RenderArrows.showArrows(x, y, z);
    }
}