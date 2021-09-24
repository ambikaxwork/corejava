class DeveloperTester{
	public static void main(String[] laddu)
	{
		String dname="narayana";
		String ddesignation="java developer";
		float dsalary=50000;
		float dtoatlExp=3.5f;
		DeveloperProg ref=new DeveloperProg(dname,ddesignation,dsalary,dtoatlExp);
		System.out.println(ref.name);
		System.out.println(ref.designation);
		System.out.println(ref.salary);
		System.out.println(ref.toatlExp);
	}
}