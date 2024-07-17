package net.prehistoricnaturefossils.blocks.skeletons;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSkeletonBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityFossilMantellisaurus;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilMantellisaurus extends BlockSkeletonBase {

    public BlockFossilMantellisaurus() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_mantellisaurus");
        setTranslationKey("pf_skeleton_mantellisaurus");
        GameRegistry.registerTileEntity(TileEntityFossilMantellisaurus.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_mantellisaurus");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_mantellisaurus";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilMantellisaurus();
    }

    @Override
    public int stages() {
        return 15;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.MANTELLISAURUS_COMPLETE;
    }

}
