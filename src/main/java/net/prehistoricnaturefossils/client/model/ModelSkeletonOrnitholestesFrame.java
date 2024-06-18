package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOrnitholestesFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer base;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer upperlegleft;
    private final ModelRenderer lowerlegleft;
    private final ModelRenderer footleft;
    private final ModelRenderer toeleft;
    private final ModelRenderer upperlegright;
    private final ModelRenderer lowerlegright;
    private final ModelRenderer footright;
    private final ModelRenderer toeright;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer body;
    private final ModelRenderer cube_r11;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer upperarmleft;
    private final ModelRenderer lowerarmleft;
    private final ModelRenderer handleft;
    private final ModelRenderer fingerleft2;
    private final ModelRenderer fingerleft;
    private final ModelRenderer upperarmright;
    private final ModelRenderer lowerarmright;
    private final ModelRenderer handright;
    private final ModelRenderer fingerright2;
    private final ModelRenderer fingerright;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonOrnitholestesFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -19.4F, 6.6F, 1, 20, 1, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -16.0F, 7.1F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.5F, -3.0F, -0.5F, 1, 6, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.2F, -15.05F, -5.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2443F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.5F, -1.95F, -0.5F, 1, 17, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.2F, -15.05F, -5.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 1.45F, -2.6F, -0.5F, 1, 5, 1, -0.2F, false));

        this.base = new ModelRenderer(this);
        this.base.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(base);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.6222F, 7.1837F);
        this.base.addChild(hips);
        this.setRotateAngle(hips, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.7184F, 2.8147F, 8.1745F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 8, -2.2184F, -1.5609F, -11.9336F, 1, 1, 6, -0.2F, false));

        this.upperlegleft = new ModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.85F, 0.8222F, -0.0337F);
        this.hips.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.6981F, 0.0F, 0.0F);


        this.lowerlegleft = new ModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.0F, 7.133F, 0.95F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 1.1751F, -0.1209F, 0.0503F);


        this.footleft = new ModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 8.0495F, 0.4629F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.9145F, -0.0692F, -0.0532F);


        this.toeleft = new ModelRenderer(this);
        this.toeleft.setRotationPoint(0.0F, 5.55F, 0.25F);
        this.footleft.addChild(toeleft);
        this.setRotateAngle(toeleft, -1.309F, 0.0F, 0.0F);


        this.upperlegright = new ModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.85F, 0.8222F, -0.0337F);
        this.hips.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.524F, 0.0378F, -0.0218F);


        this.lowerlegright = new ModelRenderer(this);
        this.lowerlegright.setRotationPoint(0.0F, 7.133F, 0.95F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 1.308F, 0.0843F, -0.0226F);


        this.footright = new ModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 8.0495F, 0.4629F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -1.0904F, 0.0387F, 0.0202F);


        this.toeright = new ModelRenderer(this);
        this.toeright.setRotationPoint(0.0F, 5.55F, 0.25F);
        this.footright.addChild(toeright);
        this.setRotateAngle(toeright, -1.1781F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.5222F, 2.3163F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0437F, -0.0436F, 0.0019F);
        this.tail1.cubeList.add(new ModelBox(tail1, 9, 21, -0.5F, 0.1213F, -0.3626F, 1, 1, 8, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1713F, 6.9374F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.15F, -0.1285F, -0.0251F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(1.7766F, 1.6962F, -1.5749F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 48, -2.2766F, -0.9582F, 7.7939F, 1, 1, 4, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(1.7766F, 1.6962F, -1.5749F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 9, -2.2766F, -1.683F, 1.3499F, 1, 1, 7, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5601F, 9.7876F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.132F, 0.218F, -0.0097F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(4.1701F, 3.6633F, -10.322F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 26, -4.6701F, -3.7561F, 10.1129F, 1, 1, 6, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(4.1701F, 3.6633F, -10.322F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1047F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 28, -4.6701F, -5.1437F, 15.1804F, 1, 1, 6, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.586F, 10.8567F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.3099F, 0.1664F, -0.053F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(7.4535F, 9.3034F, -18.2561F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, -1, -1, -7.9535F, -12.1632F, 21.5811F, 1, 1, 11, -0.21F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(7.4535F, 9.3034F, -18.2561F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 18, -7.9535F, -10.1469F, 17.5958F, 1, 1, 6, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0778F, -2.2837F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0005F, -0.0865F, -0.0114F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5826F, 2.917F, 10.2721F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0524F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, -3.0826F, -2.159F, -17.3514F, 1, 1, 7, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2965F, -6.9663F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1717F, -0.0918F, 0.0205F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(4.2175F, 6.0047F, 16.1343F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 39, -4.7175F, -5.0961F, -22.2414F, 1, 1, 4, -0.2F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(4.2175F, 6.0047F, 16.1343F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 53, -4.7175F, -4.4521F, -19.1237F, 1, 1, 3, -0.2F, false));

        this.upperarmleft = new ModelRenderer(this);
        this.upperarmleft.setRotationPoint(2.6F, 3.3569F, -5.4069F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, -0.7854F, 0.3491F, 0.0F);


        this.lowerarmleft = new ModelRenderer(this);
        this.lowerarmleft.setRotationPoint(0.0836F, -0.4449F, 4.9505F);
        this.upperarmleft.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, -1.8326F, -0.2618F, 0.0F);


        this.handleft = new ModelRenderer(this);
        this.handleft.setRotationPoint(-0.1312F, 0.6031F, 4.175F);
        this.lowerarmleft.addChild(handleft);
        this.setRotateAngle(handleft, 0.305F, -0.1189F, -0.0785F);


        this.fingerleft2 = new ModelRenderer(this);
        this.fingerleft2.setRotationPoint(-0.05F, 0.15F, -0.25F);
        this.handleft.addChild(fingerleft2);
        this.setRotateAngle(fingerleft2, -0.3927F, 0.0F, 0.0F);


        this.fingerleft = new ModelRenderer(this);
        this.fingerleft.setRotationPoint(-0.05F, -0.25F, 0.0F);
        this.handleft.addChild(fingerleft);
        this.setRotateAngle(fingerleft, 0.1309F, 0.0F, 0.0F);


        this.upperarmright = new ModelRenderer(this);
        this.upperarmright.setRotationPoint(-2.6F, 3.3569F, -5.4069F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, -1.8331F, -0.3179F, 0.1346F);


        this.lowerarmright = new ModelRenderer(this);
        this.lowerarmright.setRotationPoint(-0.0836F, -0.4449F, 4.9505F);
        this.upperarmright.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, -1.2654F, 0.2618F, 0.0F);


        this.handright = new ModelRenderer(this);
        this.handright.setRotationPoint(0.1312F, 0.6031F, 4.175F);
        this.lowerarmright.addChild(handright);
        this.setRotateAngle(handright, 0.5427F, 0.2845F, 0.2429F);


        this.fingerright2 = new ModelRenderer(this);
        this.fingerright2.setRotationPoint(0.05F, 0.15F, -0.25F);
        this.handright.addChild(fingerright2);
        this.setRotateAngle(fingerright2, -0.3927F, 0.0F, 0.0F);


        this.fingerright = new ModelRenderer(this);
        this.fingerright.setRotationPoint(0.05F, -0.25F, 0.0F);
        this.handright.addChild(fingerright);
        this.setRotateAngle(fingerright, 0.1309F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.3431F, -5.6069F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0265F, -0.1354F, 0.1262F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.1587F, -1.221F);
        this.neck1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3229F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 18, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.9294F, -2.4196F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.7859F, -0.0308F, 0.0309F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(8.8016F, -11.2311F, 21.1147F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0698F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 17, -9.3016F, 12.8119F, -24.9043F, 1, 1, 5, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2338F, -3.8956F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3728F, -0.1893F, -0.0756F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(14.1432F, -17.8809F, 17.4405F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8639F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 0, -14.6432F, -2.5392F, -28.4089F, 1, 1, 2, -0.2F, false));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(14.1432F, -17.8809F, 17.4405F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3142F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 53, 18, -14.6432F, 11.7234F, -24.1106F, 1, 1, 2, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.8476F, -2.7315F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.7427F, -0.1215F, -0.0559F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0566F, -0.3459F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3491F, 0.0F, 0.0F);

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
