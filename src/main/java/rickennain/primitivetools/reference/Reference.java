package rickennain.primitivetools.reference;

public class Reference {
	
	public static final String MOD_ID = "rpt";
	public static final String MOD_NAME = "Primitive Tools Mod";
	public static final String VERSION = "0.0.1";
	public static final String CLIENT_PROXY_CLASS = "rickennain.primitivetools.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "rickennain.primitivetools.proxy.ServerProxy";
	
	public static enum rptItems{
		/*FLINT_KNIFE_BLADE(),
		 *FLINT_KNIFE(),
		 *FLINT_SPEAR()*/
		FLINT_SPEAR_HEAD("flintspearhead", "ItemFlintSpearHead"),
		FLINT_AXE_HEAD("flintaxehead", "ItemFlintAxeHead"),
		FLINT_AXE("flintaxe", "ItemFlintAxe");
		
		rptItems( String unlocalizedName, String registryName ){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
		
		private String unlocalizedName;
		private String registryName;
		
	}
}
