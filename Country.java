class Country{
	public static String getcountrybypincode(int no)
	{
		if(no==91)
		{
			System.out.println("India");
			return "India";
		}
		if(no==010)
		{
			System.out.println("South korea");
			return "South korea";
		}
		if(no==94)
		{
			System.out.println("Sri lanka");
			return "Sri lanka";
		}
		return "NA";
		
	}
}