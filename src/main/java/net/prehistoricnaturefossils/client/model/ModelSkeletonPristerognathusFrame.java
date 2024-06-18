package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPristerognathusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Belly;
    private final ModelRenderer Belly_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjaw1;
    private final ModelRenderer Upperjaw2;
    private final ModelRenderer Nose;
    private final ModelRenderer Upperlipmiddle;
    private final ModelRenderer Upperjawteeth;
    private final ModelRenderer Rightupperlip;
    private final ModelRenderer Rightupperteeth;
    private final ModelRenderer Leftupperlip;
    private final ModelRenderer Leftupperteeth;
    private final ModelRenderer Leftsabre;
    private final ModelRenderer Rightsabre;
    private final ModelRenderer Rightsabre2;
    private final ModelRenderer Lowerjaw1;
    private final ModelRenderer Lowerjaw2;
    private final ModelRenderer Lowerjaw3;
    private final ModelRenderer Lowerjaw4;
    private final ModelRenderer Lowerjawslopefront;
    private final ModelRenderer Lowerjawteeth;
    private final ModelRenderer Leftlowerfang;
    private final ModelRenderer Rightlowerfang;
    private final ModelRenderer Lowerjawteeth2;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;

    public ModelSkeletonPristerognathusFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -17.0F, 10.0F, 1, 17, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.9F, -14.0F, -12.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2356F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.2F, -5.0F, -0.5F, 1, 9, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.9F, -14.0F, -12.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2356F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.1F, -4.0F, -0.5F, 1, 18, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.1F, -14.0F, 10.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, -1.6144F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.8F, -4.0F, -0.5F, 1, 8, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 5.6F, 11.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3183F, 0.0F, 0.0F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, 1.8603F, -0.042F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0524F, -0.0087F, -0.0005F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 16, -0.5F, -0.75F, -5.5F, 1, 1, 11, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, 0.3716F, -5.2922F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.3423F, -0.1234F, -0.0438F);


        this.Belly_r1 = new ModelRenderer(this);
        this.Belly_r1.setRotationPoint(0.0F, -0.2806F, -13.0747F);
        this.Belly.addChild(Belly_r1);
        this.setRotateAngle(Belly_r1, -0.0349F, 0.0F, 0.0F);
        this.Belly_r1.cubeList.add(new ModelBox(Belly_r1, 0, 0, -0.5F, 0.75F, 0.0F, 1, 1, 13, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.4127F, -13.0913F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0461F, -0.1307F, -0.0039F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 18, 0, -0.5F, 0.8471F, -7.9521F, 1, 1, 8, -0.1F, false));

        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.9F, 5.0971F, -6.8521F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.033F, 0.0F, 0.0F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.1F, 6.4836F, 0.2762F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.6153F, -0.2888F, 0.7543F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.9758F, 0.2292F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 2.25F, -0.5762F, -0.0695F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.9F, 5.0971F, -6.8521F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.4033F, 0.0F, 0.0F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.1F, 6.4836F, 0.2762F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.5095F, 0.0F, 0.0F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.9758F, 0.2292F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0424F, 0.0F, 0.0F);


        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.0558F, -7.6858F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.3041F, -0.2558F, 0.0564F);
        this.Neck.cubeList.add(new ModelBox(Neck, 14, 42, -0.5F, 0.831F, -7.013F, 1, 1, 7, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.481F, -6.913F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1656F, -0.3167F, 0.9038F);


        this.Upperjaw1 = new ModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, -3.0F, -4.9F);
        this.Head.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, -0.1698F, 0.0F, 0.0F);


        this.Upperjaw2 = new ModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, -0.1061F, 0.0F, 0.0F);


        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Upperjaw2.addChild(Nose);
        this.setRotateAngle(Nose, 0.1485F, 0.0F, 0.0F);


        this.Upperlipmiddle = new ModelRenderer(this);
        this.Upperlipmiddle.setRotationPoint(-0.01F, 3.7F, -2.1F);
        this.Nose.addChild(Upperlipmiddle);
        this.setRotateAngle(Upperlipmiddle, -0.1485F, 0.0F, 0.0F);


        this.Upperjawteeth = new ModelRenderer(this);
        this.Upperjawteeth.setRotationPoint(0.0F, 1.6431F, 1.3764F);
        this.Upperlipmiddle.addChild(Upperjawteeth);
        this.setRotateAngle(Upperjawteeth, 0.0342F, 0.0F, 0.0F);


        this.Rightupperlip = new ModelRenderer(this);
        this.Rightupperlip.setRotationPoint(1.49F, 3.8F, -5.95F);
        this.Upperjaw2.addChild(Rightupperlip);
        this.setRotateAngle(Rightupperlip, 0.2721F, 0.0674F, -0.2335F);


        this.Rightupperteeth = new ModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(0.2F, 1.3F, 2.9F);
        this.Rightupperlip.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, -0.1698F, 0.0F, 0.2122F);


        this.Leftupperlip = new ModelRenderer(this);
        this.Leftupperlip.setRotationPoint(-1.49F, 3.8F, -5.95F);
        this.Upperjaw2.addChild(Leftupperlip);
        this.setRotateAngle(Leftupperlip, 0.2721F, -0.0674F, 0.2335F);


        this.Leftupperteeth = new ModelRenderer(this);
        this.Leftupperteeth.setRotationPoint(-0.2F, 1.3F, 2.9F);
        this.Leftupperlip.addChild(Leftupperteeth);
        this.setRotateAngle(Leftupperteeth, -0.1698F, 0.0F, -0.2122F);


        this.Leftsabre = new ModelRenderer(this);
        this.Leftsabre.setRotationPoint(-1.4F, 2.9F, -9.0F);
        this.Upperjaw1.addChild(Leftsabre);
        this.setRotateAngle(Leftsabre, 0.1911F, 0.0F, 0.0F);


        this.Rightsabre = new ModelRenderer(this);
        this.Rightsabre.setRotationPoint(2.0F, 4.7F, -9.0F);
        this.Upperjaw1.addChild(Rightsabre);
        this.setRotateAngle(Rightsabre, 0.4525F, 0.0191F, -0.0392F);


        this.Rightsabre2 = new ModelRenderer(this);
        this.Rightsabre2.setRotationPoint(-2.0F, 4.7F, -9.0F);
        this.Upperjaw1.addChild(Rightsabre2);
        this.setRotateAngle(Rightsabre2, 0.4525F, -0.0191F, 0.0392F);


        this.Lowerjaw1 = new ModelRenderer(this);
        this.Lowerjaw1.setRotationPoint(0.0F, 1.7F, -2.9F);
        this.Head.addChild(Lowerjaw1);
        this.setRotateAngle(Lowerjaw1, 0.48F, 0.0F, 0.0F);


        this.Lowerjaw2 = new ModelRenderer(this);
        this.Lowerjaw2.setRotationPoint(0.0F, -2.1304F, -4.6085F);
        this.Lowerjaw1.addChild(Lowerjaw2);
        this.setRotateAngle(Lowerjaw2, -0.1698F, 0.0F, 0.0F);


        this.Lowerjaw3 = new ModelRenderer(this);
        this.Lowerjaw3.setRotationPoint(-0.01F, 0.1F, -1.3F);
        this.Lowerjaw2.addChild(Lowerjaw3);
        this.setRotateAngle(Lowerjaw3, -0.2182F, 0.0F, 0.0F);


        this.Lowerjaw4 = new ModelRenderer(this);
        this.Lowerjaw4.setRotationPoint(0.01F, 3.0F, -4.7F);
        this.Lowerjaw3.addChild(Lowerjaw4);
        this.setRotateAngle(Lowerjaw4, -0.2972F, 0.0F, 0.0F);


        this.Lowerjawslopefront = new ModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(-0.01F, 0.0F, -4.7F);
        this.Lowerjaw3.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, 0.0637F, 0.0F, 0.0F);


        this.Lowerjawteeth = new ModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(0.0F, -0.1F, -3.4F);
        this.Lowerjawslopefront.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, -0.2122F, 0.0F, 0.0F);


        this.Leftlowerfang = new ModelRenderer(this);
        this.Leftlowerfang.setRotationPoint(1.25F, 0.0F, -5.4F);
        this.Lowerjaw3.addChild(Leftlowerfang);
        this.setRotateAngle(Leftlowerfang, -0.0522F, 0.0F, 0.0F);


        this.Rightlowerfang = new ModelRenderer(this);
        this.Rightlowerfang.setRotationPoint(-1.23F, 0.0F, -5.4F);
        this.Lowerjaw3.addChild(Rightlowerfang);
        this.setRotateAngle(Rightlowerfang, -0.0522F, 0.0F, 0.0F);


        this.Lowerjawteeth2 = new ModelRenderer(this);
        this.Lowerjawteeth2.setRotationPoint(0.0F, 0.0F, -7.8F);
        this.Lowerjaw2.addChild(Lowerjawteeth2);
        this.setRotateAngle(Lowerjawteeth2, -0.0848F, 0.0F, 0.0F);


        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.8F, 1.7502F, 0.387F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.1309F, 0.0F, 0.0F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.2F, 7.4307F, -0.5222F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4458F, 0.0F, 0.0F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 8.8578F, 0.3027F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.2583F, 0.0F, 0.0F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.8F, 1.7502F, 0.387F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.3927F, 0.0F, 0.0F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.2F, 7.4307F, -0.5222F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.1003F, 0.0F, 0.0F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 8.8578F, 0.3027F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.1344F, 0.0F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.1295F, 5.115F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.566F, 0.3363F, -0.2067F);


        this.Tail2_r1 = new ModelRenderer(this);
        this.Tail2_r1.setRotationPoint(0.0F, 1.6031F, 2.0781F);
        this.Tail1.addChild(Tail2_r1);
        this.setRotateAngle(Tail2_r1, 0.1222F, 0.0F, 0.0F);
        this.Tail2_r1.cubeList.add(new ModelBox(Tail2_r1, 53, 40, -0.5F, -0.8F, -2.0F, 1, 1, 4, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.3733F, 3.6591F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.3255F, 0.207F, -0.0693F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 46, 54, -0.5F, 0.119F, 0.1255F, 1, 1, 4, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.1679F, 3.657F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.1977F, 0.2569F, -0.0509F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 67, 27, -0.5F, 0.2216F, -0.1745F, 1, 1, 3, -0.1F, false));

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
