class IpodRunner{
	public static void main(String[] kachoris)
	{
		Ipod ipod=new Ipod();
		ipod.type="Nano";
		ipod.models="Apple";
		ipod.cost=29600.0f;
		ipod.size=123.4f;
		ipod.weight=.5f;
		ipod.display();
		Ipod ipod1=new Ipod();
		ipod1.type="mini";
		ipod1.models="Apple";
		ipod1.cost=25000.0f;
		ipod1.size=99.0f;
		ipod1.weight=.3f;
		ipod1.hardware();
	
		
	}
}