package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPlateosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer root;
    private final ModelRenderer basin;
    private final ModelRenderer basin_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail6;
    private final ModelRenderer cube_r6;
    private final ModelRenderer upperleg2;
    private final ModelRenderer lowerleg2;
    private final ModelRenderer feet2;
    private final ModelRenderer toes2;
    private final ModelRenderer upperleg3;
    private final ModelRenderer lowerleg3;
    private final ModelRenderer feet3;
    private final ModelRenderer toes3;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3_r1;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head1;
    private final ModelRenderer head2;
    private final ModelRenderer head4;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer jaw1;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw4;
    private final ModelRenderer upperarm2;
    private final ModelRenderer arms2;
    private final ModelRenderer hands2;
    private final ModelRenderer thumbclaw2;
    private final ModelRenderer upperarm3;
    private final ModelRenderer arms3;
    private final ModelRenderer hands3;
    private final ModelRenderer thumbclaw3;

    public ModelSkeletonPlateosaurusFrame() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.669F, -24.0F, -26.0745F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.3F, -10.0F, -0.5F, 1, 34, 1, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.669F, -24.0F, -26.0745F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 3.1F, -5.6F, -0.5F, 1, 12, 1, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -24.0F, 0.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -6.0F, -0.5F, 1, 30, 1, -0.2F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -24.0F, 0.0F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 2.8F, -5.0F, -0.5F, 1, 8, 1, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(-0.2F, -24.0F, 0.0F);
        this.fossil.addChild(root);


        this.basin = new ModelRenderer(this);
        this.basin.setRotationPoint(-0.1F, -10.6F, -13.4F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.2637F, 0.0F, 0.0F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.1F, -0.1139F, 9.8159F);
        this.basin.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0524F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 38, 4, -0.8F, 0.7F, 0.0F, 1, 1, 11, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(-0.6F, 0.1183F, 20.2029F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, 0.0266F, 0.1745F, 0.0046F);
        this.tail1.cubeList.add(new ModelBox(tail1, 31, 33, -0.2F, 0.9853F, -0.3552F, 1, 1, 13, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0793F, 12.0604F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0459F, 0.1308F, -0.006F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.3F, 1.4387F, -0.0305F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, 0.0349F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 0, 47, -0.5F, -0.5F, -0.2F, 1, 1, 11, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.298F, 10.5436F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1378F, 0.1297F, -0.0179F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.3F, 1.3938F, -0.161F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, 0.1047F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 19, 17, -0.4F, -0.4968F, -0.4093F, 1, 1, 14, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, -0.7702F, 13.1695F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0498F, -0.1307F, 0.0065F);


        this.tail5_r1 = new ModelRenderer(this);
        this.tail5_r1.setRotationPoint(-0.2F, -0.0054F, -0.1118F);
        this.tail4.addChild(tail5_r1);
        this.setRotateAngle(tail5_r1, 0.0349F, 0.0F, 0.0F);
        this.tail5_r1.cubeList.add(new ModelBox(tail5_r1, 15, 49, -0.5F, 0.3F, -0.2F, 1, 1, 12, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.4161F, 11.8344F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0457F, -0.3051F, -0.0138F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0009F, -0.2857F);
        this.tail5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 49, -0.7F, 0.3F, 0.0F, 1, 1, 11, -0.2F, false));

        this.Tail6 = new ModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.5116F, 10.615F);
        this.tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, 0.0915F, -0.3042F, -0.0275F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.004F, 0.0489F);
        this.Tail6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 0, -0.7F, 0.2F, -0.3F, 1, 1, 8, -0.2F, false));

        this.upperleg2 = new ModelRenderer(this);
        this.upperleg2.setRotationPoint(7.0F, 1.1861F, 14.9159F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.3264F, 0.0F, 0.0F);


        this.lowerleg2 = new ModelRenderer(this);
        this.lowerleg2.setRotationPoint(0.0F, 13.7F, 0.1F);
        this.upperleg2.addChild(lowerleg2);
        this.setRotateAngle(lowerleg2, 1.0938F, 0.0F, 0.0F);


        this.feet2 = new ModelRenderer(this);
        this.feet2.setRotationPoint(-0.5F, 11.1453F, 0.5862F);
        this.lowerleg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.81F, 0.0F, 0.0F);


        this.toes2 = new ModelRenderer(this);
        this.toes2.setRotationPoint(-1.1F, 6.7879F, -1.1122F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 0.3149F, 0.0F, 0.0F);


        this.upperleg3 = new ModelRenderer(this);
        this.upperleg3.setRotationPoint(-7.4F, 1.1861F, 14.9159F);
        this.basin.addChild(upperleg3);
        this.setRotateAngle(upperleg3, 0.0227F, 0.0F, 0.0F);


        this.lowerleg3 = new ModelRenderer(this);
        this.lowerleg3.setRotationPoint(0.0F, 13.7F, 0.1F);
        this.upperleg3.addChild(lowerleg3);
        this.setRotateAngle(lowerleg3, 1.2683F, 0.0F, 0.0F);


        this.feet3 = new ModelRenderer(this);
        this.feet3.setRotationPoint(0.5F, 11.1453F, 0.5862F);
        this.lowerleg3.addChild(feet3);
        this.setRotateAngle(feet3, -0.8536F, 0.0F, 0.0F);


        this.toes3 = new ModelRenderer(this);
        this.toes3.setRotationPoint(1.1F, 6.7879F, -1.1122F);
        this.feet3.addChild(toes3);
        this.setRotateAngle(toes3, 0.0531F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0683F, 9.8169F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);


        this.body_r1 = new ModelRenderer(this);
        this.body_r1.setRotationPoint(-0.1F, -0.5109F, -7.9F);
        this.body.addChild(body_r1);
        this.setRotateAngle(body_r1, -0.0524F, 0.0F, 0.0F);
        this.body_r1.cubeList.add(new ModelBox(body_r1, 56, 40, -0.6F, 0.8074F, -0.3202F, 1, 1, 9, -0.2F, false));

        this.body_r2 = new ModelRenderer(this);
        this.body_r2.setRotationPoint(-0.1F, 0.0891F, -16.6F);
        this.body.addChild(body_r2);
        this.setRotateAngle(body_r2, 0.0873F, 0.0F, 0.0F);
        this.body_r2.cubeList.add(new ModelBox(body_r2, 18, 33, -0.6F, 0.9F, 0.7F, 1, 1, 8, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.0109F, -16.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.2159F, 0.0029F, -0.0327F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.1F, 0.9704F, -12.0494F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.0873F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 0, 31, -0.6F, 1.1008F, -0.5558F, 1, 1, 13, -0.2F, false));

        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.2123F, -11.7708F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2676F, 0.0F, 0.0F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(-0.2F, 0.2922F, -6.9386F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, -0.0349F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 57, 9, -0.5F, 0.4907F, -0.8945F, 1, 1, 8, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(-0.7F, -0.3123F, -6.5601F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.7663F, -0.1147F, 0.0631F);


        this.neck3_r1 = new ModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.5F, 0.1534F, -0.1688F);
        this.neck2.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.105F, -0.0694F, 0.0073F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 29, 48, -0.5F, 1.0188F, -7.9184F, 1, 1, 9, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.7196F, -6.931F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.548F, -0.1455F, -0.3735F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2734F, -0.7067F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3229F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 76, 0.0F, 1.2111F, -3.0519F, 1, 1, 3, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6734F, -6.5067F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0087F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 75, 0.0F, 0.6F, -0.9F, 1, 1, 4, -0.2F, false));

        this.head1 = new ModelRenderer(this);
        this.head1.setRotationPoint(0.5F, -0.9861F, -6.5821F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.5995F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.1F, -0.9187F, -3.7582F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, -0.182F, 0.0F, 0.0F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.2F, -3.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.7285F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.5813F, -4.1582F);
        this.head1.addChild(head3);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.4F, -4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0911F, 0.0F, 0.0F);


        this.jaw1 = new ModelRenderer(this);
        this.jaw1.setRotationPoint(0.1F, 1.2813F, -0.1582F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, 0.4363F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.1F, -3.6F);
        this.jaw1.addChild(jaw2);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(-0.1F, 0.3092F, -4.0987F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.0911F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(-0.1F, 1.7592F, 0.1013F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0948F, 0.0F, 0.0F);


        this.upperarm2 = new ModelRenderer(this);
        this.upperarm2.setRotationPoint(5.5F, 7.6711F, -7.5052F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7837F, -0.4348F, -0.7981F);


        this.arms2 = new ModelRenderer(this);
        this.arms2.setRotationPoint(0.0143F, 5.6121F, 0.1888F);
        this.upperarm2.addChild(arms2);
        this.setRotateAngle(arms2, 0.9133F, 0.6818F, 0.3977F);


        this.hands2 = new ModelRenderer(this);
        this.hands2.setRotationPoint(-0.1779F, -0.7747F, -5.3249F);
        this.arms2.addChild(hands2);
        this.setRotateAngle(hands2, 0.0F, 0.5236F, 0.0F);


        this.thumbclaw2 = new ModelRenderer(this);
        this.thumbclaw2.setRotationPoint(0.0F, -1.6F, -1.6F);
        this.hands2.addChild(thumbclaw2);
        this.setRotateAngle(thumbclaw2, -0.7741F, 0.0F, 0.0F);


        this.upperarm3 = new ModelRenderer(this);
        this.upperarm3.setRotationPoint(-5.9F, 7.6711F, -7.5052F);
        this.chest.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 1.1639F, -0.0659F, 0.4787F);


        this.arms3 = new ModelRenderer(this);
        this.arms3.setRotationPoint(-0.0143F, 5.6121F, 0.1888F);
        this.upperarm3.addChild(arms3);
        this.setRotateAngle(arms3, -0.1669F, -0.2516F, 0.0526F);


        this.hands3 = new ModelRenderer(this);
        this.hands3.setRotationPoint(0.1779F, -0.7747F, -5.3249F);
        this.arms3.addChild(hands3);
        this.setRotateAngle(hands3, 0.0F, -0.3054F, 0.0F);


        this.thumbclaw3 = new ModelRenderer(this);
        this.thumbclaw3.setRotationPoint(0.0F, -1.6F, -1.6F);
        this.hands3.addChild(thumbclaw3);
        this.setRotateAngle(thumbclaw3, -0.7741F, 0.0F, 0.0F);

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
