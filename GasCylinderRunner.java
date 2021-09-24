class GasCylinderRunner{
	public static void main(String[] apples)
	{
		float price=880f;
		float weight=14.2f;
		GasCylinder cylinder=new GasCylinder(price,weight);
		{   cylinder.name=Company.HPGAS;
		    cylinder.size=BoxSize.LARGE;
			System.out.println(cylinder.price);
			System.out.println(cylinder.weight);
			System.out.println(cylinder.number);
			System.out.println(cylinder.size);
			System.out.println(cylinder.name);

		}
	}
}