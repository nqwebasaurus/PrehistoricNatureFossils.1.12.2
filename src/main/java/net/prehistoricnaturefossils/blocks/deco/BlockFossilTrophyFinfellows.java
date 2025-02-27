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
import net.prehistoricnaturefossils.tile.TileEntityTrophyFinfellows;

import javax.annotation.Nullable;

public class BlockFossilTrophyFinfellows extends BlockSkullBase {

    public BlockFossilTrophyFinfellows() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_finfellows");
        setTranslationKey("pf_trophy_finfellows");
        GameRegistry.registerTileEntity(TileEntityTrophyFinfellows.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_finfellows");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyFinfellows();
    }


}
