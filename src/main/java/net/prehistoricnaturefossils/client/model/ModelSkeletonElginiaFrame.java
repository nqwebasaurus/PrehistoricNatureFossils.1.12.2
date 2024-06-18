package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonElginiaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer elginia;
    private final ModelRenderer lowerbody;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backleftleg5;
    private final ModelRenderer backleftleg6;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer backrightleg5;
    private final ModelRenderer backrightleg6;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer frame6_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer upperbody;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer frontleftleg5;
    private final ModelRenderer frontleftleg6;
    private final ModelRenderer frontrightleg4;
    private final ModelRenderer frontrightleg5;
    private final ModelRenderer frontrightleg6;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer body;

    public ModelSkeletonElginiaFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.49F, -8.9F, 8.75F, 1, 9, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, -1, 1, -3.0F, -7.5F, 8.751F, 6, 1, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, 0.92F, -8.9F, -3.4F, 1, 9, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(1.45F, -4.75F, -3.4F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0038F, -0.0872F, -0.0438F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -4, 1, -6.05F, -1.0F, 0.0F, 12, 1, 1, -0.1F, false));

        this.elginia = new ModelRenderer(this);
        this.elginia.setRotationPoint(0.0F, -4.25F, 0.0F);
        this.fossil.addChild(elginia);


        this.lowerbody = new ModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -5.8F, 8.25F);
        this.elginia.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.1745F, 0.0F, 0.0F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.0627F, 0.9822F);
        this.lowerbody.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0052F, -0.0209F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 38, 36, -0.48F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(2.3164F, 2.839F, 0.3822F);
        this.lowerbody.addChild(backleftleg4);


        this.backleftleg5 = new ModelRenderer(this);
        this.backleftleg5.setRotationPoint(3.0F, 2.6025F, -0.136F);
        this.backleftleg4.addChild(backleftleg5);


        this.backleftleg6 = new ModelRenderer(this);
        this.backleftleg6.setRotationPoint(-0.4787F, 3.697F, 1.8377F);
        this.backleftleg5.addChild(backleftleg6);
        this.setRotateAngle(backleftleg6, 0.1745F, 0.0F, 0.0F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-2.3164F, 2.839F, 0.3822F);
        this.lowerbody.addChild(backrightleg4);


        this.backrightleg5 = new ModelRenderer(this);
        this.backrightleg5.setRotationPoint(-3.0F, 2.6025F, -0.136F);
        this.backrightleg4.addChild(backrightleg5);


        this.backrightleg6 = new ModelRenderer(this);
        this.backrightleg6.setRotationPoint(0.4787F, 3.697F, 1.8377F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.1745F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2627F, 2.8822F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, -0.4215F, -0.3614F, 0.1572F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 37, -0.5F, 0.317F, -0.2086F, 1, 1, 4, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.233F, 3.7914F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0481F, -0.4359F, 0.0203F);


        this.frame6_r1 = new ModelRenderer(this);
        this.frame6_r1.setRotationPoint(-0.1F, 1.0739F, 1.5265F);
        this.tail2.addChild(frame6_r1);
        this.setRotateAngle(frame6_r1, 0.0175F, 0.0F, 0.0F);
        this.frame6_r1.cubeList.add(new ModelBox(frame6_r1, 7, 26, -0.5F, -0.5336F, -2.0F, 1, 1, 4, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0739F, 2.8188F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3365F, -0.6699F, -0.2139F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 40, -0.5F, 0.5131F, -0.2066F, 1, 1, 3, -0.1F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.1489F, -0.6436F);
        this.lowerbody.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.3518F, -0.123F, -0.045F);


        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(0.5F, -0.1369F, -13.8406F);
        this.upperbody.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0873F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, 20, 34, -0.99F, -0.6F, 0.0F, 1, 1, 4, -0.1F, false));

        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(4.2164F, 3.1894F, -11.0906F);
        this.upperbody.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, -0.6355F, 0.2739F, -0.2373F);


        this.frontleftleg5 = new ModelRenderer(this);
        this.frontleftleg5.setRotationPoint(3.0F, 0.75F, 0.75F);
        this.frontleftleg4.addChild(frontleftleg5);
        this.setRotateAngle(frontleftleg5, -0.0873F, 0.0F, 0.0436F);


        this.frontleftleg6 = new ModelRenderer(this);
        this.frontleftleg6.setRotationPoint(-0.2233F, 4.3967F, -0.161F);
        this.frontleftleg5.addChild(frontleftleg6);
        this.setRotateAngle(frontleftleg6, 0.6476F, -0.0934F, 0.1476F);


        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-4.2164F, 3.1894F, -11.0906F);
        this.upperbody.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.5683F, 0.0094F, 0.218F);


        this.frontrightleg5 = new ModelRenderer(this);
        this.frontrightleg5.setRotationPoint(-3.0F, 0.75F, 0.75F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, -0.2182F, 0.0F, -0.2618F);


        this.frontrightleg6 = new ModelRenderer(this);
        this.frontrightleg6.setRotationPoint(-0.2841F, 5.1376F, 0.1015F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, -0.1745F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.2765F, -13.9215F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.2618F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 36, 10, -0.5F, 0.5653F, -3.7391F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1993F, -3.1288F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.2706F, -0.2527F, -0.0692F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4233F, -0.7327F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.7967F, -9.0F);
        this.upperbody.addChild(body);
        this.setRotateAngle(body, -0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, 1.8799F, -0.7981F, 1, 1, 10, -0.1F, false));

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
