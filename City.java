class City{
	public static String getcitybypincode(int no)
	{
		if(no==577201)
		{
			System.out.println("Shimoga");
			return "Shimoga";
		}
		if(no==577428)
		{
			System.out.println("Shiralakoppa");
			return "Shiralakoppa";
		}
		if(no==577401)
		{
			System.out.println("Sagara");
			return "Sagara";
		}
		return "NA";
	}
}