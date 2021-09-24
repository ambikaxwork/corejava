class Festival{
	String festivalName;
	String type;
	String famousFor;
	int celebrationDays;
	String famousDish;
	
	Festival(String festivalName,String type,String famousFor,int celebrationDays,String famousDish)
	{
		this.festivalName=festivalName;
		this.type=type;
		this.famousFor=famousFor;
		this.celebrationDays=celebrationDays;
		this.famousDish=famousDish;
	}
	
	Festival(String festivalName,String type,String famousFor,int celebrationDays)
	{
		this.festivalName=festivalName;
		this.type=type;
		this.famousFor=famousFor;
		this.celebrationDays=celebrationDays;
	}
	
	Festival(String festivalName,String type,String famousFor)
	{
		this.festivalName=festivalName;
		this.type=type;
		this.famousFor=famousFor;
	}
	
	Festival(String festivalName,String type)
	{
		this.festivalName=festivalName;
		this.type=type;
	}
	
	Festival(String festivalName)
	{
		this.festivalName=festivalName;
	}
	
	Festival(String festivalName,int celebrationDays)
		{
			this.festivalName=festivalName;
			this.celebrationDays=celebrationDays;
		}
		
	Festival(int celebrationDays)
	{
		
		this.celebrationDays=celebrationDays;
	}
	
	Festival(String festivalName,String type,int celebrationDays,String famousFor)
	{
	    this.festivalName=festivalName;
		this.type=type;
		this.celebrationDays=celebrationDays;
		this.famousFor=famousFor;
	}
	
	Festival(int celebrationDays,String famousFor)
	{
		this.celebrationDays=celebrationDays;
		this.famousFor=famousFor;
	}
	
}