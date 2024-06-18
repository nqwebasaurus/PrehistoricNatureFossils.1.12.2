package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKentrosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer main;
    private final ModelRenderer body;
    private final ModelRenderer frame9_r1;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer frame10_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame11_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame12_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame13_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer frame14_r1;
    private final ModelRenderer body2;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer platedontmove2;
    private final ModelRenderer platedontmove12;
    private final ModelRenderer platedontmove3;
    private final ModelRenderer platedontmove13;
    private final ModelRenderer platedontmove4;
    private final ModelRenderer platedontmove11;
    private final ModelRenderer upperbody;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer spike2;
    private final ModelRenderer spike;
    private final ModelRenderer platedontmove5;
    private final ModelRenderer platedontmove10;
    private final ModelRenderer platedontmove6;
    private final ModelRenderer platedontmove9;
    private final ModelRenderer neck;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer platedontmove7;
    private final ModelRenderer platedontmove8;
    private final ModelRenderer neck2;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;

    public ModelSkeletonKentrosaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.9F, 10.5F, 1, 19, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -4.55F, -15.9F, -9.95F, 1, 16, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-4.3F, -11.0F, -9.95F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, 0.4363F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -1.0F, 0.0F, 10, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -17.25F, 10.5F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, -0.0019F, 0.0436F, -0.0437F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -1.0F, 0.01F, 8, 1, 1, -0.1F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.fossil.addChild(main);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -19.0F, 8.0F);
        this.main.addChild(body);


        this.frame9_r1 = new ModelRenderer(this);
        this.frame9_r1.setRotationPoint(0.0F, -0.25F, -4.25F);
        this.body.addChild(frame9_r1);
        this.setRotateAngle(frame9_r1, -0.0436F, 0.0F, 0.0F);
        this.frame9_r1.cubeList.add(new ModelBox(frame9_r1, 15, 17, -0.5F, 1.0F, -0.75F, 1, 1, 10, -0.1F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(4.05F, 1.75F, 1.5F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.4363F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 9.2158F, -1.4779F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.6981F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 7.4388F, 1.9085F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0873F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-4.05F, 1.75F, 1.5F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.1309F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 9.2158F, -1.4779F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.2618F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 7.4388F, 1.9085F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2618F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.15F, 3.75F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.1659F, -0.3695F, 0.0819F);


        this.frame10_r1 = new ModelRenderer(this);
        this.frame10_r1.setRotationPoint(0.45F, 1.6942F, -0.5089F);
        this.tail.addChild(frame10_r1);
        this.setRotateAngle(frame10_r1, -0.1572F, -0.0433F, 0.0053F);
        this.frame10_r1.cubeList.add(new ModelBox(frame10_r1, 29, 0, -0.5F, -1.0422F, 0.9173F, 1, 1, 8, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.7018F, 7.6671F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1372F, -0.3027F, 0.0411F);


        this.frame11_r1 = new ModelRenderer(this);
        this.frame11_r1.setRotationPoint(0.3F, 1.8554F, 4.7974F);
        this.tail2.addChild(frame11_r1);
        this.setRotateAngle(frame11_r1, -0.0349F, 0.0174F, -0.0006F);
        this.frame11_r1.cubeList.add(new ModelBox(frame11_r1, 1, 28, -0.5F, -0.5F, -4.5F, 1, 1, 9, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3374F, 9.7173F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0492F, -0.4795F, 0.0227F);


        this.frame12_r1 = new ModelRenderer(this);
        this.frame12_r1.setRotationPoint(0.0F, 2.1358F, -0.1669F);
        this.tail3.addChild(frame12_r1);
        this.setRotateAngle(frame12_r1, 0.0524F, 0.0F, 0.0F);
        this.frame12_r1.cubeList.add(new ModelBox(frame12_r1, 0, 0, -0.5F, -0.9455F, -0.8252F, 1, 1, 11, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.7978F, 9.8997F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0962F, -0.4346F, -0.0406F);


        this.frame13_r1 = new ModelRenderer(this);
        this.frame13_r1.setRotationPoint(-0.2F, 1.8628F, -0.104F);
        this.tail4.addChild(frame13_r1);
        this.setRotateAngle(frame13_r1, 0.0349F, 0.0F, 0.0F);
        this.frame13_r1.cubeList.add(new ModelBox(frame13_r1, 14, 3, -0.5F, -0.5056F, -0.861F, 1, 1, 11, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1038F, 9.2872F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1098F, -0.6516F, -0.0668F);


        this.frame14_r1 = new ModelRenderer(this);
        this.frame14_r1.setRotationPoint(0.0F, 1.4216F, 0.3667F);
        this.tail5.addChild(frame14_r1);
        this.setRotateAngle(frame14_r1, 0.0262F, 0.0F, 0.0F);
        this.frame14_r1.cubeList.add(new ModelBox(frame14_r1, 0, 14, -0.5F, -0.5F, -0.5F, 1, 1, 11, -0.1F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.6F, -4.55F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.2182F, 0.0F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.5F, 4.0076F, -10.5364F);
        this.body2.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0873F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 41, 21, -1.0F, -1.8893F, 4.7355F, 1, 1, 6, -0.1F, false));

        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.5F, 4.0076F, -10.2864F);
        this.body2.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.2269F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 51, 16, -0.99F, -1.2007F, -0.0096F, 1, 1, 5, -0.1F, false));

        this.platedontmove2 = new ModelRenderer(this);
        this.platedontmove2.setRotationPoint(3.0F, -1.15F, -4.2F);
        this.body2.addChild(platedontmove2);
        this.setRotateAngle(platedontmove2, 0.2182F, 0.0F, 0.0F);


        this.platedontmove12 = new ModelRenderer(this);
        this.platedontmove12.setRotationPoint(-3.0F, -1.15F, -4.2F);
        this.body2.addChild(platedontmove12);
        this.setRotateAngle(platedontmove12, 0.2182F, 0.0F, 0.0F);


        this.platedontmove3 = new ModelRenderer(this);
        this.platedontmove3.setRotationPoint(3.5F, -2.15F, 1.3F);
        this.body2.addChild(platedontmove3);
        this.setRotateAngle(platedontmove3, 0.1745F, 0.0F, 0.0F);


        this.platedontmove13 = new ModelRenderer(this);
        this.platedontmove13.setRotationPoint(-3.5F, -2.15F, 1.3F);
        this.body2.addChild(platedontmove13);
        this.setRotateAngle(platedontmove13, 0.1745F, 0.0F, 0.0F);


        this.platedontmove4 = new ModelRenderer(this);
        this.platedontmove4.setRotationPoint(2.5F, -0.15F, -8.95F);
        this.body2.addChild(platedontmove4);
        this.setRotateAngle(platedontmove4, 0.2618F, 0.0F, 0.0F);


        this.platedontmove11 = new ModelRenderer(this);
        this.platedontmove11.setRotationPoint(-2.5F, -0.15F, -8.95F);
        this.body2.addChild(platedontmove11);
        this.setRotateAngle(platedontmove11, 0.2618F, 0.0F, 0.0F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 1.596F, -10.1452F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0F, 0.1745F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.5F, 4.204F, -7.7048F);
        this.upperbody.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.3054F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 29, 21, -1.0F, -0.7053F, -0.5796F, 1, 1, 9, -0.1F, false));

        this.spike2 = new ModelRenderer(this);
        this.spike2.setRotationPoint(-5.5895F, 4.0697F, -4.8222F);
        this.upperbody.addChild(spike2);
        this.setRotateAngle(spike2, 0.3541F, -0.1625F, -0.0638F);


        this.spike = new ModelRenderer(this);
        this.spike.setRotationPoint(5.0192F, 4.2697F, -4.3575F);
        this.upperbody.addChild(spike);
        this.setRotateAngle(spike, 0.3557F, 0.2564F, 0.0308F);


        this.platedontmove5 = new ModelRenderer(this);
        this.platedontmove5.setRotationPoint(2.0F, 0.254F, -3.0548F);
        this.upperbody.addChild(platedontmove5);
        this.setRotateAngle(platedontmove5, 0.3432F, 0.0735F, -0.1585F);


        this.platedontmove10 = new ModelRenderer(this);
        this.platedontmove10.setRotationPoint(-2.0F, 0.254F, -3.0548F);
        this.upperbody.addChild(platedontmove10);
        this.setRotateAngle(platedontmove10, 0.3432F, -0.0735F, 0.1585F);


        this.platedontmove6 = new ModelRenderer(this);
        this.platedontmove6.setRotationPoint(1.9134F, -1.0887F, -7.5249F);
        this.upperbody.addChild(platedontmove6);
        this.setRotateAngle(platedontmove6, 0.6923F, 0.0735F, -0.1585F);


        this.platedontmove9 = new ModelRenderer(this);
        this.platedontmove9.setRotationPoint(-1.9134F, -1.0887F, -7.5249F);
        this.upperbody.addChild(platedontmove9);
        this.setRotateAngle(platedontmove9, 0.6923F, -0.0735F, 0.1585F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.4629F, -7.5454F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.2508F, 0.478F, 0.0453F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.6028F, -0.1048F);
        this.neck.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.1658F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 14, 3, -0.5F, -0.3852F, -3.8646F, 1, 1, 4, -0.1F, false));

        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 1.3672F, -6.2014F);
        this.neck.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.2967F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 50, 68, 0.0F, -0.35F, -0.05F, 1, 1, 3, -0.1F, false));

        this.platedontmove7 = new ModelRenderer(this);
        this.platedontmove7.setRotationPoint(1.1634F, -1.8755F, -2.6216F);
        this.neck.addChild(platedontmove7);
        this.setRotateAngle(platedontmove7, 0.256F, 0.0735F, -0.1585F);


        this.platedontmove8 = new ModelRenderer(this);
        this.platedontmove8.setRotationPoint(-1.1634F, -1.8755F, -2.6216F);
        this.neck.addChild(platedontmove8);
        this.setRotateAngle(platedontmove8, 0.256F, -0.0735F, 0.1585F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4672F, -5.5514F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5273F, 0.1133F, -0.0657F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 1.1976F, -3.4519F);
        this.neck2.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.0524F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 68, 6, 0.0F, -0.467F, 0.958F, 1, 1, 3, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 1.1976F, -5.0519F);
        this.neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, -0.0349F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 66, 42, 0.01F, -0.65F, 0.15F, 1, 1, 3, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0024F, -4.7019F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6222F, 0.1782F, 0.1265F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(-0.5F, 0.9167F, -2.5033F);
        this.neck3.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1134F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 66, 11, 0.0F, -0.65F, -0.35F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.2333F, -2.5533F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.4033F, 0.3892F, 0.054F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.9054F, -0.0183F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(4.25F, 7.004F, -5.3048F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.215F, 0.0376F, -0.1705F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0F, 4.3073F, -0.7599F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.258F, 0.045F, 0.1687F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.0873F, 0.0F, 0.0F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-4.25F, 7.004F, -5.3048F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.7836F, -0.0283F, 0.1278F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.0F, 4.3073F, -0.7599F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -1.3096F, -0.0302F, -0.1273F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 1.2217F, 0.0F, 0.0F);

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
