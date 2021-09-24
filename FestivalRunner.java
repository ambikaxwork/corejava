class FestivalRunner{
	public static void main(String[] args)
	{
	String festivalName1="ganesha";
	String religiontype1="hindu";
	String famousFor1="ganesha";
	int celebrationDays1=5;
	String famousDish1="modka";
	Festival ref1=new Festival(festivalName1,religiontype1,famousFor1,celebrationDays1,famousDish1);
	System.out.println(ref1.festivalName);
	System.out.println(ref1.type);
	System.out.println(ref1.famousFor);
	System.out.println(ref1.celebrationDays);
	System.out.println(ref1.famousDish);
	
	String festivalName2="deepavali";
	String religiontype2="hindu";
	String famousFor2="lights";
	int celebrationDays2=3;
	String famousDish2="obbattu";
	Festival ref2=new Festival(festivalName2,religiontype2,famousFor2,celebrationDays2,famousDish2);
	System.out.println(ref2.festivalName);
	System.out.println(ref2.type);
	System.out.println(ref2.famousFor);
	System.out.println(ref2.celebrationDays);
	System.out.println(ref2.famousDish);
	
	String festivalName3="deepavali";
	String religiontype3="hindu";
	String famousFor3="lights";
	int celebrationDays3=3;
	Festival ref3=new Festival(festivalName3,religiontype3,famousFor3,celebrationDays3);
	System.out.println(ref3.festivalName);
	System.out.println(ref3.type);
	System.out.println(ref3.famousFor);
	System.out.println(ref3.celebrationDays);
	
	String festivalName4="deepavali";
	String religiontype4="hindu";
	String famousFor4="lights";
	Festival ref4=new Festival(festivalName4,religiontype4,famousFor4);
	System.out.println(ref4.festivalName);
	System.out.println(ref4.type);
	System.out.println(ref4.famousFor);

    String festivalName5="deepavali";
	String religiontype5="hindu";
	Festival ref5=new Festival(festivalName5,religiontype5);
	System.out.println(ref5.festivalName);
	System.out.println(ref5.type);
	
	String festivalName6="deepavali";
	Festival ref6=new Festival(festivalName6);
	System.out.println(ref6.festivalName);
	System.out.println(ref6.type);
	
	String festivalName7="deepavali";
	int celebrationDays7=3;
	Festival ref7=new Festival(festivalName7,celebrationDays7);
	System.out.println(ref7.festivalName);

	System.out.println(ref7.celebrationDays);
	
	
	int celebrationDays8=3;
	Festival ref8=new Festival(celebrationDays8);
	System.out.println(ref8.celebrationDays);
	
	String festivalName9="deepavali";
	String religiontype9="hindu";
    Festival ref9=new Festival(festivalName9,religiontype9);
	System.out.println(ref9.festivalName);
	System.out.println(ref9.type);
	
	int celebrationDays10=3;
	String famousFor10="lights";
	Festival ref10=new Festival(celebrationDays10,famousFor10);
	System.out.println(ref10.celebrationDays);
	System.out.println(ref10.famousFor);
	
	}
}