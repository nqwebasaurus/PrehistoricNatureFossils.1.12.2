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
            
            //start placodermi:
            boolean placodermi = true;
            advString = new String[]{"prehistoricnaturefossils:adv_bungartius","prehistoricnaturefossils:adv_bothriolepis","prehistoricnaturefossils:adv_titanichthys",
                    "prehistoricnaturefossils:adv_dunkleosteus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        placodermi = false;
                    }
                }
                if (!placodermi) {
                    break;
                }
            }
            if (placodermi) {
                ModTriggers.PLACODERMI_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end placodermi

            //start eupelycosaurs:
            boolean eupelycosaurs = true;
            advString = new String[]{"prehistoricnaturefossils:adv_dimetrodon","prehistoricnaturefossils:adv_ctenospondylus","prehistoricnaturefossils:adv_secodontosaurus",
                    "prehistoricnaturefossils:adv_edaphosaurus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        eupelycosaurs = false;
                    }
                }
                if (!eupelycosaurs) {
                    break;
                }
            }
            if (eupelycosaurs) {
                ModTriggers.EUPELYCOSAURS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end eupelycosaurs

            //start earlysynapsids:
            boolean earlysynapsids = true;
            advString = new String[]{"prehistoricnaturefossils:adv_eupelycosaurs","prehistoricnaturefossils:adv_tetraceratops","prehistoricnaturefossils:adv_ophiacodon"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        earlysynapsids = false;
                    }
                }
                if (!earlysynapsids) {
                    break;
                }
            }
            if (earlysynapsids) {
                ModTriggers.EARLYSYNAPSIDS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end earlysynapsids

            //start tapinocephalia:
            boolean tapinocephalia = true;
            advString = new String[]{"prehistoricnaturefossils:adv_moschops","prehistoricnaturefossils:adv_jonkeria","prehistoricnaturefossils:adv_criocephalosaurus","prehistoricnaturefossils:adv_estemmenosuchus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        tapinocephalia = false;
                    }
                }
                if (!tapinocephalia) {
                    break;
                }
            }
            if (tapinocephalia) {
                ModTriggers.TAPINOCEPHALIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end tapinocephalia

            //start dinocephalia:
            boolean dinocephalia = true;
            advString = new String[]{"prehistoricnaturefossils:adv_tapinocephalia","prehistoricnaturefossils:adv_deuterosaurus","prehistoricnaturefossils:adv_anteosaurus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        dinocephalia = false;
                    }
                }
                if (!dinocephalia) {
                    break;
                }
            }
            if (dinocephalia) {
                ModTriggers.DINOCEPHALIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end dinocephalia

            //start dicynodontiabig:
            boolean dicynodontiabig = true;
            advString = new String[]{"prehistoricnaturefossils:adv_rabidosaurus","prehistoricnaturefossils:adv_stahleckeria","prehistoricnaturefossils:adv_lisowicia","prehistoricnaturefossils:adv_kannemeyeria",
                    "prehistoricnaturefossils:adv_rechnisaurus","prehistoricnaturefossils:adv_placerias","prehistoricnaturefossils:adv_endothiodon"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        dicynodontiabig = false;
                    }
                }
                if (!dicynodontiabig) {
                    break;
                }
            }
            if (dicynodontiabig) {
                ModTriggers.DICYNODONTIABIG_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end dicynodontiabig

            //start Dicynodontiasmall:
            boolean Dicynodontiasmall = true;
            advString = new String[]{"prehistoricnaturefossils:adv_lystrosaurus","prehistoricnaturefossils:adv_suminia","prehistoricnaturefossils:adv_tiarajudens","prehistoricnaturefossils:adv_robertia",
                    "prehistoricnaturefossils:adv_vivaxosaurus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        Dicynodontiasmall = false;
                    }
                }
                if (!Dicynodontiasmall) {
                    break;
                }
            }
            if (Dicynodontiasmall) {
                ModTriggers.DICYNODONTIASMALL_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end Dicynodontiasmall

            //start anomodontia:
            boolean anomodontia = true;
            advString = new String[]{"prehistoricnaturefossils:adv_dicynodontiasmall","prehistoricnaturefossils:adv_dicynodontiabig"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        anomodontia = false;
                    }
                }
                if (!anomodontia) {
                    break;
                }
            }
            if (anomodontia) {
                ModTriggers.ANOMODONTIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end anomodontia

            //start biarmosuchia:
            boolean biarmosuchia = true;
            advString = new String[]{"prehistoricnaturefossils:adv_proburnetia"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        biarmosuchia = false;
                    }
                }
                if (!biarmosuchia) {
                    break;
                }
            }
            if (biarmosuchia) {
                ModTriggers.BIARMOSUCHIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end biarmosuchia

            //start caseasauria:
            boolean caseasauria = true;
            advString = new String[]{"prehistoricnaturefossils:adv_cotylorhynchus", "prehistoricnaturefossils:adv_datheosaurus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        caseasauria = false;
                    }
                }
                if (!caseasauria) {
                    break;
                }
            }
            if (caseasauria) {
                ModTriggers.CASEASAURIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end caseasauria

            //start gorgonopsians:
            boolean gorgonopsians = true;
            advString = new String[]{"prehistoricnaturefossils:adv_inostrancevia", "prehistoricnaturefossils:adv_rubidgea"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        gorgonopsians = false;
                    }
                }
                if (!gorgonopsians) {
                    break;
                }
            }
            if (gorgonopsians) {
                ModTriggers.GORGONOPSIANS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end gorgonopsians

            //start lepospondyli:
            boolean lepospondyli = true;
            advString = new String[]{"prehistoricnaturefossils:adv_diplocaulus", "prehistoricnaturefossils:adv_diplocaulusminimus", "prehistoricnaturefossils:adv_diploceraspis"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        lepospondyli = false;
                    }
                }
                if (!lepospondyli) {
                    break;
                }
            }
            if (lepospondyli) {
                ModTriggers.LEPOSPONDYLI_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end lepospondyli

            //start embolomeres:
            boolean embolomeres = true;
            advString = new String[]{"prehistoricnaturefossils:adv_pholiderpeton", "prehistoricnaturefossils:adv_anthracosaurus", "prehistoricnaturefossils:adv_proterogyrinus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        embolomeres = false;
                    }
                }
                if (!embolomeres) {
                    break;
                }
            }
            if (embolomeres) {
                ModTriggers.EMBOLOMERES_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end embolomeres

            //start salamanders:
            boolean salamanders = true;
            advString = new String[]{"prehistoricnaturefossils:adv_embolomeres", "prehistoricnaturefossils:adv_lepospondyli"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        salamanders = false;
                    }
                }
                if (!salamanders) {
                    break;
                }
            }
            if (salamanders) {
                ModTriggers.SALAMANDERS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end salamanders

            //start diadectomorphs:
            boolean diadectomorphs = true;
            advString = new String[]{"prehistoricnaturefossils:adv_diadectes", "prehistoricnaturefossils:adv_limnoscelis"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        diadectomorphs = false;
                    }
                }
                if (!diadectomorphs) {
                    break;
                }
            }
            if (diadectomorphs) {
                ModTriggers.DIADECTOMORPHS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end diadectomorphs

            //start hiseven:
            boolean hiseven = true;
            advString = new String[]{"prehistoricnaturefossils:adv_acanthostega", "prehistoricnaturefossils:adv_ichthyostega"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        hiseven = false;
                    }
                }
                if (!hiseven) {
                    break;
                }
            }
            if (hiseven) {
                ModTriggers.HISEVEN_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end hiseven

            //start finfellows:
            boolean finfellows = true;
            advString = new String[]{"prehistoricnaturefossils:adv_tiktaalik", "prehistoricnaturefossils:adv_parmastega"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        finfellows = false;
                    }
                }
                if (!finfellows) {
                    break;
                }
            }
            if (finfellows) {
                ModTriggers.FINFELLOWS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end finfellows

            //start fishapods:
            boolean fishapods = true;
            advString = new String[]{"prehistoricnaturefossils:adv_finfellows", "prehistoricnaturefossils:adv_hiseven", "prehistoricnaturefossils:adv_gaiasia", "prehistoricnaturefossils:adv_crassigyrinus", "prehistoricnaturefossils:adv_megalocephalus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        fishapods = false;
                    }
                }
                if (!fishapods) {
                    break;
                }
            }
            if (fishapods) {
                ModTriggers.FISHAPODS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end fishapods

            //start dissorophoidea:
            boolean dissorophoidea = true;
            advString = new String[]{"prehistoricnaturefossils:adv_cacops", "prehistoricnaturefossils:adv_platyhystrix"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        dissorophoidea = false;
                    }
                }
                if (!dissorophoidea) {
                    break;
                }
            }
            if (dissorophoidea) {
                ModTriggers.DISSOROPHOIDEA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end dissorophoidea

            //start plagiosauroidea:
            boolean plagiosauroidea = true;
            advString = new String[]{"prehistoricnaturefossils:adv_gerrothorax", "prehistoricnaturefossils:adv_laidleria"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        plagiosauroidea = false;
                    }
                }
                if (!plagiosauroidea) {
                    break;
                }
            }
            if (plagiosauroidea) {
                ModTriggers.PLAGIOSAUROIDEA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end plagiosauroidea

            //start trematosauria:
            boolean trematosauria = true;
            advString = new String[]{"prehistoricnaturefossils:adv_plagiosauroidea", "prehistoricnaturefossils:adv_koolasuchus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        trematosauria = false;
                    }
                }
                if (!trematosauria) {
                    break;
                }
            }
            if (trematosauria) {
                ModTriggers.TREMATOSAURIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end trematosauria

            //start archegosauridae:
            boolean archegosauridae = true;
            advString = new String[]{"prehistoricnaturefossils:adv_prionosuchus", "prehistoricnaturefossils:adv_uranocentrodon", "prehistoricnaturefossils:adv_melosaurus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        archegosauridae = false;
                    }
                }
                if (!archegosauridae) {
                    break;
                }
            }
            if (archegosauridae) {
                ModTriggers.ARCHEGOSAURIDAE_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end archegosauridae

            //start capitosauria:
            boolean capitosauria = true;
            advString = new String[]{"prehistoricnaturefossils:adv_stanocephalosaurus", "prehistoricnaturefossils:adv_mastodonsaurus"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        capitosauria = false;
                    }
                }
                if (!capitosauria) {
                    break;
                }
            }
            if (capitosauria) {
                ModTriggers.CAPITOSAURIA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end capitosauria

            //start eryopoidea:
            boolean eryopoidea = true;
            advString = new String[]{"prehistoricnaturefossils:adv_stenokranio", "prehistoricnaturefossils:adv_acanthostomatops", "prehistoricnaturefossils:adv_eryops", "prehistoricnaturefossils:adv_dasyceps"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        eryopoidea = false;
                    }
                }
                if (!eryopoidea) {
                    break;
                }
            }
            if (eryopoidea) {
                ModTriggers.ERYOPOIDEA_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end eryopoidea

            //start temnospondyli:
            boolean temnospondyli = true;
            advString = new String[]{"prehistoricnaturefossils:adv_nigerpeton", "prehistoricnaturefossils:adv_dissorophoidea", "prehistoricnaturefossils:adv_trematosauria", "prehistoricnaturefossils:adv_archegosauridae", "prehistoricnaturefossils:adv_capitosauria", "prehistoricnaturefossils:adv_eryopoidea"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        temnospondyli = false;
                    }
                }
                if (!temnospondyli) {
                    break;
                }
            }
            if (temnospondyli) {
                ModTriggers.TEMNOSPONDYLI_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end temnospondyli

            //start amphibians:
            boolean amphibians = true;
            advString = new String[]{"prehistoricnaturefossils:adv_temnospondyli", "prehistoricnaturefossils:adv_fishapods", "prehistoricnaturefossils:adv_diadectomorphs", "prehistoricnaturefossils:adv_salamanders"
            };
            for (String adv : advString) {
                Advancement advancement = advancementManager.getAdvancement(new ResourceLocation(adv));
                if (advancement != null) {
                    if (!playerMP.getAdvancements().getProgress(advancement).isDone()) {
                        amphibians = false;
                    }
                }
                if (!amphibians) {
                    break;
                }
            }
            if (amphibians) {
                ModTriggers.AMPHIBIANS_GROUP_COMPLETE.trigger((EntityPlayerMP) event.getEntityPlayer());
            }
            //end amphibians



        }
    }
}
