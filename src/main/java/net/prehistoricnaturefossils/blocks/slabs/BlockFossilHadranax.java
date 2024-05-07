package net.prehistoricnaturefossils.blocks.slabs;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityFossilHadranax;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilHadranax extends BlockSlabBase {

    public BlockFossilHadranax() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_hadranax");
        setTranslationKey("pf_skeleton_hadranax");
        GameRegistry.registerTileEntity(TileEntityFossilHadranax.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_hadranax");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_hadranax";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilHadranax();
    }

    @Override
    public int stages() {
        return 1;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.HADRANAX_COMPLETE;
    }

}
