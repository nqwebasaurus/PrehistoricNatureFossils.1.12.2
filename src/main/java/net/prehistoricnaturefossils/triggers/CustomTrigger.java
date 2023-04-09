package net.prehistoricnaturefossils.triggers;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.advancements.critereon.AbstractCriterionInstance;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class CustomTrigger implements ICriterionTrigger<CustomTrigger.Instance>
{
    private final ResourceLocation RL;
    private final Map<PlayerAdvancements, Listeners> listeners = Maps.newHashMap();

    /**
     * Instantiates a new custom trigger.
     *
     * @param parString the par string
     */
    public CustomTrigger(String parString)
    {
        super();
        RL = new ResourceLocation(parString);
    }

    /**
     * Instantiates a new custom trigger.
     *
     * @param parRL the par RL
     */
    public CustomTrigger(ResourceLocation parRL)
    {
        super();
        RL = parRL;
    }

    /* (non-Javadoc)
     * @see net.minecraft.advancements.ICriterionTrigger#getId()
     */
    @Override
    public ResourceLocation getId()
    {
        return RL;
    }

    /* (non-Javadoc)
     * @see net.minecraft.advancements.ICriterionTrigger#addListener(net.minecraft.advancements.PlayerAdvancements, net.minecraft.advancements.ICriterionTrigger.Listener)
     */
    @Override
    public void addListener(PlayerAdvancements playerAdvancementsIn, Listener<Instance> listener)
    {
        Listeners myCustomTrigger$listeners = listeners.get(playerAdvancementsIn);

        if (myCustomTrigger$listeners == null)
        {
            myCustomTrigger$listeners = new Listeners(playerAdvancementsIn);
            listeners.put(playerAdvancementsIn, myCustomTrigger$listeners);
        }

        myCustomTrigger$listeners.add(listener);
    }

    /* (non-Javadoc)
     * @see net.minecraft.advancements.ICriterionTrigger#removeListener(net.minecraft.advancements.PlayerAdvancements, net.minecraft.advancements.ICriterionTrigger.Listener)
     */
    @Override
    public void removeListener(PlayerAdvancements playerAdvancementsIn, Listener<Instance> listener)
    {
        Listeners dimensiontrigger$listeners = listeners.get(playerAdvancementsIn);

        if (dimensiontrigger$listeners != null)
        {
            dimensiontrigger$listeners.remove(listener);

            if (dimensiontrigger$listeners.isEmpty())
            {
                listeners.remove(playerAdvancementsIn);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.minecraft.advancements.ICriterionTrigger#removeAllListeners(net.minecraft.advancements.PlayerAdvancements)
     */
    @Override
    public void removeAllListeners(PlayerAdvancements playerAdvancementsIn)
    {
        listeners.remove(playerAdvancementsIn);
    }

    /**
     * Deserialize a ICriterionInstance of this trigger from the data in the JSON.
     *
     * @param json the json
     * @param context the context
     * @return the tame bird trigger. instance
     */
    @Override
    public Instance deserializeInstance(JsonObject json, JsonDeserializationContext context)
    {
        return new Instance(getId());
    }

    /**
     * Trigger.
     *
     * @param parPlayer the player
     */
    public void trigger(EntityPlayerMP parPlayer)
    {
        Listeners dimensiontrigger$listeners = listeners.get(parPlayer.getAdvancements());

        if (dimensiontrigger$listeners != null)
        {
            dimensiontrigger$listeners.trigger(parPlayer);
        }
    }

    public static class Instance extends AbstractCriterionInstance
    {

        /**
         * Instantiates a new instance.
         *
         * @param parRL the par RL
         */
        public Instance(ResourceLocation parRL)
        {
            super(parRL);
        }

        /**
         * Test.
         *
         * @return true, if successful
         */
        public boolean test()
        {
            return true;
        }
    }

    static class Listeners
    {
        private final PlayerAdvancements playerAdvancements;
        private final Set<Listener<Instance>> listeners = Sets.newHashSet();

        /**
         * Instantiates a new listeners.
         *
         * @param playerAdvancementsIn the player advancements in
         */
        public Listeners(PlayerAdvancements playerAdvancementsIn)
        {
            playerAdvancements = playerAdvancementsIn;
        }

        /**
         * Checks if is empty.
         *
         * @return true, if is empty
         */
        public boolean isEmpty()
        {
            return listeners.isEmpty();
        }

        /**
         * Adds the listener.
         *
         * @param listener the listener
         */
        public void add(Listener<Instance> listener)
        {
            listeners.add(listener);
        }

        /**
         * Removes the listener.
         *
         * @param listener the listener
         */
        public void remove(Listener<Instance> listener)
        {
            listeners.remove(listener);
        }

        /**
         * Trigger.
         *
         * @param player the player
         */
        public void trigger(EntityPlayerMP player)
        {
            ArrayList<Listener<Instance>> list = null;

            for (Listener<Instance> listener : listeners)
            {
                if (listener.getCriterionInstance().test())
                {
                    if (list == null)
                    {
                        list = Lists.newArrayList();
                    }

                    list.add(listener);
                }
            }

            if (list != null)
            {
                for (Listener<Instance> listener1 : list)
                {
                    listener1.grantCriterion(playerAdvancements);
                }
            }
        }
    }
}