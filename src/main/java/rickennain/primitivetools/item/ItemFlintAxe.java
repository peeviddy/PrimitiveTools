package rickennain.primitivetools.item;

import net.minecraft.item.ItemAxe;
import rickennain.primitivetools.reference.Reference;

public class ItemFlintAxe extends ItemAxe {
	
	public ItemFlintAxe( ToolMaterial material ){
		super(material);
		setUnlocalizedName(Reference.rptItems.FLINT_AXE.getUnlocalizedName());
		setRegistryName(Reference.rptItems.FLINT_AXE.getRegistryName());
	}
	
}
