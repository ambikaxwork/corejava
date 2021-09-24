class HospitalRunner{
	public static void main(String[] laddu)
	{
		String name="narayana";
		String location="shimoga";
		int beds=50;
		String ownername="yadiyurappa";
		Hospital ref=new Hospital(name,location,beds,ownername);
		System.out.println(ref.name);
		System.out.println(ref.location);
		System.out.println(ref.noOfBeds);
		System.out.println(ref.owner);
	}
}