class Grinder{
	static int capacity;
	String company;
	Motor motor;
	
	
	
	
	Grinder(int capacity,Motor motor)
	{
		this.capacity=capacity;
		this.motor=motor;
		
		
		
	}
	void runner()
	{
		this.capacity=capacity;
	}
}