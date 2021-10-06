class MovieTicket{
	String movieName;
	String theater;
	float price;
	int noOfSeats;
	float TotalPrice;
	
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
		TotalPrice=noOfSeats*price;
		System.out.println(TotalPrice);
	}
}