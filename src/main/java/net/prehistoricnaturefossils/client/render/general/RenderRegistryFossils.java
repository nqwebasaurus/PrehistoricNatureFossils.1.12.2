package net.prehistoricnaturefossils.client.render.general;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.prehistoricnaturefossils.client.render.skeletons.RenderFossilAnteosaurus;
import net.prehistoricnaturefossils.client.render.skeletons.RenderFossilArizonasaurus;
import net.prehistoricnaturefossils.client.render.skeletons.RenderFossilBungartius;
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

        //Skeleton Mounts:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArizonasaurus.class, new RenderFossilArizonasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnteosaurus.class, new RenderFossilAnteosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBungartius.class, new RenderFossilBungartius());


    }
}
