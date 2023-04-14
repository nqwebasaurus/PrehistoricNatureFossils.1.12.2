package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCladoselache extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer jaw;
    private final ModelRenderer head;
    private final ModelRenderer body1;
    private final ModelRenderer gillR_r1;
    private final ModelRenderer body1_2_r1;
    private final ModelRenderer gillL_r1;
    private final ModelRenderer body2;
    private final ModelRenderer pectoralfinL;
    private final ModelRenderer pectoralfinR;
    private final ModelRenderer body3;
    private final ModelRenderer pelvicfinL;
    private final ModelRenderer pelvicfinR;
    private final ModelRenderer body4;
    private final ModelRenderer body5;
    private final ModelRenderer body6;
    private final ModelRenderer caudalfin;
    private final ModelRenderer caudalfinD_r1;
    private final ModelRenderer caudalfinU_r1;

    public ModelSkeletonCladoselache() {
        this.textureWidth = 176;
        this.textureHeight = 176;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(9.4926F, -0.5F, 35.7689F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.3614F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 59, -10.9F, -0.5F, -8.0F, 13, 1, 18, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(5.1835F, -0.5F, 27.8802F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7069F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -9.2F, -0.5F, -2.2F, 13, 1, 13, -0.002F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-12.0836F, -0.5F, -23.229F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0524F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.0579F, -0.5F, -3.6865F, 25, 1, 57, 0.002F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(6.3F, -8.1F, -3.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.4363F, -3.1416F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.0F, -18.0F);
        this.body.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 74, 60, -2.0F, -1.8F, -5.5F, 4, 1, 6, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.0F, -18.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 53, 59, -2.5F, -1.0F, -6.0F, 5, 0, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 60, 66, -1.5F, -1.05F, -6.9F, 3, 0, 7, 0.0F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -7.0F, -18.0F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 48, -2.5F, 0.1F, 0.0F, 5, 0, 6, 0.0F, false));

        this.gillR_r1 = new ModelRenderer(this);
        this.gillR_r1.setRotationPoint(0.0F, 7.1F, 2.0F);
        this.body1.addChild(gillR_r1);
        this.setRotateAngle(gillR_r1, 0.0F, -0.0436F, 0.0F);
        this.gillR_r1.cubeList.add(new ModelBox(gillR_r1, 40, 5, -2.75F, -7.001F, -1.75F, 1, 0, 6, 0.0F, false));

        this.body1_2_r1 = new ModelRenderer(this);
        this.body1_2_r1.setRotationPoint(0.0F, 7.0F, 2.0F);
        this.body1.addChild(body1_2_r1);
        this.setRotateAngle(body1_2_r1, -0.0873F, 0.0F, 0.0F);
        this.body1_2_r1.cubeList.add(new ModelBox(body1_2_r1, 57, 74, -2.0F, -7.95F, -2.0F, 4, 1, 6, 0.0F, false));

        this.gillL_r1 = new ModelRenderer(this);
        this.gillL_r1.setRotationPoint(0.0F, 7.1F, 2.0F);
        this.body1.addChild(gillL_r1);
        this.setRotateAngle(gillL_r1, 0.0F, 0.0436F, 0.0F);
        this.gillL_r1.cubeList.add(new ModelBox(gillL_r1, 42, 25, 1.75F, -7.001F, -1.75F, 1, 0, 6, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.1745F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 15, -3.0F, 0.0F, 0.0F, 6, 0, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 28, -2.5F, -0.75F, 0.5F, 5, 1, 11, 0.0F, false));

        this.pectoralfinL = new ModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.0F, 2.0F, 2.0F);
        this.body2.addChild(pectoralfinL);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 41, 0.0F, -2.0F, -3.0F, 7, 0, 6, 0.0F, false));

        this.pectoralfinR = new ModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.0F, 2.0F, 2.0F);
        this.body2.addChild(pectoralfinR);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 27, 38, -7.0F, -2.0F, -3.0F, 7, 0, 6, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.2182F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 25, 15, -3.0F, -0.01F, -1.0F, 6, 0, 9, 0.0F, false));

        this.pelvicfinL = new ModelRenderer(this);
        this.pelvicfinL.setRotationPoint(3.0F, 2.0F, 7.0F);
        this.body3.addChild(pelvicfinL);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 38, 45, -0.5F, -2.03F, -1.5F, 3, 0, 4, 0.0F, false));

        this.pelvicfinR = new ModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-3.0F, 2.0F, 7.0F);
        this.body3.addChild(pelvicfinR);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 42, 32, -2.5F, -2.04F, -1.5F, 3, 0, 4, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.1309F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 22, 28, -2.5F, 0.0F, -1.0F, 5, 0, 9, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 0.0873F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 20, 45, -2.5F, -0.01F, -1.0F, 5, 0, 7, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 5.2F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0F, 0.2182F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 40, 0, -2.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 72, 74, -2.5F, -0.03F, 0.0F, 5, 0, 5, 0.0F, false));

        this.caudalfin = new ModelRenderer(this);
        this.caudalfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body6.addChild(caudalfin);
        this.setRotateAngle(caudalfin, 0.0F, 0.0F, 1.5708F);
        this.caudalfin.cubeList.add(new ModelBox(caudalfin, 0, 0, 0.0F, -2.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.caudalfinD_r1 = new ModelRenderer(this);
        this.caudalfinD_r1.setRotationPoint(0.0F, 7.0F, -42.0F);
        this.caudalfin.addChild(caudalfinD_r1);
        this.setRotateAngle(caudalfinD_r1, 0.5236F, 0.0F, 0.0F);
        this.caudalfinD_r1.cubeList.add(new ModelBox(caudalfinD_r1, 45, 59, -0.02F, 16.0F, 39.0F, 0, 9, 7, 0.0F, false));

        this.caudalfinU_r1 = new ModelRenderer(this);
        this.caudalfinU_r1.setRotationPoint(0.0F, 7.0F, -42.0F);
        this.caudalfin.addChild(caudalfinU_r1);
        this.setRotateAngle(caudalfinU_r1, -0.5236F, 0.0F, 0.0F);
        this.caudalfinU_r1.cubeList.add(new ModelBox(caudalfinU_r1, 0, 59, -0.001F, -37.0F, 32.0F, 0, 9, 7, 0.0F, false));

    }

    public void renderAll(float f) {
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
