package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEustreptospondylusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer body;
    private final ModelRenderer chest;
    private final ModelRenderer Box_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer Box_r2;
    private final ModelRenderer neck2;
    private final ModelRenderer Box_r3;
    private final ModelRenderer neck3;
    private final ModelRenderer Box_r4;
    private final ModelRenderer head;
    private final ModelRenderer head2;
    private final ModelRenderer headsep;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer Tteeth2;
    private final ModelRenderer Tteeth1;
    private final ModelRenderer head6;
    private final ModelRenderer Rcrest;
    private final ModelRenderer Rcrest2;
    private final ModelRenderer Rcrest3;
    private final ModelRenderer Rcrest4;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw4;
    private final ModelRenderer Bteeth2;
    private final ModelRenderer Bteeth1;
    private final ModelRenderer masseter;
    private final ModelRenderer throat;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer Box_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg;

    public ModelSkeletonEustreptospondylusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -30.0F, 3.3F, 1, 30, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, -24.15F, -21.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 3.0F, -5.85F, -0.5F, 1, 30, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1F, -24.15F, -21.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.35F, -1.0F, -0.5F, 1, 9, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -24.0F, 3.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -5.0F, -0.5F, 1, 11, 1, -0.2F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -30.0F, 4.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1173F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 35, -0.5F, -0.6525F, -3.9215F, 1, 2, 11, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8525F, -4.1215F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0697F, -0.1306F, -0.0091F);
        this.body.cubeList.add(new ModelBox(body, 17, -2, -0.5F, 0.2264F, -13.432F, 1, 2, 14, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.0736F, -12.932F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0224F, -0.0871F, -0.0056F);


        this.Box_r1 = new ModelRenderer(this);
        this.Box_r1.setRotationPoint(0.0F, -0.5877F, -0.12F);
        this.chest.addChild(Box_r1);
        this.setRotateAngle(Box_r1, 0.1571F, 0.0F, 0.0F);
        this.Box_r1.cubeList.add(new ModelBox(Box_r1, 0, 49, -0.5F, 0.8977F, -8.8523F, 1, 2, 9, -0.2F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.0123F, -8.62F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2526F, -0.4798F, -0.1573F);


        this.Box_r2 = new ModelRenderer(this);
        this.Box_r2.setRotationPoint(0.0F, 1.0155F, -4.1812F);
        this.neck1.addChild(Box_r2);
        this.setRotateAngle(Box_r2, 0.0873F, 0.0F, 0.0F);
        this.Box_r2.cubeList.add(new ModelBox(Box_r2, 35, 44, -0.5F, -0.3F, -0.4F, 1, 1, 6, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4155F, -3.9812F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1514F, -0.4084F, -0.0592F);


        this.Box_r3 = new ModelRenderer(this);
        this.Box_r3.setRotationPoint(0.0F, -1.0095F, -4.9029F);
        this.neck2.addChild(Box_r3);
        this.setRotateAngle(Box_r3, -0.1396F, 0.0F, 0.0F);
        this.Box_r3.cubeList.add(new ModelBox(Box_r3, 24, 56, -0.5F, 0.7F, 0.3F, 1, 1, 5, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.4095F, -4.8029F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.436F, -0.0791F, -0.0368F);


        this.Box_r4 = new ModelRenderer(this);
        this.Box_r4.setRotationPoint(0.0F, -1.2874F, -3.2898F);
        this.neck3.addChild(Box_r4);
        this.setRotateAngle(Box_r4, -0.3142F, 0.0F, 0.0F);
        this.Box_r4.cubeList.add(new ModelBox(Box_r4, 66, 33, -0.5F, 0.3F, 0.0F, 1, 1, 4, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8874F, -3.1898F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.0442F, 0.0012F, -0.0189F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.1278F, 0.0199F);
        this.head.addChild(head2);


        this.headsep = new ModelRenderer(this);
        this.headsep.setRotationPoint(0.0F, 0.3F, -7.8F);
        this.head2.addChild(headsep);
        this.setRotateAngle(headsep, 0.0859F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -2.0F, -2.9F);
        this.headsep.addChild(head3);
        this.setRotateAngle(head3, 0.488F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.headsep.addChild(head5);
        this.setRotateAngle(head5, -0.2405F, 0.0F, 0.0F);


        this.Tteeth2 = new ModelRenderer(this);
        this.Tteeth2.setRotationPoint(0.0F, -0.3F, -2.8F);
        this.head5.addChild(Tteeth2);


        this.Tteeth1 = new ModelRenderer(this);
        this.Tteeth1.setRotationPoint(0.0F, 1.9F, -3.0F);
        this.headsep.addChild(Tteeth1);


        this.head6 = new ModelRenderer(this);
        this.head6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.headsep.addChild(head6);


        this.Rcrest = new ModelRenderer(this);
        this.Rcrest.setRotationPoint(1.0F, -1.5F, -1.9F);
        this.headsep.addChild(Rcrest);
        this.setRotateAngle(Rcrest, 0.0681F, 0.1634F, 0.0F);


        this.Rcrest2 = new ModelRenderer(this);
        this.Rcrest2.setRotationPoint(-0.0229F, -0.2045F, 3.4654F);
        this.Rcrest.addChild(Rcrest2);
        this.setRotateAngle(Rcrest2, -0.0618F, 0.411F, 0.0F);


        this.Rcrest3 = new ModelRenderer(this);
        this.Rcrest3.setRotationPoint(-1.0F, -1.5F, -1.9F);
        this.headsep.addChild(Rcrest3);
        this.setRotateAngle(Rcrest3, 0.0681F, -0.1634F, 0.0F);


        this.Rcrest4 = new ModelRenderer(this);
        this.Rcrest4.setRotationPoint(0.0229F, -0.2045F, 3.4654F);
        this.Rcrest3.addChild(Rcrest4);
        this.setRotateAngle(Rcrest4, -0.0618F, -0.411F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4278F, 1.0199F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0017F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0017F, 0.3055F, -5.3295F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0782F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -0.4F, -1.1F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1955F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, -1.0F, -5.9F);
        this.jaw2.addChild(jaw4);


        this.Bteeth2 = new ModelRenderer(this);
        this.Bteeth2.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.jaw4.addChild(Bteeth2);


        this.Bteeth1 = new ModelRenderer(this);
        this.Bteeth1.setRotationPoint(0.5F, -1.7F, -5.99F);
        this.jaw2.addChild(Bteeth1);


        this.masseter = new ModelRenderer(this);
        this.masseter.setRotationPoint(0.0017F, -2.1945F, -0.1795F);
        this.jaw.addChild(masseter);
        this.setRotateAngle(masseter, -0.3519F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 4.2126F, -1.6898F);
        this.neck3.addChild(throat);
        this.setRotateAngle(throat, -0.0782F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(4.0F, 8.5123F, -6.82F);
        this.chest.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.337F, 0.3244F, -0.1492F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.1F, 5.0F, 0.0F);
        this.leftArm3.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1174F, 0.0F, 0.0F);


        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(-0.6F, 4.2343F, -0.2555F);
        this.leftArm2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.1F, -0.0413F, 0.5861F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-4.0F, 8.5123F, -6.82F);
        this.chest.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.961F, 0.0F, 0.1564F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.1F, 5.0F, 0.0F);
        this.rightArm3.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8992F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(0.6F, 4.2343F, -0.2555F);
        this.rightArm2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.1046F, 0.028F, -0.4558F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.9525F, 6.7785F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0806F, -0.087F, 0.007F);
        this.tail1.cubeList.add(new ModelBox(tail1, 44, 45, -0.5F, 0.34F, -0.0193F, 1, 2, 10, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.24F, 9.9807F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1063F, -0.1736F, -0.0184F);


        this.Box_r5 = new ModelRenderer(this);
        this.Box_r5.setRotationPoint(0.0F, -0.1013F, 12.3547F);
        this.tail2.addChild(Box_r5);
        this.setRotateAngle(Box_r5, 0.0175F, 0.0F, 0.0F);
        this.Box_r5.cubeList.add(new ModelBox(Box_r5, 32, 14, -0.5F, -0.1F, -12.9F, 1, 2, 13, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4013F, 11.6547F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0602F, -0.3485F, -0.0206F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 18, -0.5F, 0.1976F, -0.0848F, 1, 1, 13, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1024F, 13.0152F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1755F, 0.301F, -0.0525F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.2624F, -0.5428F, 1, 1, 16, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0376F, 15.3572F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2997F, 0.5041F, -0.1481F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 18, -0.5F, 0.2313F, -0.1381F, 1, 1, 15, -0.2F, false));

        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(4.8F, 1.9475F, 0.4785F);
        this.hips.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.3524F, -0.0073F, 0.123F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0471F, 11.9298F, 0.696F);
        this.leftLeg4.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0095F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 12.9046F, 1.699F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9132F, -0.1038F, -0.0799F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(0.0F, 6.9F, -0.5F);
        this.leftLeg3.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.3906F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-4.8F, 1.9475F, 0.4785F);
        this.hips.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3837F, 0.102F, -0.1215F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.0471F, 11.9298F, 0.696F);
        this.rightLeg4.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7041F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 12.9046F, 1.699F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5644F, 0.0703F, 0.1105F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(0.0F, 6.9F, -0.5F);
        this.rightLeg3.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.2161F, 0.0F, 0.0F);

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
