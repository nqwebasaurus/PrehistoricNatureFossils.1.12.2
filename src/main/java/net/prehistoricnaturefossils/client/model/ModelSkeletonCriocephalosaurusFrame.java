package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCriocephalosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonCriocephalosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4924F, -15.5F, 16.0132F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.5F, -5.5F, -0.5F, 1, 9, 1, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.4924F, -15.5F, 16.0132F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.0F, -2.5F, -0.5F, 1, 18, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.8F, -15.5F, -11.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.0F, -6.0F, -0.5F, 1, 14, 1, 0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(2.8F, -15.5F, -11.5F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.5F, -8.5F, -0.5F, 1, 24, 1, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.0F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.3491F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 33, -1.0F, -1.1941F, 10.6822F, 2, 2, 9, -0.2F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(5.0F, 1.6295F, 16.5921F);
        this.hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0627F, -0.0111F, -0.5351F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.9075F, 7.8367F, -0.0294F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4636F, -0.0588F, 0.4991F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.3812F, 6.6047F, 1.3276F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.2169F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-5.0F, 1.6295F, 16.5921F);
        this.hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.4172F, 0.0111F, 0.5351F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(0.9075F, 7.8367F, -0.0294F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4636F, 0.0588F, -0.4991F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.3812F, 6.6047F, 1.3276F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -0.5224F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.5525F, 19.6895F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2288F, 0.1275F, -0.0296F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 48, -1.0F, 0.3611F, -0.2122F, 2, 2, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3611F, 6.7878F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3693F, 0.2449F, -0.0936F);
        this.tail2.cubeList.add(new ModelBox(tail2, 37, 30, -0.5F, 0.4619F, -0.8087F, 1, 1, 9, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0381F, 8.1913F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1174F, -0.2601F, -0.0303F);
        this.tail3.cubeList.add(new ModelBox(tail3, 59, 31, -0.5F, 0.4968F, -0.4566F, 1, 1, 7, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5525F, 11.1895F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.2819F, -24.5974F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.096F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, -0.5824F, 8.8646F, 2, 2, 16, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.5F, -15.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.7819F, -9.4974F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2007F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 19, -1.0F, 0.4351F, -0.7235F, 2, 2, 11, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.0F, 11.5F, -5.6F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.6545F, 0.48F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(8.6249F, 0.0765F, 0.5068F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.5444F, -0.2635F, 0.8472F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(8.3F, 0.0F, 0.5F);
        this.leftArm2.addChild(leftArm3);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.0F, 11.5F, -5.6F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.5781F, 0.0648F, -0.5295F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-8.6249F, 0.0765F, 0.5068F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.5194F, -0.1389F, -1.109F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-8.1F, 0.0F, 1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.0225F, 0.897F, -0.2034F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.9F, -9.4F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2963F, 0.1508F, 0.0445F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2399F, -4.3419F);
        this.neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 68, -1.0F, 0.3785F, -0.6645F, 2, 2, 6, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2601F, -4.7419F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.3079F, 0.1248F, 0.0396F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 77, -1.0F, 0.4096F, -4.3761F, 2, 2, 4, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.8F, -3.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1772F, 0.1719F, 0.0306F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.2612F, -2.6585F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);

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
