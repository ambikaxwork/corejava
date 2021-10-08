class MovieTicket{
	String movieName;
	String theater;
	float price;
	int noOfSeats;
	float totalPrice;
	
	MovieTicket(String movieName,String theater,float price,int noOfSeats)
	{
		this.movieName=movieName;
		this.theater=theater;
		this.price=price;
		this.noOfSeats=noOfSeats;
	}
	
	void displayDetails()
	{
		System.out.println(movieName);
		System.out.println(theater);
		System.out.println(price);
	    System.out.println(noOfSeats);
		
	}
	void printTotalPrice()
	{
		totalPrice=noOfSeats*price;
		System.out.println(totalPrice);
	}
}