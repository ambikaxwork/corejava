class Temperature{
	public static String getfeelingsbytemp(float temp)
	{
		if(temp>30 && temp<40)
		{
			System.out.println("temp is hot");
			return "hot";
		}
				if(temp>40 && temp<50)
		{
			System.out.println("temp is too hot");
			return "too hot";
		}
				if(temp>25 && temp<30)
		{
			System.out.println("temp is cloudy");
			return "cloudy";
		}
				if(temp>20 && temp<25)
		{
			System.out.println("temp is too cloudy");
			return "cloudy";
		}
				if(temp>20 && temp<26)
		{
			System.out.println("temp is mostly rainy");
			return "rainy";
		}
				if(temp>15 && temp<20)
		{
			System.out.println("temp is cold");
			return "cold";
		}
		
				if(temp>10 && temp<20)
		{
			System.out.println("temp is too cold");
			return "too cold";
		}
				if(temp>18 && temp<26)
		{
			System.out.println("temp is normal");
			return "normal";
		}
				if(temp>5 && temp<10)
		{
			System.out.println("temp is freez");
			return "freez";
		}
		return "invalid temp";
	}
}