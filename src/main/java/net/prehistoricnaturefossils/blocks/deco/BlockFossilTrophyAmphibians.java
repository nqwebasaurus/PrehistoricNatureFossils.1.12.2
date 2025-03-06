package net.prehistoricnaturefossils.blocks.deco;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSkullBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityTrophyAmphibians;

import javax.annotation.Nullable;

public class BlockFossilTrophyAmphibians extends BlockSkullBase {

    public BlockFossilTrophyAmphibians() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_amphibians");
        setTranslationKey("pf_trophy_amphibians");
        GameRegistry.registerTileEntity(TileEntityTrophyAmphibians.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_amphibians");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyAmphibians();
    }


}
