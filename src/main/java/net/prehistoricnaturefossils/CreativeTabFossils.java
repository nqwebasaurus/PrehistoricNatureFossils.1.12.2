package net.prehistoricnaturefossils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.prehistoricnaturefossils.blocks.base.BlockInit;

public class CreativeTabFossils extends CreativeTabs {
    public CreativeTabFossils() {
        super("prehistoricnaturefossils");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(BlockInit.FOSSIL_ANTEOSAURUS);
    }
}