package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonNeuroptera extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer cube_r4;
    private final ModelRenderer antennaR;
    private final ModelRenderer antennaL;
    private final ModelRenderer abdomen;
    private final ModelRenderer hindwingL;
    private final ModelRenderer forewingL;
    private final ModelRenderer forewingR;
    private final ModelRenderer hindwingR;
    private final ModelRenderer legL1;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legR1;
    private final ModelRenderer legR2;
    private final ModelRenderer legR3;
    private final ModelRenderer body2;
    private final ModelRenderer head2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer antennaR2;
    private final ModelRenderer antennaL2;
    private final ModelRenderer abdomen2;
    private final ModelRenderer hindwingL2;
    private final ModelRenderer forewingL2;
    private final ModelRenderer forewingR2;
    private final ModelRenderer hindwingR2;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legR4;
    private final ModelRenderer legR5;
    private final ModelRenderer legR6;
    private final ModelRenderer body3;
    private final ModelRenderer head3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer antennaR3;
    private final ModelRenderer antennaL3;
    private final ModelRenderer abdomen3;
    private final ModelRenderer hindwingL3;
    private final ModelRenderer forewingL3;
    private final ModelRenderer forewingR3;
    private final ModelRenderer hindwingR3;
    private final ModelRenderer legL7;
    private final ModelRenderer legL8;
    private final ModelRenderer legL9;
    private final ModelRenderer legR7;
    private final ModelRenderer legR8;
    private final ModelRenderer legR9;
    private final ModelRenderer body4;
    private final ModelRenderer head4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer antennaR4;
    private final ModelRenderer antennaL4;
    private final ModelRenderer abdomen4;
    private final ModelRenderer hindwingL4;
    private final ModelRenderer forewingL4;
    private final ModelRenderer forewingR4;
    private final ModelRenderer hindwingR4;
    private final ModelRenderer legL10;
    private final ModelRenderer legL11;
    private final ModelRenderer legL12;
    private final ModelRenderer legR10;
    private final ModelRenderer legR11;
    private final ModelRenderer legR12;
    private final ModelRenderer body5;
    private final ModelRenderer head5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer antennaR5;
    private final ModelRenderer antennaL5;
    private final ModelRenderer abdomen5;
    private final ModelRenderer hindwingL5;
    private final ModelRenderer forewingL5;
    private final ModelRenderer forewingR5;
    private final ModelRenderer hindwingR5;
    private final ModelRenderer legL13;
    private final ModelRenderer legL14;
    private final ModelRenderer legL15;
    private final ModelRenderer legR13;
    private final ModelRenderer legR14;
    private final ModelRenderer legR15;
    private final ModelRenderer body6;
    private final ModelRenderer head6;
    private final ModelRenderer cube_r9;
    private final ModelRenderer antennaR6;
    private final ModelRenderer antennaL6;
    private final ModelRenderer abdomen6;
    private final ModelRenderer hindwingL6;
    private final ModelRenderer forewingL6;
    private final ModelRenderer forewingR6;
    private final ModelRenderer hindwingR6;
    private final ModelRenderer legL16;
    private final ModelRenderer legL17;
    private final ModelRenderer legL18;
    private final ModelRenderer legR16;
    private final ModelRenderer legR17;
    private final ModelRenderer legR18;

    public ModelSkeletonNeuroptera() {
        this.textureWidth = 288;
        this.textureHeight = 162;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 58, -33.0F, -2.01F, -37.0F, 63, 2, 60, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-25.9F, 0.0F, 41.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.885F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 44, 0.367F, -2.0F, -0.6999F, 20, 2, 11, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-11.4F, 0.0F, -44.4F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3316F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 47, -22.7459F, -2.0F, -0.0632F, 23, 2, 8, -0.003F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.3963F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -45.0F, -2.0F, -19.0F, 87, 2, 55, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(15.0F, 1.95F, -16.0F);
        this.fossil.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.5236F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 33, 31, -0.5F, -0.275F, -1.5F, 1, 0, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 47, -0.85F, -0.276F, -1.4F, 1, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 47, -0.15F, -0.277F, -1.4F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 46, 0.0F, -1.025F, -1.8F, 0, 0, 2, 0.0F, false));

        this.antennaR = new ModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, -0.2618F, 0.2618F, -0.3491F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 33, 27, 0.0F, -1.025F, -3.0F, 0, 0, 3, 0.0F, false));

        this.antennaL = new ModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, -0.2618F, -0.2618F, 0.3491F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 33, 18, 0.0F, -1.025F, -3.0F, 0, 0, 3, 0.0F, false));

        this.abdomen = new ModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body.addChild(abdomen);


        this.hindwingL = new ModelRenderer(this);
        this.hindwingL.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.1745F, 0.0F);


        this.forewingL = new ModelRenderer(this);
        this.forewingL.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 0.1745F, 0.0F);


        this.forewingR = new ModelRenderer(this);
        this.forewingR.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.1745F, 0.0F);


        this.hindwingR = new ModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.1745F, 0.0F);


        this.legL1 = new ModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.5236F, 0.0F);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 46, 0.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 45, 33, 0.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.6981F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 33, 45, 0.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR1 = new ModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.5236F, 0.0F);
        this.legR1.cubeList.add(new ModelBox(legR1, 45, 32, -3.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR2 = new ModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 45, 31, -3.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR3 = new ModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.6981F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 45, 30, -3.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 44, 62, -1.0F, -4.026F, -3.0F, 2, 0, 3, 0.0F, false));

        this.head2 = new ModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body2.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 33, 22, -0.5F, -0.275F, -1.5F, 1, 0, 2, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 46, 45, -0.85F, -0.276F, -1.4F, 1, 0, 1, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 46, 43, -0.15F, -0.277F, -1.4F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 27, 0.0F, -1.025F, -1.8F, 0, 0, 2, 0.0F, false));

        this.antennaR2 = new ModelRenderer(this);
        this.antennaR2.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head2.addChild(antennaR2);
        this.setRotateAngle(antennaR2, -0.2618F, 0.2618F, -0.3491F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 33, 9, 0.0F, -1.025F, -3.0F, 0, 0, 3, 0.0F, false));

        this.antennaL2 = new ModelRenderer(this);
        this.antennaL2.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head2.addChild(antennaL2);
        this.setRotateAngle(antennaL2, -0.2618F, -0.2618F, 0.3491F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 33, 0, 0.0F, -1.025F, -3.0F, 0, 0, 3, 0.0F, false));

        this.abdomen2 = new ModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body2.addChild(abdomen2);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 34, 35, -1.0F, -0.124F, 0.0F, 2, 0, 7, 0.0F, false));

        this.hindwingL2 = new ModelRenderer(this);
        this.hindwingL2.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body2.addChild(hindwingL2);
        this.setRotateAngle(hindwingL2, 0.0F, -0.1745F, 0.0F);
        this.hindwingL2.cubeList.add(new ModelBox(hindwingL2, 115, 131, 0.0F, -0.225F, -1.0F, 12, 0, 8, 0.0F, false));

        this.forewingL2 = new ModelRenderer(this);
        this.forewingL2.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body2.addChild(forewingL2);
        this.setRotateAngle(forewingL2, 0.0F, 0.1745F, 0.0F);
        this.forewingL2.cubeList.add(new ModelBox(forewingL2, 82, 130, 0.0F, -0.024F, -5.0F, 12, 0, 8, 0.0F, false));

        this.forewingR2 = new ModelRenderer(this);
        this.forewingR2.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body2.addChild(forewingR2);
        this.setRotateAngle(forewingR2, 0.0F, -0.1745F, 0.0F);
        this.forewingR2.cubeList.add(new ModelBox(forewingR2, 41, 130, -12.0F, -0.024F, -5.0F, 12, 0, 8, 0.0F, false));

        this.hindwingR2 = new ModelRenderer(this);
        this.hindwingR2.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body2.addChild(hindwingR2);
        this.setRotateAngle(hindwingR2, 0.0F, 0.1745F, 0.0F);
        this.hindwingR2.cubeList.add(new ModelBox(hindwingR2, 0, 130, -12.0F, -0.225F, -1.0F, 12, 0, 8, 0.0F, false));

        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.5236F, 0.0F);
        this.legL4.cubeList.add(new ModelBox(legL4, 45, 24, 0.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body2.addChild(legL5);
        this.legL5.cubeList.add(new ModelBox(legL5, 45, 23, 0.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body2.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, -0.6981F, 0.0F);
        this.legL6.cubeList.add(new ModelBox(legL6, 45, 22, 0.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR4 = new ModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body2.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.5236F, 0.0F);
        this.legR4.cubeList.add(new ModelBox(legR4, 45, 21, -3.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR5 = new ModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body2.addChild(legR5);
        this.legR5.cubeList.add(new ModelBox(legR5, 45, 15, -3.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR6 = new ModelRenderer(this);
        this.legR6.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body2.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.6981F, 0.0F);
        this.legR6.cubeList.add(new ModelBox(legR6, 45, 14, -3.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.6981F, 0.0F);


        this.head3 = new ModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body3.addChild(head3);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 18, 32.0429F, 12.0565F, 11.2815F, 0, 0, 2, 0.0F, false));

        this.antennaR3 = new ModelRenderer(this);
        this.antennaR3.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head3.addChild(antennaR3);
        this.setRotateAngle(antennaR3, -0.2618F, 0.2618F, -0.3491F);
        this.antennaR3.cubeList.add(new ModelBox(antennaR3, 0, 31, 24.2964F, 2.9189F, 24.6248F, 0, 0, 3, 0.0F, false));

        this.antennaL3 = new ModelRenderer(this);
        this.antennaL3.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head3.addChild(antennaL3);
        this.setRotateAngle(antennaL3, -0.2618F, -0.2618F, 0.3491F);
        this.antennaL3.cubeList.add(new ModelBox(antennaL3, 0, 27, 33.8727F, -14.2189F, 3.8966F, 0, 0, 3, 0.0F, false));

        this.abdomen3 = new ModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body3.addChild(abdomen3);


        this.hindwingL3 = new ModelRenderer(this);
        this.hindwingL3.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body3.addChild(hindwingL3);
        this.setRotateAngle(hindwingL3, 0.0F, -0.1745F, 0.0F);


        this.forewingL3 = new ModelRenderer(this);
        this.forewingL3.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body3.addChild(forewingL3);
        this.setRotateAngle(forewingL3, 0.0F, 0.1745F, 0.0F);
        this.forewingL3.cubeList.add(new ModelBox(forewingL3, 82, 121, 28.3436F, -0.024F, 18.7831F, 12, 0, 8, 0.0F, false));

        this.forewingR3 = new ModelRenderer(this);
        this.forewingR3.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body3.addChild(forewingR3);
        this.setRotateAngle(forewingR3, 0.0F, -0.1745F, 0.0F);


        this.hindwingR3 = new ModelRenderer(this);
        this.hindwingR3.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body3.addChild(hindwingR3);
        this.setRotateAngle(hindwingR3, 0.0F, 0.1745F, 0.0F);


        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body3.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.5236F, 0.0F);
        this.legL7.cubeList.add(new ModelBox(legL7, 45, 13, 18.5F, 0.0F, 32.0429F, 3, 0, 0, 0.0F, false));

        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body3.addChild(legL8);
        this.legL8.cubeList.add(new ModelBox(legL8, 45, 12, 32.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legL9 = new ModelRenderer(this);
        this.legL9.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body3.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, -0.6981F, 0.0F);
        this.legL9.cubeList.add(new ModelBox(legL9, 45, 11, 36.4379F, 0.0F, -6.425F, 3, 0, 0, 0.0F, false));

        this.legR7 = new ModelRenderer(this);
        this.legR7.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body3.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, -0.5236F, 0.0F);
        this.legR7.cubeList.add(new ModelBox(legR7, 45, 10, 34.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR8 = new ModelRenderer(this);
        this.legR8.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body3.addChild(legR8);
        this.legR8.cubeList.add(new ModelBox(legR8, 45, 9, 29.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legR9 = new ModelRenderer(this);
        this.legR9.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body3.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, 0.6981F, 0.0F);
        this.legR9.cubeList.add(new ModelBox(legR9, 45, 6, 9.6547F, 0.0F, 34.7686F, 3, 0, 0, 0.0F, false));

        this.body4 = new ModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 44, 58, 31.0429F, -4.026F, 15.5F, 2, 0, 3, 0.0F, false));

        this.head4 = new ModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body4.addChild(head4);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 45, 3, 32.0429F, 12.0565F, 11.2815F, 0, 0, 2, 0.0F, false));

        this.antennaR4 = new ModelRenderer(this);
        this.antennaR4.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head4.addChild(antennaR4);
        this.setRotateAngle(antennaR4, -0.2618F, 0.2618F, -0.3491F);
        this.antennaR4.cubeList.add(new ModelBox(antennaR4, 0, 22, 24.2964F, 2.9189F, 24.6248F, 0, 0, 3, 0.0F, false));

        this.antennaL4 = new ModelRenderer(this);
        this.antennaL4.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head4.addChild(antennaL4);
        this.setRotateAngle(antennaL4, -0.2618F, -0.2618F, 0.3491F);
        this.antennaL4.cubeList.add(new ModelBox(antennaL4, 0, 18, 33.8727F, -14.2189F, 3.8966F, 0, 0, 3, 0.0F, false));

        this.abdomen4 = new ModelRenderer(this);
        this.abdomen4.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body4.addChild(abdomen4);
        this.abdomen4.cubeList.add(new ModelBox(abdomen4, 33, 18, 31.0429F, -0.124F, 18.5F, 2, 0, 7, 0.0F, false));

        this.hindwingL4 = new ModelRenderer(this);
        this.hindwingL4.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body4.addChild(hindwingL4);
        this.setRotateAngle(hindwingL4, 0.0F, -0.1745F, 0.0F);
        this.hindwingL4.cubeList.add(new ModelBox(hindwingL4, 0, 103, 34.7686F, -0.225F, 11.6547F, 12, 0, 8, 0.0F, false));

        this.forewingL4 = new ModelRenderer(this);
        this.forewingL4.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body4.addChild(forewingL4);
        this.setRotateAngle(forewingL4, 0.0F, 0.1745F, 0.0F);


        this.forewingR4 = new ModelRenderer(this);
        this.forewingR4.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body4.addChild(forewingR4);
        this.setRotateAngle(forewingR4, 0.0F, -0.1745F, 0.0F);
        this.forewingR4.cubeList.add(new ModelBox(forewingR4, 0, 85, 22.7686F, -0.024F, 7.6547F, 12, 0, 8, 0.0F, false));

        this.hindwingR4 = new ModelRenderer(this);
        this.hindwingR4.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body4.addChild(hindwingR4);
        this.setRotateAngle(hindwingR4, 0.0F, 0.1745F, 0.0F);
        this.hindwingR4.cubeList.add(new ModelBox(hindwingR4, 0, 76, 16.3436F, -0.225F, 22.7831F, 12, 0, 8, 0.0F, false));

        this.legL10 = new ModelRenderer(this);
        this.legL10.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body4.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.5236F, 0.0F);
        this.legL10.cubeList.add(new ModelBox(legL10, 45, 2, 18.5F, 0.0F, 32.0429F, 3, 0, 0, 0.0F, false));

        this.legL11 = new ModelRenderer(this);
        this.legL11.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body4.addChild(legL11);
        this.legL11.cubeList.add(new ModelBox(legL11, 45, 1, 32.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legL12 = new ModelRenderer(this);
        this.legL12.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body4.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, -0.6981F, 0.0F);
        this.legL12.cubeList.add(new ModelBox(legL12, 45, 0, 36.4379F, 0.0F, -6.425F, 3, 0, 0, 0.0F, false));

        this.legR10 = new ModelRenderer(this);
        this.legR10.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body4.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, -0.5236F, 0.0F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 45, 34.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR11 = new ModelRenderer(this);
        this.legR11.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body4.addChild(legR11);
        this.legR11.cubeList.add(new ModelBox(legR11, 33, 43, 29.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legR12 = new ModelRenderer(this);
        this.legR12.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body4.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, 0.6981F, 0.0F);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 43, 9.6547F, 0.0F, 34.7686F, 3, 0, 0, 0.0F, false));

        this.body5 = new ModelRenderer(this);
        this.body5.setRotationPoint(-10.0F, 0.0F, 66.0F);
        this.body3.addChild(body5);
        this.setRotateAngle(body5, 0.0F, 1.6581F, 0.0F);


        this.head5 = new ModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body5.addChild(head5);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 3, 40, 32.0429F, 12.0565F, 11.2815F, 0, 0, 2, 0.0F, false));

        this.antennaR5 = new ModelRenderer(this);
        this.antennaR5.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head5.addChild(antennaR5);
        this.setRotateAngle(antennaR5, -0.2618F, 0.2618F, -0.3491F);
        this.antennaR5.cubeList.add(new ModelBox(antennaR5, 0, 13, 24.2964F, 2.9189F, 24.6248F, 0, 0, 3, 0.0F, false));

        this.antennaL5 = new ModelRenderer(this);
        this.antennaL5.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head5.addChild(antennaL5);
        this.setRotateAngle(antennaL5, -0.2618F, -0.2618F, 0.3491F);
        this.antennaL5.cubeList.add(new ModelBox(antennaL5, 0, 9, 33.8727F, -14.2189F, 3.8966F, 0, 0, 3, 0.0F, false));

        this.abdomen5 = new ModelRenderer(this);
        this.abdomen5.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body5.addChild(abdomen5);


        this.hindwingL5 = new ModelRenderer(this);
        this.hindwingL5.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body5.addChild(hindwingL5);
        this.setRotateAngle(hindwingL5, 0.0F, -0.1745F, 0.0F);


        this.forewingL5 = new ModelRenderer(this);
        this.forewingL5.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body5.addChild(forewingL5);
        this.setRotateAngle(forewingL5, 0.0F, 0.1745F, 0.0F);


        this.forewingR5 = new ModelRenderer(this);
        this.forewingR5.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body5.addChild(forewingR5);
        this.setRotateAngle(forewingR5, 0.0F, -0.1745F, 0.0F);


        this.hindwingR5 = new ModelRenderer(this);
        this.hindwingR5.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body5.addChild(hindwingR5);
        this.setRotateAngle(hindwingR5, 0.0F, 0.1745F, 0.0F);


        this.legL13 = new ModelRenderer(this);
        this.legL13.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body5.addChild(legL13);
        this.setRotateAngle(legL13, 0.0F, 0.5236F, 0.0F);
        this.legL13.cubeList.add(new ModelBox(legL13, 33, 41, 18.5F, 0.0F, 32.0429F, 3, 0, 0, 0.0F, false));

        this.legL14 = new ModelRenderer(this);
        this.legL14.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body5.addChild(legL14);
        this.legL14.cubeList.add(new ModelBox(legL14, 41, 26, 32.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legL15 = new ModelRenderer(this);
        this.legL15.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body5.addChild(legL15);
        this.setRotateAngle(legL15, 0.0F, -0.6981F, 0.0F);
        this.legL15.cubeList.add(new ModelBox(legL15, 41, 17, 36.4379F, 0.0F, -6.425F, 3, 0, 0, 0.0F, false));

        this.legR13 = new ModelRenderer(this);
        this.legR13.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body5.addChild(legR13);
        this.setRotateAngle(legR13, 0.0F, -0.5236F, 0.0F);
        this.legR13.cubeList.add(new ModelBox(legR13, 41, 8, 34.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR14 = new ModelRenderer(this);
        this.legR14.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body5.addChild(legR14);
        this.legR14.cubeList.add(new ModelBox(legR14, 33, 40, 29.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legR15 = new ModelRenderer(this);
        this.legR15.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body5.addChild(legR15);
        this.setRotateAngle(legR15, 0.0F, 0.6981F, 0.0F);
        this.legR15.cubeList.add(new ModelBox(legR15, 33, 39, 9.6547F, 0.0F, 34.7686F, 3, 0, 0, 0.0F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 38, 51, 31.0429F, -4.026F, 15.5F, 2, 0, 3, 0.0F, false));

        this.head6 = new ModelRenderer(this);
        this.head6.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body6.addChild(head6);
        this.head6.cubeList.add(new ModelBox(head6, 33, 4, 31.5429F, -0.275F, 17.0F, 1, 0, 2, 0.0F, false));
        this.head6.cubeList.add(new ModelBox(head6, 36, 46, 31.1929F, -0.276F, 17.1F, 1, 0, 1, 0.0F, false));
        this.head6.cubeList.add(new ModelBox(head6, 46, 35, 31.8929F, -0.277F, 17.1F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 39, 32.0429F, 12.0565F, 11.2815F, 0, 0, 2, 0.0F, false));

        this.antennaR6 = new ModelRenderer(this);
        this.antennaR6.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head6.addChild(antennaR6);
        this.setRotateAngle(antennaR6, -0.2618F, 0.2618F, -0.3491F);
        this.antennaR6.cubeList.add(new ModelBox(antennaR6, 0, 4, 24.2964F, 2.9189F, 24.6248F, 0, 0, 3, 0.0F, false));

        this.antennaL6 = new ModelRenderer(this);
        this.antennaL6.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head6.addChild(antennaL6);
        this.setRotateAngle(antennaL6, -0.2618F, -0.2618F, 0.3491F);
        this.antennaL6.cubeList.add(new ModelBox(antennaL6, 0, 0, 33.8727F, -14.2189F, 3.8966F, 0, 0, 3, 0.0F, false));

        this.abdomen6 = new ModelRenderer(this);
        this.abdomen6.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body6.addChild(abdomen6);
        this.abdomen6.cubeList.add(new ModelBox(abdomen6, 33, 0, 31.0429F, -0.124F, 18.5F, 2, 0, 7, 0.0F, false));

        this.hindwingL6 = new ModelRenderer(this);
        this.hindwingL6.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body6.addChild(hindwingL6);
        this.setRotateAngle(hindwingL6, 0.0F, -0.1745F, 0.0F);
        this.hindwingL6.cubeList.add(new ModelBox(hindwingL6, 0, 27, 34.7686F, -0.225F, 11.6547F, 12, 0, 8, 0.0F, false));

        this.forewingL6 = new ModelRenderer(this);
        this.forewingL6.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body6.addChild(forewingL6);
        this.setRotateAngle(forewingL6, 0.0F, 0.1745F, 0.0F);
        this.forewingL6.cubeList.add(new ModelBox(forewingL6, 0, 18, 28.3436F, -0.024F, 18.7831F, 12, 0, 8, 0.0F, false));

        this.forewingR6 = new ModelRenderer(this);
        this.forewingR6.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body6.addChild(forewingR6);
        this.setRotateAngle(forewingR6, 0.0F, -0.1745F, 0.0F);
        this.forewingR6.cubeList.add(new ModelBox(forewingR6, 0, 9, 22.7686F, -0.024F, 7.6547F, 12, 0, 8, 0.0F, false));

        this.hindwingR6 = new ModelRenderer(this);
        this.hindwingR6.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body6.addChild(hindwingR6);
        this.setRotateAngle(hindwingR6, 0.0F, 0.1745F, 0.0F);
        this.hindwingR6.cubeList.add(new ModelBox(hindwingR6, 0, 0, 16.3436F, -0.225F, 22.7831F, 12, 0, 8, 0.0F, false));

        this.legL16 = new ModelRenderer(this);
        this.legL16.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body6.addChild(legL16);
        this.setRotateAngle(legL16, 0.0F, 0.5236F, 0.0F);
        this.legL16.cubeList.add(new ModelBox(legL16, 33, 38, 18.5F, 0.0F, 32.0429F, 3, 0, 0, 0.0F, false));

        this.legL17 = new ModelRenderer(this);
        this.legL17.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body6.addChild(legL17);
        this.legL17.cubeList.add(new ModelBox(legL17, 0, 38, 32.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legL18 = new ModelRenderer(this);
        this.legL18.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body6.addChild(legL18);
        this.setRotateAngle(legL18, 0.0F, -0.6981F, 0.0F);
        this.legL18.cubeList.add(new ModelBox(legL18, 33, 37, 36.4379F, 0.0F, -6.425F, 3, 0, 0, 0.0F, false));

        this.legR16 = new ModelRenderer(this);
        this.legR16.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body6.addChild(legR16);
        this.setRotateAngle(legR16, 0.0F, -0.5236F, 0.0F);
        this.legR16.cubeList.add(new ModelBox(legR16, 0, 37, 34.0F, 0.0F, 0.0F, 3, 0, 0, 0.0F, false));

        this.legR17 = new ModelRenderer(this);
        this.legR17.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body6.addChild(legR17);
        this.legR17.cubeList.add(new ModelBox(legR17, 33, 36, 29.0429F, 0.0F, 18.5F, 3, 0, 0, 0.0F, false));

        this.legR18 = new ModelRenderer(this);
        this.legR18.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body6.addChild(legR18);
        this.setRotateAngle(legR18, 0.0F, 0.6981F, 0.0F);
        this.legR18.cubeList.add(new ModelBox(legR18, 0, 36, 9.6547F, 0.0F, 34.7686F, 3, 0, 0, 0.0F, false));

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
