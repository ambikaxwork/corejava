class ForestStarter{
	
	public static void main(String[] jumkas)
	{
		Forest forest=new Forest("lakkavalli",true);
		System.out.println(forest.location);
		System.out.println(forest.reserved);
		
		forest.state=new State();
		State state=forest.state;
		state.name="karnataka";
		System.out.println(state.name);
		System.out.println(state.noOfDistricts);
		System.out.println(state.cmName);
	
		state.capitalCity=new CapitalCity();
		CapitalCity city =state.capitalCity;
		String capital="banglore";
		city.famousFor="temples";
		System.out.println(city.name);
		System.out.println(city.population);
		System.out.println(city.famousFor);
		
		Forest forest1=new Forest(state);
		forest1.name="Namdapha";
		forest1.location="changlang";
		System.out.println(forest1.name);
		System.out.println(forest1.location);
		forest1.state=new State(30,city);
		State state1=forest1.state;
		state1.name="Arunachal pradesh";
		System.out.println(state1.name);
		System.out.println(state1.noOfDistricts);
		
		state1.capitalCity=new CapitalCity("falls");
		CapitalCity city1=state1.capitalCity;
		System.out.println(city1.famousFor);
		
		forest1.state=new State("karnataka","Ambika");
		State state2=forest1.state;
		System.out.println(state2.name);
		System.out.println(state2.cmName);
		System.out.println(city1.name);
		System.out.println(city1.population);
		
		
	}
}