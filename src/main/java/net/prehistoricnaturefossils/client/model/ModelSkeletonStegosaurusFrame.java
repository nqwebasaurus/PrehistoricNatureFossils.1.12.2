package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonStegosaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer main;
    private final ModelRenderer body;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Plate5;
    private final ModelRenderer backleftleg;
    private final ModelRenderer backleftleg2;
    private final ModelRenderer backleftleg3;
    private final ModelRenderer backleftleg4;
    private final ModelRenderer backrightleg;
    private final ModelRenderer backrightleg2;
    private final ModelRenderer backrightleg3;
    private final ModelRenderer backrightleg4;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Plate4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Plate8;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer plate10;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer plate11;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r7;
    private final ModelRenderer plate12;
    private final ModelRenderer plate13;
    private final ModelRenderer tail6;
    private final ModelRenderer thagomizer3;
    private final ModelRenderer thagomizer2;
    private final ModelRenderer thagomizer4;
    private final ModelRenderer thagomizer5;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer plate6;
    private final ModelRenderer Plate3;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer plate7;
    private final ModelRenderer plate2;
    private final ModelRenderer plate;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer plate9;
    private final ModelRenderer plate14;
    private final ModelRenderer plate15;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer plate17;
    private final ModelRenderer plate16;
    private final ModelRenderer neck3;
    private final ModelRenderer plate18;
    private final ModelRenderer head;
    private final ModelRenderer eye;
    private final ModelRenderer jaw;
    private final ModelRenderer frontleftleg;
    private final ModelRenderer frontleftleg2;
    private final ModelRenderer frontleftleg3;
    private final ModelRenderer frontleftleg4;
    private final ModelRenderer frontrightleg;
    private final ModelRenderer frontrightleg2;
    private final ModelRenderer frontrightleg3;
    private final ModelRenderer frontrightleg4;

    public ModelSkeletonStegosaurusFrame() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -27.775F, -12.7F, 1, 28, 1, -0.11F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -30.725F, 8.8F, 1, 31, 1, -0.11F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, -14.0F, 9.3F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -13.7F, -6.5F, -0.5F, 1, 14, 1, -0.1F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -3.7F, -8.775F, -22.0F, 1, 18, 1, -0.1F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.fossil.addChild(main);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -27.0F, 8.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.3139F, -3.369F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 3, -0.5F, 0.448F, 0.229F, 1, 1, 8, -0.1F, false));

        this.Plate5 = new ModelRenderer(this);
        this.Plate5.setRotationPoint(2.1F, -7.9376F, 0.6042F);
        this.body.addChild(Plate5);
        this.setRotateAngle(Plate5, 0.1523F, -0.0137F, 0.2127F);


        this.backleftleg = new ModelRenderer(this);
        this.backleftleg.setRotationPoint(6.0F, -0.4267F, -0.2647F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.1745F, 0.0F, 0.0F);


        this.backleftleg2 = new ModelRenderer(this);
        this.backleftleg2.setRotationPoint(0.0F, 15.6059F, -1.5642F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0873F, 0.0F, 0.0F);


        this.backleftleg3 = new ModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 9.5973F, 2.7196F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.2607F, -0.0084F, -0.0044F);


        this.backleftleg4 = new ModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.0F, 2.0114F, -1.5115F);
        this.backleftleg3.addChild(backleftleg4);
        this.setRotateAngle(backleftleg4, 0.0436F, 0.0F, 0.0F);


        this.backrightleg = new ModelRenderer(this);
        this.backrightleg.setRotationPoint(-6.0F, -0.4267F, -0.2647F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.3927F, 0.0F, 0.0F);


        this.backrightleg2 = new ModelRenderer(this);
        this.backrightleg2.setRotationPoint(0.0F, 15.6059F, -1.5642F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.7418F, 0.0F, 0.0F);


        this.backrightleg3 = new ModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 9.5973F, 2.7196F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.3054F, 0.0F, 0.0F);


        this.backrightleg4 = new ModelRenderer(this);
        this.backrightleg4.setRotationPoint(0.0F, 2.0114F, -1.5115F);
        this.backrightleg3.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.5672F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -3.4267F, 4.4353F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.088F, 0.1304F, -0.0115F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0972F, -0.1185F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 25, -0.5324F, 1.0423F, 0.398F, 1, 1, 8, -0.1F, false));

        this.Plate4 = new ModelRenderer(this);
        this.Plate4.setRotationPoint(-0.6F, -3.8392F, 4.9184F);
        this.tail.addChild(Plate4);
        this.setRotateAngle(Plate4, -0.0602F, -0.0106F, -0.1742F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4716F, 7.3995F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1355F, 0.2595F, -0.035F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.1919F, 0.0825F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 85, -0.658F, 0.821F, 0.1114F, 1, 1, 7, -0.1F, false));

        this.Plate8 = new ModelRenderer(this);
        this.Plate8.setRotationPoint(0.6F, -2.4724F, 5.984F);
        this.tail2.addChild(Plate8);
        this.setRotateAngle(Plate8, 0.0707F, 0.0106F, 0.1742F);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5116F, 6.5651F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0435F, -0.0038F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.5704F, -0.0912F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0437F, 0.0392F, 0.0017F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 88, -0.685F, 0.7254F, -0.298F, 1, 1, 7, -0.1F, false));

        this.plate10 = new ModelRenderer(this);
        this.plate10.setRotationPoint(-0.6F, -2.5733F, 4.3486F);
        this.tail3.addChild(plate10);
        this.setRotateAngle(plate10, -0.6196F, 0.0378F, -0.1681F);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, -0.097F, 5.6041F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0886F, 0.1739F, -0.0154F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.3479F, 0.8839F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.131F, 0.0303F, 0.004F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 86, -1, -0.5907F, -0.2649F, -0.2611F, 1, 1, 8, -0.1F, false));

        this.plate11 = new ModelRenderer(this);
        this.plate11.setRotationPoint(0.6F, -2.4649F, 3.4831F);
        this.tail4.addChild(plate11);
        this.setRotateAngle(plate11, -0.6196F, -0.0378F, 0.1681F);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(-0.5F, -0.2886F, 6.7385F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1314F, 0.0865F, -0.0114F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.4782F, 0.8458F, 1.2086F);
        this.tail5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0218F, 0.0261F, 0.0016F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 71, -0.5F, -0.5058F, -0.5075F, 1, 1, 9, -0.1F, false));

        this.plate12 = new ModelRenderer(this);
        this.plate12.setRotationPoint(0.1F, -1.5202F, 0.414F);
        this.tail5.addChild(plate12);
        this.setRotateAngle(plate12, -0.576F, 0.0378F, -0.1681F);


        this.plate13 = new ModelRenderer(this);
        this.plate13.setRotationPoint(1.2581F, -2.4915F, 4.1703F);
        this.tail5.addChild(plate13);
        this.setRotateAngle(plate13, -1.0123F, -0.0378F, 0.1681F);


        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.5F, -0.0086F, 8.022F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2679F, 0.2106F, -0.0573F);
        this.tail6.cubeList.add(new ModelBox(tail6, 44, 88, -0.519F, -0.1844F, 1.1251F, 1, 1, 6, -0.1F, false));

        this.thagomizer3 = new ModelRenderer(this);
        this.thagomizer3.setRotationPoint(1.0F, -1.3921F, 1.5613F);
        this.tail6.addChild(thagomizer3);
        this.setRotateAngle(thagomizer3, 0.0F, -0.2182F, -0.3054F);


        this.thagomizer2 = new ModelRenderer(this);
        this.thagomizer2.setRotationPoint(-1.0F, -1.3921F, 1.5613F);
        this.tail6.addChild(thagomizer2);
        this.setRotateAngle(thagomizer2, 0.0F, 0.2182F, 0.3054F);


        this.thagomizer4 = new ModelRenderer(this);
        this.thagomizer4.setRotationPoint(0.6F, -1.1921F, 5.2613F);
        this.tail6.addChild(thagomizer4);
        this.setRotateAngle(thagomizer4, 0.0F, -0.5236F, -0.3054F);


        this.thagomizer5 = new ModelRenderer(this);
        this.thagomizer5.setRotationPoint(-0.6F, -1.1921F, 5.2613F);
        this.tail6.addChild(thagomizer5);
        this.setRotateAngle(thagomizer5, 0.0F, 0.5236F, 0.3054F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -4.0767F, -3.0647F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0435F, 0.0038F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.1608F, -12.5096F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 38, 0.5036F, 0.9249F, -0.0665F, 1, 1, 13, -0.1F, false));

        this.plate6 = new ModelRenderer(this);
        this.plate6.setRotationPoint(2.6F, -5.9142F, -6.1223F);
        this.body2.addChild(plate6);
        this.setRotateAngle(plate6, 0.0829F, -0.0522F, 0.1666F);


        this.Plate3 = new ModelRenderer(this);
        this.Plate3.setRotationPoint(-1.6F, -4.2452F, -2.9738F);
        this.body2.addChild(Plate3);
        this.setRotateAngle(Plate3, 0.1902F, 0.0844F, -0.2481F);


        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -0.4147F, -12.1048F);
        this.body2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0876F, -0.0869F, 0.0076F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.3525F, -0.3671F);
        this.upperbody.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3403F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 30, 0.0108F, 0.8833F, -5.7879F, 1, 1, 6, -0.1F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 5.3525F, -10.3671F);
        this.upperbody.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6458F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 85, 79, 0.0108F, 1.1045F, -1.1428F, 1, 1, 7, -0.1F, false));

        this.plate7 = new ModelRenderer(this);
        this.plate7.setRotationPoint(2.1F, -1.4509F, -5.3298F);
        this.upperbody.addChild(plate7);
        this.setRotateAngle(plate7, 0.5208F, -0.0306F, 0.1287F);


        this.plate2 = new ModelRenderer(this);
        this.plate2.setRotationPoint(-1.6F, -3.4509F, -0.3298F);
        this.upperbody.addChild(plate2);
        this.setRotateAngle(plate2, 0.3011F, 0.0522F, -0.1666F);


        this.plate = new ModelRenderer(this);
        this.plate.setRotationPoint(-0.6F, 2.5403F, -10.6574F);
        this.upperbody.addChild(plate);
        this.setRotateAngle(plate, 0.7375F, 0.0883F, -0.0968F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 5.8865F, -9.9576F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, 0.0447F, -0.218F, -0.0097F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 3.3903F, -4.3944F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7243F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 87, 18, -0.4895F, 0.6118F, -1.6376F, 1, 1, 7, -0.1F, false));

        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 3.8903F, -8.8444F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 109, 63, -0.4895F, 1.2145F, -0.1374F, 1, 1, 3, -0.1F, false));

        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 4.3903F, -6.9944F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 109, -0.5F, 1.0542F, -0.7085F, 1, 1, 3, -0.1F, false));

        this.plate9 = new ModelRenderer(this);
        this.plate9.setRotationPoint(1.6F, -1.1469F, -1.9347F);
        this.neck.addChild(plate9);
        this.setRotateAngle(plate9, 0.6066F, -0.0883F, 0.0968F);


        this.plate14 = new ModelRenderer(this);
        this.plate14.setRotationPoint(-0.5581F, -0.5183F, -6.6784F);
        this.neck.addChild(plate14);
        this.setRotateAngle(plate14, 0.1221F, 0.0378F, -0.1681F);


        this.plate15 = new ModelRenderer(this);
        this.plate15.setRotationPoint(1.4581F, 0.4817F, -8.6784F);
        this.neck.addChild(plate15);
        this.setRotateAngle(plate15, -0.096F, -0.0378F, 0.1681F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 4.0403F, -8.8944F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3542F, -0.4526F, -0.0409F);


        this.cube_r14 = new ModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.0617F, 1.4435F, 0.852F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1134F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 104, -0.5F, -0.493F, -4.916F, 1, 1, 5, -0.1F, false));

        this.cube_r15 = new ModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.0789F, -6.8993F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 106, 41, -0.5617F, 0.2316F, -0.499F, 1, 1, 5, -0.1F, false));

        this.plate17 = new ModelRenderer(this);
        this.plate17.setRotationPoint(0.7581F, -1.7374F, -5.1833F);
        this.neck2.addChild(plate17);
        this.setRotateAngle(plate17, -0.4887F, -0.0378F, 0.1681F);


        this.plate16 = new ModelRenderer(this);
        this.plate16.setRotationPoint(-0.7581F, -2.5874F, -3.4333F);
        this.neck2.addChild(plate16);
        this.setRotateAngle(plate16, -0.4887F, 0.0378F, -0.1681F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.3789F, -7.1493F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0565F, -0.4763F, -0.0593F);


        this.plate18 = new ModelRenderer(this);
        this.plate18.setRotationPoint(-0.7581F, -0.7321F, 1.6314F);
        this.neck3.addChild(plate18);
        this.setRotateAngle(plate18, -0.4887F, 0.0378F, -0.1681F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3393F, -2.5377F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0553F, 0.1264F, 0.0936F);


        this.eye = new ModelRenderer(this);
        this.eye.setRotationPoint(-0.775F, -0.11F, -3.441F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, -0.1745F, 0.0F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5586F, -0.1029F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.432F, 0.0F, 0.0F);


        this.frontleftleg = new ModelRenderer(this);
        this.frontleftleg.setRotationPoint(6.75F, 14.4025F, -3.6421F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.0F, -0.1745F);


        this.frontleftleg2 = new ModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.0F, 0.25F, -2.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.5236F, 0.0F, 0.0F);


        this.frontleftleg3 = new ModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.0038F, 8.2314F, 0.365F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -1.3052F, 0.045F, 0.1687F);


        this.frontleftleg4 = new ModelRenderer(this);
        this.frontleftleg4.setRotationPoint(0.0618F, 9.0964F, 0.0541F);
        this.frontleftleg3.addChild(frontleftleg4);
        this.setRotateAngle(frontleftleg4, 1.9635F, 0.0F, 0.0F);


        this.frontrightleg = new ModelRenderer(this);
        this.frontrightleg.setRotationPoint(-5.75F, 14.4025F, -3.6421F);
        this.upperbody.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, 0.0F, 0.1745F);


        this.frontrightleg2 = new ModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.0F, 0.25F, -2.75F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.48F, 0.0F, 0.0F);


        this.frontrightleg3 = new ModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0038F, 8.2314F, 0.365F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.4325F, -0.045F, -0.1687F);


        this.frontrightleg4 = new ModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-0.0618F, 9.0964F, 0.0541F);
        this.frontrightleg3.addChild(frontrightleg4);

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
