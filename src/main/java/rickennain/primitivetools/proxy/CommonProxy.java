package rickennain.primitivetools.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import rickennain.primitivetools.handler.DropHandler;

public abstract class CommonProxy implements IProxy {
	
	public void init(){}
	
	public void eventHandlerInit(){
		
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}
}
