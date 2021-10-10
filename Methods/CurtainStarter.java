class CurtainStarter{
	 public static void main(String[] cheers)
	 {
		 Curtain curtain=new Curtain();
		 curtain.setCurtain(CurtainUsed.DOOR);
		 CurtainUsed curtainused=curtain.getCurtain();
		 System.out.println(curtainused);
		 curtain.setColor("Red");
		 //curtain.setColor("blue");
		 String color=curtain.getColor();
		 //curtain.color="blue";
		 System.out.println(color);
		 curtain.setThickness(2.5f);
		 float thickness=curtain.getThickness();
		 System.out.println(thickness);
		 curtain.setPrice(700);
		 float price=curtain.getPrice();
		 System.out.println(price);
		 curtain.setQuality(true);
		 boolean quality=curtain.getQuality();
		 System.out.println(quality);
		 
	 }
}