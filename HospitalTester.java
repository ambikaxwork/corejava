class HospitalTester{
	public static void main(String[] laddu)
	{
		String dname="narayana";
		String ddesignation="shimoga";
		float dsalary=50;
		float dtoatlExp="yadiyurappa";
		Hospital ref=new Hospital(dname,ddesignation,dsalary,dtoatlExp);
		System.out.println(ref.name);
		System.out.println(ref.designation);
		System.out.println(ref.salary);
		System.out.println(ref.toatlExp);
	}
}