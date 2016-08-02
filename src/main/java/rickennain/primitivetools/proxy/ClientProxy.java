package rickennain.primitivetools.proxy;

import rickennain.primitivetools.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	public void init(){
		ModItems.registerRenders();
	}
}
