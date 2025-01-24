package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHescheleriaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Hescheleria;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
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
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer RLeg;
    private final ModelRenderer RLeg2;
    private final ModelRenderer RFoot;
    private final ModelRenderer RLeg3;
    private final ModelRenderer RLeg4;
    private final ModelRenderer RFoot2;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r8;

    public ModelSkeletonHescheleriaFrame() {
        this.textureWidth = 83;
        this.textureHeight = 83;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Hescheleria = new ModelRenderer(this);
        this.Hescheleria.setRotationPoint(0.3624F, -6.9064F, -0.2168F);
        this.fossil.addChild(Hescheleria);
        this.setRotateAngle(Hescheleria, 0.2325F, -0.3453F, 0.3004F);
        this.Hescheleria.cubeList.add(new ModelBox(Hescheleria, 35, 16, -0.5F, -2.0F, -6.1F, 1, 1, 13, -0.15F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -2.275F, -6.0F);
        this.Hescheleria.addChild(Chest);
        this.setRotateAngle(Chest, -0.3686F, 0.1197F, 0.2591F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.275F, -6.0F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 53, -0.5F, 0.45F, 5.5F, 1, 1, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -1, 48, -0.5F, 0.45F, -0.2F, 1, 1, 6, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0274F, -3.1406F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -1.501F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -3, 46, -0.2F, 2.2F, -4.0F, 1, 1, 8, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0274F, -3.1406F);
        this.Chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.501F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 51, -0.5F, -0.8F, -0.2F, 1, 1, 3, -0.16F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4144F, -6.1311F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.1708F, 0.2572F, 0.2099F);
        this.Neck.cubeList.add(new ModelBox(Neck, 60, 49, -0.5F, 0.35F, -3.4F, 1, 1, 4, -0.15F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -2.9F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.3086F, 0.2367F, -0.2578F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.7999F, -5.9892F);
        this.Head.addChild(bone);
        this.setRotateAngle(bone, -0.0698F, 0.0F, 0.0F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.2999F, 0.0108F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.4363F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.3F, -4.6F);
        this.Jaw.addChild(bone4);
        this.setRotateAngle(bone4, -0.0698F, 0.0F, 0.0F);


        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(4.0F, 3.775F, -3.0F);
        this.Chest.addChild(RArm);
        this.setRotateAngle(RArm, -2.2493F, -1.3991F, -2.3285F);


        this.RArm2 = new ModelRenderer(this);
        this.RArm2.setRotationPoint(3.5F, 1.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -0.0681F, 0.298F, -0.2284F);


        this.RHand = new ModelRenderer(this);
        this.RHand.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 0.0F, 0.3491F);


        this.RArm3 = new ModelRenderer(this);
        this.RArm3.setRotationPoint(-4.0F, 3.775F, -3.0F);
        this.Chest.addChild(RArm3);
        this.setRotateAngle(RArm3, 1.435F, 1.3977F, -0.2694F);


        this.RArm4 = new ModelRenderer(this);
        this.RArm4.setRotationPoint(-3.5F, 1.0F, 0.0F);
        this.RArm3.addChild(RArm4);
        this.setRotateAngle(RArm4, -0.0731F, -0.4721F, 0.2417F);


        this.RHand2 = new ModelRenderer(this);
        this.RHand2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.RArm4.addChild(RHand2);
        this.setRotateAngle(RHand2, 0.0F, 0.0F, -0.6981F);


        this.Hip = new ModelRenderer(this);
        this.Hip.setRotationPoint(0.0F, -2.1445F, 6.9007F);
        this.Hescheleria.addChild(Hip);
        this.setRotateAngle(Hip, 0.3572F, 0.2594F, 0.0281F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.8797F, 4.3704F);
        this.Hip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.5708F, -1.5184F, 1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 48, 1.5F, 1.7F, -3.0F, 1, 1, 6, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.8797F, 4.3704F);
        this.Hip.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.6232F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 52, -0.5F, -2.5F, 0.1F, 1, 1, 2, -0.16F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.Hip.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 44, -0.5F, -0.05F, -0.6F, 1, 1, 10, -0.15F, false));

        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(2.5F, 3.2F, 6.0F);
        this.Hip.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.692F, -0.8032F, 0.5777F);


        this.RLeg2 = new ModelRenderer(this);
        this.RLeg2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, -0.3127F, -0.5338F, 0.5661F);


        this.RFoot = new ModelRenderer(this);
        this.RFoot.setRotationPoint(3.1808F, 0.0F, 0.2736F);
        this.RLeg2.addChild(RFoot);


        this.RLeg3 = new ModelRenderer(this);
        this.RLeg3.setRotationPoint(-2.5F, 3.2F, 6.0F);
        this.Hip.addChild(RLeg3);
        this.setRotateAngle(RLeg3, -0.2457F, 1.2675F, -1.5283F);


        this.RLeg4 = new ModelRenderer(this);
        this.RLeg4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RLeg3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, -0.121F, 0.6003F, -0.212F);


        this.RFoot2 = new ModelRenderer(this);
        this.RFoot2.setRotationPoint(-3.1808F, 0.0F, 0.2736F);
        this.RLeg4.addChild(RFoot2);
        this.setRotateAngle(RFoot2, 0.0F, 0.0F, 0.3491F);


        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.7277F, 9.3996F);
        this.Hip.addChild(Tail);
        this.setRotateAngle(Tail, 0.3685F, 0.2694F, -0.0592F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, -0.4F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 31, -0.5F, 0.4F, -0.1F, 1, 1, 12, -0.15F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.7F, 11.3F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1694F, 0.436F, 0.0163F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 36, -0.5F, -0.05F, -0.5F, 1, 1, 10, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.2F, 9.3F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.2677F, -0.3924F, -0.0145F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 0, -0.5F, 0.15F, 0.0F, 1, 1, 16, -0.15F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.1F, 15.9F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.3491F, -0.6109F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.Tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -0.5F, 0.25F, -0.5F, 1, 1, 16, -0.15F, false));

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
