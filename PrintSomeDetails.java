class PrintSomeDetails{
	public static void printdreamcompany()
	{
		System.out.println("name:Ambika");
		System.out.println("fav vehicle:car");
	}
	public static String printcompany(String dreamcompany)
	{
		System.out.println("dreamcompany:" + dreamcompany);
		return dreamcompany;
	}
	
	public static void printcompanynames()
	{
	System.out.println("Amazon");
	System.out.println("Accenture");
    System.out.println("Mindtree");		
	}
    public static String printcompanynames(String companyname)	
	{
		System.out.println(companyname);
		return companyname;
	}
	public static void printcomputerbrands()
	{
	System.out.println("Lenovo");
	System.out.println("Dell");
	System.out.println("HP");
	}
	public static String printcomputerbrands(String brand)
	{
	    System.out.println(brand);
		return brand;
	}
	
	
	public static String printmobilebrands()
	{
		String[] firstbrand={"Redmi","Samsung","One plus"};
		System.out.println("Redmi");
		System.out.println("Samsung");
		System.out.println("One plus");
		return firstbrand[0];
	}
	
	public static String printiplteams()
	{
		String[] names={"Rcb","csk","dc","kkr","pbks","srh","rr","mi"};
		int index=names.length;
		String last=names[index-1];
		return last;
	
}
}
