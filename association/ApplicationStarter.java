class ApplicationStarter{
	
	public static void main(String[] elephants)
	{
		Application application=new Application();
		application.name="java";
		application.version="1.17.1";
		application.company=new Company();
		Company company=application.company;
		company.name="oracle";
		company.ceo="safra catz";
		company.cfo="kanwar singh";
		company.country=new Country();
		Country country=company.country;
		country.name="India";
		country.code=91;
		application.displayDetails();
		company.displayDetails();
		country.displayDetails();
		
		Application application1=new Application();
		application1.name="e-commerce";
		application1.version="22.14.0.100";
		application1.company=new Company();
		Company company1=application1.company;
		company1.name="Amazon";
		company1.ceo="Andy jessy";
		company1.cfo="Brian T olsavsky";
		company1.country=new Country();
		Country country1=company.country;
		country1.name="America";
		country1.code=1;
		application1.displayDetails();
		company1.displayDetails();
		country1.displayDetails();
		
		Application application2=new Application();
		application2.name="facebook";
		application2.version="11.2";
		application2.company=new Company();
		Company company2=application2.company;
		company2.name="Facebook";
		company2.ceo="Mark Zukerberg";
		company2.cfo="David Warner";
		company2.country=new Country();
		Country country2=company.country;
		country2.name="America";
		country2.code=1;
		application2.displayDetails();
		company2.displayDetails();
		country2.displayDetails();
		
		Application application3=new Application();
		application3.name="whatsapp";
		application3.version="2.21.20.13";
		application3.company=new Company();
		Company company3=application3.company;
		company3.name="Whatsapp";
		company3.ceo="will Cathcart";
		company3.cfo="jan Koum";
		company3.country=new Country();
		Country country3=company3.country;
		country3.name="America";
		country3.code=1;
		application3.displayDetails();
		company3.displayDetails();
		country3.displayDetails();
		
		Application application4=new Application();
		application4.name="chipset";
		application4.version="1.4.x,Intel";
		application4.company=new Company();
		Company company4=application4.company;
		company4.name="Intel";
		company4.ceo="Patrick P.Gelsinger";
		company4.cfo="George S. Davis";
		company4.country=new Country();
		Country country4=company4.country;
		country4.name="America";
		country4.code=1;
		application4.displayDetails();
		company4.displayDetails();
		country4.displayDetails();
		

		
		
		
	}
}