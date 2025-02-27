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
import net.prehistoricnaturefossils.tile.TileEntityTrophyCaseasauria;

import javax.annotation.Nullable;

public class BlockFossilTrophyCaseasauria extends BlockSkullBase {

    public BlockFossilTrophyCaseasauria() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_caseasauria");
        setTranslationKey("pf_trophy_caseasauria");
        GameRegistry.registerTileEntity(TileEntityTrophyCaseasauria.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_caseasauria");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyCaseasauria();
    }


}
