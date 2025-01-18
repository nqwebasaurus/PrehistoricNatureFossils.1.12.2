package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonIkrandracoFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLegMembrane;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLegMembrane;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer rightWing;
    private final ModelRenderer rightWing2;
    private final ModelRenderer rightWing3;
    private final ModelRenderer hand2;
    private final ModelRenderer rightWing4;
    private final ModelRenderer rightWing5;
    private final ModelRenderer rightWing6;
    private final ModelRenderer leftWing7;
    private final ModelRenderer leftWing8;
    private final ModelRenderer leftWing9;
    private final ModelRenderer hand4;
    private final ModelRenderer leftWing10;
    private final ModelRenderer leftWing11;
    private final ModelRenderer leftWing12;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;
    private final ModelRenderer throat2;

    public ModelSkeletonIkrandracoFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(-0.5F, -9.4833F, 7.7016F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.2618F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.1838F, -0.3429F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -1.5272F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -0.5F, -0.1F, -1.5F, 1, 1, 3, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.5F, 0.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 34, -0.5F, 0.8F, -1.9F, 1, 1, 3, -0.2F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(1.6841F, 0.0793F, -0.7585F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 1.1081F, 0.241F, -0.4837F);


        this.leftLegMembrane = new ModelRenderer(this);
        this.leftLegMembrane.setRotationPoint(0.0F, 2.2F, 1.5F);
        this.leftLeg.addChild(leftLegMembrane);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5443F, 5.1156F, -0.3242F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6311F, -0.1125F, 0.2359F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.3964F, 5.429F, 0.6618F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.8759F, 0.1092F, 0.0114F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.6841F, 0.0793F, -0.7585F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 1.3283F, -0.4823F, 0.5938F);


        this.rightLegMembrane = new ModelRenderer(this);
        this.rightLegMembrane.setRotationPoint(0.0F, 2.2F, 1.5F);
        this.rightLeg.addChild(rightLegMembrane);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5443F, 5.1156F, -0.3242F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4129F, 0.1125F, -0.2359F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.3964F, 5.429F, 0.6618F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.7014F, -0.1092F, -0.0114F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.0046F, 0.6181F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1787F, -0.2148F, 0.0385F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5688F, 0.302F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4712F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 35, -0.5F, -0.4F, -0.2F, 1, 1, 2, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.5F, -1.6736F, -1.5152F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0443F, -0.1744F, -0.0077F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.6861F, -2.9612F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.5708F, -1.5184F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 19, -2.0F, 0.1F, -3.0F, 1, 1, 6, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.7236F, -5.6152F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 19, -1.0F, 0.6F, -0.4F, 1, 1, 6, -0.2F, false));

        this.rightWing = new ModelRenderer(this);
        this.rightWing.setRotationPoint(-2.193F, 2.3287F, -4.1283F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, 0.1818F, -0.5924F, 2.1696F);


        this.rightWing2 = new ModelRenderer(this);
        this.rightWing2.setRotationPoint(0.1659F, 4.1453F, 0.9763F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, -0.9F, 0.4796F, -0.1773F);


        this.rightWing3 = new ModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.5012F, 7.4876F, -0.8952F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.3502F, 0.021F, -0.1285F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(-0.0727F, 5.1954F, 0.0319F);
        this.rightWing3.addChild(hand2);
        this.setRotateAngle(hand2, 1.3389F, -0.0277F, 3.1329F);


        this.rightWing4 = new ModelRenderer(this);
        this.rightWing4.setRotationPoint(0.5228F, 5.7039F, 0.6545F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -1.2806F, 0.2298F, -0.0283F);


        this.rightWing5 = new ModelRenderer(this);
        this.rightWing5.setRotationPoint(-0.5788F, 0.2961F, 8.6346F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, -0.0147F, 0.1799F, 0.0338F);


        this.rightWing6 = new ModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0105F, -0.0194F, 8.0291F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.3851F, 0.1285F, 0.0201F);


        this.leftWing7 = new ModelRenderer(this);
        this.leftWing7.setRotationPoint(2.193F, 2.3287F, -4.1283F);
        this.body.addChild(leftWing7);
        this.setRotateAngle(leftWing7, 0.1526F, 0.5996F, -2.2216F);


        this.leftWing8 = new ModelRenderer(this);
        this.leftWing8.setRotationPoint(-0.1659F, 4.1453F, 0.9763F);
        this.leftWing7.addChild(leftWing8);
        this.setRotateAngle(leftWing8, -0.9F, -0.4796F, 0.1773F);


        this.leftWing9 = new ModelRenderer(this);
        this.leftWing9.setRotationPoint(0.5012F, 7.4876F, -0.8952F);
        this.leftWing8.addChild(leftWing9);
        this.setRotateAngle(leftWing9, 0.3502F, -0.021F, 0.1285F);


        this.hand4 = new ModelRenderer(this);
        this.hand4.setRotationPoint(0.0727F, 5.1954F, 0.0319F);
        this.leftWing9.addChild(hand4);
        this.setRotateAngle(hand4, 1.4247F, -0.145F, -3.1076F);


        this.leftWing10 = new ModelRenderer(this);
        this.leftWing10.setRotationPoint(-0.5228F, 5.7039F, 0.6545F);
        this.leftWing9.addChild(leftWing10);
        this.setRotateAngle(leftWing10, -1.264F, -0.3967F, -0.0256F);


        this.leftWing11 = new ModelRenderer(this);
        this.leftWing11.setRotationPoint(0.5788F, 0.2961F, 8.6346F);
        this.leftWing10.addChild(leftWing11);
        this.setRotateAngle(leftWing11, -0.0147F, -0.1799F, -0.0338F);


        this.leftWing12 = new ModelRenderer(this);
        this.leftWing12.setRotationPoint(-0.0105F, -0.0194F, 8.0291F);
        this.leftWing11.addChild(leftWing12);
        this.setRotateAngle(leftWing12, 0.3851F, -0.1285F, -0.0201F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.1563F, -5.2673F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.132F, 0.1298F, 0.0172F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4538F, -4.3128F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 27, -0.5F, -0.3F, 0.0F, 1, 1, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0038F, -4.1628F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.4749F, 0.4151F, 0.3708F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.7953F, -2.8964F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, -1, 0.0F, 0.6F, -0.8F, 1, 1, 4, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.4953F, -2.6964F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.7922F, 0.2465F, -0.0613F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.45F, -1.875F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 1.15F, -5.8F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.1309F, 0.0F, 0.0F);


        this.throat2 = new ModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.5236F, 0.0F, 0.0F);

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
