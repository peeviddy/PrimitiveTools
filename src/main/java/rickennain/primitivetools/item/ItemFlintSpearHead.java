package rickennain.primitivetools.item;

import net.minecraft.item.Item;
import rickennain.primitivetools.creativetab.CreativeTabRPT;
import rickennain.primitivetools.reference.Reference;

public class ItemFlintSpearHead extends Item{
	
	public ItemFlintSpearHead(){
		
		this.setCreativeTab(CreativeTabRPT.RPT_TAB);
		setUnlocalizedName(Reference.rptItems.FLINT_SPEAR_HEAD.getUnlocalizedName());
		setRegistryName(Reference.rptItems.FLINT_SPEAR_HEAD.getRegistryName());
	}
	
}
