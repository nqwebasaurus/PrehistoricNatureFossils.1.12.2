package net.prehistoricnaturefossils.client.render.slabs;

import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.client.model.ModelSkeletonCrinoidRaft;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilCrinoidRaft;

public class RenderFossilCrinoidRaft extends TileEntitySpecialRenderer<TileEntityFossilCrinoidRaft> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_01.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_02.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_03.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_04.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_05.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_06.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_07.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_08.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_09.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_10.png");
    private static final ResourceLocation TEXTURE11 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_11.png");
    private static final ResourceLocation TEXTURE12 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_12.png");
    private static final ResourceLocation TEXTURE13 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_13.png");
    private static final ResourceLocation TEXTURE14 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_14.png");
    private static final ResourceLocation TEXTURE15 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_15.png");
    private static final ResourceLocation TEXTURE16 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_16.png");
    private static final ResourceLocation TEXTURE17 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_17.png");
    private static final ResourceLocation TEXTURE18 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_18.png");
    private static final ResourceLocation TEXTURE19 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_19.png");
    private static final ResourceLocation TEXTURE20 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_20.png");
    private static final ResourceLocation TEXTURE21 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_21.png");
    private static final ResourceLocation TEXTURE22 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_22.png");
    private static final ResourceLocation TEXTURE23 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_23.png");
    private static final ResourceLocation TEXTURE24 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/crinoid_raft_fossil_24.png");
    private final ModelSkeletonCrinoidRaft modelSkeleton;

    public RenderFossilCrinoidRaft() {
        this.modelSkeleton = new ModelSkeletonCrinoidRaft();
    }

    @Override
    public void render(TileEntityFossilCrinoidRaft entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int currentStage = 0;
        EnumFacing facing = EnumFacing.UP;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockSlabBase.FACING);
        }
        GlStateManager.pushMatrix();
        //GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        switch (currentStage) {

            case 1: default:
                this.bindTexture(TEXTURE1);
                break;
            case 2:
                this.bindTexture(TEXTURE2);
                break;
            case 3:
                this.bindTexture(TEXTURE3);
                break;
            case 4:
                this.bindTexture(TEXTURE4);
                break;
            case 5:
                this.bindTexture(TEXTURE5);
                break;
            case 6:
                this.bindTexture(TEXTURE6);
                break;
            case 7:
                this.bindTexture(TEXTURE7);
                break;
            case 8:
                this.bindTexture(TEXTURE8);
                break;
            case 9:
                this.bindTexture(TEXTURE9);
                break;
            case 10:
                this.bindTexture(TEXTURE10);
                break;
            case 11:
                this.bindTexture(TEXTURE11);
                break;
            case 12:
                this.bindTexture(TEXTURE12);
                break;
            case 13:
                this.bindTexture(TEXTURE13);
                break;
            case 14:
                this.bindTexture(TEXTURE14);
                break;
            case 15:
                this.bindTexture(TEXTURE15);
                break;
            case 16:
                this.bindTexture(TEXTURE16);
                break;
            case 17:
                this.bindTexture(TEXTURE17);
                break;
            case 18:
                this.bindTexture(TEXTURE18);
                break;
            case 19:
                this.bindTexture(TEXTURE19);
                break;
            case 20:
                this.bindTexture(TEXTURE20);
                break;
            case 21:
                this.bindTexture(TEXTURE21);
                break;
            case 22:
                this.bindTexture(TEXTURE22);
                break;
            case 23:
                this.bindTexture(TEXTURE23);
                break;
            case 24:
                this.bindTexture(TEXTURE24);
                break;

        }

        GlStateManager.enableAlpha();
        ModelSkeletonCrinoidRaft modelSkeleton = this.modelSkeleton;
        double scale = 0.75F * RenderDisplayWallMount.scaler;

        double offset = 1.035;
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