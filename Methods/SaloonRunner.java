class SaloonRunner{
	public static void main(String[] wines)
	{
		Saloon saloon=new Saloon();
		saloon.name="green trends";
		saloon.location="BTM";
		saloon.openTime=9.30f;
		saloon.closeTime=8.0f;
		saloon.branch=SaloonBranch.BTM;
		
		Saloon saloon1=new Saloon();
		saloon1.name="YLG";
		saloon1.location="JAYNAGAR";
		saloon1.openTime=9.0f;
		saloon1.closeTime=10.0f;
		saloon1.branch=SaloonBranch.JAYNAGAR;
		
		saloon.haircut();
		saloon1.haircut();
	}
}