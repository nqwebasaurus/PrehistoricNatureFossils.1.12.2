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
import net.prehistoricnaturefossils.tile.TileEntityTrophyDinocephalia;

import javax.annotation.Nullable;

public class BlockFossilTrophyDinocephalia extends BlockSkullBase {

    public BlockFossilTrophyDinocephalia() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_dinocephalia");
        setTranslationKey("pf_trophy_dinocephalia");
        GameRegistry.registerTileEntity(TileEntityTrophyDinocephalia.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_dinocephalia");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyDinocephalia();
    }


}
