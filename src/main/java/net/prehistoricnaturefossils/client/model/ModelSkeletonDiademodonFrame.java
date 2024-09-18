package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiademodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r11;

    public ModelSkeletonDiademodonFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.0F, -10.0F, 10.4F, 1, 10, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -10.0F, -9.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.4F, 0.0F, -0.5F, 1, 10, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -10.0F, -9.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.0F, -5.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -8.5F, 10.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -3.5F, -0.7F, 1, 7, 1, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -10.9F, 0.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0436F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, 7.5671F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 8, -0.5F, 0.7122F, -0.1432F, 1, 1, 6, -0.15F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4618F, -7.1305F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.192F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 28, -0.5F, 0.2327F, -5.1009F, 1, 1, 5, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9618F, 0.8695F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, -0.5F, 0.7257F, -0.0209F, 1, 1, 7, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.8618F, -7.1305F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -1, -1, -0.5F, 1.625F, -0.3F, 1, 1, 9, -0.15F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.49F, 3.4F, -9.4F);
        this.body.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.6443F, 0.3162F, -0.2982F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0143F, -0.0298F, 4.6356F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, 1.1059F, -0.6879F, -0.1544F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 3.8559F, 0.1488F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.0787F, -0.0637F, -0.0213F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.49F, 3.4F, -9.4F);
        this.body.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -1.7122F, -0.4925F, 0.5701F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.0143F, -0.0298F, 4.6356F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, 0.8005F, 0.6879F, 0.1544F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 3.8559F, 0.1488F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.648F, -0.0355F, 0.165F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.4F, 2.2F, 10.7F);
        this.body.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.2206F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.8F, 5.3538F, -0.0685F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.0609F, 0.0F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(-0.4F, 0.0729F, 4.3327F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, 0.9458F, 0.0643F, -0.0354F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.4F, 2.2F, 10.7F);
        this.body.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.7442F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.8F, 5.3538F, -0.0685F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, -0.7245F, 0.0F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.4F, 0.0729F, 4.3327F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 1.4694F, 0.0637F, 0.2122F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.3875F, -12.2136F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.2788F, -0.4323F, -0.0691F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2703F, 0.2419F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 14, -0.4812F, 0.5455F, -6.4014F, 1, 1, 7, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.5899F, -4.5946F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2562F, -0.2955F, 0.2874F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0009F, -1.8422F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.304F, 13.2403F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.4152F, -0.3215F, 0.1384F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.0507F, -2.4067F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 31, -0.0393F, 1.2547F, 2.1226F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0849F, 4.8216F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.3927F, 0.0F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.8931F, -4.7329F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 32, 0.4224F, 1.049F, 4.173F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1573F, 5.0246F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1392F, -0.346F, -0.0475F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -1.6972F, -4.8697F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 19, 0.4108F, 2.0355F, 4.7535F, 1, 1, 6, -0.15F, false));

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
