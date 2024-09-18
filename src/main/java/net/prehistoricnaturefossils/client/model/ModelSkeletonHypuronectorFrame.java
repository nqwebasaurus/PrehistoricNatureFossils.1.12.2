package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHypuronectorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Hypuronector;
    private final ModelRenderer lowerbody;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer finger;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer finger2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r11;
    private final ModelRenderer frontleftarm;
    private final ModelRenderer frontleftarm2;
    private final ModelRenderer frontleftarm3;
    private final ModelRenderer frontleftarm4;
    private final ModelRenderer frontrightarm;
    private final ModelRenderer frontrightarm2;
    private final ModelRenderer frontrightarm3;
    private final ModelRenderer frontrightarm4;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r12;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r13;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;

    public ModelSkeletonHypuronectorFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -15.0F, 14.4F, 1, 15, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -12.0F, -3.7F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1222F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.8F, -3.0F, -0.5F, 1, 15, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -9.9F, -3.7F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.122F, 0.0064F, -1.6228F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -5.0F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -14.5F, 14.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -1.5F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.Hypuronector = new ModelRenderer(this);
        this.Hypuronector.setRotationPoint(0.0F, -4.25F, 0.0F);
        this.fossil.addChild(Hypuronector);


        this.lowerbody = new ModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -10.7F, 10.0F);
        this.Hypuronector.addChild(lowerbody);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.85F, -0.4F);
        this.lowerbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 18, -0.5F, 0.7F, 0.3F, 1, 1, 7, -0.15F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(2.25F, 1.45F, 4.95F);
        this.lowerbody.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.3051F, -0.0072F, -0.0952F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.506F, 7.3876F, 0.4497F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.6961F, -0.0653F, 0.0626F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.0268F, 5.5994F, 0.0082F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.3763F, 0.0331F, 0.0955F);


        this.finger = new ModelRenderer(this);
        this.finger.setRotationPoint(-0.9952F, 0.4042F, 0.3042F);
        this.backleftleg3.addChild(finger);
        this.setRotateAngle(finger, 0.0F, 0.2618F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.25F, 1.45F, 4.95F);
        this.lowerbody.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.6082F, 0.0572F, 0.1668F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.506F, 7.3876F, 0.4497F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.5216F, 0.0653F, -0.0626F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0268F, 5.5994F, 0.0082F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.3219F, -0.0331F, -0.0955F);


        this.finger2 = new ModelRenderer(this);
        this.finger2.setRotationPoint(0.9952F, 0.4042F, 0.3042F);
        this.backrightleg3.addChild(finger2);
        this.setRotateAngle(finger2, 0.0F, -0.2618F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.723F, 6.1814F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.0922F, 0.3032F, -0.016F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -0.027F, -2.1814F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.7F, 2.0F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.377F, 4.8186F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2669F, 0.2129F, 0.0479F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1594F, 3.8564F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, -1, -0.5F, -0.15F, -4.4F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4592F, 7.7524F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0894F, 0.2173F, -0.0193F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7002F, 0.104F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 25, -0.5F, 0.5243F, 0.1576F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.005F, -0.6693F, 6.7881F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2716F, 0.083F, -0.027F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.005F, -0.0309F, -12.8841F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, 0.6743F, 12.7576F, 1, 1, 13, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.8F, 12.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.131F, 0.0433F, -0.0057F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 15, -0.5F, 0.3F, -0.4F, 1, 1, 10, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.55F, -0.3F);
        this.lowerbody.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.85F, -12.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 33, -0.5F, -0.2F, -0.2F, 1, 1, 7, -0.15F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.45F, -6.1F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 36, -0.5F, 0.7894F, 0.54F, 1, 1, 6, -0.15F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 0.2F, -12.0F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0F, -0.0873F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.15F, -3.7F);
        this.upperbody.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 36, -0.5F, -0.2F, -0.2F, 1, 1, 4, -0.15F, false));

        this.frontleftarm = new ModelRenderer(this);
        this.frontleftarm.setRotationPoint(4.5F, 6.15F, -1.95F);
        this.upperbody.addChild(frontleftarm);
        this.setRotateAngle(frontleftarm, -0.5417F, -0.0134F, -0.2521F);


        this.frontleftarm2 = new ModelRenderer(this);
        this.frontleftarm2.setRotationPoint(0.1238F, 0.1887F, 7.3547F);
        this.frontleftarm.addChild(frontleftarm2);
        this.setRotateAngle(frontleftarm2, 0.1252F, -0.0438F, 0.256F);


        this.frontleftarm3 = new ModelRenderer(this);
        this.frontleftarm3.setRotationPoint(0.4089F, 5.5813F, 0.3197F);
        this.frontleftarm2.addChild(frontleftarm3);
        this.setRotateAngle(frontleftarm3, -1.0893F, 0.2209F, 0.069F);


        this.frontleftarm4 = new ModelRenderer(this);
        this.frontleftarm4.setRotationPoint(0.4089F, 5.5813F, 0.3197F);
        this.frontleftarm2.addChild(frontleftarm4);
        this.setRotateAngle(frontleftarm4, -1.0389F, -0.3684F, -0.2082F);


        this.frontrightarm = new ModelRenderer(this);
        this.frontrightarm.setRotationPoint(-4.5F, 6.15F, -1.95F);
        this.upperbody.addChild(frontrightarm);
        this.setRotateAngle(frontrightarm, -2.287F, 0.0134F, 0.2521F);


        this.frontrightarm2 = new ModelRenderer(this);
        this.frontrightarm2.setRotationPoint(-0.1238F, 0.1887F, 7.3547F);
        this.frontrightarm.addChild(frontrightarm2);
        this.setRotateAngle(frontrightarm2, 0.89F, 0.0878F, 0.0911F);


        this.frontrightarm3 = new ModelRenderer(this);
        this.frontrightarm3.setRotationPoint(-0.4089F, 5.5813F, 0.3197F);
        this.frontrightarm2.addChild(frontrightarm3);
        this.setRotateAngle(frontrightarm3, 0.2197F, -0.2209F, -0.069F);


        this.frontrightarm4 = new ModelRenderer(this);
        this.frontrightarm4.setRotationPoint(-0.4089F, 5.5813F, 0.3197F);
        this.frontrightarm2.addChild(frontrightarm4);
        this.setRotateAngle(frontrightarm4, 0.3137F, 0.3684F, 0.2082F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.7516F, -3.5943F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.0F, -0.0436F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.1984F, -5.7057F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3229F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 28, -0.5F, -0.1625F, 0.0296F, 1, 1, 6, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.6594F, -5.6024F);
        this.neck.addChild(neck3);
        this.setRotateAngle(neck3, -0.1374F, -0.4293F, -0.1922F);
        this.neck3.cubeList.add(new ModelBox(neck3, -1, 6, -0.5F, 0.211F, -4.2227F, 1, 1, 5, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0728F, -3.7982F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.3242F, -0.3861F, 0.0736F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.24F, -2.7678F);
        this.neck4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2967F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 42, 11, -0.5F, 0.5426F, -0.4702F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8536F, -2.5588F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.1632F, -0.1281F, -0.0268F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.1535F, -0.4893F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.6545F, 0.0F, 0.0F);

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
