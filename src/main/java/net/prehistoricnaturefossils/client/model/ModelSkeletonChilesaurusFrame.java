package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonChilesaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer bodyMiddle;
    private final ModelRenderer bodyFront;
    private final ModelRenderer neckBase;
    private final ModelRenderer neckBase_r1;
    private final ModelRenderer NeckBaseextra;
    private final ModelRenderer neckMiddlebase;
    private final ModelRenderer neckMiddlefront;
    private final ModelRenderer neckFront;
    private final ModelRenderer head;
    private final ModelRenderer headSlope;
    private final ModelRenderer upperJawback;
    private final ModelRenderer upperJawslopefront;
    private final ModelRenderer upperJawslopeback;
    private final ModelRenderer upperJawfront;
    private final ModelRenderer snoutSlopefront;
    private final ModelRenderer snoutSlopeback;
    private final ModelRenderer leftUpperteeth;
    private final ModelRenderer rightUpperteeth;
    private final ModelRenderer lowerJawbase;
    private final ModelRenderer lowerJawmiddle;
    private final ModelRenderer lowerJawfront;
    private final ModelRenderer leftLowerteeth;
    private final ModelRenderer rightLowerteeth;
    private final ModelRenderer lowerJawslope;
    private final ModelRenderer leftEye;
    private final ModelRenderer chestSlope;
    private final ModelRenderer leftUpperarm;
    private final ModelRenderer leftLowerarm;
    private final ModelRenderer leftHand;
    private final ModelRenderer rightUpperarm;
    private final ModelRenderer rightLowerarm;
    private final ModelRenderer rightHand;
    private final ModelRenderer bellySlope;
    private final ModelRenderer tailBase;
    private final ModelRenderer tailBase_r1;
    private final ModelRenderer tailMiddlebase;
    private final ModelRenderer tailMiddlebase_r1;
    private final ModelRenderer tailMiddle;
    private final ModelRenderer tailMiddle_r1;
    private final ModelRenderer tailMiddleend;
    private final ModelRenderer tailMiddleend_r1;
    private final ModelRenderer tailEnd;
    private final ModelRenderer tailEnd_r1;
    private final ModelRenderer rightThigh;
    private final ModelRenderer rightShin;
    private final ModelRenderer rightAnkle;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer leftThigh;
    private final ModelRenderer leftShin;
    private final ModelRenderer leftAnkle;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;

    public ModelSkeletonChilesaurusFrame() {
        this.textureWidth = 65;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -20.0F, -0.5F, 1, 20, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -24.0F, -18.8F, 1, 24, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.5F, -18.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -7.5F, -3.5F, -0.5F, 1, 7, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -6.5F, -3.5F, 17.8F, 1, 7, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 3.4F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.3243F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -0.5F, 0.3204F, -5.6534F, 1, 1, 11, -0.1F, false));

        this.bodyMiddle = new ModelRenderer(this);
        this.bodyMiddle.setRotationPoint(0.0F, 0.1339F, -5.5389F);
        this.hips.addChild(bodyMiddle);
        this.setRotateAngle(bodyMiddle, 0.0826F, 0.0F, 0.0F);
        this.bodyMiddle.cubeList.add(new ModelBox(bodyMiddle, 30, 31, -0.5F, 0.141F, -6.9887F, 1, 1, 7, -0.1F, false));

        this.bodyFront = new ModelRenderer(this);
        this.bodyFront.setRotationPoint(0.0F, -0.0741F, -6.8881F);
        this.bodyMiddle.addChild(bodyFront);
        this.setRotateAngle(bodyFront, 0.1934F, 0.0F, 0.0F);
        this.bodyFront.cubeList.add(new ModelBox(bodyFront, 28, 21, -0.5F, 0.2049F, -7.9735F, 1, 1, 8, -0.1F, false));

        this.neckBase = new ModelRenderer(this);
        this.neckBase.setRotationPoint(0.0F, 0.1043F, -7.6493F);
        this.bodyFront.addChild(neckBase);
        this.setRotateAngle(neckBase, -0.7878F, 0.0F, 0.0F);


        this.neckBase_r1 = new ModelRenderer(this);
        this.neckBase_r1.setRotationPoint(0.0F, 1.4611F, -3.5988F);
        this.neckBase.addChild(neckBase_r1);
        this.setRotateAngle(neckBase_r1, 0.0873F, 0.0F, 0.0F);
        this.neckBase_r1.cubeList.add(new ModelBox(neckBase_r1, 18, 46, -0.5F, -1.2F, -0.7F, 1, 1, 5, -0.1F, false));

        this.NeckBaseextra = new ModelRenderer(this);
        this.NeckBaseextra.setRotationPoint(-0.01F, 3.4611F, 0.3012F);
        this.neckBase.addChild(NeckBaseextra);
        this.setRotateAngle(NeckBaseextra, 0.2759F, 0.0F, 0.0F);


        this.neckMiddlebase = new ModelRenderer(this);
        this.neckMiddlebase.setRotationPoint(0.0F, -0.2389F, -3.4988F);
        this.neckBase.addChild(neckMiddlebase);
        this.setRotateAngle(neckMiddlebase, -0.3826F, 0.0895F, 0.1051F);
        this.neckMiddlebase.cubeList.add(new ModelBox(neckMiddlebase, 48, 15, -0.5F, 0.6F, -4.3F, 1, 1, 4, -0.1F, false));

        this.neckMiddlefront = new ModelRenderer(this);
        this.neckMiddlefront.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.neckMiddlebase.addChild(neckMiddlefront);
        this.setRotateAngle(neckMiddlefront, -0.1231F, 0.0329F, 0.2598F);
        this.neckMiddlefront.cubeList.add(new ModelBox(neckMiddlefront, 0, 52, -0.5F, 0.5729F, -3.0081F, 1, 1, 3, -0.1F, false));

        this.neckFront = new ModelRenderer(this);
        this.neckFront.setRotationPoint(-0.01F, 0.1729F, -3.0081F);
        this.neckMiddlefront.addChild(neckFront);
        this.setRotateAngle(neckFront, 0.6909F, -0.0742F, 0.2229F);
        this.neckFront.cubeList.add(new ModelBox(neckFront, 26, 47, -0.19F, 0.4068F, -2.2992F, 1, 1, 2, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0068F, -0.9992F);
        this.neckFront.addChild(head);
        this.setRotateAngle(head, 0.7191F, 0.3697F, 0.3208F);


        this.headSlope = new ModelRenderer(this);
        this.headSlope.setRotationPoint(-0.01F, -1.1921F, -2.9723F);
        this.head.addChild(headSlope);
        this.setRotateAngle(headSlope, 0.0848F, 0.0F, 0.0F);


        this.upperJawback = new ModelRenderer(this);
        this.upperJawback.setRotationPoint(0.0F, -0.7621F, -2.9323F);
        this.head.addChild(upperJawback);
        this.setRotateAngle(upperJawback, 0.2759F, 0.0F, 0.0F);


        this.upperJawslopefront = new ModelRenderer(this);
        this.upperJawslopefront.setRotationPoint(0.01F, -0.41F, -0.02F);
        this.upperJawback.addChild(upperJawslopefront);
        this.setRotateAngle(upperJawslopefront, 0.1061F, 0.0F, 0.0F);


        this.upperJawslopeback = new ModelRenderer(this);
        this.upperJawslopeback.setRotationPoint(-0.02F, 0.0F, 0.0F);
        this.upperJawslopefront.addChild(upperJawslopeback);
        this.setRotateAngle(upperJawslopeback, -0.3609F, 0.0F, 0.0F);


        this.upperJawfront = new ModelRenderer(this);
        this.upperJawfront.setRotationPoint(0.0F, 2.0F, -2.55F);
        this.upperJawback.addChild(upperJawfront);
        this.setRotateAngle(upperJawfront, -0.0424F, 0.0F, 0.0F);


        this.snoutSlopefront = new ModelRenderer(this);
        this.snoutSlopefront.setRotationPoint(-0.01F, -1.0F, -2.0F);
        this.upperJawfront.addChild(snoutSlopefront);
        this.setRotateAngle(snoutSlopefront, 0.7641F, 0.0F, 0.0F);


        this.snoutSlopeback = new ModelRenderer(this);
        this.snoutSlopeback.setRotationPoint(0.02F, 0.0F, 1.0F);
        this.snoutSlopefront.addChild(snoutSlopeback);
        this.setRotateAngle(snoutSlopeback, -0.3396F, 0.0F, 0.0F);


        this.leftUpperteeth = new ModelRenderer(this);
        this.leftUpperteeth.setRotationPoint(-0.2F, -0.4F, -1.95F);
        this.upperJawfront.addChild(leftUpperteeth);
        this.setRotateAngle(leftUpperteeth, 0.1274F, -0.1485F, 0.0F);


        this.rightUpperteeth = new ModelRenderer(this);
        this.rightUpperteeth.setRotationPoint(0.2F, -0.4F, -1.95F);
        this.upperJawfront.addChild(rightUpperteeth);
        this.setRotateAngle(rightUpperteeth, 0.1274F, 0.1485F, 0.0F);


        this.lowerJawbase = new ModelRenderer(this);
        this.lowerJawbase.setRotationPoint(0.0F, 1.3079F, 0.0677F);
        this.head.addChild(lowerJawbase);
        this.setRotateAngle(lowerJawbase, 0.3491F, 0.0F, 0.0F);


        this.lowerJawmiddle = new ModelRenderer(this);
        this.lowerJawmiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lowerJawbase.addChild(lowerJawmiddle);
        this.setRotateAngle(lowerJawmiddle, 0.2759F, 0.0F, 0.0F);


        this.lowerJawfront = new ModelRenderer(this);
        this.lowerJawfront.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.lowerJawmiddle.addChild(lowerJawfront);
        this.setRotateAngle(lowerJawfront, -0.0424F, 0.0F, 0.0F);


        this.leftLowerteeth = new ModelRenderer(this);
        this.leftLowerteeth.setRotationPoint(-0.17F, -0.8F, -1.95F);
        this.lowerJawfront.addChild(leftLowerteeth);
        this.setRotateAngle(leftLowerteeth, -0.1911F, -0.1485F, 0.0F);


        this.rightLowerteeth = new ModelRenderer(this);
        this.rightLowerteeth.setRotationPoint(0.17F, -0.8F, -1.95F);
        this.lowerJawfront.addChild(rightLowerteeth);
        this.setRotateAngle(rightLowerteeth, -0.1911F, 0.1485F, 0.0F);


        this.lowerJawslope = new ModelRenderer(this);
        this.lowerJawslope.setRotationPoint(-0.01F, 0.0F, -0.7F);
        this.lowerJawmiddle.addChild(lowerJawslope);
        this.setRotateAngle(lowerJawslope, -0.2103F, 0.0F, 0.0F);


        this.leftEye = new ModelRenderer(this);
        this.leftEye.setRotationPoint(1.0F, -0.1421F, -2.3523F);
        this.head.addChild(leftEye);


        this.chestSlope = new ModelRenderer(this);
        this.chestSlope.setRotationPoint(0.01F, 4.7043F, -7.9493F);
        this.bodyFront.addChild(chestSlope);
        this.setRotateAngle(chestSlope, -0.4033F, 0.0F, 0.0F);


        this.leftUpperarm = new ModelRenderer(this);
        this.leftUpperarm.setRotationPoint(3.5F, 4.2043F, -5.9493F);
        this.bodyFront.addChild(leftUpperarm);
        this.setRotateAngle(leftUpperarm, -1.0894F, 0.1836F, -0.3254F);


        this.leftLowerarm = new ModelRenderer(this);
        this.leftLowerarm.setRotationPoint(-0.2291F, 4.5301F, -0.41F);
        this.leftUpperarm.addChild(leftLowerarm);
        this.setRotateAngle(leftLowerarm, -1.1675F, 0.0424F, 0.0637F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(0.2971F, 2.9361F, -0.0419F);
        this.leftLowerarm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.267F, -0.0706F, 0.592F);


        this.rightUpperarm = new ModelRenderer(this);
        this.rightUpperarm.setRotationPoint(-3.5F, 4.2043F, -5.9493F);
        this.bodyFront.addChild(rightUpperarm);
        this.setRotateAngle(rightUpperarm, -0.3768F, 0.0666F, 0.081F);


        this.rightLowerarm = new ModelRenderer(this);
        this.rightLowerarm.setRotationPoint(0.2291F, 4.5301F, -0.41F);
        this.rightUpperarm.addChild(rightLowerarm);
        this.setRotateAngle(rightLowerarm, -1.1621F, -0.1627F, -0.1156F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(-0.2971F, 2.9361F, -0.0419F);
        this.rightLowerarm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2559F, 0.1045F, -0.7189F);


        this.bellySlope = new ModelRenderer(this);
        this.bellySlope.setRotationPoint(-0.01F, 7.5265F, -7.569F);
        this.bodyMiddle.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.2546F, 0.0F, 0.0F);


        this.tailBase = new ModelRenderer(this);
        this.tailBase.setRotationPoint(0.0F, 0.2961F, 5.2741F);
        this.hips.addChild(tailBase);
        this.setRotateAngle(tailBase, -0.0012F, -0.0436F, 0.0F);


        this.tailBase_r1 = new ModelRenderer(this);
        this.tailBase_r1.setRotationPoint(0.0F, -0.0458F, 0.0208F);
        this.tailBase.addChild(tailBase_r1);
        this.setRotateAngle(tailBase_r1, -0.1309F, 0.0F, 0.0F);
        this.tailBase_r1.cubeList.add(new ModelBox(tailBase_r1, 26, 0, -0.5069F, 0.0959F, -0.2092F, 1, 1, 7, -0.1F, false));

        this.tailMiddlebase = new ModelRenderer(this);
        this.tailMiddlebase.setRotationPoint(0.0F, 0.7976F, 6.9764F);
        this.tailBase.addChild(tailMiddlebase);
        this.setRotateAngle(tailMiddlebase, -0.0412F, -0.0436F, 0.0018F);


        this.tailMiddlebase_r1 = new ModelRenderer(this);
        this.tailMiddlebase_r1.setRotationPoint(0.0F, 0.1676F, -0.0735F);
        this.tailMiddlebase.addChild(tailMiddlebase_r1);
        this.setRotateAngle(tailMiddlebase_r1, -0.0524F, 0.0F, 0.0F);
        this.tailMiddlebase_r1.cubeList.add(new ModelBox(tailMiddlebase_r1, 14, 13, -0.5148F, -0.0145F, -0.3625F, 1, 1, 9, -0.1F, false));

        this.tailMiddle = new ModelRenderer(this);
        this.tailMiddle.setRotationPoint(0.0F, 0.6046F, 8.7822F);
        this.tailMiddlebase.addChild(tailMiddle);
        this.setRotateAngle(tailMiddle, 0.0025F, -0.0873F, -0.0002F);


        this.tailMiddle_r1 = new ModelRenderer(this);
        this.tailMiddle_r1.setRotationPoint(0.0F, 0.0988F, 0.0255F);
        this.tailMiddle.addChild(tailMiddle_r1);
        this.setRotateAngle(tailMiddle_r1, 0.0436F, 0.0F, 0.0F);
        this.tailMiddle_r1.cubeList.add(new ModelBox(tailMiddle_r1, 0, 27, -0.5302F, -0.0748F, -0.473F, 1, 1, 8, -0.1F, false));

        this.tailMiddleend = new ModelRenderer(this);
        this.tailMiddleend.setRotationPoint(0.0F, -0.451F, 7.9823F);
        this.tailMiddle.addChild(tailMiddleend);
        this.setRotateAngle(tailMiddleend, -0.0201F, -0.0436F, 0.0009F);


        this.tailMiddleend_r1 = new ModelRenderer(this);
        this.tailMiddleend_r1.setRotationPoint(0.0F, 0.4559F, -0.1303F);
        this.tailMiddleend.addChild(tailMiddleend_r1);
        this.setRotateAngle(tailMiddleend_r1, 0.1309F, 0.0F, 0.0F);
        this.tailMiddleend_r1.cubeList.add(new ModelBox(tailMiddleend_r1, 16, 24, -0.5382F, -0.3087F, -0.5122F, 1, 1, 9, -0.1F, false));

        this.tailEnd = new ModelRenderer(this);
        this.tailEnd.setRotationPoint(0.0F, -1.2216F, 8.7077F);
        this.tailMiddleend.addChild(tailEnd);
        this.setRotateAngle(tailEnd, 0.1975F, -0.1712F, -0.0341F);


        this.tailEnd_r1 = new ModelRenderer(this);
        this.tailEnd_r1.setRotationPoint(0.0F, 0.1781F, 0.122F);
        this.tailEnd.addChild(tailEnd_r1);
        this.setRotateAngle(tailEnd_r1, 0.1309F, 0.0F, 0.0F);
        this.tailEnd_r1.cubeList.add(new ModelBox(tailEnd_r1, -1, 12, -0.5533F, -0.1087F, -1.2783F, 1, 1, 12, -0.1F, false));

        this.rightThigh = new ModelRenderer(this);
        this.rightThigh.setRotationPoint(3.1F, 1.5342F, 0.639F);
        this.hips.addChild(rightThigh);
        this.setRotateAngle(rightThigh, 0.0696F, 0.0F, 0.0F);


        this.rightShin = new ModelRenderer(this);
        this.rightShin.setRotationPoint(0.0F, 7.8288F, -0.3811F);
        this.rightThigh.addChild(rightShin);
        this.setRotateAngle(rightShin, 0.5943F, 0.0F, 0.0F);


        this.rightAnkle = new ModelRenderer(this);
        this.rightAnkle.setRotationPoint(-0.01F, 6.9622F, 1.0637F);
        this.rightShin.addChild(rightAnkle);
        this.setRotateAngle(rightAnkle, -0.4882F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.5613F, -0.2859F);
        this.rightAnkle.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1485F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.rightFoot.addChild(rightToes);


        this.leftThigh = new ModelRenderer(this);
        this.leftThigh.setRotationPoint(-3.1F, 1.5342F, 0.639F);
        this.hips.addChild(leftThigh);
        this.setRotateAngle(leftThigh, -0.1485F, 0.0F, 0.0F);


        this.leftShin = new ModelRenderer(this);
        this.leftShin.setRotationPoint(0.0F, 7.8288F, -0.3811F);
        this.leftThigh.addChild(leftShin);
        this.setRotateAngle(leftShin, 1.0306F, 0.0F, 0.0F);


        this.leftAnkle = new ModelRenderer(this);
        this.leftAnkle.setRotationPoint(0.01F, 6.9622F, 1.0637F);
        this.leftShin.addChild(leftAnkle);
        this.setRotateAngle(leftAnkle, -0.4882F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.5613F, -0.2859F);
        this.leftAnkle.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.6285F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.29F, -1.5F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, -0.4363F, 0.0F, 0.0F);

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
