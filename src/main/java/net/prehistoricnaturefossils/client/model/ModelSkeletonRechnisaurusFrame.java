package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRechnisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer hand2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftTusk;
    private final ModelRenderer rightTusk;

    public ModelSkeletonRechnisaurusFrame() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.3F, -19.0F, -13.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.3229F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -6.0F, -0.5F, 1, 25, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.3F, -19.0F, -13.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3229F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.8F, -8.5F, -0.5F, 1, 17, 1, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -21.5F, 14.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -8.5F, -0.5F, 1, 16, 1, -0.1F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -21.5F, 14.8F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0524F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.0F, -3.5F, -0.5F, 1, 25, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -29.0F, -8.0F);
        this.fossil.addChild(body);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.6F, 18.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2356F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, -0.5F, 0.9879F, -0.0463F, 1, 2, 10, -0.003F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(6.5F, 6.5665F, 23.4382F);
        this.body.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.2219F, -0.1034F, -0.2533F);


        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.2839F, 11.1184F, -0.9447F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.4068F, -0.083F, 0.3154F);


        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(1.0885F, 8.9576F, 0.4756F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.4207F, -0.0204F, -0.0277F);


        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-6.5F, 6.5665F, 23.4382F);
        this.body.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.4326F, 0.1034F, 0.2533F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.2839F, 11.1184F, -0.9447F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.0613F, 0.083F, -0.3154F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0885F, 8.9576F, 0.4756F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.1153F, 0.0204F, 0.0277F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 4.7F, 27.0F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.8555F, 0.1996F, -0.1706F);
        this.tail.cubeList.add(new ModelBox(tail, 46, 69, -0.5F, 0.022F, -1.9372F, 1, 9, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 8.822F, 0.3628F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.121F, -0.05F, 0.3897F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 88, -0.5F, -0.8285F, -1.2852F, 1, 9, 1, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.6F, 17.8F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.2182F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.8F, -29.1F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2705F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 65, 6, -0.5F, 1.0052F, -0.2933F, 1, 2, 5, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, -24.4F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1658F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 35, -0.5F, 1.0019F, 0.1302F, 1, 2, 7, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.9F, -17.8F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, 1.3F, 0.0F, 1, 2, 18, 0.0F, false));

        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(6.3F, 9.6611F, -23.7721F);
        this.body2.addChild(upperarm1);
        this.setRotateAngle(upperarm1, -0.3196F, 0.0778F, -0.6333F);


        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(0.1698F, 8.7583F, 0.8645F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.3651F, 0.0616F, 0.5775F);


        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.5421F, 8.0269F, -1.4569F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 1.0039F, 0.0383F, 0.0694F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-6.3F, 9.6611F, -23.7721F);
        this.body2.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7297F, -0.0487F, 0.6007F);


        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-0.1698F, 8.7583F, 0.8645F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.7565F, -0.1179F, -0.6028F);


        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.5421F, 8.0269F, -1.4569F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.6548F, -0.0383F, -0.0694F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.7F, -28.7F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.2988F, -0.1121F, 0.0873F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4723F, -3.9511F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3403F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 57, 62, -0.5F, 0.8786F, -1.1678F, 1, 2, 5, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.1F, -3.1F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1077F, 0.0108F, 0.0488F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 4.0642F, -1.5058F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6109F, 0.0F, 0.0F);


        this.leftTusk = new ModelRenderer(this);
        this.leftTusk.setRotationPoint(3.159F, 0.6541F, -4.1995F);
        this.head.addChild(leftTusk);
        this.setRotateAngle(leftTusk, -0.0196F, 0.1264F, -0.0341F);


        this.rightTusk = new ModelRenderer(this);
        this.rightTusk.setRotationPoint(-3.159F, 0.6541F, -4.1995F);
        this.head.addChild(rightTusk);
        this.setRotateAngle(rightTusk, -0.0196F, -0.1264F, 0.0341F);

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
