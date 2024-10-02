package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLeptocleidusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer FrontFlipperR2;
    private final ModelRenderer FrontFlipperMiddleR2;
    private final ModelRenderer FrontFlipperEndR2;
    private final ModelRenderer FrontFlipperR3;
    private final ModelRenderer FrontFlipperMiddleR3;
    private final ModelRenderer FrontFlipperEndR3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer eye;
    private final ModelRenderer eye2;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer BackFlipperR2;
    private final ModelRenderer BackFlipperMiddleR2;
    private final ModelRenderer BackFlipperEndR2;
    private final ModelRenderer BackFlipperR3;
    private final ModelRenderer BackFlipperMiddleR3;
    private final ModelRenderer BackFlipperEndR3;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r12;

    public ModelSkeletonLeptocleidusFrame() {
        this.textureWidth = 73;
        this.textureHeight = 73;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -9.2F, -3.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, 0.0472F, 0.0006F, 0.0106F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, 1.2F, -5.3F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -2, 7, -3.0F, -0.2F, -0.5F, 1, 1, 10, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.65F, -5.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0526F, 0.0871F, 0.0046F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0458F, 3.676F, -4.5953F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5533F, 0.0698F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 18, -2.1F, -0.5F, -5.5F, 1, 1, 11, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0458F, 1.0823F, -4.7766F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.501F, -0.0174F, -0.0012F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 25, -0.5F, -0.5F, 0.1F, 1, 1, 4, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.0F, -7.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0698F, -0.0174F, -0.0012F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 22, 0.1F, -0.2F, -0.4F, 1, 1, 7, -0.2F, false));

        this.FrontFlipperR2 = new ModelRenderer(this);
        this.FrontFlipperR2.setRotationPoint(5.5F, 5.5551F, -4.9755F);
        this.body.addChild(FrontFlipperR2);
        this.setRotateAngle(FrontFlipperR2, -0.1328F, 0.4401F, 0.0767F);


        this.FrontFlipperMiddleR2 = new ModelRenderer(this);
        this.FrontFlipperMiddleR2.setRotationPoint(3.9522F, -0.071F, -0.3716F);
        this.FrontFlipperR2.addChild(FrontFlipperMiddleR2);
        this.setRotateAngle(FrontFlipperMiddleR2, -0.045F, -0.123F, 0.3518F);


        this.FrontFlipperEndR2 = new ModelRenderer(this);
        this.FrontFlipperEndR2.setRotationPoint(5.3469F, 0.0F, -0.8308F);
        this.FrontFlipperMiddleR2.addChild(FrontFlipperEndR2);
        this.setRotateAngle(FrontFlipperEndR2, 0.0F, -0.1309F, 0.0F);


        this.FrontFlipperR3 = new ModelRenderer(this);
        this.FrontFlipperR3.setRotationPoint(-5.5F, 5.5551F, -4.9755F);
        this.body.addChild(FrontFlipperR3);
        this.setRotateAngle(FrontFlipperR3, -0.2872F, -0.2378F, -0.383F);


        this.FrontFlipperMiddleR3 = new ModelRenderer(this);
        this.FrontFlipperMiddleR3.setRotationPoint(-3.9522F, -0.071F, -0.3716F);
        this.FrontFlipperR3.addChild(FrontFlipperMiddleR3);
        this.setRotateAngle(FrontFlipperMiddleR3, -0.0396F, 0.1248F, -0.3079F);


        this.FrontFlipperEndR3 = new ModelRenderer(this);
        this.FrontFlipperEndR3.setRotationPoint(-5.3469F, 0.0F, -0.8308F);
        this.FrontFlipperMiddleR3.addChild(FrontFlipperEndR3);
        this.setRotateAngle(FrontFlipperEndR3, 0.0F, 0.1309F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.45F, -7.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0432F, -0.0084F, -0.1704F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.2F, -8.0F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 11, 0.0F, -0.5F, -0.9F, 1, 1, 9, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.65F, -8.1F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.263F, 0.089F, 0.1093F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.6F, -5.9F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 34, -1.0F, -0.3F, -0.2F, 1, 1, 6, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.05F, -5.9F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0871F, 0.1692F, 0.1791F);
        this.neck3.cubeList.add(new ModelBox(neck3, 30, 29, -0.5F, 0.3F, -5.6F, 1, 1, 6, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1232F, -5.0162F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.283F, 0.2047F, -0.0942F);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(0.7996F, 0.1833F, -5.9863F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.2213F, 0.271F, -0.4931F);


        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(-0.7996F, 0.1833F, -5.9863F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2213F, -0.271F, 0.4931F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.9627F, 0.9064F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7505F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.9F, 3.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2094F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, -0.6893F, 0.156F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 37, -2.5F, 0.6F, 0.0F, 1, 1, 5, -0.2F, false));

        this.BackFlipperR2 = new ModelRenderer(this);
        this.BackFlipperR2.setRotationPoint(5.9F, 4.0611F, 4.9647F);
        this.tail.addChild(BackFlipperR2);
        this.setRotateAngle(BackFlipperR2, 0.2376F, -0.1233F, -0.0943F);


        this.BackFlipperMiddleR2 = new ModelRenderer(this);
        this.BackFlipperMiddleR2.setRotationPoint(3.9029F, 0.0189F, 0.7426F);
        this.BackFlipperR2.addChild(BackFlipperMiddleR2);
        this.setRotateAngle(BackFlipperMiddleR2, 0.0411F, -0.3027F, -0.1372F);


        this.BackFlipperEndR2 = new ModelRenderer(this);
        this.BackFlipperEndR2.setRotationPoint(6.6407F, 0.0F, -0.9261F);
        this.BackFlipperMiddleR2.addChild(BackFlipperEndR2);
        this.setRotateAngle(BackFlipperEndR2, 0.0F, -0.1309F, 0.0F);


        this.BackFlipperR3 = new ModelRenderer(this);
        this.BackFlipperR3.setRotationPoint(-4.9F, 4.0611F, 4.9647F);
        this.tail.addChild(BackFlipperR3);
        this.setRotateAngle(BackFlipperR3, 0.2376F, 0.1233F, 0.0943F);


        this.BackFlipperMiddleR3 = new ModelRenderer(this);
        this.BackFlipperMiddleR3.setRotationPoint(-3.9029F, 0.0189F, 0.7426F);
        this.BackFlipperR3.addChild(BackFlipperMiddleR3);
        this.setRotateAngle(BackFlipperMiddleR3, 0.0945F, 0.2909F, 0.3193F);


        this.BackFlipperEndR3 = new ModelRenderer(this);
        this.BackFlipperEndR3.setRotationPoint(-6.6407F, 0.0F, -0.9261F);
        this.BackFlipperMiddleR3.addChild(BackFlipperEndR3);
        this.setRotateAngle(BackFlipperEndR3, 0.0F, 0.1309F, 0.0F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6393F, 4.856F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1134F, 0.0F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 2.808F, 0.7365F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.5708F, 0.0873F, -1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 3, -2.3F, -0.5F, -5.5F, 1, 1, 11, -0.2F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.716F, 0.5534F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.4835F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 10, -0.5F, -0.5F, 0.1F, 1, 1, 4, -0.21F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.6824F, 0.0432F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 10, -0.5F, -0.3F, -0.1F, 1, 1, 4, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1176F, 3.4932F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1834F, -0.0429F, -0.008F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.3984F, 0.2742F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 40, -0.5F, 0.6F, -0.5F, 1, 1, 5, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6484F, 4.0242F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, -0.0435F, -0.0038F);
        this.tail4.cubeList.add(new ModelBox(tail4, 45, 45, 0.0F, 0.7F, 0.2F, 1, 1, 4, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.375F, 3.95F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.044F, 0.1308F, -0.0057F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.6F, 0.0F);
        this.tail5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 20, -0.5F, -0.3F, -0.1F, 1, 1, 8, -0.2F, false));

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
