class CurrencyStarter{
	
	public static void main(String[] hairs)
	{
		Currency currency=new Currency();
		currency.name="Rupee";
		currency.value=1.0f;
		currency.country=new Country();
		Country country=currency.country;
		country.name="India";
		country.code=91;
		currency.displayDetails();
		country.displayDetails();
		
		Currency currency1=new Currency();
		currency1.name="dollar";
		currency1.value=1.0f;
		currency1.country=new Country();
		Country country1=currency1.country;
		country1.name="America";
		country1.code=1;
		currency1.displayDetails();
		country1.displayDetails();
		
		Currency currency2=new Currency();
		currency2.name="pound";
		currency2.value=1.0f;
		currency2.country=new Country();
		Country country2=currency2.country;
		country2.name="london";
		country2.code=44;
		currency2.displayDetails();
		country2.displayDetails();
		
		Currency currency3=new Currency();
		currency3.name="ringgit";
		currency3.value=1.0f;
		currency3.country=new Country();
		Country country3=currency3.country;
		country3.name="malyasia";
		country3.code=60;
		currency3.displayDetails();
		country3.displayDetails();
		
		Currency currency4=new Currency();
		currency4.name="ringgit";
		currency4.value=1.0f;
		currency4.country=new Country();
		Country country4=currency4.country;
		country4.name="veitnum";
		country4.code=60;
		currency4.displayDetails();
		country4.displayDetails();
	
		
		
	}
}