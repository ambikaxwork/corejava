class NameAndDob{
	public static String getnamebydob(int d, int m, long y)
	{
		if(d==4&&m==07&&y==2000)
		{
			System.out.println("name is Ambika");
			return "Ambika";
		}
				if(d==1&&m==11&&y==1996)
		{
			System.out.println("name is Sush");
			return "Sush";
		}
				if(d==8&&m==11&&y==1999)
		{
			System.out.println("name is Anu");
			return "Anu";
		}
				
		return "name is not found";
	}
}