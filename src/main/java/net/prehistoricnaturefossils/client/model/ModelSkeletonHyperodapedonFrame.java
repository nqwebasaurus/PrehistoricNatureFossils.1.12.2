package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHyperodapedonFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer crossbeam1_r1;
    private final ModelRenderer hyperodapedon;
    private final ModelRenderer hip;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer frame7_r1;
    private final ModelRenderer body;
    private final ModelRenderer upperbody;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;

    public ModelSkeletonHyperodapedonFrame() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.495F, -4.9F, 5.75F, 1, 5, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.25F, -4.9F, -7.3F, 1, 5, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(-0.25F, -3.15F, -6.85F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.1222F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -1, 1, -3.0F, -0.5F, -0.5F, 7, 1, 1, -0.1F, false));

        this.crossbeam1_r1 = new ModelRenderer(this);
        this.crossbeam1_r1.setRotationPoint(0.0F, -4.25F, 6.25F);
        this.fossil.addChild(crossbeam1_r1);
        this.setRotateAngle(crossbeam1_r1, 0.0006F, 0.0F, -0.0349F);
        this.crossbeam1_r1.cubeList.add(new ModelBox(crossbeam1_r1, -1, 1, -3.0F, -0.5F, -0.5F, 6, 1, 1, -0.1F, false));

        this.hyperodapedon = new ModelRenderer(this);
        this.hyperodapedon.setRotationPoint(0.0F, -7.0F, 5.0F);
        this.fossil.addChild(hyperodapedon);


        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.hyperodapedon.addChild(hip);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.5F, 0.3F, 4.05F);
        this.hip.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, -0.1484F, 0.0F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 12, 28, -1.0F, -0.1515F, -0.0666F, 1, 1, 5, -0.1F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.3042F, 8.7284F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.3957F, 0.1209F, -0.0503F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -0.5F, 0.5112F, -0.0553F, 1, 1, 7, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2388F, 6.9447F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0804F, 0.2175F, 0.0174F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(0.0F, 1.4F, -0.5F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0708F, 0.1917F, 0.0074F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 19, 0, -0.5F, -0.6813F, -0.0845F, 1, 1, 6, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3246F, 5.6703F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1481F, -0.4754F, -0.0787F);


        this.frame7_r1 = new ModelRenderer(this);
        this.frame7_r1.setRotationPoint(0.5575F, 0.5047F, -1.4099F);
        this.tail3.addChild(frame7_r1);
        this.setRotateAngle(frame7_r1, 0.1048F, 0.061F, 0.0015F);
        this.frame7_r1.cubeList.add(new ModelBox(frame7_r1, 11, 12, -0.5F, -0.5F, 0.0F, 1, 1, 8, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4F, 4.15F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 10, -0.495F, 0.55F, -7.9F, 1, 1, 8, -0.1F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.1F, -8.1F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0F, -0.0873F, 0.0F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, 0.8F, -1.55F);
        this.upperbody.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 27, 23, -1.0F, 0.0F, -3.0F, 1, 1, 5, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.3F, -4.3F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.1473F, -0.4755F, -0.0678F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -0.5F, 0.7071F, -3.9149F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.0909F, 0.4052F, -3.4108F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.6522F, -0.6505F, 0.0905F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0909F, 1.3568F, -0.4105F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.3054F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.3568F, -0.4105F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.5236F, 0.0F, 0.0F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.3F, 2.75F, -2.9F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.6545F, 0.0F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.5527F, -0.1F, 3.2115F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.1309F, -0.6109F, 0.0F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-1.3108F, 3.0596F, 0.1866F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.1392F, -0.346F, 0.0475F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.3F, 2.75F, -2.9F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, -1.3526F, 0.0F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-0.5527F, -0.1F, 3.2115F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.7299F, 0.9558F, 0.0774F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(1.3108F, 3.0596F, 0.1866F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.9516F, 0.346F, -0.0475F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(2.25F, 1.5F, 6.35F);
        this.hip.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.7681F, -0.1841F, -0.1872F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.38F, 2.675F, -0.2172F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.7734F, -0.1536F, 0.1555F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 2.0F, 0.75F);
        this.backleftleg2.addChild(backleftleg3);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.25F, 1.5F, 6.35F);
        this.hip.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0173F, 0.1841F, 0.1872F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-0.38F, 2.675F, -0.2172F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 1.2097F, 0.1536F, -0.1555F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 2.0F, 0.75F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.9599F, 0.0F, 0.0F);

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
