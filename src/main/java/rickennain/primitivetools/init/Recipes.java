package rickennain.primitivetools.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init(){
		
		GameRegistry.addShapelessRecipe( new ItemStack(ModItems.flint_axe), new ItemStack(ModItems.flint_axe_head), new ItemStack(Items.STICK));
		GameRegistry.addShapelessRecipe( new ItemStack(ModItems.flint_axe_head), new ItemStack(Items.FLINT), new ItemStack(Items.FLINT));
	}
}
