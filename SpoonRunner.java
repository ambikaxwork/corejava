class SpoonRunner{
	public static void main(String[] choc)
	{
		Spoon spoo=new Spoon();
		System.out.println(spoo.type);
		System.out.println(spoo.size);
		System.out.println(spoo.color);

		spoo.type="fork";	
		spoo.size=130;
		spoo.color="red";
		System.out.println(spoo.type);
		System.out.println(spoo.size);
		System.out.println(spoo.color);
		
		Spoon spoo1=new Spoon();
		spoo1.type="Soup spoon";	
		spoo1.size=100;
		spoo1.color="white";
		System.out.println(spoo1.type);
		System.out.println(spoo1.size);
		System.out.println(spoo1.color);
		
		Spoon spoo2=new Spoon();
		spoo2.type="dinner spoon";	
		spoo2.size=90;
		spoo2.color="silver";
		System.out.println(spoo2.type);
		System.out.println(spoo2.size);
		System.out.println(spoo2.color);
		
		Spoon spoo3=new Spoon();
		spoo3.type="dinner fork";	
		spoo3.size=130;
		spoo3.color="silver";
		System.out.println(spoo3.type);
		System.out.println(spoo3.size);
		System.out.println(spoo3.color);
		
		Spoon spoo4=new Spoon();
		spoo4.type="Tea spoon";	
		spoo4.size=100;
		spoo4.color="white";
		System.out.println(spoo4.type);
		System.out.println(spoo4.size);
		System.out.println(spoo4.color);
		
		Spoon spoo5=new Spoon();
		
		Spoon spoo6=new Spoon();
		
		System.out.println(spoo6.color==spoo5.color);
		
		
		
		
	}
}