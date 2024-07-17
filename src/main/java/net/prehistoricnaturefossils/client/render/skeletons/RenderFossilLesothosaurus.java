package net.prehistoricnaturefossils.client.render.skeletons;


import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.client.model.ModelSkeletonLesothosaurus;
import net.prehistoricnaturefossils.client.model.ModelSkeletonLesothosaurusFrame;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilLesothosaurus;

public class RenderFossilLesothosaurus extends TileEntitySpecialRenderer<TileEntityFossilLesothosaurus> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/lesothosaurus_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/lesothosaurus_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/lesothosaurus_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/lesothosaurus_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/lesothosaurus_stage5.png");
    private static final ResourceLocation FRAME = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/lesothosaurus_frame.png");

    private final ModelSkeletonLesothosaurus modelSkeleton;
    private final ModelSkeletonLesothosaurusFrame modelSkeletonFrame;

    public RenderFossilLesothosaurus() {
        this.modelSkeletonFrame = new ModelSkeletonLesothosaurusFrame();
        this.modelSkeleton = new ModelSkeletonLesothosaurus();
    }

    @Override
    public void render(TileEntityFossilLesothosaurus entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
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
        ModelSkeletonLesothosaurus modelSkeleton = this.modelSkeleton;
        double scale = 0.45F * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 0.68, z + 0.5);
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
            ModelSkeletonLesothosaurusFrame modelSkeletonFrame = this.modelSkeletonFrame;
            scale = 0.45F * RenderDisplayWallMount.scaler;
            GlStateManager.translate(x + 0.5, y + 0.68, z + 0.5);
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