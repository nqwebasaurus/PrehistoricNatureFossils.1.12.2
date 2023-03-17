package net.prehistoricnaturefossils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabFossils extends CreativeTabs {
    public CreativeTabFossils() {
        super("prehistoricnaturefossils");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.BONE);
    }
}