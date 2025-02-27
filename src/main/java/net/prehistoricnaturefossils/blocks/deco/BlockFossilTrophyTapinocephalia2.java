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
import net.prehistoricnaturefossils.tile.TileEntityTrophyTapinocephalia2;

import javax.annotation.Nullable;

public class BlockFossilTrophyTapinocephalia2 extends BlockSkullBase {

    public BlockFossilTrophyTapinocephalia2() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_tapinocephalia2");
        setTranslationKey("pf_trophy_tapinocephalia2");
        GameRegistry.registerTileEntity(TileEntityTrophyTapinocephalia2.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_tapinocephalia2");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyTapinocephalia2();
    }


}
