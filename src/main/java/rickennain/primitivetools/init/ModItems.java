package rickennain.primitivetools.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rickennain.primitivetools.item.ItemPrimitiveTool;
import rickennain.primitivetools.reference.Reference;
import rickennain.primitivetools.item.ItemFlintAxe;

public class ModItems {

	public static ItemPrimitiveTool flint_axe = new ItemPrimitiveTool();
	
	public static void init(){
		
		GameRegistry.register(flint_axe.setRegistryName("flint_axe"));
	}
}
