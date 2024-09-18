package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAltirhinusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer opposablePinkie;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer opposablePinkie2;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r14;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonAltirhinusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -29.0F, -4.7F, 1, 29, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -19.3F, -25.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1047F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.5F, -6.7F, -0.5F, 1, 26, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -19.3F, -25.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.2F, -4.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -19.0F, -4.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 8.5F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -28.3F, -3.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, -4.6F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -0.5F, 0.5926F, -0.2693F, 1, 2, 10, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, -0.5F, -0.9F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 12.7F, 0.1F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0734F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 13.1354F, -1.4811F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.2F, -0.4F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.3229F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, -0.5F, -0.9F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3491F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 12.7F, 0.1F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9425F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 13.1354F, -1.4811F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.2F, -0.4F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1484F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1F, 4.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0876F, 0.0869F, -0.0076F);
        this.tail.cubeList.add(new ModelBox(tail, 19, 48, -0.5F, -0.2234F, 0.2096F, 1, 2, 5, -0.154F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5234F, 5.0096F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 4, -0.5F, 0.3F, -0.1F, 1, 2, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7234F, 14.9096F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.035F, -0.0872F, 0.0031F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.3994F, -0.0349F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.6F, -0.3F, 1, 1, 12, -0.154F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.9994F, 11.8651F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0263F, 0.0872F, 0.0023F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 26, -0.5F, 0.6712F, -0.5996F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0288F, 7.9004F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1222F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 17, -0.5F, 0.6F, 0.3F, 1, 1, 8, -0.154F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.9F, 7.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2288F, 0.1275F, -0.0296F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 17, -0.5F, -0.4F, 0.0F, 1, 1, 10, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -4.8F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.1747F, -0.043F, 0.0076F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8199F, -11.612F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2007F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 11, -0.5F, 0.7514F, 0.0985F, 1, 2, 6, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.1801F, 3.088F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 2, -0.5F, 0.3836F, -8.9828F, 1, 2, 6, -0.154F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.2199F, -11.712F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3406F, -0.0411F, -0.0146F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.4F, -6.5F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3752F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 29, -0.5F, 0.621F, 0.2311F, 1, 2, 7, -0.154F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.6F, 9.7F, -7.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.3927F, 0.0F, -0.1745F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.2F, 7.5F, 1.3F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2289F, 0.5701F, 0.0983F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.1523F, 7.8157F, -0.6682F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2431F, 0.3063F, 0.2431F);


        this.opposablePinkie = new ModelRenderer(this);
        this.opposablePinkie.setRotationPoint(0.0294F, 0.3F, 1.749F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 1.1781F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.6F, 9.7F, -7.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3054F, 0.0F, 0.1745F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.2F, 7.5F, 1.3F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7344F, -0.4728F, 0.1272F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.1523F, 7.8157F, -0.6682F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.303F, -0.2472F, -0.4615F);


        this.opposablePinkie2 = new ModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(-0.0294F, 0.3F, 1.749F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 1.1781F, 0.0F, 0.0F);


        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.5F, 2.557F, -5.9557F);
        this.chest.addChild(neck5);
        this.setRotateAngle(neck5, -0.1839F, 0.0858F, -0.0159F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.7F, -3.4F);
        this.neck5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5411F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 55, -1.0F, 0.5404F, -0.4446F, 1, 1, 5, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(-0.5F, 2.043F, -3.4443F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, 0.2452F, -0.0847F, -0.0212F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.8132F, -4.2827F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3142F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 47, -0.5F, 0.5025F, -0.7124F, 1, 1, 6, -0.154F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.7132F, -4.4827F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.3765F, 0.0812F, -0.0321F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -2.046F, -2.9785F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5061F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 55, -1.0F, 0.7067F, -0.0262F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.5975F, -3.0619F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1262F, 0.1354F, 0.0265F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.7658F, -2.407F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 66, -0.5F, 0.6337F, 0.2234F, 1, 1, 3, -0.154F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5379F, -2.5912F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.1309F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.5762F, 0.0414F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 55, -1.0F, -0.2156F, -2.8221F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2721F, -2.0158F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4521F, -0.0449F, 0.0749F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7513F, -0.1653F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3056F, -0.0016F, 0.0113F);

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
