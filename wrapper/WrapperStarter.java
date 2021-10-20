package com.xworkz.wrapper;

public class WrapperStarter {

	public static void main(String[] args) {
    String name="Ambika";
    String choclateName="kitkat";
    String college="Jnnce";
    boolean check=name.contains("Am");
    System.out.println(check);
    String value=name.concat(college);
    System.out.println(value);
    char store=name.charAt(0);
    System.out.println(store);
    int age=name.codePointAt(3);
    System.out.println(age);
    int storing=name.codePointBefore(5);
    System.out.println(storing);
    int role=name.codePointCount(0, 6);
    System.out.println(role);
    int compare=name.compareTo(choclateName);
    System.out.println(compare);
    int campareval=name.compareToIgnoreCase(choclateName);
    System.out.println(campareval);
    boolean content=choclateName.contentEquals("kit");//char sequence
    System.out.println(content);
    boolean equals=choclateName.contentEquals("kitkat");//String buffer
    System.out.println(equals);
    char[] names= {'A','m','b','i','k','a'};
    String copy=name.copyValueOf(names);//stores data of char
    System.out.println(copy);
    String copyValue=name.copyValueOf(names,0,4);
    System.out.println(copyValue);
    boolean ends=name.endsWith("Ambika");//suffix of name
    System.out.println(ends);
    
    
    
    
    

	}

}
