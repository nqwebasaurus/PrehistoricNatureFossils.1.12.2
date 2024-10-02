package net.prehistoricnaturefossils.enchantments;

import net.lepidodendron.item.ItemFossilHammer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraftforge.common.util.EnumHelper;
import net.prehistoricnaturefossils.items.ItemSlabFinder;

public class Enchantments {
    public static final EnumEnchantmentType DISCERNING_COLLECTOR_TYPE = EnumHelper.addEnchantmentType("lepidodendron:discerning_collector_type", (item)->(item instanceof ItemFossilHammer.ItemToolCustom || item instanceof ItemSlabFinder));
    public static final Enchantment DISCERNING_COLLECTOR = new EnchantmentDiscerningCollector();
}
