package net.prehistoricnaturefossils.blocks.slabs;

import net.lepidodendron.block.base.IArchiveInvertebrate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.items.ItemInit;
import net.prehistoricnaturefossils.tile.TileEntityFossilMobulavermis;
import net.prehistoricnaturefossils.triggers.CustomTrigger;
import net.prehistoricnaturefossils.triggers.ModTriggers;

import javax.annotation.Nullable;

public class BlockFossilMobulavermis extends BlockSlabBase implements IArchiveInvertebrate {

    public BlockFossilMobulavermis() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_mobulavermis");
        setTranslationKey("pf_skeleton_mobulavermis");
        GameRegistry.registerTileEntity(TileEntityFossilMobulavermis.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_mobulavermis");
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this) {
            @Override
            public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
                return BlockInit.onItemUseFossils(this, player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
            }
        }.setRegistryName(this.getRegistryName()));
    }
    @Nullable
    @Override
    public String getDNACompat() {
        return "mobdnaPNlepidodendron:prehistoric_flora_mobulavermis";
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityFossilMobulavermis();
    }

    @Override
    public int stages() {
        return 1;
    }

    @Nullable
    @Override
    public CustomTrigger getModTrigger() {
        return ModTriggers.MOBULAVERMIS_COMPLETE;
    }

}
