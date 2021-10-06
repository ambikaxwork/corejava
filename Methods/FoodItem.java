class FoodItem
{
	String name;
	float price;
	String hotelName;
	int quantity;
	Type type;
	float rating;
	OrderType otype;
    float totalPrice;
	static float foodItemPrice;
	static String hotelNames="";
	static String nameAndPrice="";
	
	FoodItem(String name,float price,String hotelName,int quantity,Type type,float rating,
	OrderType otype)
	{
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.quantity=quantity;
		this.type=type;
		this.rating=rating;
		this.otype=otype;
	}
	void displayDetails()
	{
		System.out.println("\n"+this.name);
		System.out.println(this.hotelName);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.rating);
		System.out.println(this.otype);
		//System.out.println(totalPrice);
		//System.out.println(foodItemPrice);
	}
	void printTotalPrice()
	{
	  totalPrice=this.quantity*this.price;
	  System.out.println("Total:"+totalPrice);
	  foodItemPrice=foodItemPrice+totalPrice;
	  hotelNames=hotelNames+this.hotelName+" ";
	  nameAndPrice=nameAndPrice+this.name+"-"+this.price;
	
	}
	static void printTotalFoodItemPrice()
	{
		 
		 System.out.println("Total Price:"+foodItemPrice);
	}
	static void printHotelName()
	{
		
	System.out.println("Hotel:"+hotelNames);	
	}
	static void PrintNameAndPrice()
	{
		System.out.println("nameAndPrice:"+nameAndPrice);
		
	}
}