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
import net.prehistoricnaturefossils.tile.TileEntityTrophyAetosaurs2;

import javax.annotation.Nullable;

public class BlockFossilTrophyAetosaurs2 extends BlockSkullBase {

    public BlockFossilTrophyAetosaurs2() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_aetosaurs2");
        setTranslationKey("pf_trophy_aetosaurs2");
        GameRegistry.registerTileEntity(TileEntityTrophyAetosaurs2.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_aetosaurs2");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyAetosaurs2();
    }


}
