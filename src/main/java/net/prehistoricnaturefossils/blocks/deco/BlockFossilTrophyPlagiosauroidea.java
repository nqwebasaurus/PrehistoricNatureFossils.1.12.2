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
import net.prehistoricnaturefossils.tile.TileEntityTrophyPlagiosauroidea;

import javax.annotation.Nullable;

public class BlockFossilTrophyPlagiosauroidea extends BlockSkullBase {

    public BlockFossilTrophyPlagiosauroidea() {
        setRegistryName(PrehistoricNatureFossils.MODID, "trophy_plagiosauroidea");
        setTranslationKey("pf_trophy_plagiosauroidea");
        GameRegistry.registerTileEntity(TileEntityTrophyPlagiosauroidea.class, PrehistoricNatureFossils.MODID + ":tileentitytrophy_plagiosauroidea");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        setCreativeTab(null);
    }
    
    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityTrophyPlagiosauroidea();
    }


}
