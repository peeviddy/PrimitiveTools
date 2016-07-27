package rickennain.primitivetools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "PrimitiveToolsModID", name = "Primitive Tools Mod", version = "alpha 0.0.1")
public class PrimitiveTools {
	
	@Mod.Instance("PrimitiveToolsModID")
	public static PrimitiveTools instance;
	
	@Mod.EventHandler
	public void preinit( FMLPreInitializationEvent event){
		System.out.println("PRE-INITIALIZATION PHASE");
	}
	
	@Mod.EventHandler
	public void init( FMLInitializationEvent event){
		System.out.println("INITIALIZATION PHASE");
	}
	
	@Mod.EventHandler
	public void postinit( FMLPostInitializationEvent event){
		System.out.println("POST-INITIALIZATION PHASE");
	}
	
}
