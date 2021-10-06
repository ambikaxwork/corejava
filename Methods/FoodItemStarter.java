class FoodItemStarter{
	public static void main(String[] jasmines)
	{
		FoodItem foodItem=new FoodItem("biryani",250,"Isiri",2,Type.NONVEG,4.0f,OrderType.ONLINE);
		foodItem.displayDetails();
		foodItem.printTotalPrice();
		//foodItem.printHotelName();
		//foodItem.PrintNameAndPrice();
		for(int i=0;i<foodItem.rating;i++)
		{
			System.out.print("*");
		}
	
		FoodItem foodItem1=new FoodItem("jamoon",100,"Anmol",3,Type.SWEET,3.5f,OrderType.OFFLINE);
		foodItem1.displayDetails();
		foodItem1.printTotalPrice();
		FoodItem.printHotelName();
		FoodItem.PrintNameAndPrice();
		FoodItem.printTotalFoodItemPrice();
		
		for(int i=0;i<foodItem1.rating;i++)
		{
			System.out.print("*");
		}
	}
}