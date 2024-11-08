package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCtenochasmaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer root;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r1;
    private final ModelRenderer chest;
    private final ModelRenderer chest_r1;
    private final ModelRenderer chest_r2;
    private final ModelRenderer chest_r3;
    private final ModelRenderer bone;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing7;
    private final ModelRenderer leftwing8;
    private final ModelRenderer leftmembrane;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing7;
    private final ModelRenderer rightwing8;
    private final ModelRenderer rightmembrane;
    private final ModelRenderer righthand;
    private final ModelRenderer neck;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r2;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r3;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer leftHead;
    private final ModelRenderer rightHead;

    public ModelSkeletonCtenochasmaFrame() {
        this.textureWidth = 65;
        this.textureHeight = 65;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -7.0F, 1.1F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.4974F, 0.0F, 0.0F);


        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 2.25F, 1.75F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.2456F, 0.2543F, -0.063F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -1.3515F, 0.5304F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -1.5708F, -1.2915F, 1.5708F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, -2, 42, -0.4F, -0.1F, -2.0F, 1, 1, 4, -0.3F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -1.7898F, 0.1974F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.2793F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 44, -0.5F, 0.1052F, -0.5203F, 1, 1, 2, -0.3F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(1.0F, -1.05F, 0.8F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.5633F, -0.0702F, -1.242F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0276F, 1.6927F, -0.4558F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4808F, -0.2184F, 0.1965F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(-0.0694F, 3.4345F, -0.0498F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 1.2162F, 0.2407F, 0.2122F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-1.0F, -1.05F, 0.8F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.5633F, 0.0702F, 1.242F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.0276F, 1.6927F, -0.4558F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4808F, 0.2184F, -0.1965F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0694F, 3.4345F, -0.0498F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 1.2162F, -0.2407F, -0.2122F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.425F, 1.8F);
        this.body1.addChild(tail);
        this.setRotateAngle(tail, -0.2633F, 0.2615F, -0.0117F);
        this.tail.cubeList.add(new ModelBox(tail, 58, 41, -0.5F, 0.1F, 0.55F, 1, 1, 1, -0.302F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.2F, 0.6F, -0.55F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1396F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 41, -0.5F, -0.5F, -0.3F, 1, 1, 2, -0.3F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, 2.05F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, 0.0418F, 0.3917F, -0.0123F);


        this.chest_r1 = new ModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.5F, -0.8898F, -2.1305F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.3403F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 25, 19, 0.0F, 0.1246F, -0.3133F, 1, 1, 3, -0.302F, false));

        this.chest_r2 = new ModelRenderer(this);
        this.chest_r2.setRotationPoint(0.0F, -0.442F, -3.5141F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, -1.5708F, -1.4399F, 1.5708F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, -2, 25, -1.3F, -0.4F, -2.5F, 1, 1, 5, -0.3F, false));

        this.chest_r3 = new ModelRenderer(this);
        this.chest_r3.setRotationPoint(-0.5F, -0.6898F, -4.7305F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, -0.1309F, 0.0F, 0.0F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 0, 27, 0.0F, -0.4131F, -0.2617F, 1, 1, 3, -0.3F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.442F, -3.5141F);
        this.chest.addChild(bone);


        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(1.4F, -0.45F, -3.8F);
        this.chest.addChild(leftwing6);
        this.setRotateAngle(leftwing6, -0.2622F, -0.1731F, -0.2911F);


        this.leftwing7 = new ModelRenderer(this);
        this.leftwing7.setRotationPoint(4.9F, -0.1F, -0.7F);
        this.leftwing6.addChild(leftwing7);
        this.setRotateAngle(leftwing7, -0.0126F, 0.2245F, -0.0662F);


        this.leftwing8 = new ModelRenderer(this);
        this.leftwing8.setRotationPoint(6.493F, 0.5826F, -0.2007F);
        this.leftwing7.addChild(leftwing8);
        this.setRotateAngle(leftwing8, -3.0893F, 0.2525F, -2.9859F);


        this.leftmembrane = new ModelRenderer(this);
        this.leftmembrane.setRotationPoint(-4.75F, 0.0F, -0.5F);
        this.leftwing8.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, 0.0041F, -0.2525F, -0.0801F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing8.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0922F, 0.0606F, 0.0084F);


        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(-1.4F, -0.45F, -3.8F);
        this.chest.addChild(rightwing6);
        this.setRotateAngle(rightwing6, -0.2876F, 0.1256F, 0.1212F);


        this.rightwing7 = new ModelRenderer(this);
        this.rightwing7.setRotationPoint(-4.9F, -0.1F, -0.7F);
        this.rightwing6.addChild(rightwing7);
        this.setRotateAngle(rightwing7, -0.0126F, -0.2245F, 0.0662F);


        this.rightwing8 = new ModelRenderer(this);
        this.rightwing8.setRotationPoint(-6.493F, 0.5826F, -0.2007F);
        this.rightwing7.addChild(rightwing8);
        this.setRotateAngle(rightwing8, -3.0893F, -0.2525F, 2.9859F);


        this.rightmembrane = new ModelRenderer(this);
        this.rightmembrane.setRotationPoint(4.75F, 0.0F, -0.5F);
        this.rightwing8.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, 0.0041F, 0.2525F, 0.0801F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing8.addChild(righthand);
        this.setRotateAngle(righthand, 0.0922F, -0.0606F, -0.0084F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.1398F, -4.6805F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1294F, 0.2615F, 0.0117F);
        this.neck.cubeList.add(new ModelBox(neck, 42, 14, -0.5F, -0.011F, -2.0302F, 1, 1, 2, -0.3F, false));
        this.neck.cubeList.add(new ModelBox(neck, 43, 15, -0.5F, -0.011F, -0.6302F, 1, 1, 1, -0.3F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0862F, -1.4431F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0982F, 0.1261F, -0.0352F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.4186F, -2.3315F);
        this.neck2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 21, -0.5F, 0.0131F, -0.3955F, 1, 1, 3, -0.3F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.3186F, -2.4315F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2242F, 0.2577F, 0.0465F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.7F, -2.2F);
        this.neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5411F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -2, 31, -0.5F, 0.2F, -0.8F, 1, 1, 4, -0.3F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.35F, -2.05F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.1459F, -0.6076F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3142F, 0.0F, 0.0F);


        this.leftHead = new ModelRenderer(this);
        this.leftHead.setRotationPoint(0.2F, 0.5172F, -7.2542F);
        this.head.addChild(leftHead);


        this.rightHead = new ModelRenderer(this);
        this.rightHead.setRotationPoint(-0.2F, 0.5172F, -7.2542F);
        this.head.addChild(rightHead);

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
