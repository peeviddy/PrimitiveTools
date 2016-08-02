package rickennain.primitivetools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rickennain.primitivetools.proxy.IProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "PrimitiveToolsModID", name = "Primitive Tools Mod", version = "alpha")
public class PrimitiveTools {
	
	@Mod.Instance("PrimitiveToolsModID")
	public static PrimitiveTools instance;
	
	@SidedProxy( clientSide = "rickennain.primitivetools.proxy.ClientProxy", serverSide = "rickennain.primitivetools.proxy.ServerProxy", modId = "PrimitiveToolsModID")
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
