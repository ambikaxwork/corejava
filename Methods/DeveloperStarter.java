class DeveloperStarter{
	static public void main(String[] cakes)
	{
		Developer developer=new Developer();
		developer.setName("Ambika");
		System.out.println(developer.getName());
		developer. setDesignation("frontend developer");
		System.out.println(developer.getDesignation());
		developer.setSalary(25000.0f);
		System.out.println(developer.getSalary());
		developer.setExperience(2.5f);
		System.out.println(developer.getExperience());
		developer.setAge(21);
		System.out.println(developer.getAge());
		
		
	}
}