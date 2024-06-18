package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRhomaleosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Neck1;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neckmiddlebase_r1;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neck4;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Orbitflesh;
    private final ModelRenderer Lefteye;
    private final ModelRenderer Lefteye2;
    private final ModelRenderer Righteye;
    private final ModelRenderer Leftfrontflipper1;
    private final ModelRenderer Leftfrontflipper2;
    private final ModelRenderer Leftfrontflipper3;
    private final ModelRenderer Rightfrontflipper1;
    private final ModelRenderer Rightfrontflipper2;
    private final ModelRenderer Rightfrontflipper3;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tailmiddleend_r1;
    private final ModelRenderer Tailfluke1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tailfluke2;
    private final ModelRenderer Tailfluke3;
    private final ModelRenderer Lefthindflipper1;
    private final ModelRenderer Lefthindflipper2;
    private final ModelRenderer Lefthindflipper3;
    private final ModelRenderer Righthindflipper1;
    private final ModelRenderer Righthindflipper2;
    private final ModelRenderer Righthindflipper3;

    public ModelSkeletonRhomaleosaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 17.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -20.0F, 1.5F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, 0.7267F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 26, 44, -1.0F, -0.2592F, 9.9437F, 2, 2, 13, -0.2F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 37, 55, -1.0F, -0.0592F, 15.0687F, 2, 4, 2, -0.25F, false));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 2.9408F, 16.0687F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0F, 0.0F, -1.5708F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 55, -1.0F, -5.0F, -1.0F, 2, 11, 2, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.1592F, 10.4437F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0024F, 0.0F, 0.0F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 0.4F, -18.6F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0175F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 18, -1.0F, 0.675F, 0.1F, 2, 2, 19, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.1F, -18.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0908F, -0.0873F, 0.0003F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 11.5606F, -8.2262F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0F, 0.0175F, 1.5708F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 10, 62, -5.575F, -5.5F, -1.0F, 2, 11, 2, -0.2F, false));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(0.0F, 0.0F, -11.6F);
        this.Bodyfront.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.0175F, 0.0F, 0.0F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 10, 62, -1.0F, 1.0F, 2.575F, 2, 7, 2, -0.25F, false));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(0.0F, 0.0F, -12.8F);
        this.Bodyfront.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.0175F, 0.0F, 0.0F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 0, 52, -1.0F, 0.75F, 1.3F, 2, 2, 12, -0.2F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.1F, -11.1F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.2822F, -0.0207F, -0.0848F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 36, 73, -1.0F, 0.8296F, -6.3826F, 2, 2, 7, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, -0.0704F, -6.1826F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.3945F, -0.1209F, 0.0502F);


        this.Neckmiddlebase_r1 = new ModelRenderer(this);
        this.Neckmiddlebase_r1.setRotationPoint(0.0F, 0.329F, -8.1697F);
        this.Neck2.addChild(Neckmiddlebase_r1);
        this.setRotateAngle(Neckmiddlebase_r1, 0.0305F, 0.0F, 0.0F);
        this.Neckmiddlebase_r1.cubeList.add(new ModelBox(Neckmiddlebase_r1, 63, 21, -1.0F, 0.75F, 0.0F, 2, 2, 10, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.01F, 0.329F, -7.6697F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0677F, -0.305F, 0.0146F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 15, 73, -1.0F, 0.7251F, -7.4894F, 2, 2, 8, -0.2F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.01F, -7.3F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.2155F, -0.4274F, 0.0905F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 0, 78, -1.0F, 0.675F, -5.5001F, 2, 2, 6, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -5.4F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.3054F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.6981F, 0.0F, 0.0F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.5F, -5.5F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.1061F, 0.0F, 0.0F);


        this.Orbitflesh = new ModelRenderer(this);
        this.Orbitflesh.setRotationPoint(0.0F, -3.2F, -0.2F);
        this.Upperjawbase.addChild(Orbitflesh);
        this.setRotateAngle(Orbitflesh, 0.1061F, 0.0F, 0.0F);


        this.Lefteye = new ModelRenderer(this);
        this.Lefteye.setRotationPoint(2.4F, -2.5F, -2.52F);
        this.Upperjawbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.1061F, 0.4671F, -0.1698F);


        this.Lefteye2 = new ModelRenderer(this);
        this.Lefteye2.setRotationPoint(-2.42F, -2.5F, -2.52F);
        this.Upperjawbase.addChild(Lefteye2);
        this.setRotateAngle(Lefteye2, -0.1061F, -0.4671F, 0.1698F);


        this.Righteye = new ModelRenderer(this);
        this.Righteye.setRotationPoint(-2.4F, -2.5F, -2.52F);
        this.Upperjawbase.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.1061F, -0.4671F, 0.1698F);


        this.Leftfrontflipper1 = new ModelRenderer(this);
        this.Leftfrontflipper1.setRotationPoint(4.8F, 5.95F, -9.0F);
        this.Bodyfront.addChild(Leftfrontflipper1);
        this.setRotateAngle(Leftfrontflipper1, -0.2582F, -0.1445F, 0.6858F);


        this.Leftfrontflipper2 = new ModelRenderer(this);
        this.Leftfrontflipper2.setRotationPoint(10.449F, 0.0469F, 1.6432F);
        this.Leftfrontflipper1.addChild(Leftfrontflipper2);
        this.setRotateAngle(Leftfrontflipper2, 0.0276F, -0.1025F, -0.2632F);


        this.Leftfrontflipper3 = new ModelRenderer(this);
        this.Leftfrontflipper3.setRotationPoint(10.5F, -0.3F, -1.6F);
        this.Leftfrontflipper2.addChild(Leftfrontflipper3);
        this.setRotateAngle(Leftfrontflipper3, 0.0655F, -0.1568F, -0.3978F);


        this.Rightfrontflipper1 = new ModelRenderer(this);
        this.Rightfrontflipper1.setRotationPoint(-4.8F, 5.95F, -9.0F);
        this.Bodyfront.addChild(Rightfrontflipper1);
        this.setRotateAngle(Rightfrontflipper1, -0.2216F, 0.1965F, -0.4708F);


        this.Rightfrontflipper2 = new ModelRenderer(this);
        this.Rightfrontflipper2.setRotationPoint(-10.449F, 0.1469F, 1.6432F);
        this.Rightfrontflipper1.addChild(Rightfrontflipper2);
        this.setRotateAngle(Rightfrontflipper2, 0.0185F, 0.1045F, 0.1755F);


        this.Rightfrontflipper3 = new ModelRenderer(this);
        this.Rightfrontflipper3.setRotationPoint(-10.5F, -0.4F, -1.6F);
        this.Rightfrontflipper2.addChild(Rightfrontflipper3);
        this.setRotateAngle(Rightfrontflipper3, 0.0515F, 0.1619F, 0.3096F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.9592F, 21.9437F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, 0.067F, 0.1741F, 0.0116F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 71, 36, -1.0F, 0.7501F, -0.0106F, 2, 2, 8, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0991F, 7.3766F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0222F, 0.1309F, -0.0028F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 65, 0, -1.0F, 0.8545F, -0.2191F, 2, 2, 7, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.1045F, 6.0809F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1095F, 0.0872F, -0.0019F);


        this.Tailmiddleend_r1 = new ModelRenderer(this);
        this.Tailmiddleend_r1.setRotationPoint(0.0F, 1.7516F, -0.1611F);
        this.Tail3.addChild(Tailmiddleend_r1);
        this.setRotateAngle(Tailmiddleend_r1, 0.096F, 0.0F, 0.0F);
        this.Tailmiddleend_r1.cubeList.add(new ModelBox(Tailmiddleend_r1, 74, 73, -1.0F, -1.0F, 0.125F, 2, 2, 6, -0.2F, false));

        this.Tailfluke1 = new ModelRenderer(this);
        this.Tailfluke1.setRotationPoint(-0.01F, -2.8998F, -0.0192F);
        this.Tail3.addChild(Tailfluke1);
        this.setRotateAngle(Tailfluke1, 0.0637F, 0.0F, 0.0F);


        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.0998F, 5.6808F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1318F, 0.1308F, -0.0056F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 76, 52, -0.5F, 0.2819F, -0.453F, 1, 1, 7, -0.2F, false));

        this.Tailfluke2 = new ModelRenderer(this);
        this.Tailfluke2.setRotationPoint(0.0F, -2.9906F, -1.0422F);
        this.Tail4.addChild(Tailfluke2);
        this.setRotateAngle(Tailfluke2, 0.2759F, 0.0F, 0.0F);


        this.Tailfluke3 = new ModelRenderer(this);
        this.Tailfluke3.setRotationPoint(0.01F, 0.0F, 6.0F);
        this.Tailfluke2.addChild(Tailfluke3);
        this.setRotateAngle(Tailfluke3, -1.0826F, 0.0F, 0.0F);


        this.Lefthindflipper1 = new ModelRenderer(this);
        this.Lefthindflipper1.setRotationPoint(4.7F, 2.9408F, 15.9437F);
        this.Hips.addChild(Lefthindflipper1);
        this.setRotateAngle(Lefthindflipper1, 0.2815F, -0.3777F, -0.5376F);


        this.Lefthindflipper2 = new ModelRenderer(this);
        this.Lefthindflipper2.setRotationPoint(9.3354F, 0.3729F, 0.5605F);
        this.Lefthindflipper1.addChild(Lefthindflipper2);
        this.setRotateAngle(Lefthindflipper2, -0.0185F, -0.1045F, 0.1755F);


        this.Lefthindflipper3 = new ModelRenderer(this);
        this.Lefthindflipper3.setRotationPoint(10.5F, -0.5F, -1.1F);
        this.Lefthindflipper2.addChild(Lefthindflipper3);
        this.setRotateAngle(Lefthindflipper3, -0.0586F, -0.1595F, 0.3537F);


        this.Righthindflipper1 = new ModelRenderer(this);
        this.Righthindflipper1.setRotationPoint(-4.7F, 2.9408F, 15.9437F);
        this.Hips.addChild(Righthindflipper1);
        this.setRotateAngle(Righthindflipper1, 0.2646F, 0.3895F, 0.4923F);


        this.Righthindflipper2 = new ModelRenderer(this);
        this.Righthindflipper2.setRotationPoint(-9.3354F, 0.5729F, 0.5605F);
        this.Righthindflipper1.addChild(Righthindflipper2);
        this.setRotateAngle(Righthindflipper2, -0.0185F, 0.1045F, -0.1755F);


        this.Righthindflipper3 = new ModelRenderer(this);
        this.Righthindflipper3.setRotationPoint(-10.5F, -0.7F, -1.1F);
        this.Righthindflipper2.addChild(Righthindflipper3);
        this.setRotateAngle(Righthindflipper3, -0.0723F, 0.1538F, -0.4419F);

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
