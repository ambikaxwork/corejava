class State{
	 
	 String name;
	 int noOfDistricts=30;
	 String cmName="Ambika";
	 CapitalCity capitalCity;
	 
	 State(String name,String cmName)
	 {
		 this.name=name;
		 this.cmName=cmName;
	 }
	 State(int noOfDistricts,CapitalCity capitalCity)
	 {
		 this.noOfDistricts=noOfDistricts;
		 this.capitalCity=capitalCity;
	 }
	 State()
	 {
		 
	 }
	 
	 
}