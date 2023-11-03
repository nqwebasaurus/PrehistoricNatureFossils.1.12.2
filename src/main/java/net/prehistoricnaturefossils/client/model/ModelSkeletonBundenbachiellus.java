package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBundenbachiellus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Body;
    private final ModelRenderer ArmL;
    private final ModelRenderer ArmfillamentL1;
    private final ModelRenderer ArmfillamentL2;
    private final ModelRenderer ArmfillamentL3;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ArmfillamentL4;
    private final ModelRenderer ArmfillamentL5;
    private final ModelRenderer ArmfillamentL6;
    private final ModelRenderer HeadlegL;
    private final ModelRenderer HeadlegL3;
    private final ModelRenderer HeadlegL2;
    private final ModelRenderer HeadlegL4;
    private final ModelRenderer legL;
    private final ModelRenderer cube_r3;
    private final ModelRenderer legL13;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Body2;
    private final ModelRenderer legL2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer legL14;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Body3;
    private final ModelRenderer legL3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer legL15;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Body4;
    private final ModelRenderer legL4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer legL16;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Body5;
    private final ModelRenderer legL5;
    private final ModelRenderer cube_r11;
    private final ModelRenderer legL17;
    private final ModelRenderer cube_r12;
    private final ModelRenderer Body6;
    private final ModelRenderer legL6;
    private final ModelRenderer cube_r13;
    private final ModelRenderer legL18;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Body7;
    private final ModelRenderer legL7;
    private final ModelRenderer cube_r15;
    private final ModelRenderer legL19;
    private final ModelRenderer cube_r16;
    private final ModelRenderer Body8;
    private final ModelRenderer legL8;
    private final ModelRenderer cube_r17;
    private final ModelRenderer legL20;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Body9;
    private final ModelRenderer legL9;
    private final ModelRenderer cube_r19;
    private final ModelRenderer legL21;
    private final ModelRenderer cube_r20;
    private final ModelRenderer Body10;
    private final ModelRenderer legL10;
    private final ModelRenderer cube_r21;
    private final ModelRenderer legL22;
    private final ModelRenderer cube_r22;
    private final ModelRenderer Body11;
    private final ModelRenderer legL11;
    private final ModelRenderer cube_r23;
    private final ModelRenderer legL23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Body12;
    private final ModelRenderer legL12;
    private final ModelRenderer cube_r25;
    private final ModelRenderer legL24;
    private final ModelRenderer cube_r26;
    private final ModelRenderer Telson;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;

    public ModelSkeletonBundenbachiellus() {
        this.textureWidth = 180;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-1.0F, 24.0F, -5.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, 1.0F, -2.0F, -14.0F, 15, 2, 44, 0.002F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -1.0F, 6.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 47, -21.5F, -1.0F, -24.0F, 19, 2, 35, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-13.1F, -1.0F, 1.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 0, -5.3358F, -1.0F, -0.1973F, 18, 2, 33, 0.0F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -2.425F, -6.45F);
        this.fossil.addChild(Body);
        this.setRotateAngle(Body, 0.0F, 0.1309F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 17, 72, -2.0F, -0.125F, -1.55F, 4, 0, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 75, 3, -1.5F, 0.125F, -1.45F, 3, 0, 3, 0.0F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(1.0F, -0.325F, -0.8F);
        this.Body.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.0F, 0.829F, 0.0F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 35, 18, 0.0F, 0.35F, -0.5F, 2, 0, 1, 0.0F, false));

        this.ArmfillamentL1 = new ModelRenderer(this);
        this.ArmfillamentL1.setRotationPoint(1.75F, 0.0F, 0.0F);
        this.ArmL.addChild(ArmfillamentL1);
        this.setRotateAngle(ArmfillamentL1, 0.0F, -1.0036F, 0.0F);
        this.ArmfillamentL1.cubeList.add(new ModelBox(ArmfillamentL1, 18, 1, 0.0F, 0.2F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmfillamentL2 = new ModelRenderer(this);
        this.ArmfillamentL2.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.ArmL.addChild(ArmfillamentL2);
        this.setRotateAngle(ArmfillamentL2, 0.0F, -0.2618F, 0.0F);
        this.ArmfillamentL2.cubeList.add(new ModelBox(ArmfillamentL2, 18, 7, 0.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmfillamentL3 = new ModelRenderer(this);
        this.ArmfillamentL3.setRotationPoint(1.75F, 0.5F, 0.0F);
        this.ArmL.addChild(ArmfillamentL3);
        this.setRotateAngle(ArmfillamentL3, 0.0F, -0.7854F, 0.0F);
        this.ArmfillamentL3.cubeList.add(new ModelBox(ArmfillamentL3, 0, 18, 0.0F, -0.2F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-1.0F, -0.325F, -0.8F);
        this.Body.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.0F, -0.829F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 34, 34, -2.0F, 0.35F, -0.5F, 2, 0, 1, 0.0F, false));

        this.ArmfillamentL4 = new ModelRenderer(this);
        this.ArmfillamentL4.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.ArmL2.addChild(ArmfillamentL4);
        this.setRotateAngle(ArmfillamentL4, 0.0F, -0.9599F, 0.0F);
        this.ArmfillamentL4.cubeList.add(new ModelBox(ArmfillamentL4, 0, 12, -6.0F, 0.2F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmfillamentL5 = new ModelRenderer(this);
        this.ArmfillamentL5.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.ArmL2.addChild(ArmfillamentL5);
        this.setRotateAngle(ArmfillamentL5, 0.0F, 0.2618F, 0.0F);
        this.ArmfillamentL5.cubeList.add(new ModelBox(ArmfillamentL5, 0, 6, -6.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmfillamentL6 = new ModelRenderer(this);
        this.ArmfillamentL6.setRotationPoint(-1.75F, 0.5F, 0.0F);
        this.ArmL2.addChild(ArmfillamentL6);
        this.setRotateAngle(ArmfillamentL6, 0.0F, 1.0472F, 0.0F);
        this.ArmfillamentL6.cubeList.add(new ModelBox(ArmfillamentL6, 0, 0, -6.0F, -0.2F, -0.5F, 6, 0, 5, 0.0F, false));

        this.HeadlegL = new ModelRenderer(this);
        this.HeadlegL.setRotationPoint(1.25F, 0.325F, -0.55F);
        this.Body.addChild(HeadlegL);
        this.setRotateAngle(HeadlegL, 0.0F, 0.3054F, 0.0F);
        this.HeadlegL.cubeList.add(new ModelBox(HeadlegL, 34, 31, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.HeadlegL3 = new ModelRenderer(this);
        this.HeadlegL3.setRotationPoint(-1.25F, 0.325F, -0.55F);
        this.Body.addChild(HeadlegL3);
        this.setRotateAngle(HeadlegL3, 0.0F, -0.3054F, 0.0F);
        this.HeadlegL3.cubeList.add(new ModelBox(HeadlegL3, 34, 25, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.HeadlegL2 = new ModelRenderer(this);
        this.HeadlegL2.setRotationPoint(1.25F, 0.225F, -0.05F);
        this.Body.addChild(HeadlegL2);
        this.setRotateAngle(HeadlegL2, 0.0F, 0.0436F, 0.0F);
        this.HeadlegL2.cubeList.add(new ModelBox(HeadlegL2, 34, 28, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.HeadlegL4 = new ModelRenderer(this);
        this.HeadlegL4.setRotationPoint(-1.25F, 0.225F, -0.05F);
        this.Body.addChild(HeadlegL4);
        this.setRotateAngle(HeadlegL4, 0.0F, -0.0436F, 0.0F);
        this.HeadlegL4.cubeList.add(new ModelBox(HeadlegL4, 23, 16, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(1.25F, 0.225F, 0.95F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0436F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 75, 16, 0.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3491F, -0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 75, 13, 0.25F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legL13 = new ModelRenderer(this);
        this.legL13.setRotationPoint(-1.25F, 0.225F, 0.95F);
        this.Body.addChild(legL13);
        this.setRotateAngle(legL13, 0.0F, -0.0436F, 0.0F);
        this.legL13.cubeList.add(new ModelBox(legL13, 75, 10, -4.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL13.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 75, 7, -4.25F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.075F, 1.55F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 33, 85, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 22, 85, -1.5F, 0.2F, 0.45F, 3, 0, 2, -0.01F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0436F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 75, 0, 0.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, -0.0436F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 74, 74, 0.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.legL14 = new ModelRenderer(this);
        this.legL14.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body2.addChild(legL14);
        this.setRotateAngle(legL14, 0.0F, -0.0436F, 0.0F);
        this.legL14.cubeList.add(new ModelBox(legL14, 74, 65, -5.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL14.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0436F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 62, -5.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.0F, -0.0873F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 85, 3, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 85, -1.5F, 0.2F, 0.55F, 3, 0, 2, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0436F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 74, 71, 0.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, -0.0436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 68, 0.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.legL15 = new ModelRenderer(this);
        this.legL15.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body3.addChild(legL15);
        this.setRotateAngle(legL15, 0.0F, -0.0436F, 0.0F);
        this.legL15.cubeList.add(new ModelBox(legL15, 74, 59, -5.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL15.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 56, -5.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0F, -0.1309F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 84, 40, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 84, 37, -1.5F, 0.2F, 0.65F, 3, 0, 2, -0.01F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0436F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 17, 63, 0.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, -0.0436F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 60, 0.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.legL16 = new ModelRenderer(this);
        this.legL16.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body4.addChild(legL16);
        this.setRotateAngle(legL16, 0.0F, -0.0436F, 0.0F);
        this.legL16.cubeList.add(new ModelBox(legL16, 17, 57, -6.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL16.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 54, -6.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.Body5 = new ModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body4.addChild(Body5);
        this.setRotateAngle(Body5, 0.0F, -0.1745F, 0.0F);
        this.Body5.cubeList.add(new ModelBox(Body5, 84, 29, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 84, 26, -1.5F, 0.2F, 0.55F, 3, 0, 2, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0436F, 0.0F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 47, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, -0.0436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 40, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL17 = new ModelRenderer(this);
        this.legL17.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body5.addChild(legL17);
        this.setRotateAngle(legL17, 0.0F, -0.0436F, 0.0F);
        this.legL17.cubeList.add(new ModelBox(legL17, 0, 39, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL17.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1745F, 0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 37, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body6 = new ModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body5.addChild(Body6);
        this.setRotateAngle(Body6, 0.0F, 0.0873F, 0.0F);
        this.Body6.cubeList.add(new ModelBox(Body6, 84, 23, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 84, 20, -1.5F, 0.2F, 0.55F, 3, 0, 2, -0.01F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0436F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 74, 53, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1745F, -0.0436F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 74, 50, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL18 = new ModelRenderer(this);
        this.legL18.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body6.addChild(legL18);
        this.setRotateAngle(legL18, 0.0F, -0.0436F, 0.0F);
        this.legL18.cubeList.add(new ModelBox(legL18, 0, 36, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL18.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1745F, 0.0436F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 34, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body7 = new ModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body6.addChild(Body7);
        this.setRotateAngle(Body7, 0.0F, 0.2182F, 0.0F);
        this.Body7.cubeList.add(new ModelBox(Body7, 83, 78, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body7.cubeList.add(new ModelBox(Body7, 20, 79, -1.5F, 0.2F, 0.55F, 3, 0, 2, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0436F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 74, 47, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1745F, -0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 74, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL19 = new ModelRenderer(this);
        this.legL19.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body7.addChild(legL19);
        this.setRotateAngle(legL19, 0.0F, -0.0436F, 0.0F);
        this.legL19.cubeList.add(new ModelBox(legL19, 0, 33, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL19.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1745F, 0.0436F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 17, 31, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body8 = new ModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body7.addChild(Body8);
        this.setRotateAngle(Body8, 0.0F, 0.2182F, 0.0F);
        this.Body8.cubeList.add(new ModelBox(Body8, 9, 79, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 74, 77, -1.5F, 0.2F, 0.55F, 3, 0, 2, -0.01F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0436F, 0.0F);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 71, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, -0.0436F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 68, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL20 = new ModelRenderer(this);
        this.legL20.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body8.addChild(legL20);
        this.setRotateAngle(legL20, 0.0F, -0.0436F, 0.0F);
        this.legL20.cubeList.add(new ModelBox(legL20, 0, 30, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL20.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, 0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 28, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body9 = new ModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body8.addChild(Body9);
        this.setRotateAngle(Body9, 0.0F, 0.1309F, 0.0F);
        this.Body9.cubeList.add(new ModelBox(Body9, 0, 77, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body9.cubeList.add(new ModelBox(Body9, 17, 76, -1.5F, 0.2F, 0.55F, 3, 0, 2, 0.0F, false));

        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0436F, 0.0F);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 65, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL9.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1745F, -0.0436F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 62, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL21 = new ModelRenderer(this);
        this.legL21.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body9.addChild(legL21);
        this.setRotateAngle(legL21, 0.0F, -0.0436F, 0.0F);
        this.legL21.cubeList.add(new ModelBox(legL21, 0, 27, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL21.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1745F, 0.0436F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 25, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body10 = new ModelRenderer(this);
        this.Body10.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body9.addChild(Body10);
        this.setRotateAngle(Body10, 0.0F, 0.1309F, 0.0F);
        this.Body10.cubeList.add(new ModelBox(Body10, 75, 39, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body10.cubeList.add(new ModelBox(Body10, 75, 36, -1.5F, 0.2F, 0.65F, 3, 0, 2, -0.01F, false));

        this.legL10 = new ModelRenderer(this);
        this.legL10.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0436F, 0.0F);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 59, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL10.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1745F, -0.0436F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 56, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL22 = new ModelRenderer(this);
        this.legL22.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body10.addChild(legL22);
        this.setRotateAngle(legL22, 0.0F, -0.0436F, 0.0F);
        this.legL22.cubeList.add(new ModelBox(legL22, 0, 24, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL22.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1745F, 0.0436F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 22, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body11 = new ModelRenderer(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body10.addChild(Body11);
        this.setRotateAngle(Body11, 0.0F, 0.2182F, 0.0F);
        this.Body11.cubeList.add(new ModelBox(Body11, 75, 19, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body11.cubeList.add(new ModelBox(Body11, 75, 28, -1.5F, 0.2F, 0.65F, 3, 0, 2, 0.0F, false));

        this.legL11 = new ModelRenderer(this);
        this.legL11.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0436F, 0.0F);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 53, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL11.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1745F, -0.0436F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 50, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL23 = new ModelRenderer(this);
        this.legL23.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body11.addChild(legL23);
        this.setRotateAngle(legL23, 0.0F, -0.0436F, 0.0F);
        this.legL23.cubeList.add(new ModelBox(legL23, 18, 18, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL23.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.1745F, 0.0436F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 18, 13, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.Body12 = new ModelRenderer(this);
        this.Body12.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body11.addChild(Body12);
        this.setRotateAngle(Body12, 0.0F, 0.1745F, 0.0F);
        this.Body12.cubeList.add(new ModelBox(Body12, 75, 25, -1.5F, 0.1F, 0.0F, 3, 0, 2, 0.0F, false));
        this.Body12.cubeList.add(new ModelBox(Body12, 75, 22, -1.5F, 0.2F, 0.65F, 3, 0, 2, -0.01F, false));

        this.legL12 = new ModelRenderer(this);
        this.legL12.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body12.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0436F, 0.0F);
        this.legL12.cubeList.add(new ModelBox(legL12, 17, 69, 0.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL12.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1745F, -0.0436F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 66, 0.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.legL24 = new ModelRenderer(this);
        this.legL24.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body12.addChild(legL24);
        this.setRotateAngle(legL24, 0.0F, -0.0436F, 0.0F);
        this.legL24.cubeList.add(new ModelBox(legL24, 17, 51, -6.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL24.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1745F, 0.0436F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 48, -6.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.Telson = new ModelRenderer(this);
        this.Telson.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body12.addChild(Telson);
        this.setRotateAngle(Telson, 0.0F, 0.3054F, 0.0F);
        this.Telson.cubeList.add(new ModelBox(Telson, 11, 85, -1.5F, 0.15F, 0.0F, 3, 0, 2, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.4F, 2.0F);
        this.Telson.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.5236F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 33, 13, 0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.4F, 2.0F);
        this.Telson.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.5236F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 39, -1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

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
