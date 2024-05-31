package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSinraptorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer tail;
    private final ModelRenderer tail_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6_r1;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7_r1;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer body2;
    private final ModelRenderer body3_r1;
    private final ModelRenderer neck;
    private final ModelRenderer neck_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer head;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4;
    private final ModelRenderer teeth2;
    private final ModelRenderer teeth;
    private final ModelRenderer head5;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer teeth4;
    private final ModelRenderer jaw4;
    private final ModelRenderer jaw5;
    private final ModelRenderer teeth3;
    private final ModelRenderer leftcrest;
    private final ModelRenderer rightcrest;
    private final ModelRenderer feathers4;
    private final ModelRenderer feathers3;
    private final ModelRenderer feathers2;
    private final ModelRenderer feathers;
    private final ModelRenderer bellySlope2;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightHand;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftHand;
    private final ModelRenderer leftFeathers3;
    private final ModelRenderer rightFeathers3;
    private final ModelRenderer bellySlope;
    private final ModelRenderer leftFeathers2;
    private final ModelRenderer rightFeathers2;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer leftFeathers;
    private final ModelRenderer rightFeathers;
    private final ModelRenderer bone;

    public ModelSkeletonSinraptorFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -25.0F, -21.5F, 1, 25, 1, -0.005F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -29.0F, -0.9F, 1, 29, 1, -0.005F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -18.5F, -0.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 8.1F, -4.5F, -0.5F, 1, 10, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -5.5F, -21.1F, 1, 11, 1, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -5.9F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0613F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -0.5F, 0.8F, -7.3F, 1, 1, 14, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.0776F, 6.6993F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0424F, -0.0436F, 0.0F);


        this.tail_r1 = new ModelRenderer(this);
        this.tail_r1.setRotationPoint(0.0F, -0.0206F, 0.315F);
        this.tail.addChild(tail_r1);
        this.setRotateAngle(tail_r1, 0.0785F, 0.0F, 0.0F);
        this.tail_r1.cubeList.add(new ModelBox(tail_r1, 38, 17, -0.5F, 0.9F, -0.4F, 1, 1, 10, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7916F, 9.6678F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.263F, -0.2109F, -0.0563F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, -0.0185F, 0.3512F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, 0.0349F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 19, 0, -0.5F, 1.0F, -0.5F, 1, 1, 11, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.84F, 10.589F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0003F, 0.2615F, 0.0077F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 1.2589F, 5.5001F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, 0.1222F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 0, 30, -0.5F, -0.5F, -5.5F, 1, 1, 11, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4042F, 10.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1521F, 0.2157F, -0.0328F);


        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(0.0F, -0.0716F, -0.0867F);
        this.tail4.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.0175F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 45, 53, -0.5F, 0.5F, 0.0F, 1, 1, 8, 0.0F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1101F, 7.8906F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2568F, 0.0844F, -0.0221F);


        this.tail6_r1 = new ModelRenderer(this);
        this.tail6_r1.setRotationPoint(0.0F, 0.3289F, -0.1323F);
        this.tail5.addChild(tail6_r1);
        this.setRotateAngle(tail6_r1, 0.0873F, 0.0F, 0.0F);
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 16, 41, -0.5053F, 0.0856F, 0.1689F, 1, 1, 11, 0.0F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.9724F, 10.7574F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.4314F, 0.119F, -0.0546F);


        this.tail7_r1 = new ModelRenderer(this);
        this.tail7_r1.setRotationPoint(0.0F, 0.0541F, -0.2284F);
        this.tail6.addChild(tail7_r1);
        this.setRotateAngle(tail7_r1, 0.1396F, 0.0F, 0.0F);
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 22, 17, -0.5878F, 0.354F, 0.6128F, 1, 1, 13, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4349F, -7.0744F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.322F, 0.0F, 0.0F);


        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(0.0F, -0.467F, -10.0516F);
        this.body.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.0698F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 36, 4, -0.5F, 1.0F, -0.1F, 1, 1, 10, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.4123F, -9.9784F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.237F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.1187F, -2.7666F);
        this.body2.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.0436F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 37, 32, -0.5F, 0.9F, -7.2F, 1, 1, 10, 0.0F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.8801F, -9.4749F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3573F, 0.0F, 0.0F);


        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(0.0F, 1.9699F, -1.7778F);
        this.neck.addChild(neck_r1);
        this.setRotateAngle(neck_r1, -0.0175F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 0, 65, -0.5F, -0.6F, -2.0F, 1, 1, 4, 0.002F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0564F, -3.5788F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4093F, 0.0F, 0.0F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.005F, -0.8627F, -5.9148F);
        this.neck2.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.0524F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, -1, 55, -0.505F, 1.7053F, -0.1061F, 1, 1, 7, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3101F, -5.4669F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2723F, 0.2172F, -0.0211F);
        this.neck3.cubeList.add(new ModelBox(neck3, 37, 68, -0.4881F, 1.0466F, -3.1839F, 1, 1, 3, 0.002F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.01F, -0.2394F, -2.7577F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.3423F, 0.2472F, 0.087F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6306F, -1.7165F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, -0.338F, 0.4006F, 0.0831F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -1.189F, -5.5934F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.2759F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 4.0F, -6.0F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.3821F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(-0.01F, -2.0F, -3.0F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 1.0189F, 0.0F, 0.0F);


        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, -0.5F, -1.1F);
        this.head3.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0848F, 0.0F, 0.0F);


        this.teeth = new ModelRenderer(this);
        this.teeth.setRotationPoint(0.0F, 3.6F, -3.4F);
        this.head2.addChild(teeth);
        this.setRotateAngle(teeth, 0.1061F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -2.089F, -5.5934F);
        this.head.addChild(head5);
        this.setRotateAngle(head5, 0.2972F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.911F, -0.8934F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -0.3029F, -4.5892F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2759F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 2.02F, -5.1F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.3501F, 0.0F, 0.0F);


        this.teeth4 = new ModelRenderer(this);
        this.teeth4.setRotationPoint(0.0F, -1.65F, -1.65F);
        this.jaw3.addChild(teeth4);
        this.setRotateAngle(teeth4, 0.1485F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.01F, 2.0F, -5.0F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.3609F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.jaw4.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.3609F, 0.0F, 0.0F);


        this.teeth3 = new ModelRenderer(this);
        this.teeth3.setRotationPoint(-0.01F, 0.6F, -2.5F);
        this.jaw2.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.1911F, 0.0F, 0.0F);


        this.leftcrest = new ModelRenderer(this);
        this.leftcrest.setRotationPoint(1.2848F, 0.2279F, -6.6974F);
        this.head.addChild(leftcrest);
        this.setRotateAngle(leftcrest, 0.3315F, -0.2124F, 0.5641F);


        this.rightcrest = new ModelRenderer(this);
        this.rightcrest.setRotationPoint(-1.3048F, 0.2279F, -6.6974F);
        this.head.addChild(rightcrest);
        this.setRotateAngle(rightcrest, 0.3315F, 0.2124F, -0.5641F);


        this.feathers4 = new ModelRenderer(this);
        this.feathers4.setRotationPoint(0.0F, -3.1662F, -2.7683F);
        this.neck4.addChild(feathers4);
        this.setRotateAngle(feathers4, 0.0637F, 0.0F, 0.0F);


        this.feathers3 = new ModelRenderer(this);
        this.feathers3.setRotationPoint(-0.01F, -4.0722F, -4.0773F);
        this.neck3.addChild(feathers3);
        this.setRotateAngle(feathers3, -0.0637F, 0.0F, 0.0F);


        this.feathers2 = new ModelRenderer(this);
        this.feathers2.setRotationPoint(0.0F, -4.3574F, -6.2208F);
        this.neck2.addChild(feathers2);
        this.setRotateAngle(feathers2, -0.0848F, 0.0F, 0.0F);


        this.feathers = new ModelRenderer(this);
        this.feathers.setRotationPoint(0.0F, -4.2072F, -5.2239F);
        this.neck.addChild(feathers);
        this.setRotateAngle(feathers, -0.1911F, 0.0F, 0.0F);


        this.bellySlope2 = new ModelRenderer(this);
        this.bellySlope2.setRotationPoint(0.0F, 8.1813F, -11.5666F);
        this.body2.addChild(bellySlope2);
        this.setRotateAngle(bellySlope2, -0.2972F, 0.0F, 0.0F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(5.6F, 6.7813F, -8.0666F);
        this.body2.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3133F, 0.1996F, -0.1535F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0515F, 5.0987F, 1.0559F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.1432F, 0.154F, -0.0547F);


        this.rightHand = new ModelRenderer(this);
        this.rightHand.setRotationPoint(0.5067F, 4.3447F, -0.7679F);
        this.rightarm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1061F, 0.0F, -0.4882F);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(-5.6F, 6.7813F, -8.0666F);
        this.body2.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.3936F, 0.2955F, 0.2793F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.0515F, 5.0987F, 1.0559F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.4923F, -0.154F, 0.0547F);


        this.leftHand = new ModelRenderer(this);
        this.leftHand.setRotationPoint(-0.5067F, 4.3447F, -0.7679F);
        this.leftarm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1061F, 0.0F, 0.4882F);


        this.leftFeathers3 = new ModelRenderer(this);
        this.leftFeathers3.setRotationPoint(-1.0F, -4.3187F, -11.5666F);
        this.body2.addChild(leftFeathers3);
        this.setRotateAngle(leftFeathers3, 0.1061F, -0.0848F, 0.1698F);


        this.rightFeathers3 = new ModelRenderer(this);
        this.rightFeathers3.setRotationPoint(1.0F, -4.3187F, -11.5666F);
        this.body2.addChild(rightFeathers3);
        this.setRotateAngle(rightFeathers3, 0.1061F, 0.0848F, -0.1698F);


        this.bellySlope = new ModelRenderer(this);
        this.bellySlope.setRotationPoint(0.0F, 11.533F, -10.1516F);
        this.body.addChild(bellySlope);
        this.setRotateAngle(bellySlope, -0.1698F, 0.0F, 0.0F);


        this.leftFeathers2 = new ModelRenderer(this);
        this.leftFeathers2.setRotationPoint(-2.3F, -6.067F, -10.1516F);
        this.body.addChild(leftFeathers2);
        this.setRotateAngle(leftFeathers2, 0.0213F, 0.0213F, 0.1274F);


        this.rightFeathers2 = new ModelRenderer(this);
        this.rightFeathers2.setRotationPoint(2.3F, -6.067F, -10.1516F);
        this.body.addChild(rightFeathers2);
        this.setRotateAngle(rightFeathers2, 0.0213F, -0.0213F, -0.1274F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(4.7F, 1.8745F, 0.099F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3676F, 0.0157F, 0.0407F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 12.246F, -0.3477F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6338F, -0.0518F, 0.0703F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.11F, 9.5058F, 0.8964F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.4646F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.4239F, 0.1951F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3007F, 0.0441F, -0.1233F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.51F, -3.5F);
        this.rightLeg4.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, -0.0879F, -0.0064F, 0.0036F);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(-4.7F, 1.8745F, 0.099F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1557F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 12.246F, -0.3477F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9807F, 0.109F, -0.0727F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.11F, 9.5058F, 0.8964F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7264F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.4239F, 0.1951F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.7838F, 0.0619F, 0.0616F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.51F, -3.5F);
        this.leftLeg4.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, -0.7854F, 0.0F, 0.0F);


        this.leftFeathers = new ModelRenderer(this);
        this.leftFeathers.setRotationPoint(-2.0F, -6.7F, -8.0F);
        this.hips.addChild(leftFeathers);
        this.setRotateAngle(leftFeathers, -0.0637F, 0.0213F, 0.1061F);


        this.rightFeathers = new ModelRenderer(this);
        this.rightFeathers.setRotationPoint(2.0F, -6.7F, -8.0F);
        this.hips.addChild(rightFeathers);
        this.setRotateAngle(rightFeathers, -0.0637F, -0.0213F, -0.1061F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(3.441F, 3.1457F, -2.054F);
        this.hips.addChild(bone);

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
