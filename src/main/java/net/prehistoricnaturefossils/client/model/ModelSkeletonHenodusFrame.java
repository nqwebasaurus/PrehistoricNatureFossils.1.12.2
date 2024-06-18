package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonHenodusFrame extends ModelBase {
    private final ModelRenderer henodus;
    private final ModelRenderer shell;
    private final ModelRenderer neck;
    private final ModelRenderer frame1_r1;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer frame4_r1;
    private final ModelRenderer tail3;

    public ModelSkeletonHenodusFrame() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.henodus = new ModelRenderer(this);
        this.henodus.setRotationPoint(-0.5F, 23.0F, 0.0F);


        this.shell = new ModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.henodus.addChild(shell);
        this.setRotateAngle(shell, -0.3054F, 0.0F, -0.1745F);
        this.shell.cubeList.add(new ModelBox(shell, 51, 66, -2.0F, -0.5F, -5.1F, 5, 1, 1, -0.1F, false));
        this.shell.cubeList.add(new ModelBox(shell, 41, 54, 0.0F, -0.5F, -5.0F, 1, 1, 13, -0.1F, false));
        this.shell.cubeList.add(new ModelBox(shell, 51, 66, -2.0F, -0.85F, 7.0F, 5, 1, 1, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.5F, -0.6644F, -4.7327F);
        this.shell.addChild(neck);
        this.setRotateAngle(neck, 0.0024F, -0.1379F, 0.3024F);


        this.frame1_r1 = new ModelRenderer(this);
        this.frame1_r1.setRotationPoint(0.1F, 0.439F, -1.4305F);
        this.neck.addChild(frame1_r1);
        this.setRotateAngle(frame1_r1, -0.1314F, 0.0865F, -0.0114F);
        this.frame1_r1.cubeList.add(new ModelBox(frame1_r1, 40, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.611F, -3.0037F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.294F, -0.289F, -0.1801F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.2763F, 0.0081F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.75F, -0.25F, -4.75F);
        this.shell.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.201F, -0.9092F, -0.1144F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.5672F, 0.0F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.75F, -0.25F, -4.75F);
        this.shell.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.126F, 0.2192F, -0.0175F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, 0.2618F, 0.0F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(2.75F, -0.25F, 7.25F);
        this.shell.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.2086F, -0.0786F, 0.0832F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.3265F, -0.1358F, 2.3623F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.2618F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(-1.75F, -0.25F, 7.25F);
        this.shell.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2294F, -0.4331F, 0.0311F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.3265F, -0.1358F, 2.3623F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0F, 0.3927F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.0F, 8.0F);
        this.shell.addChild(tail);
        this.setRotateAngle(tail, 0.0423F, -0.1739F, 0.0154F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 36, -0.5F, 0.5F, -0.75F, 1, 1, 4, -0.1F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 3.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2214F, -0.1704F, -0.0381F);


        this.frame4_r1 = new ModelRenderer(this);
        this.frame4_r1.setRotationPoint(0.0F, 1.4F, 1.25F);
        this.tail2.addChild(frame4_r1);
        this.setRotateAngle(frame4_r1, 0.0F, 0.0349F, 0.0F);
        this.frame4_r1.cubeList.add(new ModelBox(frame4_r1, 0, 34, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, -0.3491F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 23, -0.5F, 0.9F, -0.55F, 1, 1, 4, -0.1F, false));

    }

    public void renderAll(float f) {
        this.henodus.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
