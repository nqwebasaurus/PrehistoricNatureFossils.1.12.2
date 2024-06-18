package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDesmatosuchusFrame extends ModelBase {
    private final ModelRenderer Desmatosuchus;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer body3;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r1;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer leftBackLeg;
    private final ModelRenderer leftBjoint;
    private final ModelRenderer leftBfoot;
    private final ModelRenderer rightBackLeg;
    private final ModelRenderer rightBjoint;
    private final ModelRenderer rightBfoot;
    private final ModelRenderer body2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer bodyfront;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftFrontLeg;
    private final ModelRenderer LeftFjoint;
    private final ModelRenderer LeftFFoot;
    private final ModelRenderer rightFrontLeg;
    private final ModelRenderer RightFjoint;
    private final ModelRenderer RightFFoot;

    public ModelSkeletonDesmatosuchusFrame() {
        this.textureWidth = 103;
        this.textureHeight = 103;

        this.Desmatosuchus = new ModelRenderer(this);
        this.Desmatosuchus.setRotationPoint(0.0F, 12.025F, -1.0F);
        this.Desmatosuchus.cubeList.add(new ModelBox(Desmatosuchus, 1, 1, -0.49F, -6.925F, 7.0F, 1, 19, 1, -0.1F, false));
        this.Desmatosuchus.cubeList.add(new ModelBox(Desmatosuchus, -3, 1, -5.0F, -5.525F, 7.02F, 10, 1, 1, -0.1F, false));
        this.Desmatosuchus.cubeList.add(new ModelBox(Desmatosuchus, 1, 1, -4.15F, -2.925F, -14.2F, 1, 15, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-3.7F, 0.775F, -13.72F);
        this.Desmatosuchus.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.2182F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -5.0F, -0.5F, -0.5F, 10, 1, 1, -0.1F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -8.6835F, 0.7253F);
        this.Desmatosuchus.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 0.3477F, 4.3285F);
        this.body3.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.0524F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 20, 56, 0.0F, -0.0986F, 0.1675F, 1, 1, 10, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4509F, 14.5459F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.0873F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.6F, 1.75F, -0.05F);
        this.tail.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0087F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 54, 45, 0.0F, -0.5F, -0.2F, 1, 1, 11, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 10.2F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.2618F, 0.0F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(-0.5F, 2.4F, -0.15F);
        this.tail2.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0506F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 48, 73, 0.0F, -1.0F, 0.0F, 1, 1, 8, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3F, 7.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.1309F, 0.0F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.8F, -0.3F);
        this.tail3.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.1222F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 73, 52, -0.5F, -0.5F, 0.1F, 1, 1, 7, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, -0.3054F, 0.0F);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, 0.9F, -0.6F);
        this.tail4.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, 0.0436F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 33, 69, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.3491F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.35F, 8.8F);
        this.tail5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 89, -0.5F, -0.54F, 0.0F, 1, 1, 4, -0.1F, false));

        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.0F, 1.45F, 0.5F);
        this.tail5.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, 0.0175F, 0.0F, -0.0008F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 69, 40, -0.5F, -0.5F, -0.5F, 1, 1, 9, -0.1F, false));

        this.leftBackLeg = new ModelRenderer(this);
        this.leftBackLeg.setRotationPoint(4.25F, 2.2991F, 6.7459F);
        this.body3.addChild(leftBackLeg);
        this.setRotateAngle(leftBackLeg, -0.2618F, 0.0F, 0.0F);


        this.leftBjoint = new ModelRenderer(this);
        this.leftBjoint.setRotationPoint(2.3F, 8.4187F, 2.8265F);
        this.leftBackLeg.addChild(leftBjoint);
        this.setRotateAngle(leftBjoint, 0.5236F, 0.0F, 0.0F);


        this.leftBfoot = new ModelRenderer(this);
        this.leftBfoot.setRotationPoint(-0.75F, 6.9697F, 1.8901F);
        this.leftBjoint.addChild(leftBfoot);
        this.setRotateAngle(leftBfoot, -0.2618F, 0.0F, 0.0F);


        this.rightBackLeg = new ModelRenderer(this);
        this.rightBackLeg.setRotationPoint(-4.25F, 2.2991F, 6.7459F);
        this.body3.addChild(rightBackLeg);
        this.setRotateAngle(rightBackLeg, -0.4363F, 0.0F, 0.0F);


        this.rightBjoint = new ModelRenderer(this);
        this.rightBjoint.setRotationPoint(-2.3F, 8.4187F, 2.8265F);
        this.rightBackLeg.addChild(rightBjoint);
        this.setRotateAngle(rightBjoint, 0.5236F, 0.0F, 0.0F);


        this.rightBfoot = new ModelRenderer(this);
        this.rightBfoot.setRotationPoint(0.75F, 6.9697F, 1.8901F);
        this.rightBjoint.addChild(rightBfoot);
        this.setRotateAngle(rightBfoot, -0.2618F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.9729F, 5.2362F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.248F, 0.1693F, 0.0426F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 3.4237F, -15.4436F);
        this.body2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.096F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 36, 0.0F, -0.9956F, 0.0999F, 1, 1, 15, -0.1F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 1.1572F, -15.4188F);
        this.body2.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0832F, 0.0434F, -0.0341F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 3.3996F, -10.3404F);
        this.bodyfront.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1396F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 0, 74, 0.0F, -0.6623F, 4.7578F, 1, 1, 6, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 3.3996F, -10.3404F);
        this.bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0698F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 82, 36, 0.0F, -1.0087F, 0.0004F, 1, 1, 5, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.3996F, -10.1404F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, 0.1317F, 0.0852F, 0.0189F);
        this.neck.cubeList.add(new ModelBox(neck, 77, 27, -0.5F, 1.0F, -6.0F, 1, 1, 6, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2F, -5.3F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5043F, -0.3189F, 0.0597F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4008F, -0.0796F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.leftFrontLeg = new ModelRenderer(this);
        this.leftFrontLeg.setRotationPoint(5.5F, 5.6647F, -6.3345F);
        this.bodyfront.addChild(leftFrontLeg);
        this.setRotateAngle(leftFrontLeg, -0.3491F, 0.2618F, -0.3491F);


        this.LeftFjoint = new ModelRenderer(this);
        this.LeftFjoint.setRotationPoint(-0.1369F, 7.1778F, 2.3426F);
        this.leftFrontLeg.addChild(LeftFjoint);
        this.setRotateAngle(LeftFjoint, -1.1345F, -0.0436F, 0.3491F);


        this.LeftFFoot = new ModelRenderer(this);
        this.LeftFFoot.setRotationPoint(-1.0436F, 5.341F, -1.5632F);
        this.LeftFjoint.addChild(LeftFFoot);
        this.setRotateAngle(LeftFFoot, 2.3126F, 0.0F, 0.0436F);


        this.rightFrontLeg = new ModelRenderer(this);
        this.rightFrontLeg.setRotationPoint(-5.5F, 5.6647F, -6.3345F);
        this.bodyfront.addChild(rightFrontLeg);
        this.setRotateAngle(rightFrontLeg, 0.3927F, -0.2618F, 0.3491F);


        this.RightFjoint = new ModelRenderer(this);
        this.RightFjoint.setRotationPoint(0.1369F, 7.1778F, 2.3426F);
        this.rightFrontLeg.addChild(RightFjoint);
        this.setRotateAngle(RightFjoint, -0.7418F, 0.0436F, -0.3491F);


        this.RightFFoot = new ModelRenderer(this);
        this.RightFFoot.setRotationPoint(1.0436F, 5.341F, -1.5632F);
        this.RightFjoint.addChild(RightFFoot);
        this.setRotateAngle(RightFFoot, 0.5236F, 0.0F, -0.0436F);

    }

    public void renderAll(float f) {
        this.Desmatosuchus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
