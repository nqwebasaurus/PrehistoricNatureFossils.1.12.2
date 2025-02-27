package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTrophyDinocephalia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body1_r1;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck12_r3;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck13_r5;
    private final ModelRenderer neck12_r4;
    private final ModelRenderer neck13_r6;
    private final ModelRenderer neck12_r5;
    private final ModelRenderer neck11_r3;
    private final ModelRenderer neck12_r6;
    private final ModelRenderer neck11_r4;
    private final ModelRenderer neck10_r2;
    private final ModelRenderer neck11_r5;
    private final ModelRenderer neck10_r3;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest4_r2;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest1_r1;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer neck10_r4;
    private final ModelRenderer neck11_r6;
    private final ModelRenderer neck9_r4;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck10_r5;
    private final ModelRenderer neck9_r5;
    private final ModelRenderer neck8_r3;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer head1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head3_r1;
    private final ModelRenderer head3_r2;
    private final ModelRenderer head3;
    private final ModelRenderer head4_r2;
    private final ModelRenderer head3_r3;
    private final ModelRenderer head4;
    private final ModelRenderer head4_r3;
    private final ModelRenderer fang1;
    private final ModelRenderer fang2;
    private final ModelRenderer upperteeth2;
    private final ModelRenderer upperteeth1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw3;
    private final ModelRenderer lowerfang1;
    private final ModelRenderer lowerteeth2;
    private final ModelRenderer jaw4;
    private final ModelRenderer lowerteeth1;
    private final ModelRenderer gums1;
    private final ModelRenderer gums2;
    private final ModelRenderer upperarm1;
    private final ModelRenderer arm1;
    private final ModelRenderer hand1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer body2;
    private final ModelRenderer body2_r2;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck19_r1;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer basin1;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer basin1_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer feet1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;

    public ModelSkeletonTrophyDinocephalia() {
        this.textureWidth = 230;
        this.textureHeight = 230;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, -4.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 70, -20.0F, -8.0F, -24.0F, 40, 8, 57, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -24.0F, -4.0F, -28.0F, 48, 4, 65, 0.004F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-20.0F, -8.0F, 4.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.733F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 136, 0.0F, 0.0F, -11.5F, 3, 6, 23, 0.0F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -32.0F, 0.0F);
        this.fossil.addChild(root);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.9F, 2.5F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);


        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 0.9964F, -10.8887F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0873F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 91, 170, -1.5F, -1.9755F, 0.3883F, 3, 3, 10, 0.0F, false));

        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, -0.6097F, -1.0975F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.0436F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 0, 166, -1.5F, -1.2498F, -0.0052F, 3, 3, 12, -0.002F, false));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(0.0F, -1.1155F, 9.7815F);
        this.body1.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, -0.1047F, 0.0F, 0.0F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 87, 217, 0.0F, -1.5F, -1.0F, 0, 3, 2, 0.0F, false));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(0.0F, -0.7457F, -11.9162F);
        this.body1.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, -0.0175F, 0.0F, 0.0F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 82, 217, 0.0F, -2.6584F, 17.6561F, 0, 3, 2, 0.0F, false));
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 217, 70, 0.0F, -3.0683F, 14.6243F, 0, 3, 2, 0.0F, false));
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 30, 217, 0.0F, -3.079F, 11.6176F, 0, 3, 2, 0.0F, false));
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 25, 217, 0.0F, -2.9899F, 8.6173F, 0, 3, 2, 0.0F, false));
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 15, 217, 0.0F, -3.0006F, 5.6106F, 0, 3, 2, 0.0F, false));
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 216, 106, 0.0F, -2.8117F, 2.6166F, 0, 3, 2, 0.0F, false));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-1.6132F, 0.5755F, 6.4374F);
        this.body1.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, -0.0762F, 0.1048F, 0.4403F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 26, 182, -3.4084F, 3.1677F, -1.4015F, 0, 6, 2, 0.0F, false));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-1.6132F, 0.5755F, 6.4374F);
        this.body1.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, 0.0206F, 0.1278F, 1.231F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 119, 213, -0.1635F, -0.399F, -1.4015F, 0, 5, 2, 0.0F, false));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(-1.6132F, 0.2809F, 1.9193F);
        this.body1.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, -0.0366F, 0.0861F, 0.4441F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 97, 210, -3.3355F, 3.3973F, -0.8582F, 0, 9, 2, 0.0F, false));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(-1.6132F, 0.2809F, 1.9193F);
        this.body1.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, 0.0352F, 0.0867F, 1.2326F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 47, 214, 0.0504F, -0.2882F, -0.8582F, 0, 5, 2, 0.0F, false));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-9.6111F, 9.3628F, -1.7707F);
        this.body1.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, -0.0231F, 0.0633F, 0.0536F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 57, 216, 0.0416F, -0.0857F, -0.9038F, 0, 5, 2, 0.0F, false));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(-1.6132F, 0.4631F, -2.0765F);
        this.body1.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, 0.0029F, 0.0673F, 0.4471F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 169, 211, -3.3355F, 3.3973F, -0.8582F, 0, 8, 2, 0.0F, false));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(-1.6132F, 0.4631F, -2.0765F);
        this.body1.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, 0.0497F, 0.0455F, 1.2335F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 214, 118, 0.0504F, -0.2882F, -0.8582F, 0, 5, 2, 0.0F, false));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(-9.5594F, 9.5692F, -5.2788F);
        this.body1.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, 0.0232F, 0.0599F, 0.1F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 184, 211, -0.0201F, -0.109F, -1.0059F, 0, 8, 2, 0.0F, false));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(-1.6132F, 0.6452F, -6.0724F);
        this.body1.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, 0.0423F, 0.0484F, 0.4494F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 159, 211, -3.3355F, 3.3973F, -0.8582F, 0, 8, 2, 0.0F, false));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-1.6132F, 0.6452F, -6.0724F);
        this.body1.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, 0.0641F, 0.0043F, 1.2339F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 154, 214, 0.0504F, -0.2882F, -0.8582F, 0, 5, 2, 0.0F, false));

        this.neck12_r3 = new ModelRenderer(this);
        this.neck12_r3.setRotationPoint(-9.4594F, 9.7979F, -8.7292F);
        this.body1.addChild(neck12_r3);
        this.setRotateAngle(neck12_r3, 0.069F, 0.0526F, 0.1461F);
        this.neck12_r3.cubeList.add(new ModelBox(neck12_r3, 212, 70, -0.0578F, 0.0211F, -1.166F, 0, 8, 2, 0.0F, false));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(-1.6132F, 1.1362F, -10.2544F);
        this.body1.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, 0.0816F, 0.0294F, 0.4509F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 203, 210, -3.3887F, 3.3153F, -0.6571F, 0, 8, 2, 0.0F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(-1.6132F, 1.1362F, -10.2544F);
        this.body1.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, 0.0785F, -0.0368F, 1.2336F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 144, 214, -0.0453F, -0.3086F, -0.6571F, 0, 5, 2, 0.0F, false));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(1.6132F, 0.5755F, 6.4374F);
        this.body1.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, 0.0206F, -0.1278F, -1.231F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 84, 200, 0.1635F, -0.399F, -1.4015F, 0, 5, 2, 0.0F, false));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(1.6132F, 0.5755F, 6.4374F);
        this.body1.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, -0.0762F, -0.1048F, -0.4403F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 21, 182, 3.4084F, 3.1677F, -1.4015F, 0, 6, 2, 0.0F, false));

        this.neck13_r5 = new ModelRenderer(this);
        this.neck13_r5.setRotationPoint(1.6132F, 0.2809F, 1.9193F);
        this.body1.addChild(neck13_r5);
        this.setRotateAngle(neck13_r5, -0.0366F, -0.0861F, -0.4441F);
        this.neck13_r5.cubeList.add(new ModelBox(neck13_r5, 67, 208, 3.3355F, 3.3973F, -0.8582F, 0, 9, 2, 0.0F, false));

        this.neck12_r4 = new ModelRenderer(this);
        this.neck12_r4.setRotationPoint(1.6132F, 0.2809F, 1.9193F);
        this.body1.addChild(neck12_r4);
        this.setRotateAngle(neck12_r4, 0.0352F, -0.0867F, -1.2326F);
        this.neck12_r4.cubeList.add(new ModelBox(neck12_r4, 42, 214, -0.0504F, -0.2882F, -0.8582F, 0, 5, 2, 0.0F, false));

        this.neck13_r6 = new ModelRenderer(this);
        this.neck13_r6.setRotationPoint(1.6132F, 0.4631F, -2.0765F);
        this.body1.addChild(neck13_r6);
        this.setRotateAngle(neck13_r6, 0.0029F, -0.0673F, -0.4471F);
        this.neck13_r6.cubeList.add(new ModelBox(neck13_r6, 164, 211, 3.3355F, 3.3973F, -0.8582F, 0, 8, 2, 0.0F, false));

        this.neck12_r5 = new ModelRenderer(this);
        this.neck12_r5.setRotationPoint(9.6111F, 9.3628F, -1.7707F);
        this.body1.addChild(neck12_r5);
        this.setRotateAngle(neck12_r5, -0.0231F, -0.0633F, -0.0536F);
        this.neck12_r5.cubeList.add(new ModelBox(neck12_r5, 52, 216, -0.0416F, -0.0857F, -0.9038F, 0, 5, 2, 0.0F, false));

        this.neck11_r3 = new ModelRenderer(this);
        this.neck11_r3.setRotationPoint(1.6132F, 0.4631F, -2.0765F);
        this.body1.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, 0.0497F, -0.0455F, -1.2335F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 37, 214, -0.0504F, -0.2882F, -0.8582F, 0, 5, 2, 0.0F, false));

        this.neck12_r6 = new ModelRenderer(this);
        this.neck12_r6.setRotationPoint(1.6132F, 0.6452F, -6.0724F);
        this.body1.addChild(neck12_r6);
        this.setRotateAngle(neck12_r6, 0.0423F, -0.0484F, -0.4494F);
        this.neck12_r6.cubeList.add(new ModelBox(neck12_r6, 107, 211, 3.3355F, 3.3973F, -0.8582F, 0, 8, 2, 0.0F, false));

        this.neck11_r4 = new ModelRenderer(this);
        this.neck11_r4.setRotationPoint(9.5594F, 9.5692F, -5.2788F);
        this.body1.addChild(neck11_r4);
        this.setRotateAngle(neck11_r4, 0.0232F, -0.0599F, -0.1F);
        this.neck11_r4.cubeList.add(new ModelBox(neck11_r4, 174, 211, 0.0201F, -0.109F, -1.0059F, 0, 8, 2, 0.0F, false));

        this.neck10_r2 = new ModelRenderer(this);
        this.neck10_r2.setRotationPoint(1.6132F, 0.6452F, -6.0724F);
        this.body1.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, 0.0641F, -0.0043F, -1.2339F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 149, 214, -0.0504F, -0.2882F, -0.8582F, 0, 5, 2, 0.0F, false));

        this.neck11_r5 = new ModelRenderer(this);
        this.neck11_r5.setRotationPoint(9.4594F, 9.7979F, -8.7292F);
        this.body1.addChild(neck11_r5);
        this.setRotateAngle(neck11_r5, 0.069F, -0.0526F, -0.1461F);
        this.neck11_r5.cubeList.add(new ModelBox(neck11_r5, 179, 211, 0.0578F, 0.0211F, -1.166F, 0, 8, 2, 0.0F, false));

        this.neck10_r3 = new ModelRenderer(this);
        this.neck10_r3.setRotationPoint(1.6132F, 1.1362F, -10.2544F);
        this.body1.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, 0.0816F, -0.0294F, -0.4509F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 198, 210, 3.3887F, 3.3153F, -0.6571F, 0, 8, 2, 0.0F, false));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(1.6132F, 1.1362F, -10.2544F);
        this.body1.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, 0.0785F, 0.0368F, -1.2336F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 10, 214, 0.0453F, -0.3086F, -0.6571F, 0, 5, 2, 0.0F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 0.5F, -9.7F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, -0.0033F, -0.0088F, 0.0333F);
        this.chest1.cubeList.add(new ModelBox(chest1, 20, 217, 0.0F, -3.8145F, -5.6197F, 0, 3, 2, 0.0F, false));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(5.7306F, 16.4327F, -10.4348F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 1.5671F, 0.4014F, 1.5613F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 118, 170, 0.0942F, -2.6324F, -10.3446F, 1, 8, 9, 0.0F, false));

        this.chest4_r2 = new ModelRenderer(this);
        this.chest4_r2.setRotationPoint(-10.0141F, 11.551F, -8.5562F);
        this.chest1.addChild(chest4_r2);
        this.setRotateAngle(chest4_r2, 1.2343F, -0.2232F, -0.5641F);
        this.chest4_r2.cubeList.add(new ModelBox(chest4_r2, 54, 185, -0.5249F, -2.4543F, -7.079F, 2, 8, 7, 0.0F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(-8.8805F, 12.854F, -5.5351F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, 1.1766F, 0.078F, 0.1851F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 115, 151, -1.6117F, -5.3444F, -0.4018F, 2, 6, 12, 0.002F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(10.0141F, 11.551F, -8.5562F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 1.2343F, 0.2232F, 0.5641F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 139, 181, -1.4751F, -2.4543F, -7.079F, 2, 8, 7, 0.0F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(8.8805F, 12.854F, -5.5351F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 1.1766F, -0.078F, -0.1851F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 86, 151, -0.3883F, -5.3444F, -0.4018F, 2, 6, 12, 0.002F, false));

        this.chest1_r1 = new ModelRenderer(this);
        this.chest1_r1.setRotationPoint(0.0F, 0.5F, -10.7F);
        this.chest1.addChild(chest1_r1);
        this.setRotateAngle(chest1_r1, 0.096F, 0.0F, 0.0F);
        this.chest1_r1.cubeList.add(new ModelBox(chest1_r1, 62, 170, -1.5F, -1.1034F, -0.3522F, 3, 3, 11, 0.002F, false));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(0.0F, -1.2457F, -2.2162F);
        this.chest1.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, -0.0175F, 0.0F, 0.0F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 216, 126, 0.0F, -2.7593F, -0.383F, 0, 3, 2, 0.0F, false));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(-1.6132F, 0.8362F, -4.5544F);
        this.chest1.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, 0.0872F, -0.0615F, 1.2332F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 208, 215, 0.0489F, -0.2761F, -0.6658F, 0, 5, 2, 0.0F, false));

        this.neck10_r4 = new ModelRenderer(this);
        this.neck10_r4.setRotationPoint(-9.4951F, 9.5544F, -2.7549F);
        this.chest1.addChild(neck10_r4);
        this.setRotateAngle(neck10_r4, 0.095F, 0.0487F, 0.1474F);
        this.neck10_r4.cubeList.add(new ModelBox(neck10_r4, 216, 81, -0.0245F, 0.0011F, -1.2117F, 0, 4, 2, 0.0F, false));

        this.neck11_r6 = new ModelRenderer(this);
        this.neck11_r6.setRotationPoint(-1.6132F, 0.8362F, -4.5544F);
        this.chest1.addChild(neck11_r6);
        this.setRotateAngle(neck11_r6, 0.1052F, 0.018F, 0.4514F);
        this.neck11_r6.cubeList.add(new ModelBox(neck11_r6, 102, 211, -3.3451F, 3.4049F, -0.6658F, 0, 8, 2, 0.0F, false));

        this.neck9_r4 = new ModelRenderer(this);
        this.neck9_r4.setRotationPoint(-1.6132F, 1.2362F, -8.2544F);
        this.chest1.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, 0.1837F, -0.0201F, 0.4514F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 193, 210, -3.3075F, 3.4384F, -0.978F, 0, 8, 2, 0.0F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(-1.6132F, 1.2362F, -8.2544F);
        this.chest1.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, 0.1164F, -0.1438F, 1.2302F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 215, 212, 0.0992F, -0.279F, -0.978F, 0, 5, 2, 0.0F, false));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(1.6132F, 0.8362F, -4.5544F);
        this.chest1.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, 0.0872F, 0.0615F, -1.2332F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 77, 215, -0.0489F, -0.2761F, -0.6658F, 0, 5, 2, 0.0F, false));

        this.neck10_r5 = new ModelRenderer(this);
        this.neck10_r5.setRotationPoint(1.6132F, 0.8362F, -4.5544F);
        this.chest1.addChild(neck10_r5);
        this.setRotateAngle(neck10_r5, 0.1052F, -0.018F, -0.4514F);
        this.neck10_r5.cubeList.add(new ModelBox(neck10_r5, 210, 204, 3.3451F, 3.4049F, -0.6658F, 0, 8, 2, 0.0F, false));

        this.neck9_r5 = new ModelRenderer(this);
        this.neck9_r5.setRotationPoint(9.4951F, 9.5544F, -2.7549F);
        this.chest1.addChild(neck9_r5);
        this.setRotateAngle(neck9_r5, 0.095F, -0.0487F, -0.1474F);
        this.neck9_r5.cubeList.add(new ModelBox(neck9_r5, 62, 216, 0.0245F, 0.0011F, -1.2117F, 0, 4, 2, 0.0F, false));

        this.neck8_r3 = new ModelRenderer(this);
        this.neck8_r3.setRotationPoint(1.6132F, 1.2362F, -8.2544F);
        this.chest1.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, 0.1837F, 0.0201F, -0.4514F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 139, 170, 3.3075F, 3.4384F, -0.978F, 0, 8, 2, 0.0F, false));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(1.6132F, 1.2362F, -8.2544F);
        this.chest1.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.1164F, 0.1438F, -1.2302F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 72, 215, -0.0992F, -0.279F, -0.978F, 0, 5, 2, 0.0F, false));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(0.0F, 0.8543F, -14.2162F);
        this.chest1.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.0873F, 0.0F, 0.0F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 216, 112, 0.0F, -3.5322F, 5.6866F, 0, 3, 2, 0.0F, false));
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 216, 100, 0.0F, -3.1959F, 2.6457F, 0, 3, 2, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.1F, -11.0F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.404F, 0.1607F, -0.0683F);


        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 1.078F, -4.4342F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.2618F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 200, 188, -1.5F, -1.5523F, 0.4023F, 3, 3, 5, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.0F, -0.6677F, -3.4504F);
        this.neck1.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.0873F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 216, 94, 0.0F, -2.6983F, -1.3073F, 0, 3, 2, 0.0F, false));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(-1.6F, 0.9432F, -1.9408F);
        this.neck1.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, 0.7157F, -0.4024F, 0.5245F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 5, 214, 0.1092F, -0.0003F, -0.6257F, 0, 5, 2, 0.0F, false));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(1.6F, 0.9432F, -1.9408F);
        this.neck1.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.7157F, 0.4024F, -0.5245F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 134, 213, -0.1092F, -0.0003F, -0.6257F, 0, 5, 2, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.978F, -4.0342F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0912F, -0.0435F, 0.004F);
        this.neck2.cubeList.add(new ModelBox(neck2, 198, 179, -1.5F, -1.5356F, -4.225F, 3, 3, 5, -0.002F, false));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(-1.6F, 0.4844F, -0.9567F);
        this.neck2.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.7521F, -0.3147F, 0.4208F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 189, 211, 0.0992F, -0.054F, -0.7095F, 0, 4, 1, 0.0F, false));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(1.6F, 0.4844F, -0.9567F);
        this.neck2.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 0.7521F, 0.3147F, -0.4208F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 135, 188, -0.0992F, -0.054F, -0.7095F, 0, 4, 1, 0.0F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3356F, -3.525F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0075F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 209, 166, -1.5F, -1.3344F, -2.977F, 3, 3, 3, 0.0F, false));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(-1.6F, -0.3344F, -1.477F);
        this.neck3.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.546F, -0.1623F, 0.2599F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 189, 217, 0.4F, 0.9F, -0.5F, 0, 4, 1, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(1.6F, -0.3344F, -1.477F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 0.546F, 0.1623F, -0.2599F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 59, 179, -0.4F, 0.9F, -0.5F, 0, 4, 1, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(0.0F, -1.2361F, -0.4039F);
        this.neck3.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, -0.0873F, 0.0F, 0.0F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 112, 213, 0.0F, -2.9001F, -1.5466F, 0, 3, 3, 0.0F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 0.3656F, -3.077F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.0484F, 0.4309F, 0.2214F);
        this.head1.cubeList.add(new ModelBox(head1, 144, 151, -4.5F, -3.7374F, -6.7962F, 9, 6, 7, 0.0F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -3.7374F, 0.2038F);
        this.head1.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.5672F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 135, 197, -3.5F, -1.8681F, -3.0588F, 7, 2, 3, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.8374F, -6.9962F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.2276F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 31, 166, -3.0F, -2.0F, -8.0F, 6, 3, 9, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.5F, 4.8F, -0.3F);
        this.head2.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.1484F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 195, 85, -3.0F, -5.0311F, -0.1012F, 5, 5, 5, 0.0F, false));

        this.head3_r1 = new ModelRenderer(this);
        this.head3_r1.setRotationPoint(0.5F, 3.0F, -2.7F);
        this.head2.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.6545F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 195, 118, -3.0F, -5.0634F, -0.8634F, 5, 5, 4, -0.003F, false));

        this.head3_r2 = new ModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, 3.0218F, -0.5296F);
        this.head2.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -0.1309F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 156, 136, -3.0F, -3.0218F, -7.9704F, 6, 3, 10, 0.003F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.1F, -7.6F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1663F, 0.0F, 0.0F);


        this.head4_r2 = new ModelRenderer(this);
        this.head4_r2.setRotationPoint(0.0F, 0.9F, -0.1F);
        this.head3.addChild(head4_r2);
        this.setRotateAngle(head4_r2, 0.1309F, 0.0F, 0.0F);
        this.head4_r2.cubeList.add(new ModelBox(head4_r2, 195, 128, -2.5F, -2.9F, -4.9F, 5, 2, 5, 0.0F, false));

        this.head3_r3 = new ModelRenderer(this);
        this.head3_r3.setRotationPoint(0.0F, 0.9F, -0.2F);
        this.head3.addChild(head3_r3);
        this.setRotateAngle(head3_r3, -0.0262F, 0.0F, 0.0F);
        this.head3_r3.cubeList.add(new ModelBox(head3_r3, 0, 196, -2.5F, -0.8869F, -4.8009F, 5, 1, 5, -0.002F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -2.55F, -0.8F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.2574F, 0.0F, 0.0F);


        this.head4_r3 = new ModelRenderer(this);
        this.head4_r3.setRotationPoint(0.0F, 0.2F, -4.5F);
        this.head4.addChild(head4_r3);
        this.setRotateAngle(head4_r3, 0.1222F, 0.0F, 0.0F);
        this.head4_r3.cubeList.add(new ModelBox(head4_r3, 193, 204, -2.0F, 0.0F, 0.6F, 4, 1, 4, 0.0F, false));

        this.fang1 = new ModelRenderer(this);
        this.fang1.setRotationPoint(1.7F, 1.4F, -1.4F);
        this.head3.addChild(fang1);
        this.setRotateAngle(fang1, 0.0911F, 0.0F, 0.0F);
        this.fang1.cubeList.add(new ModelBox(fang1, 62, 166, -0.5F, -1.0725F, -0.5988F, 1, 2, 1, 0.0F, false));

        this.fang2 = new ModelRenderer(this);
        this.fang2.setRotationPoint(-1.7F, 1.4F, -1.4F);
        this.head3.addChild(fang2);
        this.setRotateAngle(fang2, 0.0911F, 0.0F, 0.0F);
        this.fang2.cubeList.add(new ModelBox(fang2, 72, 166, -0.5F, -1.0725F, -0.5988F, 1, 2, 1, 0.0F, false));

        this.upperteeth2 = new ModelRenderer(this);
        this.upperteeth2.setRotationPoint(0.0F, 1.3F, -3.2F);
        this.head3.addChild(upperteeth2);
        this.setRotateAngle(upperteeth2, -0.0456F, 0.0F, 0.0F);
        this.upperteeth2.cubeList.add(new ModelBox(upperteeth2, 209, 173, -2.0F, -1.049F, -1.244F, 4, 2, 2, 0.0F, false));

        this.upperteeth1 = new ModelRenderer(this);
        this.upperteeth1.setRotationPoint(0.0F, 1.5F, -4.6F);
        this.head2.addChild(upperteeth1);
        this.setRotateAngle(upperteeth1, 0.1367F, 0.0F, 0.0F);
        this.upperteeth1.cubeList.add(new ModelBox(upperteeth1, 159, 204, -2.0F, -0.8938F, -3.967F, 4, 2, 4, 0.0F, false));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.4626F, -1.0962F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 1.0908F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 195, 96, 1.5F, 0.1081F, -6.8189F, 3, 3, 7, 0.0F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 195, 107, -4.5F, 0.1081F, -6.8189F, 3, 3, 7, 0.0F, false));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, -1.7919F, -4.8189F);
        this.jaw1.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.48F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 52, 208, -4.5F, -0.1F, 0.4F, 3, 3, 4, -0.004F, false));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 37, 206, 1.5F, -0.1F, 0.4F, 3, 3, 4, -0.004F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0081F, -4.2189F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.2276F, 0.0F, 0.0F);


        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(0.0F, -1.9F, -6.8F);
        this.jaw2.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, -0.0698F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 21, 191, -3.0F, -0.1F, -1.2F, 2, 3, 8, 0.0F, false));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 189, 136, 1.0F, -0.1F, -1.2F, 2, 3, 8, 0.0F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.0F, -6.3F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 209, 148, 1.5F, -1.0F, -5.0F, 1, 3, 5, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 209, 157, -2.5F, -1.0F, -5.0F, 1, 3, 5, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 210, 141, -2.5F, -1.0F, -6.0F, 5, 3, 1, 0.0F, false));

        this.lowerfang1 = new ModelRenderer(this);
        this.lowerfang1.setRotationPoint(1.7F, -0.8F, -2.6F);
        this.jaw3.addChild(lowerfang1);
        this.setRotateAngle(lowerfang1, -0.0456F, 0.0F, 0.0F);
        this.lowerfang1.cubeList.add(new ModelBox(lowerfang1, 67, 166, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.lowerteeth2 = new ModelRenderer(this);
        this.lowerteeth2.setRotationPoint(0.0F, -0.3F, -4.3F);
        this.jaw3.addChild(lowerteeth2);
        this.setRotateAngle(lowerteeth2, 0.0911F, 0.0F, 0.0F);
        this.lowerteeth2.cubeList.add(new ModelBox(lowerteeth2, 210, 136, -2.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.7F, -0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2416F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 31, 179, 1.0F, -1.0F, -8.0F, 2, 2, 9, -0.003F, false));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 91, 184, -3.0F, -1.0F, -8.0F, 2, 2, 9, -0.003F, false));

        this.lowerteeth1 = new ModelRenderer(this);
        this.lowerteeth1.setRotationPoint(0.0F, -2.2F, -3.9F);
        this.jaw2.addChild(lowerteeth1);
        this.setRotateAngle(lowerteeth1, -0.4098F, 0.0F, 0.0F);
        this.lowerteeth1.cubeList.add(new ModelBox(lowerteeth1, 176, 204, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.jaw2.addChild(gums1);
        this.setRotateAngle(gums1, -0.5009F, 0.0F, 0.0F);


        this.gums2 = new ModelRenderer(this);
        this.gums2.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.jaw2.addChild(gums2);
        this.setRotateAngle(gums2, -0.4554F, 0.0F, 0.0F);


        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(10.0F, 13.0F, -6.6F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.406F, 0.0F, -0.4098F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 158, 192, -1.936F, -0.6277F, -2.9629F, 3, 4, 7, 0.0F, false));
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 129, 203, -1.936F, 3.3723F, -0.9629F, 3, 5, 4, 0.0F, false));

        this.arm1 = new ModelRenderer(this);
        this.arm1.setRotationPoint(-0.436F, 8.5723F, 2.5371F);
        this.upperarm1.addChild(arm1);
        this.setRotateAngle(arm1, -0.3187F, 0.0F, 0.4098F);
        this.arm1.cubeList.add(new ModelBox(arm1, 90, 196, -0.7141F, 0.263F, -3.3492F, 2, 9, 4, 0.0F, false));
        this.arm1.cubeList.add(new ModelBox(arm1, 15, 203, -2.4141F, 0.263F, -3.3492F, 1, 9, 4, -0.1F, false));

        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-1.7141F, 8.263F, -2.3492F);
        this.arm1.addChild(hand1);
        this.hand1.cubeList.add(new ModelBox(hand1, 53, 136, -2.5F, -2.0F, -6.7F, 7, 4, 10, 0.0F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-10.0F, 13.0F, -6.6F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 1.1914F, 0.0F, 0.4098F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 179, 192, -1.064F, -0.6277F, -2.9629F, 3, 4, 7, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 144, 204, -1.064F, 3.3723F, -0.9629F, 3, 5, 4, 0.0F, false));

        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(0.436F, 8.5723F, 2.5371F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -1.1041F, 0.0F, -0.4098F);
        this.arm2.cubeList.add(new ModelBox(arm2, 196, 165, -1.2859F, 0.263F, -3.3492F, 2, 9, 4, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 26, 203, 1.4141F, 0.263F, -3.3492F, 1, 9, 4, -0.1F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(1.7141F, 8.263F, -2.3492F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, 1.0036F, 0.0F, 0.0F);
        this.hand2.cubeList.add(new ModelBox(hand2, 88, 136, -4.5F, -2.0F, -6.7F, 7, 4, 10, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.6F, 9.3F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, -0.0907F, 0.1308F, 0.006F);


        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(0.0F, 0.3174F, 0.0559F);
        this.body2.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.1047F, 0.0F, 0.0F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 144, 165, -1.5F, -2.3174F, -0.0559F, 3, 3, 12, 0.0F, false));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(-1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, -0.0399F, 0.2921F, 1.2183F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 215, 204, -1.4453F, -0.3807F, 5.7239F, 0, 5, 2, 0.0F, false));
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 0, 214, -0.8181F, -0.3587F, 2.7079F, 0, 5, 2, 0.0F, false));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, -0.2365F, 0.1775F, 0.4177F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 216, 132, -3.8998F, 2.7334F, 2.7079F, 0, 1, 2, 0.0F, false));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, -0.1559F, 0.1416F, 0.4305F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 216, 88, -3.4401F, 3.2134F, -0.622F, 0, 3, 2, 0.0F, false));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(-1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, -0.0091F, 0.21F, 1.226F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 129, 213, -0.1536F, -0.3443F, -0.622F, 0, 5, 2, 0.0F, false));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, -0.0399F, -0.2921F, -1.2183F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 215, 178, 1.4453F, -0.3807F, 5.7239F, 0, 5, 2, 0.0F, false));
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 139, 213, 0.8181F, -0.3587F, 2.7079F, 0, 5, 2, 0.0F, false));

        this.neck19_r1 = new ModelRenderer(this);
        this.neck19_r1.setRotationPoint(0.0F, -1.9498F, 3.5488F);
        this.body2.addChild(neck19_r1);
        this.setRotateAngle(neck19_r1, -0.2356F, 0.0F, 0.0F);
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 217, 186, 0.0F, -1.497F, 5.2179F, 0, 2, 2, 0.0F, false));
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 92, 217, 0.0F, -1.3372F, 2.0596F, 0, 2, 2, 0.0F, false));
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 217, 76, 0.0F, -0.9912F, -1.0259F, 0, 2, 2, 0.0F, false));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, -0.2365F, -0.1775F, -0.4177F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 77, 166, 3.8998F, 2.7334F, 2.7079F, 0, 1, 2, 0.0F, false));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, -0.0091F, -0.21F, -1.226F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 124, 213, 0.1536F, -0.3443F, -0.622F, 0, 5, 2, 0.0F, false));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(1.6132F, 0.3338F, 0.257F);
        this.body2.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, -0.1559F, -0.1416F, -0.4305F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 54, 179, 3.4401F, 3.2134F, -0.622F, 0, 3, 2, 0.0F, false));

        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.body2.addChild(basin1);
        this.setRotateAngle(basin1, -0.2264F, 0.1297F, 0.0179F);


        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.3F, 8.658F, 2.8351F);
        this.basin1.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.203F, 0.0607F, -0.4062F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 177, 150, -0.6569F, -0.2606F, -2.8986F, 2, 6, 8, 0.0F, false));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-5.0F, 4.658F, 2.8351F);
        this.basin1.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.197F, 0.0781F, -0.4919F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 203, -0.8608F, -0.6158F, -2.7758F, 2, 5, 5, 0.0F, false));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-4.8F, 1.458F, 2.4351F);
        this.basin1.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.0434F, -0.0049F, 0.1133F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 114, 188, -1.3139F, -1.4129F, -3.8706F, 2, 5, 8, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.8F, 1.458F, 2.4351F);
        this.basin1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 201, -0.6F, -0.2366F, -1.6011F, 4, 1, 5, 0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 200, 197, 6.2F, -0.2366F, -1.6011F, 4, 1, 5, 0.003F, false));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(4.8F, 1.458F, 2.4351F);
        this.basin1.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.0434F, 0.0049F, -0.1133F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 182, -0.6861F, -1.4129F, -3.8706F, 2, 5, 8, 0.0F, false));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(5.0F, 4.658F, 2.8351F);
        this.basin1.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, 0.197F, -0.0781F, 0.4919F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 114, 202, -1.1392F, -0.6158F, -2.7758F, 2, 5, 5, 0.0F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(3.3F, 8.658F, 2.8351F);
        this.basin1.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, 0.203F, -0.0607F, 0.4062F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 175, 165, -1.3431F, -0.2606F, -2.8986F, 2, 6, 8, 0.0F, false));

        this.basin1_r1 = new ModelRenderer(this);
        this.basin1_r1.setRotationPoint(0.0F, 0.6969F, 0.1153F);
        this.basin1.addChild(basin1_r1);
        this.setRotateAngle(basin1_r1, -0.2182F, 0.0F, 0.0F);
        this.basin1_r1.cubeList.add(new ModelBox(basin1_r1, 175, 180, -1.5F, -1.6969F, -0.1153F, 3, 3, 8, 0.003F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.7219F, 7.5672F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.4569F, 0.0784F, -0.0385F);
        this.tail1.cubeList.add(new ModelBox(tail1, 158, 181, -1.0F, -0.886F, -0.9235F, 2, 2, 6, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.386F, 4.8765F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.4649F, 0.4764F, -0.2261F);
        this.tail2.cubeList.add(new ModelBox(tail2, 84, 210, -0.5F, -0.2898F, -0.7177F, 1, 1, 5, 0.0F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(5.8F, 10.5F, 2.9F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, 0.4383F, 0.0F, -0.4098F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 73, 185, -1.0F, -3.0F, -2.0F, 3, 9, 5, 0.0F, false));

        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(-1.1421F, 7.3589F, 0.9737F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 1.0168F, 0.0F, 0.4098F);
        this.leg1.cubeList.add(new ModelBox(leg1, 42, 191, -0.5F, -3.0F, -2.5F, 3, 12, 2, 0.0F, false));
        this.leg1.cubeList.add(new ModelBox(leg1, 103, 196, -0.5F, -3.0F, 0.5F, 3, 12, 2, 0.0F, false));

        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(0.0F, 8.1F, 0.0F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.3927F, 0.0F, 0.0F);
        this.feet1.cubeList.add(new ModelBox(feet1, 123, 136, -2.0F, -2.0F, -7.0F, 6, 4, 10, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-5.8F, 10.5F, 2.9F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.0456F, 0.0F, 0.4098F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 195, 70, -2.0F, -3.0F, -2.0F, 3, 9, 5, 0.0F, false));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(1.1421F, 7.3589F, 0.9737F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 0.3187F, 0.0F, -0.4098F);
        this.leg2.cubeList.add(new ModelBox(leg2, 198, 148, -2.5F, -3.0F, -2.5F, 3, 12, 2, 0.0F, false));
        this.leg2.cubeList.add(new ModelBox(leg2, 73, 200, -2.5F, -3.0F, 0.5F, 3, 12, 2, 0.0F, false));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(0.0F, 8.1F, 0.0F);
        this.leg2.addChild(feet2);
        this.feet2.cubeList.add(new ModelBox(feet2, 53, 151, -4.0F, -2.0F, -7.0F, 6, 4, 10, 0.0F, false));

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
