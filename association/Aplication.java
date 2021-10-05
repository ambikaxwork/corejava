class Application{
	String name;
	String version;
	Company company=new Company();
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.company.name);
		System.out.println(this.company.ceo);
		System.out.println(this.company.cfo);
		
	}
}