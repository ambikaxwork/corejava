package com.xworkz.inheritance.inherit;

public class InstagramDTO extends ApplicationDTO{
	private long totalUsers;
	private String serverLocation;
	public InstagramDTO() {
		System.out.println("invoked no-arg InstagramDTO constructor");
	}
	public InstagramDTO(long totalUsers, String serverLocation) {
		super("Instagram","2.19.186","instagram","koum");
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}
	public long getTotalUsers() {
		return totalUsers;
	}
	public void setTotalUsers(long totalUsers) {
		this.totalUsers = totalUsers;
	}
	public String getServerLocation() {
		return serverLocation;
	}
	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}
	
	
	

}
