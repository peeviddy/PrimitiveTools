package rickennain.primitivetools.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemTool;
import rickennain.primitivetools.reference.Reference;

public class ItemFlintAxe extends ItemTool { // still not quite sure how to add this item properly
	
	public ItemFlintAxe(){
		super();
		setUnlocalizedName(Reference.rptItems.FLINT_AXE.getUnlocalizedName());
		setRegistryName(Reference.rptItems.FLINT_AXE.getRegistryName());
	}
	
}
