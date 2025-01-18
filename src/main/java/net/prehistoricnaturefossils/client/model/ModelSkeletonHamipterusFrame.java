package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHamipterusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer main;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLegMembrane;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLegMembrane;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer tail;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftWing;
    private final ModelRenderer leftWing2;
    private final ModelRenderer leftWing3;
    private final ModelRenderer hand;
    private final ModelRenderer leftWing4;
    private final ModelRenderer leftWing5;
    private final ModelRenderer leftWing6;
    private final ModelRenderer rightWing;
    private final ModelRenderer rightWing2;
    private final ModelRenderer rightWing3;
    private final ModelRenderer hand2;
    private final ModelRenderer rightWing4;
    private final ModelRenderer rightWing5;
    private final ModelRenderer rightWing6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonHamipterusFrame() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -14.0F, -1.1F, 1, 14, 1, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.35F, 4.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -0.65F, -0.5F, 1, 11, 1, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -10.35F, 4.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.65F, -1.5F, -0.5F, 1, 3, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -10.5F, -0.6F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 1.9F, -2.5F, -0.5F, 1, 5, 1, -0.2F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(-0.5F, -11.9755F, 4.5829F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.5918F, -1.0584F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 4, -0.5F, 0.7F, 0.3F, 1, 1, 2, -0.202F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(1.6612F, 1.3135F, 0.2698F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.0829F, 0.0F, -0.3927F);


        this.leftLegMembrane = new ModelRenderer(this);
        this.leftLegMembrane.setRotationPoint(0.0F, 1.0F, 1.6F);
        this.leftLeg.addChild(leftLegMembrane);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 4.0F, -0.4F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4217F, -0.1125F, 0.2359F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.4924F, 6.2871F, 0.0886F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1719F, 0.0302F, 0.1719F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.6612F, 1.3135F, 0.2698F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.432F, 0.0F, 0.3927F);


        this.rightLegMembrane = new ModelRenderer(this);
        this.rightLegMembrane.setRotationPoint(0.0F, 1.0F, 1.6F);
        this.rightLeg.addChild(rightLegMembrane);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 4.0F, -0.4F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4653F, 0.1125F, -0.2359F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.4924F, 6.2871F, 0.0886F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2611F, -0.0151F, -0.0859F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.5F, 0.2418F, 0.6533F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2793F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 52, 8, -0.5F, 0.2337F, 0.0F, 1, 1, 2, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.0011F, -1.1647F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.444F, -2.5504F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3142F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -2, 43, -1.0F, 0.7F, -0.4F, 1, 1, 4, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.55F, -4.6F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 32, -1.0F, -0.4F, -0.3F, 1, 1, 2, -0.202F, false));

        this.leftWing = new ModelRenderer(this);
        this.leftWing.setRotationPoint(2.0453F, 0.0848F, -4.1926F);
        this.body.addChild(leftWing);
        this.setRotateAngle(leftWing, 0.6339F, 0.291F, -0.3159F);


        this.leftWing2 = new ModelRenderer(this);
        this.leftWing2.setRotationPoint(0.2187F, 4.7548F, -0.0313F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, -1.3568F, -0.0087F, 0.3943F);


        this.leftWing3 = new ModelRenderer(this);
        this.leftWing3.setRotationPoint(0.4908F, 6.8928F, -1.1621F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.5211F, 0.0445F, -0.0123F);


        this.hand = new ModelRenderer(this);
        this.hand.setRotationPoint(-0.4272F, 4.3229F, 0.0392F);
        this.leftWing3.addChild(hand);
        this.setRotateAngle(hand, 0.0147F, -0.4282F, 2.5392F);


        this.leftWing4 = new ModelRenderer(this);
        this.leftWing4.setRotationPoint(-0.1038F, 5.1131F, 1.4041F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, 0.8222F, 0.0595F, 0.0639F);


        this.leftWing5 = new ModelRenderer(this);
        this.leftWing5.setRotationPoint(0.0554F, -0.0467F, 7.8438F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 0.2095F, -0.0795F, -0.0228F);


        this.leftWing6 = new ModelRenderer(this);
        this.leftWing6.setRotationPoint(-0.0243F, 0.0142F, 6.0192F);
        this.leftWing5.addChild(leftWing6);
        this.setRotateAngle(leftWing6, 0.2539F, -0.0413F, -0.0169F);


        this.rightWing = new ModelRenderer(this);
        this.rightWing.setRotationPoint(-2.0453F, 0.0848F, -4.1926F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, 1.1139F, -0.291F, 0.3159F);


        this.rightWing2 = new ModelRenderer(this);
        this.rightWing2.setRotationPoint(-0.2187F, 4.7548F, -0.0313F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, -1.3568F, 0.0087F, -0.3943F);


        this.rightWing3 = new ModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.4908F, 6.8928F, -1.1621F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.5211F, -0.0445F, 0.0123F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.4272F, 4.3229F, 0.0392F);
        this.rightWing3.addChild(hand2);
        this.setRotateAngle(hand2, 0.1763F, -0.0623F, -1.6649F);


        this.rightWing4 = new ModelRenderer(this);
        this.rightWing4.setRotationPoint(0.1038F, 5.1131F, 1.4041F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, 0.9948F, 0.0F, 0.0F);


        this.rightWing5 = new ModelRenderer(this);
        this.rightWing5.setRotationPoint(-0.0554F, -0.0467F, 7.8438F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 0.2095F, 0.0795F, 0.0228F);


        this.rightWing6 = new ModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0243F, 0.0142F, 6.0192F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.2539F, 0.0413F, 0.0169F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.0135F, -4.4967F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.6305F, 0.1393F, 0.1976F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.55F, -1.9F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.035F, 0.0698F, 0.0024F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 55, 39, -0.5F, -0.5F, -0.6F, 1, 1, 3, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2064F, -1.7843F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3509F, 0.0452F, -0.0025F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.2529F, -2.7561F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 41, -0.5F, 0.7F, 0.1F, 1, 1, 3, -0.202F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.75F, -3.2F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.384F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 52, -0.5F, 0.4F, -1.5F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.6649F, -3.3188F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.4966F, -0.1724F, -0.4331F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7985F, -1.6826F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6458F, 0.0F, 0.0F);

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
