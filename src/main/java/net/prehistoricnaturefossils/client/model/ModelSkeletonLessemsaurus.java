package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLessemsaurus extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer basin_r4;
    private final ModelRenderer basin_r5;
    private final ModelRenderer basin_r6;
    private final ModelRenderer basin_r7;
    private final ModelRenderer basin_r8;
    private final ModelRenderer basin_r9;
    private final ModelRenderer basin_r10;
    private final ModelRenderer basin_r11;
    private final ModelRenderer basin_r12;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail7_r1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail1_r1;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer tail2_r2;
    private final ModelRenderer tail12_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail15_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer leftleg1;
    private final ModelRenderer upperleg3_r1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftleg4;
    private final ModelRenderer toes22;
    private final ModelRenderer rightleg1;
    private final ModelRenderer upperleg4_r1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightleg4;
    private final ModelRenderer toes2;
    private final ModelRenderer body;
    private final ModelRenderer neck24_r1;
    private final ModelRenderer neck25_r1;
    private final ModelRenderer neck23_r1;
    private final ModelRenderer neck25_r2;
    private final ModelRenderer neck24_r2;
    private final ModelRenderer neck23_r2;
    private final ModelRenderer neck24_r3;
    private final ModelRenderer neck22_r1;
    private final ModelRenderer neck23_r3;
    private final ModelRenderer neck22_r2;
    private final ModelRenderer neck21_r1;
    private final ModelRenderer neck22_r3;
    private final ModelRenderer neck21_r2;
    private final ModelRenderer neck20_r1;
    private final ModelRenderer neck21_r3;
    private final ModelRenderer neck20_r2;
    private final ModelRenderer neck19_r1;
    private final ModelRenderer neck18_r1;
    private final ModelRenderer neck20_r3;
    private final ModelRenderer neck19_r2;
    private final ModelRenderer neck23_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer neck24_r4;
    private final ModelRenderer neck22_r4;
    private final ModelRenderer neck24_r5;
    private final ModelRenderer neck23_r5;
    private final ModelRenderer neck21_r4;
    private final ModelRenderer neck23_r6;
    private final ModelRenderer neck22_r5;
    private final ModelRenderer neck20_r4;
    private final ModelRenderer neck22_r6;
    private final ModelRenderer neck21_r5;
    private final ModelRenderer neck19_r3;
    private final ModelRenderer neck21_r6;
    private final ModelRenderer neck20_r5;
    private final ModelRenderer neck18_r2;
    private final ModelRenderer neck20_r6;
    private final ModelRenderer neck19_r4;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer chest_r6;
    private final ModelRenderer neck19_r5;
    private final ModelRenderer neck18_r3;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r7;
    private final ModelRenderer chest_r8;
    private final ModelRenderer chest_r9;
    private final ModelRenderer neck19_r6;
    private final ModelRenderer neck18_r4;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck18_r5;
    private final ModelRenderer neck17_r3;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck17_r4;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer neck10_r2;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer neck10_r3;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck4;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head4;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw4;
    private final ModelRenderer leftarm1;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftarm3;
    private final ModelRenderer leftarm4;
    private final ModelRenderer thumb1_r1;
    private final ModelRenderer fingers1_r1;
    private final ModelRenderer rightarm1;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightarm3;
    private final ModelRenderer rightarm4;
    private final ModelRenderer thumb2_r1;
    private final ModelRenderer fingers2_r1;

    public ModelSkeletonLessemsaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.1F, 0.0F, 0.0F);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -13.0F, -2.8F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-0.2F, -0.5818F, 15.0303F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0436F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 84, 0, -4.0F, 0.0F, 1.0F, 3, 1, 9, 0.002F, true));
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 17, 70, -5.0F, -0.504F, -0.9109F, 2, 3, 14, 0.0F, true));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-4.0F, 8.2414F, 21.221F);
        this.basin.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -0.2793F, 0.0F, -0.2793F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 87, 105, -0.3206F, -0.1779F, -4.4728F, 2, 12, 2, 0.0F, true));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-0.0429F, 17.9764F, 14.6913F);
        this.basin.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -0.273F, 0.0597F, -0.0693F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 0, 16, -1.441F, -0.0216F, -1.0761F, 2, 3, 3, 0.0F, true));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(-3.306F, 7.2204F, 24.0892F);
        this.basin.addChild(basin_r4);
        this.setRotateAngle(basin_r4, 0.7967F, 0.0017F, -0.135F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 0, 84, 0.791F, 9.6985F, -2.1342F, 2, 4, 3, 0.0F, true));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(-3.306F, 7.2204F, 24.0892F);
        this.basin.addChild(basin_r5);
        this.setRotateAngle(basin_r5, 0.7854F, 0.1509F, -0.2826F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 105, 105, -1.2691F, -0.0256F, -1.1342F, 2, 10, 2, 0.0F, true));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(-4.2F, 1.7414F, 21.221F);
        this.basin.addChild(basin_r6);
        this.setRotateAngle(basin_r6, -0.0436F, 0.0F, -0.1047F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 0, 0, -1.0F, 0.445F, -4.1972F, 2, 6, 9, 0.0F, true));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(-0.1571F, 17.9764F, 14.6913F);
        this.basin.addChild(basin_r7);
        this.setRotateAngle(basin_r7, -0.273F, -0.0597F, 0.0693F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 0, 16, -0.559F, -0.0216F, -1.0761F, 2, 3, 3, 0.0F, false));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(3.8F, 8.2414F, 21.221F);
        this.basin.addChild(basin_r8);
        this.setRotateAngle(basin_r8, -0.2793F, 0.0F, 0.2793F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 87, 105, -1.6794F, -0.1779F, -4.4728F, 2, 12, 2, 0.0F, false));

        this.basin_r9 = new ModelRenderer(this);
        this.basin_r9.setRotationPoint(3.106F, 7.2204F, 24.0892F);
        this.basin.addChild(basin_r9);
        this.setRotateAngle(basin_r9, 0.7967F, -0.0017F, 0.135F);
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 0, 84, -2.791F, 9.6985F, -2.1342F, 2, 4, 3, 0.0F, false));

        this.basin_r10 = new ModelRenderer(this);
        this.basin_r10.setRotationPoint(3.106F, 7.2204F, 24.0892F);
        this.basin.addChild(basin_r10);
        this.setRotateAngle(basin_r10, 0.7854F, -0.1509F, 0.2826F);
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 105, 105, -0.7309F, -0.0256F, -1.1342F, 2, 10, 2, 0.0F, false));

        this.basin_r11 = new ModelRenderer(this);
        this.basin_r11.setRotationPoint(4.0F, 1.7414F, 21.221F);
        this.basin.addChild(basin_r11);
        this.setRotateAngle(basin_r11, -0.0436F, 0.0F, 0.1047F);
        this.basin_r11.cubeList.add(new ModelBox(basin_r11, 0, 0, -1.0F, 0.445F, -4.1972F, 2, 6, 9, 0.0F, false));

        this.basin_r12 = new ModelRenderer(this);
        this.basin_r12.setRotationPoint(0.0F, -0.5818F, 15.0303F);
        this.basin.addChild(basin_r12);
        this.setRotateAngle(basin_r12, -0.0436F, 0.0F, 0.0F);
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 17, 70, 3.0F, -0.504F, -0.9109F, 2, 3, 14, 0.0F, false));
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 84, 0, 1.0F, 0.0F, 1.0F, 3, 1, 9, 0.002F, false));
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 0, 30, -1.0F, -1.5F, 0.0F, 2, 3, 11, 0.002F, false));

        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.1F, -1.5161F, 22.074F);
        this.basin.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.0349F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 59, 64, 0.0F, -2.0962F, -1.0732F, 0, 2, 2, 0.0F, false));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-0.1F, -1.7347F, 18.0854F);
        this.basin.addChild(chest_r2);
        this.setRotateAngle(chest_r2, -0.0698F, 0.0F, 0.0F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 36, 79, 0.0F, -1.9956F, -1.0836F, 0, 2, 2, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.3796F, 26.0346F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.0463F, 0.1744F, -0.008F);


        this.tail7_r1 = new ModelRenderer(this);
        this.tail7_r1.setRotationPoint(-0.1F, 2.7597F, 8.0065F);
        this.tail1.addChild(tail7_r1);
        this.setRotateAngle(tail7_r1, 0.4887F, 0.0F, 0.0F);
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 63, 41, 0.0F, 5.8325F, 9.4625F, 0, 5, 2, 0.0F, false));
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 43, 64, 0.0F, 3.8227F, 5.9681F, 0, 6, 2, 0.0F, false));
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 71, 23, 0.0F, 1.8129F, 2.4737F, 0, 5, 2, 0.0F, false));
        this.tail7_r1.cubeList.add(new ModelBox(tail7_r1, 74, 29, 0.0F, -0.3812F, -0.9432F, 0, 5, 2, 0.0F, false));

        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(-0.1F, 2.3451F, 3.7511F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, 0.4538F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 18, 104, 0.0F, -0.2168F, -0.7917F, 0, 3, 2, 0.0F, false));

        this.tail1_r1 = new ModelRenderer(this);
        this.tail1_r1.setRotationPoint(-0.1F, 0.2913F, -1.0089F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.0698F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 35, 30, -1.0F, -1.5F, 0.1F, 2, 3, 23, 0.0F, false));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-0.1F, -1.143F, 3.9348F);
        this.tail1.addChild(chest_r3);
        this.setRotateAngle(chest_r3, -0.1047F, 0.0F, 0.0F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 11, 16, 0.0F, -1.8239F, 15.1316F, 0, 2, 2, 0.0F, false));
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 17, 16, 0.0F, -1.8239F, 11.1316F, 0, 2, 2, 0.0F, false));
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 35, 44, 0.0F, -1.8239F, 7.1316F, 0, 2, 2, 0.0F, false));
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 48, 0, 0.0F, -1.8239F, 3.1316F, 0, 2, 2, 0.0F, false));
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 60, 0, 0.0F, -1.5239F, -0.8684F, 0, 2, 2, 0.0F, false));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-0.1F, -1.143F, -3.8652F);
        this.tail1.addChild(chest_r4);
        this.setRotateAngle(chest_r4, -0.0349F, 0.0F, 0.0F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 49, 64, 0.0F, -1.6962F, 2.9268F, 0, 2, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.6913F, 20.7911F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0467F, 0.2179F, -0.0101F);


        this.tail2_r2 = new ModelRenderer(this);
        this.tail2_r2.setRotationPoint(0.0F, 0.1F, 0.5F);
        this.tail2.addChild(tail2_r2);
        this.setRotateAngle(tail2_r2, 0.0349F, 0.0F, 0.0F);
        this.tail2_r2.cubeList.add(new ModelBox(tail2_r2, 42, 57, -1.1F, -1.5F, -0.5F, 2, 3, 23, 0.002F, false));

        this.tail12_r1 = new ModelRenderer(this);
        this.tail12_r1.setRotationPoint(-0.1F, 1.0684F, -12.7846F);
        this.tail2.addChild(tail12_r1);
        this.setRotateAngle(tail12_r1, 0.4887F, 0.0F, 0.0F);
        this.tail12_r1.cubeList.add(new ModelBox(tail12_r1, 63, 10, 0.0F, 13.5924F, 28.6732F, 0, 3, 2, 0.0F, false));
        this.tail12_r1.cubeList.add(new ModelBox(tail12_r1, 79, 57, 0.0F, 11.307F, 24.8841F, 0, 4, 2, 0.0F, false));
        this.tail12_r1.cubeList.add(new ModelBox(tail12_r1, 79, 64, 0.0F, 10.2094F, 21.0259F, 0, 4, 2, 0.0F, false));
        this.tail12_r1.cubeList.add(new ModelBox(tail12_r1, 88, 41, 0.0F, 8.8301F, 17.2712F, 0, 4, 2, 0.0F, false));
        this.tail12_r1.cubeList.add(new ModelBox(tail12_r1, 36, 95, 0.0F, 7.8264F, 13.3786F, 0, 4, 2, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.1471F, 22.8489F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0467F, 0.2179F, 0.0101F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(-0.1F, 0.1988F, -0.0681F);
        this.tail3.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0175F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 48, 0, -0.5F, -1.0F, -1.0F, 1, 2, 20, 0.0F, false));

        this.tail15_r1 = new ModelRenderer(this);
        this.tail15_r1.setRotationPoint(-0.1F, 2.1672F, -35.6527F);
        this.tail3.addChild(tail15_r1);
        this.setRotateAngle(tail15_r1, 0.4887F, 0.0F, 0.0F);
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 27, 39, 0.0F, 19.0691F, 39.8039F, 0, 2, 1, 0.0F, false));
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 27, 43, 0.0F, 17.5204F, 36.1159F, 0, 2, 1, 0.0F, false));
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 48, 12, 0.0F, 15.9716F, 32.4279F, 0, 2, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2968F, 18.4773F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0986F, -0.391F, 0.0377F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 0.1083F, 0.0094F);
        this.tail4.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0873F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 63, 23, -0.5F, -0.5F, -0.1F, 1, 1, 16, -0.003F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(5.2F, 4.3716F, 21.7748F);
        this.basin.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.8006F, 0.0F, -0.0873F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 23, 88, -0.4207F, -0.4339F, -1.2833F, 2, 16, 4, 0.0F, false));

        this.upperleg3_r1 = new ModelRenderer(this);
        this.upperleg3_r1.setRotationPoint(1.0793F, 3.4661F, 0.2167F);
        this.leftleg1.addChild(upperleg3_r1);
        this.setRotateAngle(upperleg3_r1, 0.5411F, 0.0F, 0.0F);
        this.upperleg3_r1.cubeList.add(new ModelBox(upperleg3_r1, 47, 30, -1.5957F, 0.2225F, -0.5071F, 2, 4, 3, -0.004F, false));

        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0354F, 14.1715F, 0.7956F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.3032F, 0.0F, 0.0436F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 9, 106, -0.5065F, -0.4866F, -2.5809F, 2, 10, 2, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 71, 0, -0.5065F, -0.4866F, -0.1809F, 2, 10, 1, 0.0F, false));

        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(1.0672F, 9.1502F, 0.3786F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.33F, 0.0F, 0.0436F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 17, 64, -1.6226F, 0.262F, -2.4809F, 2, 9, 3, 0.0F, false));

        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.545F, 7.975F, -1.7054F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.5655F, 0.0024F, -0.0124F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 82, 29, -2.5F, -0.855F, -3.2673F, 5, 3, 5, 0.0F, false));

        this.toes22 = new ModelRenderer(this);
        this.toes22.setRotationPoint(0.0F, 0.2F, -3.1673F);
        this.leftleg4.addChild(toes22);
        this.setRotateAngle(toes22, -0.1745F, 0.0F, 0.0F);
        this.toes22.cubeList.add(new ModelBox(toes22, 0, 98, -2.5F, -1.055F, -3.0F, 5, 3, 4, -0.01F, false));

        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-5.4F, 4.3716F, 21.7748F);
        this.basin.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.0152F, 0.0F, 0.0873F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 46, 84, -1.5793F, -0.4339F, -1.2833F, 2, 16, 4, 0.0F, false));

        this.upperleg4_r1 = new ModelRenderer(this);
        this.upperleg4_r1.setRotationPoint(-1.0793F, 3.4661F, 0.2167F);
        this.rightleg1.addChild(upperleg4_r1);
        this.setRotateAngle(upperleg4_r1, 0.5411F, 0.0F, 0.0F);
        this.upperleg4_r1.cubeList.add(new ModelBox(upperleg4_r1, 0, 45, -0.4043F, 0.2225F, -0.5071F, 2, 4, 3, -0.004F, false));

        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0556F, 15.4834F, 0.2754F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6924F, 0.0F, -0.0436F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 70, 57, -1.5272F, -0.882F, -1.2235F, 2, 10, 2, 0.0F, false));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 36, 64, -1.5272F, -0.882F, 1.1765F, 2, 10, 1, 0.0F, false));

        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.1022F, 8.707F, 1.7468F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.7227F, 0.0F, -0.0436F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 64, -1.3773F, 0.2715F, -2.4876F, 2, 9, 3, 0.0F, false));

        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.455F, 7.9845F, -1.7121F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.1292F, -0.0024F, 0.0124F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 35, 44, -2.5F, -0.855F, -3.2673F, 5, 3, 5, 0.0F, false));

        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 0.2F, -3.1673F);
        this.rightleg4.addChild(toes2);
        this.toes2.cubeList.add(new ModelBox(toes2, 48, 12, -2.5F, -1.055F, -3.0F, 5, 3, 4, -0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.15F, 15.4351F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 87, 15, -0.1F, -2.9771F, -29.6964F, 0, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 115, 35, -0.1F, -3.5771F, -25.8964F, 0, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 115, -0.1F, -3.6771F, -21.8964F, 0, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 114, 110, -0.1F, -3.4771F, -17.8964F, 0, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 114, 104, -0.1F, -3.3771F, -13.8964F, 0, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 37, 107, -0.1F, -3.2771F, -9.8964F, 0, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 30, -1.0F, -1.0771F, -29.5964F, 2, 3, 30, 0.0F, false));

        this.neck24_r1 = new ModelRenderer(this);
        this.neck24_r1.setRotationPoint(-1.2058F, 1.2488F, -5.1336F);
        this.body.addChild(neck24_r1);
        this.setRotateAngle(neck24_r1, -1.6131F, 0.1267F, 1.0737F);
        this.neck24_r1.cubeList.add(new ModelBox(neck24_r1, 84, 0, -0.1958F, -1.2521F, -0.1536F, 0, 2, 4, 0.0F, true));

        this.neck25_r1 = new ModelRenderer(this);
        this.neck25_r1.setRotationPoint(-1.2058F, 1.2488F, -5.1336F);
        this.body.addChild(neck25_r1);
        this.setRotateAngle(neck25_r1, -1.6847F, 0.0699F, 0.3743F);
        this.neck25_r1.cubeList.add(new ModelBox(neck25_r1, 70, 84, -2.5859F, -1.2521F, 2.8597F, 0, 2, 3, 0.0F, true));

        this.neck23_r1 = new ModelRenderer(this);
        this.neck23_r1.setRotationPoint(-5.7844F, 5.5339F, -12.2944F);
        this.body.addChild(neck23_r1);
        this.setRotateAngle(neck23_r1, -1.5247F, 0.0158F, 0.1625F);
        this.neck23_r1.cubeList.add(new ModelBox(neck23_r1, 102, 61, 0.0179F, -0.7272F, -0.0041F, 0, 2, 6, 0.0F, true));

        this.neck25_r2 = new ModelRenderer(this);
        this.neck25_r2.setRotationPoint(-5.7285F, 5.4555F, -8.9514F);
        this.body.addChild(neck25_r2);
        this.setRotateAngle(neck25_r2, -1.6121F, 0.0281F, 0.1169F);
        this.neck25_r2.cubeList.add(new ModelBox(neck25_r2, 63, 30, -0.0381F, -0.9844F, 0.0226F, 0, 2, 3, 0.0F, true));

        this.neck24_r2 = new ModelRenderer(this);
        this.neck24_r2.setRotationPoint(-1.2058F, 1.0666F, -9.1294F);
        this.body.addChild(neck24_r2);
        this.setRotateAngle(neck24_r2, -1.6034F, 0.0378F, 0.3786F);
        this.neck24_r2.cubeList.add(new ModelBox(neck24_r2, 87, 55, -2.6229F, -1.2522F, 2.7668F, 0, 2, 3, 0.0F, true));

        this.neck23_r2 = new ModelRenderer(this);
        this.neck23_r2.setRotationPoint(-1.2058F, 1.0666F, -9.1294F);
        this.body.addChild(neck23_r2);
        this.setRotateAngle(neck23_r2, -1.5714F, 0.05F, 1.0774F);
        this.neck23_r2.cubeList.add(new ModelBox(neck23_r2, 59, 84, -0.2839F, -1.2522F, -0.2009F, 0, 2, 4, 0.0F, true));

        this.neck24_r3 = new ModelRenderer(this);
        this.neck24_r3.setRotationPoint(-1.2058F, 0.8845F, -13.1253F);
        this.body.addChild(neck24_r3);
        this.setRotateAngle(neck24_r3, -1.5223F, 0.0055F, 0.3804F);
        this.neck24_r3.cubeList.add(new ModelBox(neck24_r3, 28, 64, -2.5117F, -1.2518F, 3.0454F, 0, 2, 3, 0.0F, true));

        this.neck22_r1 = new ModelRenderer(this);
        this.neck22_r1.setRotationPoint(-1.2058F, 0.8845F, -13.1253F);
        this.body.addChild(neck22_r1);
        this.setRotateAngle(neck22_r1, -1.5301F, -0.0269F, 1.0778F);
        this.neck22_r1.cubeList.add(new ModelBox(neck22_r1, 36, 88, -0.0196F, -1.2518F, -0.059F, 0, 2, 4, 0.0F, true));

        this.neck23_r3 = new ModelRenderer(this);
        this.neck23_r3.setRotationPoint(-6.0962F, 6.1779F, -15.5242F);
        this.body.addChild(neck23_r3);
        this.setRotateAngle(neck23_r3, -1.4734F, 0.0116F, 0.1196F);
        this.neck23_r3.cubeList.add(new ModelBox(neck23_r3, 59, 84, -0.025F, -0.2964F, 0.0204F, 0, 2, 10, 0.0F, true));

        this.neck22_r2 = new ModelRenderer(this);
        this.neck22_r2.setRotationPoint(-1.2058F, 0.7023F, -17.1211F);
        this.body.addChild(neck22_r2);
        this.setRotateAngle(neck22_r2, -1.4737F, -0.0139F, 0.3802F);
        this.neck22_r2.cubeList.add(new ModelBox(neck22_r2, 77, 106, -2.5117F, -1.2518F, 3.0454F, 0, 2, 4, 0.0F, true));

        this.neck21_r1 = new ModelRenderer(this);
        this.neck21_r1.setRotationPoint(-1.2058F, 0.7023F, -17.1211F);
        this.body.addChild(neck21_r1);
        this.setRotateAngle(neck21_r1, -1.5053F, -0.073F, 1.0766F);
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 110, 97, -0.0196F, -1.2518F, -0.059F, 0, 2, 4, 0.0F, true));

        this.neck22_r3 = new ModelRenderer(this);
        this.neck22_r3.setRotationPoint(-1.1652F, 0.4072F, -20.4372F);
        this.body.addChild(neck22_r3);
        this.setRotateAngle(neck22_r3, -1.4213F, -0.0011F, 0.1632F);
        this.neck22_r3.cubeList.add(new ModelBox(neck22_r3, 35, 30, -4.2269F, -0.5621F, 7.3419F, 0, 2, 11, 0.0F, true));

        this.neck21_r2 = new ModelRenderer(this);
        this.neck21_r2.setRotationPoint(-1.1652F, 0.4072F, -20.4372F);
        this.body.addChild(neck21_r2);
        this.setRotateAngle(neck21_r2, -1.4251F, -0.0334F, 0.379F);
        this.neck21_r2.cubeList.add(new ModelBox(neck21_r2, 108, 20, -2.5303F, -0.5621F, 3.0655F, 0, 2, 5, 0.0F, true));

        this.neck20_r1 = new ModelRenderer(this);
        this.neck20_r1.setRotationPoint(-1.1652F, 0.4072F, -20.4372F);
        this.body.addChild(neck20_r1);
        this.setRotateAngle(neck20_r1, -1.4803F, -0.1191F, 1.0742F);
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 39, 111, -0.0209F, -0.5621F, -0.0317F, 0, 2, 4, 0.0F, true));

        this.neck21_r3 = new ModelRenderer(this);
        this.neck21_r3.setRotationPoint(-1.2041F, 0.4716F, -24.8554F);
        this.body.addChild(neck21_r3);
        this.setRotateAngle(neck21_r3, -1.3697F, -0.0096F, 0.2153F);
        this.neck21_r3.cubeList.add(new ModelBox(neck21_r3, 36, 64, -4.1904F, -0.9763F, 7.3666F, 0, 2, 12, 0.0F, true));

        this.neck20_r2 = new ModelRenderer(this);
        this.neck20_r2.setRotationPoint(-1.2041F, 0.4716F, -24.8554F);
        this.body.addChild(neck20_r2);
        this.setRotateAngle(neck20_r2, -1.3764F, -0.0527F, 0.4293F);
        this.neck20_r2.cubeList.add(new ModelBox(neck20_r2, 55, 108, -2.5011F, -0.9763F, 3.0596F, 0, 2, 5, 0.0F, true));

        this.neck19_r1 = new ModelRenderer(this);
        this.neck19_r1.setRotationPoint(-1.2041F, 0.4716F, -24.8554F);
        this.body.addChild(neck19_r1);
        this.setRotateAngle(neck19_r1, -1.455F, -0.1651F, 1.123F);
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 112, 45, -0.0023F, -0.9763F, -0.055F, 0, 2, 4, 0.0F, true));

        this.neck18_r1 = new ModelRenderer(this);
        this.neck18_r1.setRotationPoint(-1.1963F, 0.6224F, -28.5376F);
        this.body.addChild(neck18_r1);
        this.setRotateAngle(neck18_r1, -1.4207F, -0.2263F, 1.1512F);
        this.neck18_r1.cubeList.add(new ModelBox(neck18_r1, 113, 4, 0.0359F, -0.6027F, -0.0353F, 0, 2, 4, 0.0F, true));

        this.neck20_r3 = new ModelRenderer(this);
        this.neck20_r3.setRotationPoint(-1.1963F, 0.6224F, -28.5376F);
        this.body.addChild(neck20_r3);
        this.setRotateAngle(neck20_r3, -1.3008F, -0.0209F, 0.2492F);
        this.neck20_r3.cubeList.add(new ModelBox(neck20_r3, 71, 0, -4.1748F, -0.6027F, 7.3599F, 0, 2, 12, 0.0F, true));

        this.neck19_r2 = new ModelRenderer(this);
        this.neck19_r2.setRotationPoint(-1.1963F, 0.6224F, -28.5376F);
        this.body.addChild(neck19_r2);
        this.setRotateAngle(neck19_r2, -1.3113F, -0.0782F, 0.4599F);
        this.neck19_r2.cubeList.add(new ModelBox(neck19_r2, 18, 109, -2.4844F, -0.6027F, 3.0992F, 0, 2, 5, 0.0F, true));

        this.neck23_r4 = new ModelRenderer(this);
        this.neck23_r4.setRotationPoint(1.0058F, 1.2488F, -5.1336F);
        this.body.addChild(neck23_r4);
        this.setRotateAngle(neck23_r4, -1.6131F, -0.1267F, -1.0737F);
        this.neck23_r4.cubeList.add(new ModelBox(neck23_r4, 84, 0, 0.1958F, -1.2521F, -0.1536F, 0, 2, 4, 0.0F, false));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-0.1F, -1.2771F, -4.8964F);
        this.body.addChild(chest_r5);
        this.setRotateAngle(chest_r5, -0.1047F, 0.0F, 0.0F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 82, 15, 0.0F, -1.8F, 3.0F, 0, 2, 2, 0.0F, false));
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 82, 29, 0.0F, -1.6F, -1.0F, 0, 2, 2, 0.0F, false));

        this.neck24_r4 = new ModelRenderer(this);
        this.neck24_r4.setRotationPoint(1.0058F, 1.2488F, -5.1336F);
        this.body.addChild(neck24_r4);
        this.setRotateAngle(neck24_r4, -1.6847F, -0.0699F, -0.3743F);
        this.neck24_r4.cubeList.add(new ModelBox(neck24_r4, 70, 84, 2.5859F, -1.2521F, 2.8597F, 0, 2, 3, 0.0F, false));

        this.neck22_r4 = new ModelRenderer(this);
        this.neck22_r4.setRotationPoint(1.0058F, 1.0666F, -9.1294F);
        this.body.addChild(neck22_r4);
        this.setRotateAngle(neck22_r4, -1.5714F, -0.05F, -1.0774F);
        this.neck22_r4.cubeList.add(new ModelBox(neck22_r4, 59, 84, 0.2839F, -1.2522F, -0.2009F, 0, 2, 4, 0.0F, false));

        this.neck24_r5 = new ModelRenderer(this);
        this.neck24_r5.setRotationPoint(5.5285F, 5.4555F, -8.9514F);
        this.body.addChild(neck24_r5);
        this.setRotateAngle(neck24_r5, -1.6121F, -0.0281F, -0.1169F);
        this.neck24_r5.cubeList.add(new ModelBox(neck24_r5, 63, 30, 0.0381F, -0.9844F, 0.0226F, 0, 2, 3, 0.0F, false));

        this.neck23_r5 = new ModelRenderer(this);
        this.neck23_r5.setRotationPoint(1.0058F, 1.0666F, -9.1294F);
        this.body.addChild(neck23_r5);
        this.setRotateAngle(neck23_r5, -1.6034F, -0.0378F, -0.3786F);
        this.neck23_r5.cubeList.add(new ModelBox(neck23_r5, 87, 55, 2.6229F, -1.2522F, 2.7668F, 0, 2, 3, 0.0F, false));

        this.neck21_r4 = new ModelRenderer(this);
        this.neck21_r4.setRotationPoint(1.0058F, 0.8845F, -13.1253F);
        this.body.addChild(neck21_r4);
        this.setRotateAngle(neck21_r4, -1.5301F, 0.0269F, -1.0778F);
        this.neck21_r4.cubeList.add(new ModelBox(neck21_r4, 36, 88, 0.0196F, -1.2518F, -0.059F, 0, 2, 4, 0.0F, false));

        this.neck23_r6 = new ModelRenderer(this);
        this.neck23_r6.setRotationPoint(1.0058F, 0.8845F, -13.1253F);
        this.body.addChild(neck23_r6);
        this.setRotateAngle(neck23_r6, -1.5223F, -0.0055F, -0.3804F);
        this.neck23_r6.cubeList.add(new ModelBox(neck23_r6, 28, 64, 2.5117F, -1.2518F, 3.0454F, 0, 2, 3, 0.0F, false));

        this.neck22_r5 = new ModelRenderer(this);
        this.neck22_r5.setRotationPoint(5.5844F, 5.5339F, -12.2944F);
        this.body.addChild(neck22_r5);
        this.setRotateAngle(neck22_r5, -1.5247F, -0.0158F, -0.1625F);
        this.neck22_r5.cubeList.add(new ModelBox(neck22_r5, 102, 61, -0.0179F, -0.7272F, -0.0041F, 0, 2, 6, 0.0F, false));

        this.neck20_r4 = new ModelRenderer(this);
        this.neck20_r4.setRotationPoint(1.0058F, 0.7023F, -17.1211F);
        this.body.addChild(neck20_r4);
        this.setRotateAngle(neck20_r4, -1.5053F, 0.073F, -1.0766F);
        this.neck20_r4.cubeList.add(new ModelBox(neck20_r4, 110, 97, 0.0196F, -1.2518F, -0.059F, 0, 2, 4, 0.0F, false));

        this.neck22_r6 = new ModelRenderer(this);
        this.neck22_r6.setRotationPoint(5.8962F, 6.1779F, -15.5242F);
        this.body.addChild(neck22_r6);
        this.setRotateAngle(neck22_r6, -1.4734F, -0.0116F, -0.1196F);
        this.neck22_r6.cubeList.add(new ModelBox(neck22_r6, 59, 84, 0.025F, -0.2964F, 0.0204F, 0, 2, 10, 0.0F, false));

        this.neck21_r5 = new ModelRenderer(this);
        this.neck21_r5.setRotationPoint(1.0058F, 0.7023F, -17.1211F);
        this.body.addChild(neck21_r5);
        this.setRotateAngle(neck21_r5, -1.4737F, 0.0139F, -0.3802F);
        this.neck21_r5.cubeList.add(new ModelBox(neck21_r5, 77, 106, 2.5117F, -1.2518F, 3.0454F, 0, 2, 4, 0.0F, false));

        this.neck19_r3 = new ModelRenderer(this);
        this.neck19_r3.setRotationPoint(0.9652F, 0.4072F, -20.4372F);
        this.body.addChild(neck19_r3);
        this.setRotateAngle(neck19_r3, -1.4803F, 0.1191F, -1.0742F);
        this.neck19_r3.cubeList.add(new ModelBox(neck19_r3, 39, 111, 0.0209F, -0.5621F, -0.0317F, 0, 2, 4, 0.0F, false));

        this.neck21_r6 = new ModelRenderer(this);
        this.neck21_r6.setRotationPoint(0.9652F, 0.4072F, -20.4372F);
        this.body.addChild(neck21_r6);
        this.setRotateAngle(neck21_r6, -1.4213F, 0.0011F, -0.1632F);
        this.neck21_r6.cubeList.add(new ModelBox(neck21_r6, 35, 30, 4.2269F, -0.5621F, 7.3419F, 0, 2, 11, 0.0F, false));

        this.neck20_r5 = new ModelRenderer(this);
        this.neck20_r5.setRotationPoint(0.9652F, 0.4072F, -20.4372F);
        this.body.addChild(neck20_r5);
        this.setRotateAngle(neck20_r5, -1.4251F, 0.0334F, -0.379F);
        this.neck20_r5.cubeList.add(new ModelBox(neck20_r5, 108, 20, 2.5303F, -0.5621F, 3.0655F, 0, 2, 5, 0.0F, false));

        this.neck18_r2 = new ModelRenderer(this);
        this.neck18_r2.setRotationPoint(1.0041F, 0.4716F, -24.8554F);
        this.body.addChild(neck18_r2);
        this.setRotateAngle(neck18_r2, -1.455F, 0.1651F, -1.123F);
        this.neck18_r2.cubeList.add(new ModelBox(neck18_r2, 112, 45, 0.0023F, -0.9763F, -0.055F, 0, 2, 4, 0.0F, false));

        this.neck20_r6 = new ModelRenderer(this);
        this.neck20_r6.setRotationPoint(1.0041F, 0.4716F, -24.8554F);
        this.body.addChild(neck20_r6);
        this.setRotateAngle(neck20_r6, -1.3697F, 0.0096F, -0.2153F);
        this.neck20_r6.cubeList.add(new ModelBox(neck20_r6, 36, 64, 4.1904F, -0.9763F, 7.3666F, 0, 2, 12, 0.0F, false));

        this.neck19_r4 = new ModelRenderer(this);
        this.neck19_r4.setRotationPoint(1.0041F, 0.4716F, -24.8554F);
        this.body.addChild(neck19_r4);
        this.setRotateAngle(neck19_r4, -1.3764F, 0.0527F, -0.4293F);
        this.neck19_r4.cubeList.add(new ModelBox(neck19_r4, 55, 108, 2.5011F, -0.9763F, 3.0596F, 0, 2, 5, 0.0F, false));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(0.9963F, 0.6224F, -28.5376F);
        this.body.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, -1.4207F, 0.2263F, -1.1512F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 113, 4, -0.0359F, -0.6027F, -0.0353F, 0, 2, 4, 0.0F, false));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-0.1F, 18.8757F, -27.076F);
        this.body.addChild(chest_r6);
        this.setRotateAngle(chest_r6, -0.0785F, 0.0F, 0.0F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 0, 0, -6.0F, -4.7278F, -0.0699F, 12, 6, 23, 0.0F, false));

        this.neck19_r5 = new ModelRenderer(this);
        this.neck19_r5.setRotationPoint(0.9963F, 0.6224F, -28.5376F);
        this.body.addChild(neck19_r5);
        this.setRotateAngle(neck19_r5, -1.3008F, 0.0209F, -0.2492F);
        this.neck19_r5.cubeList.add(new ModelBox(neck19_r5, 71, 0, 4.1748F, -0.6027F, 7.3599F, 0, 2, 12, 0.0F, false));

        this.neck18_r3 = new ModelRenderer(this);
        this.neck18_r3.setRotationPoint(0.9963F, 0.6224F, -28.5376F);
        this.body.addChild(neck18_r3);
        this.setRotateAngle(neck18_r3, -1.3113F, 0.0782F, -0.4599F);
        this.neck18_r3.cubeList.add(new ModelBox(neck18_r3, 18, 109, 2.4844F, -0.6027F, 3.0992F, 0, 2, 5, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.2247F, -29.1145F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0925F, 0.1738F, 0.016F);
        this.chest.cubeList.add(new ModelBox(chest, 87, 55, -1.1F, -1.2168F, -8.2452F, 2, 3, 8, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 78, 8, -0.1F, -2.2168F, -8.2452F, 0, 1, 2, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 96, 91, -0.1F, -2.7168F, -4.5452F, 0, 2, 2, 0.0F, false));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(-5.6F, 1.7832F, -0.7452F);
        this.chest.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 0.7671F, -0.0207F, 0.3386F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 97, 11, -0.5F, -2.0F, -14.5F, 8, 7, 1, 0.0F, false));
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 0, 64, -0.5F, -2.0F, -13.5F, 1, 5, 14, 0.0F, false));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(5.4F, 1.7832F, -0.7452F);
        this.chest.addChild(chest_r8);
        this.setRotateAngle(chest_r8, 0.7671F, 0.0207F, -0.3386F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 97, 40, -7.5F, -2.0F, -14.5F, 8, 7, 1, 0.0F, false));
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 70, 57, -0.5F, -2.0F, -13.5F, 1, 5, 14, 0.0F, false));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(-0.1F, 16.8832F, -7.2452F);
        this.chest.addChild(chest_r9);
        this.setRotateAngle(chest_r9, -0.3491F, 0.0F, 0.0F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 63, 41, -4.0F, -1.5F, 0.0F, 8, 2, 8, 0.0F, false));

        this.neck19_r6 = new ModelRenderer(this);
        this.neck19_r6.setRotationPoint(-1.048F, 0.4682F, -4.0586F);
        this.chest.addChild(neck19_r6);
        this.setRotateAngle(neck19_r6, -1.3348F, -0.0051F, 0.1724F);
        this.neck19_r6.cubeList.add(new ModelBox(neck19_r6, 0, 84, -4.6712F, -1.0584F, 7.1895F, 0, 2, 11, 0.0F, true));

        this.neck18_r4 = new ModelRenderer(this);
        this.neck18_r4.setRotationPoint(-1.048F, 0.4682F, -4.0586F);
        this.chest.addChild(neck18_r4);
        this.setRotateAngle(neck18_r4, -1.3439F, -0.0655F, 0.4274F);
        this.neck18_r4.cubeList.add(new ModelBox(neck18_r4, 109, 59, -2.638F, -1.0584F, 3.1429F, 0, 2, 5, 0.0F, true));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-1.048F, 0.4682F, -4.0586F);
        this.chest.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, -1.438F, -0.1957F, 1.1199F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 25, 113, -0.0537F, -1.0584F, 0.0969F, 0, 2, 4, 0.0F, true));

        this.neck18_r5 = new ModelRenderer(this);
        this.neck18_r5.setRotationPoint(0.848F, 0.4682F, -4.0586F);
        this.chest.addChild(neck18_r5);
        this.setRotateAngle(neck18_r5, -1.3348F, 0.0051F, -0.1724F);
        this.neck18_r5.cubeList.add(new ModelBox(neck18_r5, 0, 84, 4.6712F, -1.0584F, 7.1895F, 0, 2, 11, 0.0F, false));

        this.neck17_r3 = new ModelRenderer(this);
        this.neck17_r3.setRotationPoint(0.848F, 0.4682F, -4.0586F);
        this.chest.addChild(neck17_r3);
        this.setRotateAngle(neck17_r3, -1.3439F, 0.0655F, -0.4274F);
        this.neck17_r3.cubeList.add(new ModelBox(neck17_r3, 109, 59, 2.638F, -1.0584F, 3.1429F, 0, 2, 5, 0.0F, false));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(0.848F, 0.4682F, -4.0586F);
        this.chest.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, -1.438F, 0.1957F, -1.1199F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 25, 113, 0.0537F, -1.0584F, 0.0969F, 0, 2, 4, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0628F, -7.5275F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5937F, 0.3867F, 0.1033F);


        this.neck17_r4 = new ModelRenderer(this);
        this.neck17_r4.setRotationPoint(-1.1058F, 1.0659F, -0.436F);
        this.neck1.addChild(neck17_r4);
        this.setRotateAngle(neck17_r4, -0.8274F, -0.0771F, 0.2482F);
        this.neck17_r4.cubeList.add(new ModelBox(neck17_r4, 86, 42, -2.5762F, -1.3461F, 3.0222F, 0, 2, 10, 0.0F, true));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-1.1058F, 1.0659F, -0.436F);
        this.neck1.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, -1.0038F, -0.5152F, 0.8232F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 113, 28, -0.0839F, -1.3461F, -0.0353F, 0, 2, 4, 0.0F, true));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(-3.4058F, 3.1388F, -4.1553F);
        this.neck1.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, -0.5888F, -0.6376F, 0.1159F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 48, 113, 1.7599F, -1.0945F, -1.3944F, 0, 2, 4, 0.0F, true));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(-3.4058F, 3.1388F, -4.1553F);
        this.neck1.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, -0.5189F, -0.4518F, -0.0181F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 72, 95, 1.1475F, -1.0945F, 2.9261F, 0, 2, 8, 0.0F, true));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-0.3453F, 4.1945F, -6.8247F);
        this.neck1.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, -0.3918F, -0.2278F, -0.0752F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 47, 105, -1.6692F, -0.796F, 3.9097F, 0, 1, 6, 0.0F, true));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-0.3453F, 4.1945F, -6.8247F);
        this.neck1.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, -0.4213F, -0.4283F, 0.0158F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 111, 85, -0.7771F, -0.796F, 0.1756F, 0, 1, 4, 0.0F, true));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(0.9058F, 1.0659F, -0.436F);
        this.neck1.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, -1.0038F, 0.5152F, -0.8232F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 113, 28, 0.0839F, -1.3461F, -0.0353F, 0, 2, 4, 0.0F, false));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(0.9058F, 1.0659F, -0.436F);
        this.neck1.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, -0.8274F, 0.0771F, -0.2482F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 86, 42, 2.5762F, -1.3461F, 3.0222F, 0, 2, 10, 0.0F, false));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(3.2058F, 3.1388F, -4.1553F);
        this.neck1.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, -0.5888F, 0.6376F, -0.1159F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 48, 113, -1.7599F, -1.0945F, -1.3944F, 0, 2, 4, 0.0F, false));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(3.2058F, 3.1388F, -4.1553F);
        this.neck1.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, -0.5189F, 0.4518F, 0.0181F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 72, 95, -1.1475F, -1.0945F, 2.9261F, 0, 2, 8, 0.0F, false));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(3.2058F, 5.4461F, -4.074F);
        this.neck1.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, -0.3738F, 0.4453F, 0.0812F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 47, 105, 0.0093F, -0.324F, -0.0301F, 0, 1, 6, 0.0F, false));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(1.0058F, 4.2764F, -7.0408F);
        this.neck1.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, -0.4256F, 0.6464F, -0.018F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 111, 85, -0.0387F, -0.7424F, -0.1788F, 0, 1, 4, 0.0F, false));

        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 3.5513F, -9.0044F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.3491F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 82, 15, -1.1F, -1.4544F, -0.2791F, 2, 3, 10, 0.03F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.1F, 3.3354F, -9.259F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2318F, 0.5054F, 0.2042F);


        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-1.059F, 1.0924F, -0.1932F);
        this.neck2.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, -0.0652F, -0.5598F, -0.0036F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 77, 113, -1.4157F, -0.3433F, 5.8441F, 0, 1, 4, 0.0F, true));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(-1.059F, 1.0924F, -0.1932F);
        this.neck2.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, -0.0811F, -0.8209F, 0.0211F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 30, 107, 0.1118F, -0.3433F, 0.0145F, 0, 1, 6, 0.0F, true));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(-1.1058F, 1.7775F, -3.3502F);
        this.neck2.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, -0.0592F, -0.5178F, 0.074F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 93, 95, 0.1125F, -0.398F, 0.1026F, 0, 1, 8, 0.0F, true));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-1.1058F, 1.6116F, -6.8973F);
        this.neck2.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, -0.1855F, -0.3435F, 0.0631F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 36, 97, 0.0F, -0.4705F, 0.0846F, 0, 1, 8, 0.0F, true));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(1.1058F, 1.1614F, -0.2485F);
        this.neck2.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, -0.0765F, 0.6464F, -0.018F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 30, 107, -0.1815F, -0.4141F, 0.0258F, 0, 1, 6, 0.0F, false));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(4.489F, 2.1835F, 4.5188F);
        this.neck2.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, -0.0659F, 0.3853F, 0.0033F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 77, 113, 0.0046F, -1.0479F, 0.1283F, 0, 1, 4, 0.0F, false));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(1.1058F, 1.7775F, -3.3502F);
        this.neck2.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, -0.0592F, 0.5178F, -0.074F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 93, 95, -0.1125F, -0.398F, 0.1026F, 0, 1, 8, 0.0F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(1.1058F, 1.6116F, -6.8973F);
        this.neck2.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.1855F, 0.3435F, -0.0631F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 36, 97, 0.0F, -0.4705F, 0.0846F, 0, 1, 8, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.5851F, -10.7315F);
        this.neck2.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.1309F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 83, 77, -1.0F, -0.4666F, 1.282F, 2, 3, 10, 0.01F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.6061F, -9.0659F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3578F, 0.538F, 0.1893F);


        this.neck10_r2 = new ModelRenderer(this);
        this.neck10_r2.setRotationPoint(-1.1194F, 0.2252F, -1.382F);
        this.neck3.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, -0.671F, -0.2123F, 0.1544F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 63, 30, 0.0697F, -0.7362F, 0.2269F, 0, 1, 7, 0.0F, true));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(-1.1194F, -0.8329F, -4.0654F);
        this.neck3.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, -0.671F, -0.2123F, 0.1544F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 100, 22, -0.0349F, -0.2792F, -0.1477F, 0, 1, 7, 0.0F, true));

        this.neck10_r3 = new ModelRenderer(this);
        this.neck10_r3.setRotationPoint(-1.1194F, -2.1134F, -7.6151F);
        this.neck3.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, -0.6361F, -0.2123F, 0.1544F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 98, 31, 0.0F, -0.4271F, -0.0176F, 0, 1, 7, 0.0F, true));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(1.1194F, -2.1134F, -7.6151F);
        this.neck3.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, -0.6361F, 0.2123F, -0.1544F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 98, 31, 0.0F, -0.4271F, -0.0176F, 0, 1, 7, 0.0F, false));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(1.1194F, 0.2252F, -1.382F);
        this.neck3.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, -0.671F, 0.2123F, -0.1544F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 63, 30, -0.0697F, -0.7362F, 0.2269F, 0, 1, 7, 0.0F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(1.1194F, -0.8329F, -4.0654F);
        this.neck3.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -0.671F, 0.2123F, -0.1544F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 100, 22, 0.0349F, -0.2792F, -0.1477F, 0, 1, 7, 0.0F, false));

        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -3.7514F, -9.7039F);
        this.neck3.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.3578F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 45, -1.0F, -0.6798F, -0.2789F, 2, 2, 11, 0.0F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -3.6656F, -9.6984F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.2801F, 0.3323F, 0.109F);


        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-1.0F, 0.4222F, -1.453F);
        this.neck4.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, -0.8961F, -0.2324F, 0.2F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 107, 77, -0.0324F, -0.3247F, -0.1611F, 0, 1, 6, 0.0F, true));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(-1.0F, -0.1737F, -4.6113F);
        this.neck4.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, -0.7216F, -0.2324F, 0.2F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 114, 16, 0.0F, -0.5207F, -0.0585F, 0, 1, 4, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(1.0F, 0.4222F, -1.453F);
        this.neck4.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, -0.8961F, 0.2324F, -0.2F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 107, 77, 0.0324F, -0.3247F, -0.1611F, 0, 1, 6, 0.0F, false));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(1.0F, -0.1737F, -4.6113F);
        this.neck4.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, -0.7216F, 0.2324F, -0.2F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 114, 16, 0.0F, -0.5207F, -0.0585F, 0, 1, 4, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.0F, -1.0194F, -6.0201F);
        this.neck4.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, -0.2182F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 70, 84, -1.0F, -1.0F, -0.5F, 2, 2, 7, -0.01F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -1.2194F, -6.5201F);
        this.neck4.addChild(head1);
        this.setRotateAngle(head1, 0.056F, 0.1329F, 0.1718F);
        this.head1.cubeList.add(new ModelBox(head1, 100, 0, -2.0F, -1.3F, -3.0F, 4, 3, 4, 0.0F, false));
        this.head1.cubeList.add(new ModelBox(head1, 47, 38, -2.0F, -0.7203F, -2.7365F, 4, 1, 1, 0.02F, false));
        this.head1.cubeList.add(new ModelBox(head1, 0, 53, 1.24F, -0.7203F, -2.7365F, 1, 1, 1, -0.2F, false));
        this.head1.cubeList.add(new ModelBox(head1, 0, 53, -2.24F, -0.7203F, -2.7365F, 1, 1, 1, -0.2F, true));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.1F, -0.5F, -3.0F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0456F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 102, 50, -1.1F, -0.7F, -3.9F, 2, 3, 5, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(-0.1F, 2.2F, 1.0F);
        this.head2.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.0698F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 11, 16, -0.7F, -0.8F, -5.3F, 0, 1, 5, 0.0F, true));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 11, 16, 0.7F, -0.8F, -5.3F, 0, 1, 5, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.2F, -3.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.3187F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 114, 91, -0.6F, -0.5F, -3.0F, 1, 2, 3, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.0F, -3.4F);
        this.head1.addChild(head3);
        this.setRotateAngle(head3, 0.1367F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 54, 100, -1.6F, -1.3F, -4.0F, 3, 2, 5, 0.0F, false));

        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, -0.0911F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 108, 70, -1.0F, -1.8F, -2.1F, 2, 2, 3, 0.0F, false));
        this.head5.cubeList.add(new ModelBox(head5, 55, 84, 0.7F, -0.6F, -2.0F, 0, 1, 2, 0.0F, false));
        this.head5.cubeList.add(new ModelBox(head5, 55, 84, -0.7F, -0.6F, -2.0F, 0, 1, 2, 0.0F, true));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.1F, 1.7F, 0.6F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.2618F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 12, 88, 0.9F, 0.0F, -3.6F, 1, 2, 4, 0.0F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 12, 88, -2.1F, 0.0F, -3.6F, 1, 2, 4, 0.0F, true));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-0.1F, 1.8787F, -3.5995F);
        this.jaw1.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.4051F, -0.2415F, 0.1022F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 51, 44, 0.0F, -0.8787F, -0.0005F, 0, 1, 3, 0.0F, true));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(-0.1F, 1.8787F, -3.5995F);
        this.jaw1.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.4051F, 0.2415F, -0.1022F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 51, 44, 0.0F, -0.8787F, -0.0005F, 0, 1, 3, 0.0F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.2F, -4.9F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0911F, 0.0F, 0.0F);


        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-1.1F, 0.1F, 1.7F);
        this.jaw2.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.0349F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 114, 76, -0.3F, -0.4F, -3.9F, 0, 1, 4, 0.0F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 114, 76, 2.3F, -0.4F, -3.9F, 0, 1, 4, 0.0F, false));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 66, 97, -0.5F, -0.2F, -3.9F, 1, 1, 4, 0.0F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 66, 97, 1.5F, -0.2F, -3.9F, 1, 1, 4, 0.0F, false));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(-0.1F, 0.0F, -2.8F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1367F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 71, 15, -1.0F, -0.3F, -2.3F, 2, 1, 3, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 12, 84, 0.8F, -0.5F, -1.9F, 0, 1, 2, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 12, 84, -0.8F, -0.5F, -1.9F, 0, 1, 2, 0.0F, true));

        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(-0.1F, 1.1F, 1.4F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2065F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 106, 31, 0.5F, -0.2F, -4.1F, 1, 1, 4, -0.02F, false));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 106, 31, -1.5F, -0.2F, -4.1F, 1, 1, 4, -0.02F, true));

        this.leftarm1 = new ModelRenderer(this);
        this.leftarm1.setRotationPoint(8.5F, 12.7014F, -7.1628F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.4354F, 0.0226F, -0.2152F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 84, 91, -1.0F, -0.9F, -3.0F, 3, 6, 5, 0.0F, false));
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 16, 45, -1.0F, 5.1F, -2.4F, 3, 5, 3, 0.0F, false));

        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.6319F, 10.4187F, 0.5312F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.6011F, 0.1001F, 0.1505F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 68, 106, 0.4522F, -0.0161F, -3.1492F, 1, 9, 3, 0.0F, false));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 106, -1.5478F, -0.0161F, -3.1492F, 1, 9, 3, 0.0F, false));

        this.leftarm3 = new ModelRenderer(this);
        this.leftarm3.setRotationPoint(-1.0905F, 9.0486F, -1.3523F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, -0.0436F, 1.3526F, -0.0436F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 35, 30, -0.0469F, -0.8894F, -0.566F, 2, 5, 3, 0.0F, false));

        this.leftarm4 = new ModelRenderer(this);
        this.leftarm4.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftarm3.addChild(leftarm4);
        this.setRotateAngle(leftarm4, 0.0F, 0.0F, -1.5272F);


        this.thumb1_r1 = new ModelRenderer(this);
        this.thumb1_r1.setRotationPoint(0.0F, 0.3819F, -2.0021F);
        this.leftarm4.addChild(thumb1_r1);
        this.setRotateAngle(thumb1_r1, -0.6545F, 0.0F, 0.0F);
        this.thumb1_r1.cubeList.add(new ModelBox(thumb1_r1, 14, 0, -0.9871F, -0.9977F, 0.2691F, 2, 5, 2, -0.01F, false));

        this.fingers1_r1 = new ModelRenderer(this);
        this.fingers1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftarm4.addChild(fingers1_r1);
        this.setRotateAngle(fingers1_r1, 0.0873F, 0.0F, 0.0F);
        this.fingers1_r1.cubeList.add(new ModelBox(fingers1_r1, 98, 72, -0.9871F, 0.4674F, -2.253F, 2, 5, 5, -0.02F, false));

        this.rightarm1 = new ModelRenderer(this);
        this.rightarm1.setRotationPoint(-8.7F, 12.7014F, -7.1628F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 1.1335F, -0.0226F, 0.2152F);
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 48, 0, -2.0F, -0.9F, -3.0F, 3, 6, 5, 0.0F, false));
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 16, 30, -2.0F, 5.1F, -2.4F, 3, 5, 3, 0.0F, false));

        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.6319F, 10.4187F, 0.5312F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.3429F, -0.1001F, -0.1505F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 96, 105, -1.4522F, -0.0161F, -3.1492F, 1, 9, 3, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 105, 88, 0.5478F, -0.0161F, -3.1492F, 1, 9, 3, 0.0F, false));

        this.rightarm3 = new ModelRenderer(this);
        this.rightarm3.setRotationPoint(1.0905F, 9.0486F, -1.3523F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, -0.5641F, -1.312F, 0.5784F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 30, -1.9531F, -0.8894F, -0.566F, 2, 5, 3, 0.0F, false));

        this.rightarm4 = new ModelRenderer(this);
        this.rightarm4.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightarm3.addChild(rightarm4);
        this.setRotateAngle(rightarm4, 0.0F, 0.0F, -0.2618F);


        this.thumb2_r1 = new ModelRenderer(this);
        this.thumb2_r1.setRotationPoint(0.0F, 0.3819F, -2.0021F);
        this.rightarm4.addChild(thumb2_r1);
        this.setRotateAngle(thumb2_r1, -0.6545F, 0.0F, 0.0F);
        this.thumb2_r1.cubeList.add(new ModelBox(thumb2_r1, 0, 0, -1.0129F, -0.9977F, 0.2691F, 2, 5, 2, -0.01F, false));

        this.fingers2_r1 = new ModelRenderer(this);
        this.fingers2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightarm4.addChild(fingers2_r1);
        this.setRotateAngle(fingers2_r1, 0.0873F, 0.0F, 0.0F);
        this.fingers2_r1.cubeList.add(new ModelBox(fingers2_r1, 49, 64, -1.0129F, 0.4674F, -2.253F, 2, 5, 5, -0.02F, false));

    }

    public void renderAll(float f) {
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
