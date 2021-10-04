class MuseumRunner{
	public static void main(String[] panipuri)
	{
		Museum mus=new Museum();
		mus.display();
		//String ref="sdf";
		//Object mus2=ref;
		//System.out.println(mus2);
		Museum mus1=mus;
		mus1.display();
		mus1=mus;
	}
}