class PriceRunner{
	public static void main(String[] gubegalu)
	{
		String name=gubegalu[0];
		//String str=gubegalu[1];
		int quantity=Integer.parseInt(gubegalu[1]);
		System.out.println(quantity);
		//String s=gubegalu[2];
		float price=Float.parseFloat(gubegalu[2]);
		System.out.println(price);
		float total=PriceProgram.getTotalPrice(name,quantity,price);
		System.out.println("total price "+total);
	}
}