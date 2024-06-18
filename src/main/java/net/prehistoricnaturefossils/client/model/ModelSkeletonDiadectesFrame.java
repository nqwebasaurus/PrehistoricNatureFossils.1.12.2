package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDiadectesFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer Belly;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Upperfrontteeth;
    private final ModelRenderer Rightupperteeth;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Rightlowerteeth;
    private final ModelRenderer Lowerfrontteeth;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Tailbase;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer Tailmiddlebase;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer Tailmiddleend;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer Tailend;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;

    public ModelSkeletonDiadectesFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -5.9F, 11.0F, 1, 6, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -3.0F, -4.0F, 11.02F, 6, 1, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 4.75F, -7.9F, -11.0F, 1, 8, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(5.25F, -2.5F, -11.0F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.5236F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -3, 1, -5.0F, -1.0F, 0.0F, 10, 1, 1, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 16.6F, -1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0576F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-1.0F, 0.4401F, 7.1217F);
        this.Hips.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.0698F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 14, 3, -0.5F, -0.5F, -0.1F, 1, 1, 9, -0.1F, false));

        this.Belly = new ModelRenderer(this);
        this.Belly.setRotationPoint(-1.0F, -0.5599F, 7.0217F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0205F, -0.1735F, -0.0187F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.6115F, -9.6497F);
        this.Belly.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0349F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3885F, -9.8997F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0581F, -0.3048F, -0.0201F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, -1, 11, -0.5F, 0.502F, -10.4363F, 1, 1, 11, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.002F, -9.6363F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.0664F, -0.1076F, -0.0863F);
        this.Neck.cubeList.add(new ModelBox(Neck, 33, 48, -0.5F, 0.4922F, -3.0341F, 1, 1, 3, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, -0.2078F, -2.8341F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.5306F, -0.2054F, 0.0641F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.5F, -3.0F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.1485F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 3.02F, -2.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.1061F, 0.0F, 0.0F);


        this.Upperfrontteeth = new ModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, -0.3F, -2.25F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.5095F, 0.0F, 0.0F);


        this.Rightupperteeth = new ModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(0.94F, -0.5F, -0.4F);
        this.Upperjawfront.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, -0.0213F, 0.1485F, 0.0F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 1.5F, -0.2F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.5149F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, -0.4645F, -2.3818F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.0637F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1274F, 0.0F, 0.0F);


        this.Rightlowerteeth = new ModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.95F, -1.5F, -0.6F);
        this.Lowerjawfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, 0.0F, 0.0637F, 0.0F);


        this.Lowerfrontteeth = new ModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, -2.0F, -2.1F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.9128F, 0.0F, 0.0F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.3F, 5.062F, -7.4363F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.1173F, -0.0209F, 0.0895F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(4.408F, 0.992F, -0.5058F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.5623F, 0.103F, -0.0489F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.1632F, 5.9005F, 0.0901F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.4034F, 0.0043F, -0.1835F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.3F, 5.062F, -7.4363F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.2429F, -0.5965F, 0.1682F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-4.408F, 0.992F, -0.5058F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -1.1417F, -0.1481F, -0.0362F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.1632F, 5.9005F, 0.0901F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.2973F, 0.1497F, 0.0903F);


        this.Tailbase = new ModelRenderer(this);
        this.Tailbase.setRotationPoint(-1.0F, 0.1401F, 15.8217F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.4038F, 0.3276F, -0.1225F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(0.0F, 0.9619F, -0.478F);
        this.Tailbase.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, 0.0F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, -1, 32, -0.5F, -0.5F, 0.1F, 1, 1, 6, -0.1F, false));

        this.Tailmiddlebase = new ModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.1381F, 5.022F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.1915F, 0.4354F, 0.0297F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.1012F, 0.0382F);
        this.Tailmiddlebase.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0436F, 0.1745F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 30, 28, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.Tailmiddleend = new ModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0988F, 5.8382F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.2319F, 0.5982F, 0.1322F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(1.0F, 0.9587F, 0.0471F);
        this.Tailmiddleend.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.0262F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 1, 25, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.1F, false));

        this.Tailend = new ModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.1087F, 6.0471F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.172F, 0.6502F, 0.0811F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(1.0F, 0.6034F, -0.6364F);
        this.Tailend.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0436F, -0.0436F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 26, 0, -0.5F, -0.5F, 0.5F, 1, 1, 7, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.3F, 4.1201F, 13.0217F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.7437F, -0.241F, -0.0807F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(5.6914F, 0.7348F, 0.7464F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.8401F, -1.1357F, 0.0474F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.7076F, 4.8941F, -0.4367F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.9558F, -0.6336F, 1.8689F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.3F, 4.1201F, 13.0217F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.8807F, -0.1319F, -0.0952F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-5.6914F, 0.7348F, 0.7464F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.5213F, 0.579F, -0.291F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.7076F, 4.8941F, -0.4367F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, -1.4648F, 0.2184F, -2.0197F);

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
