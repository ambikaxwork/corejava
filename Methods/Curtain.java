class Curtain{
	private CurtainUsed curtainUsed;
	private String color;
	private float thickness,price;
	private boolean quality;
	
	CurtainUsed getCurtain()
	{
		return this.curtainUsed;
	}
	void setCurtain(CurtainUsed curtainUsed)
	{
		this.curtainUsed=curtainUsed;
	}
	String getColor()
	{
		return this.color;
	}
	void setColor(String color)
	{
		this.color;
	}
	float getThickness()
	{
		return this.thickness;
	}
	void setThickness(float thickness)
	{
		this.thickness=thickness;
	}
		float getPrice()
	{
		return this.price;
	}
	void setPrice(float price)
	{
		this.price=price;
	}
	boolean getQuality()
	{
		return this.quality;
	}
	void setQuality(boolean quality)
	{
		this.quality=quality;
	}
}