package net.prehistoricnaturefossils.client.render.general;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.prehistoricnaturefossils.client.render.skeletons.RenderFossilAnteosaurus;
import net.prehistoricnaturefossils.client.render.skeletons.RenderFossilArizonasaurus;
import net.prehistoricnaturefossils.client.render.slabs.RenderFossilAkmonistion;
import net.prehistoricnaturefossils.client.render.slabs.RenderFossilAmpyx;
import net.prehistoricnaturefossils.client.render.slabs.RenderFossilAnomalocaris;
import net.prehistoricnaturefossils.tile.*;

public class RenderRegistryFossils {

    public static void RegisterEntityRenders() {

        //Fossil Slabs:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnomalocaris.class, new RenderFossilAnomalocaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAkmonistion.class, new RenderFossilAkmonistion());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAmpyx.class, new RenderFossilAmpyx());

        //Skeleton Mounts:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArizonasaurus.class, new RenderFossilArizonasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnteosaurus.class, new RenderFossilAnteosaurus());


    }
}
