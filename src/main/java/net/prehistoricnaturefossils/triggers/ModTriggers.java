package net.prehistoricnaturefossils.triggers;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModTriggers

{

    public static final CustomTrigger AEGER_COMPLETE = new CustomTrigger("adv_aeger");
    public static final CustomTrigger CIURCOPTERUS_COMPLETE = new CustomTrigger("adv_ciurcopterus");
    public static final CustomTrigger SLIMONIA_COMPLETE = new CustomTrigger("adv_slimonia");
    public static final CustomTrigger DUNYU_COMPLETE = new CustomTrigger("adv_dunyu");
    public static final CustomTrigger GUIYU_COMPLETE = new CustomTrigger("adv_guiyu");
    public static final CustomTrigger PLATYCARASPIS_COMPLETE = new CustomTrigger("adv_platycaraspis");
    public static final CustomTrigger THELODUS_COMPLETE = new CustomTrigger("adv_thelodus");
    public static final CustomTrigger ANTEOSAURUS_COMPLETE = new CustomTrigger("adv_anteosaurus");
    public static final CustomTrigger ARIZONASAURUS_COMPLETE = new CustomTrigger("adv_arizonasaurus");
    public static final CustomTrigger ATOPODENTATUS_COMPLETE = new CustomTrigger("adv_atopodentatus");
    public static final CustomTrigger BUNGARTIUS_COMPLETE = new CustomTrigger("adv_bungartius");
    public static final CustomTrigger BUNOSTEGOS_COMPLETE = new CustomTrigger("adv_bunostegos");
    public static final CustomTrigger CAVIRAMUS_COMPLETE = new CustomTrigger("adv_caviramus");
    public static final CustomTrigger COTYLORHYNCHUS_COMPLETE = new CustomTrigger("adv_cotylorhynchus");
    public static final CustomTrigger CRASSIGYRINUS_COMPLETE = new CustomTrigger("adv_crassigyrinus");
    public static final CustomTrigger CYAMODUS_COMPLETE = new CustomTrigger("adv_cyamodus");
    public static final CustomTrigger CYMBOSPONDYLUS_COMPLETE = new CustomTrigger("adv_cymbospondylus");
    public static final CustomTrigger DATHEOSAURUS_COMPLETE = new CustomTrigger("adv_datheosaurus");
    public static final CustomTrigger DESMATOSUCHUS_COMPLETE = new CustomTrigger("adv_desmatosuchus");
    public static final CustomTrigger DIMETRODON_COMPLETE = new CustomTrigger("adv_dimetrodon");
    public static final CustomTrigger DIPLOCAULUS_COMPLETE = new CustomTrigger("adv_diplocaulus");
    public static final CustomTrigger DRYOSAURUS_COMPLETE = new CustomTrigger("adv_dryosaurus");
    public static final CustomTrigger DUNKLEOSTEUS_COMPLETE = new CustomTrigger("adv_dunkleosteus");
    public static final CustomTrigger EDAPHOSAURUS_COMPLETE = new CustomTrigger("adv_edaphosaurus");
    public static final CustomTrigger EFFIGIA_COMPLETE = new CustomTrigger("adv_effigia");
    public static final CustomTrigger EORHYNCHOCHELYS_COMPLETE = new CustomTrigger("adv_eorhynchochelys");
    public static final CustomTrigger ERYOPS_COMPLETE = new CustomTrigger("adv_eryops");
    public static final CustomTrigger ERYTHROSUCHUS_COMPLETE = new CustomTrigger("adv_erythrosuchus");
    public static final CustomTrigger ESTEMMENOSUCHUS_COMPLETE = new CustomTrigger("adv_estemmenosuchus");
    public static final CustomTrigger GERROTHORAX_COMPLETE = new CustomTrigger("adv_gerrothorax");
    public static final CustomTrigger HENODUS_COMPLETE = new CustomTrigger("adv_henodus");
    public static final CustomTrigger INOSTRANCEVIA_COMPLETE = new CustomTrigger("adv_inostrancevia");
    public static final CustomTrigger JONKERIA_COMPLETE = new CustomTrigger("adv_jonkeria");
    public static final CustomTrigger KENTROSAURUS_COMPLETE = new CustomTrigger("adv_kentrosaurus");
    public static final CustomTrigger LESSEMSAURUS_COMPLETE = new CustomTrigger("adv_lessemsaurus");
    public static final CustomTrigger LILIENSTERNUS_COMPLETE = new CustomTrigger("adv_liliensternus");
    public static final CustomTrigger LIMNOSCELIS_COMPLETE = new CustomTrigger("adv_limnoscelis");
    public static final CustomTrigger LISOWICIA_COMPLETE = new CustomTrigger("adv_lisowicia");
    public static final CustomTrigger LOTOSAURUS_COMPLETE = new CustomTrigger("adv_lotosaurus");
    public static final CustomTrigger LYSTROSAURUS_COMPLETE = new CustomTrigger("adv_lystrosaurus");
    public static final CustomTrigger MASTODONSAURUS_COMPLETE = new CustomTrigger("adv_mastodonsaurus");
    public static final CustomTrigger MEGALOCEPHALUS_COMPLETE = new CustomTrigger("adv_megalocephalus");
    public static final CustomTrigger MEGALOSAURUS_COMPLETE = new CustomTrigger("adv_megalosaurus");
    public static final CustomTrigger MOSCHOPS_COMPLETE = new CustomTrigger("adv_moschops");
    public static final CustomTrigger NOTHOSAURUS_COMPLETE = new CustomTrigger("adv_nothosaurus");
    public static final CustomTrigger OPHIACODON_COMPLETE = new CustomTrigger("adv_ophiacodon");
    public static final CustomTrigger OPHTHALMOSAURUS_COMPLETE = new CustomTrigger("adv_ophthalmosaurus");
    public static final CustomTrigger PHOLIDERPETON_COMPLETE = new CustomTrigger("adv_pholiderpeton");
    public static final CustomTrigger PLACODUS_COMPLETE = new CustomTrigger("adv_placodus");
    public static final CustomTrigger PLATYHYSTRIX_COMPLETE = new CustomTrigger("adv_platyhystrix");
    public static final CustomTrigger POPOSAURUS_COMPLETE = new CustomTrigger("adv_poposaurus");
    public static final CustomTrigger POSTOSUCHUS_COMPLETE = new CustomTrigger("adv_postosuchus");
    public static final CustomTrigger PRIONOSUCHUS_COMPLETE = new CustomTrigger("adv_prionosuchus");
    public static final CustomTrigger PROBURNETIA_COMPLETE = new CustomTrigger("adv_proburnetia");
    public static final CustomTrigger RUBIDGEA_COMPLETE = new CustomTrigger("adv_rubidgea");
    public static final CustomTrigger SCUTOSAURUS_COMPLETE = new CustomTrigger("adv_scutosaurus");
    public static final CustomTrigger SHONISAURUS_COMPLETE = new CustomTrigger("adv_shonisaurus");
    public static final CustomTrigger SHRINGASAURUS_COMPLETE = new CustomTrigger("adv_shringasaurus");
    public static final CustomTrigger SILESAURUS_COMPLETE = new CustomTrigger("adv_silesaurus");
    public static final CustomTrigger SMILOSUCHUS_COMPLETE = new CustomTrigger("adv_smilosuchus");
    public static final CustomTrigger SUMINIA_COMPLETE = new CustomTrigger("adv_suminia");
    public static final CustomTrigger TANYSTROPHEUS_COMPLETE = new CustomTrigger("adv_tanystropheus");
    public static final CustomTrigger TETRACERATOPS_COMPLETE = new CustomTrigger("adv_tetraceratops");
    public static final CustomTrigger THECODONTOSAURUS_COMPLETE = new CustomTrigger("adv_thecodontosaurus");
    public static final CustomTrigger TIARAJUDENS_COMPLETE = new CustomTrigger("adv_tiarajudens");
    public static final CustomTrigger TIKTAALIK_COMPLETE = new CustomTrigger("adv_tiktaalik");
    public static final CustomTrigger YINLONG_COMPLETE = new CustomTrigger("adv_yinlong");
    public static final CustomTrigger RHOMALEOSAURUS_COMPLETE = new CustomTrigger("adv_rhomaleosaurus");
    public static final CustomTrigger PROTEROSUCHUS_COMPLETE = new CustomTrigger("adv_proterosuchus");
    public static final CustomTrigger DAKOSAURUS_COMPLETE = new CustomTrigger("adv_dakosaurus");
    public static final CustomTrigger PLACERIAS_COMPLETE = new CustomTrigger("adv_placerias");
    public static final CustomTrigger PLATEOSAURUS_COMPLETE = new CustomTrigger("adv_plateosaurus");
    public static final CustomTrigger COELOPHYSIS_COMPLETE = new CustomTrigger("adv_coelophysis");
    public static final CustomTrigger ICHTHYOSTEGA_COMPLETE = new CustomTrigger("adv_ichthyostega");
    public static final CustomTrigger HERRERASAURUS_COMPLETE = new CustomTrigger("adv_herrerasaurus");
    public static final CustomTrigger BATRACHOTOMUS_COMPLETE = new CustomTrigger("adv_batrachotomus");
    public static final CustomTrigger DIADECTES_COMPLETE = new CustomTrigger("adv_diadectes");
    public static final CustomTrigger CYNOGNATHUS_COMPLETE = new CustomTrigger("adv_cynognathus");
    public static final CustomTrigger HYPERODAPEDON_COMPLETE = new CustomTrigger("adv_hyperodapedon");
    public static final CustomTrigger PROGANOCHELYS_COMPLETE = new CustomTrigger("adv_proganochelys");
    public static final CustomTrigger SILLOSUCHUS_COMPLETE = new CustomTrigger("adv_sillosuchus");
    public static final CustomTrigger XINPUSAURUS_COMPLETE = new CustomTrigger("adv_xinpusaurus");
    public static final CustomTrigger VANCLEAVEA_COMPLETE = new CustomTrigger("adv_vancleavea");
    public static final CustomTrigger TEMNODONTOSAURUS_COMPLETE = new CustomTrigger("adv_temnodontosaurus");
    public static final CustomTrigger CERATOSAURUS_COMPLETE = new CustomTrigger("adv_ceratosaurus");
    public static final CustomTrigger BOBOSAURUS_COMPLETE = new CustomTrigger("adv_bobosaurus");
    public static final CustomTrigger EURHINOSAURUS_COMPLETE = new CustomTrigger("adv_eurhinosaurus");
    public static final CustomTrigger CRYOLOPHOSAURUS_COMPLETE = new CustomTrigger("adv_cryolophosaurus");
    public static final CustomTrigger GIGANTSPINOSAURUS_COMPLETE = new CustomTrigger("adv_gigantspinosaurus");
    public static final CustomTrigger TUOJIANGOSAURUS_COMPLETE = new CustomTrigger("adv_tuojiangosaurus");
    public static final CustomTrigger STEGOSAURUS_COMPLETE = new CustomTrigger("adv_stegosaurus");
    public static final CustomTrigger HUAYANGOSAURUS_COMPLETE = new CustomTrigger("adv_huayangosaurus");
    public static final CustomTrigger EUROPASAURUS_COMPLETE = new CustomTrigger("adv_europasaurus");
    public static final CustomTrigger HUPEHSUCHUS_COMPLETE = new CustomTrigger("adv_hupehsuchus");
    public static final CustomTrigger LAIDLERIA_COMPLETE = new CustomTrigger("adv_laidleria");
    public static final CustomTrigger YUNGUISAURUS_COMPLETE = new CustomTrigger("adv_yunguisaurus");
    public static final CustomTrigger MIXOSAURUS_COMPLETE = new CustomTrigger("adv_mixosaurus");
    public static final CustomTrigger CRIOCEPHALOSAURUS_COMPLETE = new CustomTrigger("adv_criocephalosaurus");
    public static final CustomTrigger CTENOSPONDYLUS_COMPLETE = new CustomTrigger("adv_ctenospondylus");
    public static final CustomTrigger ELGINIA_COMPLETE = new CustomTrigger("adv_elginia");
    public static final CustomTrigger EUNOTOSAURUS_COMPLETE = new CustomTrigger("adv_eunotosaurus");
    public static final CustomTrigger ROBERTIA_COMPLETE = new CustomTrigger("adv_robertia");
    public static final CustomTrigger LABIDOSAURUS_COMPLETE = new CustomTrigger("adv_labidosaurus");
    public static final CustomTrigger VIVAXOSAURUS_COMPLETE = new CustomTrigger("adv_vivaxosaurus");
    public static final CustomTrigger URANOCENTRODON_COMPLETE = new CustomTrigger("adv_uranocentrodon");
    public static final CustomTrigger TORVOSAURUS_COMPLETE = new CustomTrigger("adv_torvosaurus");
    public static final CustomTrigger YANGCHUANOSAURUS_COMPLETE = new CustomTrigger("adv_yangchuanosaurus");
    public static final CustomTrigger DILOPHOSAURUS_COMPLETE = new CustomTrigger("adv_dilophosaurus");
    public static final CustomTrigger MYMOORAPELTA_COMPLETE = new CustomTrigger("adv_mymoorapelta");
    public static final CustomTrigger SINRAPTOR_COMPLETE = new CustomTrigger("adv_sinraptor");
    public static final CustomTrigger ALLOSAURUS_COMPLETE = new CustomTrigger("adv_allosaurus");
    public static final CustomTrigger LIMUSAURUS_COMPLETE = new CustomTrigger("adv_limusaurus");
    public static final CustomTrigger APATOSAURUS_COMPLETE = new CustomTrigger("adv_apatosaurus");
    public static final CustomTrigger DASYCEPS_COMPLETE = new CustomTrigger("adv_dasyceps");
    public static final CustomTrigger PRISTEROGNATHUS_COMPLETE = new CustomTrigger("adv_pristerognathus");
    public static final CustomTrigger BOTHRIOLEPIS_COMPLETE = new CustomTrigger("adv_bothriolepis");
    public static final CustomTrigger PARMASTEGA_COMPLETE = new CustomTrigger("adv_parmastega");
    public static final CustomTrigger PROCERATOSAURUS_COMPLETE = new CustomTrigger("adv_proceratosaurus");
    public static final CustomTrigger ELAPHROSAURUS_COMPLETE = new CustomTrigger("adv_elaphrosaurus");
    public static final CustomTrigger ANUROGNATHUS_COMPLETE = new CustomTrigger("adv_anurognathus");
    public static final CustomTrigger RHAMPHORHYNCHUS_COMPLETE = new CustomTrigger("adv_rhamphorhynchus");
    public static final CustomTrigger YUXISAURUS_COMPLETE = new CustomTrigger("adv_yuxisaurus");
    public static final CustomTrigger GUANLONG_COMPLETE = new CustomTrigger("adv_guanlong");
    public static final CustomTrigger CHILESAURUS_COMPLETE = new CustomTrigger("adv_chilesaurus");
    public static final CustomTrigger CAMARASAURUS_COMPLETE = new CustomTrigger("adv_camarasaurus");
    public static final CustomTrigger ADEOPAPPOSAURUS_COMPLETE = new CustomTrigger("adv_adeopapposaurus");
    public static final CustomTrigger MIRAGAIA_COMPLETE = new CustomTrigger("adv_miragaia");
    public static final CustomTrigger PTERODACTYLUS_COMPLETE = new CustomTrigger("adv_pterodactylus");
    public static final CustomTrigger COMPSOGNATHUS_COMPLETE = new CustomTrigger("adv_compsognathus");
    public static final CustomTrigger TITANICHTHYS_COMPLETE = new CustomTrigger("adv_titanichthys");
    public static final CustomTrigger CAMPTOSAURUS_COMPLETE = new CustomTrigger("adv_camptosaurus");


    public static final CustomTrigger[] TRIGGER_ARRAY = new CustomTrigger[] {
            AEGER_COMPLETE,
            SLIMONIA_COMPLETE,
            GUIYU_COMPLETE,
            THELODUS_COMPLETE,
            DUNYU_COMPLETE,
            CIURCOPTERUS_COMPLETE,
            CAMPTOSAURUS_COMPLETE,
            TITANICHTHYS_COMPLETE,
            PLATYCARASPIS_COMPLETE,
            PARMASTEGA_COMPLETE,
            COMPSOGNATHUS_COMPLETE,
            PTERODACTYLUS_COMPLETE,
            CAMARASAURUS_COMPLETE,
            MIRAGAIA_COMPLETE,
            ADEOPAPPOSAURUS_COMPLETE,
            ANUROGNATHUS_COMPLETE,
            GUANLONG_COMPLETE,
            CHILESAURUS_COMPLETE,
            RHAMPHORHYNCHUS_COMPLETE,
            ANTEOSAURUS_COMPLETE,
            YUXISAURUS_COMPLETE,
            DASYCEPS_COMPLETE,
            BOTHRIOLEPIS_COMPLETE,
            ELAPHROSAURUS_COMPLETE,
            MYMOORAPELTA_COMPLETE,
            PRISTEROGNATHUS_COMPLETE,
            PROCERATOSAURUS_COMPLETE,
            APATOSAURUS_COMPLETE,
            SINRAPTOR_COMPLETE,
            LIMUSAURUS_COMPLETE,
            ALLOSAURUS_COMPLETE,
            YANGCHUANOSAURUS_COMPLETE,
            DILOPHOSAURUS_COMPLETE,
            GIGANTSPINOSAURUS_COMPLETE,
            VIVAXOSAURUS_COMPLETE,
            TORVOSAURUS_COMPLETE,
            URANOCENTRODON_COMPLETE,
            LAIDLERIA_COMPLETE,
            LABIDOSAURUS_COMPLETE,
            ROBERTIA_COMPLETE,
            EUNOTOSAURUS_COMPLETE,
            ELGINIA_COMPLETE,
            CTENOSPONDYLUS_COMPLETE,
            MIXOSAURUS_COMPLETE,
            HUPEHSUCHUS_COMPLETE,
            CRIOCEPHALOSAURUS_COMPLETE,
            YUNGUISAURUS_COMPLETE,
            STEGOSAURUS_COMPLETE,
            EUROPASAURUS_COMPLETE,
            HUAYANGOSAURUS_COMPLETE,
            BOBOSAURUS_COMPLETE,
            TUOJIANGOSAURUS_COMPLETE,
            CRYOLOPHOSAURUS_COMPLETE,
            EURHINOSAURUS_COMPLETE,
            PLATEOSAURUS_COMPLETE,
            CERATOSAURUS_COMPLETE,
            TEMNODONTOSAURUS_COMPLETE,
            SILLOSUCHUS_COMPLETE,
            VANCLEAVEA_COMPLETE,
            XINPUSAURUS_COMPLETE,
            YINLONG_COMPLETE,
            PLACERIAS_COMPLETE,
            CYNOGNATHUS_COMPLETE,
            ICHTHYOSTEGA_COMPLETE,
            PROGANOCHELYS_COMPLETE,
            DAKOSAURUS_COMPLETE,
            HYPERODAPEDON_COMPLETE,
            TIKTAALIK_COMPLETE,
            HERRERASAURUS_COMPLETE,
            TANYSTROPHEUS_COMPLETE,
            DIADECTES_COMPLETE,
            TIARAJUDENS_COMPLETE,
            THECODONTOSAURUS_COMPLETE,
            TETRACERATOPS_COMPLETE,
            BATRACHOTOMUS_COMPLETE,
            SMILOSUCHUS_COMPLETE,
            COELOPHYSIS_COMPLETE,
            SUMINIA_COMPLETE,
            SILESAURUS_COMPLETE,
            SHONISAURUS_COMPLETE,
            SHRINGASAURUS_COMPLETE,
            POSTOSUCHUS_COMPLETE,
            SCUTOSAURUS_COMPLETE,
            RUBIDGEA_COMPLETE,
            PROBURNETIA_COMPLETE,
            PRIONOSUCHUS_COMPLETE,
            POPOSAURUS_COMPLETE,
            OPHIACODON_COMPLETE,
            PLATYHYSTRIX_COMPLETE,
            PLACODUS_COMPLETE,
            PHOLIDERPETON_COMPLETE,
            OPHTHALMOSAURUS_COMPLETE,
            LOTOSAURUS_COMPLETE,
            LYSTROSAURUS_COMPLETE,
            NOTHOSAURUS_COMPLETE,
            MEGALOSAURUS_COMPLETE,
            MOSCHOPS_COMPLETE,
            MEGALOCEPHALUS_COMPLETE,
            MASTODONSAURUS_COMPLETE,
            LISOWICIA_COMPLETE,
            LIMNOSCELIS_COMPLETE,
            ATOPODENTATUS_COMPLETE,
            LILIENSTERNUS_COMPLETE,
            BUNGARTIUS_COMPLETE,
            LESSEMSAURUS_COMPLETE,
            KENTROSAURUS_COMPLETE,
            HENODUS_COMPLETE,
            PROTEROSUCHUS_COMPLETE,
            JONKERIA_COMPLETE,
            INOSTRANCEVIA_COMPLETE,
            ERYOPS_COMPLETE,
            GERROTHORAX_COMPLETE,
            ESTEMMENOSUCHUS_COMPLETE,
            ERYTHROSUCHUS_COMPLETE,
            EORHYNCHOCHELYS_COMPLETE,
            EFFIGIA_COMPLETE,
            BUNOSTEGOS_COMPLETE,
            EDAPHOSAURUS_COMPLETE,
            CAVIRAMUS_COMPLETE,
            CRASSIGYRINUS_COMPLETE,
            DUNKLEOSTEUS_COMPLETE,
            CYAMODUS_COMPLETE,
            CYMBOSPONDYLUS_COMPLETE,
            COTYLORHYNCHUS_COMPLETE,
            DATHEOSAURUS_COMPLETE,
            DRYOSAURUS_COMPLETE,
            DESMATOSUCHUS_COMPLETE,
            DIPLOCAULUS_COMPLETE,
            DIMETRODON_COMPLETE,
            RHOMALEOSAURUS_COMPLETE,
            ARIZONASAURUS_COMPLETE

    };


    public static void registerTriggers()
    {
        Method method;

        method = ReflectionHelper.findMethod(CriteriaTriggers.class, "register", "func_192118_a", ICriterionTrigger.class);

        method.setAccessible(true);

        for (int i=0; i < TRIGGER_ARRAY.length; i++)
        {
            try
            {
               method.invoke(null, TRIGGER_ARRAY[i]);
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
               e.printStackTrace();
            }
        }
    }
}