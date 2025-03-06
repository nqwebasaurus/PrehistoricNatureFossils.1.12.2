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
import net.prehistoricnaturefossils.tile.TileEntityTrophyPlacodermi2;

import javax.annotation.Nullable;

public class BlockFossilTrophyPlacodermi2 extends BlockSkullBase {

    public BlockFossilTrophyPlacodermi2() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_placodermi2");
        setTranslationKey("pf_trophy_placodermi2");
        GameRegistry.registerTileEntity(TileEntityTrophyPlacodermi2.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_placodermi2");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyPlacodermi2();
    }


}
