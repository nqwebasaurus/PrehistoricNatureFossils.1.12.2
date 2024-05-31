package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTorvosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer head;
    private final ModelRenderer immobile;
    private final ModelRenderer immobile2;
    private final ModelRenderer immobile3;
    private final ModelRenderer immobile4;
    private final ModelRenderer immobile5;
    private final ModelRenderer immobile6;
    private final ModelRenderer immobile8;
    private final ModelRenderer immobile9;
    private final ModelRenderer immobile13;
    private final ModelRenderer immobile15;
    private final ModelRenderer jaw;
    private final ModelRenderer immobile10;
    private final ModelRenderer immobile11;
    private final ModelRenderer immobile12;
    private final ModelRenderer immobile14;
    private final ModelRenderer immobile7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer LeftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer RightArm3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r11;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r12;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r13;
    private final ModelRenderer tail7;
    private final ModelRenderer cube_r14;
    private final ModelRenderer Leftleg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer Rightleg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;

    public ModelSkeletonTorvosaurusFrame() {
        this.textureWidth = 140;
        this.textureHeight = 140;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -37.0F, 5.3F, 2, 37, 2, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0912F, -27.1088F, -21.7397F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3901F, -0.0357F, 1.697F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -6.5F, -1.0F, 2, 16, 2, -0.3F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, -18.5F, -21.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.55F, -17.5F, -1.0F, 2, 36, 2, -0.3F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -18.5F, 6.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -19.5F, -4.9F, -1.0F, 2, 9, 2, -0.3F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -38.75F, 4.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 22, 15, -1.0F, 0.4F, -7.0F, 2, 2, 17, -0.3F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, -5.9F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.22F, 0.1278F, 0.0285F);
        this.body.cubeList.add(new ModelBox(body, 44, 64, -1.0F, 0.1334F, -21.4812F, 2, 2, 12, -0.3F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3622F, -10.3813F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 71, 37, -1.0F, 1.5234F, -0.1886F, 2, 2, 10, -0.3F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.3622F, -21.3813F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.312F, 0.2285F, 0.0774F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0254F, 2.6905F, -0.5479F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 84, -1.0F, -1.2038F, -7.5842F, 2, 2, 8, -0.3F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0254F, -1.3095F, -6.4479F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3518F, 0.123F, -0.045F);
        this.neck.cubeList.add(new ModelBox(neck, 15, 88, -1.0F, 1.1807F, -7.7263F, 2, 2, 8, -0.3F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.2193F, -6.0263F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2679F, 0.2106F, -0.0573F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.4167F, -4.0217F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 105, 0, -1.0F, -1.1307F, -0.5057F, 2, 2, 4, -0.3F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0231F, -4.1243F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1806F, 0.2577F, 0.0465F);
        this.neck3.cubeList.add(new ModelBox(neck3, 99, 88, -1.0F, 1.2091F, -5.2958F, 2, 2, 6, -0.3F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.1909F, -5.2458F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.4152F, 0.3215F, 0.1384F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.4304F, -0.4469F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 96, 108, -1.0F, -0.9389F, -3.3987F, 2, 2, 4, -0.3F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3696F, -2.8469F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.5542F, -0.2906F, 0.029F);


        this.immobile = new ModelRenderer(this);
        this.immobile.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.head.addChild(immobile);
        this.setRotateAngle(immobile, 0.0436F, 0.0F, 0.0F);


        this.immobile2 = new ModelRenderer(this);
        this.immobile2.setRotationPoint(0.0F, 8.0F, -10.0F);
        this.immobile.addChild(immobile2);
        this.setRotateAngle(immobile2, -0.3491F, 0.0F, 0.0F);


        this.immobile3 = new ModelRenderer(this);
        this.immobile3.setRotationPoint(0.0F, -2.0F, -5.5F);
        this.immobile2.addChild(immobile3);
        this.setRotateAngle(immobile3, -0.0873F, 0.0F, 0.0F);


        this.immobile4 = new ModelRenderer(this);
        this.immobile4.setRotationPoint(0.0F, -6.0F, -6.0F);
        this.immobile2.addChild(immobile4);
        this.setRotateAngle(immobile4, 0.7854F, 0.0F, 0.0F);


        this.immobile5 = new ModelRenderer(this);
        this.immobile5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile4.addChild(immobile5);
        this.setRotateAngle(immobile5, -0.3927F, 0.0F, 0.0F);


        this.immobile6 = new ModelRenderer(this);
        this.immobile6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile5.addChild(immobile6);
        this.setRotateAngle(immobile6, -0.1091F, 0.0F, 0.0F);


        this.immobile8 = new ModelRenderer(this);
        this.immobile8.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.immobile6.addChild(immobile8);
        this.setRotateAngle(immobile8, 0.0427F, 0.1004F, -0.0013F);


        this.immobile9 = new ModelRenderer(this);
        this.immobile9.setRotationPoint(-1.0F, -1.0F, 4.0F);
        this.immobile8.addChild(immobile9);
        this.setRotateAngle(immobile9, 0.0192F, 0.0878F, 0.0114F);


        this.immobile13 = new ModelRenderer(this);
        this.immobile13.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.immobile6.addChild(immobile13);
        this.setRotateAngle(immobile13, 0.0427F, -0.1004F, 0.0013F);


        this.immobile15 = new ModelRenderer(this);
        this.immobile15.setRotationPoint(1.0F, -1.0F, 4.0F);
        this.immobile13.addChild(immobile15);
        this.setRotateAngle(immobile15, 0.0192F, -0.0878F, -0.0114F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 6.2F, 0.6F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1737F, 0.0F, 0.0F);


        this.immobile10 = new ModelRenderer(this);
        this.immobile10.setRotationPoint(0.0F, -1.6105F, -7.6476F);
        this.jaw.addChild(immobile10);
        this.setRotateAngle(immobile10, 0.192F, 0.0F, 0.0F);


        this.immobile11 = new ModelRenderer(this);
        this.immobile11.setRotationPoint(0.0F, 3.0F, -10.0F);
        this.immobile10.addChild(immobile11);
        this.setRotateAngle(immobile11, -0.2182F, 0.0F, 0.0F);


        this.immobile12 = new ModelRenderer(this);
        this.immobile12.setRotationPoint(0.0F, 3.0F, -10.0F);
        this.immobile10.addChild(immobile12);
        this.setRotateAngle(immobile12, -0.3491F, 0.0F, 0.0F);


        this.immobile14 = new ModelRenderer(this);
        this.immobile14.setRotationPoint(3.5F, -2.0F, -7.0F);
        this.head.addChild(immobile14);
        this.setRotateAngle(immobile14, 0.2182F, 0.2182F, 0.0F);


        this.immobile7 = new ModelRenderer(this);
        this.immobile7.setRotationPoint(-3.5F, -2.0F, -7.0F);
        this.head.addChild(immobile7);
        this.setRotateAngle(immobile7, 0.2182F, -0.2182F, 0.0F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(7.0254F, 10.2905F, -3.9479F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, -1.5997F, 0.2257F, -0.3262F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.57F, 0.2302F, 6.9371F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.762F, -0.1509F, 0.2666F);


        this.LeftArm3 = new ModelRenderer(this);
        this.LeftArm3.setRotationPoint(0.3F, 0.35F, 6.7742F);
        this.leftArm2.addChild(LeftArm3);
        this.setRotateAngle(LeftArm3, 0.0F, -0.0873F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-6.9746F, 10.2905F, -3.9479F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, -1.4597F, -0.21F, 0.2845F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.57F, 0.2302F, 6.9371F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3586F, 0.1903F, -0.4391F);


        this.RightArm3 = new ModelRenderer(this);
        this.RightArm3.setRotationPoint(-0.3F, 0.35F, 6.7742F);
        this.rightArm2.addChild(RightArm3);
        this.setRotateAngle(RightArm3, 0.0F, 0.829F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 9.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.088F, -0.1304F, 0.0115F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0076F, -0.1743F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 32, -1.0F, 1.1F, 0.0F, 2, 2, 15, -0.3F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7424F, 14.0257F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.044F, -0.1308F, -0.0057F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(4.32F, 0.9932F, -0.1126F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 11, -5.3F, 0.8F, 0.0F, 2, 2, 17, -0.3F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.3568F, 16.0874F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.131F, -0.0433F, -0.0057F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.6553F, 0.293F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1222F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 21, 45, -1.0F, -0.9981F, -0.1883F, 2, 2, 14, -0.3F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.9947F, 13.693F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0443F, 0.1744F, -0.0077F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.7483F, 0.188F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 0, -0.5F, 0.6F, 0.0F, 1, 1, 15, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0017F, 14.888F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1664F, 0.1742F, -0.0257F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.1736F, -0.3848F);
        this.tail5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 70, -0.4995F, 0.0049F, -0.1696F, 1, 1, 12, -0.3F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.8764F, 10.5152F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.132F, 0.1298F, -0.0172F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.0459F, -0.326F);
        this.tail6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 0, -0.4911F, 0.3083F, 0.0438F, 1, 1, 13, -0.3F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.5959F, 12.674F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2233F, 0.2129F, -0.0479F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.0239F, -0.2083F);
        this.tail7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 47, 29, -0.3F, 0.3F, -1.0F, 1, 1, 16, -0.3F, false));

        this.Leftleg = new ModelRenderer(this);
        this.Leftleg.setRotationPoint(6.2F, 0.0F, 2.0F);
        this.hips.addChild(Leftleg);
        this.setRotateAngle(Leftleg, 0.0436F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-2.0F, 16.5961F, -0.6334F);
        this.Leftleg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6504F, -0.0795F, 0.1041F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 13.0505F, 3.991F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.48F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 10.5F, -1.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2597F, 0.0338F, -0.1265F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.3927F, 0.0F, 0.0F);


        this.Rightleg = new ModelRenderer(this);
        this.Rightleg.setRotationPoint(-6.2F, 0.0F, 2.0F);
        this.hips.addChild(Rightleg);
        this.setRotateAngle(Rightleg, -0.7617F, 0.2143F, 0.2194F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(2.0F, 16.5961F, -0.6334F);
        this.Rightleg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3391F, 0.3405F, -0.0786F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 13.0505F, 3.991F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 10.5F, -1.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.8727F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.3927F, 0.0F, 0.0F);

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
