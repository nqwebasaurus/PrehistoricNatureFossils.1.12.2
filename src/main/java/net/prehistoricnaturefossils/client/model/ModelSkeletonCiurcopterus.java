package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCiurcopterus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Ciurcopterus;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer eyeR_r1;
    private final ModelRenderer eyeR_r2;
    private final ModelRenderer cheliceraL;
    private final ModelRenderer cheliceraL_r1;
    private final ModelRenderer clawbaseL;
    private final ModelRenderer clawnotmovespineL_r1;
    private final ModelRenderer crawbaseL_r1;
    private final ModelRenderer clawL;
    private final ModelRenderer clawmovespineL_r1;
    private final ModelRenderer cheliceraL2;
    private final ModelRenderer cheliceraL_r2;
    private final ModelRenderer clawbaseL2;
    private final ModelRenderer clawnotmovespineL_r2;
    private final ModelRenderer crawbaseL_r2;
    private final ModelRenderer clawL2;
    private final ModelRenderer clawmovespineL_r2;
    private final ModelRenderer legsL;
    private final ModelRenderer legL;
    private final ModelRenderer legL_r1;
    private final ModelRenderer legL6;
    private final ModelRenderer legL_r2;
    private final ModelRenderer legL2;
    private final ModelRenderer legL7;
    private final ModelRenderer legL3;
    private final ModelRenderer legL_r3;
    private final ModelRenderer legL8;
    private final ModelRenderer legL_r4;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5_3_r1;
    private final ModelRenderer legLs;
    private final ModelRenderer legL5_ptery4_r1;
    private final ModelRenderer legL10;
    private final ModelRenderer legL5_4_r1;
    private final ModelRenderer legLs2;
    private final ModelRenderer legL5_ptery5_r1;
    private final ModelRenderer legL5;
    private final ModelRenderer legR6_r1;
    private final ModelRenderer legL9;
    private final ModelRenderer legR7_r1;
    private final ModelRenderer legsR;
    private final ModelRenderer opisthosoma;
    private final ModelRenderer TergiteA1;
    private final ModelRenderer TergiteA2;
    private final ModelRenderer TergiteA3;
    private final ModelRenderer TergiteA4;
    private final ModelRenderer TergiteA5;
    private final ModelRenderer TergiteA6;
    private final ModelRenderer Telson;

    public ModelSkeletonCiurcopterus() {
        this.textureWidth = 128;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -9.0F, -1.0F, -15.0F, 10, 1, 36, 0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(17.6F, 0.0F, -1.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6458F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -10.9788F, -1.0F, -0.2869F, 11, 1, 28, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -15.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 38, -7.0F, -1.0F, 0.0F, 17, 1, 19, 0.0F, false));

        this.Ciurcopterus = new ModelRenderer(this);
        this.Ciurcopterus.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.fossil.addChild(Ciurcopterus);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(2.2182F, -0.4143F, -4.9051F);
        this.Ciurcopterus.addChild(Body);
        this.setRotateAngle(Body, 0.0F, -0.3927F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 8, -4.3182F, -0.0857F, -0.0949F, 8, 0, 4, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 38, -1.3182F, 0.0143F, -1.8949F, 2, 0, 2, 0.001F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.3182F, 0.2143F, -1.8949F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5061F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 28, -3.0F, -0.17F, 0.0F, 3, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 21, -3.5F, -0.27F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.6818F, 0.3143F, -1.8949F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.5061F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 10, 2.5F, -0.3F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 31, 0.0F, -0.27F, 0.0F, 3, 0, 2, 0.0F, false));

        this.eyeR_r1 = new ModelRenderer(this);
        this.eyeR_r1.setRotationPoint(-6.8182F, 0.1143F, -0.7949F);
        this.Body.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.0F, -1.0647F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 25, 31, 1.5592F, -0.3F, -4.2301F, 2, 0, 2, 0.0F, true));

        this.eyeR_r2 = new ModelRenderer(this);
        this.eyeR_r2.setRotationPoint(2.3818F, 0.1143F, -0.7949F);
        this.Body.addChild(eyeR_r2);
        this.setRotateAngle(eyeR_r2, 0.0F, 1.0647F, 0.0F);
        this.eyeR_r2.cubeList.add(new ModelBox(eyeR_r2, 25, 31, -1.5592F, -0.3F, -1.2301F, 2, 0, 2, 0.0F, false));

        this.cheliceraL = new ModelRenderer(this);
        this.cheliceraL.setRotationPoint(1.1318F, -0.6857F, -0.9949F);
        this.Body.addChild(cheliceraL);
        this.setRotateAngle(cheliceraL, 0.0F, -0.7418F, 0.0F);


        this.cheliceraL_r1 = new ModelRenderer(this);
        this.cheliceraL_r1.setRotationPoint(-2.0F, 1.0F, 5.75F);
        this.cheliceraL.addChild(cheliceraL_r1);
        this.setRotateAngle(cheliceraL_r1, 0.0F, -0.0873F, 0.0F);
        this.cheliceraL_r1.cubeList.add(new ModelBox(cheliceraL_r1, 22, 4, 1.0F, 0.0F, -10.0F, 1, 0, 5, 0.0F, false));

        this.clawbaseL = new ModelRenderer(this);
        this.clawbaseL.setRotationPoint(0.4F, 0.4F, -4.25F);
        this.cheliceraL.addChild(clawbaseL);
        this.setRotateAngle(clawbaseL, 0.0F, 0.3491F, 0.0F);


        this.clawnotmovespineL_r1 = new ModelRenderer(this);
        this.clawnotmovespineL_r1.setRotationPoint(-1.0F, 0.5F, -1.7F);
        this.clawbaseL.addChild(clawnotmovespineL_r1);
        this.setRotateAngle(clawnotmovespineL_r1, 0.0F, 0.2007F, 0.0F);
        this.clawnotmovespineL_r1.cubeList.add(new ModelBox(clawnotmovespineL_r1, 0, 32, -0.0787F, 0.1F, -2.7144F, 1, 0, 3, 0.0F, false));

        this.crawbaseL_r1 = new ModelRenderer(this);
        this.crawbaseL_r1.setRotationPoint(-2.4F, 0.5F, 14.0F);
        this.clawbaseL.addChild(crawbaseL_r1);
        this.setRotateAngle(crawbaseL_r1, 0.0F, -0.0873F, 0.0F);
        this.crawbaseL_r1.cubeList.add(new ModelBox(crawbaseL_r1, 26, 0, 0.0F, 0.0F, -16.0F, 2, 0, 2, 0.0F, false));

        this.clawL = new ModelRenderer(this);
        this.clawL.setRotationPoint(0.9F, 0.0F, -1.7F);
        this.clawbaseL.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, 0.3054F, 0.0F);


        this.clawmovespineL_r1 = new ModelRenderer(this);
        this.clawmovespineL_r1.setRotationPoint(-3.3F, 0.5F, 15.7F);
        this.clawL.addChild(clawmovespineL_r1);
        this.setRotateAngle(clawmovespineL_r1, 0.0F, -0.3491F, 0.0F);
        this.clawmovespineL_r1.cubeList.add(new ModelBox(clawmovespineL_r1, 19, 31, -3.1975F, 0.1F, -18.5491F, 1, 0, 3, 0.0F, false));

        this.cheliceraL2 = new ModelRenderer(this);
        this.cheliceraL2.setRotationPoint(-2.5682F, -0.9357F, -0.2449F);
        this.Body.addChild(cheliceraL2);
        this.setRotateAngle(cheliceraL2, 0.0F, 0.7418F, 0.0F);


        this.cheliceraL_r2 = new ModelRenderer(this);
        this.cheliceraL_r2.setRotationPoint(2.0F, 1.0F, 5.75F);
        this.cheliceraL2.addChild(cheliceraL_r2);
        this.setRotateAngle(cheliceraL_r2, 0.0F, 0.0873F, 0.0F);
        this.cheliceraL_r2.cubeList.add(new ModelBox(cheliceraL_r2, 22, 4, -2.0F, 0.0F, -10.0F, 1, 0, 5, 0.0F, true));

        this.clawbaseL2 = new ModelRenderer(this);
        this.clawbaseL2.setRotationPoint(-0.4F, 0.5F, -4.25F);
        this.cheliceraL2.addChild(clawbaseL2);
        this.setRotateAngle(clawbaseL2, 0.0F, -1.8762F, 0.0F);


        this.clawnotmovespineL_r2 = new ModelRenderer(this);
        this.clawnotmovespineL_r2.setRotationPoint(1.0F, 0.5F, -1.7F);
        this.clawbaseL2.addChild(clawnotmovespineL_r2);
        this.setRotateAngle(clawnotmovespineL_r2, 0.0F, -0.2007F, 0.0F);
        this.clawnotmovespineL_r2.cubeList.add(new ModelBox(clawnotmovespineL_r2, 0, 32, -0.9213F, 0.1F, -2.7144F, 1, 0, 3, 0.0F, true));

        this.crawbaseL_r2 = new ModelRenderer(this);
        this.crawbaseL_r2.setRotationPoint(2.4F, 0.5F, 14.0F);
        this.clawbaseL2.addChild(crawbaseL_r2);
        this.setRotateAngle(crawbaseL_r2, 0.0F, 0.0873F, 0.0F);
        this.crawbaseL_r2.cubeList.add(new ModelBox(crawbaseL_r2, 26, 0, -2.0F, 0.0F, -16.0F, 2, 0, 2, 0.0F, true));

        this.clawL2 = new ModelRenderer(this);
        this.clawL2.setRotationPoint(-0.9F, 0.0F, -1.7F);
        this.clawbaseL2.addChild(clawL2);
        this.setRotateAngle(clawL2, 0.0F, 0.0436F, 0.0F);


        this.clawmovespineL_r2 = new ModelRenderer(this);
        this.clawmovespineL_r2.setRotationPoint(3.3F, 0.5F, 15.7F);
        this.clawL2.addChild(clawmovespineL_r2);
        this.setRotateAngle(clawmovespineL_r2, 0.0F, 0.3491F, 0.0F);
        this.clawmovespineL_r2.cubeList.add(new ModelBox(clawmovespineL_r2, 19, 31, 2.1975F, 0.1F, -18.5491F, 1, 0, 3, 0.0F, true));

        this.legsL = new ModelRenderer(this);
        this.legsL.setRotationPoint(36.7818F, 1.0143F, 7.9051F);
        this.Body.addChild(legsL);


        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(-36.05F, -1.5F, -8.0F);
        this.legsL.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.1719F, 0.0F);


        this.legL_r1 = new ModelRenderer(this);
        this.legL_r1.setRotationPoint(-0.6449F, 0.6F, -1.2279F);
        this.legL.addChild(legL_r1);
        this.setRotateAngle(legL_r1, 0.0F, 0.6632F, 0.0F);
        this.legL_r1.cubeList.add(new ModelBox(legL_r1, 25, 14, -0.2682F, 0.1F, 0.724F, 3, 0, 1, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-39.75F, -1.6F, -7.4F);
        this.legsL.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.1719F, 0.0F);


        this.legL_r2 = new ModelRenderer(this);
        this.legL_r2.setRotationPoint(0.6449F, 0.6F, -1.2279F);
        this.legL6.addChild(legL_r2);
        this.setRotateAngle(legL_r2, 0.0F, -0.6632F, 0.0F);
        this.legL_r2.cubeList.add(new ModelBox(legL_r2, 25, 14, -2.7318F, 0.1F, 0.724F, 3, 0, 1, 0.0F, true));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(-36.0F, -0.9F, -8.1F);
        this.legsL.addChild(legL2);
        this.setRotateAngle(legL2, 0.0173F, 0.2785F, 0.0015F);
        this.legL2.cubeList.add(new ModelBox(legL2, 17, 26, -0.0294F, 0.1F, -0.0947F, 6, 0, 1, 0.0F, false));

        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(-38.75F, -0.9F, -7.1F);
        this.legsL.addChild(legL7);
        this.setRotateAngle(legL7, 0.0169F, -0.1912F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 17, 26, -5.9706F, 0.1F, -0.0947F, 6, 0, 1, 0.0F, true));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-35.7F, -1.5F, -7.5F);
        this.legsL.addChild(legL3);
        this.setRotateAngle(legL3, 0.0126F, 0.27F, 0.0017F);


        this.legL_r3 = new ModelRenderer(this);
        this.legL_r3.setRotationPoint(1.2844F, 0.6F, 0.6227F);
        this.legL3.addChild(legL_r3);
        this.setRotateAngle(legL_r3, 0.0F, -0.1745F, 0.0F);
        this.legL_r3.cubeList.add(new ModelBox(legL_r3, 0, 26, -1.6223F, 0.0F, -0.6831F, 7, 0, 1, 0.0F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(-39.3F, -1.5F, -6.5F);
        this.legsL.addChild(legL8);
        this.setRotateAngle(legL8, 0.0122F, -0.0955F, 0.0005F);


        this.legL_r4 = new ModelRenderer(this);
        this.legL_r4.setRotationPoint(-1.2844F, 0.6F, 0.6227F);
        this.legL8.addChild(legL_r4);
        this.setRotateAngle(legL_r4, 0.0F, 0.1745F, 0.0F);
        this.legL_r4.cubeList.add(new ModelBox(legL_r4, 0, 26, -5.3777F, 0.0F, -0.6831F, 7, 0, 1, 0.0F, true));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(-36.3F, -1.5F, -5.5F);
        this.legsL.addChild(legL4);
        this.setRotateAngle(legL4, 0.0123F, 0.1827F, 0.0005F);


        this.legL5_3_r1 = new ModelRenderer(this);
        this.legL5_3_r1.setRotationPoint(27.5427F, 0.7F, -9.5619F);
        this.legL4.addChild(legL5_3_r1);
        this.setRotateAngle(legL5_3_r1, 0.0F, -0.5236F, 0.0F);
        this.legL5_3_r1.cubeList.add(new ModelBox(legL5_3_r1, 24, 21, -19.4203F, 0.0F, 20.9203F, 4, 0, 1, 0.0F, false));

        this.legLs = new ModelRenderer(this);
        this.legLs.setRotationPoint(3.1927F, 0.7F, 1.0381F);
        this.legL4.addChild(legLs);


        this.legL5_ptery4_r1 = new ModelRenderer(this);
        this.legL5_ptery4_r1.setRotationPoint(18.9571F, 0.0F, -17.7925F);
        this.legLs.addChild(legL5_ptery4_r1);
        this.setRotateAngle(legL5_ptery4_r1, 0.0F, -0.5236F, 0.0F);
        this.legL5_ptery4_r1.cubeList.add(new ModelBox(legL5_ptery4_r1, 0, 19, -3.2809F, 0.0F, 24.3937F, 1, 0, 1, 0.0F, false));
        this.legL5_ptery4_r1.cubeList.add(new ModelBox(legL5_ptery4_r1, 10, 28, -7.2809F, 0.0F, 24.3937F, 4, 0, 2, 0.01F, false));

        this.legL10 = new ModelRenderer(this);
        this.legL10.setRotationPoint(-39.7F, -1.5F, -4.5F);
        this.legsL.addChild(legL10);
        this.setRotateAngle(legL10, 0.0122F, -0.1391F, 0.0F);


        this.legL5_4_r1 = new ModelRenderer(this);
        this.legL5_4_r1.setRotationPoint(-27.5427F, 0.7F, -9.5619F);
        this.legL10.addChild(legL5_4_r1);
        this.setRotateAngle(legL5_4_r1, 0.0F, 0.5236F, 0.0F);
        this.legL5_4_r1.cubeList.add(new ModelBox(legL5_4_r1, 24, 21, 15.4203F, 0.0F, 20.9203F, 4, 0, 1, 0.0F, true));

        this.legLs2 = new ModelRenderer(this);
        this.legLs2.setRotationPoint(-3.9927F, 0.7F, 1.0381F);
        this.legL10.addChild(legLs2);
        this.setRotateAngle(legLs2, 0.0F, 1.1345F, 0.0F);


        this.legL5_ptery5_r1 = new ModelRenderer(this);
        this.legL5_ptery5_r1.setRotationPoint(-18.9571F, 0.0F, -17.7925F);
        this.legLs2.addChild(legL5_ptery5_r1);
        this.setRotateAngle(legL5_ptery5_r1, 0.0F, 0.5236F, 0.0F);
        this.legL5_ptery5_r1.cubeList.add(new ModelBox(legL5_ptery5_r1, 0, 19, 2.2809F, 0.0F, 24.3937F, 1, 0, 1, 0.0F, true));
        this.legL5_ptery5_r1.cubeList.add(new ModelBox(legL5_ptery5_r1, 10, 28, 3.2809F, 0.0F, 24.3937F, 4, 0, 2, 0.01F, true));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-36.0F, -1.5F, -6.5F);
        this.legsL.addChild(legL5);
        this.setRotateAngle(legL5, 0.0124F, 0.2264F, 0.0011F);


        this.legR6_r1 = new ModelRenderer(this);
        this.legR6_r1.setRotationPoint(1.9805F, 0.6F, 0.2783F);
        this.legL5.addChild(legR6_r1);
        this.setRotateAngle(legR6_r1, 0.0F, -0.3491F, 0.0F);
        this.legR6_r1.cubeList.add(new ModelBox(legR6_r1, 15, 24, -2.1243F, 0.0F, -0.2515F, 7, 0, 1, 0.001F, false));

        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(-39.0F, -1.5F, -5.5F);
        this.legsL.addChild(legL9);
        this.setRotateAngle(legL9, 0.0122F, -0.1391F, 0.0F);


        this.legR7_r1 = new ModelRenderer(this);
        this.legR7_r1.setRotationPoint(-1.9805F, 0.6F, 0.2783F);
        this.legL9.addChild(legR7_r1);
        this.setRotateAngle(legR7_r1, 0.0F, 0.3491F, 0.0F);
        this.legR7_r1.cubeList.add(new ModelBox(legR7_r1, 15, 24, -4.8757F, 0.0F, -0.2515F, 7, 0, 1, 0.001F, true));

        this.legsR = new ModelRenderer(this);
        this.legsR.setRotationPoint(-37.4182F, 1.0143F, 7.9051F);
        this.Body.addChild(legsR);


        this.opisthosoma = new ModelRenderer(this);
        this.opisthosoma.setRotationPoint(-0.3182F, 0.0143F, 3.9051F);
        this.Body.addChild(opisthosoma);


        this.TergiteA1 = new ModelRenderer(this);
        this.TergiteA1.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.opisthosoma.addChild(TergiteA1);
        this.TergiteA1.cubeList.add(new ModelBox(TergiteA1, 0, 13, -5.0F, 0.0F, 0.2F, 10, 0, 2, 0.0F, false));

        this.TergiteA2 = new ModelRenderer(this);
        this.TergiteA2.setRotationPoint(0.0F, 0.0F, 1.8F);
        this.TergiteA1.addChild(TergiteA2);
        this.setRotateAngle(TergiteA2, 0.0F, 0.0873F, 0.0F);
        this.TergiteA2.cubeList.add(new ModelBox(TergiteA2, 0, 0, -5.5F, -0.1F, 0.0F, 11, 0, 3, 0.0F, false));

        this.TergiteA3 = new ModelRenderer(this);
        this.TergiteA3.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.TergiteA2.addChild(TergiteA3);
        this.setRotateAngle(TergiteA3, 0.0F, 0.0873F, 0.0F);
        this.TergiteA3.cubeList.add(new ModelBox(TergiteA3, 0, 4, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.TergiteA4 = new ModelRenderer(this);
        this.TergiteA4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.TergiteA3.addChild(TergiteA4);
        this.TergiteA4.cubeList.add(new ModelBox(TergiteA4, 0, 16, -4.0F, 0.0F, 0.0F, 8, 0, 2, 0.0F, false));

        this.TergiteA5 = new ModelRenderer(this);
        this.TergiteA5.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.TergiteA4.addChild(TergiteA5);
        this.setRotateAngle(TergiteA5, 0.0F, 0.1309F, 0.0F);
        this.TergiteA5.cubeList.add(new ModelBox(TergiteA5, 9, 21, -3.0F, 0.1F, 0.0F, 6, 0, 2, 0.0F, false));

        this.TergiteA6 = new ModelRenderer(this);
        this.TergiteA6.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.TergiteA5.addChild(TergiteA6);
        this.setRotateAngle(TergiteA6, 0.0F, 0.1309F, 0.0F);
        this.TergiteA6.cubeList.add(new ModelBox(TergiteA6, 17, 16, -2.5F, 0.2F, 0.0F, 5, 0, 4, 0.0F, false));

        this.Telson = new ModelRenderer(this);
        this.Telson.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.TergiteA6.addChild(Telson);
        this.setRotateAngle(Telson, 0.0F, 0.1745F, 0.0F);
        this.Telson.cubeList.add(new ModelBox(Telson, 0, 19, -0.5F, -0.1F, -0.3F, 1, 0, 6, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 9, 38, 0.0F, 0.1F, 4.0F, 2, 0, 2, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 23, 10, 0.0F, 0.1F, 1.0F, 3, 0, 3, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 9, 19, 0.0F, 0.1F, 0.0F, 2, 0, 1, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 18, 38, -2.0F, 0.1F, 4.0F, 2, 0, 2, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 0, 28, -3.0F, 0.1F, 1.0F, 3, 0, 3, 0.0F, false));
        this.Telson.cubeList.add(new ModelBox(Telson, 9, 34, -2.0F, 0.1F, 0.0F, 2, 0, 1, 0.0F, false));

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
