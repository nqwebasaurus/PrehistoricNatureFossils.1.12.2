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
import net.prehistoricnaturefossils.tile.TileEntityTrophyEarlysynapsids;

import javax.annotation.Nullable;

public class BlockFossilTrophyEarlysynapsids extends BlockSkullBase {

    public BlockFossilTrophyEarlysynapsids() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_earlysynapsids");
        setTranslationKey("pf_trophy_earlysynapsids");
        GameRegistry.registerTileEntity(TileEntityTrophyEarlysynapsids.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_earlysynapsids");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyEarlysynapsids();
    }


}
