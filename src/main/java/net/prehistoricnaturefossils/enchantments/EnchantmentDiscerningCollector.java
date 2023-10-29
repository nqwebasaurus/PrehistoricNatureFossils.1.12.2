package net.prehistoricnaturefossils.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;

public class EnchantmentDiscerningCollector extends Enchantment {

    public EnchantmentDiscerningCollector() {
        super(Rarity.UNCOMMON, Enchantments.DISCERNING_COLLECTOR_TYPE, new EntityEquipmentSlot[]{EntityEquipmentSlot.MAINHAND,EntityEquipmentSlot.OFFHAND});
        this.setName("pf_discerning_collector");
        this.setRegistryName(new ResourceLocation(PrehistoricNatureFossils.MODID + ":pf_discerning_collector"));
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 0;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
         return 5;
    }

    @Override
    public boolean isAllowedOnBooks()
    {
        return true;
    }

    /*
    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {
        return 15;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {
        return super.getMinEnchantability(enchantmentLevel) + 50;
    }
  */
    @Override
    public int getMaxLevel()
    {
        return 5;
    }

    @Override
    public int getMinLevel()
    {
        return 1;
    }

}
