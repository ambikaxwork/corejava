class NailPolish{
	
	String brand;
	String color;
	NailPolish(String brand)
	{
		System.out.println(brand);
		
	}
	
	NailPolish()
	{
		this("nyke");
	}

	public static void main(String[] juices)
	{
		NailPolish nail=new NailPolish("lakme");
		NailPolish nail1=new NailPolish();
		System.out.println(nail.brand);
		System.out.println(nail1);
		System.out.println(nail.color);
	}
}