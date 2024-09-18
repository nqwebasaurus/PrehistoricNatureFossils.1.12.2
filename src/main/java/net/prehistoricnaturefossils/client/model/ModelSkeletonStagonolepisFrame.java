package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStagonolepisFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Stagonolepis;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer leftBackLeg;
    private final ModelRenderer leftBjoint;
    private final ModelRenderer leftBfoot;
    private final ModelRenderer rightBackLeg;
    private final ModelRenderer rightBjoint;
    private final ModelRenderer rightBfoot;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftFrontLeg;
    private final ModelRenderer LeftFjoint;
    private final ModelRenderer LeftFFoot;
    private final ModelRenderer rightFrontLeg;
    private final ModelRenderer RightFjoint;
    private final ModelRenderer RightFFoot;
    private final ModelRenderer neck;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonStagonolepisFrame() {
        this.textureWidth = 87;
        this.textureHeight = 87;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -12.0F, 5.8F, 1, 12, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -10.45F, -10.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -1.55F, -0.5F, 1, 12, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5F, -10.45F, -10.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.25F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -12.0F, 6.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.1F, -3.0F, -0.5F, 1, 6, 1, -0.15F, false));

        this.Stagonolepis = new ModelRenderer(this);
        this.Stagonolepis.setRotationPoint(-0.5F, -5.325F, 5.0F);
        this.fossil.addChild(Stagonolepis);


        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -7.0335F, 0.4753F);
        this.Stagonolepis.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.3524F, -0.7172F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 65, -0.5F, 0.0F, -0.2F, 1, 1, 6, -0.15F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5524F, 5.1828F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0277F, -0.0011F, -0.0114F);
        this.tail.cubeList.add(new ModelBox(tail, 54, 25, 0.0F, 0.1493F, -0.3746F, 1, 1, 9, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, -0.5007F, 9.0254F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0896F, 0.0869F, -0.0078F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 53, -0.5F, 0.6858F, -0.651F, 1, 1, 10, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2858F, 8.849F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0177F, 0.2618F, 0.0046F);
        this.tail3.cubeList.add(new ModelBox(tail3, 65, 59, -0.5F, 0.35F, 0.0F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1578F, 0.3019F, 0.0473F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 39, -0.5F, 0.2494F, -0.5391F, 1, 1, 11, -0.15F, false));

        this.leftBackLeg = new ModelRenderer(this);
        this.leftBackLeg.setRotationPoint(3.65F, 0.4976F, 0.9828F);
        this.body3.addChild(leftBackLeg);
        this.setRotateAngle(leftBackLeg, -0.1745F, 0.0F, 0.0F);


        this.leftBjoint = new ModelRenderer(this);
        this.leftBjoint.setRotationPoint(1.0F, 6.3861F, 1.7445F);
        this.leftBackLeg.addChild(leftBjoint);
        this.setRotateAngle(leftBjoint, 0.6981F, 0.0F, 0.0F);


        this.leftBfoot = new ModelRenderer(this);
        this.leftBfoot.setRotationPoint(0.25F, 5.1775F, 1.634F);
        this.leftBjoint.addChild(leftBfoot);
        this.setRotateAngle(leftBfoot, -0.6535F, -0.0118F, 0.0063F);


        this.rightBackLeg = new ModelRenderer(this);
        this.rightBackLeg.setRotationPoint(-2.65F, 0.4976F, 0.9828F);
        this.body3.addChild(rightBackLeg);
        this.setRotateAngle(rightBackLeg, -0.6109F, 0.0F, 0.0F);


        this.rightBjoint = new ModelRenderer(this);
        this.rightBjoint.setRotationPoint(-1.0F, 6.3861F, 1.7445F);
        this.rightBackLeg.addChild(rightBjoint);
        this.setRotateAngle(rightBjoint, 0.6981F, 0.0F, 0.0F);


        this.rightBfoot = new ModelRenderer(this);
        this.rightBfoot.setRotationPoint(-0.25F, 5.1775F, 1.634F);
        this.rightBjoint.addChild(rightBfoot);
        this.setRotateAngle(rightBfoot, -0.2618F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.8702F, -0.921F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.0968F, 0.1303F, 0.0126F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.1146F, -4.8435F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 6, -0.5F, 0.3861F, 0.2295F, 1, 1, 5, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.5F, -0.0568F, -4.8612F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0175F, 0.0436F, 0.0008F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.388F, -4.7778F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 66, -0.5F, 0.7F, -6.5F, 1, 1, 7, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.112F, 0.1222F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 68, -0.5F, 0.2F, -4.6F, 1, 1, 5, -0.15F, false));

        this.leftFrontLeg = new ModelRenderer(this);
        this.leftFrontLeg.setRotationPoint(4.0F, 5.1771F, -10.6219F);
        this.body.addChild(leftFrontLeg);
        this.setRotateAngle(leftFrontLeg, -0.6184F, 0.3044F, -0.2201F);


        this.LeftFjoint = new ModelRenderer(this);
        this.LeftFjoint.setRotationPoint(0.6518F, 1.0023F, 4.5709F);
        this.leftFrontLeg.addChild(LeftFjoint);
        this.setRotateAngle(LeftFjoint, 0.603F, 0.1607F, 0.2841F);


        this.LeftFFoot = new ModelRenderer(this);
        this.LeftFFoot.setRotationPoint(-1.0892F, 4.6576F, -0.2639F);
        this.LeftFjoint.addChild(LeftFFoot);
        this.setRotateAngle(LeftFFoot, 0.3766F, -0.52F, 0.0503F);


        this.rightFrontLeg = new ModelRenderer(this);
        this.rightFrontLeg.setRotationPoint(-4.0F, 5.1771F, -10.6219F);
        this.body.addChild(rightFrontLeg);
        this.setRotateAngle(rightFrontLeg, -1.6656F, -0.3044F, 0.2201F);


        this.RightFjoint = new ModelRenderer(this);
        this.RightFjoint.setRotationPoint(-0.6518F, 1.0023F, 4.5709F);
        this.rightFrontLeg.addChild(RightFjoint);
        this.setRotateAngle(RightFjoint, 0.8212F, -0.1607F, -0.2841F);


        this.RightFFoot = new ModelRenderer(this);
        this.RightFFoot.setRotationPoint(1.0892F, 4.6576F, -0.2639F);
        this.RightFjoint.addChild(RightFFoot);
        this.setRotateAngle(RightFFoot, 1.2802F, 0.5622F, 0.0944F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.612F, -10.8778F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.0095F, 0.1743F, -0.0092F);
        this.neck.cubeList.add(new ModelBox(neck, 72, 33, -0.5F, 0.2452F, -2.8062F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck.addChild(neck2);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3452F, -0.0062F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, -1, -0.5F, -0.2F, -3.3F, 1, 1, 4, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6F, -2.9F);
        this.neck2.addChild(neck3);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4548F, 0.0938F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 76, -0.5F, 0.64F, -2.0843F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1452F, -1.7062F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1861F, 0.2428F, 0.0985F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.9718F, -0.2133F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);

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
