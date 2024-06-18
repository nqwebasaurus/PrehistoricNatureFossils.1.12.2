package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMamenchisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftFoot;
    private final ModelRenderer leftToes;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightFoot;
    private final ModelRenderer rightToes;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r9;
    private final ModelRenderer tail7;
    private final ModelRenderer cube_r10;
    private final ModelRenderer TailClub;
    private final ModelRenderer body;
    private final ModelRenderer cube_r11;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r12;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r13;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer neck3;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r15;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r16;
    private final ModelRenderer neck6;
    private final ModelRenderer cube_r17;
    private final ModelRenderer neck7;
    private final ModelRenderer cube_r18;
    private final ModelRenderer neck8;
    private final ModelRenderer cube_r19;
    private final ModelRenderer head;
    private final ModelRenderer ForeHead;
    private final ModelRenderer ForeHead2;
    private final ModelRenderer Snout;
    private final ModelRenderer Snout2;
    private final ModelRenderer Snout3;
    private final ModelRenderer Nose;
    private final ModelRenderer Nose2;
    private final ModelRenderer jaw;
    private final ModelRenderer Jaw2;
    private final ModelRenderer Jaw3;

    public ModelSkeletonMamenchisaurusFrame() {
        this.textureWidth = 167;
        this.textureHeight = 167;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -46.0F, -18.6F, 2, 46, 2, -0.2F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 0, -1.0F, -33.0F, 12.2F, 2, 33, 2, -0.2F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -27.0F, 13.2F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 2.6F, -7.0F, -1.0F, 2, 14, 2, -0.2F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -27.0F, -17.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.3F, -11.0F, -1.0F, 2, 20, 2, -0.2F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -30.5F, 17.0F);
        this.fossil.addChild(root);


        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(7.0F, 0.0F, -2.5F);
        this.root.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 17.4F, -2.9F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.288F, 0.0F, 0.0F);


        this.leftFoot = new ModelRenderer(this);
        this.leftFoot.setRotationPoint(-0.2F, 11.0505F, 1.626F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0262F, 0.0F, 0.0F);


        this.leftToes = new ModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.5183F, -4.6842F);
        this.leftFoot.addChild(leftToes);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-7.0F, 0.0F, -2.5F);
        this.root.addChild(rightLeg);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 17.4F, -2.9F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5061F, 0.0F, 0.0F);


        this.rightFoot = new ModelRenderer(this);
        this.rightFoot.setRotationPoint(0.2F, 11.0505F, 1.626F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.4538F, 0.0F, 0.0F);


        this.rightToes = new ModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.5183F, -4.6842F);
        this.rightFoot.addChild(rightToes);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.root.addChild(hips);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.1245F, 0.4815F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, -1, -1.5F, 1.3F, -7.9F, 3, 3, 16, -0.2F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7F, 7.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0437F, 0.0436F, -0.0019F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.448F, 0.3592F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 81, 75, -1.5F, -1.1365F, -1.1428F, 3, 2, 15, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.9382F, 13.1359F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2233F, 0.2129F, -0.0479F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.2473F, -0.3617F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 77, -1.5F, 2.9F, -0.1F, 3, 2, 13, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.9019F, 12.5549F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0438F, 0.0872F, -0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.6135F, -0.0637F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 72, -1.0F, 2.1F, -1.1F, 2, 2, 15, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0959F, 13.7468F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0915F, -0.3042F, -0.0275F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0834F, 0.0485F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 48, -1.175F, 0.6F, -1.2F, 2, 1, 15, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.2358F, 13.8701F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, -0.3927F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0976F, -0.0216F);
        this.tail5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 86, 19, -0.5F, 0.6F, -1.1F, 1, 1, 15, -0.2F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.8882F, 12.7096F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0962F, -0.4346F, -0.0406F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.0513F, 0.2081F);
        this.tail6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 0, -0.5F, 0.6F, -0.1F, 1, 1, 12, -0.2F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.694F, 12.0914F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.257F, -0.5522F, 0.137F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.2883F, 0.0021F);
        this.tail7.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, 0.6F, -0.3F, 1, 1, 11, -0.2F, false));

        this.TailClub = new ModelRenderer(this);
        this.TailClub.setRotationPoint(0.0F, -0.5581F, 10.9311F);
        this.tail7.addChild(TailClub);
        this.setRotateAngle(TailClub, 0.0F, -0.4363F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.2182F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.3401F, -17.4698F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 45, -1.5F, 2.5455F, -1.0348F, 3, 3, 19, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -4.6019F, -17.504F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.2292F, -13.14F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3229F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 69, -1.5F, 2.5639F, -0.3668F, 3, 3, 15, -0.2F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(8.75F, 18.2208F, -6.24F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.48F, 0.0F, 0.0F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(1.25F, 1.748F, -0.353F);
        this.leftArm.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 2.0809F, -0.0304F, 0.0123F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.5F, -0.5276F, -11.5544F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.9163F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(1.0F, -3.5961F, -9.1411F);
        this.leftArm4.addChild(leftArm5);
        this.setRotateAngle(leftArm5, 0.4014F, 0.0F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-18.75F, 1.748F, -0.353F);
        this.leftArm.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 1.6842F, 0.0F, 0.0F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.5F, -0.5276F, -11.5544F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.6545F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(-1.0F, -3.5961F, -9.1411F);
        this.rightArm4.addChild(rightArm5);
        this.setRotateAngle(rightArm5, 0.3142F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.1292F, -13.24F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.394F, -0.0806F, 0.0335F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.354F, -22.7351F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0349F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 29, -1.5F, 2.9F, 0.0F, 3, 3, 23, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.654F, -22.4351F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0312F, -0.1274F, -0.3069F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.7261F, -24.8296F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0349F, -0.0174F, 0.0006F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, -3, -3, -1.6F, 2.175F, -1.0F, 3, 3, 27, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.6261F, -24.8296F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.073F, -0.1809F, -0.073F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 56, -1.5F, 2.4F, -16.9F, 3, 3, 17, -0.2F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.1F, -17.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.2793F, -0.1675F, -0.1402F);


        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.3643F, -0.4681F);
        this.neck4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2269F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 61, 53, -1.5F, -2.0547F, -15.9321F, 3, 3, 16, -0.2F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.4656F, -15.373F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.1683F, -0.1721F, -0.0291F);


        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.1477F, -15.4585F);
        this.neck5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1396F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 67, 31, -1.0F, 1.8F, -0.3F, 2, 2, 16, -0.2F, false));

        this.neck6 = new ModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -3.1477F, -15.7585F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1683F, -0.1721F, -0.0291F);


        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.7178F, -12.224F);
        this.neck6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1396F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 88, -1.0F, 1.7F, 0.0F, 2, 2, 13, -0.2F, false));

        this.neck7 = new ModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -1.1178F, -11.824F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.0886F, -0.1739F, -0.0154F);


        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.3092F, -9.0362F);
        this.neck7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 29, -1.0F, 1.8F, 0.275F, 2, 2, 9, -0.2F, false));

        this.neck8 = new ModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, -1.1592F, -8.7362F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.2212F, -0.2608F, -0.0233F);


        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.0128F, -2.0038F);
        this.neck8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 123, 96, -1.0F, 0.9F, -3.0F, 2, 2, 5, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.0628F, -3.6038F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.6981F, 0.0F, 0.0F);


        this.ForeHead = new ModelRenderer(this);
        this.ForeHead.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.head.addChild(ForeHead);
        this.setRotateAngle(ForeHead, -0.3054F, 0.0F, 0.0F);


        this.ForeHead2 = new ModelRenderer(this);
        this.ForeHead2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.ForeHead.addChild(ForeHead2);
        this.setRotateAngle(ForeHead2, 0.3491F, 0.0F, 0.0F);


        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.head.addChild(Snout);
        this.setRotateAngle(Snout, 0.0873F, 0.0F, 0.0F);


        this.Snout2 = new ModelRenderer(this);
        this.Snout2.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Snout.addChild(Snout2);
        this.setRotateAngle(Snout2, -0.2618F, 0.0F, 0.0F);


        this.Snout3 = new ModelRenderer(this);
        this.Snout3.setRotationPoint(0.0F, -0.15F, -1.5F);
        this.Snout2.addChild(Snout3);
        this.setRotateAngle(Snout3, 0.1309F, 0.0F, 0.0F);


        this.Nose = new ModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Snout2.addChild(Nose);
        this.setRotateAngle(Nose, -0.1309F, 0.0F, 0.0F);


        this.Nose2 = new ModelRenderer(this);
        this.Nose2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Nose.addChild(Nose2);
        this.setRotateAngle(Nose2, 0.9861F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7F, -1.6F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);


        this.Jaw2 = new ModelRenderer(this);
        this.Jaw2.setRotationPoint(0.0F, -0.1506F, -1.7219F);
        this.jaw.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1309F, 0.0F, 0.0F);


        this.Jaw3 = new ModelRenderer(this);
        this.Jaw3.setRotationPoint(0.0F, 1.0F, -3.95F);
        this.Jaw2.addChild(Jaw3);

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
