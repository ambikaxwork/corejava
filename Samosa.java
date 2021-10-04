class Samosa{
	float cost;
	boolean taste;
	SamosaSize size;
	String[] ingredients;
	
	Samosa(float cost,boolean taste)
	{
		System.out.println("created using float,boolean");
		this.cost=cost;
		this.taste=taste;
	}
	Samosa(SamosaSize size,String[] ingredients)
	{
		System.out.println("created using samosasize,string[]");
		this.size=size;
		this.ingredients=ingredients;
	}
	Samosa(float cost,boolean taste,SamosaSize size,String[] ingredients)
	{
		this(cost,taste);
		this.size=size;
		this.ingredients=ingredients;
		System.out.println("created using float,boolean,samosasize,string[]");
	}
	
}