package net.prehistoricnaturefossils.items;

import com.google.common.collect.Multimap;
import net.lepidodendron.block.BlockFossil;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.prehistoricnaturefossils.PrehistoricNatureFossils;

import javax.annotation.Nullable;

public class ItemSlabFinder extends ItemPickaxe implements IHasModel{

    public ItemSlabFinder() {
        super(Item.ToolMaterial.IRON);
        setRegistryName(PrehistoricNatureFossils.MODID, "fossil_slabber");
        setTranslationKey("pf_fossil_slabber");
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        PrehistoricNatureFossils.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    public int getMaxDamage() {
        return 500;
    }

    @Override
    public int getItemStackLimit() {
        return 1;
    }

    @Nullable
    @Override
    public CreativeTabs getCreativeTab() {
        return TabLepidodendronMisc.tab;
    }

    @Override
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 0f, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, 0));
        }
        return multimap;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if (!worldIn.isRemote)
        {
            if (entityLiving instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) entityLiving;
                if (!player.capabilities.isCreativeMode) {
                    stack.damageItem(2, entityLiving);
                }
            }
            else {
                stack.damageItem(5, entityLiving);
            }
        }
        return (state.getBlock() instanceof BlockFossil);
    }

    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
        return 2;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (attacker instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) attacker;
            if (!player.capabilities.isCreativeMode) {
                stack.damageItem(2, attacker);
            }
        }
        else {
            stack.damageItem(2, attacker);
        }
        return true;
    }

    @Override
    public boolean isFull3D() {
        return true;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? 1.0F : this.efficiency;
    }

}
