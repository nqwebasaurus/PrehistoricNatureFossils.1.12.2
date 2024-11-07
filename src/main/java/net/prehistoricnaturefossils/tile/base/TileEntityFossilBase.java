package net.prehistoricnaturefossils.tile.base;

import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.prehistoricnaturefossils.blocks.base.BlockSkeletonBase;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;

public abstract class TileEntityFossilBase extends TileEntity {

    public TileEntityFossilBase(){};

    public int dim01;
    public int dim02;
    public int dim03;
    public int dim04;
    public int dim05;
    public int dim06;
    public int dim07;
    public int dim08;
    public int dim09;
    public int dim10;
    public int dim11;
    public int dim12;
    public int dim13;

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.dim01 = compound.getInteger("dim01");
        this.dim02 = compound.getInteger("dim02");
        this.dim03 = compound.getInteger("dim03");
        this.dim04 = compound.getInteger("dim04");
        this.dim05 = compound.getInteger("dim05");
        this.dim06 = compound.getInteger("dim06");
        this.dim07 = compound.getInteger("dim07");
        this.dim08 = compound.getInteger("dim08");
        this.dim09 = compound.getInteger("dim09");
        this.dim10 = compound.getInteger("dim10");
        this.dim11 = compound.getInteger("dim11");
        this.dim12 = compound.getInteger("dim12");
        this.dim13 = compound.getInteger("dim13");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("dim01", this.dim01);
        compound.setInteger("dim02", this.dim02);
        compound.setInteger("dim03", this.dim03);
        compound.setInteger("dim04", this.dim04);
        compound.setInteger("dim05", this.dim05);
        compound.setInteger("dim06", this.dim06);
        compound.setInteger("dim07", this.dim07);
        compound.setInteger("dim08", this.dim08);
        compound.setInteger("dim09", this.dim09);
        compound.setInteger("dim10", this.dim10);
        compound.setInteger("dim11", this.dim11);
        compound.setInteger("dim12", this.dim12);
        compound.setInteger("dim13", this.dim13);
        return compound;
    }

    public int getStages() {
        if (this.world.getBlockState(this.pos).getBlock() instanceof BlockSlabBase) {
            return ((BlockSlabBase)this.world.getBlockState(this.pos).getBlock()).stages();
        }
        if (this.world.getBlockState(this.pos).getBlock() instanceof BlockSkeletonBase) {
            return ((BlockSkeletonBase)this.world.getBlockState(this.pos).getBlock()).stages();
        }
        return 0;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return INFINITE_EXTENT_AABB;
    }

    @Override
    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
    {
        return (oldState.getBlock() != newSate.getBlock());
    }

    @Override
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }

    @Override
    public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
        this.readFromNBT(pkt.getNbtCompound());
    }

    @Override
    public void handleUpdateTag(NBTTagCompound tag) {
        this.readFromNBT(tag);
    }

}
