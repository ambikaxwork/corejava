class MatchBoxRunner{
	public static void main(String[] roses)
	{
		String brandName="Dinky";
		int sticks=50;
		MatchBox box=new MatchBox(brandName,sticks);
		{
			System.out.println(box.noOfSticks);
			System.out.println(box.brand);
		    box.size=BoxSize.LARGE;
			System.out.println(box.size);

			System.out.println(box.empty);
			
		}
	}
}