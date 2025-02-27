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
import net.prehistoricnaturefossils.tile.TileEntityTrophySalamanders;

import javax.annotation.Nullable;

public class BlockFossilTrophySalamanders extends BlockSkullBase {

    public BlockFossilTrophySalamanders() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_salamanders");
        setTranslationKey("pf_trophy_salamanders");
        GameRegistry.registerTileEntity(TileEntityTrophySalamanders.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_salamanders");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophySalamanders();
    }


}
