class LaboratoryRunner{
	public static void main(String[] roses)
	{
		String name="Electrical lab";
		String location="2nd floor";
		int rooms=5;
		String[] operators={"resistor","diode","capacitor"};
		Laboratory lab=new Laboratory(name,location,rooms,operators);
		{
			System.out.println(lab.name);
			System.out.println(lab.location);
			System.out.println(lab.noOfRooms);
			System.out.println(lab.type);
			System.out.println(lab.operatorNames[0]);
			lab.type=LabType.ELECTRICAL;
			System.out.println(lab.type);
		}
	}
}