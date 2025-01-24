package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMalawisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;
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
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer eyes;
    private final ModelRenderer jaws;
    private final ModelRenderer throat;

    public ModelSkeletonMalawisaurusFrame() {
        this.textureWidth = 138;
        this.textureHeight = 138;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 1.75F, 8.75F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -1.7F, -0.2F, 1, 24, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-4.5F, 0.8F, -23.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2793F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.6F, -9.5F, -0.5F, 1, 31, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5F, 0.8F, -23.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2793F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.5F, -7.5F, -0.5F, 1, 15, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.8F, 0.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 0.4F, -5.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.3985F, -3.4374F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2967F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 63, 13, 0.0F, 0.9F, -0.2F, 1, 2, 9, 0.0F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.5F, 0.2425F, 0.5151F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 1.0472F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, -0.5092F, -12.6231F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3491F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 2.3078F, -8.0265F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.1745F, 0.0F, 0.0F);


        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, -4.2364F, 10.5139F);
        this.leftLeg3.addChild(leftLeg8);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.5F, 0.2425F, 0.5151F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 1.6144F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, -0.5092F, -12.6231F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3054F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 2.3078F, -8.0265F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3491F, 0.0F, 0.0F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, -4.2364F, 10.5139F);
        this.rightLeg3.addChild(rightLeg8);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.3834F, 4.951F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1646F, -0.3016F, 0.0493F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 73, -0.5F, 0.4F, -0.6F, 1, 2, 7, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0207F, 6.8775F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.3001F, -0.504F, 0.1483F);
        this.tail2.cubeList.add(new ModelBox(tail2, 56, 0, -0.5F, 0.4F, -0.3F, 1, 2, 10, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2258F, 9.9945F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2875F, 0.4205F, 0.1201F);
        this.tail3.cubeList.add(new ModelBox(tail3, -1, 62, -0.5F, 0.1F, -0.8F, 1, 2, 9, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4303F, 7.6892F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1718F, 0.4016F, -0.0139F);
        this.tail4.cubeList.add(new ModelBox(tail4, 60, 31, -0.5F, 0.5F, -0.1F, 1, 1, 11, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1609F, 10.8678F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2846F, 0.5421F, -0.0896F);
        this.tail5.cubeList.add(new ModelBox(tail5, 85, 10, -0.5F, 0.4F, -0.2F, 1, 1, 7, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0014F, 6.7695F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3783F, 0.6194F, -0.2268F);
        this.tail6.cubeList.add(new ModelBox(tail6, 85, 19, -0.5F, 0.4F, -0.1F, 1, 1, 7, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.1438F, 6.6625F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.257F, 0.5522F, -0.137F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 16, -0.5F, 0.2F, 0.0F, 1, 1, 15, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.25F, -3.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0035F, 0.2173F, 0.0198F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.8471F, -12.0912F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3578F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 33, -0.5F, 1.0F, 0.1F, 1, 2, 13, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -4.9F, -12.1F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0516F, 0.0438F, -0.0068F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.3918F, -4.2268F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 49, -0.5F, 0.7F, -6.6F, 1, 2, 11, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(6.8412F, 9.3692F, -8.4198F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2182F, 0.0F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.4079F, 10.0292F, -0.9229F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7854F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(4.8937F, 8.0381F, -1.0502F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.5236F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.8412F, 9.3692F, -8.4198F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8727F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.4079F, 10.0292F, -0.9229F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.829F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-4.8937F, 8.0381F, -1.0502F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.7854F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.883F, -10.6892F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.523F, 0.6368F, -0.1191F);
        this.neck1.cubeList.add(new ModelBox(neck1, 60, 57, -0.5F, 0.0F, -8.8F, 1, 2, 9, 0.005F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6924F, -8.5348F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.0067F, 0.4444F, 0.2003F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.2019F, -12.1278F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1571F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 16, -0.5F, 0.7F, -0.4F, 1, 1, 13, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.7F, -12.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1646F, 0.6364F, 0.2725F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -2.1656F, -10.9988F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1572F, 0.0345F, -0.0055F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 60, 44, -0.2F, 0.65F, 0.1F, 1, 1, 11, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.783F, -10.8451F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.322F, 0.5279F, 0.3073F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.85F, -4.9F);
        this.neck4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 100, 54, -0.5F, 0.7F, 0.0F, 1, 1, 5, -0.15F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.4766F, -4.8099F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.3373F, 0.3013F, 0.0885F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.75F, -7.0F);
        this.neck5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 85, 28, -1.0F, 0.7F, -0.1F, 1, 1, 7, -0.15F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.3012F, -7.0438F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.5223F, 0.2333F, 0.0092F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.6F, -5.9F);
        this.neck6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 81, 90, -0.5F, 0.5F, 0.0F, 1, 1, 6, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0276F, -5.8885F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.2492F, 0.1441F, -0.0157F);


        this.eyes = new ModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.7F, -1.45F);
        this.head.addChild(eyes);


        this.jaws = new ModelRenderer(this);
        this.jaws.setRotationPoint(0.0F, 1.4799F, 0.0642F);
        this.head.addChild(jaws);
        this.setRotateAngle(jaws, -0.0873F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.2921F, -1.9058F);
        this.jaws.addChild(throat);
        this.setRotateAngle(throat, 0.0873F, 0.0F, 0.0F);

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
