class ToothBrusher{
	public static void main(String[] brush)
	{
	//class_type ref_var_name=new class_type()
	ToothBrush bref=new ToothBrush();
    String brand=bref.brand;	
    System.out.println(brand);
	String color=bref.color;
	System.out.println(color);
	float cost1=bref.cost;
	System.out.println(cost1);
	String type=bref.brushtype;
	System.out.println(type);
	int tufts=bref.noOftufts;
	System.out.println(tufts);
	String stiff=bref.stiffness;
	System.out.println(stiff);
	float area=bref.area;
	System.out.println(area);     	
	}
	
}