class Sword{
	
	String type;
	float length;
	float weight;
	Sword(String type,float length,float weight)
	{
		this.type=type;
		this.length=length;
		this.weight=weight;
	}
	void fighting()
	{
		System.out.println("invoked fighting");
		System.out.println(type);
		System.out.println(length);
		System.out.println(weight);
		this.show();
	}
	
	static void show()
	{
		System.out.println("invoked show");
		display();
	}
	 static void display()
	{
		System.out.println("invoked display");
	}
	Sword()
	{
		
	}
	
}
