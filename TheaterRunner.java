class TheaterRunner{
	public static void main(String[] roses)
	{
		TicketPrice tp=TicketPrice.GANDHI;
		System.out.println(tp.price);
		TicketPrice btp=TicketPrice.BALCONY;
		System.out.println(btp.price);
		System.out.println(btp.tax);
		System.out.println(TicketPrice.BOX.price+ TicketPrice.BOX.tax);
	}
}