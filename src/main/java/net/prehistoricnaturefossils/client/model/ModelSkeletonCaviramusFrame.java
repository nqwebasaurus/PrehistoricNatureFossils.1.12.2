package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCaviramusFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawfronttip;
    private final ModelRenderer Chinkeel;
    private final ModelRenderer Leftlowerteeth;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Lowerjawteeth;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Headslopefront;
    private final ModelRenderer Crest;
    private final ModelRenderer Leftupperteeth;
    private final ModelRenderer Rightupperteeth;
    private final ModelRenderer Headslopeback;
    private final ModelRenderer Upperjawteeth;
    private final ModelRenderer wing1R;
    private final ModelRenderer wing2R;
    private final ModelRenderer wing3R;
    private final ModelRenderer wing4R;
    private final ModelRenderer handR;
    private final ModelRenderer wing1R2;
    private final ModelRenderer wing2R2;
    private final ModelRenderer wing3R2;
    private final ModelRenderer wing4R2;
    private final ModelRenderer handR2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer Rudder;
    private final ModelRenderer upperlegR;
    private final ModelRenderer lowerlegR;
    private final ModelRenderer footR;
    private final ModelRenderer upperlegR2;
    private final ModelRenderer lowerlegR2;
    private final ModelRenderer footR2;

    public ModelSkeletonCaviramusFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 10.1F, -1.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.163F, -0.1131F, 0.6016F);
        this.hips.cubeList.add(new ModelBox(hips, 47, 28, 0.1773F, 0.7673F, 3.3827F, 1, 1, 5, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.6773F, 0.2673F, 4.3827F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0966F, -0.1225F, 0.0988F);
        this.body.cubeList.add(new ModelBox(body, 37, 39, -0.5F, 0.5967F, -5.9556F, 1, 1, 6, -0.1F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -5.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1263F, -0.0166F, 0.1299F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, 4.1149F, -4.5348F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -1.5708F, 0.0349F, 1.5708F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 15, 38, -2.3F, -0.5F, -3.0F, 1, 1, 6, -0.1F, false));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(0.0F, 1.1866F, -2.4313F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, -1.6057F, 0.0F, 0.0F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 20, 43, -0.5F, 1.5F, 0.0F, 1, 1, 1, -0.101F, false));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(0.0F, 0.0681F, -6.615F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, -0.0349F, 0.0F, 0.0F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 15, 38, -0.5F, 0.5207F, -0.179F, 1, 1, 6, -0.1F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6F, -5.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1274F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 48, 46, -0.5F, 0.1055F, -5.074F, 1, 1, 4, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.2F, 0.1F, -4.7F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.4106F, -0.4213F, 0.1169F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 0.8401F, -4.1962F);
        this.neck2.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.0349F, 0.0524F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 0, 48, -0.5F, -0.7F, -0.5F, 1, 1, 5, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.2371F, -0.0529F, -0.064F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6981F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1485F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1274F, 0.0F, 0.0F);


        this.Lowerjawfronttip = new ModelRenderer(this);
        this.Lowerjawfronttip.setRotationPoint(-0.01F, 2.2F, -2.0F);
        this.Lowerjawfront.addChild(Lowerjawfronttip);
        this.setRotateAngle(Lowerjawfronttip, 0.4671F, 0.0F, 0.0F);


        this.Chinkeel = new ModelRenderer(this);
        this.Chinkeel.setRotationPoint(0.0F, 2.6F, -1.9F);
        this.Lowerjawfront.addChild(Chinkeel);
        this.setRotateAngle(Chinkeel, 0.1698F, 0.0F, 0.0F);


        this.Leftlowerteeth = new ModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.1F, 0.2F, -2.6F);
        this.Lowerjawfront.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0637F, 0.0F, -0.4245F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.1F, 0.2F, -2.6F);
        this.Lowerjawfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, 0.0F, 0.4245F);


        this.Lowerjawteeth = new ModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(-0.01F, 0.5F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, -0.1061F, 0.0F, 0.0F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.1485F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.7F, -3.1F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0637F, 0.0F, 0.0F);


        this.Headslopefront = new ModelRenderer(this);
        this.Headslopefront.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Upperjawfront.addChild(Headslopefront);
        this.setRotateAngle(Headslopefront, 0.0424F, 0.0F, 0.0F);


        this.Crest = new ModelRenderer(this);
        this.Crest.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Headslopefront.addChild(Crest);
        this.setRotateAngle(Crest, -0.0848F, 0.0F, 0.0F);


        this.Leftupperteeth = new ModelRenderer(this);
        this.Leftupperteeth.setRotationPoint(-1.0F, 0.6F, -3.0F);
        this.Upperjawfront.addChild(Leftupperteeth);
        this.setRotateAngle(Leftupperteeth, -0.0848F, 0.0F, 0.2335F);


        this.Rightupperteeth = new ModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(1.0F, 0.6F, -3.0F);
        this.Upperjawfront.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, -0.0848F, 0.0F, -0.2335F);


        this.Headslopeback = new ModelRenderer(this);
        this.Headslopeback.setRotationPoint(0.0F, -1.0F, 0.3F);
        this.Upperjawback.addChild(Headslopeback);
        this.setRotateAngle(Headslopeback, 0.2546F, 0.0F, 0.0F);


        this.Upperjawteeth = new ModelRenderer(this);
        this.Upperjawteeth.setRotationPoint(0.0F, 1.4F, -3.2F);
        this.Upperjawback.addChild(Upperjawteeth);


        this.wing1R = new ModelRenderer(this);
        this.wing1R.setRotationPoint(2.5F, 2.0F, -4.5F);
        this.chest.addChild(wing1R);
        this.setRotateAngle(wing1R, -0.0722F, -0.2748F, 0.0386F);


        this.wing2R = new ModelRenderer(this);
        this.wing2R.setRotationPoint(7.2539F, -0.3379F, 0.3626F);
        this.wing1R.addChild(wing2R);
        this.setRotateAngle(wing2R, -0.144F, 0.6831F, -0.2895F);


        this.wing3R = new ModelRenderer(this);
        this.wing3R.setRotationPoint(17.6981F, 0.8221F, -0.9589F);
        this.wing2R.addChild(wing3R);
        this.setRotateAngle(wing3R, 0.0158F, -0.3463F, 0.0173F);


        this.wing4R = new ModelRenderer(this);
        this.wing4R.setRotationPoint(12.0F, -0.09F, 0.5F);
        this.wing3R.addChild(wing4R);
        this.setRotateAngle(wing4R, -0.0295F, -0.3254F, 0.1769F);


        this.handR = new ModelRenderer(this);
        this.handR.setRotationPoint(17.5F, 0.0F, 0.0F);
        this.wing2R.addChild(handR);
        this.setRotateAngle(handR, -0.1061F, -0.4671F, 0.0F);


        this.wing1R2 = new ModelRenderer(this);
        this.wing1R2.setRotationPoint(-2.5F, 2.0F, -4.5F);
        this.chest.addChild(wing1R2);
        this.setRotateAngle(wing1R2, 0.0785F, 0.2731F, 0.5058F);


        this.wing2R2 = new ModelRenderer(this);
        this.wing2R2.setRotationPoint(-7.2539F, -0.3379F, 0.3626F);
        this.wing1R2.addChild(wing2R2);
        this.setRotateAngle(wing2R2, -0.144F, -0.6831F, 0.2895F);


        this.wing3R2 = new ModelRenderer(this);
        this.wing3R2.setRotationPoint(-17.6981F, 0.8221F, -0.9589F);
        this.wing2R2.addChild(wing3R2);
        this.setRotateAngle(wing3R2, 0.0315F, 0.3452F, 0.029F);


        this.wing4R2 = new ModelRenderer(this);
        this.wing4R2.setRotationPoint(-12.0F, -0.09F, 0.5F);
        this.wing3R2.addChild(wing4R2);
        this.setRotateAngle(wing4R2, -0.0148F, 0.3264F, -0.1309F);


        this.handR2 = new ModelRenderer(this);
        this.handR2.setRotationPoint(-17.5F, 0.0F, 0.0F);
        this.wing2R2.addChild(handR2);
        this.setRotateAngle(handR2, -0.1061F, 0.4671F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.6773F, 0.6673F, 7.8827F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0848F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 36, 47, -0.5F, 0.1F, 0.4F, 1, 1, 5, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2147F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 4, -0.5F, 0.3F, 0.0F, 1, 1, 11, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(-0.01F, 0.01F, 10.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.086F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, -0.5F, 0.3F, 0.0F, 1, 1, 13, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.01F, -0.01F, 12.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0424F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.3F, 0.0F, 1, 1, 17, -0.1F, false));

        this.Rudder = new ModelRenderer(this);
        this.Rudder.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(Rudder);


        this.upperlegR = new ModelRenderer(this);
        this.upperlegR.setRotationPoint(2.2773F, 2.6673F, 6.9827F);
        this.hips.addChild(upperlegR);
        this.setRotateAngle(upperlegR, 0.5321F, -0.3125F, -1.327F);


        this.lowerlegR = new ModelRenderer(this);
        this.lowerlegR.setRotationPoint(1.0F, 5.5F, -1.0F);
        this.upperlegR.addChild(lowerlegR);
        this.setRotateAngle(lowerlegR, 0.9823F, 0.0848F, -0.0213F);


        this.footR = new ModelRenderer(this);
        this.footR.setRotationPoint(-0.01F, 9.9F, 0.0F);
        this.lowerlegR.addChild(footR);
        this.setRotateAngle(footR, -0.4564F, 0.0F, 0.0F);


        this.upperlegR2 = new ModelRenderer(this);
        this.upperlegR2.setRotationPoint(-0.9227F, 2.6673F, 6.9827F);
        this.hips.addChild(upperlegR2);
        this.setRotateAngle(upperlegR2, 0.1373F, 0.1267F, 1.7669F);


        this.lowerlegR2 = new ModelRenderer(this);
        this.lowerlegR2.setRotationPoint(-0.9F, 5.5F, -1.0F);
        this.upperlegR2.addChild(lowerlegR2);
        this.setRotateAngle(lowerlegR2, 0.7641F, -0.0848F, 0.0213F);


        this.footR2 = new ModelRenderer(this);
        this.footR2.setRotationPoint(0.01F, 9.9F, 0.0F);
        this.lowerlegR2.addChild(footR2);
        this.setRotateAngle(footR2, -0.151F, 0.0F, 0.0F);

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
