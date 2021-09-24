class PriceProgram{
	public static float getTotalPrice(String name,int quantity,float price)
	{
		System.out.println("getTOtalPrice");
		System.out.println("name "+name);
		System.out.println("quantuty "+quantity);
		System.out.println("price "+price);
		float total=quantity*price;
		return total;
		
	}
}