class NailCutterRunner{
	public static void main(String[] beers)
	{
		NailCutter cutter=new NailCutter();
		cutter.type="nail cutting";
		cutter.name="fgg";
		cutter.length=7.8f;
		cutter.weight=0.2f;
		
		NailCutter cutter1=new NailCutter();
		cutter1.type="nail shapper";
		cutter1.name="typ";
		cutter1.length=7.8f;
		cutter1.weight=0.1f;
	
	   cutter.cutter();
	   cutter1.shaper();
	   
	    NailCutter cutter2=new NailCutter();
		cutter2.type="nail shapper";
		cutter2.name="henssey";
		cutter2.length=6.8f;
		cutter2.weight=0.5f;
		
	   cutter2.shaper();
		
		
	}
}