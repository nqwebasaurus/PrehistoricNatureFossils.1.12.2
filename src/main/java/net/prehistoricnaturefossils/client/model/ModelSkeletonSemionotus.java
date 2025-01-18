package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSemionotus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer head;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer gillL;
    private final ModelRenderer upperjaw;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer cube_r13;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r14;
    private final ModelRenderer pectoralfinL;
    private final ModelRenderer cube_r15;
    private final ModelRenderer pelvicfinL;
    private final ModelRenderer cube_r16;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer body3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;

    public ModelSkeletonSemionotus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-2.4F, 24.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 30, 24, -8.5F, -1.0F, 6.0F, 16, 1, 10, 0.003F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -7.6F, -1.0F, -11.3F, 20, 1, 10, 0.002F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(6.5F, -0.5F, -19.4F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.637F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 49, -8.0774F, -0.5F, 0.0512F, 8, 1, 10, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.5F, -14.5F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.2654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 36, -5.6F, -0.5F, -6.7F, 12, 1, 11, 0.03F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.5F, 21.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 45, -9.75F, -0.5F, -6.5F, 11, 1, 10, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(8.5681F, -0.5F, 19.5065F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.2348F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 49, -1.125F, -0.5F, 2.15F, 5, 1, 5, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(11.4F, -0.5F, 8.3F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.4494F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -5.025F, -0.5F, 0.075F, 5, 1, 19, 0.03F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1134F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, -7.8F, -1.0F, -3.0F, 20, 1, 10, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.7807F, -0.9389F, -7.7048F);
        this.bone.addChild(head);
        this.setRotateAngle(head, 0.1307F, 0.0113F, -1.6129F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.5589F, 6.2209F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 17, -0.5F, -11.45F, -4.75F, 1, 3, 5, 0.015F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 6.5589F, 6.2209F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.5F, -7.25F, -8.0F, 1, 3, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 61, 0.5F, -4.25F, -12.0F, 1, 4, 7, 0.0F, false));

        this.gillL = new ModelRenderer(this);
        this.gillL.setRotationPoint(0.5F, 0.3089F, -1.7791F);
        this.head.addChild(gillL);
        this.setRotateAngle(gillL, 0.0F, 0.1745F, 0.0F);
        this.gillL.cubeList.add(new ModelBox(gillL, 47, 73, -1.0F, -1.5F, -0.75F, 1, 5, 4, 0.0F, false));

        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(-1.0F, 0.0589F, -2.0291F);
        this.head.addChild(upperjaw);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.5F, 8.25F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 24, 0.5F, -2.25F, -14.65F, 1, 1, 3, 0.02F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 6.5F, 8.25F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 29, -0.5F, -13.75F, -5.25F, 1, 2, 1, -0.01F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 6.5F, 8.25F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 12, -0.5F, -9.45F, -7.75F, 1, 1, 3, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 36, -0.5F, -11.45F, -8.75F, 1, 2, 4, 0.01F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(1.52F, -0.1182F, -2.2839F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(-1.0F, 2.3089F, -4.9291F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.25F, 11.4F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 24, 0.5F, -1.25F, -14.9F, 1, 1, 3, 0.015F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(-1.175F, 0.5589F, 1.2209F);
        this.head.addChild(body1);
        this.setRotateAngle(body1, -0.1309F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 51, 2, 1.0F, -4.5F, 0.25F, 1, 9, 10, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 6.0F, 5.0F);
        this.body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 57, 0.5F, -10.9F, -3.875F, 1, 1, 10, 0.0F, false));

        this.pectoralfinL = new ModelRenderer(this);
        this.pectoralfinL.setRotationPoint(1.1F, 1.675F, 1.5F);
        this.body1.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -1.0996F, -0.042F, 0.0101F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.05F, -0.25F, 3.5F);
        this.pectoralfinL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -3.0674F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 67, 56, 0.0F, -1.5F, -3.5F, 2, 3, 7, 0.0F, false));

        this.pelvicfinL = new ModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.175F, 3.5F, 7.5F);
        this.body1.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.6912F, -0.1022F, 0.1289F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.75F, 0.0F, 3.0F);
        this.pelvicfinL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 77, 0.0F, -1.0F, -3.0F, 1, 2, 6, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.45F, -0.25F, 10.0F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.1309F, 0.0011F, 0.0087F);
        this.body2.cubeList.add(new ModelBox(body2, 64, 0, 0.5F, -2.25F, -0.75F, 1, 5, 6, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.815F, 3.5248F, 7.7255F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4367F, 0.0395F, -3.1231F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 77, 34, 0.0F, -2.0F, -4.0F, 1, 4, 8, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.9881F, -4.6596F, 3.8571F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -3.098F, 0.0F, -3.1154F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 61, 0.0F, -2.5F, -3.5F, 0, 5, 7, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 6.25F, -5.0F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3403F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 57, 0.0F, -11.425F, 0.75F, 1, 2, 6, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 6.25F, -5.0F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3403F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 69, 0.0F, -1.9F, 4.8F, 1, 2, 6, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.375F, 0.0F, 5.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.1744F, -0.0066F, 0.0298F);
        this.body3.cubeList.add(new ModelBox(body3, 68, 68, 0.0F, -1.75F, -0.75F, 1, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, 0.0F, 1.625F, 2.25F, 0, 1, 3, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.375F, 0.25F, 5.25F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0501F, -0.0002F, -0.0072F);


        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.025F, 0.25F, 3.5F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 57, 0.0F, -5.5F, -4.5F, 0, 11, 9, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 6.0F, -15.25F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 73, 26, -0.5F, -0.5F, 15.25F, 1, 2, 5, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 17, -0.5F, 1.5F, 15.25F, 1, 1, 3, 0.0F, false));

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
