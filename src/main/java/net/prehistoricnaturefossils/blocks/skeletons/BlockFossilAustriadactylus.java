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
import net.prehistoricnaturefossils.tile.TileEntityFossilAustriadactylus;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilAustriadactylus extends BlockSkeletonBase {
    // test push
    public BlockFossilAustriadactylus() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_austriadactylus");
        setTranslationKey("pf_skeleton_austriadactylus");
        GameRegistry.registerTileEntity(TileEntityFossilAustriadactylus.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_austriadactylus");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_austriadactylus";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilAustriadactylus();
    }

    @Override
    public int stages() {
        return 5;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.AUSTRIADACTYLUS_COMPLETE;
    }

}
