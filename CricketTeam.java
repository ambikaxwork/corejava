class CricketTeam{
	String teamName;
	int noOfPlayer;
	String jersyColor;
	String captainName;
	
	CricketTeam(String teamName,int noOfPlayer,String jersyColor,String captainName)
	{
		this.teamName=teamName;
		this.noOfPlayer=noOfPlayer;
		this.jersyColor=jersyColor;
		this.captainName=captainName;
	}
	
	CricketTeam(String teamName,int noOfPlayer)
	{
		this.teamName=teamName;
		this.noOfPlayer=noOfPlayer;
	}
	
	CricketTeam(String teamName,int noOfPlayer,String jersyColor)
	{
		this.teamName=teamName;
		this.noOfPlayer=noOfPlayer;
		this.jersyColor=jersyColor;
	}
	
	CricketTeam(int noOfPlayer,String jersyColor,String captainName)
	{
		this.noOfPlayer=noOfPlayer;
		this.teamName=teamName;
		this.captainName=captainName;
	}
	
	CricketTeam(String teamName,String captainName)
	{
		this.teamName=teamName;
		this.captainName=captainName;
	}
	CricketTeam(String teamName)
	{
		this.teamName=teamName;
	}
	
	CricketTeam(String teamName,String jersyColor,String captainName)
	{   this.teamName=teamName;
	    this.jersyColor=jersyColor;
        this.captainName=captainName;		
		
	}
	
}