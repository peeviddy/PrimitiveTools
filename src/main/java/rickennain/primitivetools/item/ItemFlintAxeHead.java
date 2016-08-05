package rickennain.primitivetools.item;

import net.minecraft.item.Item;
import rickennain.primitivetools.creativetab.CreativeTabRPT;
import rickennain.primitivetools.reference.Reference;

public class ItemFlintAxeHead extends Item{

	public ItemFlintAxeHead(){
		
		this.setCreativeTab(CreativeTabRPT.RPT_TAB);
		setUnlocalizedName(Reference.rptItems.FLINT_AXE_HEAD.getUnlocalizedName());
		setRegistryName(Reference.rptItems.FLINT_AXE_HEAD.getRegistryName());
	}
}
