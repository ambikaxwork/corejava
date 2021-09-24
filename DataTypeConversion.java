class DataTypeConversion{
	public static void main(String[] tokyo)
	{
		String s="1";
		byte s1=Byte.parseByte(s);
		System.out.println(s1);
		String st="122";
		short st1=Short.parseShort(st);
		System.out.println(st1);
		String str="1234";
		int str1=Integer.parseInt(str);
		System.out.println(str1);
		String s2="12345567";
		long lng=Long.parseLong(s2);
		System.out.println(lng);
		String s3="1123.345";
		float flt=Float.parseFloat(s3);
		System.out.println(flt);
		String s4="1324.12345678";
		double dbl=Double.parseDouble(s4);
		System.out.println(dbl);
		String s5="true";
		boolean bool=Boolean.parseBoolean(s5);
		System.out.println(bool);
		String ch="Ambika";
		for(int i=0;i<ch.length();i++)
		{
		char ch1=ch.charAt(i);
		System.out.println("Character at "+i+" position: "+ch1);
		}
	}
}