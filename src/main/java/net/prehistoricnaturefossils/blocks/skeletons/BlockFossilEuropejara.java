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
import net.prehistoricnaturefossils.tile.TileEntityFossilEuropejara;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilEuropejara extends BlockSkeletonBase {

    public BlockFossilEuropejara() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_europejara");
        setTranslationKey("pf_skeleton_europejara");
        GameRegistry.registerTileEntity(TileEntityFossilEuropejara.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_europejara");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_europejara";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilEuropejara();
    }

    @Override
    public int stages() {
        return 5;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.EUROPEJARA_COMPLETE;
    }

}
