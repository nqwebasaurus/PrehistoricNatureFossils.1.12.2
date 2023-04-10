package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOpabinia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer head;
    private final ModelRenderer cube_r2;
    private final ModelRenderer nozzle;
    private final ModelRenderer nozzle2;
    private final ModelRenderer nozzle3;
    private final ModelRenderer nozzle4;
    private final ModelRenderer nozzle5;
    private final ModelRenderer nozzle6;
    private final ModelRenderer nozzle7;
    private final ModelRenderer jaw;
    private final ModelRenderer jawL;
    private final ModelRenderer jawR;
    private final ModelRenderer middleeye;
    private final ModelRenderer backeyeR;
    private final ModelRenderer fronteyeR;
    private final ModelRenderer segment1;
    private final ModelRenderer legR1;
    private final ModelRenderer finR1;
    private final ModelRenderer segment2;
    private final ModelRenderer finR2;
    private final ModelRenderer segment3;
    private final ModelRenderer finR3;
    private final ModelRenderer segment4;
    private final ModelRenderer finR4;
    private final ModelRenderer segment5;
    private final ModelRenderer finR5;
    private final ModelRenderer segment6;
    private final ModelRenderer legR6;
    private final ModelRenderer finR6;
    private final ModelRenderer segment7;
    private final ModelRenderer finR7;
    private final ModelRenderer segment8;
    private final ModelRenderer finR8;
    private final ModelRenderer segment9;
    private final ModelRenderer legR9;
    private final ModelRenderer finR9;
    private final ModelRenderer segment10;
    private final ModelRenderer finR10;
    private final ModelRenderer segment11;
    private final ModelRenderer legR11;
    private final ModelRenderer finR11;
    private final ModelRenderer segment12;
    private final ModelRenderer legR12;
    private final ModelRenderer finR12;
    private final ModelRenderer segment13;
    private final ModelRenderer legR13;
    private final ModelRenderer finR13;
    private final ModelRenderer segment14;
    private final ModelRenderer legR14;
    private final ModelRenderer finR14;
    private final ModelRenderer segment15;
    private final ModelRenderer legR15;
    private final ModelRenderer finR15;
    private final ModelRenderer tail;
    private final ModelRenderer tailfinR1;
    private final ModelRenderer tailfinR2;
    private final ModelRenderer tailfinL3;
    private final ModelRenderer tailfinR3;

    public ModelSkeletonOpabinia() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.153F, 23.5F, -1.2456F);
        this.setRotateAngle(fossil, 0.0F, 0.3054F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.653F, 0.0F, -1.2544F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -9.5F, -0.5F, -15.5F, 21, 1, 33, -0.01F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(2.652F, -1.2434F, 5.8555F);
        this.fossil.addChild(head);
        this.setRotateAngle(head, 2.9234F, 0.0F, 1.5708F);
        this.head.cubeList.add(new ModelBox(head, 0, 4, 0.675F, -1.5166F, -1.6099F, 0, 2, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.005F, 1.7434F, 5.3901F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 18, 0.67F, 0.85F, -6.25F, 0, 1, 2, 0.0F, false));

        this.nozzle = new ModelRenderer(this);
        this.nozzle.setRotationPoint(-0.005F, -0.0066F, -1.1099F);
        this.head.addChild(nozzle);
        this.setRotateAngle(nozzle, 0.4363F, 0.0F, 0.0F);
        this.nozzle.cubeList.add(new ModelBox(nozzle, 26, 24, 0.7F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.nozzle2 = new ModelRenderer(this);
        this.nozzle2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle.addChild(nozzle2);
        this.setRotateAngle(nozzle2, -0.0873F, 0.0F, 0.0F);
        this.nozzle2.cubeList.add(new ModelBox(nozzle2, 26, 21, 0.71F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.nozzle3 = new ModelRenderer(this);
        this.nozzle3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle2.addChild(nozzle3);
        this.setRotateAngle(nozzle3, -0.2182F, 0.0F, 0.0F);
        this.nozzle3.cubeList.add(new ModelBox(nozzle3, 21, 26, 0.7F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.nozzle4 = new ModelRenderer(this);
        this.nozzle4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle3.addChild(nozzle4);
        this.setRotateAngle(nozzle4, -0.1309F, 0.0F, 0.0F);
        this.nozzle4.cubeList.add(new ModelBox(nozzle4, 26, 15, 0.71F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.nozzle5 = new ModelRenderer(this);
        this.nozzle5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle4.addChild(nozzle5);
        this.setRotateAngle(nozzle5, -0.2618F, 0.0F, 0.0F);
        this.nozzle5.cubeList.add(new ModelBox(nozzle5, 15, 26, 0.7F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.nozzle6 = new ModelRenderer(this);
        this.nozzle6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle5.addChild(nozzle6);
        this.setRotateAngle(nozzle6, -0.4363F, 0.0F, 0.0F);
        this.nozzle6.cubeList.add(new ModelBox(nozzle6, 26, 12, 0.71F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.nozzle7 = new ModelRenderer(this);
        this.nozzle7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle6.addChild(nozzle7);
        this.setRotateAngle(nozzle7, -0.48F, 0.0F, 0.0F);
        this.nozzle7.cubeList.add(new ModelBox(nozzle7, 12, 26, 0.7F, -0.501F, -1.0F, 0, 1, 1, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.nozzle7.addChild(jaw);


        this.jawL = new ModelRenderer(this);
        this.jawL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(jawL);
        this.jawL.cubeList.add(new ModelBox(jawL, 5, 16, 0.7F, -1.0F, -2.0F, 0, 2, 2, 0.0F, false));

        this.jawR = new ModelRenderer(this);
        this.jawR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(jawR);
        this.setRotateAngle(jawR, -0.3054F, 0.0F, 0.0F);
        this.jawR.cubeList.add(new ModelBox(jawR, 0, 16, 0.69F, -1.0F, -2.0F, 0, 2, 2, 0.0F, false));

        this.middleeye = new ModelRenderer(this);
        this.middleeye.setRotationPoint(-0.005F, -1.2566F, -0.1599F);
        this.head.addChild(middleeye);
        this.middleeye.cubeList.add(new ModelBox(middleeye, 9, 26, 0.7F, -1.1F, -0.8F, 0, 1, 1, 0.0F, false));

        this.backeyeR = new ModelRenderer(this);
        this.backeyeR.setRotationPoint(0.145F, -0.8066F, -0.2099F);
        this.head.addChild(backeyeR);
        this.setRotateAngle(backeyeR, -0.1745F, 0.0F, 0.0F);
        this.backeyeR.cubeList.add(new ModelBox(backeyeR, 18, 24, 0.52F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.fronteyeR = new ModelRenderer(this);
        this.fronteyeR.setRotationPoint(0.145F, -1.1066F, -0.9599F);
        this.head.addChild(fronteyeR);
        this.setRotateAngle(fronteyeR, -0.4363F, 0.0F, 0.0F);
        this.fronteyeR.cubeList.add(new ModelBox(fronteyeR, 26, 2, 0.52F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.segment1 = new ModelRenderer(this);
        this.segment1.setRotationPoint(-0.005F, -0.7566F, 1.3901F);
        this.head.addChild(segment1);
        this.setRotateAngle(segment1, 0.1745F, 0.0F, 0.0F);
        this.segment1.cubeList.add(new ModelBox(segment1, 24, 9, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR1 = new ModelRenderer(this);
        this.legR1.setRotationPoint(0.7F, 0.75F, -0.1F);
        this.segment1.addChild(legR1);
        this.setRotateAngle(legR1, -1.5708F, -1.0908F, 1.5708F);
        this.legR1.cubeList.add(new ModelBox(legR1, 25, 18, 0.4F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.finR1 = new ModelRenderer(this);
        this.finR1.setRotationPoint(0.6F, 0.5F, 0.5F);
        this.segment1.addChild(finR1);
        this.setRotateAngle(finR1, 0.0F, -0.3927F, -1.5708F);
        this.finR1.cubeList.add(new ModelBox(finR1, 17, 13, -1.55F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.segment2 = new ModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment1.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 24, 5, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR2 = new ModelRenderer(this);
        this.finR2.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment2.addChild(finR2);
        this.setRotateAngle(finR2, 0.0F, 0.0F, -1.5708F);
        this.finR2.cubeList.add(new ModelBox(finR2, 15, 7, -2.4995F, 1.67F, -0.4782F, 3, 0, 1, 0.0F, false));

        this.segment3 = new ModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment2.addChild(segment3);
        this.setRotateAngle(segment3, 0.1309F, 0.0F, 0.0F);
        this.segment3.cubeList.add(new ModelBox(segment3, 23, 20, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR3 = new ModelRenderer(this);
        this.finR3.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment3.addChild(finR3);
        this.setRotateAngle(finR3, 0.0F, 0.0F, -1.5708F);
        this.finR3.cubeList.add(new ModelBox(finR3, 15, 0, -2.7481F, 1.67F, -0.5436F, 3, 0, 1, 0.0F, false));

        this.segment4 = new ModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment3.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 23, 14, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR4 = new ModelRenderer(this);
        this.finR4.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment4.addChild(finR4);
        this.setRotateAngle(finR4, 0.0F, 0.0F, -1.5708F);
        this.finR4.cubeList.add(new ModelBox(finR4, 9, 14, -2.9481F, 1.67F, -0.5436F, 3, 0, 1, 0.0F, false));

        this.segment5 = new ModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment4.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 15, 22, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR5 = new ModelRenderer(this);
        this.finR5.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment5.addChild(finR5);
        this.setRotateAngle(finR5, 0.0F, 0.0F, -1.5708F);
        this.finR5.cubeList.add(new ModelBox(finR5, 0, 14, -3.0481F, 1.67F, -0.5436F, 3, 0, 1, 0.0F, false));

        this.segment6 = new ModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 12, 22, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR6 = new ModelRenderer(this);
        this.legR6.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, -1.5708F, 0.0F);
        this.legR6.cubeList.add(new ModelBox(legR6, 6, 25, -0.5F, 0.0F, -1.2F, 1, 2, 0, 0.0F, false));

        this.finR6 = new ModelRenderer(this);
        this.finR6.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment6.addChild(finR6);
        this.setRotateAngle(finR6, 0.0F, 0.0F, -1.5708F);
        this.finR6.cubeList.add(new ModelBox(finR6, 13, 4, -3.2481F, 1.67F, -0.5436F, 3, 0, 1, 0.0F, false));

        this.segment7 = new ModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment6.addChild(segment7);
        this.setRotateAngle(segment7, 0.0873F, 0.0F, 0.0F);
        this.segment7.cubeList.add(new ModelBox(segment7, 9, 22, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR7 = new ModelRenderer(this);
        this.finR7.setRotationPoint(0.6F, 0.9F, 0.5F);
        this.segment7.addChild(finR7);
        this.setRotateAngle(finR7, 0.0F, -0.0436F, -1.5708F);
        this.finR7.cubeList.add(new ModelBox(finR7, 9, 12, -2.9924F, 0.07F, -0.5868F, 3, 0, 1, 0.0F, false));

        this.segment8 = new ModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment7.addChild(segment8);
        this.segment8.cubeList.add(new ModelBox(segment8, 22, 2, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR8 = new ModelRenderer(this);
        this.finR8.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment8.addChild(finR8);
        this.setRotateAngle(finR8, 0.0F, 0.0F, -1.5708F);
        this.finR8.cubeList.add(new ModelBox(finR8, 0, 12, -3.3424F, 1.67F, -0.5868F, 3, 0, 1, 0.0F, false));

        this.segment9 = new ModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment8.addChild(segment9);
        this.segment9.cubeList.add(new ModelBox(segment9, 20, 21, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR9 = new ModelRenderer(this);
        this.legR9.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, -1.5708F, 0.0F);
        this.legR9.cubeList.add(new ModelBox(legR9, 3, 25, -0.5F, 0.0F, -1.2F, 1, 2, 0, 0.0F, false));

        this.finR9 = new ModelRenderer(this);
        this.finR9.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment9.addChild(finR9);
        this.setRotateAngle(finR9, 0.0F, 0.0F, -1.5708F);
        this.finR9.cubeList.add(new ModelBox(finR9, 9, 10, -3.2424F, 1.67F, -0.5868F, 3, 0, 1, 0.0F, false));

        this.segment10 = new ModelRenderer(this);
        this.segment10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment9.addChild(segment10);
        this.setRotateAngle(segment10, 0.1309F, 0.0F, 0.0F);
        this.segment10.cubeList.add(new ModelBox(segment10, 21, 17, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.finR10 = new ModelRenderer(this);
        this.finR10.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment10.addChild(finR10);
        this.setRotateAngle(finR10, 0.0F, 0.0F, -1.5708F);
        this.finR10.cubeList.add(new ModelBox(finR10, 0, 10, -3.0769F, 1.67F, -0.6504F, 3, 0, 1, 0.0F, false));

        this.segment11 = new ModelRenderer(this);
        this.segment11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment10.addChild(segment11);
        this.segment11.cubeList.add(new ModelBox(segment11, 6, 21, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR11 = new ModelRenderer(this);
        this.legR11.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, -1.5708F, 0.0F);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 25, -0.5F, 0.0F, -1.2F, 1, 2, 0, 0.0F, false));

        this.finR11 = new ModelRenderer(this);
        this.finR11.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment11.addChild(finR11);
        this.setRotateAngle(finR11, 0.0F, 0.0F, -1.5708F);
        this.finR11.cubeList.add(new ModelBox(finR11, 9, 2, -2.8269F, 1.67F, -0.6504F, 3, 0, 1, 0.0F, false));

        this.segment12 = new ModelRenderer(this);
        this.segment12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment11.addChild(segment12);
        this.setRotateAngle(segment12, 0.1309F, 0.0F, 0.0F);
        this.segment12.cubeList.add(new ModelBox(segment12, 3, 21, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR12 = new ModelRenderer(this);
        this.legR12.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment12.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, -1.5708F, 0.0F);
        this.legR12.cubeList.add(new ModelBox(legR12, 23, 24, -0.5F, 0.0F, -1.2F, 1, 2, 0, 0.0F, false));

        this.finR12 = new ModelRenderer(this);
        this.finR12.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment12.addChild(finR12);
        this.setRotateAngle(finR12, 0.0F, 0.0F, -1.5708F);
        this.finR12.cubeList.add(new ModelBox(finR12, 17, 11, -2.4532F, 1.67F, -0.7113F, 2, 0, 1, 0.0F, false));

        this.segment13 = new ModelRenderer(this);
        this.segment13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment12.addChild(segment13);
        this.setRotateAngle(segment13, 0.1745F, 0.0F, 0.0F);
        this.segment13.cubeList.add(new ModelBox(segment13, 0, 21, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR13 = new ModelRenderer(this);
        this.legR13.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment13.addChild(legR13);
        this.setRotateAngle(legR13, 0.0F, -1.5708F, 0.0F);
        this.legR13.cubeList.add(new ModelBox(legR13, 24, 0, -0.5F, 0.0F, -1.2F, 1, 2, 0, 0.0F, false));

        this.finR13 = new ModelRenderer(this);
        this.finR13.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment13.addChild(finR13);
        this.setRotateAngle(finR13, 0.0F, 0.0F, -1.5708F);
        this.finR13.cubeList.add(new ModelBox(finR13, 17, 9, -2.1596F, 1.67F, -0.7868F, 2, 0, 1, 0.0F, false));

        this.segment14 = new ModelRenderer(this);
        this.segment14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment13.addChild(segment14);
        this.setRotateAngle(segment14, 0.1309F, 0.0F, 0.0F);
        this.segment14.cubeList.add(new ModelBox(segment14, 18, 18, 0.71F, -0.76F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR14 = new ModelRenderer(this);
        this.legR14.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment14.addChild(legR14);
        this.setRotateAngle(legR14, 0.0F, -1.5708F, 0.0F);
        this.legR14.cubeList.add(new ModelBox(legR14, 0, 4, -0.5F, 0.0F, -1.2F, 1, 2, 0, 0.0F, false));

        this.finR14 = new ModelRenderer(this);
        this.finR14.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment14.addChild(finR14);
        this.setRotateAngle(finR14, 0.0F, 0.0F, -1.5708F);
        this.finR14.cubeList.add(new ModelBox(finR14, 15, 16, -1.8686F, 1.67F, -0.8378F, 2, 0, 1, 0.0F, false));

        this.segment15 = new ModelRenderer(this);
        this.segment15.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.segment14.addChild(segment15);
        this.setRotateAngle(segment15, 0.0873F, 0.0F, 0.0F);
        this.segment15.cubeList.add(new ModelBox(segment15, 15, 18, 0.7F, -0.75F, 0.0F, 0, 2, 1, 0.0F, false));

        this.legR15 = new ModelRenderer(this);
        this.legR15.setRotationPoint(-0.5F, 0.75F, 0.5F);
        this.segment15.addChild(legR15);
        this.setRotateAngle(legR15, 0.0F, -1.5708F, 0.0F);
        this.legR15.cubeList.add(new ModelBox(legR15, 0, 0, -0.5F, 0.0F, -1.23F, 1, 2, 0, 0.0F, false));

        this.finR15 = new ModelRenderer(this);
        this.finR15.setRotationPoint(-1.0F, 0.5F, 0.5F);
        this.segment15.addChild(finR15);
        this.setRotateAngle(finR15, 0.0F, 0.0F, -1.5708F);
        this.finR15.cubeList.add(new ModelBox(finR15, 8, 16, -1.5878F, 1.67F, -0.8686F, 2, 0, 1, 0.0F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -0.6F, 2.0F);
        this.segment15.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0F, -1.5708F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -1.0F, 0.21F, -1.25F, 1, 0, 3, 0.0F, false));

        this.tailfinR1 = new ModelRenderer(this);
        this.tailfinR1.setRotationPoint(-1.0F, -0.75F, -1.0F);
        this.tail.addChild(tailfinR1);
        this.tailfinR1.cubeList.add(new ModelBox(tailfinR1, 7, 8, -2.4245F, 0.9962F, -0.2064F, 3, 0, 1, 0.0F, false));

        this.tailfinR2 = new ModelRenderer(this);
        this.tailfinR2.setRotationPoint(-1.5F, -0.85F, 0.2F);
        this.tail.addChild(tailfinR2);
        this.setRotateAngle(tailfinR2, 0.0F, 0.4363F, 0.0F);
        this.tailfinR2.cubeList.add(new ModelBox(tailfinR2, 7, 6, -2.3578F, 0.9848F, -0.1504F, 3, 0, 1, 0.0F, false));

        this.tailfinL3 = new ModelRenderer(this);
        this.tailfinL3.setRotationPoint(0.0F, -0.65F, 1.25F);
        this.tail.addChild(tailfinL3);
        this.setRotateAngle(tailfinL3, -2.7053F, -1.5708F, 2.7489F);
        this.tailfinL3.cubeList.add(new ModelBox(tailfinL3, 6, 0, -0.671F, 0.9397F, 0.0462F, 3, 0, 1, 0.0F, false));

        this.tailfinR3 = new ModelRenderer(this);
        this.tailfinR3.setRotationPoint(-1.3F, 0.15F, 0.95F);
        this.tail.addChild(tailfinR3);
        this.setRotateAngle(tailfinR3, 0.0F, 0.8727F, 0.0F);
        this.tailfinR3.cubeList.add(new ModelBox(tailfinR3, 4, 4, -2.5F, 0.0F, -0.25F, 3, 0, 1, 0.0F, false));

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
