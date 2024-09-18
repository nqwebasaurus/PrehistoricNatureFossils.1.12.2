package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonBajadasaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg8;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg8;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail7;
    private final ModelRenderer tail8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r11;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer neckBoneLeft1;
    private final ModelRenderer neckBoneRight1;
    private final ModelRenderer neck2;
    private final ModelRenderer neckBoneLeft2;
    private final ModelRenderer neckBoneRight2;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r13;
    private final ModelRenderer bone5;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer jaw;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer throat;

    public ModelSkeletonBajadasaurusFrame() {
        this.textureWidth = 130;
        this.textureHeight = 130;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -29.0F, 6.8F, 1, 29, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -20.45F, -11.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1047F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.1F, -7.55F, -0.5F, 1, 28, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -20.45F, -11.3F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 5.05F, -10.0F, -0.5F, 1, 19, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -26.0F, 7.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.5F, -8.0F, -0.5F, 1, 15, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -29.5F, 11.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 3.5F, -4.1F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.602F, -6.5203F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2356F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 35, -0.5F, 0.8187F, 1.1724F, 1, 3, 12, 0.004F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.0F, 0.45F, -0.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 1.0123F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 1.1101F, -13.6438F);
        this.leftLeg.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.4276F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.0318F, -8.3993F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.0578F, 0.001F, 0.0365F);


        this.leftLeg8 = new ModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.0F, -1.79F, -2.0694F);
        this.leftLeg4.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, -0.0349F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.0F, 0.45F, -0.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 1.405F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 1.1101F, -13.6438F);
        this.rightLeg.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.2094F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.0318F, -8.3993F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.2498F, -0.001F, -0.0365F);


        this.rightLeg8 = new ModelRenderer(this);
        this.rightLeg8.setRotationPoint(0.0F, -1.79F, -2.0694F);
        this.rightLeg4.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, -0.0349F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.8F, 5.7F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.4903F, -0.077F, 0.0411F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3586F, 7.3533F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0699F, -0.0522F, -0.0037F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 15, -0.5F, -0.7838F, 0.0924F, 1, 2, 6, 0.004F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.918F, 0.0389F);
        this.tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 0, -0.5F, 0.9F, 0.4F, 1, 3, 7, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.918F, 12.9389F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0958F, -0.2647F, 0.1258F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.6819F, -0.0333F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0524F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 55, -0.5F, 0.8F, 0.4F, 1, 2, 11, 0.0F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4181F, 10.6667F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1664F, -0.0933F, 0.0286F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6564F, 0.0794F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 0, -0.5F, 0.9F, -0.2F, 1, 2, 13, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0564F, 12.7794F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0706F, -0.4444F, -0.0207F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 15, -0.5F, 0.0848F, -0.277F, 1, 2, 17, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5152F, 16.723F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.262F, -0.6454F, 0.0554F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.3603F, 0.0752F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 38, -0.6F, 1.0F, -0.9F, 1, 1, 15, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.7397F, 13.5752F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1718F, -0.5375F, 0.0426F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2767F, 0.0761F);
        this.tail6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 51, -0.5F, 0.9F, -0.1F, 1, 1, 12, -0.15F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.6233F, 11.8761F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.3702F, -0.294F, 0.0841F);
        this.tail7.cubeList.add(new ModelBox(tail7, 57, 48, -0.5F, 0.5524F, -0.0306F, 1, 1, 10, -0.15F, false));

        this.tail8 = new ModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0524F, 9.9694F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.6093F, -0.3714F, 0.1307F);
        this.tail8.cubeList.add(new ModelBox(tail8, 31, 0, -0.5F, 0.4751F, -0.2583F, 1, 1, 16, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.7F, -6.4F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0087F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.5164F, -13.9618F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 20, -0.5F, 1.0679F, -0.0311F, 1, 3, 15, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.5F, -13.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1834F, 0.0429F, 0.008F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 20.7F, 9.0F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 33, -0.5F, -21.0F, -16.75F, 1, 3, 9, 0.004F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(7.8412F, 14.4424F, -2.8629F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8423F, 0.1016F, -0.0827F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.4079F, 6.2547F, -1.2204F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3382F, -0.0599F, 0.3883F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(4.8937F, 6.8721F, -1.3089F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2967F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-7.8412F, 14.4424F, -2.8629F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.4625F, 0.0F, 0.0F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.4079F, 6.2547F, -1.2204F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.672F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-4.8937F, 6.8721F, -1.3089F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.9512F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6F, -8.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0651F, 0.0843F, 0.049F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 65, -0.5F, -0.0001F, -7.8245F, 1, 2, 8, 0.004F, false));

        this.neckBoneLeft1 = new ModelRenderer(this);
        this.neckBoneLeft1.setRotationPoint(2.75F, -8.731F, -11.2089F);
        this.neck1.addChild(neckBoneLeft1);
        this.setRotateAngle(neckBoneLeft1, 0.0436F, 0.0F, 0.0F);


        this.neckBoneRight1 = new ModelRenderer(this);
        this.neckBoneRight1.setRotationPoint(-2.75F, -8.731F, -11.2089F);
        this.neck1.addChild(neckBoneRight1);
        this.setRotateAngle(neckBoneRight1, 0.0436F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.1001F, -7.6245F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.0697F, 0.0434F, -0.0046F);
        this.neck2.cubeList.add(new ModelBox(neck2, 43, 58, -0.5F, 0.1516F, -8.7843F, 1, 2, 9, 0.0F, false));

        this.neckBoneLeft2 = new ModelRenderer(this);
        this.neckBoneLeft2.setRotationPoint(0.25F, -2.2793F, -5.4687F);
        this.neck2.addChild(neckBoneLeft2);


        this.neckBoneRight2 = new ModelRenderer(this);
        this.neckBoneRight2.setRotationPoint(-0.25F, -2.2793F, -5.4687F);
        this.neck2.addChild(neckBoneRight2);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.1484F, -8.7843F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2024F, 0.1283F, 0.0262F);
        this.neck3.cubeList.add(new ModelBox(neck3, 80, 85, -0.5F, 0.2985F, -5.771F, 1, 2, 6, -0.15F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.2985F, -5.571F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.539F, 0.1502F, 0.0893F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.2755F, -6.022F);
        this.neck4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 15, -0.5F, -0.2F, -0.8F, 1, 1, 7, -0.15F, false));

        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.9054F, -1.0765F, -6.1352F);
        this.neck4.addChild(bone5);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5755F, -5.522F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.7069F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.7F, -7.65F);
        this.head.addChild(bone);
        this.setRotateAngle(bone, -0.5236F, 0.0F, 0.0F);


        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.bone.addChild(bone2);
        this.setRotateAngle(bone2, 1.0734F, 0.0F, 0.0F);


        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, -0.2618F, 0.0F, 0.0F);


        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, -0.5236F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2F, -1.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3665F, 0.0F, 0.0F);


        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -0.15F, -1.1F);
        this.jaw.addChild(bone6);
        this.setRotateAngle(bone6, 0.0698F, 0.0F, 0.0F);


        this.bone7 = new ModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.bone6.addChild(bone7);
        this.setRotateAngle(bone7, 0.2618F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.75F, -4.0F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0436F, 0.0F, 0.0F);

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
