package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBrachiosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck4;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r16;
    private final ModelRenderer neck7;
    private final ModelRenderer cube_r17;
    private final ModelRenderer neck8;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer neck9;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat1;
    private final ModelRenderer moveableFlesh;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftFoot2;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightFoot2;

    public ModelSkeletonBrachiosaurusFrame() {
        this.textureWidth = 240;
        this.textureHeight = 240;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -58.0F, 38.0F, 2, 58, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -61.0F, 39.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 7.0F, -13.0F, -1.0F, 2, 26, 2, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(8.4F, -61.0F, -22.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2007F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -21.0F, -1.0F, 2, 42, 2, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(8.4F, -61.0F, -22.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2007F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -47.0F, -1.0F, 2, 108, 2, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 1.45F, -25.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(-0.5F, -60.5F, 63.0F);
        this.root.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0111F, -3.4302F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4712F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 86, 4, -2.0F, -1.1232F, -6.7257F, 5, 5, 20, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.5F, 3.25F, 8.2F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -0.7F, 1.3F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1396F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 85, 127, -1.0F, 0.5409F, -2.4913F, 4, 4, 15, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.95F, 13.375F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3099F, 0.1664F, -0.053F);
        this.tail2.cubeList.add(new ModelBox(tail2, 157, 125, -2.0F, -0.4555F, -0.0038F, 4, 4, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1555F, 10.7962F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3065F, 0.0832F, -0.0263F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.1614F, -0.3608F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 95, 38, -1.0F, 0.9F, 0.175F, 3, 3, 20, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.5614F, 19.6142F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1772F, 0.1719F, 0.0306F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.1357F, 0.602F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 96, -0.5F, 1.1F, -1.025F, 2, 2, 21, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.2643F, 19.577F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1855F, 0.3435F, 0.0631F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.8186F, 0.1841F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 91, -0.5F, 0.9F, -0.325F, 2, 2, 21, -0.2F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -1.0186F, 20.6591F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 109, -0.5F, 0.5063F, -0.4528F, 1, 1, 20, -0.2F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.2563F, 19.5472F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0504F, -0.523F, 0.0252F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.7872F, -0.0769F);
        this.tail7.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0175F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 143, 39, -0.1F, 1.0585F, -0.525F, 1, 1, 16, -0.2F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.0887F, 14.9559F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1181F, -0.7383F, 0.0797F);
        this.tail8.cubeList.add(new ModelBox(tail8, 139, 127, -0.5F, 0.6143F, -0.1616F, 1, 1, 15, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.5F, -7.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -9.2897F, -11.5791F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6021F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 121, 91, -3.0F, 0.6212F, -0.0791F, 5, 5, 14, -0.2F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -26.2897F, -30.9791F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7069F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 58, -2.0F, 0.9488F, -0.3866F, 5, 5, 27, -0.2F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -24.5F, -32.2F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.1745F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -14.7F, -14.65F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6894F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 82, -2.0F, 0.7569F, -0.4948F, 5, 5, 21, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.5F, -14.5815F, -17.0953F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -1.0908F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.3823F, -14.7032F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 85, 101, -1.5F, 1.0231F, -0.7745F, 4, 5, 18, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 3.9823F, -15.0032F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0417F, -0.1893F, -0.3415F);
        this.neck2.cubeList.add(new ModelBox(neck2, 79, 67, -2.0F, -1.5165F, -22.3423F, 4, 5, 24, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.4165F, -22.3423F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2567F, -0.0983F, -0.1999F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.75F, -0.5199F, -28.1713F);
        this.neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0524F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 22, 0.25F, 1.2F, -0.75F, 3, 4, 30, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 1.4801F, -28.2213F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1292F, -0.0659F, -0.1674F);
        this.neck4.cubeList.add(new ModelBox(neck4, 63, 120, -1.5F, -0.7651F, -14.7846F, 3, 4, 15, -0.2F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.1349F, -14.7846F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.043F, 0.0076F, -0.1744F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.25F, -2.4846F, -28.7085F);
        this.neck5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0175F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 48, -0.25F, 1.0F, 0.35F, 3, 4, 29, -0.2F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.8846F, -28.7585F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.2166F, -0.057F, -0.1466F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.25F, -2.2886F, -14.5954F);
        this.neck6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0698F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 122, 36, -0.25F, 0.7F, 0.55F, 3, 3, 15, -0.2F, false));

        this.neck7 = new ModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -0.5886F, -14.5954F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.25F, -2.946F, -12.6159F);
        this.neck7.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 143, 22, -0.25F, 0.9F, -0.05F, 3, 3, 14, -0.2F, false));

        this.neck8 = new ModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, -1.696F, -12.7159F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.4743F, -0.0547F, -0.2109F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.9567F, -10.7093F);
        this.neck8.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2443F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 152, -1.5F, 0.9495F, -0.0719F, 3, 3, 12, -0.2F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -4.5567F, -18.7093F);
        this.neck8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 188, 126, -1.5F, 0.85F, -0.05F, 3, 3, 8, -0.2F, false));

        this.neck9 = new ModelRenderer(this);
        this.neck9.setRotationPoint(0.0F, -3.8907F, -18.6933F);
        this.neck8.addChild(neck9);
        this.setRotateAngle(neck9, 0.5088F, -0.1703F, 0.0722F);


        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -2.3415F, -4.444F);
        this.neck9.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 85, 126, -0.5F, 1.4F, 0.0F, 2, 2, 5, -0.2F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.6415F, -7.444F);
        this.neck9.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0349F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 210, 176, -0.5F, 0.7F, 0.0F, 2, 2, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -1.6815F, -7.6565F);
        this.neck9.addChild(head);
        this.setRotateAngle(head, 0.4421F, -0.0498F, -0.0868F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 5.2068F, 0.1294F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.8552F, 0.0F, 0.0F);


        this.throat1 = new ModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 8.8557F, 2.3581F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, 0.2531F, 0.0F, 0.0F);


        this.moveableFlesh = new ModelRenderer(this);
        this.moveableFlesh.setRotationPoint(-1.0F, -7.5489F, 25.025F);
        this.jaw.addChild(moveableFlesh);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(18.5F, 23.5F, -22.8F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.0436F, 0.0F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 30.9487F, 1.2168F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3054F, 0.0F, 0.0F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(1.5F, 21.2963F, -3.8258F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.3491F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-17.5F, 23.5F, -22.8F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5236F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 30.9487F, 1.2168F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7854F, 0.0F, 0.0F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-1.5F, 21.2963F, -3.8258F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 1.0036F, 0.0F, 0.0F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(16.0F, 3.75F, 1.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3491F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-3.6F, 29.7159F, -0.677F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5672F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(1.0F, 20.9319F, 0.7163F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2182F, 0.0F, 0.0F);


        this.leftFoot2 = new ModelRenderer(this);
        this.leftFoot2.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.leftFoot.addChild(leftFoot2);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-15.0F, 3.75F, 1.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0873F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(3.6F, 29.7159F, -0.677F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6545F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(-1.0F, 20.9319F, 0.7163F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.3491F, 0.0F, 0.0F);


        this.rightFoot2 = new ModelRenderer(this);
        this.rightFoot2.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.rightFoot.addChild(rightFoot2);

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
