package rickennain.primitivetools.item;

import net.minecraft.item.ItemAxe;
import rickennain.primitivetools.creativetab.CreativeTabRPT;
import rickennain.primitivetools.reference.Reference;

public class ItemFlintAxe extends ItemAxe {
	
	public ItemFlintAxe(ToolMaterial material){
		super(material, 8.0F, -3.2F);
		
		this.setCreativeTab(CreativeTabRPT.RPT_TAB);
		setUnlocalizedName(Reference.rptItems.FLINT_AXE.getUnlocalizedName());
		setRegistryName(Reference.rptItems.FLINT_AXE.getRegistryName());
	}
	
}
