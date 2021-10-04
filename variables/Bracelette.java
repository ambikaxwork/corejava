class Bracelette{
	static int count=0;
	String type;
	float cost;
	{
		count++;
	}
	
	Bracelette()
	{
	
	}
	
	Bracelette(String type)
	{
		this.type=type;
	}
	
	Bracelette(float cost)
	{
		this.cost=cost;
	}
	
	Bracelette(String type,float cost)
	{
		this.cost=cost;
		this.type=type;
	}
}