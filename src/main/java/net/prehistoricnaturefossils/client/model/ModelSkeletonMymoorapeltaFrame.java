package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMymoorapeltaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer hips;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer chest;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail1;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Tail4;

    public ModelSkeletonMymoorapeltaFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -13.9F, 5.7F, 1, 14, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 1.9F, -12.9F, -7.25F, 1, 13, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(2.35F, -9.5F, -6.75F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0159F, -0.3487F, -0.0464F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -6.0F, -0.5F, -0.5F, 12, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -11.5F, 6.2F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0436F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -0.5F, -0.5F, 8, 1, 1, -0.1F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -11.65F, -1.0F);
        this.fossil.addChild(hips);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, -2.5F, 4.1F);
        this.hips.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.1745F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 0, 20, -0.5F, -0.4778F, -0.0138F, 1, 1, 10, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.1745F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, -1.9949F, -4.8062F);
        this.body.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.1047F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, -1, 44, -0.5F, -0.5F, -3.5F, 1, 1, 8, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0616F, -0.1307F, -0.008F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.chest.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.2094F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 36, 46, -0.5F, -6.9927F, -4.9466F, 1, 1, 7, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.35F, -5.2F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2553F, -0.4479F, -0.0378F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.1F, 0.0491F, -2.4636F);
        this.neck1.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0438F, -0.0872F, 0.0038F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 35, 55, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.75F, -3.75F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3466F, -0.4018F, 0.0167F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.05F, 0.7858F, -1.3866F);
        this.neck2.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0437F, -0.0436F, 0.0019F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 38, 61, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -2.85F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0865F, -0.1854F, 0.0156F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0296F, -0.0315F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6981F, 0.0F, 0.0F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(5.5F, 0.75F, -3.9F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.753F, 0.1807F, -0.2205F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.134F, 5.1066F, 1.0348F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9077F, 0.2411F, 0.2453F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.7166F, 4.4694F, -0.0707F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.7854F, -0.1666F, -0.0522F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.leftArm3.addChild(leftArm4);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-5.5F, 0.75F, -3.9F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3603F, -0.1807F, 0.2205F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.134F, 5.1066F, 1.0348F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7485F, -0.1372F, -0.1641F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.7166F, 4.4694F, -0.0707F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3054F, 0.1666F, 0.0522F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.rightArm3.addChild(rightArm4);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-4.1F, -2.95F, -3.0F);
        this.chest.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.1309F, -0.7854F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(4.1F, -2.95F, -3.0F);
        this.chest.addChild(bone4);
        this.setRotateAngle(bone4, -0.0436F, -0.1309F, 0.7854F);


        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(-4.1F, -2.95F, -3.0F);
        this.chest.addChild(bone6);
        this.setRotateAngle(bone6, -0.0436F, 0.1309F, -0.7854F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(-5.95F, -4.35F, -3.75F);
        this.body.addChild(bone2);
        this.setRotateAngle(bone2, -0.1134F, 0.0873F, -0.3491F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(5.95F, -4.35F, -3.75F);
        this.body.addChild(bone3);
        this.setRotateAngle(bone3, -0.1134F, -0.0873F, 0.3491F);


        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(-5.95F, -4.35F, -3.75F);
        this.body.addChild(bone5);
        this.setRotateAngle(bone5, -0.1134F, 0.0873F, -0.3491F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.4F, -0.5F, 7.35F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.5606F, -0.5396F, 0.0511F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.5264F, -0.8152F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6545F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.7689F, 1.0705F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.218F, -0.0094F, -0.0426F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.2005F, 0.4539F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1309F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.4F, -0.5F, 7.35F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0933F, 0.2998F, 0.2683F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.5264F, -0.8152F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0012F, -0.0681F, -0.2673F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.7689F, 1.0705F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3473F, -0.05F, -0.0715F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.2005F, 0.4539F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2618F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0F, 14.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.2182F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.8593F, 1.9779F);
        this.tail1.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.2446F, -0.0516F, 0.0091F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 49, 11, -0.5F, -0.5F, -2.5F, 1, 1, 5, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1117F, 0.2627F, 0.038F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.1F, 0.4F, -1.0F);
        this.tail2.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.0524F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 37, 13, -0.5F, -0.6F, -0.15F, 1, 1, 9, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2406F, 0.3919F, 0.0253F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.1F, 1.0F, 3.75F);
        this.tail3.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0F, -0.0349F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 12, 41, -0.5F, -0.5F, -4.5F, 1, 1, 9, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.208F, 0.5204F, 0.0603F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 25, 33, -0.5F, 0.5F, -0.6F, 1, 1, 9, -0.1F, false));

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
