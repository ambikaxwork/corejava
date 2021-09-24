class NartakiTheaterRunner{
	public static void main(String[] args)
	{
		Theater tr=new Theater("Nartaki",TicketPrice.BOX);
		{
			System.out.println(tr.name);
			System.out.println(tr.capacity);
			System.out.println(tr.ticketprice.price);
			System.out.println(tr.location="majestic");
			System.out.println(tr.areaInAcres);
			
		}
	}
}