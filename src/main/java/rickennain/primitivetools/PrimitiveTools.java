package rickennain.primitivetools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import rickennain.primitivetools.proxy.IProxy;
import rickennain.primitivetools.reference.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class PrimitiveTools {
	
	@Mod.Instance(Reference.MOD_ID)
	public static PrimitiveTools instance;
	
	@SidedProxy( clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preinit( FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init( FMLInitializationEvent event){

	}
	
	@Mod.EventHandler
	public void postinit( FMLPostInitializationEvent event){

	}
	
}
