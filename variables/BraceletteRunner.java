class BraceletteRunner{
	public static void main(String[] jasmins)
	{
		Bracelette bracelette=new Bracelette();
		//System.out.println("number of instances created:" + bracelette.count);
		
		Bracelette bracelette1=new Bracelette("diamond");
		System.out.println(bracelette1.type);
		
		Bracelette bracelette2=new Bracelette(100000.0f);
		System.out.println(bracelette2.cost);
		
		Bracelette bracelette3=new Bracelette("gold",50000.0f);
		System.out.println(bracelette3.type);
		System.out.println(bracelette3.cost);
		System.out.println("number of instances created:" + Bracelette.count);
		
	}
}