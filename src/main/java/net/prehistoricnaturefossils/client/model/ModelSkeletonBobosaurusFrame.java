package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBobosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonBobosaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -13.0F, 7.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1687F, 0.045F, 0.258F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0955F, -0.793F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 0.2007F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 39, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0955F, -0.793F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.7715F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 42, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.7F, -4.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2007F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -0.5F, 0.6F, 0.2F, 1, 1, 5, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.3054F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 35, -0.5F, 0.3F, 0.2F, 1, 1, 6, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.9F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.2618F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4F, -0.1F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 41, -0.5F, 0.7F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6F, 4.6F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0903F, 0.2608F, -0.0233F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0349F, -0.0015F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 43, -0.5F, 0.3F, -0.2F, 1, 1, 4, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1651F, 3.9985F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.2618F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, -0.0348F, 0.003F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 30, -0.4F, 0.5791F, -0.6005F, 1, 1, 7, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.6F, 6.8F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.2618F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 30, -0.4F, 0.4695F, -0.7939F, 1, 1, 5, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.5F, 0.9F, -0.2F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.5404F, 0.1857F, -0.2912F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.0F, 0.2F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.0602F, -0.1639F, 0.354F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(4.8F, 0.0F, 1.4F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1332F, -0.2261F, 0.5387F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.5F, 0.9F, -0.2F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.4331F, 0.0552F, 0.3176F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.0F, 0.2F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.0602F, 0.1639F, -0.354F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-4.8F, 0.0F, 1.4F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1022F, 0.2415F, -0.4051F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, -0.1309F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 38, 8, -0.5F, -1.4F, -12.6F, 1, 1, 5, -0.15F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.7F, -7.5F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2094F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 9, -0.5F, 0.3F, -0.3F, 1, 1, 9, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.7F, -12.3F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, -0.1309F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.5646F, -3.6817F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.5708F, -0.2443F, 1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 29, -0.8F, -0.5F, -4.5F, 1, 1, 9, -0.15F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.6537F, -4.4075F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.3265F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 35, -0.5F, -0.5F, -0.1F, 1, 1, 3, -0.16F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.7F, -6.8F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 31, 0.0F, 0.3F, -0.1F, 1, 1, 7, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.1F, 4.3F, -3.7F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0381F, -0.1704F, 0.8694F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(9.8831F, -0.1219F, -0.0762F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0329F, -0.0902F, -0.3506F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(1.7385F, 0.0F, 0.7833F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.3054F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.1F, 4.3F, -3.7F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0456F, 0.1685F, -0.8252F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-9.8831F, -0.1219F, -0.0762F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0208F, 0.0937F, 0.2191F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.7857F, -0.4309F, 0.7833F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.3054F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.7F, -7.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0436F, -0.3491F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.3F, -3.8F);
        this.neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 44, -0.3F, 0.35F, -0.5F, 1, 1, 5, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.3F, -3.7F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1603F, -0.2648F, -0.039F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.2F, -3.1F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 48, 0.1F, 0.3048F, 0.0437F, 1, 1, 3, -0.15F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.2F, -5.2F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0698F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 34, 0.1F, 0.1095F, -0.3631F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1F, -5.3F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2835F, -0.2275F, -0.0669F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.2F, -4.0F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 46, -0.5F, 0.3011F, 0.2209F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0833F, -0.1752F, 0.0154F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7505F, 0.0F, 0.0F);

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
