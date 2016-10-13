package rickennain.primitivetools.handler;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void addEntityDrop(LivingDropsEvent event){
		
		if (event.getEntity() instanceof EntityAnimal){
			
			ItemStack bones = new ItemStack(Items.BONE, 3);
			event.getDrops().add(new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, bones));
		}
	        
	}
}
