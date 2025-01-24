package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMegalancosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Megalancosaurus;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer frontleftarm;
    private final ModelRenderer frontleftarm2;
    private final ModelRenderer frontleftarm3;
    private final ModelRenderer frontleftarm4;
    private final ModelRenderer frontrightarm;
    private final ModelRenderer frontrightarm2;
    private final ModelRenderer frontrightarm3;
    private final ModelRenderer frontrightarm4;
    private final ModelRenderer Neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Neck4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Tail;
    private final ModelRenderer cube_r10;
    private final ModelRenderer LLeg;
    private final ModelRenderer LLeg3;
    private final ModelRenderer LFoot;
    private final ModelRenderer finger;
    private final ModelRenderer finger2;
    private final ModelRenderer LFoot2;
    private final ModelRenderer LLeg2;
    private final ModelRenderer LLeg4;
    private final ModelRenderer LFoot3;
    private final ModelRenderer finger3;
    private final ModelRenderer finger4;
    private final ModelRenderer LFoot4;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer TailClaw;

    public ModelSkeletonMegalancosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -5.0F, 13.0F, 1, 5, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -4.9F, -6.4F, 1, 5, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -10.0F, -5.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 7.9F, -3.0F, -0.5F, 1, 7, 1, -0.16F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 6.0F, -2.0F, 18.9F, 1, 5, 1, -0.16F, false));

        this.Megalancosaurus = new ModelRenderer(this);
        this.Megalancosaurus.setRotationPoint(0.0F, -6.0961F, 0.693F);
        this.fossil.addChild(Megalancosaurus);
        this.setRotateAngle(Megalancosaurus, 0.2618F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.0872F, -5.8019F);
        this.Megalancosaurus.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 0, 0.0F, 0.6872F, 2.0019F, 1, 1, 4, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.0872F, 0.1981F);
        this.Megalancosaurus.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 45, 0.0F, 0.4777F, -0.2014F, 1, 1, 5, -0.15F, false));

        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.676F, -3.5819F);
        this.Megalancosaurus.addChild(Body);
        this.setRotateAngle(Body, -0.0698F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.715F, 0.1712F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2967F, -0.0167F, -0.0051F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 37, -0.5F, -0.5F, -6.0F, 1, 1, 6, -0.15F, false));

        this.frontleftarm = new ModelRenderer(this);
        this.frontleftarm.setRotationPoint(3.2924F, 5.1664F, -3.4116F);
        this.Body.addChild(frontleftarm);
        this.setRotateAngle(frontleftarm, 0.5722F, 0.298F, -0.092F);


        this.frontleftarm2 = new ModelRenderer(this);
        this.frontleftarm2.setRotationPoint(0.2489F, 0.1383F, 4.8845F);
        this.frontleftarm.addChild(frontleftarm2);
        this.setRotateAngle(frontleftarm2, -1.5975F, -0.9345F, 1.0627F);


        this.frontleftarm3 = new ModelRenderer(this);
        this.frontleftarm3.setRotationPoint(0.1639F, 4.1419F, -0.0185F);
        this.frontleftarm2.addChild(frontleftarm3);
        this.setRotateAngle(frontleftarm3, -0.9955F, 0.3425F, 0.343F);


        this.frontleftarm4 = new ModelRenderer(this);
        this.frontleftarm4.setRotationPoint(0.3572F, 4.5492F, -0.3312F);
        this.frontleftarm2.addChild(frontleftarm4);
        this.setRotateAngle(frontleftarm4, -0.9264F, -0.5018F, -0.0865F);


        this.frontrightarm = new ModelRenderer(this);
        this.frontrightarm.setRotationPoint(-3.2924F, 5.1664F, -3.4116F);
        this.Body.addChild(frontrightarm);
        this.setRotateAngle(frontrightarm, 0.1258F, -0.3785F, 0.3233F);


        this.frontrightarm2 = new ModelRenderer(this);
        this.frontrightarm2.setRotationPoint(-0.2489F, 0.1383F, 4.8845F);
        this.frontrightarm.addChild(frontrightarm2);
        this.setRotateAngle(frontrightarm2, -1.4275F, 0.0412F, -0.1734F);


        this.frontrightarm3 = new ModelRenderer(this);
        this.frontrightarm3.setRotationPoint(-0.3488F, 4.2445F, -0.358F);
        this.frontrightarm2.addChild(frontrightarm3);
        this.setRotateAngle(frontrightarm3, -0.2989F, -0.0503F, -0.1064F);


        this.frontrightarm4 = new ModelRenderer(this);
        this.frontrightarm4.setRotationPoint(-0.4097F, 4.2598F, -0.39F);
        this.frontrightarm2.addChild(frontrightarm4);
        this.setRotateAngle(frontrightarm4, -0.0747F, 0.4408F, 0.6429F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.2323F, -4.5659F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, 0.6007F, -0.2175F, -0.1468F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0438F, -4.166F);
        this.Neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0699F, -0.0348F, 0.0024F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 52, -0.5F, -0.3128F, 2.3019F, 1, 1, 1, -0.16F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 50, -0.5F, -0.3128F, -0.2981F, 1, 1, 3, -0.15F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.4689F, -3.9641F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.9588F, -0.4492F, 0.554F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.7069F, -4.7823F);
        this.Neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 41, -0.5F, -0.4128F, -0.6981F, 1, 1, 6, -0.15F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -1.2196F, -4.4804F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.5589F, -0.2305F, 0.0435F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7802F, -0.1779F);
        this.Neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4369F, -0.0475F, 0.0221F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 55, -0.5F, -0.5F, -2.9F, 1, 1, 3, -0.15F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, -0.9633F, -2.4532F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.4813F, -0.3973F, -0.4578F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.6F, -2.2F);
        this.Neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4369F, -0.0475F, 0.0221F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 49, 35, -0.5F, 0.6872F, -1.2981F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0866F, -3.1854F);
        this.Neck4.addChild(head);
        this.setRotateAngle(head, 0.3796F, 0.0F, 0.0F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.6149F, -0.8573F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0087F, 0.0F, 0.0F);


        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.317F, 4.8706F);
        this.Megalancosaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.3927F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -0.5017F, 0.0785F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 45, -1.0F, 0.7F, -0.1F, 1, 1, 5, -0.15F, false));

        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0983F, 5.0785F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.0436F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.3409F, 0.0894F);
        this.Tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -0.5F, 0.7F, -0.1F, 1, 1, 7, -0.15F, false));

        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0F, 3.6466F, 4.2754F);
        this.Tail.addChild(LLeg);
        this.setRotateAngle(LLeg, -1.826F, -0.7256F, 0.2885F);


        this.LLeg3 = new ModelRenderer(this);
        this.LLeg3.setRotationPoint(0.6784F, 6.9798F, 0.7737F);
        this.LLeg.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 1.1873F, -0.2723F, 0.7176F);


        this.LFoot = new ModelRenderer(this);
        this.LFoot.setRotationPoint(-0.5487F, 4.5822F, -0.4903F);
        this.LLeg3.addChild(LFoot);
        this.setRotateAngle(LFoot, 1.288F, -0.7235F, -1.3104F);


        this.finger = new ModelRenderer(this);
        this.finger.setRotationPoint(-1.2053F, -0.1F, 0.0294F);
        this.LFoot.addChild(finger);
        this.setRotateAngle(finger, -0.075F, 0.5081F, -0.0539F);


        this.finger2 = new ModelRenderer(this);
        this.finger2.setRotationPoint(0.006F, 0.0F, -2.6068F);
        this.finger.addChild(finger2);


        this.LFoot2 = new ModelRenderer(this);
        this.LFoot2.setRotationPoint(-0.2566F, 0.591F, -2.4836F);
        this.LFoot.addChild(LFoot2);
        this.setRotateAngle(LFoot2, -0.2182F, 0.0F, 0.0F);


        this.LLeg2 = new ModelRenderer(this);
        this.LLeg2.setRotationPoint(-2.0F, 3.6466F, 4.2754F);
        this.Tail.addChild(LLeg2);
        this.setRotateAngle(LLeg2, -1.8486F, 0.5399F, -0.1238F);


        this.LLeg4 = new ModelRenderer(this);
        this.LLeg4.setRotationPoint(-0.6784F, 6.9798F, 0.7737F);
        this.LLeg2.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 1.8802F, 0.3579F, -0.8563F);


        this.LFoot3 = new ModelRenderer(this);
        this.LFoot3.setRotationPoint(0.5487F, 4.5822F, -0.4903F);
        this.LLeg4.addChild(LFoot3);
        this.setRotateAngle(LFoot3, 2.6312F, 1.4109F, 2.6974F);


        this.finger3 = new ModelRenderer(this);
        this.finger3.setRotationPoint(1.2053F, -0.1F, 0.0294F);
        this.LFoot3.addChild(finger3);
        this.setRotateAngle(finger3, 0.0F, -0.5672F, 0.0F);


        this.finger4 = new ModelRenderer(this);
        this.finger4.setRotationPoint(-0.006F, 0.0F, -2.6068F);
        this.finger3.addChild(finger4);
        this.setRotateAngle(finger4, 0.0873F, 0.0F, 0.0F);


        this.LFoot4 = new ModelRenderer(this);
        this.LFoot4.setRotationPoint(0.2557F, 0.5644F, -2.3217F);
        this.LFoot3.addChild(LFoot4);
        this.setRotateAngle(LFoot4, -0.0873F, 0.0F, 0.0F);


        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 2.8591F, 6.3894F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.2371F, 0.5383F, -0.2147F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 0, -0.5F, -0.3972F, -0.6265F, 1, 1, 13, -0.15F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 12, 12, -0.5F, -0.3972F, 12.0735F, 1, 1, 1, -0.15F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5663F, 12.675F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.3647F, 0.5718F, 0.2221F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 25, 15, -0.5F, 0.0979F, -0.004F, 1, 1, 11, -0.15F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.1203F, 11.0582F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.8481F, -0.1876F, 0.2501F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 15, -0.5F, 0.0167F, -0.0547F, 1, 1, 11, -0.15F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.023F, 10.9718F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -1.3545F, -0.0617F, 0.0618F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 17, 28, -0.5F, 0.0F, -0.1F, 1, 1, 7, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0342F, 6.906F);
        this.Tail5.addChild(tail6);
        this.setRotateAngle(tail6, -1.1185F, -0.1432F, 0.3F);
        this.tail6.cubeList.add(new ModelBox(tail6, 35, 36, -0.5F, 0.0F, -0.1F, 1, 1, 5, -0.15F, false));

        this.TailClaw = new ModelRenderer(this);
        this.TailClaw.setRotationPoint(0.0421F, -0.1349F, 5.3122F);
        this.tail6.addChild(TailClaw);
        this.setRotateAngle(TailClaw, -1.5966F, 0.0045F, 0.1745F);
        this.TailClaw.cubeList.add(new ModelBox(TailClaw, 29, 0, -0.5F, -0.3F, 0.0F, 1, 1, 7, -0.15F, false));

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
