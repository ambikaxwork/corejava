class MedicineProgram{
	public static float getTotalPriceofmedicine(String name,String company,float price,int quantity)
	{
		System.out.println("getTOtalPriceofmedicine");
		System.out.println("name "+name);
		System.out.println("company name "+company);
		System.out.println("price "+price);
		System.out.println("quantuty "+quantity);
		float total=quantity*price;
		return total;
		
	}
}