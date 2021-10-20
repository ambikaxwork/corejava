package com.xworkz.wrapper;

public class WrapperRunner {

	public static void main(String[] args) {
		String name="Ambika";
		int age=21;
		Integer age1=31;
		
		//age1=age1.intValue();
		System.out.println(age1.intValue());
		System.out.println(age1.valueOf(age));
		System.out.println(age1.equals(age));
		System.out.println(age==age1);
		System.out.println(age1.compareTo(age1));
		
		//Boolean
		boolean job=true;
		Boolean job1=false;
		System.out.println(job1.booleanValue());
		System.out.println(job1.valueOf(job));
		System.out.println(job1.compare(job, job1));
		System.out.println(job1.compareTo(job));
		System.out.println(job1.equals(job));
		System.out.println(job1.toString());
		
		//Float
		float salary=25000.0f;
		Float salary1=30000f;
		System.out.println(salary1.floatValue());
		System.out.println(Float.valueOf(salary));
		System.out.println(salary1.compareTo(salary));
		System.out.println(salary1.equals(salary));
		System.out.println(salary1.toString());
		
		//Character
		char n='A';
		Character name1='A';
		System.out.println(Character.valueOf(n));
		System.out.println(name1.charValue());
		System.out.println(name1.equals(n));
		System.out.println(name1.compareTo(n));
		System.out.println(name1.hashCode());
		System.out.println(name1.toString());
		
		//Double
		double experience=3.5;
		Double experience1=5.6;
		System.out.println(Double.valueOf(experience));
		System.out.println(experience1.doubleValue());
		System.out.println(experience1.equals(experience));
		System.out.println(experience1.compareTo(experience));
		System.out.println(experience1.toString());
		
		//Long
		long income=3500000;
		Long income1=6000000l;
		System.out.println(Long.valueOf(income));
		System.out.println(income1.longValue());
		System.out.println(income1.compareTo(income));
		System.out.println(income1.equals(income));
		System.out.println(income1.toString());
		
		//Short
		short workingHours=8;
		Short wHours1=10;
		System.out.println(Short.valueOf(workingHours));
		System.out.println(wHours1.shortValue());
		System.out.println(wHours1.compareTo(workingHours));
		System.out.println(wHours1.compareTo(workingHours));
		System.out.println(wHours1.equals(workingHours));
		
		//Byte
		byte wDays=5;
		Byte wDays1=6;
		System.out.println(Byte.valueOf(wDays));
		System.out.println(wDays1.shortValue());
		System.out.println(wDays1.compareTo(wDays));
		System.out.println(wDays1.compareTo(wDays));
		System.out.println(wDays1.equals(wDays));
		
		Integer integer=new Integer(31);
		System.out.println(integer==age1);
		System.out.println(integer.equals(age1));
		System.out.println(integer.getClass().getName());
		
		Float f=new Float(25000);
		System.out.println(f==salary1);
		System.out.println(f.equals(salary1));
		System.out.println(f.getClass().getName());
		
		Character c=new Character('A');
		System.out.println(c==name1);
		System.out.println(c.equals(name1));
		System.out.println(c.getClass().getName());
		
		Long l=new Long(3500000);
		System.out.println(l==income1);
		System.out.println(l.equals(income1));
		System.out.println(l.getClass().getName());
		
		Double d=new Double(experience);
		System.out.println(d==experience);
		System.out.println(d.equals(experience));
		System.out.println(d.getClass().getName());
		
		Byte b=new Byte(wDays);
		System.out.println(b==wDays1);
		System.out.println(b.equals(wDays1));
		System.out.println(b.getClass().getName());
		
		Short s=new Short(wHours1);
		System.out.println(s==wHours1);
		System.out.println(s.equals(wHours1));
		System.out.println(s.getClass().getName());
		
		
		
		
		
		
		
		

	}

}
