package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAtopodentatusFrame extends ModelBase {
    private final ModelRenderer hip;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leg1;
    private final ModelRenderer lrgpiece1;
    private final ModelRenderer legfinger1;
    private final ModelRenderer leg2;
    private final ModelRenderer lrgpiece2;
    private final ModelRenderer legfinger2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer arm1;
    private final ModelRenderer armpiece1;
    private final ModelRenderer arm1finger1;
    private final ModelRenderer arm2;
    private final ModelRenderer armpiece2;
    private final ModelRenderer arm1finger2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer upperjaw;
    private final ModelRenderer jaw;

    public ModelSkeletonAtopodentatusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.setRotateAngle(hip, 0.5236F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.2609F, 2.306F, 20.6502F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.518F, 0.0868F, 1.5617F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 44, -0.5F, -0.5F, -3.5F, 1, 1, 6, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.2609F, 2.306F, 20.6502F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4839F, -0.0526F, -0.0046F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 46, -0.5F, -0.5F, -0.5F, 1, 1, 4, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, -0.8692F, 15.3222F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0874F, 0.0522F, -0.0046F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 43, -0.5F, -0.8486F, -0.0152F, 1, 1, 7, -0.15F, false));

        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(2.5F, 2.0F, 21.0F);
        this.hip.addChild(leg1);
        this.setRotateAngle(leg1, -0.1685F, -0.9052F, 0.8238F);


        this.lrgpiece1 = new ModelRenderer(this);
        this.lrgpiece1.setRotationPoint(8.371F, 0.0264F, -0.5698F);
        this.leg1.addChild(lrgpiece1);
        this.setRotateAngle(lrgpiece1, 0.1302F, -0.7208F, 0.2599F);


        this.legfinger1 = new ModelRenderer(this);
        this.legfinger1.setRotationPoint(7.861F, 0.1035F, 1.6272F);
        this.lrgpiece1.addChild(legfinger1);
        this.setRotateAngle(legfinger1, 0.0666F, -0.2079F, 0.0367F);


        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-2.5F, 2.0F, 21.0F);
        this.hip.addChild(leg2);
        this.setRotateAngle(leg2, 0.2249F, 0.3212F, -0.4399F);


        this.lrgpiece2 = new ModelRenderer(this);
        this.lrgpiece2.setRotationPoint(-8.371F, 0.0264F, -0.5698F);
        this.leg2.addChild(lrgpiece2);
        this.setRotateAngle(lrgpiece2, -0.1235F, 0.4697F, -0.6101F);


        this.legfinger2 = new ModelRenderer(this);
        this.legfinger2.setRotationPoint(-7.861F, 0.1035F, 1.6272F);
        this.lrgpiece2.addChild(legfinger2);
        this.setRotateAngle(legfinger2, 0.0666F, 0.2079F, -0.0367F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 23.0F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.2618F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.3F, -1.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 0, -0.5F, 0.3F, 0.0F, 1, 1, 18, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.2618F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3F, -1.0F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 54, -0.6F, 0.2F, 0.5F, 1, 1, 17, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 17.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.48F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -0.8F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, -0.0175F, 0.0003F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 32, -0.3F, 0.1878F, -0.2001F, 1, 1, 18, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.3F, -1.0F, 18.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.4363F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 35, -0.3F, 0.5F, -1.5F, 1, 1, 19, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.hip.addChild(body2);
        this.setRotateAngle(body2, -0.1772F, 0.1719F, -0.0306F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.5724F, -20.019F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, -0.5F, 0.4362F, -0.3095F, 1, 1, 20, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.7F, -30.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0785F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 54, -0.5F, 0.3F, 0.0F, 1, 1, 10, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -30.0F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.1309F, 0.1745F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.3252F, -3.4668F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.4399F, -0.026F, 1.5674F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -1, -1, -1.1F, -0.5F, -5.5F, 1, 1, 11, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.3252F, -3.4668F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.5446F, 0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 6, -0.5F, -0.5F, -4.5F, 1, 1, 4, -0.16F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.7F, -10.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0262F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, 0.55F, -0.5F, 1, 1, 11, -0.15F, false));

        this.arm1 = new ModelRenderer(this);
        this.arm1.setRotationPoint(4.75F, 2.0F, -3.0F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.4534F, 0.7155F, 0.0896F);


        this.armpiece1 = new ModelRenderer(this);
        this.armpiece1.setRotationPoint(8.1F, -0.6F, 0.0F);
        this.arm1.addChild(armpiece1);
        this.setRotateAngle(armpiece1, 0.5116F, 0.8934F, 0.0941F);


        this.arm1finger1 = new ModelRenderer(this);
        this.arm1finger1.setRotationPoint(4.7784F, -1.0F, -1.4446F);
        this.armpiece1.addChild(arm1finger1);
        this.setRotateAngle(arm1finger1, -0.338F, -0.4079F, 0.725F);


        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(-4.75F, 2.0F, -3.0F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.7214F, 0.7916F, -0.0985F);


        this.armpiece2 = new ModelRenderer(this);
        this.armpiece2.setRotationPoint(-8.1F, -0.6F, 0.0F);
        this.arm2.addChild(armpiece2);
        this.setRotateAngle(armpiece2, 0.9268F, -0.4562F, -0.8333F);


        this.arm1finger2 = new ModelRenderer(this);
        this.arm1finger2.setRotationPoint(-4.7784F, -1.0F, -1.4446F);
        this.armpiece2.addChild(arm1finger2);
        this.setRotateAngle(arm1finger2, 0.0F, 0.5236F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -10.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.2583F, 0.4577F, -0.2738F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.6F, -7.8F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 57, -0.4951F, 0.3002F, -0.2031F, 1, 1, 8, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, 0.1232F, 0.3451F, -0.0511F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.1F, -7.0F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0785F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 33, -0.5902F, 0.0007F, 0.2066F, 1, 1, 7, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.5672F, 0.3491F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(upperjaw);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);

    }

    public void renderAll(float f) {
        this.hip.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
