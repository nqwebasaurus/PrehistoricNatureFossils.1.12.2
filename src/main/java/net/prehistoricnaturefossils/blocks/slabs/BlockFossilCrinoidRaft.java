//package net.prehistoricnaturefossils.blocks.slabs;
//
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemBlock;
//import net.minecraft.item.ItemStack;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.EnumFacing;
//import net.minecraft.util.EnumHand;
//import net.minecraft.util.SoundCategory;
//import net.minecraft.util.SoundEvent;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraft.world.WorldServer;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraftforge.fml.relauncher.Side;
//import net.minecraftforge.fml.relauncher.SideOnly;
//import net.prehistoricnaturefossils.PrehistoricNatureFossils;
//import net.prehistoricnaturefossils.blocks.base.BlockInit;
//import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
//import net.prehistoricnaturefossils.items.ItemInit;
//import net.prehistoricnaturefossils.tile.TileEntityFossilCrinoidRaft;
//
//import javax.annotation.Nullable;
//import java.util.List;
//
//public class BlockFossilCrinoidRaft extends BlockSlabBase {
//
//    public BlockFossilCrinoidRaft() {
//        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_crinoid_raft");
//        setTranslationKey("pf_skeleton_crinoid_raft");
//        GameRegistry.registerTileEntity(TileEntityFossilCrinoidRaft.class, PrehistoricNatureFossils.MODID + ":tileentityskeleton_crinoid_raft");
//        BlockInit.BLOCKS.add(this);
//        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
//    }
//
//    @Nullable
//    @Override
//    public String getDNACompat() {
//        return "mobdnaPNlepidodendron:prehistoric_flora_crinoid_raft";

//@Nullable
//@Override
//public TileEntity createTileEntity(World world, IBlockState state) {
//        return new TileEntityFossilCothurnocystis();
//        }
//
//@Override
//public int stages() {
//        return 1;
//        }
//
//@Nullable
//@Override
//public CustomTrigger getModTrigger() {
//        return null;
//        }
//
//}
