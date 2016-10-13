package rickennain.primitivetools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rickennain.primitivetools.init.ModItems;
import rickennain.primitivetools.init.Recipes;
import rickennain.primitivetools.proxy.CommonProxy;
import rickennain.primitivetools.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class PrimitiveTools {
	
	@Mod.Instance(Reference.MOD_ID)
	public static PrimitiveTools instance;
	
	@SidedProxy( clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@SidedProxy( clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy TESTproxy;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event){
		ModItems.init();
		ModItems.register();
		proxy.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
		Recipes.init();
		proxy.eventHandlerInit();
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event){

	}
	
}
