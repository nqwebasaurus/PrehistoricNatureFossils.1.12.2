package net.prehistoricnaturefossils.blocks.skeletons;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSkeletonBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityFossilDunkleosteus;

import javax.annotation.Nullable;
import java.util.List;

public class BlockFossilDunkleosteus extends BlockSkeletonBase {

    public BlockFossilDunkleosteus() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_dunkleosteus");
        setTranslationKey("pf_skeleton_dunkleosteus");
        GameRegistry.registerTileEntity(TileEntityFossilDunkleosteus.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_dunkleosteus");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_dunkleosteus";
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add("When completed contains " + new TileEntityFossilDunkleosteus().getStages() + " part(s)");
        super.addInformation(stack, player, tooltip, advanced);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilDunkleosteus();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
        int newStage = getStage(worldIn, pos) + 1;
        if (playerIn.getHeldItemMainhand().getItem() == Item.getItemFromBlock(this)) {
            if (!worldIn.isRemote) {
                TileEntity tileEntity = worldIn.getTileEntity(pos);
                IBlockState blockstate = worldIn.getBlockState(pos);
                if (tileEntity != null) {
                    if (tileEntity instanceof TileEntityFossilDunkleosteus) {
                        if (((TileEntityFossilDunkleosteus) tileEntity).getStages() >= newStage) {
                            tileEntity.getTileData().setInteger("stage", newStage);
                            if (!playerIn.isCreative()) {
                                playerIn.getHeldItemMainhand().shrink(1);
                            }
                            worldIn.notifyBlockUpdate(pos, blockstate, blockstate, 3);
                            SoundEvent soundevent = this.soundPlace();
                            ((WorldServer) playerIn.getEntityWorld()).playSound(null, pos, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
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

}
