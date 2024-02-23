package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDicranurus extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Root;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer forehead;
    private final ModelRenderer lhorn;
    private final ModelRenderer lhorn2;
    private final ModelRenderer lhorn3;
    private final ModelRenderer lhorn4;
    private final ModelRenderer lhorn9;
    private final ModelRenderer cube_r9;
    private final ModelRenderer lhorn10;
    private final ModelRenderer lhorn11;
    private final ModelRenderer lhorn12;
    private final ModelRenderer lhorn5;
    private final ModelRenderer cube_r10;
    private final ModelRenderer lhorn6;
    private final ModelRenderer lhorn7;
    private final ModelRenderer lhorn8;
    private final ModelRenderer lside5;
    private final ModelRenderer lside6;
    private final ModelRenderer lside2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer lside3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer lspikelarge2;
    private final ModelRenderer lspikelarge3;
    private final ModelRenderer lspikelarge4;
    private final ModelRenderer lside4;
    private final ModelRenderer cube_r13;
    private final ModelRenderer lside7;
    private final ModelRenderer cube_r14;
    private final ModelRenderer lspikelarge5;
    private final ModelRenderer lspikelarge6;
    private final ModelRenderer lspikelarge7;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer Body2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer lspikesmall;
    private final ModelRenderer lspikesmall2;
    private final ModelRenderer lspikesmall5;
    private final ModelRenderer lspikesmall6;
    private final ModelRenderer lspikesmall7;
    private final ModelRenderer lspikesmall8;
    private final ModelRenderer lspikesmall9;
    private final ModelRenderer lspikesmall10;
    private final ModelRenderer Body3;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer Body4;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer lspikesmall3;
    private final ModelRenderer lspikesmall4;

    public ModelSkeletonDicranurus() {
        this.textureWidth = 70;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 35, 31, -2.0F, -3.5507F, -0.3711F, 4, 3, 5, 0.0F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5892F, -1.0F, 6.3231F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 40, -4.7F, -2.0F, -4.0F, 5, 3, 4, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0234F, -0.5F, 0.242F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 29, -3.7F, -1.5F, -5.9F, 7, 2, 4, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, -0.5F, -4.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.5672F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 15, -6.3F, -0.5F, -0.9F, 6, 1, 8, -0.003F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4F, -2.0507F, 2.1289F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.7F, -0.2F, -2.2F, 3, 3, 3, 0.0F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, -1.0F);
        this.fossil.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 0, -2.0F, -2.0F, -3.0F, 4, 4, 4, 0.003F, false));

        this.Root = new ModelRenderer(this);
        this.Root.setRotationPoint(0.0F, -3.95F, -1.0F);
        this.fossil.addChild(Root);
        this.setRotateAngle(Root, -0.3578F, 0.0F, 0.0F);


        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.6933F, -1.8167F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 23, 0, -2.0F, 0.4433F, -2.5833F, 4, 1, 1, 0.0F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.35F, -0.3067F, -1.2333F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 7, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(2.35F, -0.3067F, -1.2333F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 20, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(4.0F, 1.7433F, -0.0833F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 36, 0.0F, -1.28F, -7.5F, 2, 1, 7, -0.003F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 38, 0.0F, -1.98F, -7.5F, 2, 1, 7, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 14, 1.5F, -1.58F, -7.0F, 1, 1, 6, -0.003F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 47, 1.5F, -1.98F, -7.0F, 1, 1, 6, 0.003F, false));

        this.forehead = new ModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -0.2567F, -3.1833F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, 0.3054F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 0, 7, -1.0F, -0.0076F, 0.1617F, 2, 1, 4, 0.0F, false));
        this.forehead.cubeList.add(new ModelBox(forehead, 49, 49, -2.0F, 0.1525F, 0.3525F, 4, 1, 3, 0.0F, false));

        this.lhorn = new ModelRenderer(this);
        this.lhorn.setRotationPoint(0.3F, 0.2804F, 3.5722F);
        this.forehead.addChild(lhorn);
        this.setRotateAngle(lhorn, 0.3517F, 0.6284F, 0.0327F);


        this.lhorn2 = new ModelRenderer(this);
        this.lhorn2.setRotationPoint(0.6F, 0.0F, 1.8F);
        this.lhorn.addChild(lhorn2);
        this.setRotateAngle(lhorn2, -0.3267F, -0.4948F, 0.0386F);


        this.lhorn3 = new ModelRenderer(this);
        this.lhorn3.setRotationPoint(-0.1F, 0.0F, 2.8F);
        this.lhorn2.addChild(lhorn3);
        this.setRotateAngle(lhorn3, -1.1965F, 0.2279F, -0.4919F);


        this.lhorn4 = new ModelRenderer(this);
        this.lhorn4.setRotationPoint(-0.0411F, 0.2701F, 1.6623F);
        this.lhorn3.addChild(lhorn4);
        this.setRotateAngle(lhorn4, -0.9261F, -0.1125F, -0.6279F);


        this.lhorn9 = new ModelRenderer(this);
        this.lhorn9.setRotationPoint(0.3F, 0.2804F, 3.6722F);
        this.forehead.addChild(lhorn9);
        this.setRotateAngle(lhorn9, 0.1772F, 0.6284F, 0.0327F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lhorn9.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0424F, -0.3899F, 0.141F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 45, -0.2994F, -0.1831F, 0.0944F, 4, 1, 5, 0.0F, false));

        this.lhorn10 = new ModelRenderer(this);
        this.lhorn10.setRotationPoint(0.6F, 0.0F, 1.8F);
        this.lhorn9.addChild(lhorn10);
        this.setRotateAngle(lhorn10, -0.3267F, -0.4948F, 0.0386F);


        this.lhorn11 = new ModelRenderer(this);
        this.lhorn11.setRotationPoint(-0.1F, 0.0F, 2.8F);
        this.lhorn10.addChild(lhorn11);
        this.setRotateAngle(lhorn11, -1.1965F, 0.2279F, -0.4919F);


        this.lhorn12 = new ModelRenderer(this);
        this.lhorn12.setRotationPoint(-0.0411F, 0.2701F, 1.6623F);
        this.lhorn11.addChild(lhorn12);
        this.setRotateAngle(lhorn12, -0.9261F, -0.1125F, -0.6279F);


        this.lhorn5 = new ModelRenderer(this);
        this.lhorn5.setRotationPoint(-0.3F, 0.2804F, 3.6722F);
        this.forehead.addChild(lhorn5);
        this.setRotateAngle(lhorn5, 0.1772F, -0.6284F, -0.0327F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lhorn5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0424F, 0.3899F, -0.141F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 45, -3.7006F, -0.1831F, 0.0944F, 4, 1, 5, 0.0F, true));

        this.lhorn6 = new ModelRenderer(this);
        this.lhorn6.setRotationPoint(-0.6F, 0.0F, 1.8F);
        this.lhorn5.addChild(lhorn6);
        this.setRotateAngle(lhorn6, -0.3267F, 0.4948F, -0.0386F);


        this.lhorn7 = new ModelRenderer(this);
        this.lhorn7.setRotationPoint(0.1F, 0.0F, 2.8F);
        this.lhorn6.addChild(lhorn7);
        this.setRotateAngle(lhorn7, -1.1965F, -0.2279F, 0.4919F);


        this.lhorn8 = new ModelRenderer(this);
        this.lhorn8.setRotationPoint(0.0411F, 0.2701F, 1.6623F);
        this.lhorn7.addChild(lhorn8);
        this.setRotateAngle(lhorn8, -0.9261F, 0.1125F, 0.6279F);


        this.lside5 = new ModelRenderer(this);
        this.lside5.setRotationPoint(2.0F, 0.7433F, -3.1833F);
        this.Head.addChild(lside5);
        this.setRotateAngle(lside5, 0.0F, -0.4363F, 0.0F);


        this.lside6 = new ModelRenderer(this);
        this.lside6.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.lside5.addChild(lside6);
        this.setRotateAngle(lside6, 0.0F, 0.9599F, 0.0F);


        this.lside2 = new ModelRenderer(this);
        this.lside2.setRotationPoint(1.9F, 0.5433F, -3.0833F);
        this.Head.addChild(lside2);
        this.setRotateAngle(lside2, 0.1375F, -0.2278F, 0.1934F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5512F, 0.4422F, 0.9596F);
        this.lside2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0038F, 0.0809F, 0.0496F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 15, -1.5124F, -0.395F, -1.0802F, 2, 1, 1, 0.0F, false));

        this.lside3 = new ModelRenderer(this);
        this.lside3.setRotationPoint(2.0389F, 0.9372F, -0.1206F);
        this.lside2.addChild(lside3);
        this.setRotateAngle(lside3, 0.0F, 0.8552F, 0.0F);


        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.4876F, -0.495F, 1.0802F);
        this.lside3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1567F, -0.0645F, 0.1036F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 7, -1.6575F, -0.205F, -1.2346F, 2, 1, 2, 0.0F, false));

        this.lspikelarge2 = new ModelRenderer(this);
        this.lspikelarge2.setRotationPoint(-2.0284F, -0.6675F, 2.2094F);
        this.lside3.addChild(lspikelarge2);
        this.setRotateAngle(lspikelarge2, 0.3006F, 1.2015F, -0.0991F);
        this.lspikelarge2.cubeList.add(new ModelBox(lspikelarge2, 0, 29, -2.1924F, -0.0281F, -0.6173F, 4, 0, 8, 0.0F, false));

        this.lspikelarge3 = new ModelRenderer(this);
        this.lspikelarge3.setRotationPoint(1.8076F, 0.3658F, 3.3133F);
        this.lspikelarge2.addChild(lspikelarge3);
        this.setRotateAngle(lspikelarge3, 0.0F, -0.4363F, 0.0F);


        this.lspikelarge4 = new ModelRenderer(this);
        this.lspikelarge4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lspikelarge3.addChild(lspikelarge4);
        this.setRotateAngle(lspikelarge4, 0.0F, -0.2182F, 0.0F);


        this.lside4 = new ModelRenderer(this);
        this.lside4.setRotationPoint(-1.9F, 0.5433F, -3.0833F);
        this.Head.addChild(lside4);
        this.setRotateAngle(lside4, 0.1375F, 0.2278F, -0.1934F);


        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5512F, 0.4422F, 0.9596F);
        this.lside4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0038F, -0.0809F, -0.0496F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 15, -0.4876F, -0.395F, -1.0802F, 2, 1, 1, 0.0F, true));

        this.lside7 = new ModelRenderer(this);
        this.lside7.setRotationPoint(-2.0389F, 0.9372F, -0.1206F);
        this.lside4.addChild(lside7);
        this.setRotateAngle(lside7, 0.0F, -0.8552F, 0.0F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(0.4876F, -0.495F, 1.0802F);
        this.lside7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1567F, 0.0645F, -0.1036F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 7, -0.3425F, -0.205F, -1.2346F, 2, 1, 2, 0.0F, true));

        this.lspikelarge5 = new ModelRenderer(this);
        this.lspikelarge5.setRotationPoint(2.0284F, -0.6675F, 2.2094F);
        this.lside7.addChild(lspikelarge5);
        this.setRotateAngle(lspikelarge5, 0.3006F, -1.2015F, 0.0991F);
        this.lspikelarge5.cubeList.add(new ModelBox(lspikelarge5, 0, 29, -1.8076F, -0.0281F, -0.6173F, 4, 0, 8, 0.0F, true));

        this.lspikelarge6 = new ModelRenderer(this);
        this.lspikelarge6.setRotationPoint(-1.8076F, 0.3658F, 3.3133F);
        this.lspikelarge5.addChild(lspikelarge6);
        this.setRotateAngle(lspikelarge6, 0.0F, 0.4363F, 0.0F);


        this.lspikelarge7 = new ModelRenderer(this);
        this.lspikelarge7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lspikelarge6.addChild(lspikelarge7);
        this.setRotateAngle(lspikelarge7, 0.0F, 0.2182F, 0.0F);


        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.25F, -2.0F);
        this.Root.addChild(Body);
        this.setRotateAngle(Body, 0.0873F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 36, 27, -4.0F, -0.5F, 0.0F, 8, 1, 2, 0.0F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.1F, 0.0F, 1.0F);
        this.Body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1309F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 11, -3.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, true));

        this.cube_r16 = new ModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.5F, 0.0F, -0.2F);
        this.Body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 18, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.cube_r17 = new ModelRenderer(this);
        this.cube_r17.setRotationPoint(3.1F, 0.0F, 1.0F);
        this.Body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1309F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 11, 0.0F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.cube_r18 = new ModelRenderer(this);
        this.cube_r18.setRotationPoint(2.5F, 0.0F, -0.2F);
        this.Body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 18, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.cube_r19 = new ModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.345F, 0.7F);
        this.Body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 52, -1.0F, -0.0928F, -0.6999F, 2, 1, 2, -0.003F, false));

        this.Body2 = new ModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, 0.1309F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 33, 48, -3.5F, -0.49F, 0.0F, 7, 1, 2, 0.003F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 12, 38, -1.0F, -0.48F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r20 = new ModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.5709F, 0.03F, 1.7963F);
        this.Body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0646F, -0.208F, -0.0381F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 0, -3.8531F, 0.0F, 0.0073F, 4, 0, 13, 0.0F, true));

        this.cube_r21 = new ModelRenderer(this);
        this.cube_r21.setRotationPoint(3.5709F, 0.03F, 1.7963F);
        this.Body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0646F, 0.208F, 0.0381F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 0, -0.1469F, 0.0F, 0.0073F, 4, 0, 13, 0.0F, false));

        this.cube_r22 = new ModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.345F, -1.3F);
        this.Body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0349F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 52, -1.0F, -0.0828F, 1.3001F, 2, 1, 2, 0.003F, false));

        this.lspikesmall = new ModelRenderer(this);
        this.lspikesmall.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.Body2.addChild(lspikesmall);
        this.setRotateAngle(lspikesmall, 0.0F, -0.1745F, 0.0F);


        this.lspikesmall2 = new ModelRenderer(this);
        this.lspikesmall2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.lspikesmall.addChild(lspikesmall2);
        this.setRotateAngle(lspikesmall2, 0.0F, -0.1309F, 0.0F);


        this.lspikesmall5 = new ModelRenderer(this);
        this.lspikesmall5.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.Body2.addChild(lspikesmall5);
        this.setRotateAngle(lspikesmall5, 0.0F, 0.1745F, 0.0F);


        this.lspikesmall6 = new ModelRenderer(this);
        this.lspikesmall6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.lspikesmall5.addChild(lspikesmall6);
        this.setRotateAngle(lspikesmall6, 0.0F, 0.1309F, 0.0F);


        this.lspikesmall7 = new ModelRenderer(this);
        this.lspikesmall7.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.Body2.addChild(lspikesmall7);
        this.setRotateAngle(lspikesmall7, 0.0F, -0.1745F, 0.0F);
        this.lspikesmall7.cubeList.add(new ModelBox(lspikesmall7, 45, 9, 0.0F, -0.01F, 0.0F, 7, 0, 3, 0.0F, false));

        this.lspikesmall8 = new ModelRenderer(this);
        this.lspikesmall8.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.lspikesmall7.addChild(lspikesmall8);
        this.setRotateAngle(lspikesmall8, 0.0F, -0.1309F, 0.0F);


        this.lspikesmall9 = new ModelRenderer(this);
        this.lspikesmall9.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.Body2.addChild(lspikesmall9);
        this.setRotateAngle(lspikesmall9, 0.0F, 0.1745F, 0.0F);
        this.lspikesmall9.cubeList.add(new ModelBox(lspikesmall9, 45, 9, -7.0F, -0.01F, 0.0F, 7, 0, 3, 0.0F, true));

        this.lspikesmall10 = new ModelRenderer(this);
        this.lspikesmall10.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.lspikesmall9.addChild(lspikesmall10);
        this.setRotateAngle(lspikesmall10, 0.0F, 0.1309F, 0.0F);


        this.Body3 = new ModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, 0.1309F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 49, 31, -3.5F, -0.5F, 0.0F, 7, 1, 2, 0.0F, false));

        this.cube_r23 = new ModelRenderer(this);
        this.cube_r23.setRotationPoint(-3.238F, 0.04F, 1.4475F);
        this.Body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1136F, -0.1518F, 0.0056F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -3.1373F, 0.0F, -0.583F, 4, 0, 14, 0.0F, true));

        this.cube_r24 = new ModelRenderer(this);
        this.cube_r24.setRotationPoint(3.238F, 0.04F, 1.4475F);
        this.Body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1136F, 0.1518F, -0.0056F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -0.8627F, 0.0F, -0.583F, 4, 0, 14, 0.0F, false));

        this.cube_r25 = new ModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.345F, -3.3F);
        this.Body3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 51, 23, -1.0F, -0.0928F, 3.3001F, 2, 1, 2, 0.0F, false));

        this.Body4 = new ModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.2182F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 19, -2.75F, -0.49F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 15, -0.25F, -0.49F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 23, -2.0F, -0.5F, 2.0F, 4, 1, 1, 0.0F, false));

        this.cube_r26 = new ModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.74F, 3.7947F);
        this.Body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1746F, 0.0344F, 0.0061F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 23, 3, -1.824F, 0.0F, -1.5462F, 1, 0, 3, 0.0F, true));

        this.cube_r27 = new ModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.74F, 3.7947F);
        this.Body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1746F, -0.0344F, -0.0061F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 23, 3, 0.824F, 0.0F, -1.5462F, 1, 0, 3, 0.0F, false));

        this.cube_r28 = new ModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.145F, 0.0F);
        this.Body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1571F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 25, -0.5F, -0.1151F, 1.9962F, 1, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 33, 52, -1.0F, -0.0977F, -0.0036F, 2, 1, 2, -0.003F, false));

        this.cube_r29 = new ModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.7F, -0.1F, 0.9F);
        this.Body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0999F, 0.0119F, 0.1005F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 15, -2.75F, 0.05F, -1.7F, 5, 0, 13, 0.0F, true));

        this.cube_r30 = new ModelRenderer(this);
        this.cube_r30.setRotationPoint(2.7F, -0.1F, 0.9F);
        this.Body4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0999F, -0.0119F, -0.1005F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 15, -2.25F, 0.05F, -1.7F, 5, 0, 13, 0.0F, false));

        this.lspikesmall3 = new ModelRenderer(this);
        this.lspikesmall3.setRotationPoint(-2.5F, 0.0F, 1.0F);
        this.Body.addChild(lspikesmall3);
        this.setRotateAngle(lspikesmall3, 0.0F, 0.2618F, 0.0F);


        this.lspikesmall4 = new ModelRenderer(this);
        this.lspikesmall4.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.lspikesmall3.addChild(lspikesmall4);
        this.setRotateAngle(lspikesmall4, 0.0F, 0.1309F, 0.0F);

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
