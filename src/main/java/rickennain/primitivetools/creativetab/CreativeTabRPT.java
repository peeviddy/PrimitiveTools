package rickennain.primitivetools.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rickennain.primitivetools.init.ModItems;
import rickennain.primitivetools.reference.Reference;

public class CreativeTabRPT {
	
	public static final CreativeTabs RPT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){ 
		// the parameter is the mod id in lowercase and is localized in en_US.lang
		@Override
		public Item getTabIconItem(){ //this method is what displays in the tab
			
			return ModItems.flint_axe;
		}
	};
}
