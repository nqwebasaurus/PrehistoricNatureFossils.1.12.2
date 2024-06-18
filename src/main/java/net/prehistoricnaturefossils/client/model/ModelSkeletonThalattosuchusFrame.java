package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonThalattosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer bone3;
    private final ModelRenderer bone6;
    private final ModelRenderer snout;
    private final ModelRenderer bone4;
    private final ModelRenderer bone16;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Body3;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftUpperLegL;
    private final ModelRenderer leftLowerLegL;
    private final ModelRenderer leftFootL;
    private final ModelRenderer rightUpperLegL;
    private final ModelRenderer rightLowerLegL;
    private final ModelRenderer rightFootL;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftUpperArm;
    private final ModelRenderer rightUpperArm;

    public ModelSkeletonThalattosuchusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 15.0F, -1.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -6.5F, -14.5F);
        this.fossil.addChild(Body);
        this.setRotateAngle(Body, 0.2618F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 53, 40, -0.5F, 0.7F, -0.2F, 1, 3, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, 12.8F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 46, -1.2F, -3.5F, -13.0F, 1, 7, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.2F, -4.5F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0262F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 49, -0.5F, 0.5F, 0.0F, 1, 1, 6, -0.2F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0F, -4.6F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, -0.0873F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 50, -0.5F, 0.7F, -0.6F, 1, 1, 7, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.2F, -5.9F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3927F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.6566F, 0.4903F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.48F, 0.0F, 0.0F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.2432F, -6.5106F);
        this.Lowerjaw.addChild(bone3);
        this.setRotateAngle(bone3, -0.096F, 0.0F, 0.0F);


        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -0.0572F, -5.9598F);
        this.bone3.addChild(bone6);
        this.setRotateAngle(bone6, 0.0175F, 0.0F, 0.0F);


        this.snout = new ModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 1.7566F, -7.0097F);
        this.Head.addChild(snout);
        this.setRotateAngle(snout, -0.0436F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.snout.addChild(bone4);
        this.setRotateAngle(bone4, 0.0873F, 0.0F, 0.0F);


        this.bone16 = new ModelRenderer(this);
        this.bone16.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.Neck.addChild(bone16);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.15F, 1.5F);
        this.Body.addChild(Body2);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.Body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 13, -0.5F, 0.45F, -0.4F, 1, 1, 9, -0.2F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.25F, 8.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.044F, 0.1308F, 0.0057F);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 36, -0.5F, 0.4F, 0.2F, 1, 1, 8, -0.2F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.088F, 0.1304F, 0.0115F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.2F, 0.0F);
        this.Body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 49, -1.0F, 0.65F, -0.2F, 1, 1, 7, -0.2F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.4F, 7.2F);
        this.Body4.addChild(Tail);
        this.setRotateAngle(Tail, 0.0F, -0.1309F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 14, 11, -0.5F, 0.5F, -0.2F, 1, 3, 1, -0.21F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.0F, -12.2F);
        this.Tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -3.0F, 12.0F, 1, 6, 1, -0.2F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 13, -0.5F, 0.7F, -0.7F, 1, 1, 11, -0.2F, false));

        this.leftUpperLegL = new ModelRenderer(this);
        this.leftUpperLegL.setRotationPoint(2.4F, 2.9F, 0.45F);
        this.Tail.addChild(leftUpperLegL);
        this.setRotateAngle(leftUpperLegL, 0.9188F, 0.5632F, -0.6716F);


        this.leftLowerLegL = new ModelRenderer(this);
        this.leftLowerLegL.setRotationPoint(0.2857F, 7.5395F, 0.1403F);
        this.leftUpperLegL.addChild(leftLowerLegL);
        this.setRotateAngle(leftLowerLegL, 0.5459F, -0.3289F, 0.2291F);


        this.leftFootL = new ModelRenderer(this);
        this.leftFootL.setRotationPoint(0.1673F, 2.8998F, 0.589F);
        this.leftLowerLegL.addChild(leftFootL);
        this.setRotateAngle(leftFootL, 0.2618F, 0.0F, -0.2182F);


        this.rightUpperLegL = new ModelRenderer(this);
        this.rightUpperLegL.setRotationPoint(-2.4F, 2.9F, 0.45F);
        this.Tail.addChild(rightUpperLegL);
        this.setRotateAngle(rightUpperLegL, 0.1586F, -0.4132F, 1.1699F);


        this.rightLowerLegL = new ModelRenderer(this);
        this.rightLowerLegL.setRotationPoint(-0.2857F, 7.5395F, 0.1403F);
        this.rightUpperLegL.addChild(rightLowerLegL);
        this.setRotateAngle(rightLowerLegL, 0.503F, 0.3945F, -0.3503F);


        this.rightFootL = new ModelRenderer(this);
        this.rightFootL.setRotationPoint(-0.1673F, 2.8998F, 0.589F);
        this.rightLowerLegL.addChild(rightFootL);
        this.setRotateAngle(rightFootL, 0.2597F, -0.0338F, 0.3447F);


        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.6F, 9.8F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, -0.3054F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.Tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, -0.5F, 0.65F, -0.1F, 1, 1, 11, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 11.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, -0.3927F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0F, -0.3F);
        this.Tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 24, -0.5F, -0.75F, -0.3F, 1, 1, 10, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.1F, 9.7F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, 0.2182F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 6.05F, 3.3F);
        this.Tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.021F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 40, -0.5F, -0.4471F, -0.5608F, 1, 1, 5, -0.2F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.85F, 2.6F);
        this.Tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.2828F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 60, -0.5F, 0.4499F, 0.1459F, 1, 1, 5, -0.2F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.Tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3665F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 58, -0.5F, 0.3892F, -0.4526F, 1, 1, 3, -0.2F, false));

        this.leftUpperArm = new ModelRenderer(this);
        this.leftUpperArm.setRotationPoint(3.6F, 3.35F, 0.05F);
        this.Body.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, -0.0347F, 0.5691F, 0.0179F);


        this.rightUpperArm = new ModelRenderer(this);
        this.rightUpperArm.setRotationPoint(-3.6F, 3.35F, 0.05F);
        this.Body.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, -0.3044F, -0.7151F, -0.2692F);

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
