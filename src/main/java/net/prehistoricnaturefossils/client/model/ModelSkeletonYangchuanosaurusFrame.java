package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYangchuanosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodymiddle_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfrontunderslope;
    private final ModelRenderer Neck1;
    private final ModelRenderer Neckbase_r1;
    private final ModelRenderer Neckbaseflesh;
    private final ModelRenderer Neckbaseflesh_r1;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neck3;
    private final ModelRenderer Neckmiddlefront_r1;
    private final ModelRenderer Neck4;
    private final ModelRenderer Neckfront_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawbase;
    private final ModelRenderer Upperjawmiddle;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Noseslope;
    private final ModelRenderer Foreheadslope;
    private final ModelRenderer Upperteethfront;
    private final ModelRenderer Upperteethmiddle;
    private final ModelRenderer Rightlacrimalbase;
    private final ModelRenderer Rightlacrimalcrest;
    private final ModelRenderer Rightfrontcrestbase;
    private final ModelRenderer Rightfrontcrest;
    private final ModelRenderer Leftlacrimalbase;
    private final ModelRenderer Leftlacrimalcrest;
    private final ModelRenderer Leftfrontcrestbase;
    private final ModelRenderer Leftfrontcrest;
    private final ModelRenderer Upperteethback;
    private final ModelRenderer Lowerjaw;
    private final ModelRenderer Lowerjawmiddleback;
    private final ModelRenderer Lowerjawmiddlefront;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Lowerjawfrontslope;
    private final ModelRenderer Lowerteethfront;
    private final ModelRenderer Lowerteethmiddle;
    private final ModelRenderer Lowerteethback;
    private final ModelRenderer Lowerjawmidbaseslope;
    private final ModelRenderer bone;
    private final ModelRenderer Leftarm1;
    private final ModelRenderer Leftarm2;
    private final ModelRenderer Leftarm3;
    private final ModelRenderer Rightarm1;
    private final ModelRenderer Rightarm2;
    private final ModelRenderer Rightarm3;
    private final ModelRenderer Lbodyfrontfeathers;
    private final ModelRenderer Rbodyfrontfeathers;
    private final ModelRenderer Rbodymidfeathers;
    private final ModelRenderer Lbodymidfeathers;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Tail4_r1;
    private final ModelRenderer Tail4;
    private final ModelRenderer Tail5;
    private final ModelRenderer Tail6;
    private final ModelRenderer Tail7;
    private final ModelRenderer Leftleg1;
    private final ModelRenderer Leftleg2;
    private final ModelRenderer Leftleg3;
    private final ModelRenderer Leftleg4;
    private final ModelRenderer Lelftleg5;
    private final ModelRenderer Rightleg1;
    private final ModelRenderer Rightleg2;
    private final ModelRenderer Rightleg3;
    private final ModelRenderer Rightleg4;
    private final ModelRenderer Lelftleg2;
    private final ModelRenderer Lhipfeathers;

    public ModelSkeletonYangchuanosaurusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(7.6714F, -23.5F, -25.9326F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2839F, -0.0665F, 1.4479F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -6.0F, -6.3969F, -0.6412F, 1, 13, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(7.6714F, -23.5F, -25.9326F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.4974F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.7969F, -12.5F, -0.3588F, 1, 36, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.65F, -40.5F, 2.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -7.975F, -4.5F, -1.0F, 1, 10, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.7F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 1.05F, -34.0F, 1.0F, 1, 34, 1, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -12.0F, 3.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.148F, -0.0129F, -0.0863F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 0.355F, 0.7601F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0436F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 0, -0.9397F, 0.4065F, -8.5734F, 2, 3, 18, -0.2F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.155F, -7.9399F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.13F, -0.2132F, -0.0467F);


        this.Bodymiddle_r1 = new ModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, -0.851F, -6.7401F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.0873F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 23, 0, -0.9316F, 1.2094F, -6.3914F, 2, 3, 14, -0.2F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -1.151F, -13.2401F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1055F, -0.1285F, -0.025F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, -0.3335F, -1.3934F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0698F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 31, 42, -0.9189F, 1.1222F, -11.2496F, 2, 3, 13, -0.2F, false));

        this.Bodyfrontunderslope = new ModelRenderer(this);
        this.Bodyfrontunderslope.setRotationPoint(0.0F, 8.4838F, -13.6262F);
        this.Bodyfront.addChild(Bodyfrontunderslope);
        this.setRotateAngle(Bodyfrontunderslope, -0.6369F, 0.0F, 0.0F);


        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -1.3162F, -12.0262F);
        this.Bodyfront.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.6577F, -0.16F, 0.4449F);


        this.Neckbase_r1 = new ModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, 0.3277F, -3.2042F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.0524F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 89, 76, -1.2177F, 1.132F, -6.3387F, 2, 3, 6, -0.2F, false));

        this.Neckbaseflesh = new ModelRenderer(this);
        this.Neckbaseflesh.setRotationPoint(-0.01F, 8.3836F, -1.694F);
        this.Neck1.addChild(Neckbaseflesh);
        this.setRotateAngle(Neckbaseflesh, 0.2759F, 0.0F, 0.0F);


        this.Neckbaseflesh_r1 = new ModelRenderer(this);
        this.Neckbaseflesh_r1.setRotationPoint(0.01F, -5.0018F, -0.9576F);
        this.Neckbaseflesh.addChild(Neckbaseflesh_r1);
        this.setRotateAngle(Neckbaseflesh_r1, -0.2201F, 0.1863F, -0.2743F);
        this.Neckbaseflesh_r1.cubeList.add(new ModelBox(Neckbaseflesh_r1, 99, 79, -0.8933F, -2.5365F, -0.2438F, 2, 3, 6, -0.2F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(-0.01F, 0.9836F, -9.394F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.4118F, -0.4486F, -0.1852F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 58, 98, -1.2515F, 0.2761F, -4.5732F, 2, 2, 6, -0.2F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.02F, -0.4317F, -3.7372F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.2016F, -0.4573F, -0.1513F);


        this.Neckmiddlefront_r1 = new ModelRenderer(this);
        this.Neckmiddlefront_r1.setRotationPoint(0.0F, -1.698F, -3.9476F);
        this.Neck3.addChild(Neckmiddlefront_r1);
        this.setRotateAngle(Neckmiddlefront_r1, -0.1309F, 0.0F, 0.0F);
        this.Neckmiddlefront_r1.cubeList.add(new ModelBox(Neckmiddlefront_r1, 8, 94, -1.6779F, 1.7662F, 0.2751F, 2, 2, 4, -0.2F, false));

        this.Neck4 = new ModelRenderer(this);
        this.Neck4.setRotationPoint(-0.01F, -0.4162F, -2.8046F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, 0.3557F, -0.0546F, -0.2109F);


        this.Neckfront_r1 = new ModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -0.8877F, -2.9496F);
        this.Neck4.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, -0.2618F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 71, 94, -2.1465F, 0.5806F, -2.6887F, 2, 2, 5, -0.2F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.7765F, -3.8442F);
        this.Neck4.addChild(Head);
        this.setRotateAngle(Head, -0.4135F, -0.239F, -0.1864F);


        this.Upperjawbase = new ModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, -3.7304F, -6.2478F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.3396F, 0.0F, 0.0F);


        this.Upperjawmiddle = new ModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 9.0F, -8.0F);
        this.Upperjawbase.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.3609F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.0F, -4.8F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.1274F, 0.0F, 0.0F);


        this.Noseslope = new ModelRenderer(this);
        this.Noseslope.setRotationPoint(-0.01F, -6.0F, -3.0F);
        this.Upperjawfront.addChild(Noseslope);
        this.setRotateAngle(Noseslope, 0.8702F, 0.0F, 0.0F);


        this.Foreheadslope = new ModelRenderer(this);
        this.Foreheadslope.setRotationPoint(0.01F, 0.0F, 4.0F);
        this.Noseslope.addChild(Foreheadslope);
        this.setRotateAngle(Foreheadslope, -0.5095F, 0.0F, 0.0F);


        this.Upperteethfront = new ModelRenderer(this);
        this.Upperteethfront.setRotationPoint(0.0F, -0.2F, -0.4F);
        this.Upperjawfront.addChild(Upperteethfront);
        this.setRotateAngle(Upperteethfront, -0.2122F, 0.0F, 0.0F);


        this.Upperteethmiddle = new ModelRenderer(this);
        this.Upperteethmiddle.setRotationPoint(0.0F, -0.8F, -2.3F);
        this.Upperjawmiddle.addChild(Upperteethmiddle);
        this.setRotateAngle(Upperteethmiddle, 0.0424F, 0.0F, 0.0F);


        this.Rightlacrimalbase = new ModelRenderer(this);
        this.Rightlacrimalbase.setRotationPoint(1.6F, 0.3F, -11.6F);
        this.Upperjawbase.addChild(Rightlacrimalbase);
        this.setRotateAngle(Rightlacrimalbase, 0.1562F, 0.1911F, 0.1485F);


        this.Rightlacrimalcrest = new ModelRenderer(this);
        this.Rightlacrimalcrest.setRotationPoint(-1.047F, 0.0328F, 11.4514F);
        this.Rightlacrimalbase.addChild(Rightlacrimalcrest);
        this.setRotateAngle(Rightlacrimalcrest, -0.6369F, 0.1698F, 0.1911F);


        this.Rightfrontcrestbase = new ModelRenderer(this);
        this.Rightfrontcrestbase.setRotationPoint(-1.047F, 0.1328F, 8.8514F);
        this.Rightlacrimalbase.addChild(Rightfrontcrestbase);
        this.setRotateAngle(Rightfrontcrestbase, -0.5095F, 0.0F, -0.0213F);


        this.Rightfrontcrest = new ModelRenderer(this);
        this.Rightfrontcrest.setRotationPoint(0.0F, 4.7F, -8.8F);
        this.Rightfrontcrestbase.addChild(Rightfrontcrest);
        this.setRotateAngle(Rightfrontcrest, 0.7763F, -0.0424F, -0.1061F);


        this.Leftlacrimalbase = new ModelRenderer(this);
        this.Leftlacrimalbase.setRotationPoint(-1.6F, 0.3F, -11.6F);
        this.Upperjawbase.addChild(Leftlacrimalbase);
        this.setRotateAngle(Leftlacrimalbase, 0.1562F, -0.1911F, -0.1485F);


        this.Leftlacrimalcrest = new ModelRenderer(this);
        this.Leftlacrimalcrest.setRotationPoint(1.047F, 0.0328F, 11.4514F);
        this.Leftlacrimalbase.addChild(Leftlacrimalcrest);
        this.setRotateAngle(Leftlacrimalcrest, -0.6369F, -0.1698F, -0.1911F);


        this.Leftfrontcrestbase = new ModelRenderer(this);
        this.Leftfrontcrestbase.setRotationPoint(1.047F, 0.1328F, 8.8514F);
        this.Leftlacrimalbase.addChild(Leftfrontcrestbase);
        this.setRotateAngle(Leftfrontcrestbase, -0.5095F, 0.0F, 0.0213F);


        this.Leftfrontcrest = new ModelRenderer(this);
        this.Leftfrontcrest.setRotationPoint(0.0F, 4.7F, -8.8F);
        this.Leftfrontcrestbase.addChild(Leftfrontcrest);
        this.setRotateAngle(Leftfrontcrest, 0.7763F, 0.0424F, 0.1061F);


        this.Upperteethback = new ModelRenderer(this);
        this.Upperteethback.setRotationPoint(0.0F, 8.5F, -4.6F);
        this.Upperjawbase.addChild(Upperteethback);
        this.setRotateAngle(Upperteethback, 0.1698F, 0.0F, 0.0F);


        this.Lowerjaw = new ModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 5.2696F, 1.7522F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.7418F, 0.0F, 0.0F);


        this.Lowerjawmiddleback = new ModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.49F, -7.86F);
        this.Lowerjaw.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.3396F, 0.0F, 0.0F);


        this.Lowerjawmiddlefront = new ModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 3.2F, -5.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, -0.3609F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.01F, -6.1F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1274F, 0.0F, 0.0F);


        this.Lowerjawfrontslope = new ModelRenderer(this);
        this.Lowerjawfrontslope.setRotationPoint(0.01F, 0.2F, -3.0F);
        this.Lowerjawfront.addChild(Lowerjawfrontslope);
        this.setRotateAngle(Lowerjawfrontslope, -0.1698F, 0.0F, 0.0F);


        this.Lowerteethfront = new ModelRenderer(this);
        this.Lowerteethfront.setRotationPoint(0.0F, -1.8F, -0.6F);
        this.Lowerjawfront.addChild(Lowerteethfront);
        this.setRotateAngle(Lowerteethfront, -0.1061F, 0.0F, 0.0F);


        this.Lowerteethmiddle = new ModelRenderer(this);
        this.Lowerteethmiddle.setRotationPoint(0.0F, -2.8F, -3.3F);
        this.Lowerjawmiddlefront.addChild(Lowerteethmiddle);
        this.setRotateAngle(Lowerteethmiddle, 0.0424F, 0.0F, 0.0F);


        this.Lowerteethback = new ModelRenderer(this);
        this.Lowerteethback.setRotationPoint(0.0F, 0.4F, -3.7F);
        this.Lowerjawmiddleback.addChild(Lowerteethback);
        this.setRotateAngle(Lowerteethback, -0.3396F, 0.0F, 0.0F);


        this.Lowerjawmidbaseslope = new ModelRenderer(this);
        this.Lowerjawmidbaseslope.setRotationPoint(-0.01F, 5.0F, -5.6F);
        this.Lowerjaw.addChild(Lowerjawmidbaseslope);
        this.setRotateAngle(Lowerjawmidbaseslope, 0.0283F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.01F, -1.3555F, -0.9826F);
        this.Neck2.addChild(bone);


        this.Leftarm1 = new ModelRenderer(this);
        this.Leftarm1.setRotationPoint(7.5F, 9.4838F, -9.6262F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.8909F, 0.0709F, -0.3773F);


        this.Leftarm2 = new ModelRenderer(this);
        this.Leftarm2.setRotationPoint(-1.0F, 7.0F, 1.0F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.4104F, 0.0F, 0.1698F);


        this.Leftarm3 = new ModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.1F, 5.7F, -1.59F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.1698F, 0.0F, 0.3821F);


        this.Rightarm1 = new ModelRenderer(this);
        this.Rightarm1.setRotationPoint(-7.5F, 9.4838F, -9.6262F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.8909F, -0.0709F, 0.3773F);


        this.Rightarm2 = new ModelRenderer(this);
        this.Rightarm2.setRotationPoint(1.0F, 7.0F, 1.0F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.0613F, 0.0F, -0.1698F);


        this.Rightarm3 = new ModelRenderer(this);
        this.Rightarm3.setRotationPoint(-0.1F, 5.7F, -1.59F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.1698F, 0.0F, -0.3821F);


        this.Lbodyfrontfeathers = new ModelRenderer(this);
        this.Lbodyfrontfeathers.setRotationPoint(-2.0F, -6.5162F, -12.1262F);
        this.Bodyfront.addChild(Lbodyfrontfeathers);
        this.setRotateAngle(Lbodyfrontfeathers, 0.1061F, -0.0637F, -0.1911F);


        this.Rbodyfrontfeathers = new ModelRenderer(this);
        this.Rbodyfrontfeathers.setRotationPoint(2.0F, -6.5162F, -12.1262F);
        this.Bodyfront.addChild(Rbodyfrontfeathers);
        this.setRotateAngle(Rbodyfrontfeathers, 0.0848F, 0.0637F, 0.1911F);


        this.Rbodymidfeathers = new ModelRenderer(this);
        this.Rbodymidfeathers.setRotationPoint(3.1F, -8.951F, -14.2401F);
        this.Bodymiddle.addChild(Rbodymidfeathers);
        this.setRotateAngle(Rbodymidfeathers, 0.0213F, -0.0213F, 0.1274F);


        this.Lbodymidfeathers = new ModelRenderer(this);
        this.Lbodymidfeathers.setRotationPoint(-3.1F, -8.951F, -14.2401F);
        this.Bodymiddle.addChild(Lbodymidfeathers);
        this.setRotateAngle(Lbodymidfeathers, 0.0213F, 0.0213F, -0.1274F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.945F, 10.0601F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0027F, 0.3515F, -0.1239F);


        this.Tail2_r1 = new ModelRenderer(this);
        this.Tail2_r1.setRotationPoint(0.0F, 0.494F, 0.4189F);
        this.Tail1.addChild(Tail2_r1);
        this.setRotateAngle(Tail2_r1, 0.0436F, 0.0F, 0.0F);
        this.Tail2_r1.cubeList.add(new ModelBox(Tail2_r1, 1, 40, -1.0281F, 0.8217F, -0.9196F, 2, 3, 11, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.906F, 12.6189F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0798F, 0.134F, -0.0327F);


        this.Tail3_r1 = new ModelRenderer(this);
        this.Tail3_r1.setRotationPoint(0.0F, 1.4188F, 16.9987F);
        this.Tail2.addChild(Tail3_r1);
        this.setRotateAngle(Tail3_r1, 0.0873F, 0.0F, 0.0F);
        this.Tail3_r1.cubeList.add(new ModelBox(Tail3_r1, 22, 18, -0.8012F, -1.4058F, -19.8511F, 2, 2, 20, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.3812F, 16.7987F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0424F, 0.1813F, -0.1214F);


        this.Tail4_r1 = new ModelRenderer(this);
        this.Tail4_r1.setRotationPoint(0.0F, 2.0943F, -0.2361F);
        this.Tail3.addChild(Tail4_r1);
        this.setRotateAngle(Tail4_r1, 0.0873F, 0.0F, 0.0F);
        this.Tail4_r1.cubeList.add(new ModelBox(Tail4_r1, 53, 32, -0.8316F, -1.6257F, 0.0627F, 2, 2, 12, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.5057F, 11.6639F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0215F, -0.1309F, 0.0028F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 18, 57, -0.2217F, 0.0505F, -0.9102F, 1, 1, 14, -0.2F, false));

        this.Tail5 = new ModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.288F, 12.9317F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0869F, -0.2174F, 0.0188F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 37, 65, -0.2274F, -0.1967F, -0.374F, 1, 1, 12, -0.2F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0456F, 11.3826F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.2438F, -0.2544F, 0.0625F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 70, 21, -0.2898F, -0.2212F, -0.1354F, 1, 1, 11, -0.2F, false));

        this.Tail7 = new ModelRenderer(this);
        this.Tail7.setRotationPoint(0.0F, -0.0099F, 11.0332F);
        this.Tail6.addChild(Tail7);
        this.setRotateAngle(Tail7, -0.2645F, -0.2531F, 0.0677F);
        this.Tail7.cubeList.add(new ModelBox(Tail7, 32, 79, -0.4043F, -0.1037F, -0.4782F, 1, 1, 10, -0.2F, false));

        this.Leftleg1 = new ModelRenderer(this);
        this.Leftleg1.setRotationPoint(8.5F, 0.255F, 0.7601F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.896F, -0.1847F, -0.2398F);


        this.Leftleg2 = new ModelRenderer(this);
        this.Leftleg2.setRotationPoint(-1.75F, 15.8435F, -2.85F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 1.4493F, 0.0F, 0.0F);


        this.Leftleg3 = new ModelRenderer(this);
        this.Leftleg3.setRotationPoint(-1.1F, 12.6666F, 1.5289F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -1.427F, 0.0F, 0.0F);


        this.Leftleg4 = new ModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.0F, 7.0137F, -0.6147F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 1.6085F, 0.0F, 0.0F);


        this.Lelftleg5 = new ModelRenderer(this);
        this.Lelftleg5.setRotationPoint(0.0F, 0.01F, -2.25F);
        this.Leftleg4.addChild(Lelftleg5);
        this.setRotateAngle(Lelftleg5, 0.4363F, 0.0F, 0.0F);


        this.Rightleg1 = new ModelRenderer(this);
        this.Rightleg1.setRotationPoint(-8.5F, 0.255F, 0.7601F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, 0.263F, 0.0F, 0.0F);


        this.Rightleg2 = new ModelRenderer(this);
        this.Rightleg2.setRotationPoint(1.75F, 15.8435F, -2.85F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.4398F, 0.0749F, -0.1578F);


        this.Rightleg3 = new ModelRenderer(this);
        this.Rightleg3.setRotationPoint(1.1F, 12.6666F, 1.5289F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.5107F, 0.0F, 0.0F);


        this.Rightleg4 = new ModelRenderer(this);
        this.Rightleg4.setRotationPoint(0.0F, 7.0137F, -0.6147F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.2073F, -0.0456F, 0.2134F);


        this.Lelftleg2 = new ModelRenderer(this);
        this.Lelftleg2.setRotationPoint(0.0F, 0.01F, -2.25F);
        this.Rightleg4.addChild(Lelftleg2);
        this.setRotateAngle(Lelftleg2, -0.1736F, 0.0094F, 0.0142F);


        this.Lhipfeathers = new ModelRenderer(this);
        this.Lhipfeathers.setRotationPoint(-3.0F, -8.945F, -9.7399F);
        this.Hips.addChild(Lhipfeathers);
        this.setRotateAngle(Lhipfeathers, -0.0637F, 0.0213F, -0.1061F);

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
