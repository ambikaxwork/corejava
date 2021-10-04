class GrinderStarter{
	public static void main(String[] dosas)
	{
		int capacity=250;
		Motor motor=new Motor();
		//motor.rpm=455;
		
		Grinder grinder=new Grinder(250,motor);
		
		
		grinder.company="prestige";
		System.out.println(grinder.company);
		System.out.println(grinder.capacity);
		System.out.println(motor.model);
		System.out.println(motor.rpm);
		
	}
}