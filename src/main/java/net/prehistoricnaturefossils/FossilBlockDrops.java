package net.prehistoricnaturefossils;

import net.lepidodendron.block.*;
import net.lepidodendron.item.ItemFossilHammer;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.prehistoricnaturefossils.blocks.base.BlockInit;

import java.util.Random;

public class FossilBlockDrops {

    @SubscribeEvent //Add to the block drops for the fossils
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        Random rand = event.getWorld().rand;
        World worldIn = event.getWorld();
        if (event.getPlayer() == null) {
            return;
        }
        if (event.getPlayer().isCreative()) {
            return;
        }
        ItemStack stack = event.getPlayer().getHeldItemMainhand();
        BlockPos pos = event.getPos();
        IBlockState state = event.getState();
        if (state.getBlock() instanceof BlockFossil) {
            if (!worldIn.isRemote && stack.getItem() == ItemFossilHammer.block) {
                ItemStack dropStack = getDisplayableFossilStack(state);
                if (!dropStack.isEmpty()) {
                    Block.spawnAsEntity(worldIn, pos, dropStack);
                }
                //fortune modifier:
                int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
                int ii = rand.nextInt(levelEnchantment + 1) * 2;
                for (int i = 0; i < ii; ++i) {
                    if (rand.nextInt(2) == 0) {
                        dropStack = getDisplayableFossilStack(state);
                        if (!dropStack.isEmpty()) {
                            Block.spawnAsEntity(worldIn, pos, dropStack);
                        }
                    }
                }
            }
        }
    }

    public ItemStack getDisplayableFossilStack(IBlockState state) {
        if (state.getBlock() == BlockFossilPrecambrian.block) {
            return fossilDropDisplayable(1);
        } else if (state.getBlock() == BlockFossilCambrian.block) {
            return fossilDropDisplayable(2);
        } else if (state.getBlock() == BlockFossilOrdovician.block) {
            return fossilDropDisplayable(3);
        } else if (state.getBlock() == BlockFossilSilurian.block) {
            return fossilDropDisplayable(4);
        } else if (state.getBlock() == BlockFossilDevonian.block) {
            return fossilDropDisplayable(5);
        } else if (state.getBlock() == BlockFossilCarboniferous.block) {
            return fossilDropDisplayable(6);
        } else if (state.getBlock() == BlockFossilPermian.block) {
            return fossilDropDisplayable(7);
        } else if (state.getBlock() == BlockFossilTriassic.block) {
            return fossilDropDisplayable(8);
        } else if (state.getBlock() == BlockFossilJurassic.block) {
            return fossilDropDisplayable(9);
        } else if (state.getBlock() == BlockFossilCretaceous.block) {
            return fossilDropDisplayable(10);
        } else if (state.getBlock() == BlockFossilPaleogene.block) {
            return fossilDropDisplayable(11);
        } else if (state.getBlock() == BlockFossilNeogene.block) {
            return fossilDropDisplayable(12);
        } else if (state.getBlock() == BlockFossilPleistocene.block) {
            return fossilDropDisplayable(13);
        } else {
            return ItemStack.EMPTY;
        }
    }

    public static ItemStack fossilDropDisplayable(int dim) {

        switch (dim) {
            case 1:
            default: //Precambrian
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getPrecambrianDisplayableFossilDrops().length);
                    return getPrecambrianDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 2: //Cambrian
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getCambrianDisplayableFossilDrops().length);
                    return getCambrianDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 3: //Ordovician
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getOrdovicianDisplayableFossilDrops().length);
                    return getOrdovicianDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 4: //Silurian
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getSilurianDisplayableFossilDrops().length);
                    return getSilurianDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 5: //Devonian
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getDevonianDisplayableFossilDrops().length);
                    return getDevonianDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 6: //Carboniferous
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getCarboniferousDisplayableFossilDrops().length);
                    return getCarboniferousDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 7: //Permian
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getPermianDisplayableFossilDrops().length);
                    return getPermianDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 8: //Triassic
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getTriassicDisplayableFossilDrops().length);
                    return getTriassicDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 9: //Jurassic
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getJurassicDisplayableFossilDrops().length);
                    return getJurassicDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 10: //Cretaceous
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getCretaceousDisplayableFossilDrops().length);
                    return getCretaceousDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 11: //Paleogene
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getPaleogeneDisplayableFossilDrops().length);
                    return getPaleogeneDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 12: //Neogene
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getNeogeneDisplayableFossilDrops().length);
                    return getNeogeneDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;

            case 13: //Pleistocene
                if (new Random().nextInt(10) == 0) {
                    int ii = (new Random()).nextInt(getPleistoceneDisplayableFossilDrops().length);
                    return getPleistoceneDisplayableFossilDrops()[ii];
                }
                return ItemStack.EMPTY;
        }
    }

    public static ItemStack[] getPrecambrianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_OPABINIA, 1),
                new ItemStack(BlockInit.FOSSIL_OTTOIA, 1),
                new ItemStack(BlockInit.FOSSIL_VETULICOLA, 1),
                new ItemStack(BlockInit.FOSSIL_HALLUCIGENIA, 1),
                new ItemStack(BlockInit.FOSSIL_CANADASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_HAIKOUICHTHYS, 1),
                new ItemStack(BlockInit.FOSSIL_YOHOIA, 1),
                new ItemStack(BlockInit.FOSSIL_YAWUNIK, 1),
                new ItemStack(BlockInit.FOSSIL_SANCTACARIS, 1),
                new ItemStack(BlockInit.FOSSIL_KERYGMACHELA, 1),
                new ItemStack(BlockInit.FOSSIL_SKEEMELLA, 1),
                new ItemStack(BlockInit.FOSSIL_PIKAIA, 1),
                new ItemStack(BlockInit.FOSSIL_EOREDLICHIA, 1),
                new ItemStack(BlockInit.FOSSIL_BALHUTICARIS, 1),
                new ItemStack(BlockInit.FOSSIL_NECTOCARIS, 1),
                new ItemStack(BlockInit.FOSSIL_CAMBRORASTER, 1),
                new ItemStack(BlockInit.FOSSIL_SIDNEYIA, 1),
                new ItemStack(BlockInit.FOSSIL_MARRELLA, 1),
                new ItemStack(BlockInit.FOSSIL_ANOMOLACARIS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ASAPHUS, 1),
                new ItemStack(BlockInit.FOSSIL_MIXOPTERUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getSilurianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_CROTALOCEPHALUS, 1),
                new ItemStack(BlockInit.FOSSIL_AMPYX, 1),
                new ItemStack(BlockInit.FOSSIL_CRINOID_RAFT, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getDevonianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_BUNGARTIUS, 1),
                new ItemStack(BlockInit.FOSSIL_DUNKLEOSTEUS, 1),
                new ItemStack(BlockInit.FOSSIL_CROTALOCEPHALUS, 1),
                new ItemStack(BlockInit.FOSSIL_CLADOSELACHE, 1),
                new ItemStack(BlockInit.FOSSIL_ICHTHYOSTEGA, 1),
                new ItemStack(BlockInit.FOSSIL_EUSTHENOPTERON, 1),
                new ItemStack(BlockInit.FOSSIL_GEMUENDINA, 1),
                new ItemStack(BlockInit.FOSSIL_POLYBRANCHIASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_PARAMETEORASPIS, 1),
                new ItemStack(BlockInit.FOSSIL_TIKTAALIK, 1),
                new ItemStack(BlockInit.FOSSIL_WALLISEROPS, 1),
                new ItemStack(BlockInit.FOSSIL_SCHINDERHANNES, 1),
                new ItemStack(BlockInit.FOSSIL_COCCOSTEUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ARTHROPLEURA, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLOCAULUS, 1),
                new ItemStack(BlockInit.FOSSIL_EDAPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PULMONOSCORPIUS, 1),
                new ItemStack(BlockInit.FOSSIL_CRASSIGYRINUS, 1),
                new ItemStack(BlockInit.FOSSIL_TULLIMONSTRUM, 1),
                new ItemStack(BlockInit.FOSSIL_LIMNOSCELIS, 1),
                new ItemStack(BlockInit.FOSSIL_BANDRINGA, 1),
                new ItemStack(BlockInit.FOSSIL_OPHIACODON, 1),
                new ItemStack(BlockInit.FOSSIL_MEGANEURA, 1),
                new ItemStack(BlockInit.FOSSIL_BELANTSEA, 1),
                new ItemStack(BlockInit.FOSSIL_DATHEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PHOLIDERPETON, 1),
                new ItemStack(BlockInit.FOSSIL_ERYOPS, 1),
                new ItemStack(BlockInit.FOSSIL_MEGARACHNE, 1),
                new ItemStack(BlockInit.FOSSIL_MEGALOCEPHALUS, 1),
                new ItemStack(BlockInit.FOSSIL_FALCATUS, 1),
                new ItemStack(BlockInit.FOSSIL_AKMONISTION, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPermianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ANTEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_DIMETRODON, 1),
                new ItemStack(BlockInit.FOSSIL_OPHIACODON, 1),
                new ItemStack(BlockInit.FOSSIL_DIPLOCAULUS, 1),
                new ItemStack(BlockInit.FOSSIL_MOSCHOPS, 1),
                new ItemStack(BlockInit.FOSSIL_DATHEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ERYOPS, 1),
                new ItemStack(BlockInit.FOSSIL_INOSTRANCEVIA, 1),
                new ItemStack(BlockInit.FOSSIL_BUNOSTEGOS, 1),
                new ItemStack(BlockInit.FOSSIL_PLATYHYSTRIX, 1),
                new ItemStack(BlockInit.FOSSIL_TIARAJUDENS, 1),
                new ItemStack(BlockInit.FOSSIL_PROBURNETIA, 1),
                new ItemStack(BlockInit.FOSSIL_LYSTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TETRACERATOPS, 1),
                new ItemStack(BlockInit.FOSSIL_SCUTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_JONKERIA, 1),
                new ItemStack(BlockInit.FOSSIL_RUBIDGEA, 1),
                new ItemStack(BlockInit.FOSSIL_DIADECTES, 1),
                new ItemStack(BlockInit.FOSSIL_BOBASATRANIA, 1),
                new ItemStack(BlockInit.FOSSIL_SUMINIA, 1),
                new ItemStack(BlockInit.FOSSIL_PRIONOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_ESTEMMENOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_EDAPHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_COTYLORHYNCHUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_ARIZONASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYAMODUS, 1),
                new ItemStack(BlockInit.FOSSIL_EFFIGIA, 1),
                new ItemStack(BlockInit.FOSSIL_GERROTHORAX, 1),
                new ItemStack(BlockInit.FOSSIL_FOREYIA, 1),
                new ItemStack(BlockInit.FOSSIL_BOBASATRANIA, 1),
                new ItemStack(BlockInit.FOSSIL_KEICHOUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_BATRACHOTOMUS, 1),
                new ItemStack(BlockInit.FOSSIL_LOTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HERRERASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LYSTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_HENODUS, 1),
                new ItemStack(BlockInit.FOSSIL_SHRINGASAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_CLATROTITAN, 1),
                new ItemStack(BlockInit.FOSSIL_MASTODONSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TANYSTROPHEUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYNOGNATHUS, 1),
                new ItemStack(BlockInit.FOSSIL_HYPERODAPEDON, 1),
                new ItemStack(BlockInit.FOSSIL_PROGANOCHELYS, 1),
                new ItemStack(BlockInit.FOSSIL_SILLOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_VANCLEAVEA, 1),
                new ItemStack(BlockInit.FOSSIL_THECODONTOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_XINPUSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_POSTOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_SILESAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_POPOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LESSEMSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_NOTHOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_ATOPODENTATUS, 1),
                new ItemStack(BlockInit.FOSSIL_LISOWICIA, 1),
                new ItemStack(BlockInit.FOSSIL_SMILOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_PLATEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_COELOPHYSIS, 1),
                new ItemStack(BlockInit.FOSSIL_PLACERIAS, 1),
                new ItemStack(BlockInit.FOSSIL_SHONISAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_PLACODUS, 1),
                new ItemStack(BlockInit.FOSSIL_ERYTHROSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_CYMBOSPONDYLUS, 1),
                new ItemStack(BlockInit.FOSSIL_DESMATOSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_PROTEROSUCHUS, 1),
                new ItemStack(BlockInit.FOSSIL_EORHYNCHOCHELYS, 1),
                new ItemStack(BlockInit.FOSSIL_LILIENSTERNUS, 1),
                new ItemStack(BlockInit.FOSSIL_AEGER, 1),
                new ItemStack(BlockInit.FOSSIL_CAVIRAMUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_KENTROSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_LIMULID, 1),
                new ItemStack(BlockInit.FOSSIL_OPHTHALMOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_YINLONG, 1),
                new ItemStack(BlockInit.FOSSIL_DAKOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_RHOMALEOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_AEGER, 1),
                new ItemStack(BlockInit.FOSSIL_ERYON, 1),
                new ItemStack(BlockInit.FOSSIL_MEGALOSAURUS, 1),
                new ItemStack(BlockInit.FOSSIL_TURBOSCINETES, 1),
                new ItemStack(BlockInit.FOSSIL_DRYOSAURUS, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockInit.FOSSIL_AEGER, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                ItemStack.EMPTY
        };
        return itemStack;
    }
    
}
