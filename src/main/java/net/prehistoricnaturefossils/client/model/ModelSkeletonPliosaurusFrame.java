package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPliosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer basin_r1;
    private final ModelRenderer basin_r2;
    private final ModelRenderer basin_r3;
    private final ModelRenderer Pliosaurus;
    private final ModelRenderer basin_r4;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Shoulder;
    private final ModelRenderer Neck3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Neck2;
    private final ModelRenderer Neck1;
    private final ModelRenderer Head;
    private final ModelRenderer Jaw;
    private final ModelRenderer FrontFlipperL;
    private final ModelRenderer FrontFlipperMiddleL;
    private final ModelRenderer FrontFlipperEndL;
    private final ModelRenderer FrontFlipperL2;
    private final ModelRenderer FrontFlipperMiddleL2;
    private final ModelRenderer FrontFlipperEndL2;
    private final ModelRenderer BackFlipperL;
    private final ModelRenderer BackFlipperMiddleL;
    private final ModelRenderer BackFlipperEndL;
    private final ModelRenderer BackFlipperL2;
    private final ModelRenderer BackFlipperMiddleL2;
    private final ModelRenderer BackFlipperEndL2;
    private final ModelRenderer Tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Tail3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Tail4;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;

    public ModelSkeletonPliosaurusFrame() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 60, 33, -1.0F, -28.6206F, 22.2857F, 2, 8, 2, -0.5F, false));

        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(5.0F, -19.1206F, -16.2143F);
        this.fossil.addChild(basin_r1);
        this.setRotateAngle(basin_r1, 0.1396F, 0.0F, -1.5708F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 56, 94, -2.9F, -13.0F, -1.0F, 2, 26, 2, -0.51F, false));

        this.basin_r2 = new ModelRenderer(this);
        this.basin_r2.setRotationPoint(5.0F, -19.1206F, -16.2143F);
        this.fossil.addChild(basin_r2);
        this.setRotateAngle(basin_r2, 0.0F, -0.1396F, 0.0F);
        this.basin_r2.cubeList.add(new ModelBox(basin_r2, 0, 79, -1.0F, -6.4F, -1.0F, 2, 9, 2, -0.5F, false));

        this.basin_r3 = new ModelRenderer(this);
        this.basin_r3.setRotationPoint(0.0F, -23.6206F, 23.2857F);
        this.fossil.addChild(basin_r3);
        this.setRotateAngle(basin_r3, 0.0F, 0.0F, -1.5708F);
        this.basin_r3.cubeList.add(new ModelBox(basin_r3, 65, 94, -3.1F, -13.0F, -1.0F, 2, 26, 2, -0.51F, false));

        this.Pliosaurus = new ModelRenderer(this);
        this.Pliosaurus.setRotationPoint(0.5F, -28.25F, 25.0F);
        this.fossil.addChild(Pliosaurus);


        this.basin_r4 = new ModelRenderer(this);
        this.basin_r4.setRotationPoint(0.5F, 1.3F, -7.4F);
        this.Pliosaurus.addChild(basin_r4);
        this.setRotateAngle(basin_r4, -0.0698F, 0.0F, 0.0F);
        this.basin_r4.cubeList.add(new ModelBox(basin_r4, 44, 14, -2.0F, -2.5206F, -0.3143F, 2, 3, 15, -0.4F, false));

        this.Chest = new ModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, -1.7F, -7.4F);
        this.Pliosaurus.addChild(Chest);
        this.setRotateAngle(Chest, -0.0616F, -0.1307F, 0.008F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.3831F, -10.8622F);
        this.Chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 73, 48, -1.5F, 1.9058F, -0.4546F, 2, 3, 12, -0.4F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.9831F, -26.2622F);
        this.Chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 18, -1.5F, 7.4851F, -0.8563F, 2, 3, 16, -0.4F, false));

        this.Shoulder = new ModelRenderer(this);
        this.Shoulder.setRotationPoint(0.0F, 2.7169F, -26.4622F);
        this.Chest.addChild(Shoulder);
        this.setRotateAngle(Shoulder, 0.2452F, -0.0847F, -0.0212F);
        this.Shoulder.cubeList.add(new ModelBox(Shoulder, 64, 0, -1.5F, 0.8996F, -13.0405F, 2, 3, 14, -0.4F, false));

        this.Neck3 = new ModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0923F, -12.6223F);
        this.Shoulder.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0437F, -0.0436F, -0.0019F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.7F, -8.0F);
        this.Neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 104, 60, -1.5F, 1.8F, -0.7F, 2, 3, 9, -0.4F, false));

        this.Neck2 = new ModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.3F, -8.0F);
        this.Neck3.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, -0.2618F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 90, 40, -1.5F, 0.7569F, -9.6228F, 2, 3, 10, -0.4F, false));

        this.Neck1 = new ModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -0.0431F, -9.0228F);
        this.Neck2.addChild(Neck1);
        this.setRotateAngle(Neck1, -0.105F, -0.1745F, 0.0031F);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 0, 79, -1.5F, 0.7227F, -11.6583F, 2, 3, 12, -0.4F, false));

        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.3174F, -7.9894F);
        this.Neck1.addChild(Head);
        this.setRotateAngle(Head, -0.043F, -0.1264F, 0.1296F);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 5.3441F, -0.0486F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.6283F, 0.0F, 0.0F);


        this.FrontFlipperL = new ModelRenderer(this);
        this.FrontFlipperL.setRotationPoint(10.5F, 9.7864F, -8.5035F);
        this.Shoulder.addChild(FrontFlipperL);
        this.setRotateAngle(FrontFlipperL, 0.2182F, 0.3491F, 0.3491F);


        this.FrontFlipperMiddleL = new ModelRenderer(this);
        this.FrontFlipperMiddleL.setRotationPoint(13.8742F, -1.7954F, 0.052F);
        this.FrontFlipperL.addChild(FrontFlipperMiddleL);
        this.setRotateAngle(FrontFlipperMiddleL, 0.0F, -0.1745F, 0.0F);


        this.FrontFlipperEndL = new ModelRenderer(this);
        this.FrontFlipperEndL.setRotationPoint(15.8443F, 0.5F, 0.3531F);
        this.FrontFlipperMiddleL.addChild(FrontFlipperEndL);
        this.setRotateAngle(FrontFlipperEndL, 0.0F, -0.1309F, 0.0F);


        this.FrontFlipperL2 = new ModelRenderer(this);
        this.FrontFlipperL2.setRotationPoint(-11.5F, 9.7864F, -8.5035F);
        this.Shoulder.addChild(FrontFlipperL2);
        this.setRotateAngle(FrontFlipperL2, 0.0F, 0.0F, -0.3927F);


        this.FrontFlipperMiddleL2 = new ModelRenderer(this);
        this.FrontFlipperMiddleL2.setRotationPoint(-13.8742F, -1.7954F, 0.052F);
        this.FrontFlipperL2.addChild(FrontFlipperMiddleL2);
        this.setRotateAngle(FrontFlipperMiddleL2, 0.0F, 0.1745F, 0.0F);


        this.FrontFlipperEndL2 = new ModelRenderer(this);
        this.FrontFlipperEndL2.setRotationPoint(-15.8443F, 0.5F, 0.3531F);
        this.FrontFlipperMiddleL2.addChild(FrontFlipperEndL2);
        this.setRotateAngle(FrontFlipperEndL2, 0.0F, 0.1309F, 0.0F);


        this.BackFlipperL = new ModelRenderer(this);
        this.BackFlipperL.setRotationPoint(12.0F, 6.4806F, -1.82F);
        this.Pliosaurus.addChild(BackFlipperL);
        this.setRotateAngle(BackFlipperL, 0.1309F, -0.3491F, -0.2618F);


        this.BackFlipperMiddleL = new ModelRenderer(this);
        this.BackFlipperMiddleL.setRotationPoint(11.267F, 0.5F, -2.3177F);
        this.BackFlipperL.addChild(BackFlipperMiddleL);
        this.setRotateAngle(BackFlipperMiddleL, 0.0F, -0.1309F, 0.0F);


        this.BackFlipperEndL = new ModelRenderer(this);
        this.BackFlipperEndL.setRotationPoint(16.2489F, 0.5F, 3.4266F);
        this.BackFlipperMiddleL.addChild(BackFlipperEndL);
        this.setRotateAngle(BackFlipperEndL, 0.0F, -0.1309F, 0.0F);


        this.BackFlipperL2 = new ModelRenderer(this);
        this.BackFlipperL2.setRotationPoint(-13.0F, 6.4806F, -1.82F);
        this.Pliosaurus.addChild(BackFlipperL2);
        this.setRotateAngle(BackFlipperL2, 0.0681F, 0.298F, 0.2284F);


        this.BackFlipperMiddleL2 = new ModelRenderer(this);
        this.BackFlipperMiddleL2.setRotationPoint(-11.267F, 0.5F, -2.3177F);
        this.BackFlipperL2.addChild(BackFlipperMiddleL2);
        this.setRotateAngle(BackFlipperMiddleL2, 0.0F, 0.1309F, 0.0F);


        this.BackFlipperEndL2 = new ModelRenderer(this);
        this.BackFlipperEndL2.setRotationPoint(-16.2489F, 0.5F, 3.4266F);
        this.BackFlipperMiddleL2.addChild(BackFlipperEndL2);
        this.setRotateAngle(BackFlipperEndL2, 0.0F, 0.1309F, 0.0F);


        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, -0.4F, 7.0F);
        this.Pliosaurus.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1314F, -0.0865F, 0.0114F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.8509F, 0.2314F);
        this.Tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1833F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 112, 0, -1.5F, -2.1746F, -0.5527F, 2, 2, 9, -0.41F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 112, 0, -1.5F, -1.6746F, -0.5527F, 2, 2, 9, -0.4F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.1509F, 8.2314F);
        this.Tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 100, 123, -1.0F, -1.6845F, -0.3896F, 1, 2, 7, -0.2F, false));

        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -1.6491F, 13.8314F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0F, -0.1745F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9F, 0.2F);
        this.Tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1571F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 53, -1.0F, 0.7286F, -0.296F, 1, 2, 3, -0.2F, false));

        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 2.9F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0886F, -0.1739F, -0.0154F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7227F, -0.0287F);
        this.Tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, -1.0F, 0.6F, -0.293F, 1, 2, 6, -0.2F, false));

        this.Tail4 = new ModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.3227F, 5.9713F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0704F, -0.1306F, -0.0092F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6983F, 4.0488F);
        this.Tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 84, -1.0F, 1.3F, -0.3F, 1, 1, 4, -0.3F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.7017F, -0.4512F);
        this.Tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 134, -1.0F, -0.9F, -0.2F, 1, 1, 5, -0.2F, false));

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
