class Grocery{
	static String name;
	float cost;
	
	Grocery(float cost)
	{
		this.name="pulses";
	}
	public static void main(String[] args)
	{   Grocery grocery=new Grocery(100.0f);
		System.out.println(Grocery.name);
	}
	
}