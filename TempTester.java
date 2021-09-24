class TempTester{
	public static void main(String[] feeling)
	{float temp=40.5f;
		String temperature=Temperature.getfeelingsbytemp(temp);
		System.out.println(temperature);
		
		int d=4;
		int m=07;
		long y=2000;
		String personname=NameAndDob.getnamebydob(d,m,y);
		System.out.println(personname);
		
		String name="kgf";
		String[] actorname=ActorName.actorsnamebymovie(name);
		
				
			}
}