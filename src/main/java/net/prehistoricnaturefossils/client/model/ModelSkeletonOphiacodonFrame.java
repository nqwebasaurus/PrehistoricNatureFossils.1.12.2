package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOphiacodonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer ophiacodon;
    private final ModelRenderer back_body;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer tail;
    private final ModelRenderer frame5_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer tail5;
    private final ModelRenderer left_thigh;
    private final ModelRenderer left_shin;
    private final ModelRenderer left_foot;
    private final ModelRenderer right_thigh;
    private final ModelRenderer right_shin;
    private final ModelRenderer right_foot;
    private final ModelRenderer middle_body;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer front_body;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer lower_jaw;
    private final ModelRenderer left_upper_arm;
    private final ModelRenderer left_lower_arm;
    private final ModelRenderer left_paw;
    private final ModelRenderer right_upper_arm;
    private final ModelRenderer right_lower_arm;
    private final ModelRenderer right_paw;

    public ModelSkeletonOphiacodonFrame() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -13.9F, 11.0F, 1, 14, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -3.5F, -12.0F, 11.02F, 7, 1, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, 9.15F, -16.9F, -9.65F, 1, 17, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(9.25F, -11.25F, -9.25F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, -0.0335F, -0.6538F, 0.055F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -5.5F, -0.5F, -0.5F, 11, 1, 1, -0.1F, false));

        this.ophiacodon = new ModelRenderer(this);
        this.ophiacodon.setRotationPoint(0.0F, -11.0F, -1.0F);
        this.fossil.addChild(ophiacodon);
        this.setRotateAngle(ophiacodon, -0.0873F, 0.0F, 0.0F);


        this.back_body = new ModelRenderer(this);
        this.back_body.setRotationPoint(0.0F, -5.3372F, 11.7233F);
        this.ophiacodon.addChild(back_body);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(-0.5F, 0.7734F, -3.0755F);
        this.back_body.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.2618F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 15, 58, 0.0F, -1.0404F, -0.109F, 1, 1, 9, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7471F, 5.0501F);
        this.back_body.addChild(tail);
        this.setRotateAngle(tail, 0.0492F, 0.4795F, 0.0227F);


        this.frame5_r1 = new ModelRenderer(this);
        this.frame5_r1.setRotationPoint(-0.5F, 2.1844F, 0.3155F);
        this.tail.addChild(frame5_r1);
        this.setRotateAngle(frame5_r1, -0.4363F, 0.0F, 0.0F);
        this.frame5_r1.cubeList.add(new ModelBox(frame5_r1, 47, 35, 0.0F, -0.9432F, -0.4009F, 1, 1, 10, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 3.8842F, 8.4262F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0457F, 0.3051F, 0.0138F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.5F, 2.9348F, 4.2887F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, -0.3491F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 1, 36, 0.0F, -0.3F, -4.5F, 1, 1, 11, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 3.3F, 9.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0517F, 0.5666F, 0.0278F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.0F, 2.8501F, 2.1612F);
        this.tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, -0.2618F, 0.0F, 0.0F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 0, 50, -0.5F, -0.95F, -2.75F, 1, 1, 9, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 2.2697F, 8.029F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0517F, 0.5666F, -0.0278F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.5109F, 0.4578F);
        this.tail4.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, -0.0262F, 0.0F, 0.0F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, 19, 0, -0.5F, -0.2758F, -0.9575F, 1, 1, 14, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.1F, 13.1F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0962F, 0.4346F, -0.0406F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, 0.4675F, 0.0188F, 1, 1, 16, -0.1F, false));

        this.left_thigh = new ModelRenderer(this);
        this.left_thigh.setRotationPoint(3.0F, 4.2539F, 0.1857F);
        this.back_body.addChild(left_thigh);
        this.setRotateAngle(left_thigh, 0.0F, 0.0F, -0.1309F);


        this.left_shin = new ModelRenderer(this);
        this.left_shin.setRotationPoint(6.9801F, 3.2169F, -0.9962F);
        this.left_thigh.addChild(left_shin);
        this.setRotateAngle(left_shin, -0.0873F, 0.0F, 0.0F);


        this.left_foot = new ModelRenderer(this);
        this.left_foot.setRotationPoint(-0.1386F, 7.1063F, 3.1843F);
        this.left_shin.addChild(left_foot);
        this.setRotateAngle(left_foot, 0.1745F, 0.0F, 0.1309F);


        this.right_thigh = new ModelRenderer(this);
        this.right_thigh.setRotationPoint(-3.0F, 4.2539F, 0.1857F);
        this.back_body.addChild(right_thigh);
        this.setRotateAngle(right_thigh, 0.0F, 0.0F, 0.1309F);


        this.right_shin = new ModelRenderer(this);
        this.right_shin.setRotationPoint(-6.9801F, 3.2169F, -0.9962F);
        this.right_thigh.addChild(right_shin);
        this.setRotateAngle(right_shin, -0.0873F, 0.0F, 0.0F);


        this.right_foot = new ModelRenderer(this);
        this.right_foot.setRotationPoint(0.1386F, 7.1063F, 3.1843F);
        this.right_shin.addChild(right_foot);
        this.setRotateAngle(right_foot, 0.1745F, 0.0F, -0.1309F);


        this.middle_body = new ModelRenderer(this);
        this.middle_body.setRotationPoint(0.0F, -1.2414F, -3.1808F);
        this.back_body.addChild(middle_body);
        this.setRotateAngle(middle_body, 0.0F, -0.4363F, 0.0F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(-0.5F, 1.6746F, -15.2819F);
        this.middle_body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0436F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 0, 17, 0.0F, -1.3F, -0.0026F, 1, 1, 16, -0.1F, false));

        this.front_body = new ModelRenderer(this);
        this.front_body.setRotationPoint(0.0F, -0.9043F, -14.9347F);
        this.middle_body.addChild(front_body);
        this.setRotateAngle(front_body, 0.0057F, -0.306F, 0.0083F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 2.2969F, -7.749F);
        this.front_body.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0785F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 0, 62, -1.0F, -0.3716F, -0.0221F, 1, 1, 8, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5466F, -7.467F);
        this.front_body.addChild(neck);
        this.setRotateAngle(neck, -0.0953F, -0.4781F, 0.0137F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(1.0F, 4.2268F, -0.9392F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0873F, 0.0F, 0.0F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 35, 58, -1.5F, -2.9F, -2.0F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -2.4F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.4943F, -0.2316F, 0.1231F);


        this.lower_jaw = new ModelRenderer(this);
        this.lower_jaw.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.head.addChild(lower_jaw);
        this.setRotateAngle(lower_jaw, 1.0908F, 0.0F, 0.0F);


        this.left_upper_arm = new ModelRenderer(this);
        this.left_upper_arm.setRotationPoint(6.0F, 7.4867F, -3.695F);
        this.front_body.addChild(left_upper_arm);
        this.setRotateAngle(left_upper_arm, 0.0F, 0.0F, 0.0436F);


        this.left_lower_arm = new ModelRenderer(this);
        this.left_lower_arm.setRotationPoint(3.0029F, 3.1309F, 3.0F);
        this.left_upper_arm.addChild(left_lower_arm);


        this.left_paw = new ModelRenderer(this);
        this.left_paw.setRotationPoint(0.0755F, 7.6634F, -0.6413F);
        this.left_lower_arm.addChild(left_paw);
        this.setRotateAngle(left_paw, 0.0873F, 0.0F, 0.0F);


        this.right_upper_arm = new ModelRenderer(this);
        this.right_upper_arm.setRotationPoint(-6.0F, 7.4867F, -3.695F);
        this.front_body.addChild(right_upper_arm);
        this.setRotateAngle(right_upper_arm, 0.0F, 0.0F, -0.0436F);


        this.right_lower_arm = new ModelRenderer(this);
        this.right_lower_arm.setRotationPoint(-3.0029F, 3.1309F, 3.0F);
        this.right_upper_arm.addChild(right_lower_arm);


        this.right_paw = new ModelRenderer(this);
        this.right_paw.setRotationPoint(-0.0755F, 7.6634F, -0.6413F);
        this.right_lower_arm.addChild(right_paw);
        this.setRotateAngle(right_paw, 0.0873F, 0.0F, 0.0F);

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
