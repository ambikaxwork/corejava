class Jail{
	String location;
	String name;
	int noOfCell;
	int noOfCriminals;
	int personnel;
	float areaInAcres;
	int yearOfConstruction;
	boolean strict;
	
	Jail(String location,String name,int yearOfConstruction)
	{
		this.location=location;
		this.name=name;
		this.yearOfConstruction=yearOfConstruction;
		this.noOfCell=50;
		this.personnel=50;
		this.areaInAcres=6;
		this.noOfCriminals=100;
		
		
	}
}