class GuitarStarter{
	public static void main(String[] pongals)
	{
		Guitar guitar=new Guitar(5000.0f);
		Guitar.brand="yamaha";
		guitar.noOfStrings=6;
		guitar.cost=7000.0f;
		
		Guitar guitar1=new Guitar(2000.0f);
		System.out.println(Guitar.brand);
		Guitar.brand="casio";
		guitar1.noOfStrings=4;
		guitar1.cost=999.0f;
		System.out.println(Guitar.brand);
	}
}