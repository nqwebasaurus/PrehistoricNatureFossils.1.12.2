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
import net.prehistoricnaturefossils.tile.TileEntityTrophyEryopoidea;

import javax.annotation.Nullable;

public class BlockFossilTrophyEryopoidea extends BlockSkullBase {

    public BlockFossilTrophyEryopoidea() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_eryopoidea");
        setTranslationKey("pf_trophy_eryopoidea");
        GameRegistry.registerTileEntity(TileEntityTrophyEryopoidea.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_eryopoidea");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyEryopoidea();
    }


}
