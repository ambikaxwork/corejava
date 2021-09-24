class WeaponRunner{
	public static void main(String[] args)
	{
		String wname="gun";
	    float wprice=250;
	    int wnoOfWeapons=4;
	    String wcolor="black";
	    String wtype="shotgun";
	    int wsize=94;
	    float wweight=50;
		Weapon ref=new Weapon(wname,wprice,wnoOfWeapons,wcolor,wtype,wsize,wweight);
		System.out.println(ref.name);
		System.out.println(ref.price);
		System.out.println(ref.noOfWeapons);
		System.out.println(ref.color);
		System.out.println(ref.type);
		System.out.println(ref.size);
		System.out.println(ref.weight);
		
		String weName="gun";
	    float wePrice=2500;
	    int weNoOfWeapons=5;
	    String weColor="pistol";
		Weapon ref1=new Weapon(weName,wePrice,weNoOfWeapons,weColor);
		System.out.println(ref1.name);
		System.out.println(ref1.price);
		System.out.println(ref1.noOfWeapons);
		System.out.println(ref1.color);
		
		String weaType="Rifle";
	    int weaSize=100;
	    float weaWeight=5000;
		Weapon ref2=new Weapon(weaType,weaSize,weaWeight);
		System.out.println(ref2.type);
		System.out.println(ref2.size);
		System.out.println(ref2.weight);
		
		String weapName="Revolver";
	    float weapPrice=25500;
	    String weapColor="black";
	    String weapType="shotgun";
	    int weapSize=120;
	    float weapWeight=500;
		Weapon ref3=new Weapon(weapName,weapPrice,weapColor,weapType,weapSize,weapWeight);
		System.out.println(ref3.name);
		System.out.println(ref3.price);
		System.out.println(ref3.noOfWeapons);
		System.out.println(ref3.color);
		System.out.println(ref3.type);
		System.out.println(ref3.size);
		System.out.println(ref3.weight);
		
		String weapoName="Revolver";
	    float weapoPrice=25500;
	    String weapoType="shotgun";
	    int weapoSize=120;
	    float weapoWeight=500;
		Weapon ref4=new Weapon(weapoName,weapoPrice,weapoType,weapoSize,weapoWeight);
		System.out.println(ref4.name);
		System.out.println(ref4.price);
		System.out.println(ref4.color);
		System.out.println(ref4.type);
		System.out.println(ref4.size);
		System.out.println(ref4.weight);
		
		String weaponName="Revolver";
	    float weaponPrice=25500;
		Weapon ref5=new Weapon(weaponName,weaponPrice);
		System.out.println(ref5.name);
		System.out.println(ref5.price);
		
		String wname1="revolver";
	    float wprice1=25000;
		int wnoOfWeapons1=10;
	    String wcolor1="black";
	    String wtype1="shotgun";
	    int wsize1=94;
	    float wweight1=50;
		Weapon ref6=new Weapon(wname1,wprice1,wnoOfWeapons1,wcolor1,wtype1,wsize1,wweight1);
		System.out.println(ref6.name);
		System.out.println(ref6.price);
		System.out.println(ref6.noOfWeapons);
		System.out.println(ref6.color);
		System.out.println(ref6.type);
		System.out.println(ref6.size);
		System.out.println(ref6.weight);
		
		String weaponName1="pistol";
	    float weaponPrice1=25500;
		Weapon ref7=new Weapon(weaponName1,weaponPrice1);
		System.out.println(ref7.name);
		System.out.println(ref7.price);
		
		String weaponName2="revolver";
	    float weaponPrice2=35500;
		Weapon ref8=new Weapon(weaponName2,weaponPrice2);
		System.out.println(ref8.name);
		System.out.println(ref8.price);
		
		String weaponName3="knife";
	    float weaponPrice3=2500;
		Weapon ref9=new Weapon(weaponName3,weaponPrice3);
		System.out.println(ref9.name);
		System.out.println(ref9.price);
		
		
		
		
	}
}