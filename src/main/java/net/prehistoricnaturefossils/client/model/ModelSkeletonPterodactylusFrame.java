package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPterodactylusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer chest;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer leftwing;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer leftwing6;
    private final ModelRenderer handR2;
    private final ModelRenderer rightwing;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer rightwing6;
    private final ModelRenderer handR3;
    private final ModelRenderer neck;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;

    public ModelSkeletonPterodactylusFrame() {
        this.textureWidth = 41;
        this.textureHeight = 41;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.498F, -5.8F, 4.5F, 1, 6, 1, -0.2F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.495F, -7.8F, 0.0F, 1, 8, 1, -0.2F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -2.0F, -8.25F, 0.0F, 4, 1, 1, -0.2F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -5.25F, 4.4F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, 0.0175F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, 0, 1, -2.0F, -1.0F, 0.05F, 4, 1, 1, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -7.85F, 2.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.0873F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.55F, 2.25F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.2637F, 0.0F, 0.0F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.4728F, 0.0392F);
        this.body1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.2531F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 19, 30, -0.5F, -0.5799F, -0.0815F, 1, 1, 2, -0.2F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.8F, 1.271F, 0.8779F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3762F, 0.2018F, -0.7356F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.3398F, 2.7451F, 0.0857F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6013F, -0.4618F, 0.4437F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.0694F, 3.5345F, -0.0498F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.1578F, 0.2393F, 0.1223F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.8F, 1.271F, 0.8779F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.0712F, -0.2172F, 0.743F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.3398F, 2.7451F, 0.0857F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4082F, 0.4862F, -0.4844F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0694F, 3.4345F, -0.0498F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.245F, -0.2393F, -0.1223F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.596F, 1.8779F);
        this.body1.addChild(tail);
        this.setRotateAngle(tail, -0.3124F, -0.2079F, 0.0666F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 0.8838F, -0.3817F);
        this.tail.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.1047F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 34, 12, -0.5F, -0.2398F, 0.2538F, 1, 1, 2, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, 2.05F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, -0.6327F, -5.0499F);
        this.chest.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.3229F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 6, 11, -0.499F, -0.3359F, -0.1126F, 1, 1, 6, -0.2F, false));

        this.leftwing = new ModelRenderer(this);
        this.leftwing.setRotationPoint(1.85F, -0.889F, -3.4483F);
        this.chest.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.0319F, -0.5284F, 0.754F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7004F, 0.0481F, -0.2533F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -1.239F, 0.5005F, -0.7896F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.5172F, 3.4711F, -0.1213F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.8437F, 0.0115F, -0.0813F);


        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(0.4383F, -0.2956F, 3.6533F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.9034F, -0.1608F, 0.077F);


        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.5399F, -0.1204F, 1.912F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.9128F, -0.0395F, 0.0494F);


        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.5399F, -0.1204F, 1.912F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.9128F, -0.0395F, 0.0494F);


        this.handR2 = new ModelRenderer(this);
        this.handR2.setRotationPoint(-0.0305F, -0.026F, 3.4087F);
        this.leftwing3.addChild(handR2);
        this.setRotateAngle(handR2, -1.5252F, 0.1685F, -1.3051F);


        this.rightwing = new ModelRenderer(this);
        this.rightwing.setRotationPoint(-1.85F, -0.889F, -3.4483F);
        this.chest.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.0294F, 0.354F, -0.7481F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7004F, 0.0481F, -0.2533F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -1.3458F, -0.3763F, 0.8354F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.5172F, 3.4711F, -0.1213F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.4947F, -0.0115F, 0.0813F);


        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.4383F, -0.2956F, 3.6533F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 2.0456F, 0.0909F, -0.1569F);


        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.5399F, -0.1204F, 1.912F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.9128F, 0.0395F, -0.0494F);


        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.5399F, -0.1204F, 1.912F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.9128F, 0.0395F, -0.0494F);


        this.handR3 = new ModelRenderer(this);
        this.handR3.setRotationPoint(0.0305F, -0.026F, 3.4087F);
        this.rightwing3.addChild(handR3);
        this.setRotateAngle(handR3, -1.2634F, -0.1685F, 1.3051F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.339F, -4.4983F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.829F, 0.0F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 1.049F, -3.1412F);
        this.neck.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, 0.1309F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 7, 19, -0.5F, -0.2063F, -0.2692F, 1, 1, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0628F, -3.0278F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5133F, 0.1084F, 0.1897F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.0F, 1.2933F, -2.0936F);
        this.neck2.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0962F, 0.0872F, 0.0038F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 5, 30, -0.5F, -0.4346F, -0.0014F, 1, 1, 3, -0.2F, false));

        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.0F, 0.8452F, -2.9095F);
        this.neck2.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.4014F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 0, 23, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6567F, -4.2951F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.8333F, 0.0883F, 0.0968F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.3907F, -0.7549F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8976F, -2.9807F);
        this.jaw.addChild(throat);

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
