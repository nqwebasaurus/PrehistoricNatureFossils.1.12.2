package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonJianchangnathusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer root;
    private final ModelRenderer chest1;
    private final ModelRenderer chest2_r1;
    private final ModelRenderer body1;
    private final ModelRenderer body3_r1;
    private final ModelRenderer body2_r1;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer leftleg1;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftlegwing2;
    private final ModelRenderer leftlegwing1;
    private final ModelRenderer rightleg1;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightlegwing2;
    private final ModelRenderer rightlegwing1;
    private final ModelRenderer neck1;
    private final ModelRenderer neck2_r1;
    private final ModelRenderer neck2;
    private final ModelRenderer neck3;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer jaw2;
    private final ModelRenderer jaw3;
    private final ModelRenderer jaw5;
    private final ModelRenderer shape64;
    private final ModelRenderer jaw4;
    private final ModelRenderer underneck3;
    private final ModelRenderer gums1;
    private final ModelRenderer head2;
    private final ModelRenderer head3;
    private final ModelRenderer head5;
    private final ModelRenderer lips1;
    private final ModelRenderer lips2;
    private final ModelRenderer head4;
    private final ModelRenderer crest1;
    private final ModelRenderer crest2;
    private final ModelRenderer leftwing1;
    private final ModelRenderer leftwing2;
    private final ModelRenderer leftwing3;
    private final ModelRenderer leftwing4;
    private final ModelRenderer leftwing5;
    private final ModelRenderer leftwing6;
    private final ModelRenderer leftwing5membrance2;
    private final ModelRenderer lefthand2;
    private final ModelRenderer leftwing4membrance;
    private final ModelRenderer leftwing3membrance;
    private final ModelRenderer leftwing1membrance;
    private final ModelRenderer rightwing1;
    private final ModelRenderer rightwing2;
    private final ModelRenderer rightwing3;
    private final ModelRenderer rightwing4;
    private final ModelRenderer rightwing5;
    private final ModelRenderer rightwing6;
    private final ModelRenderer rightwing5membrance2;
    private final ModelRenderer righthand2;
    private final ModelRenderer rightwing4membrance;
    private final ModelRenderer rightwing3membrance;
    private final ModelRenderer rightwing1membrance;

    public ModelSkeletonJianchangnathusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -7.6F, 2.7F, 1, 8, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -10.0F, -3.9F, 1, 10, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.0F, -3.4F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -9.0F, 3.2F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 1.2F, -2.0F, -0.5F, 1, 4, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, -9.25F, 0.0F);
        this.fossil.addChild(root);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest1 = new ModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -1.0681F, -1.5176F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.6241F, 0.0F, 0.0F);


        this.chest2_r1 = new ModelRenderer(this);
        this.chest2_r1.setRotationPoint(0.0F, -0.4F, -1.3F);
        this.chest1.addChild(chest2_r1);
        this.setRotateAngle(chest2_r1, 0.1571F, 0.0F, 0.0F);
        this.chest2_r1.cubeList.add(new ModelBox(chest2_r1, 27, 43, -0.5F, 0.2F, -1.6F, 1, 1, 3, -0.15F, false));

        this.body1 = new ModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -0.8F, 0.1F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.0494F, 0.0F, 0.0F);


        this.body3_r1 = new ModelRenderer(this);
        this.body3_r1.setRotationPoint(0.0F, -0.1576F, 4.0192F);
        this.body1.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.1222F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 38, 25, -0.5F, 0.7431F, -0.3975F, 1, 1, 4, -0.15F, false));

        this.body2_r1 = new ModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, -0.1576F, -0.0808F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, -0.0349F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 33, -0.5F, 0.6F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.6975F, 6.8519F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.6432F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 37, -0.5F, 0.2316F, -0.4634F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.009F, 2.7893F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.4266F, 0.076F, 0.0429F);
        this.tail2.cubeList.add(new ModelBox(tail2, 25, 12, -0.5F, 0.3316F, -0.0634F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0283F, 6.9994F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2159F, 0.087F, 0.0074F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.2003F, -0.5911F, 1, 1, 11, -0.15F, false));

        this.leftleg1 = new ModelRenderer(this);
        this.leftleg1.setRotationPoint(1.4601F, 0.8564F, 5.4692F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.1631F, -0.1274F, -0.4204F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1435F, 3.9933F, 0.3866F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7593F, 0.1076F, 0.3583F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0416F, 3.9665F, 0.196F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0927F, 0.0938F, 0.0177F);


        this.leftlegwing2 = new ModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.4691F, 0.092F, 0.4536F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);


        this.leftlegwing1 = new ModelRenderer(this);
        this.leftlegwing1.setRotationPoint(-0.6039F, 0.0711F, 1.1119F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1367F, 0.0F, 0.0F);


        this.rightleg1 = new ModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.4601F, 0.8564F, 5.4692F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0551F, 0.1274F, 0.4204F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1435F, 3.9933F, 0.3866F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7593F, -0.1076F, -0.3583F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.0416F, 3.9665F, 0.196F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3545F, -0.0938F, -0.0177F);


        this.rightlegwing2 = new ModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.4691F, 0.092F, 0.4536F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);


        this.rightlegwing1 = new ModelRenderer(this);
        this.rightlegwing1.setRotationPoint(0.6039F, 0.0711F, 1.1119F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1367F, 0.0F, 0.0F);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.1772F, -0.1719F, 0.0306F);


        this.neck2_r1 = new ModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0436F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 48, 7, -0.5F, -0.2F, -0.7F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4119F, -1.1294F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3352F, -0.5416F, 0.1777F);
        this.neck2.cubeList.add(new ModelBox(neck2, 45, 38, -0.5F, 0.1822F, -2.4187F, 1, 1, 3, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0178F, -2.8187F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.608F, -0.4131F, -0.5232F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0527F, -0.5388F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.7645F, -0.1879F, -1.034F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.8138F, -0.6593F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.4538F, 0.0F, 0.0F);


        this.jaw2 = new ModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.4394F, 0.3975F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw3 = new ModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new ModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.shape64 = new ModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new ModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.underneck3 = new ModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.8166F, -3.302F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.gums1 = new ModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.7166F, -1.502F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);


        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.lips1 = new ModelRenderer(this);
        this.lips1.setRotationPoint(-0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips1);
        this.setRotateAngle(lips1, 0.0025F, -0.0138F, 0.2732F);


        this.lips2 = new ModelRenderer(this);
        this.lips2.setRotationPoint(0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips2);
        this.setRotateAngle(lips2, 0.0025F, 0.0138F, -0.2732F);


        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.1559F, 0.0F, 0.0F);


        this.crest1 = new ModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -0.2568F, 4.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest2 = new ModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new ModelRenderer(this);
        this.leftwing1.setRotationPoint(2.124F, 1.508F, -1.6002F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.5466F, -1.0342F, 0.3751F);


        this.leftwing2 = new ModelRenderer(this);
        this.leftwing2.setRotationPoint(3.7463F, -0.2855F, -0.8231F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -2.0317F, 0.0853F, -2.1427F);


        this.leftwing3 = new ModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.6649F, 8.4184F, -0.4154F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.3349F, 0.2623F, 0.8907F);


        this.leftwing4 = new ModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.17F, 2.2328F, 0.3069F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.2659F, -0.5762F, -0.6295F);


        this.leftwing5 = new ModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.1226F, 0.5025F, 5.2223F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.2871F, -0.2658F, 0.1099F);


        this.leftwing6 = new ModelRenderer(this);
        this.leftwing6.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing6);
        this.setRotateAngle(leftwing6, 0.0594F, 0.0781F, 0.2095F);


        this.leftwing5membrance2 = new ModelRenderer(this);
        this.leftwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing6.addChild(leftwing5membrance2);


        this.lefthand2 = new ModelRenderer(this);
        this.lefthand2.setRotationPoint(0.1941F, -0.2764F, 0.7256F);
        this.leftwing4.addChild(lefthand2);
        this.setRotateAngle(lefthand2, -0.7055F, 0.5346F, 0.4364F);


        this.leftwing4membrance = new ModelRenderer(this);
        this.leftwing4membrance.setRotationPoint(-12.2799F, 3.7836F, 3.946F);
        this.leftwing4.addChild(leftwing4membrance);


        this.leftwing3membrance = new ModelRenderer(this);
        this.leftwing3membrance.setRotationPoint(0.5397F, 0.1609F, 0.9501F);
        this.leftwing2.addChild(leftwing3membrance);


        this.leftwing1membrance = new ModelRenderer(this);
        this.leftwing1membrance.setRotationPoint(1.3496F, 0.2368F, 2.9355F);
        this.leftwing1.addChild(leftwing1membrance);
        this.setRotateAngle(leftwing1membrance, 0.0021F, -0.3752F, -0.0093F);


        this.rightwing1 = new ModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.124F, 1.508F, -1.6002F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, 0.5466F, 1.0342F, -0.3751F);


        this.rightwing2 = new ModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.7463F, -0.2855F, -0.8231F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -2.0317F, -0.0853F, 2.1427F);


        this.rightwing3 = new ModelRenderer(this);
        this.rightwing3.setRotationPoint(0.6649F, 8.4184F, -0.4154F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.3349F, -0.2623F, -0.8907F);


        this.rightwing4 = new ModelRenderer(this);
        this.rightwing4.setRotationPoint(0.17F, 2.2328F, 0.3069F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.1662F, 0.5154F, 0.438F);


        this.rightwing5 = new ModelRenderer(this);
        this.rightwing5.setRotationPoint(0.1226F, 0.5025F, 5.2223F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.2871F, 0.2658F, -0.1099F);


        this.rightwing6 = new ModelRenderer(this);
        this.rightwing6.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing6);
        this.setRotateAngle(rightwing6, 0.0594F, -0.0781F, -0.2095F);


        this.rightwing5membrance2 = new ModelRenderer(this);
        this.rightwing5membrance2.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing6.addChild(rightwing5membrance2);


        this.righthand2 = new ModelRenderer(this);
        this.righthand2.setRotationPoint(-0.1941F, -0.2764F, 0.7256F);
        this.rightwing4.addChild(righthand2);
        this.setRotateAngle(righthand2, -0.8403F, -0.4391F, -0.335F);


        this.rightwing4membrance = new ModelRenderer(this);
        this.rightwing4membrance.setRotationPoint(12.2799F, 3.7836F, 3.946F);
        this.rightwing4.addChild(rightwing4membrance);


        this.rightwing3membrance = new ModelRenderer(this);
        this.rightwing3membrance.setRotationPoint(-0.5397F, 0.1609F, 0.9501F);
        this.rightwing2.addChild(rightwing3membrance);


        this.rightwing1membrance = new ModelRenderer(this);
        this.rightwing1membrance.setRotationPoint(-1.3496F, 0.2368F, 2.9355F);
        this.rightwing1.addChild(rightwing1membrance);
        this.setRotateAngle(rightwing1membrance, 0.0021F, 0.3752F, 0.0093F);

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
