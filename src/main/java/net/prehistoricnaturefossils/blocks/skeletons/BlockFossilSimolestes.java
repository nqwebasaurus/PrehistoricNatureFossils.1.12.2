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
import net.prehistoricnaturefossils.tile.TileEntityFossilSimolestes;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilSimolestes extends BlockSkeletonBase {

    public BlockFossilSimolestes() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_simolestes");
        setTranslationKey("pf_skeleton_simolestes");
        GameRegistry.registerTileEntity(TileEntityFossilSimolestes.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_simolestes");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_simolestes";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilSimolestes();
    }

    @Override
    public int stages() {
        return 10;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.SIMOLESTES_COMPLETE;
    }

}
