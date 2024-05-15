package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlacerias extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body8_r1;
    private final ModelRenderer body6_r1;
    private final ModelRenderer body5_r1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer body2_r2;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer neck18_r1;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck18_r2;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck17_r3;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck17_r4;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck17_r5;
    private final ModelRenderer neck16_r5;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer neck16_r6;
    private final ModelRenderer neck15_r5;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck15_r6;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck14_r6;
    private final ModelRenderer neck13_r5;
    private final ModelRenderer neck12_r3;
    private final ModelRenderer neck13_r6;
    private final ModelRenderer neck12_r4;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck12_r5;
    private final ModelRenderer neck11_r3;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer chest1;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer chest_r4;
    private final ModelRenderer chest_r5;
    private final ModelRenderer chest_r6;
    private final ModelRenderer chest_r7;
    private final ModelRenderer chest_r8;
    private final ModelRenderer chest_r9;
    private final ModelRenderer chest_r10;
    private final ModelRenderer chest_r11;
    private final ModelRenderer chest_r12;
    private final ModelRenderer chest_r13;
    private final ModelRenderer chest_r14;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest8_r1;
    private final ModelRenderer chest7_r1;
    private final ModelRenderer chest6_r1;
    private final ModelRenderer chest5_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer neck17_r6;
    private final ModelRenderer neck16_r7;
    private final ModelRenderer neck20_r1;
    private final ModelRenderer neck19_r1;
    private final ModelRenderer neck18_r3;
    private final ModelRenderer neck19_r2;
    private final ModelRenderer neck18_r4;
    private final ModelRenderer neck17_r7;
    private final ModelRenderer neck16_r8;
    private final ModelRenderer neck17_r8;
    private final ModelRenderer neck18_r5;
    private final ModelRenderer neck15_r7;
    private final ModelRenderer neck14_r7;
    private final ModelRenderer neck15_r8;
    private final ModelRenderer neck16_r9;
    private final ModelRenderer neck13_r7;
    private final ModelRenderer neck14_r8;
    private final ModelRenderer neck15_r9;
    private final ModelRenderer neck12_r6;
    private final ModelRenderer neck13_r8;
    private final ModelRenderer neck14_r9;
    private final ModelRenderer neck17_r9;
    private final ModelRenderer neck18_r6;
    private final ModelRenderer neck19_r3;
    private final ModelRenderer neck16_r10;
    private final ModelRenderer neck17_r10;
    private final ModelRenderer neck18_r7;
    private final ModelRenderer neck17_r11;
    private final ModelRenderer neck16_r11;
    private final ModelRenderer neck15_r10;
    private final ModelRenderer neck16_r12;
    private final ModelRenderer neck15_r11;
    private final ModelRenderer neck14_r10;
    private final ModelRenderer neck15_r12;
    private final ModelRenderer neck14_r11;
    private final ModelRenderer neck13_r9;
    private final ModelRenderer neck14_r12;
    private final ModelRenderer neck13_r10;
    private final ModelRenderer neck12_r7;
    private final ModelRenderer neck13_r11;
    private final ModelRenderer neck12_r8;
    private final ModelRenderer neck11_r4;
    private final ModelRenderer upperarm1;
    private final ModelRenderer lowerarm1;
    private final ModelRenderer lowerarm4_r1;
    private final ModelRenderer lowerarm2_r1;
    private final ModelRenderer hand1;
    private final ModelRenderer hand2_r1;
    private final ModelRenderer hand2_r2;
    private final ModelRenderer hand2_r3;
    private final ModelRenderer hand2_r4;
    private final ModelRenderer hand1_r1;
    private final ModelRenderer upperarm2;
    private final ModelRenderer lowerarm2;
    private final ModelRenderer lowerarm5_r1;
    private final ModelRenderer hand2;
    private final ModelRenderer hand3_r1;
    private final ModelRenderer hand3_r2;
    private final ModelRenderer hand3_r3;
    private final ModelRenderer hand3_r4;
    private final ModelRenderer hand2_r5;
    private final ModelRenderer neck1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck23_r1;
    private final ModelRenderer neck22_r1;
    private final ModelRenderer neck22_r2;
    private final ModelRenderer neck21_r1;
    private final ModelRenderer neck20_r2;
    private final ModelRenderer neck21_r2;
    private final ModelRenderer neck19_r4;
    private final ModelRenderer neck20_r3;
    private final ModelRenderer neck21_r3;
    private final ModelRenderer neck21_r4;
    private final ModelRenderer neck22_r3;
    private final ModelRenderer neck20_r4;
    private final ModelRenderer neck21_r5;
    private final ModelRenderer neck20_r5;
    private final ModelRenderer neck19_r5;
    private final ModelRenderer neck20_r6;
    private final ModelRenderer neck19_r6;
    private final ModelRenderer neck18_r8;
    private final ModelRenderer head1;
    private final ModelRenderer head6_r1;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head2_r1;
    private final ModelRenderer head2_r2;
    private final ModelRenderer head1_r1;
    private final ModelRenderer head2;
    private final ModelRenderer head5_r1;
    private final ModelRenderer head5_r2;
    private final ModelRenderer head5_r3;
    private final ModelRenderer beak1;
    private final ModelRenderer beak2;
    private final ModelRenderer beak3_r1;
    private final ModelRenderer beak2_r1;
    private final ModelRenderer beak3;
    private final ModelRenderer beak3_r2;
    private final ModelRenderer beak4;
    private final ModelRenderer beak4_r1;
    private final ModelRenderer tusk1;
    private final ModelRenderer tusk1_r1;
    private final ModelRenderer tusk2_r1;
    private final ModelRenderer fronttusk1;
    private final ModelRenderer fronttusk3_r1;
    private final ModelRenderer fronttusk2_r1;
    private final ModelRenderer fronttusk1_r1;
    private final ModelRenderer tusk3;
    private final ModelRenderer tusk2_r2;
    private final ModelRenderer tusk3_r1;
    private final ModelRenderer fronttusk3;
    private final ModelRenderer fronttusk4_r1;
    private final ModelRenderer fronttusk3_r2;
    private final ModelRenderer fronttusk2_r2;
    private final ModelRenderer tusk2;
    private final ModelRenderer fronttusk2;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw4_r2;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer lowerbeak1;
    private final ModelRenderer lowerbeak2_r1;
    private final ModelRenderer lowerbeak3_r1;
    private final ModelRenderer lowerbeak2;
    private final ModelRenderer lowerbeak4_r1;
    private final ModelRenderer lowerbeak4_r2;
    private final ModelRenderer basin1;
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
    private final ModelRenderer basin_r13;
    private final ModelRenderer basin_r14;
    private final ModelRenderer basin_r15;
    private final ModelRenderer basin_r16;
    private final ModelRenderer basin5_r1;
    private final ModelRenderer basin4_r1;
    private final ModelRenderer basin3_r1;
    private final ModelRenderer basin2_r1;
    private final ModelRenderer basin2_r2;
    private final ModelRenderer upperleg1;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2_r1;
    private final ModelRenderer feet1;
    private final ModelRenderer feet2_r1;
    private final ModelRenderer feet1_r1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3_r1;
    private final ModelRenderer feet2;
    private final ModelRenderer feet3_r1;
    private final ModelRenderer feet2_r2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail5_r1;

    public ModelSkeletonPlacerias() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 6.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 48, -0.5F, -25.0F, -18.0F, 1, 25, 1, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 23, 41, -0.5F, -26.0F, 9.5F, 1, 26, 1, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.5F, 10.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 77, 8.5F, -7.5F, -0.5F, 1, 15, 1, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 88, 4.5F, -5.5F, -28.0F, 1, 11, 1, -0.003F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -4.9F, -1.7F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);


        this.body8_r1 = new ModelRenderer(this);
        this.body8_r1.setRotationPoint(0.1F, -0.2932F, 6.2988F);
        this.body1.addChild(body8_r1);
        this.setRotateAngle(body8_r1, -0.3142F, 0.0F, 0.0F);
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 12, 18, 0.0F, -4.0179F, 2.152F, 0, 4, 1, 0.0F, false));
        this.body8_r1.cubeList.add(new ModelBox(body8_r1, 28, 41, 0.0F, -3.8179F, 0.152F, 0, 4, 1, 0.0F, false));

        this.body6_r1 = new ModelRenderer(this);
        this.body6_r1.setRotationPoint(0.1F, -0.2932F, 4.2988F);
        this.body1.addChild(body6_r1);
        this.setRotateAngle(body6_r1, -0.384F, 0.0F, 0.0F);
        this.body6_r1.cubeList.add(new ModelBox(body6_r1, 31, 41, 0.0F, -4.0671F, 0.0064F, 0, 4, 1, 0.0F, false));

        this.body5_r1 = new ModelRenderer(this);
        this.body5_r1.setRotationPoint(0.1F, -0.6932F, 0.0988F);
        this.body1.addChild(body5_r1);
        this.setRotateAngle(body5_r1, -0.4189F, 0.0F, 0.0F);
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 54, 84, 0.0F, -4.91F, 2.006F, 0, 5, 1, 0.0F, false));
        this.body5_r1.cubeList.add(new ModelBox(body5_r1, 84, 99, 0.0F, -4.41F, 0.006F, 0, 5, 1, 0.0F, false));

        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.1F, -0.7932F, -2.0012F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.3665F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 92, 99, 0.0F, -4.4301F, 0.1049F, 0, 5, 1, 0.0F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.1F, -0.7932F, -3.9012F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.2443F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 16, 100, 0.0F, -4.3287F, -0.0055F, 0, 5, 1, 0.0F, false));

        this.body2_r2 = new ModelRenderer(this);
        this.body2_r2.setRotationPoint(0.0F, -0.6769F, -4.8245F);
        this.body1.addChild(body2_r2);
        this.setRotateAngle(body2_r2, -0.0524F, 0.0F, 0.0F);
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 0, 0, -0.9F, 0.8069F, -0.0895F, 2, 2, 15, -0.2F, false));
        this.body2_r2.cubeList.add(new ModelBox(body2_r2, 0, 18, -0.9F, -0.1931F, -0.0895F, 2, 2, 15, 0.0F, false));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(-1.1F, 0.1231F, -1.5245F);
        this.body1.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, 0.1213F, 0.048F, -0.2411F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 100, 93, -1.806F, 0.0485F, -0.4965F, 2, 0, 1, 0.0F, true));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(-1.1F, 0.1231F, -1.5245F);
        this.body1.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, 0.0767F, 0.1057F, -0.8072F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 83, 49, -5.5492F, -0.9294F, -0.4965F, 4, 0, 1, 0.0F, true));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-1.1F, 0.1231F, -1.5245F);
        this.body1.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, 0.0247F, 0.1281F, -1.246F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 36, 2, -14.6158F, -3.1791F, -0.4965F, 10, 0, 1, 0.0F, true));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-1.1F, 0.2231F, 0.4755F);
        this.body1.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, 0.1298F, 0.0503F, -0.2407F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 33, 100, -1.806F, 0.0485F, -0.4965F, 2, 0, 1, 0.0F, true));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(-1.1F, 0.2231F, 0.4755F);
        this.body1.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, 0.0826F, 0.1121F, -0.8065F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 93, 59, -5.5493F, -0.9294F, -0.4965F, 4, 0, 1, 0.0F, true));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(-1.1F, 0.2231F, 0.4755F);
        this.body1.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, 0.0273F, 0.1364F, -1.2456F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 40, 17, -11.6159F, -3.1791F, -0.4965F, 7, 0, 1, 0.0F, true));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(-1.1F, 0.7231F, 8.3755F);
        this.body1.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, 0.0117F, 0.0188F, -0.4717F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 101, 38, -1.8219F, 0.0909F, -0.4977F, 2, 0, 1, 0.0F, true));

        this.neck18_r1 = new ModelRenderer(this);
        this.neck18_r1.setRotationPoint(-1.1F, 0.7231F, 8.3755F);
        this.body1.addChild(neck18_r1);
        this.setRotateAngle(neck18_r1, -0.0003F, 0.0221F, -1.039F);
        this.neck18_r1.cubeList.add(new ModelBox(neck18_r1, 98, 63, -5.5854F, -0.9022F, -0.4977F, 4, 0, 1, 0.0F, true));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(-1.1F, 0.7231F, 6.3755F);
        this.body1.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, 0.0538F, 0.0301F, -0.3659F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 40, 100, -1.8133F, 0.0718F, -0.4982F, 2, 0, 1, 0.0F, true));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-1.1F, 0.7231F, 6.3755F);
        this.body1.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, 0.0292F, 0.0543F, -0.9332F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 95, 0, -5.5679F, -0.9138F, -0.4982F, 4, 0, 1, 0.0F, true));

        this.neck18_r2 = new ModelRenderer(this);
        this.neck18_r2.setRotationPoint(-1.1F, 0.7231F, 6.3755F);
        this.body1.addChild(neck18_r2);
        this.setRotateAngle(neck18_r2, 0.0035F, 0.0616F, -1.3702F);
        this.neck18_r2.cubeList.add(new ModelBox(neck18_r2, 100, 86, -6.6394F, -3.1728F, -0.4982F, 2, 0, 1, 0.0F, true));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-1.1F, 0.4231F, 4.3755F);
        this.body1.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, 0.1044F, 0.0436F, -0.3291F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 27, 29, -1.8109F, 0.0652F, -0.4985F, 2, 0, 1, 0.0F, true));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-1.1F, 0.4231F, 4.3755F);
        this.body1.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, 0.0648F, 0.0928F, -0.8956F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 79, 97, -5.5623F, -0.9181F, -0.4985F, 4, 0, 1, 0.0F, true));

        this.neck17_r3 = new ModelRenderer(this);
        this.neck17_r3.setRotationPoint(-1.1F, 0.4231F, 4.3755F);
        this.body1.addChild(neck17_r3);
        this.setRotateAngle(neck17_r3, 0.0194F, 0.1115F, -1.3339F);
        this.neck17_r3.cubeList.add(new ModelBox(neck17_r3, 0, 98, -8.6325F, -3.1743F, -0.4985F, 4, 0, 1, 0.0F, true));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(-1.1F, 0.4231F, 2.4755F);
        this.body1.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, 0.1382F, 0.0525F, -0.2577F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 39, 41, -1.8069F, 0.0519F, -0.497F, 2, 0, 1, 0.0F, true));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(-1.1F, 0.4231F, 2.4755F);
        this.body1.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, 0.0886F, 0.1185F, -0.8233F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 32, 98, -5.5518F, -0.9271F, -0.497F, 4, 0, 1, 0.0F, true));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(-1.1F, 0.4231F, 2.4755F);
        this.body1.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, 0.03F, 0.1448F, -1.2627F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 0, 29, -9.6191F, -3.178F, -0.497F, 5, 0, 1, 0.0F, true));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(-1.1F, 0.0231F, -3.5245F);
        this.body1.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, 0.1551F, 0.0569F, -0.2219F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 100, 88, -1.8052F, 0.0452F, -0.4958F, 2, 0, 1, 0.0F, true));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(-1.1F, 0.0231F, -3.5245F);
        this.body1.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, 0.1006F, 0.1313F, -0.7869F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 98, 61, -5.5468F, -0.9318F, -0.4958F, 4, 0, 1, 0.0F, true));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(-1.1F, 0.0231F, -3.5245F);
        this.body1.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, 0.0354F, 0.1614F, -1.227F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 58, 49, -15.6126F, -3.1802F, -0.4958F, 11, 0, 1, 0.0F, true));

        this.neck17_r4 = new ModelRenderer(this);
        this.neck17_r4.setRotationPoint(1.1F, 0.7231F, 8.3755F);
        this.body1.addChild(neck17_r4);
        this.setRotateAngle(neck17_r4, -0.0003F, -0.0221F, 1.039F);
        this.neck17_r4.cubeList.add(new ModelBox(neck17_r4, 98, 63, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(1.1F, 0.7231F, 8.3755F);
        this.body1.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, 0.0117F, -0.0188F, 0.4717F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 101, 38, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck17_r5 = new ModelRenderer(this);
        this.neck17_r5.setRotationPoint(1.1F, 0.7231F, 6.3755F);
        this.body1.addChild(neck17_r5);
        this.setRotateAngle(neck17_r5, 0.0035F, -0.0616F, 1.3702F);
        this.neck17_r5.cubeList.add(new ModelBox(neck17_r5, 100, 86, 4.6791F, -3.3688F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck16_r5 = new ModelRenderer(this);
        this.neck16_r5.setRotationPoint(1.1F, 0.7231F, 6.3755F);
        this.body1.addChild(neck16_r5);
        this.setRotateAngle(neck16_r5, 0.0292F, -0.0543F, 0.9332F);
        this.neck16_r5.cubeList.add(new ModelBox(neck16_r5, 95, 0, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(1.1F, 0.7231F, 6.3755F);
        this.body1.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, 0.0538F, -0.0301F, 0.3659F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 40, 100, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck16_r6 = new ModelRenderer(this);
        this.neck16_r6.setRotationPoint(1.1F, 0.4231F, 4.3755F);
        this.body1.addChild(neck16_r6);
        this.setRotateAngle(neck16_r6, 0.0194F, -0.1115F, 1.3339F);
        this.neck16_r6.cubeList.add(new ModelBox(neck16_r6, 0, 98, 4.6791F, -3.3688F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck15_r5 = new ModelRenderer(this);
        this.neck15_r5.setRotationPoint(1.1F, 0.4231F, 4.3755F);
        this.body1.addChild(neck15_r5);
        this.setRotateAngle(neck15_r5, 0.0648F, -0.0928F, 0.8956F);
        this.neck15_r5.cubeList.add(new ModelBox(neck15_r5, 79, 97, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(1.1F, 0.4231F, 4.3755F);
        this.body1.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, 0.1044F, -0.0436F, 0.3291F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 27, 29, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck15_r6 = new ModelRenderer(this);
        this.neck15_r6.setRotationPoint(1.1F, 0.4231F, 2.4755F);
        this.body1.addChild(neck15_r6);
        this.setRotateAngle(neck15_r6, 0.03F, -0.1448F, 1.2627F);
        this.neck15_r6.cubeList.add(new ModelBox(neck15_r6, 0, 29, 4.6791F, -3.3688F, -0.5F, 5, 0, 1, 0.0F, false));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(1.1F, 0.4231F, 2.4755F);
        this.body1.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, 0.0886F, -0.1185F, 0.8233F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 32, 98, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(1.1F, 0.4231F, 2.4755F);
        this.body1.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, 0.1382F, -0.0525F, 0.2577F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 39, 41, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck14_r6 = new ModelRenderer(this);
        this.neck14_r6.setRotationPoint(1.1F, 0.2231F, 0.4755F);
        this.body1.addChild(neck14_r6);
        this.setRotateAngle(neck14_r6, 0.0273F, -0.1364F, 1.2456F);
        this.neck14_r6.cubeList.add(new ModelBox(neck14_r6, 40, 17, 4.6791F, -3.3688F, -0.5F, 7, 0, 1, 0.0F, false));

        this.neck13_r5 = new ModelRenderer(this);
        this.neck13_r5.setRotationPoint(1.1F, 0.2231F, 0.4755F);
        this.body1.addChild(neck13_r5);
        this.setRotateAngle(neck13_r5, 0.0826F, -0.1121F, 0.8065F);
        this.neck13_r5.cubeList.add(new ModelBox(neck13_r5, 93, 59, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck12_r3 = new ModelRenderer(this);
        this.neck12_r3.setRotationPoint(1.1F, 0.2231F, 0.4755F);
        this.body1.addChild(neck12_r3);
        this.setRotateAngle(neck12_r3, 0.1298F, -0.0503F, 0.2407F);
        this.neck12_r3.cubeList.add(new ModelBox(neck12_r3, 33, 100, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck13_r6 = new ModelRenderer(this);
        this.neck13_r6.setRotationPoint(1.1F, 0.1231F, -1.5245F);
        this.body1.addChild(neck13_r6);
        this.setRotateAngle(neck13_r6, 0.0247F, -0.1281F, 1.246F);
        this.neck13_r6.cubeList.add(new ModelBox(neck13_r6, 36, 2, 4.6791F, -3.3688F, -0.5F, 10, 0, 1, 0.0F, false));

        this.neck12_r4 = new ModelRenderer(this);
        this.neck12_r4.setRotationPoint(1.1F, 0.1231F, -1.5245F);
        this.body1.addChild(neck12_r4);
        this.setRotateAngle(neck12_r4, 0.0767F, -0.1057F, 0.8072F);
        this.neck12_r4.cubeList.add(new ModelBox(neck12_r4, 83, 49, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(1.1F, 0.1231F, -1.5245F);
        this.body1.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, 0.1213F, -0.048F, 0.2411F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 100, 93, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck12_r5 = new ModelRenderer(this);
        this.neck12_r5.setRotationPoint(1.1F, 0.0231F, -3.5245F);
        this.body1.addChild(neck12_r5);
        this.setRotateAngle(neck12_r5, 0.0354F, -0.1614F, 1.227F);
        this.neck12_r5.cubeList.add(new ModelBox(neck12_r5, 58, 49, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck11_r3 = new ModelRenderer(this);
        this.neck11_r3.setRotationPoint(1.1F, 0.0231F, -3.5245F);
        this.body1.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, 0.1006F, -0.1313F, 0.7869F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 98, 61, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(1.1F, 0.0231F, -3.5245F);
        this.body1.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, 0.1551F, -0.0569F, 0.2219F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 100, 88, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -0.1512F, -4.7511F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.2182F, 0.0F, 0.0F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-1.66F, 8.3651F, -17.919F);
        this.chest1.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -1.144F, 0.8762F, -2.2118F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 28, 57, 0.763F, -5.9906F, -0.9987F, 1, 6, 1, 0.0F, true));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(-1.66F, 8.3651F, -17.919F);
        this.chest1.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 0.3341F, 1.1856F, -0.773F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 20, 18, 0.1247F, -1.2146F, -0.9377F, 1, 2, 1, 0.0F, true));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-1.66F, 8.3651F, -17.919F);
        this.chest1.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 1.0492F, 0.0912F, 0.3694F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 0, 18, 0.0638F, -0.4541F, -0.903F, 1, 3, 1, 0.0F, true));

        this.chest_r4 = new ModelRenderer(this);
        this.chest_r4.setRotationPoint(-5.7F, 13.1347F, -12.1044F);
        this.chest1.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 1.1669F, 0.0F, 0.0822F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 0, 36, 2.1518F, -5.0246F, 0.4449F, 3, 6, 1, 0.0F, true));

        this.chest_r5 = new ModelRenderer(this);
        this.chest_r5.setRotationPoint(-5.0243F, 5.7681F, -14.1948F);
        this.chest1.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 1.2754F, -0.4137F, -0.5237F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 0, 0, -1.4595F, -2.0343F, -5.4464F, 1, 6, 6, 0.0F, true));

        this.chest_r6 = new ModelRenderer(this);
        this.chest_r6.setRotationPoint(-4.6707F, 4.2275F, -11.8783F);
        this.chest1.addChild(chest_r6);
        this.setRotateAngle(chest_r6, 1.08F, -0.1166F, 0.1848F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 90, 34, -1.9763F, -2.3126F, -2.6082F, 1, 3, 4, 0.0F, true));

        this.chest_r7 = new ModelRenderer(this);
        this.chest_r7.setRotationPoint(-4.6707F, 3.0275F, -10.7783F);
        this.chest1.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 1.0676F, -0.0122F, 0.3769F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 0, 18, -1.8386F, -3.7428F, -0.9843F, 1, 4, 6, 0.0F, true));

        this.chest_r8 = new ModelRenderer(this);
        this.chest_r8.setRotationPoint(4.6707F, 3.0275F, -10.7783F);
        this.chest1.addChild(chest_r8);
        this.setRotateAngle(chest_r8, 1.0676F, 0.0122F, -0.3769F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 0, 18, 0.8386F, -3.7428F, -0.9843F, 1, 4, 6, 0.0F, false));

        this.chest_r9 = new ModelRenderer(this);
        this.chest_r9.setRotationPoint(1.66F, 8.3651F, -17.919F);
        this.chest1.addChild(chest_r9);
        this.setRotateAngle(chest_r9, 1.0492F, -0.0912F, -0.3694F);
        this.chest_r9.cubeList.add(new ModelBox(chest_r9, 0, 18, -1.0638F, -0.4541F, -0.903F, 1, 3, 1, 0.0F, false));

        this.chest_r10 = new ModelRenderer(this);
        this.chest_r10.setRotationPoint(1.66F, 8.3651F, -17.919F);
        this.chest1.addChild(chest_r10);
        this.setRotateAngle(chest_r10, 0.3341F, -1.1856F, 0.773F);
        this.chest_r10.cubeList.add(new ModelBox(chest_r10, 20, 18, -1.1247F, -1.2146F, -0.9377F, 1, 2, 1, 0.0F, false));

        this.chest_r11 = new ModelRenderer(this);
        this.chest_r11.setRotationPoint(1.66F, 8.3651F, -17.919F);
        this.chest1.addChild(chest_r11);
        this.setRotateAngle(chest_r11, -1.144F, -0.8762F, 2.2118F);
        this.chest_r11.cubeList.add(new ModelBox(chest_r11, 28, 57, -1.763F, -5.9906F, -0.9987F, 1, 6, 1, 0.0F, false));

        this.chest_r12 = new ModelRenderer(this);
        this.chest_r12.setRotationPoint(5.0243F, 5.7681F, -14.1948F);
        this.chest1.addChild(chest_r12);
        this.setRotateAngle(chest_r12, 1.2754F, 0.4137F, 0.5237F);
        this.chest_r12.cubeList.add(new ModelBox(chest_r12, 0, 0, 0.4595F, -2.0343F, -5.4464F, 1, 6, 6, 0.0F, false));

        this.chest_r13 = new ModelRenderer(this);
        this.chest_r13.setRotationPoint(4.6707F, 4.2275F, -11.8783F);
        this.chest1.addChild(chest_r13);
        this.setRotateAngle(chest_r13, 1.08F, 0.1166F, -0.1848F);
        this.chest_r13.cubeList.add(new ModelBox(chest_r13, 90, 34, 0.9763F, -2.3126F, -2.6082F, 1, 3, 4, 0.0F, false));

        this.chest_r14 = new ModelRenderer(this);
        this.chest_r14.setRotationPoint(5.7F, 13.1347F, -12.1044F);
        this.chest1.addChild(chest_r14);
        this.setRotateAngle(chest_r14, 1.1669F, 0.0F, -0.0822F);
        this.chest_r14.cubeList.add(new ModelBox(chest_r14, 0, 36, -5.1518F, -5.0246F, 0.4449F, 3, 6, 1, 0.0F, false));

        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, -0.9039F, -0.0922F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, -0.0698F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 5, 58, -0.9F, 1.1316F, -5.7115F, 2, 2, 6, -0.2F, false));
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 41, 64, -0.9F, 0.1316F, -5.7115F, 2, 2, 6, 0.001F, false));

        this.chest8_r1 = new ModelRenderer(this);
        this.chest8_r1.setRotationPoint(0.1F, -0.7621F, -1.1418F);
        this.chest1.addChild(chest8_r1);
        this.setRotateAngle(chest8_r1, -0.3403F, 0.0F, 0.0F);
        this.chest8_r1.cubeList.add(new ModelBox(chest8_r1, 95, 99, 0.0F, -4.1735F, -0.0191F, 0, 5, 1, 0.001F, false));

        this.chest7_r1 = new ModelRenderer(this);
        this.chest7_r1.setRotationPoint(0.1F, -2.2621F, -2.2418F);
        this.chest1.addChild(chest7_r1);
        this.setRotateAngle(chest7_r1, -0.3229F, 0.0F, 0.0F);
        this.chest7_r1.cubeList.add(new ModelBox(chest7_r1, 98, 99, 0.0F, -2.8F, -0.5F, 0, 5, 1, 0.001F, false));

        this.chest6_r1 = new ModelRenderer(this);
        this.chest6_r1.setRotationPoint(0.1F, -2.729F, -4.1866F);
        this.chest1.addChild(chest6_r1);
        this.setRotateAngle(chest6_r1, -0.2793F, 0.0F, 0.0F);
        this.chest6_r1.cubeList.add(new ModelBox(chest6_r1, 13, 100, 0.0F, -2.5F, -0.5F, 0, 5, 1, 0.001F, false));

        this.chest5_r1 = new ModelRenderer(this);
        this.chest5_r1.setRotationPoint(0.1F, 0.3919F, -13.6757F);
        this.chest1.addChild(chest5_r1);
        this.setRotateAngle(chest5_r1, -0.2356F, 0.0F, 0.0F);
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 0, 100, 0.0F, -7.5498F, 5.9984F, 0, 5, 1, 0.001F, false));
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 10, 99, 0.0F, -6.9498F, 3.9984F, 0, 6, 1, 0.001F, false));
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 33, 57, 0.0F, -6.1498F, 1.9984F, 0, 6, 1, 0.001F, false));
        this.chest5_r1.cubeList.add(new ModelBox(chest5_r1, 89, 98, 0.0F, -5.2498F, -0.0016F, 0, 6, 1, 0.001F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -1.0039F, -5.7922F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.2007F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 26, 29, -0.9F, 0.8462F, -9.0051F, 2, 2, 9, -0.2F, false));
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 0, 36, -0.9F, -0.1538F, -9.0051F, 2, 2, 9, 0.001F, false));

        this.neck17_r6 = new ModelRenderer(this);
        this.neck17_r6.setRotationPoint(-1.1F, 0.044F, -6.7652F);
        this.chest1.addChild(neck17_r6);
        this.setRotateAngle(neck17_r6, 0.0009F, 0.0532F, -1.3005F);
        this.neck17_r6.cubeList.add(new ModelBox(neck17_r6, 45, 22, -15.6258F, -3.176F, -0.4973F, 11, 0, 1, 0.0F, true));

        this.neck16_r7 = new ModelRenderer(this);
        this.neck16_r7.setRotationPoint(-1.1F, 0.044F, -6.7652F);
        this.chest1.addChild(neck16_r7);
        this.setRotateAngle(neck16_r7, 0.0233F, 0.0479F, -0.8636F);
        this.neck16_r7.cubeList.add(new ModelBox(neck16_r7, 36, 68, -5.557F, -0.9225F, -0.4973F, 4, 0, 1, 0.0F, true));

        this.neck20_r1 = new ModelRenderer(this);
        this.neck20_r1.setRotationPoint(-1.1F, 1.244F, -12.7652F);
        this.chest1.addChild(neck20_r1);
        this.setRotateAngle(neck20_r1, 0.0327F, 0.1531F, -1.4805F);
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 0, 13, -10.6613F, -3.1696F, -0.5038F, 6, 0, 1, 0.0F, true));

        this.neck19_r1 = new ModelRenderer(this);
        this.neck19_r1.setRotationPoint(-1.1F, 1.244F, -12.7652F);
        this.chest1.addChild(neck19_r1);
        this.setRotateAngle(neck19_r1, 0.0946F, 0.1249F, -1.0408F);
        this.neck19_r1.cubeList.add(new ModelBox(neck19_r1, 40, 19, -5.5865F, -0.9016F, -0.5038F, 4, 0, 1, 0.0F, true));

        this.neck18_r3 = new ModelRenderer(this);
        this.neck18_r3.setRotationPoint(-1.1F, 1.244F, -12.7652F);
        this.chest1.addChild(neck18_r3);
        this.setRotateAngle(neck18_r3, 0.1467F, 0.0547F, -0.4754F);
        this.neck18_r3.cubeList.add(new ModelBox(neck18_r3, 73, 36, -1.8224F, 0.092F, -0.5038F, 2, 0, 1, 0.0F, true));

        this.neck19_r2 = new ModelRenderer(this);
        this.neck19_r2.setRotationPoint(-1.1F, 1.044F, -10.7652F);
        this.chest1.addChild(neck19_r2);
        this.setRotateAngle(neck19_r2, 0.0387F, 0.0954F, -1.379F);
        this.neck19_r2.cubeList.add(new ModelBox(neck19_r2, 14, 36, -12.6412F, -3.1724F, -0.504F, 8, 0, 1, 0.0F, true));

        this.neck18_r4 = new ModelRenderer(this);
        this.neck18_r4.setRotationPoint(-1.1F, 1.044F, -10.7652F);
        this.chest1.addChild(neck18_r4);
        this.setRotateAngle(neck18_r4, 0.0754F, 0.0701F, -0.9418F);
        this.neck18_r4.cubeList.add(new ModelBox(neck18_r4, 58, 51, -5.5694F, -0.9127F, -0.504F, 4, 0, 1, 0.0F, true));

        this.neck17_r7 = new ModelRenderer(this);
        this.neck17_r7.setRotationPoint(-1.1F, 1.044F, -10.7652F);
        this.chest1.addChild(neck17_r7);
        this.setRotateAngle(neck17_r7, 0.1013F, 0.0187F, -0.3763F);
        this.neck17_r7.cubeList.add(new ModelBox(neck17_r7, 75, 20, -1.814F, 0.0735F, -0.504F, 2, 0, 1, 0.0F, true));

        this.neck16_r8 = new ModelRenderer(this);
        this.neck16_r8.setRotationPoint(-1.1F, 0.744F, -8.7652F);
        this.chest1.addChild(neck16_r8);
        this.setRotateAngle(neck16_r8, 0.0623F, 0.0323F, -0.3307F);
        this.neck16_r8.cubeList.add(new ModelBox(neck16_r8, 32, 75, -1.8109F, 0.0652F, -0.4979F, 2, 0, 1, 0.0F, true));

        this.neck17_r8 = new ModelRenderer(this);
        this.neck17_r8.setRotationPoint(-1.1F, 0.744F, -8.7652F);
        this.chest1.addChild(neck17_r8);
        this.setRotateAngle(neck17_r8, 0.0351F, 0.0607F, -0.8979F);
        this.neck17_r8.cubeList.add(new ModelBox(neck17_r8, 52, 67, -5.5624F, -0.918F, -0.4979F, 4, 0, 1, 0.0F, true));

        this.neck18_r5 = new ModelRenderer(this);
        this.neck18_r5.setRotationPoint(-1.1F, 0.744F, -8.7652F);
        this.chest1.addChild(neck18_r5);
        this.setRotateAngle(neck18_r5, 0.0061F, 0.0699F, -1.3351F);
        this.neck18_r5.cubeList.add(new ModelBox(neck18_r5, 36, 0, -14.6326F, -3.1743F, -0.4979F, 10, 0, 1, 0.0F, true));

        this.neck15_r7 = new ModelRenderer(this);
        this.neck15_r7.setRotationPoint(-1.1F, 0.044F, -6.7652F);
        this.chest1.addChild(neck15_r7);
        this.setRotateAngle(neck15_r7, 0.0454F, 0.0278F, -0.2963F);
        this.neck15_r7.cubeList.add(new ModelBox(neck15_r7, 80, 65, -1.8088F, 0.0586F, -0.4973F, 2, 0, 1, 0.0F, true));

        this.neck14_r7 = new ModelRenderer(this);
        this.neck14_r7.setRotationPoint(-1.1F, 0.044F, -4.7652F);
        this.chest1.addChild(neck14_r7);
        this.setRotateAngle(neck14_r7, 0.0032F, 0.0165F, -0.2624F);
        this.neck14_r7.cubeList.add(new ModelBox(neck14_r7, 90, 32, -1.8069F, 0.0519F, -0.497F, 2, 0, 1, 0.0F, true));

        this.neck15_r8 = new ModelRenderer(this);
        this.neck15_r8.setRotationPoint(-1.1F, 0.044F, -4.7652F);
        this.chest1.addChild(neck15_r8);
        this.setRotateAngle(neck15_r8, -0.0062F, 0.0157F, -0.8297F);
        this.neck15_r8.cubeList.add(new ModelBox(neck15_r8, 69, 51, -5.5518F, -0.9271F, -0.497F, 4, 0, 1, 0.0F, true));

        this.neck16_r9 = new ModelRenderer(this);
        this.neck16_r9.setRotationPoint(-1.1F, 0.044F, -4.7652F);
        this.chest1.addChild(neck16_r9);
        this.setRotateAngle(neck16_r9, -0.0122F, 0.0116F, -1.266F);
        this.neck16_r9.cubeList.add(new ModelBox(neck16_r9, 54, 40, -15.6191F, -3.178F, -0.497F, 11, 0, 1, 0.0F, true));

        this.neck13_r7 = new ModelRenderer(this);
        this.neck13_r7.setRotationPoint(-1.1F, 0.044F, -2.7652F);
        this.chest1.addChild(neck13_r7);
        this.setRotateAngle(neck13_r7, -0.0136F, 0.012F, -0.2452F);
        this.neck13_r7.cubeList.add(new ModelBox(neck13_r7, 19, 100, -1.806F, 0.0485F, -0.497F, 2, 0, 1, 0.0F, true));

        this.neck14_r8 = new ModelRenderer(this);
        this.neck14_r8.setRotationPoint(-1.1F, 0.044F, -2.7652F);
        this.chest1.addChild(neck14_r8);
        this.setRotateAngle(neck14_r8, -0.0179F, 0.0028F, -0.8123F);
        this.neck14_r8.cubeList.add(new ModelBox(neck14_r8, 80, 25, -5.5492F, -0.9295F, -0.497F, 4, 0, 1, 0.0F, true));

        this.neck15_r9 = new ModelRenderer(this);
        this.neck15_r9.setRotationPoint(-1.1F, 0.044F, -2.7652F);
        this.chest1.addChild(neck15_r9);
        this.setRotateAngle(neck15_r9, -0.0175F, -0.005F, -1.2486F);
        this.neck15_r9.cubeList.add(new ModelBox(neck15_r9, 56, 24, -15.6158F, -3.1791F, -0.497F, 11, 0, 1, 0.0F, true));

        this.neck12_r6 = new ModelRenderer(this);
        this.neck12_r6.setRotationPoint(-1.1F, 0.044F, -0.7652F);
        this.chest1.addChild(neck12_r6);
        this.setRotateAngle(neck12_r6, -0.0136F, 0.012F, -0.2277F);
        this.neck12_r6.cubeList.add(new ModelBox(neck12_r6, 26, 100, -1.8052F, 0.0451F, -0.497F, 2, 0, 1, 0.0F, true));

        this.neck13_r8 = new ModelRenderer(this);
        this.neck13_r8.setRotationPoint(-1.1F, 0.044F, -0.7652F);
        this.chest1.addChild(neck13_r8);
        this.setRotateAngle(neck13_r8, -0.0179F, 0.0028F, -0.7949F);
        this.neck13_r8.cubeList.add(new ModelBox(neck13_r8, 82, 27, -5.5467F, -0.9319F, -0.497F, 4, 0, 1, 0.0F, true));

        this.neck14_r9 = new ModelRenderer(this);
        this.neck14_r9.setRotationPoint(-1.1F, 0.044F, -0.7652F);
        this.chest1.addChild(neck14_r9);
        this.setRotateAngle(neck14_r9, -0.0175F, -0.005F, -1.2311F);
        this.neck14_r9.cubeList.add(new ModelBox(neck14_r9, 56, 26, -15.6125F, -3.1802F, -0.497F, 11, 0, 1, 0.0F, true));

        this.neck17_r9 = new ModelRenderer(this);
        this.neck17_r9.setRotationPoint(1.1F, 1.244F, -12.7652F);
        this.chest1.addChild(neck17_r9);
        this.setRotateAngle(neck17_r9, 0.1467F, -0.0547F, 0.4754F);
        this.neck17_r9.cubeList.add(new ModelBox(neck17_r9, 73, 36, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck18_r6 = new ModelRenderer(this);
        this.neck18_r6.setRotationPoint(1.1F, 1.244F, -12.7652F);
        this.chest1.addChild(neck18_r6);
        this.setRotateAngle(neck18_r6, 0.0946F, -0.1249F, 1.0408F);
        this.neck18_r6.cubeList.add(new ModelBox(neck18_r6, 40, 19, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck19_r3 = new ModelRenderer(this);
        this.neck19_r3.setRotationPoint(1.1F, 1.244F, -12.7652F);
        this.chest1.addChild(neck19_r3);
        this.setRotateAngle(neck19_r3, 0.0327F, -0.1531F, 1.4805F);
        this.neck19_r3.cubeList.add(new ModelBox(neck19_r3, 0, 13, 4.6791F, -3.3688F, -0.5F, 6, 0, 1, 0.0F, false));

        this.neck16_r10 = new ModelRenderer(this);
        this.neck16_r10.setRotationPoint(1.1F, 1.044F, -10.7652F);
        this.chest1.addChild(neck16_r10);
        this.setRotateAngle(neck16_r10, 0.1013F, -0.0187F, 0.3763F);
        this.neck16_r10.cubeList.add(new ModelBox(neck16_r10, 75, 20, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck17_r10 = new ModelRenderer(this);
        this.neck17_r10.setRotationPoint(1.1F, 1.044F, -10.7652F);
        this.chest1.addChild(neck17_r10);
        this.setRotateAngle(neck17_r10, 0.0754F, -0.0701F, 0.9418F);
        this.neck17_r10.cubeList.add(new ModelBox(neck17_r10, 58, 51, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck18_r7 = new ModelRenderer(this);
        this.neck18_r7.setRotationPoint(1.1F, 1.044F, -10.7652F);
        this.chest1.addChild(neck18_r7);
        this.setRotateAngle(neck18_r7, 0.0387F, -0.0954F, 1.379F);
        this.neck18_r7.cubeList.add(new ModelBox(neck18_r7, 14, 36, 4.6791F, -3.3688F, -0.5F, 8, 0, 1, 0.0F, false));

        this.neck17_r11 = new ModelRenderer(this);
        this.neck17_r11.setRotationPoint(1.1F, 0.744F, -8.7652F);
        this.chest1.addChild(neck17_r11);
        this.setRotateAngle(neck17_r11, 0.0061F, -0.0699F, 1.3351F);
        this.neck17_r11.cubeList.add(new ModelBox(neck17_r11, 36, 0, 4.6791F, -3.3688F, -0.5F, 10, 0, 1, 0.0F, false));

        this.neck16_r11 = new ModelRenderer(this);
        this.neck16_r11.setRotationPoint(1.1F, 0.744F, -8.7652F);
        this.chest1.addChild(neck16_r11);
        this.setRotateAngle(neck16_r11, 0.0351F, -0.0607F, 0.8979F);
        this.neck16_r11.cubeList.add(new ModelBox(neck16_r11, 52, 67, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck15_r10 = new ModelRenderer(this);
        this.neck15_r10.setRotationPoint(1.1F, 0.744F, -8.7652F);
        this.chest1.addChild(neck15_r10);
        this.setRotateAngle(neck15_r10, 0.0623F, -0.0323F, 0.3307F);
        this.neck15_r10.cubeList.add(new ModelBox(neck15_r10, 32, 75, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck16_r12 = new ModelRenderer(this);
        this.neck16_r12.setRotationPoint(1.1F, 0.044F, -6.7652F);
        this.chest1.addChild(neck16_r12);
        this.setRotateAngle(neck16_r12, 0.0009F, -0.0532F, 1.3005F);
        this.neck16_r12.cubeList.add(new ModelBox(neck16_r12, 45, 22, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck15_r11 = new ModelRenderer(this);
        this.neck15_r11.setRotationPoint(1.1F, 0.044F, -6.7652F);
        this.chest1.addChild(neck15_r11);
        this.setRotateAngle(neck15_r11, 0.0233F, -0.0479F, 0.8636F);
        this.neck15_r11.cubeList.add(new ModelBox(neck15_r11, 36, 68, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck14_r10 = new ModelRenderer(this);
        this.neck14_r10.setRotationPoint(1.1F, 0.044F, -6.7652F);
        this.chest1.addChild(neck14_r10);
        this.setRotateAngle(neck14_r10, 0.0454F, -0.0278F, 0.2963F);
        this.neck14_r10.cubeList.add(new ModelBox(neck14_r10, 80, 65, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck15_r12 = new ModelRenderer(this);
        this.neck15_r12.setRotationPoint(1.1F, 0.044F, -4.7652F);
        this.chest1.addChild(neck15_r12);
        this.setRotateAngle(neck15_r12, -0.0122F, -0.0116F, 1.266F);
        this.neck15_r12.cubeList.add(new ModelBox(neck15_r12, 54, 40, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck14_r11 = new ModelRenderer(this);
        this.neck14_r11.setRotationPoint(1.1F, 0.044F, -4.7652F);
        this.chest1.addChild(neck14_r11);
        this.setRotateAngle(neck14_r11, -0.0062F, -0.0157F, 0.8297F);
        this.neck14_r11.cubeList.add(new ModelBox(neck14_r11, 69, 51, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck13_r9 = new ModelRenderer(this);
        this.neck13_r9.setRotationPoint(1.1F, 0.044F, -4.7652F);
        this.chest1.addChild(neck13_r9);
        this.setRotateAngle(neck13_r9, 0.0032F, -0.0165F, 0.2624F);
        this.neck13_r9.cubeList.add(new ModelBox(neck13_r9, 90, 32, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck14_r12 = new ModelRenderer(this);
        this.neck14_r12.setRotationPoint(1.1F, 0.044F, -2.7652F);
        this.chest1.addChild(neck14_r12);
        this.setRotateAngle(neck14_r12, -0.0175F, 0.005F, 1.2486F);
        this.neck14_r12.cubeList.add(new ModelBox(neck14_r12, 56, 24, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck13_r10 = new ModelRenderer(this);
        this.neck13_r10.setRotationPoint(1.1F, 0.044F, -2.7652F);
        this.chest1.addChild(neck13_r10);
        this.setRotateAngle(neck13_r10, -0.0179F, -0.0028F, 0.8123F);
        this.neck13_r10.cubeList.add(new ModelBox(neck13_r10, 80, 25, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck12_r7 = new ModelRenderer(this);
        this.neck12_r7.setRotationPoint(1.1F, 0.044F, -2.7652F);
        this.chest1.addChild(neck12_r7);
        this.setRotateAngle(neck12_r7, -0.0136F, -0.012F, 0.2452F);
        this.neck12_r7.cubeList.add(new ModelBox(neck12_r7, 19, 100, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck13_r11 = new ModelRenderer(this);
        this.neck13_r11.setRotationPoint(1.1F, 0.044F, -0.7652F);
        this.chest1.addChild(neck13_r11);
        this.setRotateAngle(neck13_r11, -0.0175F, 0.005F, 1.2311F);
        this.neck13_r11.cubeList.add(new ModelBox(neck13_r11, 56, 26, 4.6791F, -3.3688F, -0.5F, 11, 0, 1, 0.0F, false));

        this.neck12_r8 = new ModelRenderer(this);
        this.neck12_r8.setRotationPoint(1.1F, 0.044F, -0.7652F);
        this.chest1.addChild(neck12_r8);
        this.setRotateAngle(neck12_r8, -0.0179F, -0.0028F, 0.7949F);
        this.neck12_r8.cubeList.add(new ModelBox(neck12_r8, 82, 27, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck11_r4 = new ModelRenderer(this);
        this.neck11_r4.setRotationPoint(1.1F, 0.044F, -0.7652F);
        this.chest1.addChild(neck11_r4);
        this.setRotateAngle(neck11_r4, -0.0136F, -0.012F, 0.2277F);
        this.neck11_r4.cubeList.add(new ModelBox(neck11_r4, 26, 100, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.upperarm1 = new ModelRenderer(this);
        this.upperarm1.setRotationPoint(4.9F, 9.9124F, -14.521F);
        this.chest1.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 0.7531F, 0.0F, -0.6374F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 58, 67, -1.187F, -1.2195F, -2.4098F, 2, 4, 5, 0.0F, false));
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 93, 53, -1.187F, 2.7805F, -1.4098F, 2, 2, 3, 0.0F, false));
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 81, 30, -1.187F, 4.7805F, -1.9098F, 2, 3, 4, 0.0F, false));

        this.lowerarm1 = new ModelRenderer(this);
        this.lowerarm1.setRotationPoint(0.1698F, 8.7583F, 0.8645F);
        this.upperarm1.addChild(lowerarm1);
        this.setRotateAngle(lowerarm1, -0.747F, 0.1776F, 0.6672F);


        this.lowerarm4_r1 = new ModelRenderer(this);
        this.lowerarm4_r1.setRotationPoint(0.5319F, 1.9572F, -0.1557F);
        this.lowerarm1.addChild(lowerarm4_r1);
        this.setRotateAngle(lowerarm4_r1, -0.3572F, 1.2533F, -0.2064F);
        this.lowerarm4_r1.cubeList.add(new ModelBox(lowerarm4_r1, 5, 48, -0.5028F, -5.4287F, 0.0764F, 1, 3, 2, 0.0F, false));
        this.lowerarm4_r1.cubeList.add(new ModelBox(lowerarm4_r1, 89, 42, -1.5028F, -2.4287F, -0.5236F, 3, 3, 3, 0.0F, false));
        this.lowerarm4_r1.cubeList.add(new ModelBox(lowerarm4_r1, 43, 92, -1.0028F, 0.5713F, -0.0236F, 2, 5, 2, 0.0F, false));

        this.lowerarm2_r1 = new ModelRenderer(this);
        this.lowerarm2_r1.setRotationPoint(0.5319F, 1.9572F, -0.1557F);
        this.lowerarm1.addChild(lowerarm2_r1);
        this.setRotateAngle(lowerarm2_r1, -0.2438F, 1.2533F, -0.2064F);
        this.lowerarm2_r1.cubeList.add(new ModelBox(lowerarm2_r1, 97, 79, -0.9959F, -0.253F, -2.5242F, 2, 2, 2, 0.0F, false));
        this.lowerarm2_r1.cubeList.add(new ModelBox(lowerarm2_r1, 9, 0, -0.4959F, 1.747F, -2.0242F, 1, 4, 1, 0.0F, false));

        this.hand1 = new ModelRenderer(this);
        this.hand1.setRotationPoint(-0.5421F, 8.0269F, -1.4569F);
        this.lowerarm1.addChild(hand1);
        this.setRotateAngle(hand1, 1.2216F, -0.0234F, 0.0077F);


        this.hand2_r1 = new ModelRenderer(this);
        this.hand2_r1.setRotationPoint(0.554F, 3.2812F, -2.4371F);
        this.hand1.addChild(hand2_r1);
        this.setRotateAngle(hand2_r1, -0.4363F, 0.0F, 0.0F);
        this.hand2_r1.cubeList.add(new ModelBox(hand2_r1, 20, 69, -3.0F, -1.9081F, -3.3012F, 6, 2, 3, 0.003F, false));

        this.hand2_r2 = new ModelRenderer(this);
        this.hand2_r2.setRotationPoint(0.5193F, 2.0518F, -2.7835F);
        this.hand1.addChild(hand2_r2);
        this.setRotateAngle(hand2_r2, 0.1309F, 0.0F, 0.0F);
        this.hand2_r2.cubeList.add(new ModelBox(hand2_r2, 80, 20, -2.9652F, -0.844F, -0.1182F, 6, 2, 2, 0.0F, false));

        this.hand2_r3 = new ModelRenderer(this);
        this.hand2_r3.setRotationPoint(-1.446F, 0.4068F, -0.5623F);
        this.hand1.addChild(hand2_r3);
        this.setRotateAngle(hand2_r3, 0.481F, 0.3133F, -0.5334F);
        this.hand2_r3.cubeList.add(new ModelBox(hand2_r3, 70, 80, -1.0F, 0.2F, -1.0F, 2, 1, 2, 0.0F, false));

        this.hand2_r4 = new ModelRenderer(this);
        this.hand2_r4.setRotationPoint(2.754F, 0.4068F, -0.5623F);
        this.hand1.addChild(hand2_r4);
        this.setRotateAngle(hand2_r4, 0.532F, -0.2071F, 0.3361F);
        this.hand2_r4.cubeList.add(new ModelBox(hand2_r4, 48, 73, -1.0F, -0.1F, -1.0F, 2, 1, 2, 0.0F, false));

        this.hand1_r1 = new ModelRenderer(this);
        this.hand1_r1.setRotationPoint(-1.446F, 0.4068F, -0.5623F);
        this.hand1.addChild(hand1_r1);
        this.setRotateAngle(hand1_r1, 0.5672F, 0.0F, 0.0F);
        this.hand1_r1.cubeList.add(new ModelBox(hand1_r1, 99, 25, 1.1F, -0.5F, -1.0F, 2, 1, 2, 0.003F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(-4.9F, 9.9124F, -14.521F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, -0.3377F, 0.0F, 0.6374F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 5, 67, -0.813F, -1.2195F, -2.4098F, 2, 4, 5, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 92, 87, -0.813F, 2.7805F, -1.4098F, 2, 2, 3, 0.0F, false));
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 61, 80, -0.813F, 4.7805F, -1.9098F, 2, 3, 4, 0.0F, false));

        this.lowerarm2 = new ModelRenderer(this);
        this.lowerarm2.setRotationPoint(-0.1698F, 8.7583F, 0.8645F);
        this.upperarm2.addChild(lowerarm2);
        this.setRotateAngle(lowerarm2, -0.451F, -0.1179F, -0.6028F);


        this.lowerarm5_r1 = new ModelRenderer(this);
        this.lowerarm5_r1.setRotationPoint(-0.0319F, 2.2572F, 0.0443F);
        this.lowerarm2.addChild(lowerarm5_r1);
        this.setRotateAngle(lowerarm5_r1, -0.2438F, -1.2534F, 0.2064F);
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 45, 46, -0.5972F, -5.5287F, 0.0764F, 1, 3, 2, 0.0F, false));
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 54, 88, -1.5972F, -2.5287F, -0.5236F, 3, 3, 3, 0.0F, false));
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 12, 92, -1.0972F, 0.4713F, -0.0236F, 2, 5, 2, 0.0F, false));
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 72, 97, -1.1041F, -0.353F, -2.5242F, 2, 2, 2, 0.0F, false));
        this.lowerarm5_r1.cubeList.add(new ModelBox(lowerarm5_r1, 0, 0, -0.6041F, 1.647F, -2.0242F, 1, 4, 1, 0.0F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.5421F, 8.0269F, -1.4569F);
        this.lowerarm2.addChild(hand2);
        this.setRotateAngle(hand2, 0.873F, -0.0383F, -0.0694F);


        this.hand3_r1 = new ModelRenderer(this);
        this.hand3_r1.setRotationPoint(-0.554F, 3.2812F, -2.4371F);
        this.hand2.addChild(hand3_r1);
        this.setRotateAngle(hand3_r1, -0.4363F, 0.0F, 0.0F);
        this.hand3_r1.cubeList.add(new ModelBox(hand3_r1, 66, 28, -3.0F, -1.9081F, -3.3012F, 6, 2, 3, 0.003F, false));

        this.hand3_r2 = new ModelRenderer(this);
        this.hand3_r2.setRotationPoint(-0.5193F, 2.0518F, -2.7835F);
        this.hand2.addChild(hand3_r2);
        this.setRotateAngle(hand3_r2, 0.1309F, 0.0F, 0.0F);
        this.hand3_r2.cubeList.add(new ModelBox(hand3_r2, 79, 51, -3.0348F, -0.844F, -0.1182F, 6, 2, 2, 0.0F, false));

        this.hand3_r3 = new ModelRenderer(this);
        this.hand3_r3.setRotationPoint(1.446F, 0.4068F, -0.5623F);
        this.hand2.addChild(hand3_r3);
        this.setRotateAngle(hand3_r3, 0.481F, -0.3133F, 0.5334F);
        this.hand3_r3.cubeList.add(new ModelBox(hand3_r3, 79, 45, -1.0F, 0.2F, -1.0F, 2, 1, 2, 0.0F, false));

        this.hand3_r4 = new ModelRenderer(this);
        this.hand3_r4.setRotationPoint(-2.754F, 0.4068F, -0.5623F);
        this.hand2.addChild(hand3_r4);
        this.setRotateAngle(hand3_r4, 0.532F, 0.2071F, -0.3361F);
        this.hand3_r4.cubeList.add(new ModelBox(hand3_r4, 20, 29, -1.0F, -0.1F, -1.0F, 2, 1, 2, 0.0F, false));

        this.hand2_r5 = new ModelRenderer(this);
        this.hand2_r5.setRotationPoint(1.446F, 0.4068F, -0.5623F);
        this.hand2.addChild(hand2_r5);
        this.setRotateAngle(hand2_r5, 0.5672F, 0.0F, 0.0F);
        this.hand2_r5.cubeList.add(new ModelBox(hand2_r5, 98, 73, -3.1F, -0.5F, -1.0F, 2, 1, 2, 0.003F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.3101F, -14.483F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0873F, -0.3054F, 0.0F);


        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(0.1F, -0.1083F, -6.8073F);
        this.neck1.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, -0.2182F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 81, 99, 0.0F, -7.0829F, 5.7611F, 0, 6, 1, 0.0F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 41, 80, 0.0F, -6.1829F, 3.7611F, 0, 5, 1, 0.0F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 3, 100, 0.0F, -5.3829F, 1.7611F, 0, 5, 1, 0.0F, false));
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 6, 100, 0.0F, -4.3829F, -0.2389F, 0, 5, 1, 0.0F, false));

        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.1F, 0.5006F, -8.8397F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0785F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 20, 0, -1.0F, 0.4787F, -1.4445F, 2, 2, 11, -0.2F, false));
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 38, 5, -1.0F, -0.5213F, 0.0555F, 2, 2, 9, 0.0F, false));

        this.neck23_r1 = new ModelRenderer(this);
        this.neck23_r1.setRotationPoint(-1.1F, 0.8338F, -6.2822F);
        this.neck1.addChild(neck23_r1);
        this.setRotateAngle(neck23_r1, 0.3398F, 0.4946F, -1.2698F);
        this.neck23_r1.cubeList.add(new ModelBox(neck23_r1, 52, 4, -3.6346F, -0.8851F, -0.5371F, 2, 0, 1, 0.0F, true));

        this.neck22_r1 = new ModelRenderer(this);
        this.neck22_r1.setRotationPoint(-1.1F, 0.8338F, -6.2822F);
        this.neck1.addChild(neck22_r1);
        this.setRotateAngle(neck22_r1, 0.5444F, 0.2452F, -0.7204F);
        this.neck22_r1.cubeList.add(new ModelBox(neck22_r1, 45, 52, -1.8542F, 0.1318F, -0.5371F, 2, 0, 1, 0.0F, true));

        this.neck22_r2 = new ModelRenderer(this);
        this.neck22_r2.setRotationPoint(-1.1F, 0.7338F, -4.2822F);
        this.neck1.addChild(neck22_r2);
        this.setRotateAngle(neck22_r2, 0.2594F, 0.3857F, -1.1296F);
        this.neck22_r2.cubeList.add(new ModelBox(neck22_r2, 15, 53, -3.6076F, -0.8916F, -0.5153F, 2, 0, 1, 0.0F, true));

        this.neck21_r1 = new ModelRenderer(this);
        this.neck21_r1.setRotationPoint(-1.1F, 0.7338F, -4.2822F);
        this.neck1.addChild(neck21_r1);
        this.setRotateAngle(neck21_r1, 0.4225F, 0.1907F, -0.5723F);
        this.neck21_r1.cubeList.add(new ModelBox(neck21_r1, 68, 18, -1.8349F, 0.1119F, -0.5153F, 2, 0, 1, 0.0F, true));

        this.neck20_r2 = new ModelRenderer(this);
        this.neck20_r2.setRotationPoint(-1.1F, 0.5338F, -2.2822F);
        this.neck1.addChild(neck20_r2);
        this.setRotateAngle(neck20_r2, 0.3824F, 0.172F, -0.4486F);
        this.neck20_r2.cubeList.add(new ModelBox(neck20_r2, 70, 22, -1.8224F, 0.092F, -0.5038F, 2, 0, 1, 0.0F, true));

        this.neck21_r2 = new ModelRenderer(this);
        this.neck21_r2.setRotationPoint(-1.1F, 0.5338F, -2.2822F);
        this.neck1.addChild(neck21_r2);
        this.setRotateAngle(neck21_r2, 0.2343F, 0.3489F, -1.0077F);
        this.neck21_r2.cubeList.add(new ModelBox(neck21_r2, 40, 35, -4.5865F, -0.9016F, -0.5038F, 3, 0, 1, 0.0F, true));

        this.neck19_r4 = new ModelRenderer(this);
        this.neck19_r4.setRotationPoint(-1.1F, 0.3338F, -0.2822F);
        this.neck1.addChild(neck19_r4);
        this.setRotateAngle(neck19_r4, 0.2638F, 0.1141F, -0.4655F);
        this.neck19_r4.cubeList.add(new ModelBox(neck19_r4, 71, 6, -1.8224F, 0.092F, -0.5038F, 2, 0, 1, 0.0F, true));

        this.neck20_r3 = new ModelRenderer(this);
        this.neck20_r3.setRotationPoint(-1.1F, 0.3338F, -0.2822F);
        this.neck1.addChild(neck20_r3);
        this.setRotateAngle(neck20_r3, 0.1625F, 0.2374F, -1.0285F);
        this.neck20_r3.cubeList.add(new ModelBox(neck20_r3, 0, 31, -5.5865F, -0.9016F, -0.5038F, 4, 0, 1, 0.0F, true));

        this.neck21_r3 = new ModelRenderer(this);
        this.neck21_r3.setRotationPoint(-1.1F, 0.3338F, -0.2822F);
        this.neck1.addChild(neck21_r3);
        this.setRotateAngle(neck21_r3, 0.0449F, 0.2834F, -1.4778F);
        this.neck21_r3.cubeList.add(new ModelBox(neck21_r3, 73, 34, -6.6613F, -3.1696F, -0.5038F, 2, 0, 1, 0.0F, true));

        this.neck21_r4 = new ModelRenderer(this);
        this.neck21_r4.setRotationPoint(1.1F, 0.8338F, -6.2822F);
        this.neck1.addChild(neck21_r4);
        this.setRotateAngle(neck21_r4, 0.5444F, -0.2452F, 0.7204F);
        this.neck21_r4.cubeList.add(new ModelBox(neck21_r4, 45, 52, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck22_r3 = new ModelRenderer(this);
        this.neck22_r3.setRotationPoint(1.1F, 0.8338F, -6.2822F);
        this.neck1.addChild(neck22_r3);
        this.setRotateAngle(neck22_r3, 0.3398F, -0.4946F, 1.2698F);
        this.neck22_r3.cubeList.add(new ModelBox(neck22_r3, 52, 4, 1.6868F, -1.0746F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck20_r4 = new ModelRenderer(this);
        this.neck20_r4.setRotationPoint(1.1F, 0.7338F, -4.2822F);
        this.neck1.addChild(neck20_r4);
        this.setRotateAngle(neck20_r4, 0.4225F, -0.1907F, 0.5723F);
        this.neck20_r4.cubeList.add(new ModelBox(neck20_r4, 68, 18, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck21_r5 = new ModelRenderer(this);
        this.neck21_r5.setRotationPoint(1.1F, 0.7338F, -4.2822F);
        this.neck1.addChild(neck21_r5);
        this.setRotateAngle(neck21_r5, 0.2594F, -0.3857F, 1.1296F);
        this.neck21_r5.cubeList.add(new ModelBox(neck21_r5, 15, 53, 1.6868F, -1.0746F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck20_r5 = new ModelRenderer(this);
        this.neck20_r5.setRotationPoint(1.1F, 0.5338F, -2.2822F);
        this.neck1.addChild(neck20_r5);
        this.setRotateAngle(neck20_r5, 0.2343F, -0.3489F, 1.0077F);
        this.neck20_r5.cubeList.add(new ModelBox(neck20_r5, 40, 35, 1.6868F, -1.0746F, -0.5F, 3, 0, 1, 0.0F, false));

        this.neck19_r5 = new ModelRenderer(this);
        this.neck19_r5.setRotationPoint(1.1F, 0.5338F, -2.2822F);
        this.neck1.addChild(neck19_r5);
        this.setRotateAngle(neck19_r5, 0.3824F, -0.172F, 0.4486F);
        this.neck19_r5.cubeList.add(new ModelBox(neck19_r5, 70, 22, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck20_r6 = new ModelRenderer(this);
        this.neck20_r6.setRotationPoint(1.1F, 0.3338F, -0.2822F);
        this.neck1.addChild(neck20_r6);
        this.setRotateAngle(neck20_r6, 0.0449F, -0.2834F, 1.4778F);
        this.neck20_r6.cubeList.add(new ModelBox(neck20_r6, 73, 34, 4.6791F, -3.3688F, -0.5F, 2, 0, 1, 0.0F, false));

        this.neck19_r6 = new ModelRenderer(this);
        this.neck19_r6.setRotationPoint(1.1F, 0.3338F, -0.2822F);
        this.neck1.addChild(neck19_r6);
        this.setRotateAngle(neck19_r6, 0.1625F, -0.2374F, 1.0285F);
        this.neck19_r6.cubeList.add(new ModelBox(neck19_r6, 0, 31, 1.6868F, -1.0746F, -0.5F, 4, 0, 1, 0.0F, false));

        this.neck18_r8 = new ModelRenderer(this);
        this.neck18_r8.setRotationPoint(1.1F, 0.3338F, -0.2822F);
        this.neck1.addChild(neck18_r8);
        this.setRotateAngle(neck18_r8, 0.2638F, -0.1141F, 0.4655F);
        this.neck18_r8.cubeList.add(new ModelBox(neck18_r8, 71, 6, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, 0.4948F, -8.3845F);
        this.neck1.addChild(head1);
        this.setRotateAngle(head1, 0.0457F, -0.3051F, -0.0138F);


        this.head6_r1 = new ModelRenderer(this);
        this.head6_r1.setRotationPoint(0.0F, -6.4803F, 0.6496F);
        this.head1.addChild(head6_r1);
        this.setRotateAngle(head6_r1, -0.3752F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 0, 77, -5.0F, 0.881F, -0.0003F, 2, 11, 2, 0.0F, true));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 0, 77, 3.0F, 0.881F, -0.0003F, 2, 11, 2, 0.0F, false));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 78, 6, -3.0F, -0.119F, -0.0003F, 6, 2, 2, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, 0.0197F, -1.5504F);
        this.head1.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.3491F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 64, 0, -3.5F, 1.9F, -1.5F, 7, 2, 3, 0.003F, false));
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 28, 41, -1.0F, -5.1F, -4.5F, 2, 9, 6, 0.0F, false));

        this.head2_r1 = new ModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, -6.549F, 0.8223F);
        this.head1.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.0611F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 48, 77, -2.0F, -0.0651F, -4.0846F, 4, 2, 4, 0.0F, false));

        this.head2_r2 = new ModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, -5.9803F, -5.2504F);
        this.head1.addChild(head2_r2);
        this.setRotateAngle(head2_r2, 0.8901F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 35, 73, -2.0F, -0.0181F, -3.9934F, 4, 2, 4, 0.0F, false));

        this.head1_r1 = new ModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -6.4803F, -6.5504F);
        this.head1.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.1745F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 90, 68, -2.0F, 0.7F, 1.2F, 4, 2, 2, -0.003F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.3197F, -2.4504F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0822F, 0.0F, 0.0F);


        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, -0.6F, -5.3F);
        this.head2.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.3491F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 15, 67, -2.79F, -1.5F, -5.4F, 1, 2, 2, -0.25F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 99, 40, -3.43F, -1.5F, -1.2F, 1, 2, 2, 0.1F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 15, 48, -3.79F, -1.5F, -1.2F, 1, 2, 2, -0.25F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 15, 58, -4.1F, -1.5F, -1.2F, 2, 2, 2, -0.5F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 15, 58, 2.1F, -1.5F, -1.2F, 2, 2, 2, -0.5F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 15, 48, 2.79F, -1.5F, -1.2F, 1, 2, 2, -0.25F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 15, 67, 1.79F, -1.5F, -5.4F, 1, 2, 2, -0.25F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 99, 40, 2.43F, -1.5F, -1.2F, 1, 2, 2, 0.1F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 20, 18, -3.5F, -2.2F, -1.7F, 7, 5, 5, 0.01F, false));

        this.head5_r2 = new ModelRenderer(this);
        this.head5_r2.setRotationPoint(-4.0F, 1.7F, -5.1F);
        this.head2.addChild(head5_r2);
        this.setRotateAngle(head5_r2, 0.5708F, -0.0981F, -0.0729F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 28, 57, 0.6706F, -2.4982F, 3.7216F, 1, 2, 8, 0.01F, true));
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 89, 61, 1.6706F, -2.4982F, 7.7216F, 2, 2, 4, 0.01F, true));

        this.head5_r3 = new ModelRenderer(this);
        this.head5_r3.setRotationPoint(4.0F, 1.7F, -5.1F);
        this.head2.addChild(head5_r3);
        this.setRotateAngle(head5_r3, 0.5708F, 0.0981F, 0.0729F);
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 89, 61, -3.6706F, -2.4982F, 7.7216F, 2, 2, 4, 0.01F, false));
        this.head5_r3.cubeList.add(new ModelBox(head5_r3, 28, 57, -1.6706F, -2.4982F, 3.7216F, 1, 2, 8, 0.01F, false));

        this.beak1 = new ModelRenderer(this);
        this.beak1.setRotationPoint(0.0F, 0.9F, -6.0F);
        this.head2.addChild(beak1);
        this.setRotateAngle(beak1, -0.0897F, 0.0F, 0.0F);


        this.beak2 = new ModelRenderer(this);
        this.beak2.setRotationPoint(0.0F, -5.1F, 2.7F);
        this.beak1.addChild(beak2);
        this.setRotateAngle(beak2, 0.3142F, 0.0F, 0.0F);


        this.beak3_r1 = new ModelRenderer(this);
        this.beak3_r1.setRotationPoint(0.0F, 1.0F, -7.8F);
        this.beak2.addChild(beak3_r1);
        this.setRotateAngle(beak3_r1, 0.1396F, 0.0F, 0.0F);
        this.beak3_r1.cubeList.add(new ModelBox(beak3_r1, 40, 24, -2.5F, 0.0F, 0.0F, 5, 5, 5, 0.01F, false));

        this.beak2_r1 = new ModelRenderer(this);
        this.beak2_r1.setRotationPoint(0.0F, 0.4F, -3.7F);
        this.beak2.addChild(beak2_r1);
        this.setRotateAngle(beak2_r1, 0.4014F, 0.0F, 0.0F);
        this.beak2_r1.cubeList.add(new ModelBox(beak2_r1, 76, 70, -2.5F, 0.0236F, 0.0564F, 5, 3, 3, 0.01F, false));

        this.beak3 = new ModelRenderer(this);
        this.beak3.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.beak2.addChild(beak3);
        this.setRotateAngle(beak3, 0.7629F, 0.0F, 0.0F);


        this.beak3_r2 = new ModelRenderer(this);
        this.beak3_r2.setRotationPoint(0.0F, -0.5F, -7.0F);
        this.beak3.addChild(beak3_r2);
        this.setRotateAngle(beak3_r2, 0.0175F, 0.0F, 0.0F);
        this.beak3_r2.cubeList.add(new ModelBox(beak3_r2, 79, 77, -2.0F, 0.0F, -0.1F, 4, 4, 3, 0.0F, false));

        this.beak4 = new ModelRenderer(this);
        this.beak4.setRotationPoint(0.0F, 1.2F, -4.4F);
        this.beak3.addChild(beak4);
        this.setRotateAngle(beak4, -0.8196F, 0.0F, 0.0F);


        this.beak4_r1 = new ModelRenderer(this);
        this.beak4_r1.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.beak4.addChild(beak4_r1);
        this.setRotateAngle(beak4_r1, -0.3491F, 0.0F, 0.0F);
        this.beak4_r1.cubeList.add(new ModelBox(beak4_r1, 75, 38, -2.0F, 0.1F, -1.1F, 4, 2, 4, 0.01F, false));

        this.tusk1 = new ModelRenderer(this);
        this.tusk1.setRotationPoint(0.6F, 1.0F, 0.9F);
        this.beak1.addChild(tusk1);
        this.setRotateAngle(tusk1, -1.0846F, 0.0458F, 2.907F);


        this.tusk1_r1 = new ModelRenderer(this);
        this.tusk1_r1.setRotationPoint(-1.3085F, 0.0845F, 1.1634F);
        this.tusk1.addChild(tusk1_r1);
        this.setRotateAngle(tusk1_r1, 0.0F, 0.0436F, 0.0F);
        this.tusk1_r1.cubeList.add(new ModelBox(tusk1_r1, 71, 61, -0.9F, -0.5F, -5.9F, 1, 2, 6, 0.0F, false));

        this.tusk2_r1 = new ModelRenderer(this);
        this.tusk2_r1.setRotationPoint(-2.1085F, 1.3845F, -4.8366F);
        this.tusk1.addChild(tusk2_r1);
        this.setRotateAngle(tusk2_r1, -1.4186F, 0.1321F, -0.1458F);
        this.tusk2_r1.cubeList.add(new ModelBox(tusk2_r1, 0, 91, -0.1819F, -3.2899F, 0.2477F, 2, 3, 3, -0.01F, false));

        this.fronttusk1 = new ModelRenderer(this);
        this.fronttusk1.setRotationPoint(-2.0085F, 0.6345F, -3.1366F);
        this.tusk1.addChild(fronttusk1);
        this.setRotateAngle(fronttusk1, 0.4508F, 0.1848F, -0.1952F);


        this.fronttusk3_r1 = new ModelRenderer(this);
        this.fronttusk3_r1.setRotationPoint(0.2F, -2.031F, -1.6601F);
        this.fronttusk1.addChild(fronttusk3_r1);
        this.setRotateAngle(fronttusk3_r1, -0.9076F, 0.0F, -0.1745F);
        this.fronttusk3_r1.cubeList.add(new ModelBox(fronttusk3_r1, 90, 81, -0.5F, -1.0657F, -3.7406F, 1, 1, 4, -0.003F, false));

        this.fronttusk2_r1 = new ModelRenderer(this);
        this.fronttusk2_r1.setRotationPoint(0.2F, -2.031F, -1.6601F);
        this.fronttusk1.addChild(fronttusk2_r1);
        this.setRotateAngle(fronttusk2_r1, -1.1345F, 0.0F, -0.1745F);
        this.fronttusk2_r1.cubeList.add(new ModelBox(fronttusk2_r1, 91, 73, -0.5F, -0.1691F, -3.9959F, 1, 1, 4, 0.003F, false));

        this.fronttusk1_r1 = new ModelRenderer(this);
        this.fronttusk1_r1.setRotationPoint(0.2F, 0.1F, -0.6F);
        this.fronttusk1.addChild(fronttusk1_r1);
        this.setRotateAngle(fronttusk1_r1, -0.9163F, 0.0F, 0.0F);
        this.fronttusk1_r1.cubeList.add(new ModelBox(fronttusk1_r1, 97, 32, -0.5F, -1.6F, -2.5F, 1, 2, 3, 0.0F, false));

        this.tusk3 = new ModelRenderer(this);
        this.tusk3.setRotationPoint(-0.6F, 1.0F, 0.9F);
        this.beak1.addChild(tusk3);
        this.setRotateAngle(tusk3, -1.0846F, -0.0458F, -2.907F);


        this.tusk2_r2 = new ModelRenderer(this);
        this.tusk2_r2.setRotationPoint(1.3085F, 0.0845F, 1.1634F);
        this.tusk3.addChild(tusk2_r2);
        this.setRotateAngle(tusk2_r2, 0.0F, -0.0436F, 0.0F);
        this.tusk2_r2.cubeList.add(new ModelBox(tusk2_r2, 71, 61, -0.1F, -0.5F, -5.9F, 1, 2, 6, 0.0F, true));

        this.tusk3_r1 = new ModelRenderer(this);
        this.tusk3_r1.setRotationPoint(2.1085F, 1.3845F, -4.8366F);
        this.tusk3.addChild(tusk3_r1);
        this.setRotateAngle(tusk3_r1, -1.4186F, -0.1321F, 0.1458F);
        this.tusk3_r1.cubeList.add(new ModelBox(tusk3_r1, 0, 91, -1.8181F, -3.2899F, 0.2477F, 2, 3, 3, -0.01F, true));

        this.fronttusk3 = new ModelRenderer(this);
        this.fronttusk3.setRotationPoint(2.0085F, 0.6345F, -3.1366F);
        this.tusk3.addChild(fronttusk3);
        this.setRotateAngle(fronttusk3, 0.4508F, -0.1848F, 0.1952F);


        this.fronttusk4_r1 = new ModelRenderer(this);
        this.fronttusk4_r1.setRotationPoint(-0.2F, -2.031F, -1.6601F);
        this.fronttusk3.addChild(fronttusk4_r1);
        this.setRotateAngle(fronttusk4_r1, -0.9076F, 0.0F, 0.1745F);
        this.fronttusk4_r1.cubeList.add(new ModelBox(fronttusk4_r1, 90, 81, -0.5F, -1.0657F, -3.7406F, 1, 1, 4, -0.003F, true));

        this.fronttusk3_r2 = new ModelRenderer(this);
        this.fronttusk3_r2.setRotationPoint(-0.2F, -2.031F, -1.6601F);
        this.fronttusk3.addChild(fronttusk3_r2);
        this.setRotateAngle(fronttusk3_r2, -1.1345F, 0.0F, 0.1745F);
        this.fronttusk3_r2.cubeList.add(new ModelBox(fronttusk3_r2, 91, 73, -0.5F, -0.1691F, -3.9959F, 1, 1, 4, 0.003F, true));

        this.fronttusk2_r2 = new ModelRenderer(this);
        this.fronttusk2_r2.setRotationPoint(-0.2F, 0.1F, -0.6F);
        this.fronttusk3.addChild(fronttusk2_r2);
        this.setRotateAngle(fronttusk2_r2, -0.9163F, 0.0F, 0.0F);
        this.fronttusk2_r2.cubeList.add(new ModelBox(fronttusk2_r2, 97, 32, -0.5F, -1.6F, -2.5F, 1, 2, 3, 0.0F, true));

        this.tusk2 = new ModelRenderer(this);
        this.tusk2.setRotationPoint(-1.9F, -0.7F, 0.9F);
        this.beak1.addChild(tusk2);
        this.setRotateAngle(tusk2, -1.0221F, 0.0822F, -2.5756F);


        this.fronttusk2 = new ModelRenderer(this);
        this.fronttusk2.setRotationPoint(0.7F, -0.4F, -5.1F);
        this.tusk2.addChild(fronttusk2);
        this.setRotateAngle(fronttusk2, 0.3336F, -0.253F, -0.0157F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.4F, -1.3F);
        this.head2.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.2182F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 32, 91, 1.5F, -0.5469F, -5.4725F, 2, 3, 3, -0.006F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 32, 91, -3.5F, -0.5469F, -5.4725F, 2, 3, 3, -0.006F, true));

        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-3.0F, -0.3639F, -1.4464F);
        this.jaw1.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.3054F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 25, 75, -0.5F, -0.0132F, -1.9763F, 2, 2, 2, 0.0F, true));
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 25, 75, 4.5F, -0.0132F, -1.9763F, 2, 2, 2, 0.0F, false));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(-3.0F, 2.4531F, -2.3725F);
        this.jaw1.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.0873F, 0.0F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 21, 94, -0.5F, -2.0F, -0.3F, 2, 2, 3, -0.003F, true));
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 21, 94, 4.5F, -2.0F, -0.3F, 2, 2, 3, -0.003F, false));

        this.jaw4_r2 = new ModelRenderer(this);
        this.jaw4_r2.setRotationPoint(-3.0F, 1.9531F, 0.7007F);
        this.jaw1.addChild(jaw4_r2);
        this.setRotateAngle(jaw4_r2, -1.309F, 0.0F, 0.0F);
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 96, 15, -0.5F, 0.0F, -2.4F, 2, 1, 3, -0.006F, true));
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 96, 15, 4.5F, 0.0F, -2.4F, 2, 1, 3, -0.006F, false));

        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(-3.0F, 1.8531F, 0.5275F);
        this.jaw1.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, -0.5236F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 97, 20, -0.5F, -1.0F, -2.8F, 2, 2, 2, 0.002F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 97, 20, 4.5F, -1.0F, -2.8F, 2, 2, 2, 0.002F, false));

        this.lowerbeak1 = new ModelRenderer(this);
        this.lowerbeak1.setRotationPoint(0.0F, 1.1531F, -5.2725F);
        this.jaw1.addChild(lowerbeak1);
        this.setRotateAngle(lowerbeak1, 0.0848F, 0.0F, 0.0F);
        this.lowerbeak1.cubeList.add(new ModelBox(lowerbeak1, 36, 4, 1.0F, -1.6809F, -2.1908F, 2, 3, 3, -0.003F, false));
        this.lowerbeak1.cubeList.add(new ModelBox(lowerbeak1, 36, 4, -3.0F, -1.6809F, -2.1908F, 2, 3, 3, -0.003F, true));

        this.lowerbeak2_r1 = new ModelRenderer(this);
        this.lowerbeak2_r1.setRotationPoint(-2.5F, -2.3F, -2.4F);
        this.lowerbeak1.addChild(lowerbeak2_r1);
        this.setRotateAngle(lowerbeak2_r1, 0.0524F, 0.0F, 0.0F);
        this.lowerbeak2_r1.cubeList.add(new ModelBox(lowerbeak2_r1, 95, 9, -0.5F, 0.0341F, -0.038F, 2, 1, 3, 0.0F, true));
        this.lowerbeak2_r1.cubeList.add(new ModelBox(lowerbeak2_r1, 95, 9, 3.5F, 0.0341F, -0.038F, 2, 1, 3, 0.0F, false));

        this.lowerbeak3_r1 = new ModelRenderer(this);
        this.lowerbeak3_r1.setRotationPoint(-2.5F, -2.4F, 0.5F);
        this.lowerbeak1.addChild(lowerbeak3_r1);
        this.setRotateAngle(lowerbeak3_r1, -0.5236F, 0.0F, 0.0F);
        this.lowerbeak3_r1.cubeList.add(new ModelBox(lowerbeak3_r1, 94, 49, -0.5F, -0.041F, 0.0213F, 2, 1, 2, 0.003F, true));
        this.lowerbeak3_r1.cubeList.add(new ModelBox(lowerbeak3_r1, 94, 49, 3.5F, -0.041F, 0.0213F, 2, 1, 2, 0.003F, false));

        this.lowerbeak2 = new ModelRenderer(this);
        this.lowerbeak2.setRotationPoint(0.0F, 1.4F, -2.2F);
        this.lowerbeak1.addChild(lowerbeak2);
        this.setRotateAngle(lowerbeak2, -0.6981F, 0.0F, 0.0F);


        this.lowerbeak4_r1 = new ModelRenderer(this);
        this.lowerbeak4_r1.setRotationPoint(0.0F, 0.074F, -1.6243F);
        this.lowerbeak2.addChild(lowerbeak4_r1);
        this.setRotateAngle(lowerbeak4_r1, 0.0436F, 0.0F, 0.0F);
        this.lowerbeak4_r1.cubeList.add(new ModelBox(lowerbeak4_r1, 85, 0, -1.5F, -2.1F, -1.3F, 3, 2, 3, -0.003F, false));

        this.lowerbeak4_r2 = new ModelRenderer(this);
        this.lowerbeak4_r2.setRotationPoint(-1.0F, -1.9F, -1.75F);
        this.lowerbeak2.addChild(lowerbeak4_r2);
        this.setRotateAngle(lowerbeak4_r2, -0.2182F, 0.0F, 0.0F);
        this.lowerbeak4_r2.cubeList.add(new ModelBox(lowerbeak4_r2, 95, 3, -1.5F, -0.6F, -0.95F, 2, 2, 3, -0.003F, true));
        this.lowerbeak4_r2.cubeList.add(new ModelBox(lowerbeak4_r2, 95, 3, 1.5F, -0.6F, -0.95F, 2, 2, 3, -0.003F, false));

        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, 0.8027F, 9.7707F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0911F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(-4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -2.5307F, 0.0F, -0.4625F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 90, 25, -1.7708F, -5.1323F, 3.1803F, 2, 2, 4, -0.003F, true));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(-4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r2);
        this.setRotateAngle(basin_r2, -1.309F, 0.0F, -0.4625F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 86, 11, -1.7708F, 2.0869F, 1.3724F, 2, 2, 4, 0.0F, true));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(-4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r3);
        this.setRotateAngle(basin_r3, -2.1206F, 0.0F, -0.4625F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 92, 93, -1.7708F, -0.1848F, 0.8847F, 2, 2, 3, -0.003F, true));

        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(-4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -2.1118F, 0.0F, -0.4625F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 15, 75, -1.7708F, -5.714F, 1.1952F, 2, 3, 5, 0.0F, true));

        this.basin_r5 = new ModelRenderer(this);
        this.basin_r5.setRotationPoint(-4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r5);
        this.setRotateAngle(basin_r5, -1.5446F, 0.0F, -0.4625F);
        this.basin_r5.cubeList.add(new ModelBox(basin_r5, 52, 0, -1.7708F, -2.2519F, -0.1067F, 2, 5, 7, 0.003F, true));

        this.basin_r6 = new ModelRenderer(this);
        this.basin_r6.setRotationPoint(-4.2292F, -2.9924F, 0.6611F);
        this.basin1.addChild(basin_r6);
        this.setRotateAngle(basin_r6, -0.6545F, 0.0F, 0.0F);
        this.basin_r6.cubeList.add(new ModelBox(basin_r6, 80, 56, -1.7708F, -0.0847F, -0.0477F, 2, 4, 4, 0.0F, true));

        this.basin_r7 = new ModelRenderer(this);
        this.basin_r7.setRotationPoint(-4.2292F, -1.8924F, 6.1611F);
        this.basin1.addChild(basin_r7);
        this.setRotateAngle(basin_r7, -1.2043F, 0.0F, 0.0F);
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 68, 8, -1.7708F, -0.086F, 0.0141F, 2, 4, 5, 0.0F, true));
        this.basin_r7.cubeList.add(new ModelBox(basin_r7, 68, 8, 8.2292F, -0.086F, 0.0141F, 2, 4, 5, 0.0F, false));

        this.basin_r8 = new ModelRenderer(this);
        this.basin_r8.setRotationPoint(-4.2292F, 2.9076F, 3.4611F);
        this.basin1.addChild(basin_r8);
        this.setRotateAngle(basin_r8, -1.5446F, 0.0F, 0.0F);
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 54, 28, -1.7708F, -1.2466F, -5.9068F, 2, 4, 7, 0.003F, true));
        this.basin_r8.cubeList.add(new ModelBox(basin_r8, 54, 28, 8.2292F, -1.2466F, -5.9068F, 2, 4, 7, 0.003F, false));

        this.basin_r9 = new ModelRenderer(this);
        this.basin_r9.setRotationPoint(-4.2292F, -2.8924F, 4.4611F);
        this.basin1.addChild(basin_r9);
        this.setRotateAngle(basin_r9, -0.576F, 0.0F, 0.0F);
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 14, 38, -1.7708F, -0.1732F, -0.0156F, 2, 3, 2, -0.003F, true));
        this.basin_r9.cubeList.add(new ModelBox(basin_r9, 14, 38, 8.2292F, -0.1732F, -0.0156F, 2, 3, 2, -0.003F, false));

        this.basin_r10 = new ModelRenderer(this);
        this.basin_r10.setRotationPoint(0.0F, -1.7553F, -2.1548F);
        this.basin1.addChild(basin_r10);
        this.setRotateAngle(basin_r10, -0.3665F, 0.0F, 0.0F);
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 54, 13, -4.0F, -0.1F, 2.5F, 3, 1, 7, 0.003F, true));
        this.basin_r10.cubeList.add(new ModelBox(basin_r10, 54, 13, 1.0F, -0.1F, 2.5F, 3, 1, 7, 0.003F, false));

        this.basin_r11 = new ModelRenderer(this);
        this.basin_r11.setRotationPoint(4.2292F, -2.9924F, 0.6611F);
        this.basin1.addChild(basin_r11);
        this.setRotateAngle(basin_r11, -0.6545F, 0.0F, 0.0F);
        this.basin_r11.cubeList.add(new ModelBox(basin_r11, 80, 56, -0.2292F, -0.0847F, -0.0477F, 2, 4, 4, 0.0F, false));

        this.basin_r12 = new ModelRenderer(this);
        this.basin_r12.setRotationPoint(4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r12);
        this.setRotateAngle(basin_r12, -2.5307F, 0.0F, 0.4625F);
        this.basin_r12.cubeList.add(new ModelBox(basin_r12, 90, 25, -0.2292F, -5.1323F, 3.1803F, 2, 2, 4, -0.003F, false));

        this.basin_r13 = new ModelRenderer(this);
        this.basin_r13.setRotationPoint(4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r13);
        this.setRotateAngle(basin_r13, -1.309F, 0.0F, 0.4625F);
        this.basin_r13.cubeList.add(new ModelBox(basin_r13, 86, 11, -0.2292F, 2.0869F, 1.3724F, 2, 2, 4, 0.0F, false));

        this.basin_r14 = new ModelRenderer(this);
        this.basin_r14.setRotationPoint(4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r14);
        this.setRotateAngle(basin_r14, -2.1206F, 0.0F, 0.4625F);
        this.basin_r14.cubeList.add(new ModelBox(basin_r14, 92, 93, -0.2292F, -0.1848F, 0.8847F, 2, 2, 3, -0.003F, false));

        this.basin_r15 = new ModelRenderer(this);
        this.basin_r15.setRotationPoint(4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r15);
        this.setRotateAngle(basin_r15, -2.1118F, 0.0F, 0.4625F);
        this.basin_r15.cubeList.add(new ModelBox(basin_r15, 15, 75, -0.2292F, -5.714F, 1.1952F, 2, 3, 5, 0.0F, false));

        this.basin_r16 = new ModelRenderer(this);
        this.basin_r16.setRotationPoint(4.2292F, 3.1076F, 3.4611F);
        this.basin1.addChild(basin_r16);
        this.setRotateAngle(basin_r16, -1.5446F, 0.0F, 0.4625F);
        this.basin_r16.cubeList.add(new ModelBox(basin_r16, 52, 0, -0.2292F, -2.2519F, -0.1067F, 2, 5, 7, 0.003F, false));

        this.basin5_r1 = new ModelRenderer(this);
        this.basin5_r1.setRotationPoint(0.1F, 0.4599F, 5.8699F);
        this.basin1.addChild(basin5_r1);
        this.setRotateAngle(basin5_r1, -0.384F, 0.0F, 0.0F);
        this.basin5_r1.cubeList.add(new ModelBox(basin5_r1, 8, 58, 0.0F, -2.746F, 0.0457F, 0, 4, 1, 0.0F, false));

        this.basin4_r1 = new ModelRenderer(this);
        this.basin4_r1.setRotationPoint(0.1F, -0.0401F, 4.0699F);
        this.basin1.addChild(basin4_r1);
        this.setRotateAngle(basin4_r1, -0.3142F, 0.0F, 0.0F);
        this.basin4_r1.cubeList.add(new ModelBox(basin4_r1, 47, 100, 0.0F, -3.0267F, -0.0879F, 0, 4, 1, 0.0F, false));

        this.basin3_r1 = new ModelRenderer(this);
        this.basin3_r1.setRotationPoint(0.0F, -0.5259F, 2.0176F);
        this.basin1.addChild(basin3_r1);
        this.setRotateAngle(basin3_r1, -0.2618F, 0.0F, 0.0F);
        this.basin3_r1.cubeList.add(new ModelBox(basin3_r1, 5, 58, 0.1F, -3.315F, 0.0211F, 0, 4, 1, 0.0F, false));

        this.basin2_r1 = new ModelRenderer(this);
        this.basin2_r1.setRotationPoint(0.0F, -0.8259F, 0.0176F);
        this.basin1.addChild(basin2_r1);
        this.setRotateAngle(basin2_r1, -0.2967F, 0.0F, 0.0F);
        this.basin2_r1.cubeList.add(new ModelBox(basin2_r1, 9, 18, 0.1F, -3.4726F, 0.0373F, 0, 4, 1, 0.0F, false));

        this.basin2_r2 = new ModelRenderer(this);
        this.basin2_r2.setRotationPoint(0.0F, -0.8259F, 0.0176F);
        this.basin1.addChild(basin2_r2);
        this.setRotateAngle(basin2_r2, -0.2269F, 0.0F, 0.0F);
        this.basin2_r2.cubeList.add(new ModelBox(basin2_r2, 41, 35, -0.9F, 0.8274F, 0.0373F, 2, 2, 8, -0.2F, false));
        this.basin2_r2.cubeList.add(new ModelBox(basin2_r2, 45, 46, -0.9F, -0.1726F, 0.0373F, 2, 2, 8, 0.001F, false));

        this.upperleg1 = new ModelRenderer(this);
        this.upperleg1.setRotationPoint(6.5F, 4.8638F, 3.3675F);
        this.basin1.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.131F, -0.0699F, -0.2643F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 30, 80, -1.0F, 3.8F, -2.0F, 2, 7, 3, 0.0F, false));
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 41, 84, -1.5F, -0.2F, -2.0F, 3, 4, 3, 0.0F, false));

        this.leg1 = new ModelRenderer(this);
        this.leg1.setRotationPoint(0.2839F, 11.1184F, -0.9447F);
        this.upperleg1.addChild(leg1);
        this.setRotateAngle(leg1, 0.4068F, -0.083F, 0.3154F);


        this.leg2_r1 = new ModelRenderer(this);
        this.leg2_r1.setRotationPoint(0.1816F, 4.2372F, 1.1145F);
        this.leg1.addChild(leg2_r1);
        this.setRotateAngle(leg2_r1, 1.8627F, 1.5246F, 1.7815F);
        this.leg2_r1.cubeList.add(new ModelBox(leg2_r1, 59, 95, -0.4531F, -3.8317F, 0.6108F, 2, 8, 1, 0.0F, false));
        this.leg2_r1.cubeList.add(new ModelBox(leg2_r1, 83, 85, -0.535F, -4.845F, -1.7873F, 2, 9, 2, 0.0F, false));

        this.feet1 = new ModelRenderer(this);
        this.feet1.setRotationPoint(1.0885F, 8.9576F, 0.4756F);
        this.leg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.1153F, -0.0204F, -0.0277F);


        this.feet2_r1 = new ModelRenderer(this);
        this.feet2_r1.setRotationPoint(0.0012F, 3.3818F, -2.718F);
        this.feet1.addChild(feet2_r1);
        this.setRotateAngle(feet2_r1, 0.6197F, 0.01F, -0.1073F);
        this.feet2_r1.cubeList.add(new ModelBox(feet2_r1, 58, 42, -3.1772F, -1.9865F, 0.4319F, 6, 2, 4, 0.0F, false));

        this.feet1_r1 = new ModelRenderer(this);
        this.feet1_r1.setRotationPoint(0.0012F, 2.3818F, -5.018F);
        this.feet1.addChild(feet1_r1);
        this.setRotateAngle(feet1_r1, -0.0041F, -0.0059F, -0.0341F);
        this.feet1_r1.cubeList.add(new ModelBox(feet1_r1, 62, 53, -3.1978F, -0.9966F, -1.9638F, 6, 2, 4, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(-6.5F, 4.8638F, 3.3675F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, 0.1308F, 0.0699F, 0.2643F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 20, 0, -1.0F, 3.8F, -2.0F, 2, 7, 3, 0.0F, false));
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 14, 84, -1.5F, -0.2F, -2.0F, 3, 4, 3, 0.0F, false));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(-0.2839F, 11.1184F, -0.9447F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.0177F, 0.083F, -0.3154F);


        this.leg3_r1 = new ModelRenderer(this);
        this.leg3_r1.setRotationPoint(-0.1816F, 4.2372F, 1.1145F);
        this.leg2.addChild(leg3_r1);
        this.setRotateAngle(leg3_r1, 1.8627F, -1.5246F, -1.7815F);
        this.leg3_r1.cubeList.add(new ModelBox(leg3_r1, 52, 95, -1.5098F, -3.8973F, 0.4818F, 2, 8, 1, 0.0F, false));
        this.leg3_r1.cubeList.add(new ModelBox(leg3_r1, 74, 85, -1.4578F, -4.9142F, -2.1174F, 2, 9, 2, 0.0F, false));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0885F, 8.9576F, 0.4756F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.6701F, 0.0204F, 0.0277F);


        this.feet3_r1 = new ModelRenderer(this);
        this.feet3_r1.setRotationPoint(-0.0012F, 3.3818F, -2.718F);
        this.feet2.addChild(feet3_r1);
        this.setRotateAngle(feet3_r1, 0.6197F, -0.01F, 0.1073F);
        this.feet3_r1.cubeList.add(new ModelBox(feet3_r1, 39, 57, -2.8228F, -1.9865F, 0.4319F, 6, 2, 4, 0.0F, false));

        this.feet2_r2 = new ModelRenderer(this);
        this.feet2_r2.setRotationPoint(-0.0012F, 2.3818F, -5.018F);
        this.feet2.addChild(feet2_r2);
        this.setRotateAngle(feet2_r2, -0.0041F, 0.0059F, 0.0341F);
        this.feet2_r2.cubeList.add(new ModelBox(feet2_r2, 56, 60, -2.8022F, -0.9966F, -1.9638F, 6, 2, 4, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.5174F, 7.4848F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.5654F, 0.1478F, -0.0932F);
        this.tail1.cubeList.add(new ModelBox(tail1, 67, 71, -0.5F, -0.7694F, -0.4012F, 1, 2, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 5, 48, -0.5F, 0.2306F, -0.4012F, 1, 2, 7, -0.2F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 35, 14, 0.0F, -2.7694F, -0.4012F, 0, 2, 1, 0.0F, false));

        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, -0.7694F, 3.5988F);
        this.tail1.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.2618F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 39, 57, 0.0F, -1.9F, 0.0F, 0, 2, 1, 0.0F, false));

        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, -0.7694F, 1.5988F);
        this.tail1.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.1571F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 5, 67, 0.0F, -2.2F, 0.0F, 0, 3, 1, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2369F, 5.3875F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.2589F, 0.2111F, -0.0555F);
        this.tail2.cubeList.add(new ModelBox(tail2, 77, 12, -0.5F, -0.5625F, -0.0772F, 1, 1, 6, -0.002F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 87, -0.5F, 0.2375F, 0.9228F, 1, 1, 5, -0.2F, false));

        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(0.0F, -0.5625F, -0.0772F);
        this.tail2.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, -0.1222F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 20, 0, 0.0F, -1.0F, 4.0F, 0, 1, 1, 0.0F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 28, 0, 0.0F, -1.0F, 2.0F, 0, 1, 1, 0.0F, false));
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 12, 30, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

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
