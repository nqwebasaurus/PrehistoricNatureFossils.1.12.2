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
import net.prehistoricnaturefossils.tile.TileEntityFossilFalcarius;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilFalcarius extends BlockSkeletonBase {

    public BlockFossilFalcarius() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_falcarius");
        setTranslationKey("pf_skeleton_falcarius");
        GameRegistry.registerTileEntity(TileEntityFossilFalcarius.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_falcarius");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_falcarius";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilFalcarius();
    }

    @Override
    public int stages() {
        return 10;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.FALCARIUS_COMPLETE;
    }

}
