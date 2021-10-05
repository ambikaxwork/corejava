class Company{
	String name;
	Country country=new Country();
	String ceo;
	String cfo;
	
	void displayDetails()
	{
		System.out.println(this.name);
		//System.out.println(this.country.name);
		//System.out.println(this.country.code);
		System.out.println(this.ceo);
		System.out.println(this.cfo);
	}
}