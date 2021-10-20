package com.xworkz.core.app;

public class Actor {
	public String movie;
	public String getMovie() {
		return this.movie;
	}
	public void setMovie(String movie) {
	this.movie=movie;
		if(movie=="KGF")
		{
			String[] actors= {"yash","Srinidhi","Ananthnag","malvika"};
			for(int i=0;i<actors.length;i++) {
		
				System.out.println(actors[i]);
			}
		}
		if(movie=="shershah")
		{
			String[] actor= {"kaira","siddarth"};
			for(int i=0;i<actor.length;i++)
			{
				System.out.println(actor[i]);
			}
		}
		
	}
	
		// TODO Auto-generated constructor stub
	

}
