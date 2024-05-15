package net.prehistoricnaturefossils.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;
import net.prehistoricnaturefossils.blocks.base.BlockInit;
import net.prehistoricnaturefossils.blocks.base.BlockSlabBase;
import net.prehistoricnaturefossils.tile.TileEntityFossilAkmonistion;
import net.prehistoricnaturefossils.triggers.CustomTrigger;

import javax.annotation.Nullable;

public class ItemAdvancement extends Item implements IHasModel{

    public ItemAdvancement() {
        setRegistryName(PrehistoricNatureFossils.MODID, "skeleton_placeholder");
        setTranslationKey("pf_skeleton_placeholder");
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        PrehistoricNatureFossils.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
