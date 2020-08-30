package LeadFreeCandy.examplemod;

import LeadFreeCandy.proxy.ClientProxy;
import LeadFreeCandy.proxy.IProxy;
import LeadFreeCandy.proxy.ServerProxy;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MODID, name = TutorialMod.NAME, version = TutorialMod.VERSION, acceptedMinecraftVersions = TutorialMod.MC_VERSION)
public class TutorialMod {

    public static final String MODID = "tutorialmod";
    public static final String NAME = "Tutorial Mod";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final String CLIENT = "LeadFreeCandy.proxy.ClientProxy";
    public static final String SERVER = "LeadFreeCandy.proxy.ServerProxy";

    @SidedProxy(clientSide = TutorialMod.CLIENT, serverSide = TutorialMod.SERVER)
    public static IProxy proxy;


    public static final Logger LOGGER = LogManager.getLogger(TutorialMod.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(TutorialMod.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}