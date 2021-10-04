class WeatherRunner{
	public static void main(String[] chickens)
	{
		Weather weather=new Weather(24.0f,23.0f);
		weather.windSpeed="normal";
		System.out.println(weather.type);
		System.out.println(weather.temperature);
		System.out.println(weather.humidity);
		System.out.println(weather.windSpeed);
	}
}