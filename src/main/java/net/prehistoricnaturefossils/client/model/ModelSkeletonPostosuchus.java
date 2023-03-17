package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPostosuchus extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body1_r1;
    private final ModelRenderer neck18_r1;
    private final ModelRenderer neck17_r1;
    private final ModelRenderer neck16_r1;
    private final ModelRenderer neck17_r2;
    private final ModelRenderer neck16_r2;
    private final ModelRenderer neck15_r1;
    private final ModelRenderer neck14_r1;
    private final ModelRenderer neck16_r3;
    private final ModelRenderer neck15_r2;
    private final ModelRenderer neck17_r3;
    private final ModelRenderer neck14_r2;
    private final ModelRenderer neck15_r3;
    private final ModelRenderer neck13_r1;
    private final ModelRenderer neck16_r4;
    private final ModelRenderer neck16_r5;
    private final ModelRenderer neck15_r4;
    private final ModelRenderer neck16_r6;
    private final ModelRenderer neck14_r3;
    private final ModelRenderer neck15_r5;
    private final ModelRenderer chest1;
    private final ModelRenderer chest3_r1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer chest4_r1;
    private final ModelRenderer chest3_r2;
    private final ModelRenderer chest3_r3;
    private final ModelRenderer chest2_r2;
    private final ModelRenderer chest1_r1;
    private final ModelRenderer neck12_r1;
    private final ModelRenderer neck11_r1;
    private final ModelRenderer neck10_r1;
    private final ModelRenderer neck9_r1;
    private final ModelRenderer neck14_r4;
    private final ModelRenderer neck15_r6;
    private final ModelRenderer neck13_r2;
    private final ModelRenderer neck12_r2;
    private final ModelRenderer neck13_r3;
    private final ModelRenderer neck14_r5;
    private final ModelRenderer neck12_r3;
    private final ModelRenderer neck13_r4;
    private final ModelRenderer neck11_r2;
    private final ModelRenderer neck12_r4;
    private final ModelRenderer neck14_r6;
    private final ModelRenderer neck13_r5;
    private final ModelRenderer neck10_r2;
    private final ModelRenderer neck9_r2;
    private final ModelRenderer neck12_r5;
    private final ModelRenderer neck14_r7;
    private final ModelRenderer neck13_r6;
    private final ModelRenderer neck11_r3;
    private final ModelRenderer neck13_r7;
    private final ModelRenderer neck12_r6;
    private final ModelRenderer neck12_r7;
    private final ModelRenderer neck13_r8;
    private final ModelRenderer neck11_r4;
    private final ModelRenderer neck10_r3;
    private final ModelRenderer neck12_r8;
    private final ModelRenderer neck11_r5;
    private final ModelRenderer neck8_r1;
    private final ModelRenderer neck9_r3;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arm2;
    private final ModelRenderer hand2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer arm3;
    private final ModelRenderer hand3;
    private final ModelRenderer neck1;
    private final ModelRenderer neck1_r1;
    private final ModelRenderer neck7_r1;
    private final ModelRenderer neck6_r1;
    private final ModelRenderer neck5_r1;
    private final ModelRenderer neck6_r2;
    private final ModelRenderer neck9_r4;
    private final ModelRenderer neck8_r2;
    private final ModelRenderer neck7_r2;
    private final ModelRenderer neck6_r3;
    private final ModelRenderer neck8_r3;
    private final ModelRenderer neck7_r3;
    private final ModelRenderer neck6_r4;
    private final ModelRenderer neck5_r2;
    private final ModelRenderer neck5_r3;
    private final ModelRenderer neck2;
    private final ModelRenderer neck4_r1;
    private final ModelRenderer neck4_r2;
    private final ModelRenderer neck5_r4;
    private final ModelRenderer neck4_r3;
    private final ModelRenderer head1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw4_r1;
    private final ModelRenderer jaw3_r1;
    private final ModelRenderer jaw3_r2;
    private final ModelRenderer jaw2_r1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer underteeth2;
    private final ModelRenderer jaw4;
    private final ModelRenderer underteeth1;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head4_r1;
    private final ModelRenderer head5_r1;
    private final ModelRenderer crestr;
    private final ModelRenderer crestr2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer crestl;
    private final ModelRenderer crestl2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer head4;
    private final ModelRenderer teeth2;
    private final ModelRenderer teeth1;
    private final ModelRenderer chestosteoderms1;
    private final ModelRenderer basin1;
    private final ModelRenderer basin7_r1;
    private final ModelRenderer basin6_r1;
    private final ModelRenderer basin4_r1;
    private final ModelRenderer basin3_r1;
    private final ModelRenderer basin5_r1;
    private final ModelRenderer basin5_r2;
    private final ModelRenderer basin6_r2;
    private final ModelRenderer basin3_r2;
    private final ModelRenderer basin6_r3;
    private final ModelRenderer basin5_r3;
    private final ModelRenderer basin4_r2;
    private final ModelRenderer basin5_r4;
    private final ModelRenderer basin4_r3;
    private final ModelRenderer basin3_r3;
    private final ModelRenderer neck20_r1;
    private final ModelRenderer upperleg2;
    private final ModelRenderer leg2;
    private final ModelRenderer feet2;
    private final ModelRenderer toes2;
    private final ModelRenderer upperleg3;
    private final ModelRenderer leg3;
    private final ModelRenderer feet3;
    private final ModelRenderer toes3;
    private final ModelRenderer tail1;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail1_r1;
    private final ModelRenderer neck26_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer neck29_r1;
    private final ModelRenderer tail11_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail3_r2;
    private final ModelRenderer tail15_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail2osteoderme1;
    private final ModelRenderer tail2osteoderme2;
    private final ModelRenderer tail1osteoderme1;
    private final ModelRenderer tai1losteoderme2;
    private final ModelRenderer basinosteoderme1;
    private final ModelRenderer osteoderms1;
    private final ModelRenderer osteoderms2;

    public ModelSkeletonPostosuchus() {
        this.textureWidth = 140;
        this.textureHeight = 140;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -7.6F, -0.1F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, 0.2143F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 82, 16, -3.0F, 11.7899F, -6.2385F, 6, 4, 10, 0.002F, false));

        this.body1_r1 = new ModelRenderer(this);
        this.body1_r1.setRotationPoint(0.0F, 1.8F, -7.0F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, 0.0436F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 62, 72, -1.0F, -1.7997F, -0.0142F, 2, 3, 14, 0.0F, false));

        this.neck18_r1 = new ModelRenderer(this);
        this.neck18_r1.setRotationPoint(-1.1318F, 1.3959F, 4.3563F);
        this.body1.addChild(neck18_r1);
        this.setRotateAngle(neck18_r1, -1.6138F, 0.0076F, 0.1744F);
        this.neck18_r1.cubeList.add(new ModelBox(neck18_r1, 59, 58, -1.8942F, -0.527F, 1.8005F, 0, 1, 3, 0.0F, true));

        this.neck17_r1 = new ModelRenderer(this);
        this.neck17_r1.setRotationPoint(-1.1318F, 1.3959F, 4.3563F);
        this.body1.addChild(neck17_r1);
        this.setRotateAngle(neck17_r1, -1.5958F, 0.0357F, 0.9595F);
        this.neck17_r1.cubeList.add(new ModelBox(neck17_r1, 36, 58, -0.0369F, -0.527F, -0.3507F, 0, 1, 3, 0.0F, true));

        this.neck16_r1 = new ModelRenderer(this);
        this.neck16_r1.setRotationPoint(-1.1318F, 1.6688F, 1.3688F);
        this.body1.addChild(neck16_r1);
        this.setRotateAngle(neck16_r1, -1.5458F, -0.0357F, 0.9595F);
        this.neck16_r1.cubeList.add(new ModelBox(neck16_r1, 82, 60, -0.1187F, -0.5222F, -0.408F, 0, 1, 3, 0.0F, true));

        this.neck17_r2 = new ModelRenderer(this);
        this.neck17_r2.setRotationPoint(-1.1318F, 1.6688F, 1.3688F);
        this.body1.addChild(neck17_r2);
        this.setRotateAngle(neck17_r2, -1.5278F, -0.0076F, 0.1744F);
        this.neck17_r2.cubeList.add(new ModelBox(neck17_r2, 118, 108, -1.9115F, -0.5222F, 1.7021F, 0, 1, 5, 0.0F, true));

        this.neck16_r2 = new ModelRenderer(this);
        this.neck16_r2.setRotationPoint(-1.1318F, 1.9418F, -1.6188F);
        this.body1.addChild(neck16_r2);
        this.setRotateAngle(neck16_r2, -1.4419F, -0.0227F, 0.1731F);
        this.neck16_r2.cubeList.add(new ModelBox(neck16_r2, 114, 98, -1.9115F, -0.5222F, 1.7021F, 0, 1, 6, 0.0F, true));

        this.neck15_r1 = new ModelRenderer(this);
        this.neck15_r1.setRotationPoint(-1.1318F, 1.9418F, -1.6188F);
        this.body1.addChild(neck15_r1);
        this.setRotateAngle(neck15_r1, -1.4954F, -0.1071F, 0.9559F);
        this.neck15_r1.cubeList.add(new ModelBox(neck15_r1, 0, 90, -0.1187F, -0.5222F, -0.408F, 0, 1, 3, 0.0F, true));

        this.neck14_r1 = new ModelRenderer(this);
        this.neck14_r1.setRotationPoint(-1.16F, 1.5858F, -4.4471F);
        this.body1.addChild(neck14_r1);
        this.setRotateAngle(neck14_r1, -1.4564F, -0.1343F, 1.072F);
        this.neck14_r1.cubeList.add(new ModelBox(neck14_r1, 25, 45, 0.1964F, -0.3163F, -0.2452F, 0, 1, 3, 0.0F, true));

        this.neck16_r3 = new ModelRenderer(this);
        this.neck16_r3.setRotationPoint(-1.16F, 1.5858F, -4.4471F);
        this.body1.addChild(neck16_r3);
        this.setRotateAngle(neck16_r3, -1.3952F, -0.0146F, 0.293F);
        this.neck16_r3.cubeList.add(new ModelBox(neck16_r3, 108, 82, -1.8039F, -0.3163F, 2.04F, 0, 1, 6, 0.0F, true));

        this.neck15_r2 = new ModelRenderer(this);
        this.neck15_r2.setRotationPoint(-1.16F, 1.5858F, -4.4471F);
        this.body1.addChild(neck15_r2);
        this.setRotateAngle(neck15_r2, -1.4052F, 0.0606F, -0.137F);
        this.neck15_r2.cubeList.add(new ModelBox(neck15_r2, 11, 66, -5.0481F, -0.3163F, 6.5215F, 0, 1, 2, 0.0F, true));

        this.neck17_r3 = new ModelRenderer(this);
        this.neck17_r3.setRotationPoint(1.1318F, 1.3959F, 4.3563F);
        this.body1.addChild(neck17_r3);
        this.setRotateAngle(neck17_r3, -1.6138F, -0.0076F, -0.1744F);
        this.neck17_r3.cubeList.add(new ModelBox(neck17_r3, 59, 58, 1.8942F, -0.527F, 1.8005F, 0, 1, 3, 0.0F, false));

        this.neck14_r2 = new ModelRenderer(this);
        this.neck14_r2.setRotationPoint(1.16F, 1.5858F, -4.4471F);
        this.body1.addChild(neck14_r2);
        this.setRotateAngle(neck14_r2, -1.3814F, 0.1123F, 0.1377F);
        this.neck14_r2.cubeList.add(new ModelBox(neck14_r2, 11, 66, 5.0481F, -0.3163F, 6.5215F, 0, 1, 2, 0.0F, false));

        this.neck15_r3 = new ModelRenderer(this);
        this.neck15_r3.setRotationPoint(1.16F, 1.5858F, -4.4471F);
        this.body1.addChild(neck15_r3);
        this.setRotateAngle(neck15_r3, -1.4462F, 0.1817F, -0.298F);
        this.neck15_r3.cubeList.add(new ModelBox(neck15_r3, 108, 82, 1.8039F, -0.3163F, 2.04F, 0, 1, 6, 0.0F, false));

        this.neck13_r1 = new ModelRenderer(this);
        this.neck13_r1.setRotationPoint(1.16F, 1.5858F, -4.4471F);
        this.body1.addChild(neck13_r1);
        this.setRotateAngle(neck13_r1, -1.6131F, 0.2158F, -1.0993F);
        this.neck13_r1.cubeList.add(new ModelBox(neck13_r1, 25, 45, -0.1964F, -0.3163F, -0.2452F, 0, 1, 3, 0.0F, false));

        this.neck16_r4 = new ModelRenderer(this);
        this.neck16_r4.setRotationPoint(0.0F, 0.3304F, -4.8671F);
        this.body1.addChild(neck16_r4);
        this.setRotateAngle(neck16_r4, 0.0349F, 0.0F, 0.0F);
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 0, 99, 0.0F, -2.798F, 8.6183F, 0, 4, 2, 0.0F, false));
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 5, 99, 0.0F, -2.6295F, 5.6231F, 0, 4, 2, 0.0F, false));
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 105, 13, 0.0F, -2.6607F, 2.6166F, 0, 4, 2, 0.0F, false));
        this.neck16_r4.cubeList.add(new ModelBox(neck16_r4, 83, 115, 0.0F, -2.592F, -0.3843F, 0, 4, 2, 0.0F, false));

        this.neck16_r5 = new ModelRenderer(this);
        this.neck16_r5.setRotationPoint(1.1318F, 1.3959F, 4.3563F);
        this.body1.addChild(neck16_r5);
        this.setRotateAngle(neck16_r5, -1.5958F, -0.0357F, -0.9595F);
        this.neck16_r5.cubeList.add(new ModelBox(neck16_r5, 36, 58, 0.0369F, -0.527F, -0.3507F, 0, 1, 3, 0.0F, false));

        this.neck15_r4 = new ModelRenderer(this);
        this.neck15_r4.setRotationPoint(1.1318F, 1.6688F, 1.3688F);
        this.body1.addChild(neck15_r4);
        this.setRotateAngle(neck15_r4, -1.5458F, 0.0357F, -0.9595F);
        this.neck15_r4.cubeList.add(new ModelBox(neck15_r4, 82, 60, 0.1187F, -0.5222F, -0.408F, 0, 1, 3, 0.0F, false));

        this.neck16_r6 = new ModelRenderer(this);
        this.neck16_r6.setRotationPoint(1.1318F, 1.6688F, 1.3688F);
        this.body1.addChild(neck16_r6);
        this.setRotateAngle(neck16_r6, -1.5278F, 0.0076F, -0.1744F);
        this.neck16_r6.cubeList.add(new ModelBox(neck16_r6, 118, 108, 1.9115F, -0.5222F, 1.7021F, 0, 1, 5, 0.0F, false));

        this.neck14_r3 = new ModelRenderer(this);
        this.neck14_r3.setRotationPoint(1.1318F, 1.9418F, -1.6188F);
        this.body1.addChild(neck14_r3);
        this.setRotateAngle(neck14_r3, -1.4954F, 0.1071F, -0.9559F);
        this.neck14_r3.cubeList.add(new ModelBox(neck14_r3, 0, 90, 0.1187F, -0.5222F, -0.408F, 0, 1, 3, 0.0F, false));

        this.neck15_r5 = new ModelRenderer(this);
        this.neck15_r5.setRotationPoint(1.1318F, 1.9418F, -1.6188F);
        this.body1.addChild(neck15_r5);
        this.setRotateAngle(neck15_r5, -1.4419F, 0.0227F, -0.1731F);
        this.neck15_r5.cubeList.add(new ModelBox(neck15_r5, 114, 98, 1.9115F, -0.5222F, 1.7021F, 0, 1, 6, 0.0F, false));

        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, 1.1F, -6.2F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0533F, 0.3051F, 0.0084F);


        this.chest3_r1 = new ModelRenderer(this);
        this.chest3_r1.setRotationPoint(0.0F, 12.9081F, -11.2186F);
        this.chest1.addChild(chest3_r1);
        this.setRotateAngle(chest3_r1, -0.1745F, 0.0F, 0.0F);
        this.chest3_r1.cubeList.add(new ModelBox(chest3_r1, 86, 0, -3.0F, -1.9546F, -0.1709F, 6, 2, 10, 0.002F, false));

        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.3919F, -10.1186F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, -0.0873F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 96, 31, -1.0F, -1.6093F, -0.1076F, 2, 3, 10, -0.002F, false));

        this.chest4_r1 = new ModelRenderer(this);
        this.chest4_r1.setRotationPoint(-5.5231F, 8.3162F, -14.3033F);
        this.chest1.addChild(chest4_r1);
        this.setRotateAngle(chest4_r1, 1.2591F, -0.323F, -0.7778F);
        this.chest4_r1.cubeList.add(new ModelBox(chest4_r1, 54, 27, 0.2918F, -1.9237F, -4.7222F, 1, 6, 5, 0.0F, false));

        this.chest3_r2 = new ModelRenderer(this);
        this.chest3_r2.setRotationPoint(-4.0F, 4.2144F, -11.9299F);
        this.chest1.addChild(chest3_r2);
        this.setRotateAngle(chest3_r2, 1.1317F, 0.0748F, 0.1578F);
        this.chest3_r2.cubeList.add(new ModelBox(chest3_r2, 25, 0, -0.7878F, -1.5F, -4.6389F, 1, 3, 9, 0.0F, false));

        this.chest3_r3 = new ModelRenderer(this);
        this.chest3_r3.setRotationPoint(5.5231F, 8.3162F, -14.3033F);
        this.chest1.addChild(chest3_r3);
        this.setRotateAngle(chest3_r3, 1.2591F, 0.323F, 0.7778F);
        this.chest3_r3.cubeList.add(new ModelBox(chest3_r3, 58, 0, -1.2918F, -1.9237F, -4.7222F, 1, 6, 5, 0.0F, false));

        this.chest2_r2 = new ModelRenderer(this);
        this.chest2_r2.setRotationPoint(4.0F, 4.2144F, -11.9299F);
        this.chest1.addChild(chest2_r2);
        this.setRotateAngle(chest2_r2, 1.1317F, -0.0748F, -0.1578F);
        this.chest2_r2.cubeList.add(new ModelBox(chest2_r2, 102, 100, -0.2122F, -1.5F, -4.6389F, 1, 3, 9, 0.0F, false));

        this.chest1_r1 = new ModelRenderer(this);
        this.chest1_r1.setRotationPoint(0.0F, -0.9368F, -16.0938F);
        this.chest1.addChild(chest1_r1);
        this.setRotateAngle(chest1_r1, 0.0349F, 0.0F, 0.0F);
        this.chest1_r1.cubeList.add(new ModelBox(chest1_r1, 0, 66, -1.0F, -0.7645F, 0.0665F, 2, 3, 6, 0.0F, false));

        this.neck12_r1 = new ModelRenderer(this);
        this.neck12_r1.setRotationPoint(0.0F, -0.4966F, -1.6547F);
        this.chest1.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, -0.1396F, 0.0F, 0.0F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 119, 88, 0.0F, -2.9326F, -0.446F, 0, 4, 2, 0.0F, false));

        this.neck11_r1 = new ModelRenderer(this);
        this.neck11_r1.setRotationPoint(0.0F, -0.769F, -4.6423F);
        this.chest1.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, -0.096F, 0.0F, 0.0F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 86, 120, 0.0F, -2.933F, -0.4286F, 0, 4, 2, 0.0F, false));

        this.neck10_r1 = new ModelRenderer(this);
        this.neck10_r1.setRotationPoint(0.0F, -1.0415F, -7.6299F);
        this.chest1.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.0524F, 0.0F, 0.0F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 11, 121, 0.0F, -2.9327F, -0.4111F, 0, 4, 2, 0.0F, false));

        this.neck9_r1 = new ModelRenderer(this);
        this.neck9_r1.setRotationPoint(0.0F, -1.5863F, -13.6051F);
        this.chest1.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, 0.0349F, 0.0F, 0.0F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 16, 121, 0.0F, -2.1565F, 2.5497F, 0, 4, 2, 0.0F, false));
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 21, 121, 0.0F, -2.037F, -0.4893F, 0, 4, 2, 0.0F, false));

        this.neck14_r4 = new ModelRenderer(this);
        this.neck14_r4.setRotationPoint(-1.16F, 0.1858F, -1.2471F);
        this.chest1.addChild(neck14_r4);
        this.setRotateAngle(neck14_r4, -1.4918F, 0.0485F, -0.1418F);
        this.neck14_r4.cubeList.add(new ModelBox(neck14_r4, 25, 0, -5.0481F, -0.3163F, 6.5215F, 0, 1, 4, 0.0F, true));

        this.neck15_r6 = new ModelRenderer(this);
        this.neck15_r6.setRotationPoint(-1.16F, 0.1858F, -1.2471F);
        this.chest1.addChild(neck15_r6);
        this.setRotateAngle(neck15_r6, -1.4787F, 0.0106F, 0.2932F);
        this.neck15_r6.cubeList.add(new ModelBox(neck15_r6, 13, 113, -1.8039F, -0.3163F, 2.04F, 0, 1, 6, 0.0F, true));

        this.neck13_r2 = new ModelRenderer(this);
        this.neck13_r2.setRotationPoint(-1.16F, 0.1858F, -1.2471F);
        this.chest1.addChild(neck13_r2);
        this.setRotateAngle(neck13_r2, -1.4981F, -0.0576F, 1.076F);
        this.neck13_r2.cubeList.add(new ModelBox(neck13_r2, 25, 50, 0.1964F, -0.3163F, -0.2452F, 0, 1, 3, 0.0F, true));

        this.neck12_r2 = new ModelRenderer(this);
        this.neck12_r2.setRotationPoint(-1.16F, 0.1858F, -4.2471F);
        this.chest1.addChild(neck12_r2);
        this.setRotateAngle(neck12_r2, -1.4352F, -0.1726F, 1.0687F);
        this.neck12_r2.cubeList.add(new ModelBox(neck12_r2, 11, 55, 0.1964F, -0.3163F, -0.2452F, 0, 1, 3, 0.0F, true));

        this.neck13_r3 = new ModelRenderer(this);
        this.neck13_r3.setRotationPoint(-1.16F, 0.1858F, -4.2471F);
        this.chest1.addChild(neck13_r3);
        this.setRotateAngle(neck13_r3, -1.3619F, 0.0665F, -0.1343F);
        this.neck13_r3.cubeList.add(new ModelBox(neck13_r3, 112, 116, -5.0481F, -0.3163F, 6.5215F, 0, 1, 5, 0.0F, true));

        this.neck14_r5 = new ModelRenderer(this);
        this.neck14_r5.setRotationPoint(-1.16F, 0.1858F, -4.2471F);
        this.chest1.addChild(neck14_r5);
        this.setRotateAngle(neck14_r5, -1.3534F, -0.0272F, 0.2921F);
        this.neck14_r5.cubeList.add(new ModelBox(neck14_r5, 104, 113, -1.8039F, -0.3163F, 2.04F, 0, 1, 6, 0.0F, true));

        this.neck12_r3 = new ModelRenderer(this);
        this.neck12_r3.setRotationPoint(-5.16F, 7.0858F, -4.7471F);
        this.chest1.addChild(neck12_r3);
        this.setRotateAngle(neck12_r3, -1.2752F, 0.0779F, -0.128F);
        this.neck12_r3.cubeList.add(new ModelBox(neck12_r3, 115, 41, -0.02F, -0.138F, -0.1529F, 0, 1, 6, 0.0F, true));

        this.neck13_r4 = new ModelRenderer(this);
        this.neck13_r4.setRotationPoint(-1.1318F, 0.3449F, -7.4146F);
        this.chest1.addChild(neck13_r4);
        this.setRotateAngle(neck13_r4, -1.2697F, -0.0522F, 0.2888F);
        this.neck13_r4.cubeList.add(new ModelBox(neck13_r4, 26, 114, -1.8673F, -0.5225F, 1.9528F, 0, 1, 6, 0.0F, true));

        this.neck11_r2 = new ModelRenderer(this);
        this.neck11_r2.setRotationPoint(-1.1318F, 0.3449F, -7.4146F);
        this.chest1.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, -1.3919F, -0.2489F, 1.0597F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 85, 94, 0.0898F, -0.5225F, -0.262F, 0, 1, 3, 0.0F, true));

        this.neck12_r4 = new ModelRenderer(this);
        this.neck12_r4.setRotationPoint(-1.1318F, 0.3449F, -9.7146F);
        this.chest1.addChild(neck12_r4);
        this.setRotateAngle(neck12_r4, -1.3919F, -0.2489F, 1.0597F);
        this.neck12_r4.cubeList.add(new ModelBox(neck12_r4, 48, 48, 0.0652F, -0.4271F, -0.2793F, 0, 1, 3, 0.0F, true));

        this.neck14_r6 = new ModelRenderer(this);
        this.neck14_r6.setRotationPoint(-1.1318F, 0.3449F, -9.7146F);
        this.chest1.addChild(neck14_r6);
        this.setRotateAngle(neck14_r6, -1.2697F, -0.0522F, 0.2888F);
        this.neck14_r6.cubeList.add(new ModelBox(neck14_r6, 112, 90, -1.8725F, -0.4271F, 1.9232F, 0, 1, 6, 0.0F, true));

        this.neck13_r5 = new ModelRenderer(this);
        this.neck13_r5.setRotationPoint(-1.1318F, 0.3449F, -9.7146F);
        this.chest1.addChild(neck13_r5);
        this.setRotateAngle(neck13_r5, -1.2752F, 0.0779F, -0.128F);
        this.neck13_r5.cubeList.add(new ModelBox(neck13_r5, 65, 72, -5.0609F, -0.4271F, 6.3865F, 0, 1, 5, 0.0F, true));

        this.neck10_r2 = new ModelRenderer(this);
        this.neck10_r2.setRotationPoint(-1.1318F, 0.3449F, -13.4146F);
        this.chest1.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, -1.0971F, -0.0803F, 0.1551F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 73, 103, -1.8673F, -0.5225F, 1.9528F, 0, 1, 10, 0.0F, true));

        this.neck9_r2 = new ModelRenderer(this);
        this.neck9_r2.setRotationPoint(-1.1318F, 0.3449F, -13.4146F);
        this.chest1.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, -1.2806F, -0.3879F, 0.9026F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 66, 95, 0.0898F, -0.5225F, -0.262F, 0, 1, 3, 0.0F, true));

        this.neck12_r5 = new ModelRenderer(this);
        this.neck12_r5.setRotationPoint(1.16F, 0.1858F, -1.2471F);
        this.chest1.addChild(neck12_r5);
        this.setRotateAngle(neck12_r5, -1.3447F, -0.0257F, -1.0735F);
        this.neck12_r5.cubeList.add(new ModelBox(neck12_r5, 25, 50, -0.1964F, -0.3163F, -0.2452F, 0, 1, 3, 0.0F, false));

        this.neck14_r7 = new ModelRenderer(this);
        this.neck14_r7.setRotationPoint(1.16F, 0.1858F, -1.2471F);
        this.chest1.addChild(neck14_r7);
        this.setRotateAngle(neck14_r7, -1.4277F, -0.1776F, -0.298F);
        this.neck14_r7.cubeList.add(new ModelBox(neck14_r7, 13, 113, 1.8039F, -0.3163F, 2.04F, 0, 1, 6, 0.0F, false));

        this.neck13_r6 = new ModelRenderer(this);
        this.neck13_r6.setRotationPoint(1.16F, 0.1858F, -1.2471F);
        this.chest1.addChild(neck13_r6);
        this.setRotateAngle(neck13_r6, -1.5169F, -0.2212F, 0.1451F);
        this.neck13_r6.cubeList.add(new ModelBox(neck13_r6, 25, 0, 5.0481F, -0.3163F, 6.5215F, 0, 1, 4, 0.0F, false));

        this.neck11_r3 = new ModelRenderer(this);
        this.neck11_r3.setRotationPoint(1.16F, 0.1858F, -4.2471F);
        this.chest1.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, -1.4352F, 0.1726F, -1.0687F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 11, 55, -0.1964F, -0.3163F, -0.2452F, 0, 1, 3, 0.0F, false));

        this.neck13_r7 = new ModelRenderer(this);
        this.neck13_r7.setRotationPoint(1.16F, 0.1858F, -4.2471F);
        this.chest1.addChild(neck13_r7);
        this.setRotateAngle(neck13_r7, -1.3534F, 0.0272F, -0.2921F);
        this.neck13_r7.cubeList.add(new ModelBox(neck13_r7, 104, 113, 1.8039F, -0.3163F, 2.04F, 0, 1, 6, 0.0F, false));

        this.neck12_r6 = new ModelRenderer(this);
        this.neck12_r6.setRotationPoint(1.16F, 0.1858F, -4.2471F);
        this.chest1.addChild(neck12_r6);
        this.setRotateAngle(neck12_r6, -1.3619F, -0.0665F, 0.1343F);
        this.neck12_r6.cubeList.add(new ModelBox(neck12_r6, 112, 116, 5.0481F, -0.3163F, 6.5215F, 0, 1, 5, 0.0F, false));

        this.neck12_r7 = new ModelRenderer(this);
        this.neck12_r7.setRotationPoint(1.1318F, 0.3449F, -9.7146F);
        this.chest1.addChild(neck12_r7);
        this.setRotateAngle(neck12_r7, -1.2752F, -0.0779F, 0.128F);
        this.neck12_r7.cubeList.add(new ModelBox(neck12_r7, 65, 72, 5.0609F, -0.4271F, 6.3865F, 0, 1, 5, 0.0F, false));

        this.neck13_r8 = new ModelRenderer(this);
        this.neck13_r8.setRotationPoint(1.1318F, 0.3449F, -9.7146F);
        this.chest1.addChild(neck13_r8);
        this.setRotateAngle(neck13_r8, -1.2697F, 0.0522F, -0.2888F);
        this.neck13_r8.cubeList.add(new ModelBox(neck13_r8, 112, 90, 1.8725F, -0.4271F, 1.9232F, 0, 1, 6, 0.0F, false));

        this.neck11_r4 = new ModelRenderer(this);
        this.neck11_r4.setRotationPoint(1.1318F, 0.3449F, -9.7146F);
        this.chest1.addChild(neck11_r4);
        this.setRotateAngle(neck11_r4, -1.3919F, 0.2489F, -1.0597F);
        this.neck11_r4.cubeList.add(new ModelBox(neck11_r4, 48, 48, -0.0652F, -0.4271F, -0.2793F, 0, 1, 3, 0.0F, false));

        this.neck10_r3 = new ModelRenderer(this);
        this.neck10_r3.setRotationPoint(1.1318F, 0.3449F, -7.4146F);
        this.chest1.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, -1.3919F, 0.2489F, -1.0597F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 85, 94, -0.0898F, -0.5225F, -0.262F, 0, 1, 3, 0.0F, false));

        this.neck12_r8 = new ModelRenderer(this);
        this.neck12_r8.setRotationPoint(1.1318F, 0.3449F, -7.4146F);
        this.chest1.addChild(neck12_r8);
        this.setRotateAngle(neck12_r8, -1.2697F, 0.0522F, -0.2888F);
        this.neck12_r8.cubeList.add(new ModelBox(neck12_r8, 26, 114, 1.8673F, -0.5225F, 1.9528F, 0, 1, 6, 0.0F, false));

        this.neck11_r5 = new ModelRenderer(this);
        this.neck11_r5.setRotationPoint(5.16F, 7.0858F, -4.7471F);
        this.chest1.addChild(neck11_r5);
        this.setRotateAngle(neck11_r5, -1.2752F, -0.0779F, 0.128F);
        this.neck11_r5.cubeList.add(new ModelBox(neck11_r5, 115, 41, 0.02F, -0.138F, -0.1529F, 0, 1, 6, 0.0F, false));

        this.neck8_r1 = new ModelRenderer(this);
        this.neck8_r1.setRotationPoint(1.1318F, 0.3449F, -13.4146F);
        this.chest1.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, -1.2806F, 0.3879F, -0.9026F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 66, 95, -0.0898F, -0.5225F, -0.262F, 0, 1, 3, 0.0F, false));

        this.neck9_r3 = new ModelRenderer(this);
        this.neck9_r3.setRotationPoint(1.1318F, 0.3449F, -13.4146F);
        this.chest1.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, -1.0971F, 0.0803F, -0.1551F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 73, 103, 1.8673F, -0.5225F, 1.9528F, 0, 1, 10, 0.0F, false));

        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(4.9F, 9.4F, -11.9F);
        this.chest1.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7664F, 0.0F, -0.1396F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 112, 28, -0.5F, -1.0F, -1.5F, 2, 9, 3, 0.0F, false));

        this.arm2 = new ModelRenderer(this);
        this.arm2.setRotationPoint(0.6F, 7.6F, 1.3F);
        this.upperarm2.addChild(arm2);
        this.setRotateAngle(arm2, -1.0699F, 0.0F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 74, 115, -1.0F, -0.6282F, -1.0841F, 2, 8, 2, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 48, 72, -1.0F, -0.6282F, -2.8841F, 2, 8, 1, 0.0F, false));

        this.hand2 = new ModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 6.6718F, -1.0841F);
        this.arm2.addChild(hand2);
        this.setRotateAngle(hand2, -0.0044F, 0.0F, 0.1745F);
        this.hand2.cubeList.add(new ModelBox(hand2, 0, 113, -1.0F, 0.0F, -2.0F, 2, 5, 4, 0.0F, false));

        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-4.9F, 9.4F, -11.9F);
        this.chest1.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.5558F, -0.2152F, 0.4707F);
        this.upperarm3.cubeList.add(new ModelBox(upperarm3, 72, 43, -1.5F, -1.0F, -1.5F, 2, 9, 3, 0.0F, false));

        this.arm3 = new ModelRenderer(this);
        this.arm3.setRotationPoint(-0.6F, 7.6F, 1.3F);
        this.upperarm3.addChild(arm3);
        this.setRotateAngle(arm3, -1.1135F, 0.0F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 100, 94, -1.0F, -0.6282F, -1.0841F, 2, 8, 2, 0.0F, false));
        this.arm3.cubeList.add(new ModelBox(arm3, 11, 45, -1.0F, -0.6282F, -2.8841F, 2, 8, 1, 0.0F, false));

        this.hand3 = new ModelRenderer(this);
        this.hand3.setRotationPoint(0.0F, 6.6718F, -1.0841F);
        this.arm3.addChild(hand3);
        this.setRotateAngle(hand3, -0.0044F, 0.0F, -0.1745F);
        this.hand3.cubeList.add(new ModelBox(hand3, 96, 45, -1.0F, 0.0F, -2.0F, 2, 5, 4, 0.0F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.1F, -15.8F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.3913F, 0.3699F, -0.1319F);


        this.neck1_r1 = new ModelRenderer(this);
        this.neck1_r1.setRotationPoint(-0.2297F, 0.0512F, -9.1483F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.2182F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 101, 51, -1.0F, -0.0017F, 0.0606F, 2, 3, 9, 0.002F, false));

        this.neck7_r1 = new ModelRenderer(this);
        this.neck7_r1.setRotationPoint(-0.2297F, -1.7488F, -0.7483F);
        this.neck1.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, 0.1745F, 0.0F, 0.0F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 85, 31, 0.0F, -2.3406F, -0.5213F, 0, 4, 1, 0.0F, false));

        this.neck6_r1 = new ModelRenderer(this);
        this.neck6_r1.setRotationPoint(-0.2297F, -4.9208F, -2.7603F);
        this.neck1.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, 0.0436F, 0.0F, 0.0F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 34, 48, -0.5F, -0.2F, -1.5F, 1, 1, 3, 0.0F, false));

        this.neck5_r1 = new ModelRenderer(this);
        this.neck5_r1.setRotationPoint(-0.2297F, -4.0488F, -8.6483F);
        this.neck1.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 0.1309F, 0.0F, 0.0F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 57, 48, -0.5F, -0.5959F, 0.4514F, 1, 1, 3, 0.0F, false));

        this.neck6_r2 = new ModelRenderer(this);
        this.neck6_r2.setRotationPoint(-0.2297F, -0.1488F, -3.6483F);
        this.neck1.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 0.0436F, 0.0F, 0.0F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 121, 64, 0.0F, -3.8126F, -0.5543F, 0, 4, 2, 0.0F, false));

        this.neck9_r4 = new ModelRenderer(this);
        this.neck9_r4.setRotationPoint(-0.9021F, 0.2961F, -1.0629F);
        this.neck1.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, -0.596F, -0.3641F, 0.1F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 76, 16, -1.8673F, -0.5225F, 1.9528F, 0, 1, 7, 0.0F, true));

        this.neck8_r2 = new ModelRenderer(this);
        this.neck8_r2.setRotationPoint(-0.9021F, 0.2961F, -1.0629F);
        this.neck1.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, -1.0585F, -0.925F, 0.8203F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 99, 31, 0.0898F, -0.5225F, -0.262F, 0, 1, 3, 0.0F, true));

        this.neck7_r2 = new ModelRenderer(this);
        this.neck7_r2.setRotationPoint(-0.9021F, 1.2984F, -3.8976F);
        this.neck1.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, -0.6342F, -0.4353F, 0.3008F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 54, 88, 0.0153F, -0.6559F, -0.3911F, 0, 1, 7, 0.0F, true));

        this.neck6_r3 = new ModelRenderer(this);
        this.neck6_r3.setRotationPoint(-0.7703F, 1.4994F, -13.0086F);
        this.neck1.addChild(neck6_r3);
        this.setRotateAngle(neck6_r3, -0.6127F, -0.3644F, 0.2455F);
        this.neck6_r3.cubeList.add(new ModelBox(neck6_r3, 115, 49, 2.2519F, -3.4858F, 4.7173F, 0, 1, 6, 0.0F, true));

        this.neck8_r3 = new ModelRenderer(this);
        this.neck8_r3.setRotationPoint(0.9021F, 0.2961F, -1.0629F);
        this.neck1.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, -0.5578F, -0.0268F, -0.0935F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 76, 16, 1.8673F, -0.5225F, 1.9528F, 0, 1, 7, 0.0F, false));

        this.neck7_r3 = new ModelRenderer(this);
        this.neck7_r3.setRotationPoint(0.9021F, 0.2961F, -1.0629F);
        this.neck1.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, -0.7076F, 0.6197F, -0.5712F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 99, 31, -0.0898F, -0.5225F, -0.262F, 0, 1, 3, 0.0F, false));

        this.neck6_r4 = new ModelRenderer(this);
        this.neck6_r4.setRotationPoint(0.9021F, 1.2984F, -3.8976F);
        this.neck1.addChild(neck6_r4);
        this.setRotateAngle(neck6_r4, -0.6342F, 0.4353F, -0.3008F);
        this.neck6_r4.cubeList.add(new ModelBox(neck6_r4, 54, 88, -0.0153F, -0.6559F, -0.3911F, 0, 1, 7, 0.0F, false));

        this.neck5_r2 = new ModelRenderer(this);
        this.neck5_r2.setRotationPoint(0.7703F, 1.4994F, -13.0086F);
        this.neck1.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, -0.6127F, 0.3644F, -0.2455F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 115, 49, -2.2519F, -3.4858F, 4.7173F, 0, 1, 6, 0.0F, false));

        this.neck5_r3 = new ModelRenderer(this);
        this.neck5_r3.setRotationPoint(-0.2297F, -0.1488F, -6.6483F);
        this.neck1.addChild(neck5_r3);
        this.setRotateAngle(neck5_r3, 0.1309F, 0.0F, 0.0F);
        this.neck5_r3.cubeList.add(new ModelBox(neck5_r3, 121, 71, 0.0F, -3.5224F, -0.5459F, 0, 4, 2, 0.0F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.2297F, 1.1512F, -6.9483F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1219F, 0.1347F, -0.0019F);


        this.neck4_r1 = new ModelRenderer(this);
        this.neck4_r1.setRotationPoint(0.0F, -2.2F, -8.0F);
        this.neck2.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, -0.1309F, 0.0F, 0.0F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 104, 121, 0.0F, -3.5129F, 5.196F, 0, 4, 2, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 29, 27, 0.0F, -2.8103F, 1.1568F, 0, 3, 3, 0.0F, false));
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 99, -1.0F, -0.4094F, -1.8562F, 2, 3, 10, 0.0F, false));

        this.neck4_r2 = new ModelRenderer(this);
        this.neck4_r2.setRotationPoint(0.0F, -6.2F, -5.0F);
        this.neck2.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 0.0436F, 0.0F, 0.0F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 0, 85, -0.5F, 0.0471F, -0.2954F, 1, 1, 3, 0.0F, false));

        this.neck5_r4 = new ModelRenderer(this);
        this.neck5_r4.setRotationPoint(-0.5405F, 0.3483F, -6.0603F);
        this.neck2.addChild(neck5_r4);
        this.setRotateAngle(neck5_r4, -0.6127F, -0.3644F, 0.2455F);
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 118, 118, 1.1827F, -1.8734F, 2.4244F, 0, 1, 5, 0.0F, true));
        this.neck5_r4.cubeList.add(new ModelBox(neck5_r4, 74, 108, 0.0F, -0.6827F, -0.112F, 0, 1, 3, 0.0F, true));

        this.neck4_r3 = new ModelRenderer(this);
        this.neck4_r3.setRotationPoint(1.0F, 0.3483F, -6.0603F);
        this.neck2.addChild(neck4_r3);
        this.setRotateAngle(neck4_r3, -0.6127F, 0.3644F, -0.2455F);
        this.neck4_r3.cubeList.add(new ModelBox(neck4_r3, 118, 118, -1.1827F, -1.8734F, 2.4244F, 0, 1, 5, 0.0F, false));
        this.neck4_r3.cubeList.add(new ModelBox(neck4_r3, 74, 108, 0.0F, -0.6827F, -0.112F, 0, 1, 3, 0.0F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -1.4F, -7.6F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, -0.1309F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 81, 64, -4.0F, -4.0F, -8.0F, 8, 7, 8, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.225F, -1.0336F, -6.4183F);
        this.head1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 58, -0.975F, -1.2F, -1.3F, 3, 2, 2, -0.15F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 6, -0.825F, -0.7F, -0.8F, 1, 1, 1, 0.003F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 6, 6.275F, -0.7F, -0.8F, 1, 1, 1, 0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 58, 4.425F, -1.2F, -1.3F, 3, 2, 2, -0.15F, false));

        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.8116F, 0.0F, 0.0F);


        this.jaw4_r1 = new ModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.0F, 3.95F, -7.55F);
        this.jaw1.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.0416F, -0.173F, -0.023F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 29, 27, 0.0F, -0.9F, -0.175F, 0, 1, 8, -0.015F, true));

        this.jaw3_r1 = new ModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.0F, 3.95F, -7.55F);
        this.jaw1.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, -0.0416F, 0.173F, 0.023F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 29, 27, 0.0F, -0.9F, -0.175F, 0, 1, 8, -0.015F, false));

        this.jaw3_r2 = new ModelRenderer(this);
        this.jaw3_r2.setRotationPoint(0.0F, 3.95F, -7.55F);
        this.jaw1.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.1309F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 108, 72, -4.0F, -0.9F, -0.175F, 2, 1, 8, -0.015F, true));
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 108, 72, 2.0F, -0.9F, -0.175F, 2, 1, 8, -0.015F, false));

        this.jaw2_r1 = new ModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, 26.7F, 37.2F);
        this.jaw1.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.0436F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 105, 13, -4.0F, -28.45F, -43.95F, 2, 3, 8, -0.01F, true));
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 105, 13, 2.0F, -28.45F, -43.95F, 2, 3, 8, -0.01F, false));

        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 1.5F, -8.4F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3927F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 20, 69, 1.0F, -1.0F, -5.975F, 1, 2, 7, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 20, 69, -2.0F, -1.0F, -5.975F, 1, 2, 7, 0.0F, true));

        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.15F, -7.55F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.5236F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 20, 114, -1.5F, -1.0F, -2.2F, 3, 2, 2, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 121, 98, 1.0F, -1.0F, -0.375F, 1, 2, 2, -0.01F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 120, 25, 1.0F, -1.0F, 0.425F, 1, 2, 2, -0.0175F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 121, 98, -2.0F, -1.0F, -0.375F, 1, 2, 2, -0.01F, true));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 120, 25, -2.0F, -1.0F, 0.425F, 1, 2, 2, -0.0175F, true));

        this.underteeth2 = new ModelRenderer(this);
        this.underteeth2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.jaw3.addChild(underteeth2);
        this.underteeth2.cubeList.add(new ModelBox(underteeth2, 115, 82, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.95F, -0.95F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2862F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 64, 103, 1.0F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 38, 27, 1.0F, -1.5F, -2.0F, 1, 2, 3, -0.01F, false));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 64, 103, -2.0F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 38, 27, -2.0F, -1.5F, -2.0F, 1, 2, 3, -0.01F, true));

        this.underteeth1 = new ModelRenderer(this);
        this.underteeth1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw2.addChild(underteeth1);
        this.underteeth1.cubeList.add(new ModelBox(underteeth1, 109, 0, -2.0F, -1.75F, -5.225F, 4, 2, 6, -0.015F, false));
        this.underteeth1.cubeList.add(new ModelBox(underteeth1, 48, 0, -2.0F, -0.75F, 0.775F, 4, 1, 2, -0.01F, false));

        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.8F, -3.4F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.1585F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.5F, -9.6F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.1361F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 25, 101, -2.5F, -2.5F, -7.0F, 5, 5, 7, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 15, 99, -2.5F, -2.5F, 0.0F, 5, 5, 2, 0.0F, false));

        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.35F, 1.925F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1056F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 48, 72, -1.5F, -2.5F, -11.0F, 3, 2, 10, 0.0F, false));

        this.head4_r1 = new ModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, -2.45F, -1.0F);
        this.head3.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.0436F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 72, 103, -1.5F, -0.05F, 0.0F, 3, 2, 2, 0.01F, false));

        this.head5_r1 = new ModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 31.3F, 44.8F);
        this.head3.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.0436F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 25, 48, 1.0F, -36.3F, -50.5F, 0, 1, 8, 0.0F, false));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 48, 48, -1.0F, -36.3F, -50.5F, 0, 1, 8, 0.0F, false));

        this.crestr = new ModelRenderer(this);
        this.crestr.setRotationPoint(-1.5F, -2.5F, -3.0F);
        this.head3.addChild(crestr);
        this.setRotateAngle(crestr, -0.0903F, -0.698F, 0.005F);
        this.crestr.cubeList.add(new ModelBox(crestr, 0, 76, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.crestr2 = new ModelRenderer(this);
        this.crestr2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.crestr.addChild(crestr2);
        this.setRotateAngle(crestr2, -0.1674F, 0.5263F, 0.0234F);
        this.crestr2.cubeList.add(new ModelBox(crestr2, 62, 90, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.crestr2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 79, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.crestl = new ModelRenderer(this);
        this.crestl.setRotationPoint(1.5F, -2.5F, -3.0F);
        this.head3.addChild(crestl);
        this.setRotateAngle(crestl, -0.0467F, 0.698F, -0.005F);
        this.crestl.cubeList.add(new ModelBox(crestl, 37, 0, -3.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.crestl2 = new ModelRenderer(this);
        this.crestl2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.crestl.addChild(crestl2);
        this.setRotateAngle(crestl2, -0.211F, -0.5263F, -0.0234F);
        this.crestl2.cubeList.add(new ModelBox(crestl2, 81, 80, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.crestl2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 16, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.3F, -6.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -0.1367F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 106, 64, -2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F, false));

        this.teeth2 = new ModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head4.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 23, 88, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.teeth1 = new ModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.head2.addChild(teeth1);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 82, 31, -2.5F, 0.0F, -6.0F, 5, 2, 6, 0.0F, false));
        this.teeth1.cubeList.add(new ModelBox(teeth1, 29, 37, -2.5F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.chestosteoderms1 = new ModelRenderer(this);
        this.chestosteoderms1.setRotationPoint(1.5F, -3.2967F, -1.5274F);
        this.chest1.addChild(chestosteoderms1);
        this.setRotateAngle(chestosteoderms1, 0.0017F, 0.0F, 0.0F);
        this.chestosteoderms1.cubeList.add(new ModelBox(chestosteoderms1, 71, 43, -2.5F, -2.0F, -13.0F, 5, 2, 14, 0.002F, false));

        this.basin1 = new ModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, -0.2F, 7.9F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0428F, 0.0112F, -0.0079F);


        this.basin7_r1 = new ModelRenderer(this);
        this.basin7_r1.setRotationPoint(-0.1839F, 12.4336F, -2.7166F);
        this.basin1.addChild(basin7_r1);
        this.setRotateAngle(basin7_r1, 0.0852F, -0.0189F, -0.0881F);
        this.basin7_r1.cubeList.add(new ModelBox(basin7_r1, 39, 114, -1.4584F, -0.4115F, -2.084F, 2, 3, 4, 0.003F, true));

        this.basin6_r1 = new ModelRenderer(this);
        this.basin6_r1.setRotationPoint(-3.4F, 4.8333F, -0.163F);
        this.basin1.addChild(basin6_r1);
        this.setRotateAngle(basin6_r1, -0.48F, 0.0F, -0.3054F);
        this.basin6_r1.cubeList.add(new ModelBox(basin6_r1, 52, 114, -0.6512F, -0.0918F, -0.3105F, 2, 9, 2, 0.003F, true));

        this.basin4_r1 = new ModelRenderer(this);
        this.basin4_r1.setRotationPoint(-3.4F, 3.4333F, 3.637F);
        this.basin1.addChild(basin4_r1);
        this.setRotateAngle(basin4_r1, 0.0436F, 0.0F, -0.3054F);
        this.basin4_r1.cubeList.add(new ModelBox(basin4_r1, 61, 114, -1.0722F, -0.6812F, -2.0357F, 2, 3, 4, 0.003F, true));

        this.basin3_r1 = new ModelRenderer(this);
        this.basin3_r1.setRotationPoint(-3.5F, 1.3271F, 6.0038F);
        this.basin1.addChild(basin3_r1);
        this.setRotateAngle(basin3_r1, 0.0436F, 0.0F, 0.0F);
        this.basin3_r1.cubeList.add(new ModelBox(basin3_r1, 20, 79, -1.1F, -1.0F, -6.5F, 2, 1, 2, 0.003F, true));
        this.basin3_r1.cubeList.add(new ModelBox(basin3_r1, 50, 101, -1.1F, -1.5F, -4.5F, 2, 3, 9, 0.003F, true));
        this.basin3_r1.cubeList.add(new ModelBox(basin3_r1, 50, 101, 6.1F, -1.5F, -4.5F, 2, 3, 9, 0.003F, false));
        this.basin3_r1.cubeList.add(new ModelBox(basin3_r1, 20, 79, 6.1F, -1.0F, -6.5F, 2, 1, 2, 0.003F, false));

        this.basin5_r1 = new ModelRenderer(this);
        this.basin5_r1.setRotationPoint(-3.4F, 4.8333F, 3.637F);
        this.basin1.addChild(basin5_r1);
        this.setRotateAngle(basin5_r1, -1.0036F, 0.0F, -0.3927F);
        this.basin5_r1.cubeList.add(new ModelBox(basin5_r1, 118, 10, -0.6333F, 0.1965F, -2.4764F, 2, 3, 3, 0.003F, true));

        this.basin5_r2 = new ModelRenderer(this);
        this.basin5_r2.setRotationPoint(-2.0636F, 4.5471F, 5.4429F);
        this.basin1.addChild(basin5_r2);
        this.setRotateAngle(basin5_r2, -0.6109F, 0.0F, -0.6109F);
        this.basin5_r2.cubeList.add(new ModelBox(basin5_r2, 43, 101, -1.6376F, -1.129F, -0.9448F, 2, 2, 4, 0.003F, true));

        this.basin6_r2 = new ModelRenderer(this);
        this.basin6_r2.setRotationPoint(-2.0636F, 4.5471F, 5.4429F);
        this.basin1.addChild(basin6_r2);
        this.setRotateAngle(basin6_r2, -0.6222F, -0.1782F, -0.4844F);
        this.basin6_r2.cubeList.add(new ModelBox(basin6_r2, 71, 60, -0.8774F, -1.129F, 3.0702F, 2, 2, 6, 0.003F, true));

        this.basin3_r2 = new ModelRenderer(this);
        this.basin3_r2.setRotationPoint(0.0F, 1.2505F, -1.4943F);
        this.basin1.addChild(basin3_r2);
        this.setRotateAngle(basin3_r2, -0.0436F, 0.0F, 0.0F);
        this.basin3_r2.cubeList.add(new ModelBox(basin3_r2, 48, 58, -3.0F, -0.9505F, 3.9943F, 2, 1, 6, 0.003F, true));
        this.basin3_r2.cubeList.add(new ModelBox(basin3_r2, 48, 58, 1.0F, -0.9505F, 3.9943F, 2, 1, 6, 0.003F, false));
        this.basin3_r2.cubeList.add(new ModelBox(basin3_r2, 84, 94, -1.0F, -1.7505F, -0.0057F, 2, 3, 11, 0.003F, false));

        this.basin6_r3 = new ModelRenderer(this);
        this.basin6_r3.setRotationPoint(0.1839F, 12.4336F, -2.7166F);
        this.basin1.addChild(basin6_r3);
        this.setRotateAngle(basin6_r3, 0.0852F, 0.0189F, 0.0881F);
        this.basin6_r3.cubeList.add(new ModelBox(basin6_r3, 39, 114, -0.5416F, -0.4115F, -2.084F, 2, 3, 4, 0.003F, false));

        this.basin5_r3 = new ModelRenderer(this);
        this.basin5_r3.setRotationPoint(3.4F, 4.8333F, -0.163F);
        this.basin1.addChild(basin5_r3);
        this.setRotateAngle(basin5_r3, -0.48F, 0.0F, 0.3054F);
        this.basin5_r3.cubeList.add(new ModelBox(basin5_r3, 52, 114, -1.3488F, -0.0918F, -0.3105F, 2, 9, 2, 0.003F, false));

        this.basin4_r2 = new ModelRenderer(this);
        this.basin4_r2.setRotationPoint(3.4F, 4.8333F, 3.637F);
        this.basin1.addChild(basin4_r2);
        this.setRotateAngle(basin4_r2, -1.0036F, 0.0F, 0.3927F);
        this.basin4_r2.cubeList.add(new ModelBox(basin4_r2, 118, 10, -1.3667F, 0.1965F, -2.4764F, 2, 3, 3, 0.003F, false));

        this.basin5_r4 = new ModelRenderer(this);
        this.basin5_r4.setRotationPoint(2.0636F, 4.5471F, 5.4429F);
        this.basin1.addChild(basin5_r4);
        this.setRotateAngle(basin5_r4, -0.6222F, 0.1782F, 0.4844F);
        this.basin5_r4.cubeList.add(new ModelBox(basin5_r4, 71, 60, -1.1226F, -1.129F, 3.0702F, 2, 2, 6, 0.003F, false));

        this.basin4_r3 = new ModelRenderer(this);
        this.basin4_r3.setRotationPoint(2.0636F, 4.5471F, 5.4429F);
        this.basin1.addChild(basin4_r3);
        this.setRotateAngle(basin4_r3, -0.6109F, 0.0F, 0.6109F);
        this.basin4_r3.cubeList.add(new ModelBox(basin4_r3, 43, 101, -0.3624F, -1.129F, -0.9448F, 2, 2, 4, 0.003F, false));

        this.basin3_r3 = new ModelRenderer(this);
        this.basin3_r3.setRotationPoint(3.4F, 3.4333F, 3.637F);
        this.basin1.addChild(basin3_r3);
        this.setRotateAngle(basin3_r3, 0.0436F, 0.0F, 0.3054F);
        this.basin3_r3.cubeList.add(new ModelBox(basin3_r3, 61, 114, -0.9278F, -0.6812F, -2.0357F, 2, 3, 4, 0.003F, false));

        this.neck20_r1 = new ModelRenderer(this);
        this.neck20_r1.setRotationPoint(0.0F, -0.016F, -0.7795F);
        this.basin1.addChild(neck20_r1);
        this.setRotateAngle(neck20_r1, -0.0524F, 0.0F, 0.0F);
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 86, 0, 0.0F, -2.6215F, 8.6401F, 0, 4, 2, 0.0F, false));
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 38, 88, 0.0F, -3.1244F, 5.5763F, 0, 4, 2, 0.0F, false));
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 54, 88, 0.0F, -3.2292F, 2.5515F, 0, 4, 2, 0.0F, false));
        this.neck20_r1.cubeList.add(new ModelBox(neck20_r1, 91, 0, 0.0F, -2.9359F, -0.4341F, 0, 4, 2, 0.0F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(4.4F, 4.9319F, 3.7007F);
        this.basin1.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.0593F, -0.0574F, -0.1177F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 91, 112, -1.5F, -1.3362F, -1.386F, 3, 16, 3, 0.003F, false));

        this.leg2 = new ModelRenderer(this);
        this.leg2.setRotationPoint(1.0F, 14.5226F, -0.843F);
        this.upperleg2.addChild(leg2);
        this.setRotateAngle(leg2, 1.0688F, -0.0632F, 0.0943F);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 45, -2.5F, -0.8101F, -0.3267F, 3, 14, 2, 0.0F, false));
        this.leg2.cubeList.add(new ModelBox(leg2, 11, 24, -2.0F, -0.6558F, 2.3663F, 2, 14, 1, 0.0F, false));

        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-1.0F, 12.9899F, 2.1733F);
        this.leg2.addChild(feet2);
        this.setRotateAngle(feet2, 0.2143F, 0.0F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 85, 80, -3.05F, -1.5F, -8.0F, 6, 3, 10, 0.0F, false));

        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 0.0873F, 0.0F, 0.0F);
        this.toes2.cubeList.add(new ModelBox(toes2, 58, 16, -3.0F, -1.5F, -3.0F, 6, 3, 3, 0.0F, false));

        this.upperleg3 = new ModelRenderer(this);
        this.upperleg3.setRotationPoint(-4.4F, 4.9319F, 3.7007F);
        this.basin1.addChild(upperleg3);
        this.setRotateAngle(upperleg3, -0.5916F, 0.0574F, 0.1177F);
        this.upperleg3.cubeList.add(new ModelBox(upperleg3, 0, 0, -1.5F, -1.3362F, -1.386F, 3, 16, 3, 0.003F, false));

        this.leg3 = new ModelRenderer(this);
        this.leg3.setRotationPoint(-1.0F, 14.5226F, -0.843F);
        this.upperleg3.addChild(leg3);
        this.setRotateAngle(leg3, 0.458F, 0.0632F, -0.0943F);
        this.leg3.cubeList.add(new ModelBox(leg3, 0, 24, -0.5F, -0.8101F, -0.3267F, 3, 14, 2, 0.0F, false));
        this.leg3.cubeList.add(new ModelBox(leg3, 13, 0, 0.0F, -0.6558F, 2.3663F, 2, 14, 1, 0.0F, false));

        this.feet3 = new ModelRenderer(this);
        this.feet3.setRotationPoint(1.0F, 12.9899F, 2.1733F);
        this.leg3.addChild(feet3);
        this.setRotateAngle(feet3, 0.258F, 0.0F, 0.0F);
        this.feet3.cubeList.add(new ModelBox(feet3, 0, 85, -2.95F, -1.5F, -8.0F, 6, 3, 10, 0.0F, false));

        this.toes3 = new ModelRenderer(this);
        this.toes3.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.feet3.addChild(toes3);
        this.setRotateAngle(toes3, -0.3054F, 0.0F, 0.0F);
        this.toes3.cubeList.add(new ModelBox(toes3, 25, 13, -3.0F, -1.5F, -3.0F, 6, 3, 3, 0.0F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 4.4002F, 9.3909F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, 0.09F, -0.1304F, -0.0117F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, -1.2198F, 5.3411F);
        this.tail1.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, 0.5672F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 92, 94, 0.0F, -1.0765F, -2.0995F, 0, 3, 1, 0.0F, false));
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 74, 60, 0.0F, 6.983F, 10.5513F, 0, 4, 1, 0.0F, false));
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 44, 13, 0.0F, 5.2868F, 8.0749F, 0, 5, 1, 0.0F, false));
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 55, 72, 0.0F, 3.4218F, 5.7059F, 0, 6, 1, 0.0F, false));
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 56, 101, 0.0F, 1.6413F, 3.2832F, 0, 6, 1, 0.0F, false));
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 82, 31, 0.0F, 0.5354F, 0.4306F, 0, 4, 1, 0.0F, false));

        this.tail1_r1 = new ModelRenderer(this);
        this.tail1_r1.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.0436F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 0, 0, -1.0F, -1.5F, 0.0F, 2, 3, 20, 0.0F, false));

        this.neck26_r1 = new ModelRenderer(this);
        this.neck26_r1.setRotationPoint(0.0F, -4.4162F, -10.1704F);
        this.tail1.addChild(neck26_r1);
        this.setRotateAngle(neck26_r1, -0.0524F, 0.0F, 0.0F);
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 48, 58, 0.0F, -1.7025F, 26.7099F, 0, 3, 2, 0.0F, false));
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 0, 66, 0.0F, -2.0448F, 23.6878F, 0, 3, 2, 0.0F, false));
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 20, 66, 0.0F, -2.1874F, 20.6762F, 0, 4, 2, 0.0F, false));
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 30, 69, 0.0F, -2.4299F, 17.6594F, 0, 4, 2, 0.0F, false));
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 77, 16, 0.0F, -2.5724F, 14.6478F, 0, 4, 2, 0.0F, false));
        this.neck26_r1.cubeList.add(new ModelBox(neck26_r1, 84, 16, 0.0F, -2.6152F, 11.6414F, 0, 4, 2, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 18.1F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1308F, -0.1278F, 0.0282F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, -2.3648F, 0.9855F);
        this.tail2.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 25, 48, -1.0F, -0.6357F, -0.0083F, 2, 2, 18, 0.002F, false));

        this.neck29_r1 = new ModelRenderer(this);
        this.neck29_r1.setRotationPoint(0.0F, -2.6683F, 2.412F);
        this.tail2.addChild(neck29_r1);
        this.setRotateAngle(neck29_r1, -0.1396F, 0.0F, 0.0F);
        this.neck29_r1.cubeList.add(new ModelBox(neck29_r1, 54, 27, 0.0F, -0.8689F, 5.0862F, 0, 2, 2, 0.0F, false));
        this.neck29_r1.cubeList.add(new ModelBox(neck29_r1, 62, 27, 0.0F, -0.9853F, 2.0619F, 0, 2, 2, 0.0F, false));
        this.neck29_r1.cubeList.add(new ModelBox(neck29_r1, 66, 0, 0.0F, -0.9027F, -0.9436F, 0, 2, 2, 0.0F, false));

        this.tail11_r1 = new ModelRenderer(this);
        this.tail11_r1.setRotationPoint(0.0F, -0.7198F, -12.7589F);
        this.tail2.addChild(tail11_r1);
        this.setRotateAngle(tail11_r1, 0.5672F, 0.0F, 0.0F);
        this.tail11_r1.cubeList.add(new ModelBox(tail11_r1, 71, 72, 0.0F, 14.7183F, 22.8342F, 0, 3, 1, 0.0F, false));
        this.tail11_r1.cubeList.add(new ModelBox(tail11_r1, 89, 16, 0.0F, 12.9928F, 20.38F, 0, 3, 1, 0.0F, false));
        this.tail11_r1.cubeList.add(new ModelBox(tail11_r1, 7, 90, 0.0F, 11.2674F, 17.9259F, 0, 3, 1, 0.0F, false));
        this.tail11_r1.cubeList.add(new ModelBox(tail11_r1, 92, 80, 0.0F, 9.951F, 15.1841F, 0, 3, 1, 0.0F, false));
        this.tail11_r1.cubeList.add(new ModelBox(tail11_r1, 71, 60, 0.0F, 7.9801F, 12.9025F, 0, 4, 1, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 16.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2253F, 0.1702F, -0.0388F);


        this.tail3_r2 = new ModelRenderer(this);
        this.tail3_r2.setRotationPoint(0.0F, 0.3648F, 1.4855F);
        this.tail3.addChild(tail3_r2);
        this.setRotateAngle(tail3_r2, -0.0873F, 0.0F, 0.0F);
        this.tail3_r2.cubeList.add(new ModelBox(tail3_r2, 48, 51, -1.0F, -1.3643F, -0.5083F, 2, 2, 18, 0.0F, false));

        this.tail15_r1 = new ModelRenderer(this);
        this.tail15_r1.setRotationPoint(0.0F, -0.1198F, -29.4589F);
        this.tail3.addChild(tail15_r1);
        this.setRotateAngle(tail15_r1, 0.5672F, 0.0F, 0.0F);
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 25, 0, 0.0F, 21.7553F, 33.1908F, 0, 2, 1, 0.0F, false));
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 30, 0, 0.0F, 20.2603F, 30.5899F, 0, 2, 1, 0.0F, false));
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 44, 37, 0.0F, 17.7653F, 27.9889F, 0, 3, 1, 0.0F, false));
        this.tail15_r1.cubeList.add(new ModelBox(tail15_r1, 65, 72, 0.0F, 16.2703F, 25.388F, 0, 3, 1, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 17.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1864F, 0.2145F, -0.0401F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 66, -0.5F, 0.986F, 1.447F, 1, 1, 17, 0.0F, false));

        this.tail2osteoderme1 = new ModelRenderer(this);
        this.tail2osteoderme1.setRotationPoint(-0.6F, -4.8988F, 0.5546F);
        this.tail2.addChild(tail2osteoderme1);
        this.setRotateAngle(tail2osteoderme1, -0.1833F, 0.0F, 0.0F);
        this.tail2osteoderme1.cubeList.add(new ModelBox(tail2osteoderme1, 0, 45, -1.5F, -1.1009F, -0.041F, 3, 2, 18, 0.002F, false));

        this.tail2osteoderme2 = new ModelRenderer(this);
        this.tail2osteoderme2.setRotationPoint(0.6F, -3.9997F, 0.5137F);
        this.tail2.addChild(tail2osteoderme2);
        this.setRotateAngle(tail2osteoderme2, -0.1745F, 0.0F, 0.0F);
        this.tail2osteoderme2.cubeList.add(new ModelBox(tail2osteoderme2, 29, 27, -1.5F, -2.0F, 0.0F, 3, 2, 18, 0.0F, false));

        this.tail1osteoderme1 = new ModelRenderer(this);
        this.tail1osteoderme1.setRotationPoint(-1.0F, -6.6F, 0.5F);
        this.tail1.addChild(tail1osteoderme1);
        this.setRotateAngle(tail1osteoderme1, -0.1134F, 0.0F, 0.0F);
        this.tail1osteoderme1.cubeList.add(new ModelBox(tail1osteoderme1, 29, 6, -2.5F, -2.0F, 0.0F, 5, 2, 18, 0.002F, false));

        this.tai1losteoderme2 = new ModelRenderer(this);
        this.tai1losteoderme2.setRotationPoint(1.0F, -6.6F, 0.5F);
        this.tail1.addChild(tai1losteoderme2);
        this.setRotateAngle(tai1losteoderme2, -0.1047F, 0.0F, 0.0F);
        this.tai1losteoderme2.cubeList.add(new ModelBox(tai1losteoderme2, 0, 24, -2.5F, -2.0F, 0.0F, 5, 2, 18, 0.0F, false));

        this.basinosteoderme1 = new ModelRenderer(this);
        this.basinosteoderme1.setRotationPoint(1.2F, -2.7979F, -0.9911F);
        this.basin1.addChild(basinosteoderme1);
        this.setRotateAngle(basinosteoderme1, -0.0436F, 0.0F, 0.0F);
        this.basinosteoderme1.cubeList.add(new ModelBox(basinosteoderme1, 64, 90, -2.5F, -2.0F, 0.0F, 5, 2, 10, 0.002F, false));

        this.osteoderms1 = new ModelRenderer(this);
        this.osteoderms1.setRotationPoint(1.6F, -2.5963F, -0.0819F);
        this.body1.addChild(osteoderms1);
        this.setRotateAngle(osteoderms1, 0.0873F, 0.0F, 0.0F);
        this.osteoderms1.cubeList.add(new ModelBox(osteoderms1, 58, 0, -3.5F, -2.0F, -6.5F, 7, 2, 13, 0.002F, false));

        this.osteoderms2 = new ModelRenderer(this);
        this.osteoderms2.setRotationPoint(-1.6F, -2.4967F, -0.0728F);
        this.body1.addChild(osteoderms2);
        this.setRotateAngle(osteoderms2, 0.0873F, 0.0F, 0.0F);
        this.osteoderms2.cubeList.add(new ModelBox(osteoderms2, 54, 27, -3.5F, -2.0F, -6.5F, 7, 2, 13, 0.0F, false));

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
