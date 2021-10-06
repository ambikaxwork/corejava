class FoodItemStarter{
	public static void main(String[] jasmines)
	{
		FoodItem foodItem=new FoodItem("biryani",250,"Isiri",2,Type.NONVEG,4.5,OrderType.ONLINE);
		foodItem.displayDetails();
		foodItem.printTotalPrice();
		FoodItem.printTotalFoodItemPrice();
		foodItem.printHotelName();
		foodItem.PrintNameAndPrice();
	}
}