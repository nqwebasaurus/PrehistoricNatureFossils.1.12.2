package net.prehistoricnaturefossils;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.prehistoricnaturefossils.triggers.ModTriggers;

public class EventHandlers {

    @SubscribeEvent //If we grant an advancement, check if we have just completed a set:
    public void onGiveAdvancement(AdvancementEvent event) {
        if (event.getEntityPlayer().getEntityWorld().isRemote) {
            return;
        }
        AdvancementManager mgr = null;
        if (event.getEntityPlayer().getEntityWorld() instanceof WorldServer) {
            mgr = ((WorldServer)event.getEntityPlayer().getEntityWorld()).getAdvancementManager();
        }
        if (mgr == null) {
            return;
        }

        EntityPlayer player = event.getEntityPlayer();
        WorldServer worldserver = (WorldServer) player.world;
        EntityPlayerMP playerMP = (EntityPlayerMP) player;
        AdvancementManager advancementManager = worldserver.getAdvancementManager();
        String[] advString = new String[0];
        if (advancementManager != null) {

            //start aetosaurs:
            boolean aetosaurs = true;
            advString = new String[]{"prehistoricnaturefossils:adv_desmatosuchus",
                    "prehistoricnaturefossils:adv_stagonolepis"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        aetosaurs = false;
                    }
                }
                if (!aetosaurs) {
                    break;
                }
            }
            if (aetosaurs) {
                ModTriggers.AETOSAURS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end aetosaurs



        }
    }
}
