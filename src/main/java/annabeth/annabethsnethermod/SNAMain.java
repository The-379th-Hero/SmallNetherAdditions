package annabeth.annabethsnethermod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import annabeth.annabethsnethermod.blocks.SNABlocks;
import annabeth.annabethsnethermod.items.SNAItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SNAMain.MODID)
public class SNAMain {
	public static final Logger LOOGER = LogManager.getLogger();
	public static final String MODID = "annabethsnethermod";
	
	public SNAMain() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public void setup(FMLCommonSetupEvent event) {
		SNABlocks.createBlocks();
		SNAItems.createItems();
	}
}