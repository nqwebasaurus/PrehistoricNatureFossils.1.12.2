package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEunotosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer hindlegL2;
    private final ModelRenderer hindlegL3;
    private final ModelRenderer hindlegL4;
    private final ModelRenderer hindlegL9;
    private final ModelRenderer hindlegL5;
    private final ModelRenderer hindlegL6;
    private final ModelRenderer hindlegL7;
    private final ModelRenderer hindlegL8;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r8;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer hindlegRx;
    private final ModelRenderer hindlegLx;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;
    private final ModelRenderer forelegR;
    private final ModelRenderer forelegL;
    private final ModelRenderer forelegLx;
    private final ModelRenderer forelegL2;
    private final ModelRenderer forelegLx2;
    private final ModelRenderer forelegL3;
    private final ModelRenderer forelegL5;
    private final ModelRenderer forelegLx3;
    private final ModelRenderer forelegL6;
    private final ModelRenderer forelegLx4;
    private final ModelRenderer forelegL7;
    private final ModelRenderer forelegL4;

    public ModelSkeletonEunotosaurusFrame() {
        this.textureWidth = 84;
        this.textureHeight = 84;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, -6.5F, -8.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, 0.5F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, -6.5F, -8.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1571F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, -0.5F, -3.5F, -0.5F, 1, 10, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(1.7F, -4.6F, 9.3F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2179F, 0.0113F, 1.5197F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, -0.3F, -2.5F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(1.7F, -7.5F, 9.3F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 1, -0.5F, -1.5F, -0.5F, 1, 9, 1, -0.16F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -10.4F, -1.0F);
        this.fossil.addChild(body);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3F, -9.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, -1, 43, -0.5F, 0.1F, 0.2F, 1, 1, 6, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, -3.6F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0438F, 0.0872F, -0.0038F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0154F, -0.1441F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.0167F, 0.4658F, 1, 1, 11, -0.15F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.3499F, 10.5694F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0438F, 0.1308F, -0.0057F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.2538F, 0.0872F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 43, -0.5F, 0.2F, 0.3F, 1, 1, 5, -0.15F, false));

        this.hindlegL2 = new ModelRenderer(this);
        this.hindlegL2.setRotationPoint(1.9528F, 5.0001F, 3.8184F);
        this.body3.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.4446F, 0.346F, 0.0475F);


        this.hindlegL3 = new ModelRenderer(this);
        this.hindlegL3.setRotationPoint(5.1397F, -0.7F, -0.558F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, -0.5236F, 1.9199F);


        this.hindlegL4 = new ModelRenderer(this);
        this.hindlegL4.setRotationPoint(4.4F, 0.8F, 0.2F);
        this.hindlegL3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.6981F, 0.0F, 0.0F);


        this.hindlegL9 = new ModelRenderer(this);
        this.hindlegL9.setRotationPoint(0.2F, 0.0F, 0.0F);
        this.hindlegL4.addChild(hindlegL9);
        this.setRotateAngle(hindlegL9, -2.5671F, 1.0552F, -2.2656F);


        this.hindlegL5 = new ModelRenderer(this);
        this.hindlegL5.setRotationPoint(-1.9528F, 5.0001F, 3.8184F);
        this.body3.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0519F, -0.346F, -0.0475F);


        this.hindlegL6 = new ModelRenderer(this);
        this.hindlegL6.setRotationPoint(-5.1397F, -0.7F, -0.558F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.0F, 0.0F, -1.5708F);


        this.hindlegL7 = new ModelRenderer(this);
        this.hindlegL7.setRotationPoint(-4.4F, 0.8F, 0.2F);
        this.hindlegL6.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, -0.6981F, 0.0F, 0.0F);


        this.hindlegL8 = new ModelRenderer(this);
        this.hindlegL8.setRotationPoint(-0.2F, 0.0F, 0.0F);
        this.hindlegL7.addChild(hindlegL8);
        this.setRotateAngle(hindlegL8, 0.0F, -1.5708F, 0.0436F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.8595F, 5.3375F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.1744F, 0.043F, -0.0076F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1965F, -0.2277F);
        this.tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, -2, 31, -0.5F, 0.2F, -0.1F, 1, 1, 10, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5355F, 8.7398F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0079F, 0.2182F, 0.0017F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 25, -0.49F, 0.2085F, 0.3151F, 1, 1, 9, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1372F, 9.2582F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1749F, 0.3873F, 0.0666F);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 0, -0.5F, 0.0413F, -0.4611F, 1, 1, 9, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1487F, 8.5908F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0673F, -0.3919F, -0.0257F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 13, -0.49F, 0.1749F, -0.4008F, 1, 1, 10, -0.15F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 9, 22, -0.49F, 0.1749F, 9.2992F, 1, 1, 1, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0905F, 9.9988F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0644F, -0.6535F, -0.0392F);
        this.tail5.cubeList.add(new ModelBox(tail5, 23, 13, -0.5F, 0.2964F, -0.3143F, 1, 1, 10, -0.15F, false));

        this.hindlegRx = new ModelRenderer(this);
        this.hindlegRx.setRotationPoint(-3.0F, 3.6962F, 5.2872F);
        this.body3.addChild(hindlegRx);
        this.setRotateAngle(hindlegRx, 0.0873F, 0.0F, 0.0F);


        this.hindlegLx = new ModelRenderer(this);
        this.hindlegLx.setRotationPoint(3.0F, 3.7962F, 5.6872F);
        this.body3.addChild(hindlegLx);
        this.setRotateAngle(hindlegLx, 0.0873F, 0.0F, 0.0F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -8.4F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.2428F, -0.3448F, 0.0167F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.2748F, -3.89F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 48, -0.5F, 0.3397F, 0.0602F, 1, 1, 4, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4083F, -3.8176F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3127F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 66, 45, -0.49F, 0.0261F, -1.2928F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.2318F, -1.8405F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0367F, -0.1684F, -0.0461F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.4563F, 1.1254F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.5594F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.8966F, -0.0522F);
        this.head.addChild(upperjaw);


        this.forelegR = new ModelRenderer(this);
        this.forelegR.setRotationPoint(-3.7F, 3.9F, -7.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.48F, 0.0F);


        this.forelegL = new ModelRenderer(this);
        this.forelegL.setRotationPoint(4.0F, 4.3F, -6.6F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.48F, 0.0F);


        this.forelegLx = new ModelRenderer(this);
        this.forelegLx.setRotationPoint(-0.5541F, 0.0F, -1.0644F);
        this.forelegL.addChild(forelegLx);
        this.setRotateAngle(forelegLx, 0.0867F, -0.2737F, 0.2212F);


        this.forelegL2 = new ModelRenderer(this);
        this.forelegL2.setRotationPoint(4.3F, -0.5F, -0.1F);
        this.forelegLx.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.0F, 1.1781F);


        this.forelegLx2 = new ModelRenderer(this);
        this.forelegLx2.setRotationPoint(1.3126F, 0.3236F, -0.1347F);
        this.forelegL2.addChild(forelegLx2);
        this.setRotateAngle(forelegLx2, 0.0375F, 0.5375F, 0.1738F);


        this.forelegL3 = new ModelRenderer(this);
        this.forelegL3.setRotationPoint(4.4303F, -0.0732F, 0.3209F);
        this.forelegLx2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.2062F, 1.0735F, 0.0944F);


        this.forelegL5 = new ModelRenderer(this);
        this.forelegL5.setRotationPoint(-4.0F, 4.3F, -6.6F);
        this.body.addChild(forelegL5);
        this.setRotateAngle(forelegL5, 0.0F, 0.48F, 0.0F);


        this.forelegLx3 = new ModelRenderer(this);
        this.forelegLx3.setRotationPoint(0.5541F, 0.0F, -1.0644F);
        this.forelegL5.addChild(forelegLx3);
        this.setRotateAngle(forelegLx3, 1.0205F, -1.47F, -1.2192F);


        this.forelegL6 = new ModelRenderer(this);
        this.forelegL6.setRotationPoint(-4.3F, -0.5F, -0.1F);
        this.forelegLx3.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.0F, 0.0F, -1.1781F);


        this.forelegLx4 = new ModelRenderer(this);
        this.forelegLx4.setRotationPoint(-1.3126F, 0.3236F, -0.1347F);
        this.forelegL6.addChild(forelegLx4);
        this.setRotateAngle(forelegLx4, -1.0825F, -0.0772F, 0.0579F);


        this.forelegL7 = new ModelRenderer(this);
        this.forelegL7.setRotationPoint(-4.4303F, -0.0732F, 0.3209F);
        this.forelegLx4.addChild(forelegL7);
        this.setRotateAngle(forelegL7, 0.2062F, -1.0735F, -0.0944F);


        this.forelegL4 = new ModelRenderer(this);
        this.forelegL4.setRotationPoint(-4.0F, 4.0F, -6.6F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.0F, 0.48F, 0.0F);

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
