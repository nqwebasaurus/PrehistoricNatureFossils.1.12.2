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
import net.prehistoricnaturefossils.tile.TileEntityFossilPricyclopyge;
import net.prehistoricnaturefossils.triggers.CustomTrigger;

import javax.annotation.Nullable;

public class BlockFossilPricyclopyge extends BlockSlabBase {

    public BlockFossilPricyclopyge() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_pricyclopyge");
        setTranslationKey("pf_skeleton_pricyclopyge");
        GameRegistry.registerTileEntity(TileEntityFossilPricyclopyge.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_pricyclopyge");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_pricyclopyge";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilPricyclopyge(stages());
    }

    @Override
    public int stages() {
        return 1;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return null;
    }

}
