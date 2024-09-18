package net.prehistoricnaturefossils.client.render.skeletons;


import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.client.model.ModelSkeletonDiademodon;
import net.prehistoricnaturefossils.client.model.ModelSkeletonDiademodonFrame;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilDiademodon;

public class RenderFossilDiademodon extends TileEntitySpecialRenderer<TileEntityFossilDiademodon> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diademodon_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diademodon_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diademodon_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diademodon_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diademodon_stage5.png");
    private static final ResourceLocation FRAME = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/diademodon_frame.png");

    private final ModelSkeletonDiademodon modelSkeleton;
    private final ModelSkeletonDiademodonFrame modelSkeletonFrame;

    public RenderFossilDiademodon() {
        this.modelSkeletonFrame = new ModelSkeletonDiademodonFrame();
        this.modelSkeleton = new ModelSkeletonDiademodon();
    }

    @Override
    public void render(TileEntityFossilDiademodon entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int currentStage = 0;
        boolean frame = false;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
            if (entity.getTileData().hasKey("frame") && PrehistoricNatureFossils.doFrames) {
                frame = entity.getTileData().getBoolean("frame");
            }
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
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
           
        }

        GlStateManager.enableAlpha();
        ModelSkeletonDiademodon modelSkeleton = this.modelSkeleton;
        double scale = 0.4F * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 0.6, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        
        //Frame:
        if (frame) {
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            this.bindTexture(FRAME);
            GlStateManager.enableAlpha();
            ModelSkeletonDiademodonFrame modelSkeletonFrame = this.modelSkeletonFrame;
            scale = 0.4F * RenderDisplayWallMount.scaler;
            GlStateManager.translate(x + 0.5, y + 0.6, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
            modelSkeletonFrame.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }

        //Arrow to show location:
        RenderArrows.showArrows(x, y, z);
    }
}