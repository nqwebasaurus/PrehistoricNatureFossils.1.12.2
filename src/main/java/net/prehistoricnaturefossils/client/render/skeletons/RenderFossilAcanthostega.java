package net.prehistoricnaturefossils.client.render.skeletons;

import net.lepidodendron.entity.render.entity.RenderAcanthostega;
import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.client.model.ModelSkeletonAcanthostega;
import net.prehistoricnaturefossils.client.render.general.RenderArrows;
import net.prehistoricnaturefossils.tile.TileEntityFossilAcanthostega;

public class RenderFossilAcanthostega extends TileEntitySpecialRenderer<TileEntityFossilAcanthostega> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/acanthostega_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/acanthostega_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/acanthostega_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/acanthostega_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(PrehistoricNatureFossils.MODID + ":textures/skeletons/acanthostega_stage5.png");

    private final ModelSkeletonAcanthostega modelSkeleton;

    public RenderFossilAcanthostega() {
        this.modelSkeleton = new ModelSkeletonAcanthostega();
    }

    @Override
    public void render(TileEntityFossilAcanthostega entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int currentStage = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
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
        ModelSkeletonAcanthostega modelSkeleton = this.modelSkeleton;
        double scale = RenderAcanthostega.getScaler() * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 0.38, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Arrow to show location:
        RenderArrows.showArrows(x, y, z);
    }
}