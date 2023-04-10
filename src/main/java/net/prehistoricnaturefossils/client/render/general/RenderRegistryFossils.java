package net.prehistoricnaturefossils.client.render.general;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.prehistoricnaturefossils.client.render.skeletons.*;
import net.prehistoricnaturefossils.client.render.slabs.*;
import net.prehistoricnaturefossils.tile.*;

public class RenderRegistryFossils {

    public static void RegisterEntityRenders() {

        //Fossil Slabs:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnomalocaris.class, new RenderFossilAnomalocaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAkmonistion.class, new RenderFossilAkmonistion());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAmpyx.class, new RenderFossilAmpyx());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArthropleura.class, new RenderFossilArthropleura());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAsaphus.class, new RenderFossilAsaphus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCoccosteus.class, new RenderFossilCoccosteus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilFalcatus.class, new RenderFossilFalcatus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilKeichousaurus.class, new RenderFossilKeichousaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLimulid.class, new RenderFossilLimulid());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMeganeura.class, new RenderFossilMeganeura());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMegarachne.class, new RenderFossilMegarachne());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMixopterus.class, new RenderFossilMixopterus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPulmonoscorpius.class, new RenderFossilPulmonoscorpius());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSchinderhannes.class, new RenderFossilSchinderhannes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTullimonstrum.class, new RenderFossilTullimonstrum());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilWalliserops.class, new RenderFossilWalliserops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTurboscinetes.class, new RenderFossilTurboscinetes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAeger.class, new RenderFossilAeger());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEryon.class, new RenderFossilEryon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilForeyia.class, new RenderFossilForeyia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCrotalocephalus.class, new RenderFossilCrotalocephalus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOpabinia.class, new RenderFossilOpabinia());

        //Skeleton Mounts:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArizonasaurus.class, new RenderFossilArizonasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnteosaurus.class, new RenderFossilAnteosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBungartius.class, new RenderFossilBungartius());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCaviramus.class, new RenderFossilCaviramus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCotylorhynchus.class, new RenderFossilCotylorhynchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCyamodus.class, new RenderFossilCyamodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCymbospondylus.class, new RenderFossilCymbospondylus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDesmatosuchus.class, new RenderFossilDesmatosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDimetrodon.class, new RenderFossilDimetrodon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDiplocaulus.class, new RenderFossilDiplocaulus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDunkleosteus.class, new RenderFossilDunkleosteus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEdaphosaurus.class, new RenderFossilEdaphosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEffigia.class, new RenderFossilEffigia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilErythrosuchus.class, new RenderFossilErythrosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEstemmenosuchus.class, new RenderFossilEstemmenosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGerrothorax.class, new RenderFossilGerrothorax());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHenodus.class, new RenderFossilHenodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilKentrosaurus.class, new RenderFossilKentrosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLiliensternus.class, new RenderFossilLiliensternus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLotosaurus.class, new RenderFossilLotosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLystrosaurus.class, new RenderFossilLystrosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMastodonsaurus.class, new RenderFossilMastodonsaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMegalosaurus.class, new RenderFossilMegalosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMoschops.class, new RenderFossilMoschops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOphiacodon.class, new RenderFossilOphiacodon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOphthalmosaurus.class, new RenderFossilOphthalmosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlatyhystrix.class, new RenderFossilPlatyhystrix());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPoposaurus.class, new RenderFossilPoposaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPrionosuchus.class, new RenderFossilPrionosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilRubidgea.class, new RenderFossilRubidgea());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilScutosaurus.class, new RenderFossilScutosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilShringasaurus.class, new RenderFossilShringasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSilesaurus.class, new RenderFossilSilesaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSuminia.class, new RenderFossilSuminia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilThecodontosaurus.class, new RenderFossilThecodontosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTiarajudens.class, new RenderFossilTiarajudens());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTiktaalik.class, new RenderFossilTiktaalik());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYinlong.class, new RenderFossilYinlong());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilJonkeria.class, new RenderFossilJonkeria());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPostosuchus.class, new RenderFossilPostosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCrassigyrinus.class, new RenderFossilCrassigyrinus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEryops.class, new RenderFossilEryops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDryosaurus.class, new RenderFossilDryosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTanystropheus.class, new RenderFossilTanystropheus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLessemsaurus.class, new RenderFossilLessemsaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilNothosaurus.class, new RenderFossilNothosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAtopodentatus.class, new RenderFossilAtopodentatus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlacodus.class, new RenderFossilPlacodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilShonisaurus.class, new RenderFossilShonisaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLisowicia.class, new RenderFossilLisowicia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSmilosuchus.class, new RenderFossilSmilosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEorhynchochelys.class, new RenderFossilEorhynchochelys());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDatheosaurus.class, new RenderFossilDatheosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPholiderpeton.class, new RenderFossilPholiderpeton());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMegalocephalus.class, new RenderFossilMegalocephalus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLimnoscelis.class, new RenderFossilLimnoscelis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilProburnetia.class, new RenderFossilProburnetia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTetraceratops.class, new RenderFossilTetraceratops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBunostegos.class, new RenderFossilBunostegos());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilInostrancevia.class, new RenderFossilInostrancevia());


    }
}
