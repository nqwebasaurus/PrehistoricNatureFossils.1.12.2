
package net.prehistoricnaturefossils.blocks.base;

import net.lepidodendron.block.base.IArchiveInvertebrate;
import net.lepidodendron.block.base.IArchivePlant;
import net.lepidodendron.block.base.IArchiveStatic;
import net.lepidodendron.block.base.IArchiveVertebrate;
import net.lepidodendron.util.IDimensionRestricted;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;
import net.prehistoricnaturefossils.FossilBlockDrops;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.items.IHasModel;
import net.prehistoricnaturefossils.tile.base.TileEntityFossilBase;
import net.prehistoricnaturefossils.triggers.CustomTrigger;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BlockSkeletonBase extends Block implements IDimensionRestricted, IHasModel, IAdvancementGranterFossil {

    public BlockSkeletonBase() {
        super(Material.ROCK);
        setSoundType(PrehistoricNatureFossils.SKELETON);
        setHardness(0.5F);
        setResistance(1.00F);
        setLightLevel(0F);
        setLightOpacity(0);
        setCreativeTab(PrehistoricNatureFossils.CREATIVE_TAB);
    }

    public abstract int stages();

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add("When completed contains " + stages() + " part(s)");
        super.addInformation(stack, player, tooltip, advanced);
    }

    public SoundEvent soundPlace() {
        return SoundEvents.ENTITY_SKELETON_STEP;
    }

    public SoundEvent soundTurn() {
        return SoundEvents.ENTITY_SKELETON_HURT;
    }

    public SoundEvent soundFrame() {
        return SoundEvents.BLOCK_METAL_PLACE;
    }

    @Nullable
    public String getDNACompat() {
        return null;
    }

    @Override
    public void registerModels() {
        PrehistoricNatureFossils.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    public int getRotation(World world, BlockPos pos) {
        int currentRotation = 0;
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity != null) {
            if (tileEntity.getTileData().hasKey("rotation")) {
                currentRotation = tileEntity.getTileData().getInteger("rotation");
            }
        }
        return currentRotation;
    }

    public int getStage(World world, BlockPos pos) {
        int currentStage = 1;
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity != null) {
            if (tileEntity.getTileData().hasKey("stage")) {
                currentStage = tileEntity.getTileData().getInteger("stage");
            }
        }
        return currentStage;
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return NULL_AABB;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
        super.eventReceived(state, worldIn, pos, eventID, eventParam);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }

    @Override
    public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
        return new ItemStack(Items.AIR, (int) (1)).getItem();
    }

    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);
        if (!world.isRemote) {
            TileEntity tileEntity = world.getTileEntity(pos);
            IBlockState blockstate = world.getBlockState(pos);
            if (tileEntity != null) {
                tileEntity.getTileData().setInteger("rotation", 0);
                tileEntity.getTileData().setInteger("stage", 1);
            }
            world.notifyBlockUpdate(pos, blockstate, blockstate, 3);}
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity te = world.getTileEntity(pos);
        if (te != null) {
            if (te instanceof TileEntityFossilBase) {
                int stages = this.getStage(world, pos);
                for (int i = 0; i < ((TileEntityFossilBase) te).dim01; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 1);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 1);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 1);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 1);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim02; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 2);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 2);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 2);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 2);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim03; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 3);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 3);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 3);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 3);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim04; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 4);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 4);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 4);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 4);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim05; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 5);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 5);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 5);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 5);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim06; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 6);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 6);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 6);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 6);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim07; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 7);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 7);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 7);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 7);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim08; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 8);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 8);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 8);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 8);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim09; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 9);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 9);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 9);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 9);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim10; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 10);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 10);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 10);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 10);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim11; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 11);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 11);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 11);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 11);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim12; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 12);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 12);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 12);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 12);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < ((TileEntityFossilBase) te).dim13; i++) {
                    stages --;
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                        stack.getTagCompound().setInteger("period", 13);
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                        stack.getTagCompound().setInteger("period", 13);
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 13);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setInteger("period", 13);
                    }
                    spawnAsEntity(world, pos, stack);
                }
                for (int i = 0; i < stages; i++) {
                    ItemStack stack = new ItemStack(this, 1);
                    if (this instanceof IArchiveVertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "vertebrate");
                    }
                    else if (this instanceof IArchiveInvertebrate) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFMob", entityNBT);
                        stack.setTagCompound(stackNBT);
                        stack.getTagCompound().setString("mobtype", "invertebrate");
                    }
                    else if (this instanceof IArchiveStatic) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFStatic", entityNBT);
                        stack.setTagCompound(stackNBT);
                    }
                    else if (this instanceof IArchivePlant) {
                        NBTTagCompound stackNBT = new NBTTagCompound();
                        NBTTagCompound entityNBT = new NBTTagCompound();
                        entityNBT.setString("id", "");
                        stackNBT.setTag("PFPlant", entityNBT);
                        stack.setTagCompound(stackNBT);
                    }
                    spawnAsEntity(world, pos, stack);
                }
            }
        }

        if (te.getTileData().hasKey("frame") && PrehistoricNatureFossils.doFrames) {
            if (te.getTileData().getBoolean("frame")) {
                spawnAsEntity(world, pos, new ItemStack(Blocks.IRON_BARS, 1));
            }
        }
        world.removeTileEntity(pos);
        super.breakBlock(world, pos, state);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity != null) {
                if (tileEntity instanceof TileEntityFossilBase) {
                    if (((TileEntityFossilBase) tileEntity).getStages() <= 1) {
                        if (placer instanceof EntityPlayerMP && getModTrigger() != null) {
                            getModTrigger().trigger((EntityPlayerMP) placer);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
        int newStage = getStage(worldIn, pos) + 1;

        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            if (tileEntity != null) {
                if (tileEntity instanceof TileEntityFossilBase) {
                    boolean hasFrame = false;
                    if (tileEntity.getTileData() != null) {
                        if (tileEntity.getTileData().hasKey("frame")) {
                            hasFrame = tileEntity.getTileData().getBoolean("frame") && PrehistoricNatureFossils.doFrames;
                        }
                    }
                    if (playerIn.getHeldItem(hand).getItem() == Item.getItemFromBlock(Blocks.IRON_BARS) && !hasFrame) {
                        tileEntity.getTileData().setBoolean("frame", true);
                        SoundEvent soundevent = this.soundFrame();
                        if (!playerIn.isCreative()) {
                            playerIn.getHeldItem(hand).shrink(1);
                        }
                        ((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        return true;
                    }
                }
            }
        }

        if (playerIn.isSneaking()) {
            if (!worldIn.isRemote) {
                TileEntity tileEntity = worldIn.getTileEntity(pos);
                if (tileEntity != null) {
                    if (tileEntity instanceof TileEntityFossilBase) {
                        boolean hasFrame = false;
                        if (tileEntity.getTileData() != null && PrehistoricNatureFossils.doFrames) {
                            if (tileEntity.getTileData().hasKey("frame")) {
                                hasFrame = tileEntity.getTileData().getBoolean("frame");
                            }
                        }
                        if (playerIn.getHeldItem(hand).isEmpty() && hasFrame) {
                            tileEntity.getTileData().setBoolean("frame", false);
                            ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(Blocks.IRON_BARS, 1));
                            return true;
                        }
                    }
                }
            }
        }

        if (playerIn.getHeldItemMainhand().getItem() == Item.getItemFromBlock(this)) {
            if (!worldIn.isRemote) {
                TileEntity tileEntity = worldIn.getTileEntity(pos);
                IBlockState blockstate = worldIn.getBlockState(pos);
                if (tileEntity != null) {
                    if (tileEntity instanceof TileEntityFossilBase) {
                        if (((TileEntityFossilBase) tileEntity).getStages() >= newStage) {
                            tileEntity.getTileData().setInteger("stage", newStage);
                            worldIn.notifyBlockUpdate(pos, blockstate, blockstate, 3);
                            SoundEvent soundevent = this.soundPlace();
                            ((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);

                            //Increment the fossil counters:
                            if (playerIn.getHeldItemMainhand().hasTagCompound()) {
                                if (playerIn.getHeldItemMainhand().getTagCompound().hasKey("period")) {
                                    switch (playerIn.getHeldItemMainhand().getTagCompound().getInteger("period")) {
                                        case 0: default:
                                            break;

                                        case 1:
                                            ((TileEntityFossilBase)tileEntity).dim01++;
                                            break;

                                        case 2:
                                            ((TileEntityFossilBase)tileEntity).dim02++;
                                            break;

                                        case 3:
                                            ((TileEntityFossilBase)tileEntity).dim03++;
                                            break;

                                        case 4:
                                            ((TileEntityFossilBase)tileEntity).dim04++;
                                            break;

                                        case 5:
                                            ((TileEntityFossilBase)tileEntity).dim05++;
                                            break;

                                        case 6:
                                            ((TileEntityFossilBase)tileEntity).dim06++;
                                            break;

                                        case 7:
                                            ((TileEntityFossilBase)tileEntity).dim07++;
                                            break;

                                        case 8:
                                            ((TileEntityFossilBase)tileEntity).dim08++;
                                            break;

                                        case 9:
                                            ((TileEntityFossilBase)tileEntity).dim09++;
                                            break;

                                        case 10:
                                            ((TileEntityFossilBase)tileEntity).dim10++;
                                            break;

                                        case 11:
                                            ((TileEntityFossilBase)tileEntity).dim11++;
                                            break;

                                        case 12:
                                            ((TileEntityFossilBase)tileEntity).dim12++;
                                            break;

                                        case 13:
                                            ((TileEntityFossilBase)tileEntity).dim13++;
                                            break;
                                    }
                                    if (!playerIn.isCreative()) {
                                        playerIn.getHeldItemMainhand().shrink(1);
                                    }
                                }
                            }

                            if (newStage == ((TileEntityFossilBase) tileEntity).getStages()) {
                                if (playerIn instanceof EntityPlayerMP && getModTrigger() != null) {
                                    getModTrigger().trigger((EntityPlayerMP) playerIn);
                                }
                            }

                            return true;
                        }
                    }
                }
            }
        }
        int newRotation = getRotation(worldIn, pos) + 15;
        if (newRotation >= 360) {newRotation = 0;}
        if (!worldIn.isRemote) {
            TileEntity tileEntity = worldIn.getTileEntity(pos);
            IBlockState blockstate = worldIn.getBlockState(pos);
            if (tileEntity != null) {
                tileEntity.getTileData().setInteger("rotation", newRotation);
            }
            worldIn.notifyBlockUpdate(pos, blockstate, blockstate, 3);
            SoundEvent soundevent = this.soundTurn();
            ((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        return true;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return null;
    }

    @Override
    public ArrayList<Integer> dimAllowed() {
        ArrayList<Integer> dimArray = new ArrayList<Integer>();
        if (Arrays.stream(FossilBlockDrops.getPrecambrianDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(1);
        }
        else if (Arrays.stream(FossilBlockDrops.getPrecambrianDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(1);
        }
        if (Arrays.stream(FossilBlockDrops.getCambrianDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(2);
        }
        else if (Arrays.stream(FossilBlockDrops.getCambrianDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(2);
        }
        if (Arrays.stream(FossilBlockDrops.getOrdovicianDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(3);
        }
        else if (Arrays.stream(FossilBlockDrops.getOrdovicianDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(3);
        }
        if (Arrays.stream(FossilBlockDrops.getSilurianDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(4);
        }
        else if (Arrays.stream(FossilBlockDrops.getSilurianDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(4);
        }
        if (Arrays.stream(FossilBlockDrops.getDevonianDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(5);
        }
        else if (Arrays.stream(FossilBlockDrops.getDevonianDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(5);
        }
        if (Arrays.stream(FossilBlockDrops.getCarboniferousDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(6);
        }
        else  if (Arrays.stream(FossilBlockDrops.getCarboniferousDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(6);
        }
        if (Arrays.stream(FossilBlockDrops.getPermianDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(7);
        }
        else if (Arrays.stream(FossilBlockDrops.getPermianDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(7);
        }
        if (Arrays.stream(FossilBlockDrops.getTriassicDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(8);
        }
        else if (Arrays.stream(FossilBlockDrops.getTriassicDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(8);
        }
        if (Arrays.stream(FossilBlockDrops.getJurassicDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(9);
        }
        else if (Arrays.stream(FossilBlockDrops.getJurassicDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(9);
        }
        if (Arrays.stream(FossilBlockDrops.getCretaceousDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(10);
        }
        else if (Arrays.stream(FossilBlockDrops.getCretaceousDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(10);
        }
        if (Arrays.stream(FossilBlockDrops.getPaleogeneDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(11);
        }
        else if (Arrays.stream(FossilBlockDrops.getPaleogeneDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(11);
        }
        if (Arrays.stream(FossilBlockDrops.getNeogeneDisplayableFossilDrops()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(12);
        }
        else if (Arrays.stream(FossilBlockDrops.getNeogeneDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(12);
        }
        if (Arrays.stream(FossilBlockDrops.getPleistoceneDisplayableFossilDrops()).anyMatch(n ->ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(13);
        }
        else if (Arrays.stream(FossilBlockDrops.getPleistoceneDisplayableFossilDropsSlabs()).anyMatch(n -> ItemStack.areItemStacksEqual(n, new ItemStack(this, 1)))) {
            dimArray.add(13);
        }

        return dimArray;
    }
}

