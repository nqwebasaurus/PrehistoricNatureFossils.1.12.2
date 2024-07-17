package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonManidensFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Manidens;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r5;
    private final ModelRenderer LegL;
    private final ModelRenderer KneeL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer LegL2;
    private final ModelRenderer KneeL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftArm;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer rightArm;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonManidensFrame() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.0F, -22.0F, -9.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3316F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.0F, -3.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -22.0F, -9.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3316F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.5F, -8.0F, -0.5F, 1, 30, 1, -0.21F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.2F, -19.5F, 1.4F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4625F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.9F, -3.5F, -0.5F, 1, 7, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.2F, -19.5F, 1.4F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4625F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.6F, -0.5F, -0.5F, 1, 20, 1, -0.21F, false));

        this.Manidens = new ModelRenderer(this);
        this.Manidens.setRotationPoint(0.0F, -19.0F, 5.0F);
        this.fossil.addChild(Manidens);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.Manidens.addChild(hips);
        this.setRotateAngle(hips, -0.4908F, 0.4311F, -0.0175F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7535F, -1.5286F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2531F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 31, -0.5F, 0.5596F, 0.3068F, 1, 1, 5, -0.2F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(3.1F, 0.925F, -0.0821F);
        this.hips.addChild(LegL);
        this.setRotateAngle(LegL, -0.8696F, 0.05F, 0.121F);


        this.KneeL = new ModelRenderer(this);
        this.KneeL.setRotationPoint(0.0F, 7.4387F, -0.3215F);
        this.LegL.addChild(KneeL);
        this.setRotateAngle(KneeL, 0.6877F, 0.0271F, -0.1281F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 3.0039F, 5.8485F);
        this.KneeL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, -1.2828F, 0.0F, 0.0F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(0.0F, 3.0345F, 2.0111F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, 2.3126F, 0.0F, 0.0F);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-3.1F, 0.925F, -0.0821F);
        this.hips.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.1298F, 0.017F, -0.1298F);


        this.KneeL2 = new ModelRenderer(this);
        this.KneeL2.setRotationPoint(0.0F, 7.4387F, -0.3215F);
        this.LegL2.addChild(KneeL2);
        this.setRotateAngle(KneeL2, -0.0964F, 0.145F, 0.1421F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 3.0039F, 5.8485F);
        this.KneeL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -0.3229F, 0.0F, 0.0F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.0F, 2.0345F, 2.0111F);
        this.MetatarsalL2.addChild(FootL2);
        this.setRotateAngle(FootL2, 0.6545F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.8465F, 3.6714F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0987F, 0.0808F, -0.0421F);
        this.tail1.cubeList.add(new ModelBox(tail1, 15, -1, -0.5F, 0.1495F, -0.7198F, 1, 1, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0495F, 8.8802F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.628F, 0.5057F, 0.228F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.2934F, 1.0645F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 13, -0.5F, -0.2F, -1.6F, 1, 1, 10, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3934F, 9.0645F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2256F, 0.2555F, 0.0579F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2791F, 0.9445F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 15, -0.5F, 0.4F, -1.2F, 1, 1, 12, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5209F, 11.8445F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.4674F, -0.3542F, 0.1733F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, 0.1F, -0.3F, 1, 1, 13, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6535F, -1.7286F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.2376F, -0.1273F, 0.0307F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.2921F, -6.4001F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, -2, -0.5F, 2.2F, -0.5F, 1, 1, 8, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3921F, -6.8001F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.1985F, -4.7349F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, -0.2341F, -0.1366F, 1, 1, 5, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 4.5985F, -3.3349F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.1511F, -0.3573F, -0.7424F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.1F, 3.259F, 1.8468F);
        this.leftArm.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.1136F, -0.1998F, 0.0882F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(0.5F, 3.5273F, -1.6503F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0436F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 4.5985F, -3.3349F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.5538F, 0.0118F, 1.0003F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.1F, 3.259F, 1.8468F);
        this.rightArm.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.4653F, 0.4763F, -0.2263F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(-0.5F, 3.5273F, -1.6503F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.0435F, -0.0038F, -0.0872F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6985F, -4.6349F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3079F, -0.1248F, 0.0396F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.301F, -3.8564F);
        this.neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2356F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 25, -0.5F, -0.4272F, -0.4735F, 1, 1, 5, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.701F, -3.5564F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3414F, -0.0741F, -0.2054F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.4F, -1.5F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8814F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 37, -0.5F, 0.4231F, 0.2979F, 1, 1, 3, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.1F, -1.7F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2618F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.2F, -1.3F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6458F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 3, -0.5F, 0.3055F, 0.0771F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9F, -1.2F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6347F, -0.4043F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);

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
