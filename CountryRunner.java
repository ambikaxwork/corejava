class CountryRunner{
	public static void main(String[] roses)
	{
		String name="India";
		int states=29;
		String pmname="narendra modi";
		String wifename="savitha kovind";
		CountryProg ref=new CountryProg(name,states,pmname,wifename);
		System.out.println(ref.countryName);
		System.out.println(ref.noOfStates);
		System.out.println(ref.primeMinisterName);
		System.out.println(ref.presidentWifeName);



	}
}