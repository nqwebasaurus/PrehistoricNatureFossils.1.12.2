package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonElginia extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer elginia;
    private final ModelRenderer lowerbody;
    private final ModelRenderer Hips_r1;
    private final ModelRenderer Hips_r2;
    private final ModelRenderer Hips_r3;
    private final ModelRenderer Hips_r4;
    private final ModelRenderer Hips_r5;
    private final ModelRenderer Hips_r6;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer cube_r1;
    private final ModelRenderer backleftleg5;
    private final ModelRenderer cube_r2;
    private final ModelRenderer backleftleg6;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer cube_r3;
    private final ModelRenderer backrightleg5;
    private final ModelRenderer cube_r4;
    private final ModelRenderer backrightleg6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer upperbody;
    private final ModelRenderer Bodyfront_r1;
    private final ModelRenderer Bodyfront_r2;
    private final ModelRenderer Bodyfront_r3;
    private final ModelRenderer Bodyfront_r4;
    private final ModelRenderer Bodyfront_r5;
    private final ModelRenderer Bodyfront_r6;
    private final ModelRenderer Bodyfront_r7;
    private final ModelRenderer Bodyfront_r8;
    private final ModelRenderer Bodyfront_r9;
    private final ModelRenderer Bodyfront_r10;
    private final ModelRenderer Bodyfront_r11;
    private final ModelRenderer Bodyfront_r12;
    private final ModelRenderer Bodyfront_r13;
    private final ModelRenderer cube_r5;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer frontleftleg5;
    private final ModelRenderer cube_r7;
    private final ModelRenderer frontleftleg6;
    private final ModelRenderer cube_r8;
    private final ModelRenderer frontrightleg4;
    private final ModelRenderer cube_r9;
    private final ModelRenderer frontrightleg5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer frontrightleg6;
    private final ModelRenderer cube_r11;
    private final ModelRenderer neck;
    private final ModelRenderer Bodyfront_r14;
    private final ModelRenderer Bodyfront_r15;
    private final ModelRenderer Bodyfront_r16;
    private final ModelRenderer Bodyfront_r17;
    private final ModelRenderer head;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer jaw;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer body;
    private final ModelRenderer Bodyfront_r18;
    private final ModelRenderer Bodyfront_r19;
    private final ModelRenderer Bodyfront_r20;
    private final ModelRenderer Bodyfront_r21;
    private final ModelRenderer Bodyfront_r22;
    private final ModelRenderer Bodyfront_r23;
    private final ModelRenderer Bodyfront_r24;
    private final ModelRenderer Bodyfront_r25;
    private final ModelRenderer Bodyfront_r26;
    private final ModelRenderer Bodyfront_r27;
    private final ModelRenderer Bodyfront_r28;
    private final ModelRenderer Bodyfront_r29;
    private final ModelRenderer Bodyfront_r30;
    private final ModelRenderer Bodyfront_r31;
    private final ModelRenderer Bodyfront_r32;
    private final ModelRenderer Bodyfront_r33;
    private final ModelRenderer Bodyfront_r34;
    private final ModelRenderer Bodyfront_r35;
    private final ModelRenderer Bodyfront_r36;
    private final ModelRenderer Bodyfront_r37;

    public ModelSkeletonElginia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.elginia = new ModelRenderer(this);
        this.elginia.setRotationPoint(0.0F, -4.25F, 0.0F);
        this.fossil.addChild(elginia);


        this.lowerbody = new ModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -5.8F, 8.25F);
        this.elginia.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.1745F, 0.0F, 0.0F);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 48, 0, 0.0F, -2.1812F, -0.2522F, 0, 1, 3, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 47, 33, -2.5F, -2.1812F, -0.2522F, 0, 1, 3, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 46, 45, 2.5F, -2.1812F, -0.2522F, 0, 1, 3, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 38, 36, -0.5F, -0.4373F, -0.9178F, 1, 1, 4, 0.003F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 41, 32, 0.3F, -0.3071F, 0.1379F, 2, 1, 2, 0.001F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 41, 32, -2.3F, -0.3071F, 0.1379F, 2, 1, 2, 0.001F, true));

        this.Hips_r1 = new ModelRenderer(this);
        this.Hips_r1.setRotationPoint(-1.9131F, 0.3053F, 1.2903F);
        this.lowerbody.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1238F, -0.0746F, -0.3759F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 39, 19, -1.6326F, 0.2779F, -1.0662F, 1, 2, 3, 0.001F, true));

        this.Hips_r2 = new ModelRenderer(this);
        this.Hips_r2.setRotationPoint(-1.9131F, 2.4053F, 1.2903F);
        this.lowerbody.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.2481F, -0.1349F, -0.796F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 27, -0.9652F, -0.4906F, -2.1241F, 1, 3, 5, 0.001F, true));

        this.Hips_r3 = new ModelRenderer(this);
        this.Hips_r3.setRotationPoint(-1.9131F, 0.3053F, 1.2903F);
        this.lowerbody.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, -0.0467F, -0.0079F, 0.278F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 32, 3, -1.0506F, -0.7863F, -1.9468F, 1, 2, 4, 0.001F, true));

        this.Hips_r4 = new ModelRenderer(this);
        this.Hips_r4.setRotationPoint(1.9131F, 0.3053F, 1.2903F);
        this.lowerbody.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, -0.1238F, 0.0746F, 0.3759F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 39, 19, 0.6326F, 0.2779F, -1.0662F, 1, 2, 3, 0.001F, false));

        this.Hips_r5 = new ModelRenderer(this);
        this.Hips_r5.setRotationPoint(1.9131F, 0.3053F, 1.2903F);
        this.lowerbody.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.0467F, 0.0079F, -0.278F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 32, 3, 0.0506F, -0.7863F, -1.9468F, 1, 2, 4, 0.001F, false));

        this.Hips_r6 = new ModelRenderer(this);
        this.Hips_r6.setRotationPoint(1.9131F, 2.4053F, 1.2903F);
        this.lowerbody.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.2481F, 0.1349F, 0.796F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 0, 27, -0.0348F, -0.4906F, -2.1241F, 1, 3, 5, 0.001F, false));

        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(2.3164F, 2.839F, 0.3822F);
        this.lowerbody.addChild(backleftleg4);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.7836F, 0.0237F, -0.5F);
        this.backleftleg4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2497F, -0.5193F, -0.4768F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.25F, -1.0F, 0.25F, 2, 4, 2, 0.0F, false));

        this.backleftleg5 = new ModelRenderer(this);
        this.backleftleg5.setRotationPoint(3.0F, 2.6025F, -0.136F);
        this.backleftleg4.addChild(backleftleg5);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1413F, 0.7572F, 0.2439F);
        this.backleftleg5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 42, -1.4329F, -0.7974F, 0.65F, 2, 4, 1, -0.2F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 42, -1.4329F, -0.7974F, -0.75F, 2, 4, 1, 0.0F, false));

        this.backleftleg6 = new ModelRenderer(this);
        this.backleftleg6.setRotationPoint(-0.4787F, 3.697F, 1.8377F);
        this.backleftleg5.addChild(backleftleg6);
        this.setRotateAngle(backleftleg6, 0.1745F, 0.0F, 0.0F);
        this.backleftleg6.cubeList.add(new ModelBox(backleftleg6, 26, 16, -1.2381F, -0.3918F, -3.5F, 3, 1, 4, 0.0F, false));

        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-2.3164F, 2.839F, 0.3822F);
        this.lowerbody.addChild(backrightleg4);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.7836F, 0.0237F, -0.5F);
        this.backrightleg4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2497F, 0.5193F, 0.4768F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.75F, -1.0F, 0.25F, 2, 4, 2, 0.0F, true));

        this.backrightleg5 = new ModelRenderer(this);
        this.backrightleg5.setRotationPoint(-3.0F, 2.6025F, -0.136F);
        this.backrightleg4.addChild(backrightleg5);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.1413F, 0.7572F, 0.2439F);
        this.backrightleg5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 42, -0.5671F, -0.7974F, 0.65F, 2, 4, 1, -0.2F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 42, -0.5671F, -0.7974F, -0.75F, 2, 4, 1, 0.0F, true));

        this.backrightleg6 = new ModelRenderer(this);
        this.backrightleg6.setRotationPoint(0.4787F, 3.697F, 1.8377F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.1745F, 0.0F, 0.0F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 26, 16, -1.7619F, -0.3918F, -3.5F, 3, 1, 4, 0.0F, true));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2627F, 2.8822F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.4215F, -0.3614F, 0.1572F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 37, -0.5F, -0.683F, -0.2086F, 1, 1, 4, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.233F, 3.7914F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0481F, -0.4359F, 0.0203F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 27, -0.5F, -0.4261F, -0.1812F, 1, 1, 3, 0.002F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0739F, 2.8188F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3365F, -0.6699F, -0.2139F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 40, -0.5F, -0.4869F, -0.2066F, 1, 1, 3, 0.0F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.1489F, -0.6436F);
        this.lowerbody.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.3518F, -0.123F, -0.045F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 0, 49, -2.5F, -3.5459F, -13.7573F, 0, 1, 3, 0.0F, false));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 32, 48, 2.5F, -3.5459F, -13.7573F, 0, 1, 3, 0.0F, false));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 48, 28, 0.0F, -3.7959F, -13.7573F, 0, 1, 3, 0.0F, false));

        this.Bodyfront_r1 = new ModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-4.0F, 1.771F, -11.9684F);
        this.upperbody.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 1.0919F, -0.2125F, 0.2182F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 17, 18, -1.1624F, -1.6849F, -1.4108F, 1, 3, 6, 0.001F, true));

        this.Bodyfront_r2 = new ModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-4.0F, 0.571F, -11.9684F);
        this.upperbody.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 1.054F, -0.0657F, 0.489F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 26, 40, -0.1F, -1.1936F, -2.3501F, 3, 3, 1, 0.001F, true));

        this.Bodyfront_r3 = new ModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(4.0F, 1.771F, -11.9684F);
        this.upperbody.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 1.0919F, 0.2125F, -0.2182F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 17, 18, 0.1624F, -1.6849F, -1.4108F, 1, 3, 6, 0.001F, false));

        this.Bodyfront_r4 = new ModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(4.0F, 0.571F, -11.9684F);
        this.upperbody.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 1.054F, 0.0657F, -0.489F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 26, 40, -2.9F, -1.1936F, -2.3501F, 3, 3, 1, 0.001F, false));

        this.Bodyfront_r5 = new ModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(1.1F, 3.571F, -11.9684F);
        this.upperbody.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 1.1378F, 0.0501F, 0.0079F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 13, 7, -3.7691F, -1.6026F, -0.7359F, 5, 1, 1, 0.001F, false));
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 43, 7, -2.1F, -0.6F, -0.7F, 2, 3, 1, 0.001F, false));

        this.Bodyfront_r6 = new ModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-0.4F, -1.329F, -11.0684F);
        this.upperbody.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 0.0742F, -0.0863F, 1.0437F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 53, 24, -0.39F, 0.9411F, -0.619F, 0, 3, 1, 0.001F, true));

        this.Bodyfront_r7 = new ModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(-0.4F, -1.329F, -11.0684F);
        this.upperbody.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, 0.0354F, -0.1081F, 1.4376F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 23, 40, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r8 = new ModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(-0.4F, -1.329F, -13.0684F);
        this.upperbody.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, 0.0742F, -0.0863F, 0.8255F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 0, 12, -0.39F, 0.9411F, -0.619F, 0, 2, 1, 0.001F, true));

        this.Bodyfront_r9 = new ModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(-0.4F, -1.329F, -13.0684F);
        this.upperbody.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, 0.0354F, -0.1081F, 1.2195F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 7, 43, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r10 = new ModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(0.4F, -1.329F, -11.0684F);
        this.upperbody.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, 0.0354F, 0.1081F, -1.4376F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 23, 40, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r11 = new ModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(0.4F, -1.329F, -11.0684F);
        this.upperbody.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, 0.0742F, 0.0863F, -1.0437F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 53, 24, 0.39F, 0.9411F, -0.619F, 0, 3, 1, 0.001F, false));

        this.Bodyfront_r12 = new ModelRenderer(this);
        this.Bodyfront_r12.setRotationPoint(0.4F, -1.329F, -13.0684F);
        this.upperbody.addChild(Bodyfront_r12);
        this.setRotateAngle(Bodyfront_r12, 0.0354F, 0.1081F, -1.2195F);
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 7, 43, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r13 = new ModelRenderer(this);
        this.Bodyfront_r13.setRotationPoint(0.4F, -1.329F, -13.0684F);
        this.upperbody.addChild(Bodyfront_r13);
        this.setRotateAngle(Bodyfront_r13, 0.0742F, 0.0863F, -0.8255F);
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 0, 12, 0.39F, 0.9411F, -0.619F, 0, 2, 1, 0.001F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.1369F, -13.8406F);
        this.upperbody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 34, -1.0F, -0.6F, 0.0F, 1, 1, 4, 0.002F, false));

        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(4.2164F, 3.1894F, -11.0906F);
        this.upperbody.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, -0.6355F, 0.2739F, -0.2373F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0336F, 0.0237F, -0.5F);
        this.frontleftleg4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.211F, 0.056F, -0.9104F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 0, -0.5F, 0.0F, -0.75F, 2, 4, 2, 0.0F, false));

        this.frontleftleg5 = new ModelRenderer(this);
        this.frontleftleg5.setRotationPoint(3.0F, 0.75F, 0.75F);
        this.frontleftleg4.addChild(frontleftleg5);
        this.setRotateAngle(frontleftleg5, -0.0873F, 0.0F, 0.0436F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.283F, 1.919F, 0.2046F);
        this.frontleftleg5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1313F, -0.1321F, -0.0115F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 42, -0.7176F, -1.1875F, -0.1464F, 2, 4, 1, -0.2F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 43, -0.7176F, -1.1875F, -1.6464F, 2, 4, 1, 0.0F, false));

        this.frontleftleg6 = new ModelRenderer(this);
        this.frontleftleg6.setRotationPoint(-0.2233F, 4.3967F, -0.161F);
        this.frontleftleg5.addChild(frontleftleg6);
        this.setRotateAngle(frontleftleg6, 0.6476F, -0.0934F, 0.1476F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0123F, -2.7407F, 0.2292F);
        this.frontleftleg6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1313F, -0.1321F, -0.0115F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 28, -1.2176F, 2.8125F, -3.3464F, 3, 1, 4, -0.01F, false));

        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-4.2164F, 3.1894F, -11.0906F);
        this.upperbody.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.5683F, 0.0094F, 0.218F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0336F, 0.0237F, -0.5F);
        this.frontrightleg4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.211F, -0.056F, 0.9104F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 0, -1.5F, 0.0F, -0.75F, 2, 4, 2, 0.0F, true));

        this.frontrightleg5 = new ModelRenderer(this);
        this.frontrightleg5.setRotationPoint(-3.0F, 0.75F, 0.75F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, -0.2182F, 0.0F, -0.2618F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.283F, 1.919F, 0.2046F);
        this.frontrightleg5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1313F, 0.1321F, 0.0115F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 42, -1.2824F, -1.1875F, -0.1464F, 2, 4, 1, -0.2F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 43, -1.2824F, -1.1875F, -1.6464F, 2, 4, 1, 0.0F, true));

        this.frontrightleg6 = new ModelRenderer(this);
        this.frontrightleg6.setRotationPoint(-0.2841F, 5.1376F, 0.1015F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, -0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5671F, -3.2186F, 0.103F);
        this.frontrightleg6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1313F, 0.1321F, 0.0115F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 28, -1.7824F, 2.8125F, -3.3464F, 3, 1, 4, -0.01F, true));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.2765F, -13.9215F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.2618F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 36, 10, -0.5F, -0.4638F, -3.7391F, 1, 1, 4, -0.01F, false));

        this.Bodyfront_r14 = new ModelRenderer(this);
        this.Bodyfront_r14.setRotationPoint(-0.5F, 0.2031F, -1.1002F);
        this.neck.addChild(Bodyfront_r14);
        this.setRotateAngle(Bodyfront_r14, 0.0742F, -0.0863F, 0.4328F);
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 26, 16, -0.39F, 0.9411F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r15 = new ModelRenderer(this);
        this.Bodyfront_r15.setRotationPoint(-0.5F, 0.2031F, -1.1002F);
        this.neck.addChild(Bodyfront_r15);
        this.setRotateAngle(Bodyfront_r15, 0.0354F, -0.1081F, 0.8268F);
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 8, 27, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r16 = new ModelRenderer(this);
        this.Bodyfront_r16.setRotationPoint(0.5F, 0.2031F, -1.1002F);
        this.neck.addChild(Bodyfront_r16);
        this.setRotateAngle(Bodyfront_r16, 0.0354F, 0.1081F, -0.8268F);
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 8, 27, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r17 = new ModelRenderer(this);
        this.Bodyfront_r17.setRotationPoint(0.5F, 0.2031F, -1.1002F);
        this.neck.addChild(Bodyfront_r17);
        this.setRotateAngle(Bodyfront_r17, 0.0742F, 0.0863F, -0.4328F);
        this.Bodyfront_r17.cubeList.add(new ModelBox(Bodyfront_r17, 26, 16, 0.39F, 0.9411F, -0.619F, 0, 1, 1, 0.001F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1993F, -3.1288F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2706F, -0.2527F, -0.0692F);
        this.head.cubeList.add(new ModelBox(head, 13, 0, -4.0F, -0.4866F, -2.851F, 8, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 12, -4.0F, -1.4866F, -2.851F, 8, 1, 4, 0.0F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.75F, -1.4866F, -1.101F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 48, 0.25F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 2.201F, -1.0156F, -1.0131F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 0, 0.1125F, 0.6385F, -0.1652F, 1, 1, 0, 0.0F, true));

        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3001F, -0.3044F, 0.2096F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 34, -0.5F, -1.5713F, 0.3121F, 1, 2, 4, 0.0F, true));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -2.9444F, -1.5268F, 2.8507F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 43, 3.3556F, -0.6166F, 1.3976F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 2.9949F, -0.7304F, -3.0081F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 50, 2.4789F, -0.0291F, -2.0328F, 1, 1, 2, -0.2F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.7174F, -1.0302F, -1.1283F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5984F, -1.2866F, -0.2672F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 34, -0.9F, -0.5F, -0.9F, 1, 1, 2, -0.2F, true));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.1659F, 0.6139F, 0.8456F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -1.0472F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 25, -1.1F, -0.5F, -1.8F, 1, 1, 3, 0.0F, true));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.65F, -0.9866F, 1.499F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4335F, -0.8344F, -0.0703F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 34, -0.7431F, -0.6188F, -0.0213F, 1, 1, 4, 0.0F, true));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.75F, -0.9866F, 0.699F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4681F, -1.1274F, -0.4203F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 5, -0.357F, -0.4701F, -0.6439F, 1, 1, 2, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.75F, -0.9866F, 0.699F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 2.3645F, -0.9288F, -1.0961F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 48, -0.3858F, -0.4178F, 0.243F, 1, 1, 1, -0.2F, true));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.8F, -1.7866F, 0.949F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3586F, -0.1264F, -0.264F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 50, -0.5F, -0.9349F, -0.3639F, 1, 1, 1, 0.0F, true));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.8F, -1.7866F, 0.949F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.795F, -0.1264F, -0.264F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 51, 20, -0.5F, -0.2418F, -0.3605F, 1, 2, 1, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 2.9949F, 0.7304F, 3.0081F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 50, -3.4789F, -0.0291F, -2.0328F, 1, 1, 2, -0.2F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -2.9444F, 1.5268F, -2.8507F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 43, -4.3556F, -0.6166F, 1.3976F, 1, 1, 2, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 2.201F, 1.0156F, 1.0131F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 7, 0, -1.1125F, 0.6385F, -0.1652F, 1, 1, 0, 0.0F, false));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(3.7174F, -1.0302F, -1.1283F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.5984F, 1.2866F, 0.2672F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 27, 34, -0.1F, -0.5F, -0.9F, 1, 1, 2, -0.2F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(4.1659F, 0.6139F, 0.8456F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.0472F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 25, 0.1F, -0.5F, -1.8F, 1, 1, 3, 0.0F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(4.65F, -0.9866F, 1.499F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4335F, 0.8344F, 0.0703F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 31, 34, -0.2569F, -0.6188F, -0.0213F, 1, 1, 4, 0.0F, false));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(3.75F, -0.9866F, 0.699F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 2.3645F, 0.9288F, 1.0961F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 36, 48, -0.6142F, -0.4178F, 0.243F, 1, 1, 1, -0.2F, false));

        this.cube_r31 = new ModelRenderer(this);
        this.cube_r31.setRotationPoint(3.75F, -0.9866F, 0.699F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4681F, 1.1274F, 0.4203F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 50, 5, -0.643F, -0.4701F, -0.6439F, 1, 1, 2, 0.0F, false));

        this.cube_r32 = new ModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.3771F, -2.883F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3927F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 18, -1.5F, 0.0316F, -4.7773F, 3, 2, 2, -0.01F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 28, 28, -2.0F, 0.0316F, -2.7773F, 4, 2, 3, -0.01F, false));

        this.cube_r33 = new ModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.3314F, -0.6761F, -3.4895F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.217F, -0.2681F, -0.7153F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 37, 16, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.2F, true));

        this.cube_r34 = new ModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.6354F, 1.0912F, -2.721F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6863F, -0.2377F, -0.8469F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 18, 45, 0.7636F, -2.0871F, -1.7507F, 1, 1, 1, -0.2F, true));

        this.cube_r35 = new ModelRenderer(this);
        this.cube_r35.setRotationPoint(-3.6354F, 1.0912F, -2.721F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.8608F, -0.2377F, -0.8469F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 33, 0, 0.6831F, -2.451F, -2.4382F, 1, 1, 1, -0.2F, true));

        this.cube_r36 = new ModelRenderer(this);
        this.cube_r36.setRotationPoint(-3.6354F, 1.0912F, -2.721F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2383F, -0.4918F, -0.0532F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 46, 23, -0.2951F, -1.5018F, -2.6141F, 1, 2, 2, -0.1F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 21, 7, -0.1651F, -1.7018F, -4.9141F, 2, 3, 5, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 4, 46, -0.0651F, 0.7982F, -4.7141F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new ModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.1973F, 0.6127F, -7.4848F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.4844F, -0.177F, -0.4898F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 18, 0.8475F, -0.245F, -0.9235F, 1, 2, 1, -0.2F, true));

        this.cube_r38 = new ModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.162F, -0.3317F, -4.9325F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.5236F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 24, 28, -0.5F, -0.7525F, -0.6351F, 1, 1, 1, -0.2F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 24, 28, 1.824F, -0.7525F, -0.6351F, 1, 1, 1, -0.2F, false));

        this.cube_r39 = new ModelRenderer(this);
        this.cube_r39.setRotationPoint(3.6354F, 1.0912F, -2.721F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2383F, 0.4918F, 0.0532F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 46, 23, -0.7049F, -1.5018F, -2.6141F, 1, 2, 2, -0.1F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 4, 46, 0.0651F, 0.7982F, -4.7141F, 0, 1, 3, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 21, 7, -1.8349F, -1.7018F, -4.9141F, 2, 3, 5, 0.0F, false));

        this.cube_r40 = new ModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 3.5134F, -2.851F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2182F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 18, -1.5F, -4.0F, -4.0F, 3, 3, 5, 0.01F, false));

        this.cube_r41 = new ModelRenderer(this);
        this.cube_r41.setRotationPoint(1.8F, -1.7866F, 0.949F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3586F, 0.1264F, 0.264F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 16, 50, -0.5F, -0.9349F, -0.3639F, 1, 1, 1, 0.0F, false));

        this.cube_r42 = new ModelRenderer(this);
        this.cube_r42.setRotationPoint(1.8F, -1.7866F, 0.949F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.795F, 0.1264F, 0.264F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 51, 20, -0.5F, -0.2418F, -0.3605F, 1, 2, 1, 0.0F, false));

        this.cube_r43 = new ModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -1.9866F, -0.851F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.7854F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 25, 45, 0.2071F, 0.2071F, -0.5649F, 1, 1, 1, 0.0F, false));

        this.cube_r44 = new ModelRenderer(this);
        this.cube_r44.setRotationPoint(2.1973F, 0.6127F, -7.4848F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.4844F, 0.177F, 0.4898F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 18, -1.8475F, -0.245F, -0.9235F, 1, 2, 1, -0.2F, false));

        this.cube_r45 = new ModelRenderer(this);
        this.cube_r45.setRotationPoint(3.6354F, 1.0912F, -2.721F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.8608F, 0.2377F, 0.8469F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 33, 0, -1.6831F, -2.451F, -2.4382F, 1, 1, 1, -0.2F, false));

        this.cube_r46 = new ModelRenderer(this);
        this.cube_r46.setRotationPoint(1.162F, -0.9654F, -2.9197F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.5236F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 27, -0.5F, -1.2F, -0.2F, 1, 2, 1, -0.2F, false));

        this.cube_r47 = new ModelRenderer(this);
        this.cube_r47.setRotationPoint(3.6354F, 1.0912F, -2.721F);
        this.head.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.6863F, 0.2377F, 0.8469F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 18, 45, -1.7636F, -2.0871F, -1.7507F, 1, 1, 1, -0.2F, false));

        this.cube_r48 = new ModelRenderer(this);
        this.cube_r48.setRotationPoint(3.3314F, -0.6761F, -3.4895F);
        this.head.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.217F, 0.2681F, 0.7153F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 37, 16, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.2F, false));

        this.cube_r49 = new ModelRenderer(this);
        this.cube_r49.setRotationPoint(2.75F, -1.4866F, -1.101F);
        this.head.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.3054F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 39, 48, -0.25F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r50 = new ModelRenderer(this);
        this.cube_r50.setRotationPoint(3.4F, 2.4223F, -3.4446F);
        this.head.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.3001F, 0.3044F, -0.2096F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 9, 34, -0.5F, -1.5713F, 0.3121F, 1, 2, 4, 0.0F, false));

        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4233F, -0.7327F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);


        this.cube_r51 = new ModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.7444F, 0.4639F, -1.8231F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2214F, -0.1704F, -0.0381F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 16, 34, -0.6631F, -0.3909F, -0.0883F, 1, 1, 2, 0.003F, true));

        this.cube_r52 = new ModelRenderer(this);
        this.cube_r52.setRotationPoint(2.7444F, 0.4639F, -1.8231F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2214F, 0.1704F, 0.0381F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 16, 34, -0.3369F, -0.3909F, -0.0883F, 1, 1, 2, 0.003F, false));

        this.cube_r53 = new ModelRenderer(this);
        this.cube_r53.setRotationPoint(-3.3444F, 0.4639F, -0.6231F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.2449F, -0.4677F, -0.1122F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 32, 22, -0.6719F, -0.6506F, -5.2045F, 1, 1, 4, 0.0F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 44, 13, -0.4719F, -0.9506F, -5.2045F, 0, 1, 3, 0.0F, true));

        this.cube_r54 = new ModelRenderer(this);
        this.cube_r54.setRotationPoint(3.3444F, 0.4639F, -0.6231F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2449F, 0.4677F, 0.1122F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 44, 13, 0.4719F, -0.9506F, -5.2045F, 0, 1, 3, 0.0F, false));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 32, 22, -0.3281F, -0.6506F, -5.2045F, 1, 1, 4, 0.0F, false));

        this.cube_r55 = new ModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 1.0643F, -1.7167F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.2182F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 7, -1.5F, -1.0F, -4.0F, 3, 1, 1, 0.01F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.7967F, -9.0F);
        this.upperbody.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 28, 45, -3.25F, -0.8255F, -1.0224F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 45, 3.25F, -0.8255F, -1.0224F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 45, 0.0F, -1.0755F, -1.0224F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 49, 38, 0.0F, -1.0755F, 2.4776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 48, 0.0F, -1.0755F, 5.9776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 50, -3.25F, -0.8255F, 2.4776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 50, 3.25F, -0.8255F, 2.4776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 15, -3.25F, -0.8255F, 5.9776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 9, 3.25F, -0.8255F, 5.9776F, 0, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, 0.8799F, -0.7981F, 1, 1, 10, 0.0F, false));

        this.Bodyfront_r18 = new ModelRenderer(this);
        this.Bodyfront_r18.setRotationPoint(-0.4F, 1.4414F, 7.8165F);
        this.body.addChild(Bodyfront_r18);
        this.setRotateAngle(Bodyfront_r18, 0.0084F, 0.0269F, 0.9147F);
        this.Bodyfront_r18.cubeList.add(new ModelBox(Bodyfront_r18, 0, 36, -0.39F, 0.9411F, -0.619F, 0, 3, 1, 0.001F, true));

        this.Bodyfront_r19 = new ModelRenderer(this);
        this.Bodyfront_r19.setRotationPoint(-0.4F, 1.4414F, 7.8165F);
        this.body.addChild(Bodyfront_r19);
        this.setRotateAngle(Bodyfront_r19, 0.0181F, 0.0217F, 1.3075F);
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 14, 27, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r20 = new ModelRenderer(this);
        this.Bodyfront_r20.setRotationPoint(-0.4F, 1.4414F, 5.8165F);
        this.body.addChild(Bodyfront_r20);
        this.setRotateAngle(Bodyfront_r20, 0.0084F, 0.0269F, 0.9147F);
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 29, 50, -0.39F, 0.9411F, -0.619F, 0, 4, 1, 0.001F, true));

        this.Bodyfront_r21 = new ModelRenderer(this);
        this.Bodyfront_r21.setRotationPoint(-0.4F, 1.4414F, 5.8165F);
        this.body.addChild(Bodyfront_r21);
        this.setRotateAngle(Bodyfront_r21, 0.0181F, 0.0217F, 1.3075F);
        this.Bodyfront_r21.cubeList.add(new ModelBox(Bodyfront_r21, 13, 0, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r22 = new ModelRenderer(this);
        this.Bodyfront_r22.setRotationPoint(-0.4F, 1.4414F, 3.8165F);
        this.body.addChild(Bodyfront_r22);
        this.setRotateAngle(Bodyfront_r22, 0.0084F, 0.0269F, 0.9584F);
        this.Bodyfront_r22.cubeList.add(new ModelBox(Bodyfront_r22, 26, 50, -0.39F, 0.9411F, -0.619F, 0, 5, 1, 0.001F, true));

        this.Bodyfront_r23 = new ModelRenderer(this);
        this.Bodyfront_r23.setRotationPoint(-0.4F, 1.4414F, 3.8165F);
        this.body.addChild(Bodyfront_r23);
        this.setRotateAngle(Bodyfront_r23, 0.0181F, 0.0217F, 1.3511F);
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 32, 22, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r24 = new ModelRenderer(this);
        this.Bodyfront_r24.setRotationPoint(-0.4F, 1.4414F, 1.8165F);
        this.body.addChild(Bodyfront_r24);
        this.setRotateAngle(Bodyfront_r24, 0.0084F, 0.0269F, 1.002F);
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 6, 53, -0.39F, 0.9411F, -0.619F, 0, 4, 1, 0.001F, true));

        this.Bodyfront_r25 = new ModelRenderer(this);
        this.Bodyfront_r25.setRotationPoint(-0.4F, 1.4414F, 1.8165F);
        this.body.addChild(Bodyfront_r25);
        this.setRotateAngle(Bodyfront_r25, 0.0181F, 0.0217F, 1.3948F);
        this.Bodyfront_r25.cubeList.add(new ModelBox(Bodyfront_r25, 36, 10, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r26 = new ModelRenderer(this);
        this.Bodyfront_r26.setRotationPoint(-0.4F, 1.4414F, -0.1835F);
        this.body.addChild(Bodyfront_r26);
        this.setRotateAngle(Bodyfront_r26, 0.0742F, -0.0863F, 1.0437F);
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 9, 53, -0.39F, 0.9411F, -0.619F, 0, 3, 1, 0.001F, true));

        this.Bodyfront_r27 = new ModelRenderer(this);
        this.Bodyfront_r27.setRotationPoint(-0.4F, 1.4414F, -0.1835F);
        this.body.addChild(Bodyfront_r27);
        this.setRotateAngle(Bodyfront_r27, 0.0354F, -0.1081F, 1.4376F);
        this.Bodyfront_r27.cubeList.add(new ModelBox(Bodyfront_r27, 38, 34, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, true));

        this.Bodyfront_r28 = new ModelRenderer(this);
        this.Bodyfront_r28.setRotationPoint(0.4F, 1.4414F, 7.8165F);
        this.body.addChild(Bodyfront_r28);
        this.setRotateAngle(Bodyfront_r28, 0.0084F, -0.0269F, -0.9147F);
        this.Bodyfront_r28.cubeList.add(new ModelBox(Bodyfront_r28, 0, 36, 0.39F, 0.9411F, -0.619F, 0, 3, 1, 0.001F, false));

        this.Bodyfront_r29 = new ModelRenderer(this);
        this.Bodyfront_r29.setRotationPoint(0.4F, 1.4414F, 7.8165F);
        this.body.addChild(Bodyfront_r29);
        this.setRotateAngle(Bodyfront_r29, 0.0181F, -0.0217F, -1.3075F);
        this.Bodyfront_r29.cubeList.add(new ModelBox(Bodyfront_r29, 14, 27, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r30 = new ModelRenderer(this);
        this.Bodyfront_r30.setRotationPoint(0.4F, 1.4414F, 5.8165F);
        this.body.addChild(Bodyfront_r30);
        this.setRotateAngle(Bodyfront_r30, 0.0084F, -0.0269F, -0.9147F);
        this.Bodyfront_r30.cubeList.add(new ModelBox(Bodyfront_r30, 29, 50, 0.39F, 0.9411F, -0.619F, 0, 4, 1, 0.001F, false));

        this.Bodyfront_r31 = new ModelRenderer(this);
        this.Bodyfront_r31.setRotationPoint(0.4F, 1.4414F, 5.8165F);
        this.body.addChild(Bodyfront_r31);
        this.setRotateAngle(Bodyfront_r31, 0.0181F, -0.0217F, -1.3075F);
        this.Bodyfront_r31.cubeList.add(new ModelBox(Bodyfront_r31, 13, 0, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r32 = new ModelRenderer(this);
        this.Bodyfront_r32.setRotationPoint(0.4F, 1.4414F, 3.8165F);
        this.body.addChild(Bodyfront_r32);
        this.setRotateAngle(Bodyfront_r32, 0.0084F, -0.0269F, -0.9584F);
        this.Bodyfront_r32.cubeList.add(new ModelBox(Bodyfront_r32, 26, 50, 0.39F, 0.9411F, -0.619F, 0, 5, 1, 0.001F, false));

        this.Bodyfront_r33 = new ModelRenderer(this);
        this.Bodyfront_r33.setRotationPoint(0.4F, 1.4414F, 3.8165F);
        this.body.addChild(Bodyfront_r33);
        this.setRotateAngle(Bodyfront_r33, 0.0181F, -0.0217F, -1.3511F);
        this.Bodyfront_r33.cubeList.add(new ModelBox(Bodyfront_r33, 32, 22, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r34 = new ModelRenderer(this);
        this.Bodyfront_r34.setRotationPoint(0.4F, 1.4414F, 1.8165F);
        this.body.addChild(Bodyfront_r34);
        this.setRotateAngle(Bodyfront_r34, 0.0084F, -0.0269F, -1.002F);
        this.Bodyfront_r34.cubeList.add(new ModelBox(Bodyfront_r34, 6, 53, 0.39F, 0.9411F, -0.619F, 0, 4, 1, 0.001F, false));

        this.Bodyfront_r35 = new ModelRenderer(this);
        this.Bodyfront_r35.setRotationPoint(0.4F, 1.4414F, 1.8165F);
        this.body.addChild(Bodyfront_r35);
        this.setRotateAngle(Bodyfront_r35, 0.0181F, -0.0217F, -1.3948F);
        this.Bodyfront_r35.cubeList.add(new ModelBox(Bodyfront_r35, 36, 10, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r36 = new ModelRenderer(this);
        this.Bodyfront_r36.setRotationPoint(0.4F, 1.4414F, -0.1835F);
        this.body.addChild(Bodyfront_r36);
        this.setRotateAngle(Bodyfront_r36, 0.0354F, 0.1081F, -1.4376F);
        this.Bodyfront_r36.cubeList.add(new ModelBox(Bodyfront_r36, 38, 34, 0.0F, 0.0262F, -0.619F, 0, 1, 1, 0.001F, false));

        this.Bodyfront_r37 = new ModelRenderer(this);
        this.Bodyfront_r37.setRotationPoint(0.4F, 1.4414F, -0.1835F);
        this.body.addChild(Bodyfront_r37);
        this.setRotateAngle(Bodyfront_r37, 0.0742F, 0.0863F, -1.0437F);
        this.Bodyfront_r37.cubeList.add(new ModelBox(Bodyfront_r37, 9, 53, 0.39F, 0.9411F, -0.619F, 0, 3, 1, 0.001F, false));

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
