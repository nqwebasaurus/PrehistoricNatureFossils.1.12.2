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
import net.prehistoricnaturefossils.tile.TileEntityTrophyAetosaurs;

import javax.annotation.Nullable;

public class BlockFossilTrophyAetosaurs extends BlockSkullBase {

    public BlockFossilTrophyAetosaurs() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_aetosaurs");
        setTranslationKey("pf_trophy_aetosaurs");
        GameRegistry.registerTileEntity(TileEntityTrophyAetosaurs.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_aetosaurs");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyAetosaurs();
    }


}
