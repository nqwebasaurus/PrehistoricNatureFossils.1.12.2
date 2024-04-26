package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBrazilichthys extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer head;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer eye;
    private final ModelRenderer eye2;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;

    public ModelSkeletonBrazilichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 46, -1.0F, -8.0F, -13.0F, 2, 3, 5, -0.15F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 23, 17, -1.5F, -4.0F, -13.0F, 3, 4, 7, -0.15F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 31, 0, -0.1F, -4.0F, -12.0F, 3, 4, 6, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 34, 36, -0.7F, -6.0F, -6.0F, 4, 6, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 32, -3.0F, -7.0F, -7.0F, 4, 7, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 17, -3.0F, -7.0F, -3.0F, 4, 7, 7, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 13, 40, 1.0F, -6.0F, 0.0F, 3, 6, 4, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 17, 29, 0.7F, -4.0F, -5.0F, 4, 4, 6, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.5F, -14.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 49, -1.0F, -1.5F, -1.8F, 2, 3, 4, -0.3F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -6.75F, 1.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, -0.2182F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -2.5F, -0.25F, -7.0F, 5, 6, 10, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.75F, -7.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 2.3285F, -3.4904F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 47, -0.5F, -1.8F, 0.5F, 4, 2, 4, 0.001F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.7783F, -5.5106F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -0.75F, -0.575F, -0.275F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 2.8727F, -4.979F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 7, -2.9F, -0.5537F, 2.186F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.3376F, -4.5629F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 33, -1.25F, -1.0F, -0.225F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 3.3977F, -6.879F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 6, 0.1F, -0.444F, 0.1821F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.75F, 2.9198F, -6.8187F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 43, 0.0F, -0.5F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 3.3727F, -6.904F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 4, 0.1F, -0.4319F, -1.5847F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.3376F, -4.5629F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 43, 1.25F, -1.0F, -0.225F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 2.8727F, -4.979F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 17, 2.9F, -0.5537F, 2.186F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 0, -0.5F, -1.0537F, 0.186F, 4, 1, 3, -0.001F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 3.3977F, -6.879F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 32, -0.1F, -0.444F, 0.1821F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 5, -2.5F, -0.994F, -0.0179F, 3, 1, 3, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.75F, 2.9198F, -6.8187F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 44, 0.0F, -0.5F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.7783F, -5.5106F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 32, 0.75F, -0.575F, -0.275F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 3.3727F, -6.904F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 17, -0.1F, -0.4319F, -1.5847F, 0, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 20, -2.5F, -0.9819F, -1.9847F, 3, 1, 2, 0.001F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 1.45F, -8.45F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 0, -2.5F, -0.0092F, 0.0047F, 3, 1, 4, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 11, -2.5F, -1.6842F, 2.5047F, 3, 1, 2, -0.003F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 33, -2.5F, -0.7592F, 1.5047F, 3, 1, 3, -0.002F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -0.55F, -4.975F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 42, -0.5F, -0.0147F, -5.0047F, 3, 1, 5, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -1.0F, 0.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 24, -1.5F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(1.35F, 1.7F, -6.2F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3927F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 32, 29, -0.8F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(-1.35F, 1.7F, -6.2F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.3927F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 4, -0.2F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 3.7895F, 0.0111F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2618F, 0.0F, 0.0F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, -1.0669F, -4.9901F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, -1.75F, -0.1787F, 1.211F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.75F, -0.8724F, -4.6678F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 32, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -0.5419F, -6.8901F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 0, -1.25F, -0.494F, 0.2321F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.75F, 0.0162F, -7.0179F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.8727F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 27, 40, -0.75F, -0.825F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -0.5669F, -6.9151F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 17, -1.25F, -0.4819F, -1.9847F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.0669F, -4.9901F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 10, 1.75F, -0.1787F, 1.211F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(1.75F, -0.8724F, -4.6678F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 40, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.25F, 0.0162F, -7.0179F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.8727F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 40, 0.75F, -0.825F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.5419F, -6.8901F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 33, 1.25F, -0.494F, 0.2321F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -0.5F, 0.006F, -0.2679F, 2, 1, 2, -0.001F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.9846F, -5.2914F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0262F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 11, -0.5F, -1.9734F, 0.0002F, 3, 2, 6, -0.001F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.5669F, -6.9151F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3054F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 21, 0, 1.25F, -0.4819F, -1.9847F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 17, -0.5F, 0.0181F, -1.9847F, 2, 1, 4, 0.0F, false));

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
