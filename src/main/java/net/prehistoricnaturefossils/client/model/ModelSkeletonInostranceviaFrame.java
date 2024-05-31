package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonInostranceviaFrame extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer bodyfront;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw1;
    private final ModelRenderer lowerjaw2;
    private final ModelRenderer lowerjaw3;
    private final ModelRenderer lowerjawteeth2;
    private final ModelRenderer lowerjawslope;
    private final ModelRenderer lowerjawteeth1;
    private final ModelRenderer jawparting;
    private final ModelRenderer upperjaw1;
    private final ModelRenderer upperjaw2;
    private final ModelRenderer nose;
    private final ModelRenderer upperjawteeth;
    private final ModelRenderer upperjawteeth1;
    private final ModelRenderer leftsabre;
    private final ModelRenderer rightsabre;
    private final ModelRenderer rightupperarm;
    private final ModelRenderer rightlowerarm;
    private final ModelRenderer rightfrontfoot;
    private final ModelRenderer leftupperarm;
    private final ModelRenderer leftlowerarm;
    private final ModelRenderer leftfrontfoot;
    private final ModelRenderer hips;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer rightthigh;
    private final ModelRenderer rightshin;
    private final ModelRenderer righthindfoot;
    private final ModelRenderer leftthigh;
    private final ModelRenderer leftshin;
    private final ModelRenderer lefthindfoot;
    private final ModelRenderer fur1;
    private final ModelRenderer fur2;
    private final ModelRenderer fur3;
    private final ModelRenderer bb_main;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;

    public ModelSkeletonInostranceviaFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 1, 0, -0.5F, 1.4F, -7.5F, 1, 1, 16, -0.2F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.2F, -7.1F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0542F, 0.2614F, 0.014F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.5F, 2.9248F, -8.652F);
        this.bodyfront.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 1, 34, 0.0F, -1.0F, 0.0F, 1, 1, 9, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5248F, -7.952F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.6597F, 0.3912F, -0.1984F);
        this.neck.cubeList.add(new ModelBox(neck, 39, 35, -0.5F, 1.4216F, -6.9889F, 1, 1, 8, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0216F, -7.0889F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5285F, 0.2747F, 0.0226F);


        this.lowerjaw1 = new ModelRenderer(this);
        this.lowerjaw1.setRotationPoint(0.0F, 1.9473F, -0.2899F);
        this.head.addChild(lowerjaw1);
        this.setRotateAngle(lowerjaw1, 0.8632F, 0.0F, 0.0F);


        this.lowerjaw2 = new ModelRenderer(this);
        this.lowerjaw2.setRotationPoint(0.0F, 0.16F, -5.4F);
        this.lowerjaw1.addChild(lowerjaw2);
        this.setRotateAngle(lowerjaw2, 0.1047F, 0.0F, 0.0F);


        this.lowerjaw3 = new ModelRenderer(this);
        this.lowerjaw3.setRotationPoint(0.0F, 0.1F, -4.3F);
        this.lowerjaw2.addChild(lowerjaw3);
        this.setRotateAngle(lowerjaw3, -0.1047F, 0.0F, 0.0F);


        this.lowerjawteeth2 = new ModelRenderer(this);
        this.lowerjawteeth2.setRotationPoint(0.0F, 0.0F, -1.7F);
        this.lowerjaw3.addChild(lowerjawteeth2);


        this.lowerjawslope = new ModelRenderer(this);
        this.lowerjawslope.setRotationPoint(0.0F, 1.1F, -3.9F);
        this.lowerjaw2.addChild(lowerjawslope);
        this.setRotateAngle(lowerjawslope, -0.3643F, 0.0F, 0.0F);


        this.lowerjawteeth1 = new ModelRenderer(this);
        this.lowerjawteeth1.setRotationPoint(0.0F, 0.3F, -2.2F);
        this.lowerjaw2.addChild(lowerjawteeth1);
        this.setRotateAngle(lowerjawteeth1, -0.2793F, 0.0F, 0.0F);


        this.jawparting = new ModelRenderer(this);
        this.jawparting.setRotationPoint(0.0F, -0.7F, -1.2F);
        this.lowerjaw1.addChild(jawparting);
        this.setRotateAngle(jawparting, -0.4554F, 0.0F, 0.0F);


        this.upperjaw1 = new ModelRenderer(this);
        this.upperjaw1.setRotationPoint(0.0F, -1.9627F, -5.3899F);
        this.head.addChild(upperjaw1);
        this.setRotateAngle(upperjaw1, 0.1047F, 0.0F, 0.0F);


        this.upperjaw2 = new ModelRenderer(this);
        this.upperjaw2.setRotationPoint(0.0F, 4.0F, -6.0F);
        this.upperjaw1.addChild(upperjaw2);
        this.setRotateAngle(upperjaw2, -0.1047F, 0.0F, 0.0F);


        this.nose = new ModelRenderer(this);
        this.nose.setRotationPoint(0.0F, -1.0F, -1.1F);
        this.upperjaw2.addChild(nose);
        this.setRotateAngle(nose, 0.2094F, 0.0F, 0.0F);


        this.upperjawteeth = new ModelRenderer(this);
        this.upperjawteeth.setRotationPoint(0.0F, -0.3F, -1.8F);
        this.upperjaw2.addChild(upperjawteeth);
        this.setRotateAngle(upperjawteeth, 0.0785F, 0.0F, 0.0F);


        this.upperjawteeth1 = new ModelRenderer(this);
        this.upperjawteeth1.setRotationPoint(0.0F, 3.8F, -2.4F);
        this.upperjaw1.addChild(upperjawteeth1);
        this.setRotateAngle(upperjawteeth1, 0.1047F, 0.0F, 0.0F);


        this.leftsabre = new ModelRenderer(this);
        this.leftsabre.setRotationPoint(1.9F, 4.0F, -5.03F);
        this.upperjaw1.addChild(leftsabre);


        this.rightsabre = new ModelRenderer(this);
        this.rightsabre.setRotationPoint(-1.9F, 4.0F, -5.03F);
        this.upperjaw1.addChild(rightsabre);


        this.rightupperarm = new ModelRenderer(this);
        this.rightupperarm.setRotationPoint(4.0F, 8.2725F, -6.1507F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 1.0505F, 0.0392F, -0.2147F);


        this.rightlowerarm = new ModelRenderer(this);
        this.rightlowerarm.setRotationPoint(0.6834F, 5.1515F, 0.0F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -1.3904F, 0.045F, 0.258F);


        this.rightfrontfoot = new ModelRenderer(this);
        this.rightfrontfoot.setRotationPoint(0.0345F, 6.4344F, -0.4973F);
        this.rightlowerarm.addChild(rightfrontfoot);
        this.setRotateAngle(rightfrontfoot, 1.2829F, -0.003F, -0.0435F);


        this.leftupperarm = new ModelRenderer(this);
        this.leftupperarm.setRotationPoint(-4.0F, 8.2725F, -6.1507F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 0.1778F, -0.0392F, 0.2147F);


        this.leftlowerarm = new ModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-0.6834F, 5.1515F, 0.0F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.1687F, -0.045F, -0.258F);


        this.leftfrontfoot = new ModelRenderer(this);
        this.leftfrontfoot.setRotationPoint(-0.0345F, 6.4344F, -0.4973F);
        this.leftlowerarm.addChild(leftfrontfoot);
        this.setRotateAngle(leftfrontfoot, -0.0697F, 0.003F, 0.0435F);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.3F, 8.0F);
        this.body.addChild(hips);
        this.setRotateAngle(hips, -0.0723F, -0.2611F, 0.0187F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.5F, 2.1249F, -0.1128F);
        this.hips.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1047F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 1, 20, -1.0F, -1.0F, 0.2F, 1, 1, 11, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.4244F, 11.4012F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.4154F, -0.16F, 0.0701F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 1.3728F, 4.3684F);
        this.tail1.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0349F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 18, 50, -0.5F, -0.5F, -4.8F, 1, 1, 5, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2272F, 4.7684F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.2731F, 0.0F, 0.0F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.005F, 1.7515F, -0.7387F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.1396F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 54, 40, -0.5F, -0.5F, 0.5F, 1, 1, 6, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1015F, 4.7613F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0911F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 63, 40, -0.5F, 0.3516F, -0.1616F, 1, 1, 4, -0.2F, false));

        this.rightthigh = new ModelRenderer(this);
        this.rightthigh.setRotationPoint(3.2465F, 2.6461F, 6.53F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, 0.0262F, 0.0F, 0.0F);


        this.rightshin = new ModelRenderer(this);
        this.rightshin.setRotationPoint(0.2535F, 8.2784F, 1.5826F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.3665F, 0.0F, 0.0F);


        this.righthindfoot = new ModelRenderer(this);
        this.righthindfoot.setRotationPoint(0.5F, 7.9487F, -0.9225F);
        this.rightshin.addChild(righthindfoot);
        this.setRotateAngle(righthindfoot, -0.2618F, 0.0F, 0.0F);


        this.leftthigh = new ModelRenderer(this);
        this.leftthigh.setRotationPoint(-3.1179F, 2.9594F, 6.9787F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.8029F, 0.0F, 0.0F);


        this.leftshin = new ModelRenderer(this);
        this.leftshin.setRotationPoint(-0.3821F, 8.101F, 1.065F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 1.0647F, 0.0F, 0.0F);


        this.lefthindfoot = new ModelRenderer(this);
        this.lefthindfoot.setRotationPoint(-0.5F, 7.9487F, -0.9225F);
        this.leftshin.addChild(lefthindfoot);
        this.setRotateAngle(lefthindfoot, 0.2182F, 0.0F, 0.0F);


        this.fur1 = new ModelRenderer(this);
        this.fur1.setRotationPoint(0.0F, -0.3F, -10.5F);
        this.body.addChild(fur1);
        this.setRotateAngle(fur1, 0.4098F, 0.0F, 0.0F);


        this.fur2 = new ModelRenderer(this);
        this.fur2.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.fur1.addChild(fur2);
        this.setRotateAngle(fur2, 0.182F, 0.0F, 0.0F);


        this.fur3 = new ModelRenderer(this);
        this.fur3.setRotationPoint(0.0F, -0.9F, -1.9F);
        this.fur2.addChild(fur3);
        this.setRotateAngle(fur3, 0.182F, 0.0F, 0.0F);


        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, 2, 1, -2.15F, -19.1F, 13.5F, 1, 20, 1, -0.2F, false));
        this.bb_main.cubeList.add(new ModelBox(bb_main, 2, 1, -2.2F, -19.5F, -14.0F, 1, 20, 1, -0.2F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-1.75F, -13.0F, -13.5F);
        this.bb_main.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0057F, 0.1308F, 0.044F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.05F, -0.5F, -0.5F, 10, 1, 1, -0.2F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(-1.5F, -17.75F, 13.5F);
        this.bb_main.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0F, -0.2618F, 0.0F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -2, 1, -4.0F, -1.0F, 0.0F, 8, 1, 1, -0.2F, false));

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
