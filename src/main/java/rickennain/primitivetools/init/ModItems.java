package rickennain.primitivetools.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rickennain.primitivetools.item.ItemFlintAxe;
import rickennain.primitivetools.item.ItemFlintAxeHead;
import rickennain.primitivetools.item.ItemFlintSpearHead;

public class ModItems {
	
	public static ToolMaterial FLINT = EnumHelper.addToolMaterial("Flint", 1, 131, 2.2F, 1.0F, 1);
	
	public static Item flint_spear_head;
	//public static Item flint_spear;
	public static Item flint_axe_head;
	public static Item flint_axe;
	
	public static void init(){
		flint_spear_head = new ItemFlintSpearHead();
		//flint_spear = new ItemFlintSpear();
		flint_axe_head = new ItemFlintAxeHead();
		flint_axe = new ItemFlintAxe(FLINT);
	}
	
	public static void register(){
		
		GameRegistry.register(flint_spear_head);
		//GameRegistry.register(flint_spear);
		
		GameRegistry.register(flint_axe_head);
		GameRegistry.register(flint_axe);
	}
	
	public static void registerRenders(){
		
		registerRender(flint_spear_head);
		//registerRender(flint_spear);
		registerRender(flint_axe_head);
		registerRender(flint_axe);
	}
	
	private static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
