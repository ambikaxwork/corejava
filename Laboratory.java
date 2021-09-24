class Laboratory{
	String name;
	String location;
	int noOfRooms;
	String[] operatorNames;
	LabType type;
	
	Laboratory(String name,String location,int noOfRooms,String[] operatorNames)
	{
		System.out.println("invoking constructor of type String,String,int");
		this.name=name;
		this.location=location;
		this.noOfRooms=noOfRooms;
		this.operatorNames=operatorNames;
		this.type=type;
	}
	Laboratory()
	{
		
	}
}