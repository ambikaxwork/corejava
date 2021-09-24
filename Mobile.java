class Mobile{
	public static void main(String[] mob)
	{
		String brand=mob[0];
		String color=mob[1];
		String model=mob[2];
		float price=Float.parseFloat(mob[3]);
		int quantity=Integer.parseInt(mob[4]);
		String imei=mob[5];
		String country=mob[6];
		float total=MobileProgram.getdetailsofmobile(brand,color,
		model,price,quantity,imei,country);
		System.out.println("total price "+total);
	}
}