class Forest{
	
	String name="bhadra forest";//literals
	String location;
	boolean reserved;
	State state;
	
	Forest(String location,boolean reserved)
	{
		this.location=location;
		this.reserved=reserved;
	}
	Forest(State state)
	{
		this.state=state;
	}
	Forest()
	{
		
	}
	
}