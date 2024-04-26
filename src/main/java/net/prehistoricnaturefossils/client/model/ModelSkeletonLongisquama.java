package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLongisquama extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer body2;
    private final ModelRenderer scale6;
    private final ModelRenderer cube_r11;
    private final ModelRenderer scale7;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer scale8;
    private final ModelRenderer scale9;
    private final ModelRenderer body;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r19;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer forelegL1;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer scale1;
    private final ModelRenderer scale2;
    private final ModelRenderer cube_r24;
    private final ModelRenderer scale3;
    private final ModelRenderer cube_r25;
    private final ModelRenderer scale4;
    private final ModelRenderer cube_r26;
    private final ModelRenderer scale5;
    private final ModelRenderer cube_r27;

    public ModelSkeletonLongisquama() {
        this.textureWidth = 184;
        this.textureHeight = 180;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(15.0F, 24.0F, -16.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 48, -23.0F, -2.0F, -17.0F, 37, 2, 22, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -42.0F, -2.0F, 5.0F, 45, 2, 45, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-33.0F, 0.0F, -14.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2705F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 117, 62, -0.3256F, -2.0F, -0.1006F, 11, 2, 12, 0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-39.0F, 0.0F, -4.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0123F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 114, 106, 0.1648F, -2.0F, -0.2055F, 11, 2, 12, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-37.0F, 0.0F, -1.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1833F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 104, 91, -1.1822F, -2.0F, -3.513F, 18, 2, 12, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-54.0F, 0.0F, 21.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6458F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 73, 0.1547F, -2.0F, -27.7139F, 12, 2, 28, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-55.0F, 0.0F, 42.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0436F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 104, 0.2378F, -2.0F, -20.7375F, 12, 2, 21, 0.003F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-42.0F, 0.0F, 50.0F);
        this.fossil.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.0036F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 73, 0.0F, -2.0F, -15.0F, 24, 2, 15, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(1.8643F, -1.0F, 30.6572F);
        this.fossil.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 2.4871F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -8.8F, -1.0F, -2.8F, 10, 2, 11, -0.003F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(9.0F, 0.0F, 41.0F);
        this.fossil.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.7017F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 97, 48, 0.1857F, -2.0F, -11.2247F, 27, 2, 11, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(3.0F, 0.0F, 50.0F);
        this.fossil.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.0036F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, -2.0F, -11.0F, 11, 2, 11, -0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(14.0F, 0.0F, 5.0F);
        this.fossil.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.6981F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 91, -11.0F, -2.0F, 0.0F, 11, 2, 22, -0.003F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.3F, 0.0F);
        this.fossil.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, -1.5708F);


        this.scale6 = new ModelRenderer(this);
        this.scale6.setRotationPoint(0.0F, -2.0F, 0.65F);
        this.body2.addChild(scale6);
        this.setRotateAngle(scale6, -0.5236F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.01F, -28.0F, 2.5F);
        this.scale6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 3.1416F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 67, 116, 0.0F, -28.5F, -3.0F, 0, 57, 6, 0.0F, false));

        this.scale7 = new ModelRenderer(this);
        this.scale7.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body2.addChild(scale7);
        this.setRotateAngle(scale7, -1.1781F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.01F, -18.5F, 2.0F);
        this.scale7.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -2.3126F, 0.0F, 3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 123, 118, 0.0F, 2.0F, -19.5F, 0, 7, 5, 0.0F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.01F, -18.5F, 2.0F);
        this.scale7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 3.1416F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 100, 116, 0.0F, -19.0F, -2.5F, 0, 38, 5, 0.0F, false));

        this.scale8 = new ModelRenderer(this);
        this.scale8.setRotationPoint(0.0F, -2.0F, 3.5F);
        this.body2.addChild(scale8);
        this.setRotateAngle(scale8, -1.4835F, 0.0F, 0.0F);


        this.scale9 = new ModelRenderer(this);
        this.scale9.setRotationPoint(0.0F, -2.0F, 4.75F);
        this.body2.addChild(scale9);
        this.setRotateAngle(scale9, -1.5708F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(1.6F, -2.15F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, -1.5708F);
        this.body.cubeList.add(new ModelBox(body, 0, 28, -0.9F, -1.6F, -4.4F, 1, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 14, -0.9F, -0.6F, -4.4F, 1, 3, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 14, -0.9F, -0.6F, -2.4F, 1, 3, 1, 0.0F, false));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4F, 2.0624F, -5.4397F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.48F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 28, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.003F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.9F, -6.0F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 33, -0.9F, -0.5F, -1.2F, 1, 1, 3, 0.003F, false));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.3555F, -5.6914F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, -1.3F, -1.0F, -0.3F, 1, 3, 1, 0.0F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.9F, -5.9F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 7, -1.4F, -1.5F, -0.2F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4F, 0.9F, 0.1F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 14, -0.5F, -1.5F, -0.9F, 1, 3, 1, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 21, 28, -0.9F, -1.5F, -2.25F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.4F, -2.3F);
        this.neck.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.8378F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 28, -0.9F, -0.1F, -2.95F, 1, 1, 3, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.6F, 1.0F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 1.2217F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.0436F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 6, -0.5F, -1.1F, -6.0F, 1, 1, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 14, -0.4279F, -1.125F, -7.9015F, 1, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 9, 35, -0.2F, -3.0F, -3.0F, 1, 3, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 35, 0.01F, -3.1F, -3.1F, 1, 3, 3, -0.2F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 6, 6, -0.49F, -1.25F, -8.0F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1833F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -0.5F, 0.61F, -5.15F, 1, 1, 4, 0.0F, false));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -3.0F, -3.0F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 48, -0.3F, 0.2F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.72F, -1.6F, -1.7F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 3.1416F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 14, -0.6F, -1.5F, -1.6F, 1, 3, 3, -0.49F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 0, -0.4F, -1.5F, -1.6F, 1, 3, 3, -0.3F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5496F, -0.325F, -5.8898F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 3.1416F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 35, 0.0F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0611F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 33, 38, -0.19F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 18, 35, 0.5043F, -0.2F, -7.8847F, 0, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 26, 28, -0.4279F, 0.002F, -7.9015F, 1, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 13, 28, -0.5F, 0.0F, -8.0F, 1, 1, 5, 0.0F, false));

        this.forelegL1 = new ModelRenderer(this);
        this.forelegL1.setRotationPoint(0.4F, 2.8F, -5.0F);
        this.body.addChild(forelegL1);
        this.setRotateAngle(forelegL1, -1.5708F, -1.5272F, 1.5708F);
        this.forelegL1.cubeList.add(new ModelBox(forelegL1, 32, 21, -0.4F, 0.0F, 0.0F, 5, 1, 1, -0.2F, false));

        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.forelegL1.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.0F, -0.6109F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 7, 48, -0.9F, 1.0F, 0.11F, 1, 4, 1, -0.2F, false));
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 7, 48, 0.1F, 1.0F, 0.11F, 1, 4, 1, -0.2F, false));

        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 1.5708F, 0.0F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 21, -1.0F, 0.4F, -2.39F, 2, 1, 2, 0.0F, false));

        this.scale1 = new ModelRenderer(this);
        this.scale1.setRotationPoint(0.0F, -2.0F, -6.5F);
        this.body.addChild(scale1);
        this.setRotateAngle(scale1, 0.2182F, 0.0F, 0.0F);


        this.scale2 = new ModelRenderer(this);
        this.scale2.setRotationPoint(0.0F, -2.0F, -5.05F);
        this.body.addChild(scale2);
        this.setRotateAngle(scale2, 0.1309F, 0.0F, 0.0F);


        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.01F, -16.9345F, 1.5023F);
        this.scale2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -3.098F, 0.0F, -3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 118, 121, 0.0F, -17.5F, -1.0F, 0, 35, 2, 0.0F, false));

        this.scale3 = new ModelRenderer(this);
        this.scale3.setRotationPoint(0.0F, -2.0F, -3.6F);
        this.body.addChild(scale3);
        this.setRotateAngle(scale3, -0.2618F, 0.0F, 0.0F);


        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.01F, -20.5F, 1.0F);
        this.scale3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 3.1416F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 111, 121, 0.0F, -21.0F, -1.5F, 0, 42, 3, 0.0F, false));

        this.scale4 = new ModelRenderer(this);
        this.scale4.setRotationPoint(0.0F, -2.0F, -2.3F);
        this.body.addChild(scale4);
        this.setRotateAngle(scale4, -0.4363F, 0.0F, 0.0F);


        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -28.0F, 1.5F);
        this.scale4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 3.1416F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 116, 0.0F, -28.5F, -2.0F, 0, 57, 4, 0.0F, false));

        this.scale5 = new ModelRenderer(this);
        this.scale5.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.body.addChild(scale5);
        this.setRotateAngle(scale5, -0.8378F, 0.0F, 0.0F);


        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.01F, -19.5F, 2.0F);
        this.scale5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 3.1416F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 89, 116, 0.0F, -20.0F, -2.5F, 0, 40, 5, 0.0F, false));

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
