class ContractorStarter{
	public static void main(String[] rabbits)
	{
		Contractor contractor=new Contractor();
		contractor.setName("Anusha");
		System.out.println(contractor.getName());
		contractor.setType(ContractorType.PRIVATE);
		System.out.println(contractor.getType());
		contractor.setSalary(25000);
		System.out.println(contractor.getSalary());
		contractor.setWorking(true);
		System.out.println(contractor.getWorking());
	}
}