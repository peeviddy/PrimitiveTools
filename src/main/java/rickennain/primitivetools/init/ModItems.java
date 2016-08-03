package rickennain.primitivetools.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rickennain.primitivetools.item.ItemFlintAxe;

public class ModItems {
	
	public static Item flint_axe;
	
	public static void init(){
		flint_axe = new ItemFlintAxe();
	}
	
	public static void register(){
		GameRegistry.register(flint_axe);
	}
	
	public static void registerRenders(){
		registerRender(flint_axe);
		System.out.println( "flint_axe's unlocalized name is: " + flint_axe.getUnlocalizedName() );
	}
	
	private static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//the line above might be the issue with the texture not showing up
	}
}
