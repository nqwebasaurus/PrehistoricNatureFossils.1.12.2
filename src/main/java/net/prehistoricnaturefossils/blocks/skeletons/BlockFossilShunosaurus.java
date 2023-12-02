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
import net.prehistoricnaturefossils.tile.TileEntityFossilShunosaurus;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilShunosaurus extends BlockSkeletonBase {

    public BlockFossilShunosaurus() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_shunosaurus");
        setTranslationKey("pf_skeleton_shunosaurus");
        GameRegistry.registerTileEntity(TileEntityFossilShunosaurus.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_shunosaurus");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_shunosaurus";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilShunosaurus();
    }

    @Override
    public int stages() {
        return 15;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.SHUNOSAURUS_COMPLETE;
    }

}
