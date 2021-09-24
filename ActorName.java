class ActorName{
	public static String[] actorsnamebymovie(String movie)
	{System.out.println("movie name is " + movie);
		if(movie=="kgf")
		{
			String[] actor={"yash","ananthnag","srinidhi"};
			for(int i=0;i<actor.length;i++)
			{
			System.out.println(actor[i]);
			}
			return actor;
		}
		if(movie=="shershah")
		{
			String[] actors={"siddarth","kaira"};
			for(int i=0;i<actors.length;i++)
			{
			System.out.println(actors[i]);
			}
			return actors;
		}
		{
		System.out.println("no such movie found");	
		String[] empty={};
		return empty;
	}	
	}
}