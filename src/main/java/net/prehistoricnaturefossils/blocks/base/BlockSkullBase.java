
package net.prehistoricnaturefossils.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.items.IHasModel;

import javax.annotation.Nullable;

public abstract class BlockSkullBase extends Block implements IHasModel {

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public BlockSkullBase() {
        super(Material.ROCK);
        setSoundType(SoundType.STONE);
        setHardness(1.5F);
        setResistance(6.0F);
        setLightLevel(0F);
        setLightOpacity(0);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
        setCreativeTab(PrehistoricNatureFossils.CREATIVE_TAB);
    }

    public SoundEvent soundPlace() {
        return SoundEvents.BLOCK_STONE_HIT;
    }

    public SoundEvent soundTurn() {
        return SoundEvents.BLOCK_STONE_HIT;
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
    protected net.minecraft.block.state.BlockStateContainer createBlockState() {
        return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
    }

    @Override
    public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
        return new ItemStack(this, (int) (1)).getItem();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
                                            EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);
        if (!world.isRemote) {
            TileEntity tileEntity = world.getTileEntity(pos);
            IBlockState blockstate = world.getBlockState(pos);
            if (tileEntity != null) {
                tileEntity.getTileData().setInteger("rotation", 0);
            }
            world.notifyBlockUpdate(pos, blockstate, blockstate, 3);}
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
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

}

