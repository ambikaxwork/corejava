class RunnersProgram{
	public static void main (String[] run)
	{
		PrintSomeDetails.printdreamcompany();
		String dreamcompany=PrintSomeDetails.printcompany("Amazon");
		
	PrintSomeDetails.printcompanynames();
	String companyname=PrintSomeDetails.printcompanynames("");
	
	PrintSomeDetails.printcomputerbrands();
	String computerbrands=PrintSomeDetails.printcomputerbrands("");
	System.out.println("computerbrands:"+computerbrands);
	
	PrintSomeDetails.printmobilebrands();
	String firstbrand=PrintSomeDetails.printmobilebrands();
	System.out.println("firstbrand:"+firstbrand);
	
	PrintSomeDetails.printiplteams();
	String lastteam=PrintSomeDetails.printiplteams();
	System.out.println("lastteam:"+lastteam);
	
	
	
	}
}