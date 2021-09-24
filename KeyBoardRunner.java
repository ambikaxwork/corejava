class KeyBoardRunner{
	public static void main(String[] jasmin)
	{
		String kname="Dell";
		int kkeys=104;
		int kalphabets=26;
		float kprice=650.0f;
		KeyBoard key=new KeyBoard(kname,kkeys,kalphabets,kprice );
		System.out.println(key.brandName);
		System.out.println(key.noOfKeys);
		System.out.println(key.noOfAlpahbets);
		System.out.println(key.price);
		
	}

}