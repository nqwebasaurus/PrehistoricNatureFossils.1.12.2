package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDeuterosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftbacktoe;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightbacktoe;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r11;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer leftfronttoe;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer rightfronttoe;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;

    public ModelSkeletonDeuterosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 53, 3.0F, -21.0F, -11.2F, 1, 21, 1, -0.2F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 39, 57, -0.5F, -18.0F, 13.7F, 1, 18, 1, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.5F, 14.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 76, 5.0F, -5.5F, -0.5F, 1, 11, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.5F, -10.5F, -10.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 80, 2.5F, -5.5F, -0.5F, 1, 11, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -17.7278F, 15.059F);
        this.fossil.addChild(hips);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.1495F, 1.6975F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 32, -1.5F, -0.4F, -7.7F, 2, 2, 9, -0.2F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(3.7495F, 3.3023F, 1.1411F);
        this.hips.addChild(leftleg);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(6.2066F, 3.5909F, -6.6136F);
        this.leftleg.addChild(leftleg2);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.2764F, 9.3965F, 2.4361F);
        this.leftleg2.addChild(leftfoot);


        this.leftbacktoe = new ModelRenderer(this);
        this.leftbacktoe.setRotationPoint(0.0F, 0.75F, -3.75F);
        this.leftfoot.addChild(leftbacktoe);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-3.7495F, 3.3023F, 1.1411F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.3491F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-6.2066F, 3.5909F, -6.6136F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.5236F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.2764F, 9.3965F, 2.4361F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.1745F, 0.0F, 0.0F);


        this.rightbacktoe = new ModelRenderer(this);
        this.rightbacktoe.setRotationPoint(0.0F, 0.75F, -3.75F);
        this.rightfoot.addChild(rightbacktoe);
        this.setRotateAngle(rightbacktoe, -0.2618F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.3733F, 3.0986F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.2182F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 9.6035F, 21.0387F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 12, -1.5F, 3.2281F, -23.2522F, 2, 2, 8, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 3.4942F, 5.8159F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1745F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.1146F, -0.6239F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 8, -1.0F, -1.9184F, -0.2827F, 2, 2, 6, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.6081F, 4.4866F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 4.5012F, 10.7362F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 23, -1.0F, -1.1478F, -11.6611F, 1, 1, 8, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 2.1434F, 7.3219F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, -0.3491F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.4578F, 4.1142F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 19, 0.0F, -0.772F, -4.5064F, 1, 1, 10, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.2014F, 9.2303F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, -0.3054F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2436F, -5.116F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, -0.5F, 0.6844F, 4.9827F, 1, 1, 10, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.742F, -4.422F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.6195F, -8.779F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 4, -1.5F, 0.9381F, -0.3049F, 2, 2, 9, -0.2F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.9474F, -8.8907F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0873F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0328F, -9.8464F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, 0.838F, -0.2432F, 2, 2, 10, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2328F, -9.8464F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.3F, -5.8F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 60, -1.0F, 0.0F, 0.8F, 2, 2, 5, -0.2F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.1313F, 10.7628F, -2.417F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.5208F, 0.3352F, 0.5208F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(5.6067F, 1.6748F, 4.6032F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.1745F, 0.0F, -0.3927F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(1.3254F, 8.7743F, -3.5379F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.8216F, 0.1382F, -0.1069F);


        this.leftfronttoe = new ModelRenderer(this);
        this.leftfronttoe.setRotationPoint(0.0F, 0.75F, -3.0F);
        this.lefthand.addChild(leftfronttoe);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.1313F, 10.7628F, -2.417F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, 0.2182F, 0.0F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-5.6067F, 1.6748F, 4.6032F);
        this.rightarm.addChild(rightarm2);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-1.3254F, 8.7743F, -3.5379F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.1309F, 0.0F);


        this.rightfronttoe = new ModelRenderer(this);
        this.rightfronttoe.setRotationPoint(0.0F, 0.75F, -3.0F);
        this.righthand.addChild(rightfronttoe);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1624F, -4.8867F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.132F, 0.1298F, 0.0172F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -1.0706F, -2.4282F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2094F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 75, 76, -1.0F, 0.6607F, -0.9867F, 1, 2, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.9706F, -3.4282F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3604F, 0.2457F, -0.0914F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.4914F, -1.8695F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 77, 32, -0.525F, 0.0F, -1.6F, 1, 2, 4, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3702F, -3.7706F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0257F, 0.3804F, 0.1097F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4017F, -0.0496F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4625F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.5217F, 0.0157F);
        this.jaw.addChild(throat);

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
