class MobileProgram{
public static float getdetailsofmobile(String brand,String color,
String model,float price,int quantity,String imei,String country)
	{
		System.out.println("getdetailsofmobile");
		System.out.println("brand "+brand);
		System.out.println("color  "+color);
		System.out.println("model "+model);
		System.out.println("price "+price);
		System.out.println("quantity "+quantity);
		System.out.println("imei "+imei);
		System.out.println("country "+country);

		float total=quantity*price;
		return total;
		
	}
}