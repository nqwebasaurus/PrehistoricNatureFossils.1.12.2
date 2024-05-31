package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDatheosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer crossbeam2_r1;
    private final ModelRenderer pole2_r1;
    private final ModelRenderer Datheosaurus;
    private final ModelRenderer body2;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer frame8_r1;
    private final ModelRenderer body;
    private final ModelRenderer frame3_r1;
    private final ModelRenderer frame2_r1;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer upperbody;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonDatheosaurusFrame() {
        this.textureWidth = 47;
        this.textureHeight = 47;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.49F, -4.9F, 4.75F, 1, 5, 1, -0.1F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -2.0F, -4.75F, 4.75F, 4, 1, 1, -0.1F, false));

        this.crossbeam2_r1 = new ModelRenderer(this);
        this.crossbeam2_r1.setRotationPoint(2.0653F, -3.25F, -7.2457F);
        this.fossil.addChild(crossbeam2_r1);
        this.setRotateAngle(crossbeam2_r1, 0.0F, -0.2182F, 0.0F);
        this.crossbeam2_r1.cubeList.add(new ModelBox(crossbeam2_r1, -1, 1, -3.0F, -0.5F, -0.5F, 6, 1, 1, -0.1F, false));

        this.pole2_r1 = new ModelRenderer(this);
        this.pole2_r1.setRotationPoint(2.0F, -2.25F, -7.25F);
        this.fossil.addChild(pole2_r1);
        this.setRotateAngle(pole2_r1, 0.0F, -0.1309F, 0.0F);
        this.pole2_r1.cubeList.add(new ModelBox(pole2_r1, 2, 1, -0.5F, -3.65F, -0.5F, 1, 6, 1, -0.1F, false));

        this.Datheosaurus = new ModelRenderer(this);
        this.Datheosaurus.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.fossil.addChild(Datheosaurus);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(3.0F, -5.15F, -0.7F);
        this.Datheosaurus.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 13, 29, -3.5F, 0.5517F, 2.7313F, 1, 1, 4, -0.1F, false));

        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(-1.25F, 1.3093F, 6.3445F);
        this.body2.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0365F, 0.479F, 0.0995F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(3.8782F, 0.0495F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.124F, -0.0408F, -0.0172F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(-0.2624F, 3.9243F, -0.0052F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0505F, -0.7416F, -0.0363F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-4.75F, 1.3093F, 6.3445F);
        this.body2.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0365F, -0.479F, -0.0995F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(-3.8782F, 0.0495F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.124F, 0.0408F, 0.0172F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.2624F, 3.9243F, -0.0052F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0505F, 0.7416F, 0.0363F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-3.0F, -0.0325F, 6.7258F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0921F, 0.4819F, 0.0655F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 0, -0.4932F, 0.5706F, -0.3012F, 1, 1, 7, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0015F, 0.0203F, 6.7013F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0059F, 0.3923F, -0.0327F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 8, -0.4871F, 0.5605F, -0.5115F, 1, 1, 7, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0161F, 0.0571F, 6.0851F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0398F, 0.5667F, 0.0067F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 12, -0.5053F, 0.5407F, -0.1649F, 1, 1, 7, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(-0.0053F, 0.0407F, 6.7351F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0499F, 0.9365F, 0.296F);


        this.frame8_r1 = new ModelRenderer(this);
        this.frame8_r1.setRotationPoint(0.0F, 1.0F, 0.25F);
        this.tail4.addChild(frame8_r1);
        this.setRotateAngle(frame8_r1, 0.0869F, 0.0075F, -0.001F);
        this.frame8_r1.cubeList.add(new ModelBox(frame8_r1, -1, -1, -0.5F, -0.5F, -0.5F, 1, 1, 11, -0.1F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-2.8913F, 0.0476F, 2.8064F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.134F, -0.2163F, -0.0289F);


        this.frame3_r1 = new ModelRenderer(this);
        this.frame3_r1.setRotationPoint(0.0F, 0.8044F, -5.7223F);
        this.body.addChild(frame3_r1);
        this.setRotateAngle(frame3_r1, -0.0524F, 0.0F, 0.0F);
        this.frame3_r1.cubeList.add(new ModelBox(frame3_r1, 11, 15, -0.5979F, -0.6309F, -0.0029F, 1, 1, 6, -0.1F, false));

        this.frame2_r1 = new ModelRenderer(this);
        this.frame2_r1.setRotationPoint(-0.1F, 0.7364F, -8.3737F);
        this.body.addChild(frame2_r1);
        this.setRotateAngle(frame2_r1, 0.0611F, 0.0F, 0.0F);
        this.frame2_r1.cubeList.add(new ModelBox(frame2_r1, -2, 25, -0.5F, -0.4F, -3.0F, 1, 1, 6, -0.1F, false));

        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.3675F, 2.9848F, -9.2063F);
        this.body.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.2115F, 0.3785F, 0.4982F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.6036F, 1.2F, 0.2268F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.1071F, 0.0491F, -0.4898F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.4991F, 3.1071F, 0.0846F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1412F, -0.3963F, 0.0013F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.15F, 2.9848F, -9.2063F);
        this.body.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.2114F, -0.3767F, -0.4978F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.6036F, 1.2F, 0.2268F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.1071F, -0.0491F, 0.4898F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.4991F, 3.1071F, 0.0846F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1412F, 0.3963F, -0.0013F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(-0.5382F, 0.0502F, -10.687F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0915F, 0.3042F, -0.0275F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.4295F, 1.0584F, -1.2029F);
        this.upperbody.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.0873F, 0.0F, 3.0936F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 38, 1, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.5382F, 0.0324F, -1.8771F);
        this.upperbody.addChild(head);
        this.setRotateAngle(head, -0.4384F, 0.5378F, 0.0234F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0003F, 0.0811F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);

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
