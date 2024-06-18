package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonScutosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer Hips;
    private final ModelRenderer Bodymiddle;
    private final ModelRenderer Bodyfront;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Head;
    private final ModelRenderer Lowerjawback;
    private final ModelRenderer Lowerjawmiddle;
    private final ModelRenderer Lowerjawfront;
    private final ModelRenderer Rightfemaletusk;
    private final ModelRenderer Upperjawback;
    private final ModelRenderer Upperjawfront;
    private final ModelRenderer Headslope;
    private final ModelRenderer Nosebump;
    private final ModelRenderer Nosehorn;
    private final ModelRenderer Rightcheekfrill;
    private final ModelRenderer Rightfrillspikes;
    private final ModelRenderer Rightfrillspikepiece;
    private final ModelRenderer Leftcheekfrill;
    private final ModelRenderer Leftfrillspikes;
    private final ModelRenderer Leftfrillspikepiece;
    private final ModelRenderer Rightupperarm;
    private final ModelRenderer Rightlowerarm;
    private final ModelRenderer Rightfrontfoot;
    private final ModelRenderer Leftupperarm;
    private final ModelRenderer Leftlowerarm;
    private final ModelRenderer Leftfrontfoot;
    private final ModelRenderer Scutes2;
    private final ModelRenderer Scutes4;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer Rightthigh;
    private final ModelRenderer Rightshin;
    private final ModelRenderer Righthindfoot;
    private final ModelRenderer Leftthigh;
    private final ModelRenderer Leftshin;
    private final ModelRenderer Lefthindfoot;
    private final ModelRenderer Scutes6;

    public ModelSkeletonScutosaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, 6.0F, 10.8F, 2, 18, 2, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.3F, 11.0F, -10.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.9F, -6.0F, -1.0F, 2, 13, 2, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.3F, 11.0F, -10.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.75F, -5.0F, -1.0F, 2, 18, 2, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 11.0F, 11.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -4.0F, -1.0F, 2, 7, 2, -0.1F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.Hips = new ModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.1698F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 19, 0, -1.0F, -1.2217F, 6.828F, 2, 2, 9, -0.1F, false));

        this.Bodymiddle = new ModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -1.5073F, 6.959F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.1498F, 0.1295F, 0.0195F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -1.0028F, 0.2329F, -13.9781F, 2, 2, 14, -0.1F, false));

        this.Bodyfront = new ModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.0669F, -13.7992F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.237F, 0.1697F, 0.0408F);


        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 1.0831F, -8.5913F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 29, -0.9661F, -0.3347F, -0.459F, 2, 2, 9, -0.1F, false));

        this.Neck = new ModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5831F, -8.4913F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, 0.3707F, 0.4058F, -0.1556F);
        this.Neck.cubeList.add(new ModelBox(Neck, 58, 0, -1.0263F, -0.0056F, -4.5337F, 2, 2, 4, -0.1F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.0244F, -3.9603F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0614F, -0.1244F, 0.2062F);


        this.Lowerjawback = new ModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 3.4697F, -1.8138F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.6545F, 0.0F, 0.0F);


        this.Lowerjawmiddle = new ModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, -0.0848F, 0.0F, 0.0F);


        this.Lowerjawfront = new ModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.0424F, 0.0F, 0.0F);


        this.Rightfemaletusk = new ModelRenderer(this);
        this.Rightfemaletusk.setRotationPoint(2.0F, -2.0F, 0.0F);
        this.Lowerjawmiddle.addChild(Rightfemaletusk);
        this.setRotateAngle(Rightfemaletusk, 0.743F, 0.1698F, -0.1698F);


        this.Upperjawback = new ModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 3.5697F, -5.5138F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, -0.0848F, 0.0F, 0.0F);


        this.Upperjawfront = new ModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -3.0F, -3.9F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.0424F, 0.0F, 0.0F);


        this.Headslope = new ModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -1.2303F, -6.2138F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2335F, 0.0F, 0.0F);


        this.Nosebump = new ModelRenderer(this);
        this.Nosebump.setRotationPoint(0.0F, 0.6F, -2.8F);
        this.Headslope.addChild(Nosebump);
        this.setRotateAngle(Nosebump, -0.1274F, 0.0F, 0.0F);


        this.Nosehorn = new ModelRenderer(this);
        this.Nosehorn.setRotationPoint(0.0F, -0.3F, 0.6F);
        this.Nosebump.addChild(Nosehorn);
        this.setRotateAngle(Nosehorn, -0.2972F, 0.0F, 0.0F);


        this.Rightcheekfrill = new ModelRenderer(this);
        this.Rightcheekfrill.setRotationPoint(2.3F, 1.2697F, -1.8138F);
        this.Head.addChild(Rightcheekfrill);
        this.setRotateAngle(Rightcheekfrill, 0.2972F, -0.1911F, 0.6793F);


        this.Rightfrillspikes = new ModelRenderer(this);
        this.Rightfrillspikes.setRotationPoint(4.1F, -1.0F, 0.5F);
        this.Rightcheekfrill.addChild(Rightfrillspikes);
        this.setRotateAngle(Rightfrillspikes, -0.0637F, -0.3396F, 0.2122F);


        this.Rightfrillspikepiece = new ModelRenderer(this);
        this.Rightfrillspikepiece.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.Rightfrillspikes.addChild(Rightfrillspikepiece);
        this.setRotateAngle(Rightfrillspikepiece, 0.0637F, -0.3183F, 0.1061F);


        this.Leftcheekfrill = new ModelRenderer(this);
        this.Leftcheekfrill.setRotationPoint(-2.3F, 1.2697F, -1.8138F);
        this.Head.addChild(Leftcheekfrill);
        this.setRotateAngle(Leftcheekfrill, 0.2972F, 0.1911F, -0.6793F);


        this.Leftfrillspikes = new ModelRenderer(this);
        this.Leftfrillspikes.setRotationPoint(-4.1F, -1.0F, 0.5F);
        this.Leftcheekfrill.addChild(Leftfrillspikes);
        this.setRotateAngle(Leftfrillspikes, -0.0637F, 0.3396F, -0.2122F);


        this.Leftfrillspikepiece = new ModelRenderer(this);
        this.Leftfrillspikepiece.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.Leftfrillspikes.addChild(Leftfrillspikepiece);
        this.setRotateAngle(Leftfrillspikepiece, 0.0637F, 0.3183F, -0.1061F);


        this.Rightupperarm = new ModelRenderer(this);
        this.Rightupperarm.setRotationPoint(6.0F, 7.0831F, -5.0913F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, -0.2549F, 1.0964F, -1.4298F);


        this.Rightlowerarm = new ModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-1.3817F, 7.0728F, -1.0114F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.4981F, -0.339F, 1.2813F);


        this.Rightfrontfoot = new ModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(-0.7086F, 6.6614F, -0.619F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.2806F, 0.0213F, 0.0213F);


        this.Leftupperarm = new ModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-6.0F, 7.0831F, -5.0913F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 1.1897F, -0.646F, 0.0611F);


        this.Leftlowerarm = new ModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(1.3817F, 7.0728F, -1.0114F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -2.144F, 0.2759F, -0.8278F);


        this.Leftfrontfoot = new ModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.7086F, 6.6614F, -0.619F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 1.5024F, -0.0213F, -0.0213F);


        this.Scutes2 = new ModelRenderer(this);
        this.Scutes2.setRotationPoint(1.3F, -0.5169F, -8.6913F);
        this.Bodyfront.addChild(Scutes2);
        this.setRotateAngle(Scutes2, -1.5284F, 0.0F, 0.0424F);


        this.Scutes4 = new ModelRenderer(this);
        this.Scutes4.setRotationPoint(2.8F, -1.2269F, -13.2992F);
        this.Bodymiddle.addChild(Scutes4);
        this.setRotateAngle(Scutes4, -1.5921F, 0.0F, 0.0637F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -1.6073F, 15.359F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.3725F, -0.5355F, 0.1968F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 53, 50, -1.0F, 0.3537F, -0.0345F, 2, 2, 5, -0.1F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.0463F, 3.7655F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.2291F, -0.3834F, 0.087F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 29, 13, -0.5F, 0.3638F, 0.1053F, 1, 1, 4, -0.1F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0888F, 3.9053F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0863F, -0.7399F, 0.0583F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 34, 64, -0.5F, 0.2806F, -0.0743F, 1, 1, 4, -0.1F, false));

        this.Rightthigh = new ModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, 3.4927F, 12.059F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.2014F, -0.4959F, -0.7207F);


        this.Rightshin = new ModelRenderer(this);
        this.Rightshin.setRotationPoint(0.9214F, 7.1657F, 0.529F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.3943F, 0.4939F, 0.4682F);


        this.Righthindfoot = new ModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.6775F, 6.1489F, 0.1489F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.0848F, 0.0F, -0.0424F);


        this.Leftthigh = new ModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.5F, 3.4927F, 12.059F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.2226F, 0.672F, 0.4987F);


        this.Leftshin = new ModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.9214F, 7.1657F, 0.529F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.7686F, -0.2951F, -0.6515F);


        this.Lefthindfoot = new ModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(-0.6775F, 6.1489F, 0.1489F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.0897F, 0.0F, 0.0424F);


        this.Scutes6 = new ModelRenderer(this);
        this.Scutes6.setRotationPoint(1.3F, -2.4073F, 6.859F);
        this.Hips.addChild(Scutes6);
        this.setRotateAngle(Scutes6, -1.6345F, 0.0F, 0.0637F);

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
