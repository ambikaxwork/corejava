class Medicine{
	public static void main(String[] med)
	{
		String name=med[0];
		String company=med[1];
		float price=Float.parseFloat(med[2]);
		System.out.println(price);
		int quantity=Integer.parseInt(med[3]);
		System.out.println(quantity);
		float total=MedicineProgram.getTotalPriceofmedicine(name,company,price,quantity);
		System.out.println("total price "+total);
		
		String name1=med[4];
		String company1=med[5];
		float price1=Float.parseFloat(med[6]);
		System.out.println(price1);
		int quantity1=Integer.parseInt(med[7]);
		System.out.println(quantity1);
		float total1=MedicineProgram.getTotalPriceofmedicine(name1,company1,price1,quantity1);
		System.out.println("total price "+total1);
}
}