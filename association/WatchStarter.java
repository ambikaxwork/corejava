class WatchStarter{
	
	public static void main(String[] kichidis)
	{
	//primitive=initialization
	//non primitive=instanstation
	
	Watch watch=new Watch(467,"Rolex");
	System.out.println(watch.model);
	System.out.println(watch.brand);
	int model=watch.model;
	String brand=watch.brand;
	//Light light=new Light();
	Light light=watch.light;
	System.out.println(light.on);
	//System.out.println(watch.light.on);
}
}