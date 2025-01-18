package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKranosauraFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonKranosauraFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(4.4F, -15.0F, -11.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -1.0F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.4F, -15.0F, -11.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 4.5F, -4.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, -10.4F, 11.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0522F, 0.0037F, 1.5011F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -0.5F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.1F, -12.5F, 11.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0524F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 1, -0.6F, -0.5F, -0.5F, 1, 13, 1, -0.16F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -16.0F, -2.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.3054F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 26, 47, -0.5F, -1.1941F, 10.6822F, 1, 2, 9, 0.007F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, 0.5345F, 14.7008F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.7571F, -0.5843F, -0.2297F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5632F, 7.1013F, 1.4947F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.6581F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.606F, 5.9067F, 1.1317F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6545F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.0758F, 1.7683F, -0.0054F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1396F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, 0.5345F, 14.7008F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0308F, 0.1006F, 0.0614F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5632F, 7.1013F, 1.4947F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.4399F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.606F, 5.9067F, 1.1317F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6545F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0758F, 1.7683F, -0.0054F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.2967F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.5525F, 19.6895F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2288F, -0.1275F, 0.0296F);
        this.tail1.cubeList.add(new ModelBox(tail1, 1, 38, -0.5F, 0.3611F, -0.2122F, 1, 2, 10, 0.005F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4632F, 9.7223F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3058F, -0.1625F, -0.2254F);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 19, -0.5F, 0.4552F, -0.6652F, 1, 1, 12, -0.156F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 30, -0.5F, 0.4552F, 11.0348F, 1, 1, 1, -0.156F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.265F, 11.7962F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2434F, -0.5969F, -0.1387F);
        this.tail3.cubeList.add(new ModelBox(tail3, 45, 0, -0.5F, 0.1968F, -0.5566F, 1, 1, 11, -0.156F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5306F, 10.69F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0443F, -0.1744F, -0.0077F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.2819F, -24.5974F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.096F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 19, -0.5F, -0.5824F, 8.8646F, 1, 2, 16, 0.003F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.3559F, -15.7262F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0233F, -0.13F, -0.0463F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.8517F, -9.0953F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 33, -0.5F, 0.4351F, -0.7235F, 1, 2, 10, 0.007F, false));

        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(4.3069F, 8.0157F, -4.4103F);
        this.chest.addChild(armL);
        this.setRotateAngle(armL, 0.1438F, 0.514F, 0.1615F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(0.5902F, 0.0425F, 6.3242F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.4411F, 0.1613F, 0.0301F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.1303F, 5.8919F, 0.8577F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0178F, -1.1083F, 0.4905F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-4.3069F, 8.0157F, -4.4103F);
        this.chest.addChild(armL4);
        this.setRotateAngle(armL4, -0.3701F, -0.8033F, -0.0362F);


        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(-0.5902F, 0.0425F, 6.3242F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, 0.4411F, -0.1613F, -0.0301F);


        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(-0.1303F, 5.8919F, 0.8577F);
        this.armL5.addChild(armL6);
        this.setRotateAngle(armL6, 0.24F, 1.1038F, 0.0001F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 2.2258F, -9.1835F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0984F, -0.4301F, 0.0234F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2399F, -4.3419F);
        this.neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 47, -0.5F, 0.3785F, -3.5645F, 1, 2, 8, 0.003F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1622F, -7.7403F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.2778F, -0.3367F, -0.0939F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 68, -0.5F, 0.4096F, -4.3761F, 1, 2, 4, 0.007F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.8645F, -5.1168F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 1.3963F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9004F, -0.9289F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1047F, 0.0F, 0.0F);

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
