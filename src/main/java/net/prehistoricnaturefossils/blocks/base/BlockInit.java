package net.prehistoricnaturefossils.blocks.base;

import net.minecraft.block.Block;
import net.prehistoricnaturefossils.blocks.skeletons.BlockFossilAnteosaurus;
import net.prehistoricnaturefossils.blocks.skeletons.BlockFossilArizonasaurus;
import net.prehistoricnaturefossils.blocks.slabs.BlockFossilAkmonistion;
import net.prehistoricnaturefossils.blocks.slabs.BlockFossilAmpyx;
import net.prehistoricnaturefossils.blocks.slabs.BlockFossilAnomalocaris;
import net.prehistoricnaturefossils.blocks.slabs.BlockFossilArthropleura;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block FOSSIL_AKMONISTION = new BlockFossilAkmonistion();
    public static final Block FOSSIL_AMPYX = new BlockFossilAmpyx();
    public static final Block FOSSIL_ANOMOLACARIS = new BlockFossilAnomalocaris();
    public static final Block FOSSIL_ANTEOSAURUS = new BlockFossilAnteosaurus();
    public static final Block FOSSIL_ARIZONASAURUS = new BlockFossilArizonasaurus();
    public static final Block FOSSIL_ARTHROPLEURA = new BlockFossilArthropleura();

}
