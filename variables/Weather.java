class Weather{
	
	WeatherType type=WeatherType.CLOUDY;
	float temperature;
	float humidity;
	String windSpeed;
	
	Weather(float temperature,float humidity)
	{
		System.out.println("invoking float,float");
		this.temperature=temperature;
		this.humidity=humidity;
	}
}