package annabeth.annabethsnethermod;

import annabeth.annabethsnethermod.blocks.SNABlocks;
import annabeth.annabethsnethermod.items.SNAItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SNAMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		SNABlocks.registerBlocks(event.getRegistry());
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		SNABlocks.registerBlockItems(event.getRegistry());
		SNAItems.registerItems(event.getRegistry());
	}
}