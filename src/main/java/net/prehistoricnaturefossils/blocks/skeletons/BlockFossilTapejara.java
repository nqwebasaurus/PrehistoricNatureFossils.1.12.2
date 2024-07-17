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
import net.prehistoricnaturefossils.tile.TileEntityFossilTapejara;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilTapejara extends BlockSkeletonBase {

    public BlockFossilTapejara() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_tapejara");
        setTranslationKey("pf_skeleton_tapejara");
        GameRegistry.registerTileEntity(TileEntityFossilTapejara.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_tapejara");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_tapejara";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilTapejara();
    }

    @Override
    public int stages() {
        return 5;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.TAPEJARA_COMPLETE;
    }

}
