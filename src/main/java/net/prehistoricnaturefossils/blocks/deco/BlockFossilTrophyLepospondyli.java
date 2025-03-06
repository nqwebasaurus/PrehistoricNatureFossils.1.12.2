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
import net.prehistoricnaturefossils.tile.TileEntityTrophyLepospondyli;

import javax.annotation.Nullable;

public class BlockFossilTrophyLepospondyli extends BlockSkullBase {

    public BlockFossilTrophyLepospondyli() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_lepospondyli");
        setTranslationKey("pf_trophy_lepospondyli");
        GameRegistry.registerTileEntity(TileEntityTrophyLepospondyli.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_lepospondyli");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyLepospondyli();
    }


}
