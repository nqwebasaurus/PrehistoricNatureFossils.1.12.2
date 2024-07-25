package net.prehistoricnaturefossils.items;

import net.minecraft.item.Item;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;

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
