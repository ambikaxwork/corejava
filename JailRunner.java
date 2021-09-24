class JailRunner{
	public static void main(String[] ganesha)
	{
		String location="bellary";
		String name="bellary centaral jail";
		int yearOfconst=1872;
		Jail jail=new Jail(location,name,yearOfconst);
		System.out.println(jail.location);
		System.out.println(jail.name);
		System.out.println(jail.yearOfConstruction);
		System.out.println(jail.noOfCell);
		System.out.println(jail.personnel);
		System.out.println(jail.areaInAcres);
		System.out.println(jail.noOfCriminals);
		
	}
}