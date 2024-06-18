package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlacodusFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer armL;
    private final ModelRenderer armL2;
    private final ModelRenderer armL3;
    private final ModelRenderer armL4;
    private final ModelRenderer armL5;
    private final ModelRenderer armL6;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonPlacodusFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 11.6F, 0.0F);
        this.setRotateAngle(body, 0.4363F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.2F, 2.7F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1484F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -2, 19, -0.5F, 0.2998F, -0.8655F, 1, 1, 7, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.4F, -5.3F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 37, -0.5F, 0.5502F, -0.1469F, 1, 1, 8, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.9F, -11.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 12, 0.0F, -0.2F, -0.2F, 1, 1, 7, -0.2F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.3F, -10.3F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, -0.2166F, 0.3912F, 0.0197F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.7059F, -1.2796F);
        this.body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0055F, 0.157F, -1.6061F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 42, -2.1F, -5.0F, -0.5F, 1, 10, 1, -0.2F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.4772F, -4.4675F);
        this.body1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 42, -0.5F, 0.7F, 2.3F, 1, 4, 1, -0.24F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4772F, -4.0675F);
        this.body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 39, -0.5F, 0.5F, 0.2F, 1, 1, 4, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.6272F, -3.9675F);
        this.body1.addChild(neck);
        this.setRotateAngle(neck, -0.1302F, 0.3827F, 0.0694F);
        this.neck.cubeList.add(new ModelBox(neck, -1, 27, -0.5F, 0.2116F, -4.8113F, 1, 1, 6, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0062F, -4.3113F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5813F, 0.1083F, -0.4095F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.7669F, -0.9208F);
        this.head.addChild(upperjaw);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.7669F, -0.9208F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3927F, 0.0F, 0.0F);


        this.armL = new ModelRenderer(this);
        this.armL.setRotationPoint(4.75F, 4.0272F, -0.9675F);
        this.body1.addChild(armL);
        this.setRotateAngle(armL, 1.3293F, 0.185F, -1.2488F);


        this.armL2 = new ModelRenderer(this);
        this.armL2.setRotationPoint(-0.0261F, 4.7652F, -0.3153F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -0.6211F, 0.131F, -0.0057F);


        this.armL3 = new ModelRenderer(this);
        this.armL3.setRotationPoint(0.1472F, 2.8684F, -0.9624F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.3491F, 0.0F, 0.3491F);


        this.armL4 = new ModelRenderer(this);
        this.armL4.setRotationPoint(-4.75F, 4.0272F, -0.9675F);
        this.body1.addChild(armL4);
        this.setRotateAngle(armL4, -0.9883F, -0.2143F, 1.15F);


        this.armL5 = new ModelRenderer(this);
        this.armL5.setRotationPoint(0.0261F, 4.7652F, -0.3153F);
        this.armL4.addChild(armL5);
        this.setRotateAngle(armL5, -0.782F, -0.2374F, -0.0219F);


        this.armL6 = new ModelRenderer(this);
        this.armL6.setRotationPoint(-0.5472F, 2.8684F, -0.9624F);
        this.armL5.addChild(armL6);
        this.setRotateAngle(armL6, 0.3491F, 0.0F, -0.3491F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 8.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1354F, -0.3462F, -0.0045F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1139F, -0.0837F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 52, -4.5F, 2.2997F, 1.7105F, 9, 1, 1, -0.2F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 52, -0.5F, 0.2997F, 1.7105F, 1, 3, 1, -0.24F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 48, -0.5F, 0.2997F, -0.2895F, 1, 1, 5, -0.2F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(3.4F, 2.5139F, 1.6163F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, 1.3188F, 0.2028F, -0.3755F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 5.2F, -1.25F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.1745F, 0.0F, 0.2182F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-0.1082F, 2.7404F, 0.6487F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0873F, 0.0F, 0.3491F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-3.4F, 2.5139F, 1.6163F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 1.3542F, -0.2836F, 0.4094F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-1.0F, 5.2F, -1.25F);
        this.legL4.addChild(legL5);
        this.setRotateAngle(legL5, 0.1745F, 0.0F, -0.2182F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(0.1082F, 2.7404F, 0.6487F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, 0.0873F, 0.0F, -0.3491F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2639F, 4.6163F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, -0.1745F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 20, -0.5F, 0.45F, -0.5F, 1, 1, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.7F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1294F, -0.2615F, -0.0117F);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 0, -0.5F, 0.4617F, -0.7657F, 1, 1, 12, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1617F, 10.2343F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2146F, 0.3923F, 0.0181F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 22, -0.5F, 0.3422F, -0.0664F, 1, 1, 15, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.2F, -0.0078F, 15.6336F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0015F, 0.2615F, 0.0117F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 20, -0.5F, 0.3488F, -1.1567F, 1, 1, 15, -0.2F, false));

    }

    public void renderAll(float f) {
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
