package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSmilosuchusFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r7;
    private final ModelRenderer hindlegL;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL4;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegL6;

    public ModelSkeletonSmilosuchusFrame() {
        this.textureWidth = 116;
        this.textureHeight = 116;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 6.25F, -2.25F);
        this.body.cubeList.add(new ModelBox(body, 1, 1, -0.4F, 2.7F, -20.1F, 1, 15, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.3F, 9.2F, -20.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.1F, -7.0F, 0.0F, 1, 15, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(4.4F, 3.6F, 11.1F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6109F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.0F, -0.9F, 0.0F, 1, 15, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(4.4F, 3.6F, 11.1F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -4.9F, -4.0F, 0.0F, 1, 6, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.4112F, -14.8333F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 71, 0, -0.5F, -0.1728F, -0.1329F, 1, 1, 12, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.0F, -23.95F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1484F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 0, -0.7F, -0.4F, 0.2F, 1, 1, 9, -0.002F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -3.35F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.2182F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.05F, -0.6F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 38, -0.5F, 0.9962F, 0.2872F, 1, 1, 17, 0.002F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.4F, 16.1F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1114F, 0.3471F, -0.038F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1573F, 0.1309F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 83, -0.5358F, 0.9822F, 0.1845F, 1, 1, 10, 0.0F, false));

        this.hindlegL = new ModelRenderer(this);
        this.hindlegL.setRotationPoint(2.6F, 6.567F, 0.3797F);
        this.tail.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -1.3492F, -0.9346F, -0.1746F);


        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(-0.0555F, 8.799F, -0.1116F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 1.5478F, 0.378F, 0.0374F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(-0.1447F, 8.2594F, 0.2517F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.022F, -0.0239F, 0.3745F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(-2.6F, 6.567F, 0.3797F);
        this.tail.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.1266F, 1.468F, 1.4274F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(0.0555F, 8.799F, -0.1116F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 1.5478F, -0.378F, -0.0374F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(0.1447F, 8.2594F, 0.2517F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.022F, 0.0239F, -0.3745F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0073F, 9.6309F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0457F, 0.3051F, -0.0138F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0181F, 0.1294F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 0, -0.5766F, 0.9747F, 0.21F, 1, 1, 17, -0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.3819F, 16.3294F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0034F, 0.305F, 0.0045F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0943F, -0.3801F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.6062F, 0.984F, 0.1432F, 1, 1, 20, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.7943F, 19.1199F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1028F, -0.1728F, -0.0186F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.261F, 0.1065F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0044F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 23, -0.6055F, 0.993F, -0.4472F, 1, 1, 19, 0.002F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.561F, 18.6065F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1507F, -0.6069F, -0.0069F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 65, -0.5819F, 0.5939F, -1.0816F, 1, 1, 14, 0.0F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0998F, 12.9913F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0532F, -0.6102F, -0.0305F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 45, -0.6327F, 0.4637F, -0.4222F, 1, 1, 7, 0.002F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.35F, -23.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1298F, -0.4206F, 0.1993F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2773F, -10.0841F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 83, 79, -0.5F, 0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2727F, -10.0841F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2131F, 0.0094F, -0.1455F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(-1.0F, 2.8F, 0.5F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.5672F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(-1.0F, 2.8F, 0.5F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(6.6F, 9.7F, -19.7F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.9163F, 0.2579F, -1.3112F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(0.2759F, 6.8921F, -0.4635F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -0.8607F, -0.0648F, 1.7016F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(-1.4129F, 7.442F, 0.1789F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.4795F, 0.0234F, -0.0368F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-6.6F, 9.7F, -19.7F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, -0.3664F, -0.3262F, 1.735F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-0.2759F, 6.8921F, -0.4635F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -0.9231F, 0.4268F, -1.8575F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(1.4129F, 7.442F, 0.1789F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.4795F, -0.0234F, 0.0368F);

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
