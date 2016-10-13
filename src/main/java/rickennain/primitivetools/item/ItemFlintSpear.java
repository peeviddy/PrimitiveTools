package rickennain.primitivetools.item;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import rickennain.primitivetools.creativetab.CreativeTabRPT;
import rickennain.primitivetools.reference.Reference;

public class ItemFlintSpear extends ItemSword implements IVariableReachItem
{
	public ItemFlintSpear(ToolMaterial material){
		super(material);
		
		this.setCreativeTab(CreativeTabRPT.RPT_TAB);
		setUnlocalizedName(Reference.rptItems.FLINT_AXE.getUnlocalizedName());
		setRegistryName(Reference.rptItems.FLINT_AXE.getRegistryName());
	}

    @Override
    public float getReach() 
    {
        return 20.0F;
    }
}
