class PhoneNumber{
	public static void main(String[] values)
	{
		long ph1=9844722672l;
		long ph2=6361552810l;
		long ph3=7349593631l;
		
		long[] phonenos={ph1,ph2,ph3,9880848621l};
		int size=phonenos.length;
		System.out.println(size);
		phonenos[1]=9731271361l;
		System.out.println(phonenos[1]);
		
	}
}