class Demo{
	enum meal{
		BREAKFAST(5),LUNCH(10),SNACKS(15),DINNER(20);
		int value;
		meal(int value){
			this.value=value;
		}
	}
	public static void main(String[] sheeps){
		
	meal[] value=meal.values();
	for(int size=0;size<value.length;size++)
	{
		meal temp=value[size];
		System.out.println(temp);
		//for(meal m:meal.values())
		//System.out.println(m+" "+m.value);
	}
	//meal values=meal.value(0);
	//System.out.println(meal.BREAKFAST.ordinal());
	}
}
	
	
