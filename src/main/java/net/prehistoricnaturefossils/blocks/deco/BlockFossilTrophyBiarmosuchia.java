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
import net.prehistoricnaturefossils.tile.TileEntityTrophyBiarmosuchia;

import javax.annotation.Nullable;

public class BlockFossilTrophyBiarmosuchia extends BlockSkullBase {

    public BlockFossilTrophyBiarmosuchia() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_biarmosuchia");
        setTranslationKey("pf_trophy_biarmosuchia");
        GameRegistry.registerTileEntity(TileEntityTrophyBiarmosuchia.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_biarmosuchia");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyBiarmosuchia();
    }


}
