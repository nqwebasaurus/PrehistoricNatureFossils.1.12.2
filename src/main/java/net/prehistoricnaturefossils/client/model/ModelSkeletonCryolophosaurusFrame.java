package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCryolophosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer immobile;
    private final ModelRenderer immobile2;
    private final ModelRenderer immobile3;
    private final ModelRenderer immobile4;
    private final ModelRenderer immobile5;
    private final ModelRenderer immobile6;
    private final ModelRenderer immobile7;
    private final ModelRenderer immobile8;
    private final ModelRenderer immobile9;
    private final ModelRenderer immobile10;
    private final ModelRenderer immobile13;
    private final ModelRenderer immobile14;
    private final ModelRenderer jaw;
    private final ModelRenderer immobile11;
    private final ModelRenderer immobile12;
    private final ModelRenderer throatPouch3;
    private final ModelRenderer throatPouch;
    private final ModelRenderer throatPouch2;
    private final ModelRenderer armLeft;
    private final ModelRenderer armLeft2;
    private final ModelRenderer handLeft;
    private final ModelRenderer armRight;
    private final ModelRenderer armRight2;
    private final ModelRenderer handRight;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer legLeft;
    private final ModelRenderer legLeft2;
    private final ModelRenderer legLeft3;
    private final ModelRenderer footLeft;
    private final ModelRenderer footLeft2;
    private final ModelRenderer legRight;
    private final ModelRenderer legRight2;
    private final ModelRenderer legRight3;
    private final ModelRenderer footRight;
    private final ModelRenderer footRight2;

    public ModelSkeletonCryolophosaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -27.0F, -17.0F, 1, 27, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -27.0F, 6.3F, 1, 27, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -18.0F, 6.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -6.8F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, -18.0F, -16.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.7F, -5.0F, -0.5F, 1, 10, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -27.25F, 3.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.2867F, -2.6255F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 32, -1.0F, -0.3939F, -0.5695F, 1, 1, 12, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.9867F, -3.2255F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 34, 16, -0.5F, 0.2418F, -10.7879F, 1, 1, 11, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.1418F, -10.7879F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.2182F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.2183F, -5.7115F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 53, -1.0F, -0.3303F, -0.1684F, 1, 1, 6, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.5457F, -9.7788F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 64, -1.0F, -0.2549F, 0.1597F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2531F, -8.8153F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5688F, 0.0774F, -0.0404F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, 0.2929F, -5.9351F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 0, -2.491F, 0.1185F, -0.1199F, 1, 1, 6, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2929F, -5.3351F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.8278F, 0.1821F, -0.0699F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2F, 1.0F, 0.0464F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2274F, 0.068F, 0.0157F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 38, -0.6406F, -0.8565F, -5.7631F, 1, 1, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.0F, -4.8536F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1883F, 0.2129F, 0.2661F);
        this.neck3.cubeList.add(new ModelBox(neck3, 7, 69, -0.4084F, -1.5927F, -7.5918F, 1, 1, 3, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.6609F, -4.279F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 25, -0.9084F, 0.2221F, -0.3815F, 1, 1, 5, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.9609F, -6.279F);
        this.neck3.addChild(head);


        this.immobile = new ModelRenderer(this);
        this.immobile.setRotationPoint(0.0F, 2.7954F, -4.0521F);
        this.head.addChild(immobile);


        this.immobile2 = new ModelRenderer(this);
        this.immobile2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile.addChild(immobile2);
        this.setRotateAngle(immobile2, 0.1745F, 0.0F, 0.0F);


        this.immobile3 = new ModelRenderer(this);
        this.immobile3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile2.addChild(immobile3);
        this.setRotateAngle(immobile3, -0.0873F, 0.0F, 0.0F);


        this.immobile4 = new ModelRenderer(this);
        this.immobile4.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.immobile2.addChild(immobile4);
        this.setRotateAngle(immobile4, 0.0436F, 0.0F, 0.0F);


        this.immobile5 = new ModelRenderer(this);
        this.immobile5.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.immobile4.addChild(immobile5);
        this.setRotateAngle(immobile5, 0.829F, 0.0F, 0.0F);


        this.immobile6 = new ModelRenderer(this);
        this.immobile6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile5.addChild(immobile6);
        this.setRotateAngle(immobile6, -0.4669F, 0.0F, 0.0F);


        this.immobile7 = new ModelRenderer(this);
        this.immobile7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile6.addChild(immobile7);
        this.setRotateAngle(immobile7, -0.1745F, 0.0F, 0.0F);


        this.immobile8 = new ModelRenderer(this);
        this.immobile8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile7.addChild(immobile8);
        this.setRotateAngle(immobile8, -0.1658F, 0.0F, 0.0F);


        this.immobile9 = new ModelRenderer(this);
        this.immobile9.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile9);
        this.setRotateAngle(immobile9, 0.0443F, 0.1744F, 0.0077F);


        this.immobile10 = new ModelRenderer(this);
        this.immobile10.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.immobile9.addChild(immobile10);
        this.setRotateAngle(immobile10, 0.4816F, -0.0756F, -0.0437F);


        this.immobile13 = new ModelRenderer(this);
        this.immobile13.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile13);
        this.setRotateAngle(immobile13, 0.0443F, -0.1744F, -0.0077F);


        this.immobile14 = new ModelRenderer(this);
        this.immobile14.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.immobile13.addChild(immobile14);
        this.setRotateAngle(immobile14, 0.4816F, 0.0756F, 0.0437F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.7954F, -0.0521F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.288F, 0.0F, 0.0F);


        this.immobile11 = new ModelRenderer(this);
        this.immobile11.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(immobile11);
        this.setRotateAngle(immobile11, 0.2182F, 0.0F, 0.0F);


        this.immobile12 = new ModelRenderer(this);
        this.immobile12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile11.addChild(immobile12);


        this.throatPouch3 = new ModelRenderer(this);
        this.throatPouch3.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.jaw.addChild(throatPouch3);
        this.setRotateAngle(throatPouch3, -0.3054F, 0.0F, 0.0F);


        this.throatPouch = new ModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 2.8391F, -2.279F);
        this.neck3.addChild(throatPouch);
        this.setRotateAngle(throatPouch, 0.4363F, 0.0F, 0.0F);


        this.throatPouch2 = new ModelRenderer(this);
        this.throatPouch2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, -0.3927F, 0.0F, 0.0F);


        this.armLeft = new ModelRenderer(this);
        this.armLeft.setRotationPoint(5.1F, 6.8531F, -7.4153F);
        this.chest.addChild(armLeft);
        this.setRotateAngle(armLeft, 0.1249F, 0.2577F, -0.0465F);


        this.armLeft2 = new ModelRenderer(this);
        this.armLeft2.setRotationPoint(0.0891F, 5.4645F, 0.3675F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, -0.7399F, 0.0589F, 0.0644F);


        this.handLeft = new ModelRenderer(this);
        this.handLeft.setRotationPoint(-0.1138F, 4.3685F, -0.6828F);
        this.armLeft2.addChild(handLeft);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.5672F);


        this.armRight = new ModelRenderer(this);
        this.armRight.setRotationPoint(-5.1F, 6.8531F, -7.4153F);
        this.chest.addChild(armRight);
        this.setRotateAngle(armRight, 0.823F, -0.2577F, 0.0465F);


        this.armRight2 = new ModelRenderer(this);
        this.armRight2.setRotationPoint(-0.0891F, 5.4645F, 0.3675F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, -0.9144F, -0.0589F, -0.0644F);


        this.handRight = new ModelRenderer(this);
        this.handRight.setRotationPoint(0.1138F, 4.3685F, -0.6828F);
        this.armRight2.addChild(handRight);
        this.setRotateAngle(handRight, 0.0F, 0.0F, -0.7418F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3717F, 8.3345F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0876F, 0.0869F, 0.0076F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4142F, 0.1512F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 32, -0.4985F, -0.2591F, -0.1701F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4791F, 8.5887F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.219F, 0.0852F, 0.0189F);
        this.tail2.cubeList.add(new ModelBox(tail2, 43, 1, -0.5045F, 0.216F, -0.1195F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0443F, 8.2764F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.131F, 0.0433F, 0.0057F);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 1, -0.5098F, 0.3179F, 0.2016F, 1, 1, 13, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1496F, 12.8904F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.088F, -0.1304F, 0.0115F);
        this.tail4.cubeList.add(new ModelBox(tail4, 17, 16, -0.4984F, 0.1095F, 0.0867F, 1, 1, 14, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1497F, 13.3131F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1314F, -0.0865F, 0.0114F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 14, -0.4954F, 0.227F, -0.0538F, 1, 1, 14, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0762F, 13.894F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2214F, -0.1704F, 0.0381F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 30, -0.5046F, 0.1782F, -0.3346F, 1, 1, 13, -0.15F, false));

        this.legLeft = new ModelRenderer(this);
        this.legLeft.setRotationPoint(3.7F, 2.7133F, 3.9745F);
        this.hips.addChild(legLeft);
        this.setRotateAngle(legLeft, -0.3054F, 0.0F, 0.0F);


        this.legLeft2 = new ModelRenderer(this);
        this.legLeft2.setRotationPoint(0.6F, 10.1133F, -0.807F);
        this.legLeft.addChild(legLeft2);
        this.setRotateAngle(legLeft2, 0.8727F, 0.0F, 0.0F);


        this.legLeft3 = new ModelRenderer(this);
        this.legLeft3.setRotationPoint(0.2F, 9.8159F, 1.4617F);
        this.legLeft2.addChild(legLeft3);
        this.setRotateAngle(legLeft3, -0.7854F, 0.0F, 0.0F);


        this.footLeft = new ModelRenderer(this);
        this.footLeft.setRotationPoint(0.0F, 6.8586F, -0.6414F);
        this.legLeft3.addChild(footLeft);
        this.setRotateAngle(footLeft, 0.3491F, 0.0F, 0.0F);


        this.footLeft2 = new ModelRenderer(this);
        this.footLeft2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.footLeft.addChild(footLeft2);


        this.legRight = new ModelRenderer(this);
        this.legRight.setRotationPoint(-3.7F, 2.7133F, 3.9745F);
        this.hips.addChild(legRight);
        this.setRotateAngle(legRight, 0.2182F, 0.0F, 0.0F);


        this.legRight2 = new ModelRenderer(this);
        this.legRight2.setRotationPoint(-0.6F, 10.1133F, -0.807F);
        this.legRight.addChild(legRight2);
        this.setRotateAngle(legRight2, 1.1345F, 0.0F, 0.0F);


        this.legRight3 = new ModelRenderer(this);
        this.legRight3.setRotationPoint(-0.2F, 9.8159F, 1.4617F);
        this.legRight2.addChild(legRight3);
        this.setRotateAngle(legRight3, -0.9163F, 0.0F, 0.0F);


        this.footRight = new ModelRenderer(this);
        this.footRight.setRotationPoint(0.0F, 6.8586F, -0.6414F);
        this.legRight3.addChild(footRight);
        this.setRotateAngle(footRight, 0.4363F, 0.0F, 0.0F);


        this.footRight2 = new ModelRenderer(this);
        this.footRight2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.footRight.addChild(footRight2);

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
