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
import net.prehistoricnaturefossils.tile.TileEntityTrophyGorgonopsians;

import javax.annotation.Nullable;

public class BlockFossilTrophyGorgonopsians extends BlockSkullBase {

    public BlockFossilTrophyGorgonopsians() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_gorgonopsians");
        setTranslationKey("pf_trophy_gorgonopsians");
        GameRegistry.registerTileEntity(TileEntityTrophyGorgonopsians.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_gorgonopsians");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyGorgonopsians();
    }


}
