package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStahleckeriaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer body;
    private final ModelRenderer cube_r2;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonStahleckeriaFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 41, 34, -1.5F, -25.0F, -14.0F, 1, 25, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 42, -0.5F, -24.0F, 14.4F, 1, 24, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -13.0F, 14.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 67, 8.5F, -8.0F, -0.5F, 1, 16, 1, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 42, 3.5F, -9.0F, -28.9F, 1, 18, 1, -0.003F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -29.0F, -8.0F);
        this.fossil.addChild(body);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.6F, 18.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2356F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 0, -1.0F, 0.9879F, -0.0463F, 2, 2, 10, -0.2F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(6.5F, 6.5665F, 23.4382F);
        this.body.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.2144F, -0.1034F, -0.2533F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.2839F, 11.1184F, -0.9447F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 1.2368F, 0.0407F, 0.2725F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(1.0885F, 8.9576F, 0.4756F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.0274F, 0.1098F, -0.0142F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-6.5F, 6.5665F, 23.4382F);
        this.body.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.258F, 0.1034F, 0.2533F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.2839F, 11.1184F, -0.9447F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.4068F, 0.083F, -0.3154F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0885F, 8.9576F, 0.4756F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.1153F, 0.0204F, 0.0277F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 4.7F, 27.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.8651F, 0.1334F, -0.1129F);
        this.tail.cubeList.add(new ModelBox(tail, 29, 80, -1.0F, 0.022F, -1.9372F, 2, 9, 2, -0.201F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 8.822F, 0.3628F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1289F, 0.0227F, -0.1731F);
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 88, -0.5F, -1.8285F, -1.2852F, 1, 10, 1, -0.2F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.6F, 17.8F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0436F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.8F, -29.1F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2705F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 68, -1.0F, 1.0052F, 0.0067F, 2, 2, 5, -0.201F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -24.4F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 47, -1.0F, 1.0019F, -0.1698F, 2, 2, 7, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.9F, -17.8F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, 1.3F, 0.0F, 2, 2, 18, -0.201F, false));

        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(6.3F, 9.6611F, -23.7721F);
        this.body2.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.1168F, 0.0778F, -0.6333F);


        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(0.1698F, 8.7583F, 0.8645F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.6293F, 0.0923F, 0.5673F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.5421F, 8.0269F, -1.4569F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 0.7857F, 0.0383F, 0.0694F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-6.3F, 9.6611F, -23.7721F);
        this.body2.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7297F, -0.0487F, 0.6007F);


        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-0.1698F, 8.7583F, 0.8645F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.9746F, -0.1179F, -0.6028F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.5421F, 8.0269F, -1.4569F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 1.1784F, -0.0383F, -0.0694F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.7F, -28.7F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.134F, 0.2163F, -0.0289F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4723F, -3.9511F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3403F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 70, -1.0F, 0.8786F, -0.6678F, 2, 2, 5, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0723F, -4.0511F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0052F, 0.2098F, 0.0085F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.4922F, -2.3457F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4974F, 0.0F, 0.0F);

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
