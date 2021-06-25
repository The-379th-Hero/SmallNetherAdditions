package annabeth.annabethsnethermod.blocks;

import annabeth.annabethsnethermod.SNAMain;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class SNABlocks {
	public static Block SOUL_SANDSTONE;
	public static Block CHISELED_SOUL_SANDSTONE;
	public static Block CUT_SOUL_SANDSTONE;
	public static Block SMOOTH_SOUL_SANDSTONE;
	public static Block SOUL_SANDSTONE_BRICKS;
	public static Block CRACKED_SOUL_SANDSTONE_BRICKS;
	
	public static Block SOUL_SANDSTONE_SLAB;
	public static Block SOUL_SANDSTONE_STAIRS;
	public static Block SOUL_SANDSTONE_WALL;
	public static Block CUT_SOUL_SANDSTONE_SLAB;
	public static Block CUT_SOUL_SANDSTONE_STAIRS;
	public static Block CUT_SOUL_SANDSTONE_WALL;
	public static Block SMOOTH_SOUL_SANDSTONE_SLAB;
	public static Block SMOOTH_SOUL_SANDSTONE_STAIRS;
	public static Block SMOOTH_SOUL_SANDSTONE_WALL;
	public static Block SOUL_SANDSTONE_BRICKS_SLAB;
	public static Block SOUL_SANDSTONE_BRICKS_STAIRS;
	public static Block SOUL_SANDSTONE_BRICKS_WALL;
	public static Block CRACKED_SOUL_SANDSTONE_BRICKS_SLAB;
	public static Block CRACKED_SOUL_SANDSTONE_BRICKS_STAIRS;
	public static Block CRACKED_SOUL_SANDSTONE_BRICKS_WALL;
	
	public static Block BLUE_NETHER_BRICKS;
	public static Block CHISELED_BLUE_NETHER_BRICKS;
	public static Block CRACKED_BLUE_NETHER_BRICKS;
	public static Block CRACKED_CHISELED_BLUE_NETHER_BRICKS;
	
	public static Block BLUE_NETHER_BRICK_SLAB;
	public static Block BLUE_NETHER_BRICK_STAIRS;
	public static Block BLUE_NETHER_BRICK_WALL;
	public static Block BLUE_NETHER_BRICK_FENCE;
	public static Block CRACKED_BLUE_NETHER_BRICK_SLAB;
	public static Block CRACKED_BLUE_NETHER_BRICK_STAIRS;
	public static Block CRACKED_BLUE_NETHER_BRICK_WALL;
	public static Block CRACKED_BLUE_NETHER_BRICK_FENCE;
	
	public static Block BLACK_NETHER_BRICKS;
	public static Block CHISELED_BLACK_NETHER_BRICKS;
	public static Block CRACKED_BLACK_NETHER_BRICKS;
	public static Block CRACKED_CHISELED_BLACK_NETHER_BRICKS;
	
	public static Block BLACK_NETHER_BRICK_SLAB;
	public static Block BLACK_NETHER_BRICK_STAIRS;
	public static Block BLACK_NETHER_BRICK_WALL;
	public static Block BLACK_NETHER_BRICK_FENCE;
	public static Block CRACKED_BLACK_NETHER_BRICK_SLAB;
	public static Block CRACKED_BLACK_NETHER_BRICK_STAIRS;
	public static Block CRACKED_BLACK_NETHER_BRICK_WALL;
	public static Block CRACKED_BLACK_NETHER_BRICK_FENCE;
	
	public static Block WARPED_WART;
	
	public static void createBlocks() {
		SOUL_SANDSTONE = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN).requiresCorrectToolForDrops().strength(0.8f).speedFactor(0.4f).sound(SoundType.BASALT)).setRegistryName(SNAMain.MODID, "soul_sandstone");
		
		
		BLUE_NETHER_BRICKS = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.WARPED_WART_BLOCK).requiresCorrectToolForDrops().strength(2.0f, 6.0f).sound(SoundType.NETHER_BRICKS)).setRegistryName(SNAMain.MODID, "blue_nether_bricks");
	}
	
	public static void registerBlocks(IForgeRegistry<Block> ifr) {
		
	}
	
	public static void registerBlockItems(IForgeRegistry<Item> ifr) {
		
	}
}