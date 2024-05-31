package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonXinpusaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Xinpusaurus;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer bone;
    private final ModelRenderer Jaw;
    private final ModelRenderer bone4;
    private final ModelRenderer RArm;
    private final ModelRenderer RArm2;
    private final ModelRenderer RHand;
    private final ModelRenderer RArm3;
    private final ModelRenderer RArm4;
    private final ModelRenderer RHand2;
    private final ModelRenderer Hip;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer RLeg;
    private final ModelRenderer RLeg2;
    private final ModelRenderer RFoot;
    private final ModelRenderer RLeg3;
    private final ModelRenderer RLeg4;
    private final ModelRenderer RFoot2;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r6;

    public ModelSkeletonXinpusaurusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Xinpusaurus = new ModelRenderer(this);
        this.Xinpusaurus.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.fossil.addChild(Xinpusaurus);
        this.setRotateAngle(Xinpusaurus, -0.1745F, 0.0F, 0.0F);
        this.Xinpusaurus.cubeList.add(new ModelBox(Xinpusaurus, 28, 4, -0.5F, -1.8F, -6.1F, 1, 1, 13, -0.1F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -0.375F, -6.0F);
        this.Xinpusaurus.addChild(Chest);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.625F, -6.0F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 22, -3.5F, 2.75F, 2.9F, 7, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 22, -0.5F, 0.75F, 2.9F, 1, 3, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 17, -0.5F, 0.65F, -0.1F, 1, 1, 6, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -0.625F, -5.0F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.1828F, -0.3006F, 0.0547F);
        this.Neck.cubeList.add(new ModelBox(Neck, 43, 11, -0.5F, -0.35F, -4.0F, 1, 1, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.2317F, -0.3405F, 0.0786F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.Head.addChild(bone);
        this.setRotateAngle(bone, -0.0698F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Jaw.addChild(bone4);
        this.setRotateAngle(bone4, -0.0698F, 0.0F, 0.0F);


        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(4.0F, 1.875F, -3.0F);
        this.Chest.addChild(RArm);
        this.setRotateAngle(RArm, 1.435F, -1.3977F, 0.2694F);


        this.RArm2 = new ModelRenderer(this);
        this.RArm2.setRotationPoint(3.5F, 1.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -0.0681F, 0.298F, -0.2284F);


        this.RHand = new ModelRenderer(this);
        this.RHand.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 0.0F, 0.3491F);


        this.RArm3 = new ModelRenderer(this);
        this.RArm3.setRotationPoint(-4.0F, 1.875F, -3.0F);
        this.Chest.addChild(RArm3);
        this.setRotateAngle(RArm3, 1.453F, 1.3555F, -0.2415F);


        this.RArm4 = new ModelRenderer(this);
        this.RArm4.setRotationPoint(-3.5F, 1.0F, 0.0F);
        this.RArm3.addChild(RArm4);
        this.setRotateAngle(RArm4, -0.0681F, -0.298F, 0.2284F);


        this.RHand2 = new ModelRenderer(this);
        this.RHand2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.RArm4.addChild(RHand2);
        this.setRotateAngle(RHand2, 0.0F, 0.0F, -0.3491F);


        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Xinpusaurus.addChild(Hip);
        this.setRotateAngle(Hip, 0.134F, 0.2163F, 0.0289F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5348F, 6.1247F);
        this.Hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0524F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 27, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, 0.75F);
        this.Hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 27, -0.5F, 0.25F, 5.0F, 1, 2, 1, -0.1F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 19, -0.5F, 0.15F, 0.0F, 1, 1, 9, -0.1F, false));

        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(2.5F, 1.0F, 6.0F);
        this.Hip.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.1191F, -0.9437F, 0.9242F);


        this.RLeg2 = new ModelRenderer(this);
        this.RLeg2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, -0.6109F, 0.0F);


        this.RFoot = new ModelRenderer(this);
        this.RFoot.setRotationPoint(3.1808F, 0.0F, 0.2736F);
        this.RLeg2.addChild(RFoot);


        this.RLeg3 = new ModelRenderer(this);
        this.RLeg3.setRotationPoint(-2.5F, 1.0F, 6.0F);
        this.Hip.addChild(RLeg3);
        this.setRotateAngle(RLeg3, -0.2116F, 1.0664F, -1.3418F);


        this.RLeg4 = new ModelRenderer(this);
        this.RLeg4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RLeg3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.0F, 0.6109F, 0.0F);


        this.RFoot2 = new ModelRenderer(this);
        this.RFoot2.setRotationPoint(-3.1808F, 0.0F, 0.2736F);
        this.RLeg4.addChild(RFoot2);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -1.5F, 8.4F);
        this.Hip.addChild(Tail);
        this.setRotateAngle(Tail, 0.2778F, 0.3367F, 0.0939F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, -0.4F);
        this.Tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 35, -0.5F, 0.6F, 0.0F, 1, 1, 12, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.7F, 11.3F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, 0.3491F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 27, 37, -0.5F, 0.25F, 0.0F, 1, 1, 10, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2F, 9.3F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0F, 0.4363F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 19, 19, -0.5F, 0.45F, 0.0F, 1, 1, 16, -0.1F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.1F, 15.5F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0F, 0.4363F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, -0.5F, 0.55F, -0.5F, 1, 1, 16, -0.1F, false));

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
