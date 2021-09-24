class Weapon{
	String name;
	float price;
	int noOfWeapons;
	String color;
	String type;
	float size;
	float weight;
	
	Weapon(String name,float price,int noOfWeapons,String color, String type,int size,float weight)
	{
		this.name=name;
		this.price=price;
		this.noOfWeapons=noOfWeapons;
		this.color=color;
		this.type=type;
		this.size=size;
		this.weight=weight;
		
	}
	Weapon(String name,float price,int noOfWeapons,String color)
	{
		this.name=name;
		this.price=price;
		this.noOfWeapons=noOfWeapons;
		this.color=color;
	}
	Weapon(String type,int size,float weight)
	{
		this.type=type;
		this.size=size;
		this.weight=weight;
	}
	Weapon(String name,float price,String color, String type,int size,float weight)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.type=type;
		this.size=size;
		this.weight=weight;
	}
	Weapon(String name,float price, String type,int size,float weight)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		this.size=size;
		this.weight=weight;
	}
	Weapon(String name,float price)
	{
	    this.name=name;
		this.price=price;	
	}
}