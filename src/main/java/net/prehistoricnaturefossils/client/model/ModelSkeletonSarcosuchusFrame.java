package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSarcosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer body4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer eye;
    private final ModelRenderer eye3;
    private final ModelRenderer eye2;
    private final ModelRenderer eye4;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;

    public ModelSkeletonSarcosuchusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -15.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -17.0F, 31.8F, 1, 17, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-9.25F, -15.5F, -2.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5149F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.05F, -2.5F, -0.5F, 1, 18, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-9.25F, -15.5F, -2.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5149F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 3.5F, -10.25F, -0.5F, 1, 19, 1, -0.1F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -19.5F, 32.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 2.5F, -5.5F, -0.5F, 1, 11, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.5F, 1.3F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(-0.5F, -19.25F, 30.0F);
        this.root.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.0F, -6.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1484F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 11, 0.0F, 0.4824F, -0.2568F, 1, 2, 12, 0.001F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(4.9F, 1.7F, 2.4F);
        this.hips.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.6517F, -0.3612F, -0.7714F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(-0.8748F, 10.4649F, 2.214F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.8473F, -0.5354F, 0.5743F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.4869F, 8.6745F, 0.7016F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.0937F, -0.1747F, -0.0918F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.1628F, 0.1135F, -4.6058F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.0873F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-4.9F, 1.7F, 2.4F);
        this.hips.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.3044F, 0.8423F, 1.1821F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.8748F, 10.4649F, 2.214F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 1.1075F, -0.1853F, 0.0838F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.4869F, 8.6745F, 0.7016F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.3706F, 0.118F, -0.0353F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.1628F, 0.1135F, -4.6058F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.3491F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.85F, -6.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.2182F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -1.1F, -9.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 66, -1.5F, 1.0F, -0.1F, 1, 2, 10, 0.001F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.65F, -10.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.1309F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 50, 39, -0.5F, 0.6F, -11.0F, 1, 2, 11, 0.001F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, -11.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.0873F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, -8.9F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 77, 73, -1.5F, 1.0F, -0.1F, 1, 2, 9, 0.001F, false));

        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(8.1F, 7.5F, -6.3F);
        this.body3.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, -0.4882F, -0.0086F, -1.217F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.5218F, 7.9971F, 0.2955F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.2818F, -0.6449F, 1.1858F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.6123F, 9.4817F, 0.2887F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.5491F, -0.185F, -0.1243F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-8.1F, 7.5F, -6.3F);
        this.body3.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.6026F, 0.0086F, 1.217F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.5218F, 7.9971F, 0.2955F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.5148F, -0.328F, -1.151F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.1123F, 9.4817F, 0.6887F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.3848F, 0.4234F, 0.1257F);


        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.55F, -8.7F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1631F, -0.1304F, -0.088F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.4F, -3.2F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 63, -0.5F, -1.0F, -3.5F, 1, 2, 7, 0.001F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.3F, -6.3F);
        this.body4.addChild(neck);
        this.setRotateAngle(neck, -0.1086F, -0.3156F, -0.0849F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.6F, -9.0F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0524F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 36, -1.0F, 0.15F, -1.0F, 1, 2, 10, 0.001F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.1307F, -0.456F, -9.445F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1537F, -0.2322F, -0.098F);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(2.4693F, -0.9004F, -7.0059F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0015F, 0.1745F, 0.0089F);


        this.eye3 = new ModelRenderer(this);
        this.eye3.setRotationPoint(-2.7307F, -0.9004F, -7.0059F);
        this.head.addChild(eye3);
        this.setRotateAngle(eye3, 0.0015F, -0.1745F, -0.0089F);


        this.eye2 = new ModelRenderer(this);
        this.eye2.setRotationPoint(2.2517F, -1.1581F, -2.9965F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, -0.1745F, 0.0F, 0.0F);


        this.eye4 = new ModelRenderer(this);
        this.eye4.setRotationPoint(-2.5131F, -1.1581F, -2.9965F);
        this.head.addChild(eye4);
        this.setRotateAngle(eye4, -0.1745F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.1307F, 1.1996F, 0.9441F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.35F, 5.7F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1986F, 0.2569F, -0.0511F);
        this.tail.cubeList.add(new ModelBox(tail, 59, 76, -0.5F, 0.8448F, -0.085F, 1, 2, 9, 0.001F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0448F, 8.715F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1896F, 0.2573F, -0.0488F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 44, -0.5F, 0.8406F, 0.1708F, 1, 2, 12, 0.001F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1594F, 12.1208F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0089F, 0.1745F, 0.0015F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 59, -0.5F, 0.9619F, -0.2468F, 1, 2, 11, 0.001F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2619F, 10.4532F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.064F, -0.3048F, -0.0192F);
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 50, -0.5F, 0.587F, -0.1774F, 1, 2, 7, 0.001F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.413F, 6.7226F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -1, 23, 0.0F, 0.9F, -0.9F, 1, 1, 6, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.613F, 11.2226F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2355F, -0.3829F, -0.0894F);
        this.tail5.cubeList.add(new ModelBox(tail5, 61, 63, -0.5F, 0.5678F, -0.0375F, 1, 1, 11, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.0322F, 10.9625F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1107F, -0.5209F, -0.0553F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 15, -0.5F, 0.4311F, -0.4745F, 1, 1, 16, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.2311F, 15.2255F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, 0.0F, -0.6109F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 36, 63, -0.5F, 0.1F, -0.25F, 1, 1, 11, -0.15F, false));

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
