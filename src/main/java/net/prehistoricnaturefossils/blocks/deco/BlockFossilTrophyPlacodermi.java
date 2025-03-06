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
import net.prehistoricnaturefossils.tile.TileEntityTrophyPlacodermi;

import javax.annotation.Nullable;

public class BlockFossilTrophyPlacodermi extends BlockSkullBase {

    public BlockFossilTrophyPlacodermi() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_placodermi");
        setTranslationKey("pf_trophy_placodermi");
        GameRegistry.registerTileEntity(TileEntityTrophyPlacodermi.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_placodermi");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyPlacodermi();
    }


}
