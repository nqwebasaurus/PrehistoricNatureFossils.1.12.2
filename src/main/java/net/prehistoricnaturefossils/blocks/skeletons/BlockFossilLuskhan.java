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
import net.prehistoricnaturefossils.tile.TileEntityFossilLuskhan;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilLuskhan extends BlockSkeletonBase {

    public BlockFossilLuskhan() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_luskhan");
        setTranslationKey("pf_skeleton_luskhan");
        GameRegistry.registerTileEntity(TileEntityFossilLuskhan.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_luskhan");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_luskhan";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilLuskhan();
    }

    @Override
    public int stages() {
        return 15;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.LUSKHAN_COMPLETE;
    }

}
