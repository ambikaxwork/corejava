class Product{
	static String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float total;
	
	void displayDetails()
	{
		System.out.println(this.vendor);
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.total);
	}
	
	static void dispalyDetail()
	{
		System.out.println(name);
		System.out.println(total);
	}
}