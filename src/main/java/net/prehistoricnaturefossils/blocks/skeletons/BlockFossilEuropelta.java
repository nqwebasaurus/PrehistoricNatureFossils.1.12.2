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
import net.prehistoricnaturefossils.tile.TileEntityFossilEuropelta;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilEuropelta extends BlockSkeletonBase {

    public BlockFossilEuropelta() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_europelta");
        setTranslationKey("pf_skeleton_europelta");
        GameRegistry.registerTileEntity(TileEntityFossilEuropelta.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_europelta");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_europelta";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilEuropelta();
    }

    @Override
    public int stages() {
        return 10;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.EUROPELTA_COMPLETE;
    }

}
