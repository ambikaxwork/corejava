class CricketTeamRunner{
	public static void main(String[] args)
	{
	String teamName1="India";
	int noOfPlayer1=11;
	String jersyColor1="blue";
	String captainName1="virat kohli";
	CricketTeam ref1=new CricketTeam(teamName1,noOfPlayer1,jersyColor1,captainName1);
	System.out.println(ref1.teamName);
	System.out.println(ref1.noOfPlayer);
	System.out.println(ref1.jersyColor);
	System.out.println(ref1.captainName);
	
	String teamName2="england";
	int noOfPlayer2=11;
	String jersyColor2="sky blue";
	String captainName2="Eoin Morgan";
	CricketTeam ref2=new CricketTeam(teamName2,noOfPlayer2,jersyColor2,captainName2);
	System.out.println(ref2.teamName);
	System.out.println(ref2.noOfPlayer);
	System.out.println(ref2.jersyColor);
	System.out.println(ref2.captainName);
	
	String teamName3="sri lanka";
	int noOfPlayer3=11;
	String jersyColor3="blue and yellow";
	String captainName3="Dimuth Karunaratne";
	CricketTeam ref3=new CricketTeam(teamName3,noOfPlayer3,jersyColor3,captainName3);
	System.out.println(ref3.teamName);
	System.out.println(ref3.noOfPlayer);
	System.out.println(ref3.jersyColor);
	System.out.println(ref3.captainName);
	
	String teamName4="west Indies";
	int noOfPlayer4=11;
	String jersyColor4="maroon";
	String captainName4="pollard";
	CricketTeam ref4=new CricketTeam(teamName4,noOfPlayer4,jersyColor4,captainName4);
	System.out.println(ref4.teamName);
	System.out.println(ref4.noOfPlayer);
	System.out.println(ref4.jersyColor);
	System.out.println(ref4.captainName);
	
	String teamName5="west Indies";
	int noOfPlayer5=11;
	CricketTeam ref5=new CricketTeam(teamName5,noOfPlayer5);
	System.out.println(ref5.teamName);
	System.out.println(ref5.noOfPlayer);
	
	String teamName6="west Indies";
	int noOfPlayer6=11;
	String jersyColor6="maroon";
	CricketTeam ref6=new CricketTeam(teamName6,noOfPlayer6,jersyColor6);
	System.out.println(ref6.teamName);
	System.out.println(ref6.noOfPlayer);
	System.out.println(ref6.jersyColor);
	
	String teamName7="west Indies";
	int noOfPlayer7=11;
	String captainName7="pollard";
	CricketTeam ref7=new CricketTeam(teamName7,noOfPlayer7,captainName7);
	System.out.println(ref7.teamName);
	System.out.println(ref7.noOfPlayer);
	System.out.println(ref7.captainName);
	
	String teamName8="west Indies";
	String captainName8="pollard";
	CricketTeam ref8=new CricketTeam(teamName8,captainName8);
	System.out.println(ref8.teamName);
	System.out.println(ref8.captainName);
	
	String jersyColor9="maroon";
	String captainName9="pollard";
	CricketTeam ref9=new CricketTeam(jersyColor9,captainName9);
	System.out.println(ref8.jersyColor);
	System.out.println(ref8.captainName);
	
	String teamName10="india";
	String jersyColor10="blue";
	String captainName10="virat kohli";
	CricketTeam ref10=new CricketTeam(teamName10,jersyColor10,captainName10);
	System.out.println(ref10.jersyColor);
	System.out.println(ref10.captainName);
	}
}