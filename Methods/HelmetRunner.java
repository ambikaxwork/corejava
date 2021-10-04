class HelmetRunner{
	public static void main(String[] deers)
	{
		Helmet helmet=new Helmet();
		helmet.ownerName="Ambika";
		helmet.weight=1.0f;
		helmet.companyName="honda";
		helmet.thickness=10.0f;
		helmet.glass=true;
		
		Helmet helmet1=new Helmet();
		helmet1.ownerName="Ambika";
		helmet1.weight=2.0f;
		helmet1.companyName="tvs";
		helmet1.thickness=0.9f;
		helmet1.glass=false;
		
		helmet.protection();
		helmet1.protection();
	}
}