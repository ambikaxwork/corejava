class PrimeDetails{
	public static void main(String[] val)
	{
		PrimeMin.getPmDetails("Jawaharlal Nehru","India",74,"married","dead",16);
		PrimeMin.getPmDetails("Indira Gandhi","India",66,"married","dead",11);
		PrimeMin.getPmDetails("Barack Obama","America",60,"married","alive",8);



		String name=val[0];
		String companyname=val[1];
		float price=Float.parseFloat(val[2]);
		System.out.println(price);
		int quantity=Integer.parseInt(val[1]);
		System.out.println(quantity);
		float total=MedicineProgram.getTotalPriceofmedicine(name,companyname,price,quantity);
		System.out.println("total price "+total);
	}
}
	}
}