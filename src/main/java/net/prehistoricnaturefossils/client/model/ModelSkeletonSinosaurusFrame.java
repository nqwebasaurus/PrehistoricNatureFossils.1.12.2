package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSinosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer LegL;
    private final ModelRenderer TibiaL;
    private final ModelRenderer MetatarsalL;
    private final ModelRenderer FootL;
    private final ModelRenderer FootL2;
    private final ModelRenderer LegL2;
    private final ModelRenderer TibiaL2;
    private final ModelRenderer MetatarsalL2;
    private final ModelRenderer FootL3;
    private final ModelRenderer FootL4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer ArmL;
    private final ModelRenderer ElbowL;
    private final ModelRenderer HandL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ElbowL2;
    private final ModelRenderer HandL2;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftCrest;
    private final ModelRenderer rightCrest;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonSinosaurusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, -2.0F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -13.1F, -17.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3142F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.0F, -1.9F, -0.5F, 1, 15, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -13.1F, -17.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3142F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.4F, -6.0F, -0.5F, 1, 6, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -15.0F, -1.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.1F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -18.4F, -2.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.2F, -3.4F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 11, -1.0F, 0.7F, 0.1F, 1, 1, 7, -0.15F, false));

        this.LegL = new ModelRenderer(this);
        this.LegL.setRotationPoint(2.2F, 1.0F, -0.8F);
        this.hips.addChild(LegL);
        this.setRotateAngle(LegL, -0.6504F, 0.0795F, 0.1041F);


        this.TibiaL = new ModelRenderer(this);
        this.TibiaL.setRotationPoint(0.0F, 7.1092F, -2.3F);
        this.LegL.addChild(TibiaL);
        this.setRotateAngle(TibiaL, 0.4447F, -0.0188F, 0.0394F);


        this.MetatarsalL = new ModelRenderer(this);
        this.MetatarsalL.setRotationPoint(0.0F, 6.7993F, 3.6236F);
        this.TibiaL.addChild(MetatarsalL);
        this.setRotateAngle(MetatarsalL, 0.0F, 0.0F, -0.1309F);


        this.FootL = new ModelRenderer(this);
        this.FootL.setRotationPoint(-0.5F, 4.0941F, -1.1838F);
        this.MetatarsalL.addChild(FootL);
        this.setRotateAngle(FootL, -0.0872F, -0.0038F, -0.0435F);


        this.FootL2 = new ModelRenderer(this);
        this.FootL2.setRotationPoint(0.5F, 0.0F, -2.3F);
        this.FootL.addChild(FootL2);


        this.LegL2 = new ModelRenderer(this);
        this.LegL2.setRotationPoint(-2.2F, 1.0F, -0.8F);
        this.hips.addChild(LegL2);
        this.setRotateAngle(LegL2, 0.1731F, 0.0227F, -0.1289F);


        this.TibiaL2 = new ModelRenderer(this);
        this.TibiaL2.setRotationPoint(0.0F, 7.1092F, -2.3F);
        this.LegL2.addChild(TibiaL2);
        this.setRotateAngle(TibiaL2, 0.1396F, 0.0F, 0.0F);


        this.MetatarsalL2 = new ModelRenderer(this);
        this.MetatarsalL2.setRotationPoint(0.0F, 6.7993F, 3.6236F);
        this.TibiaL2.addChild(MetatarsalL2);
        this.setRotateAngle(MetatarsalL2, -0.2575F, 0.0474F, 0.0866F);


        this.FootL3 = new ModelRenderer(this);
        this.FootL3.setRotationPoint(0.5F, 4.0941F, -1.1838F);
        this.MetatarsalL2.addChild(FootL3);
        this.setRotateAngle(FootL3, 0.217F, -0.0143F, 0.001F);


        this.FootL4 = new ModelRenderer(this);
        this.FootL4.setRotationPoint(-0.5F, 0.0F, -2.3F);
        this.FootL3.addChild(FootL4);
        this.setRotateAngle(FootL4, -0.48F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7F, -3.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.088F, 0.1304F, -0.0115F);
        this.body.cubeList.add(new ModelBox(body, 12, 11, -0.5F, 0.0902F, -9.1792F, 1, 1, 5, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 0.2F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 29, -1.0F, 0.2F, -4.7F, 1, 1, 5, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -9.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.176F, 0.1289F, -0.0229F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.4F, -4.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 34, -1.0F, 0.5174F, -0.0015F, 1, 1, 5, -0.15F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(2.9F, 4.8709F, -3.1339F);
        this.chest.addChild(ArmL);
        this.setRotateAngle(ArmL, -0.7348F, 0.2394F, -0.5325F);


        this.ElbowL = new ModelRenderer(this);
        this.ElbowL.setRotationPoint(0.1722F, 2.6944F, 2.5395F);
        this.ArmL.addChild(ElbowL);
        this.setRotateAngle(ElbowL, -0.6894F, 0.0F, 0.0F);


        this.HandL = new ModelRenderer(this);
        this.HandL.setRotationPoint(-0.2F, 2.6586F, -0.9608F);
        this.ElbowL.addChild(HandL);
        this.setRotateAngle(HandL, -0.0756F, 0.0436F, 0.6267F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(-2.9F, 4.8709F, -3.1339F);
        this.chest.addChild(ArmL2);
        this.setRotateAngle(ArmL2, 0.1923F, -0.3726F, 0.5986F);


        this.ElbowL2 = new ModelRenderer(this);
        this.ElbowL2.setRotationPoint(-0.1722F, 2.6944F, 2.5395F);
        this.ArmL2.addChild(ElbowL2);
        this.setRotateAngle(ElbowL2, -0.6894F, 0.0F, 0.0F);


        this.HandL2 = new ModelRenderer(this);
        this.HandL2.setRotationPoint(0.2F, 2.6586F, -0.9608F);
        this.ElbowL2.addChild(HandL2);
        this.setRotateAngle(HandL2, -0.0791F, -0.0368F, -0.5396F);


        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.8F, -4.7F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.3124F, 0.2079F, -0.0666F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.0F, -2.9F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2793F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 39, -1.0F, -0.0465F, -0.2174F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.4F, -2.9F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.3423F, 0.1116F, 0.0526F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, -2.9F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 27, -1.0F, -0.3F, -0.2F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4F, -2.9F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1564F, 0.2518F, 0.0571F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.5F, -4.3F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 36, -1.0F, 0.7117F, 0.4711F, 1, 1, 5, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.2384F, 0.088F, 0.1994F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 26, -0.5F, 0.5F, 0.0F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1173F, 0.1839F, 0.065F);


        this.leftCrest = new ModelRenderer(this);
        this.leftCrest.setRotationPoint(0.4F, 0.8167F, -6.6333F);
        this.head.addChild(leftCrest);
        this.setRotateAngle(leftCrest, 0.0F, 0.0F, -0.1571F);


        this.rightCrest = new ModelRenderer(this);
        this.rightCrest.setRotationPoint(-0.4F, 0.8167F, -6.6333F);
        this.head.addChild(rightCrest);
        this.setRotateAngle(rightCrest, 0.0F, 0.0F, 0.1571F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.8F, 0.8F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7156F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.4F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0252F, -0.1465F, 0.0047F);
        this.tail.cubeList.add(new ModelBox(tail, -1, 25, -0.5F, 0.2F, -0.3F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2376F, -0.1273F, -0.0307F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 11, -0.5F, 0.1F, 0.0F, 1, 1, 10, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1047F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 12, -0.5F, 0.0F, -0.4F, 1, 1, 12, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2833F, 0.1677F, -0.0486F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.1F, 0.0F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3604F, 0.2457F, -0.0914F);
        this.tail5.cubeList.add(new ModelBox(tail5, 16, 23, -0.5F, -0.1F, 0.0F, 1, 1, 9, -0.15F, false));

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
