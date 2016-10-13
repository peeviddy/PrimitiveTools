package rickennain.primitivetools.proxy;

import net.minecraftforge.common.MinecraftForge;
import rickennain.primitivetools.handler.DropHandler;

public abstract class CommonProxy implements IProxy {
	
	public void init(){}
	
	public void eventHandlerInit(){
		
		MinecraftForge.EVENT_BUS.register(new DropHandler());
	}
}
