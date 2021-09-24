class LocationRunner{
	public static void main(String[] laddu)
	{
		String lname="shimoga";
		String lstate="karnataka";
		String lfamousfor="falls";
		String ltimetovisit="rainy season";
		Location ref=new Location(lname, lstate,lfamousfor,ltimetovisit);
		System.out.println(ref.name);
		System.out.println(ref.state);
		System.out.println(ref.famousfor);
		System.out.println(ref.besttimetovisit);
	}
}