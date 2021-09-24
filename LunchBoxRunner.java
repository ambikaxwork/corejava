class LunchBoxRunner{
	public static void main(String[] ganesha)
	{
		String typeOfBox="plastic";
		int noOfBox=2;
		LunchBox box=new LunchBox(typeOfBox,noOfBox);
		{
		System.out.println(box.typeOfBox);
		System.out.println(box.noOfBox);
		System.out.println(box.weight);
		System.out.println(box.color);
		System.out.println(box.size);
		}
	}
}