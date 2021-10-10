class Contractor{
	
	private String name;
	private ContractorType type;
	private float salary;
	private boolean working;
	
	String getName()
	{
		return this.name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	ContractorType getType()
	{
		return this.type;
	}
	void setType(ContractorType type)
	{
		this.type=type;
	}
	float getSalary()
	{
		return this.salary;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	boolean getWorking()
	{
		return this.working;
	}
	void setWorking(boolean working)
	{
		this.working=working;
	}
}