package org.phone;

public class Phone {
	
	private void phoneInfo(String module, int year, float rate, long number) {

	System.out.println(module);
	System.out.println(year+"@oct");
	System.out.println(rate);
	System.out.println(number+"500");
		
	}
	
	private void phoneInfo(long number, String Name, int Year, int age) {

	System.out.println(Name+"G");
	System.out.println(number);
	System.out.println(Year);
	System.out.println(age);
	}
	
	private void phoneInfo(String Details) {

	System.out.println(Details);
		

	}

	public static void main(String[] args) {
	Phone p = new Phone();
	p.phoneInfo("LAVA", 2010, 10070.345f, 98765432100l);
	p.phoneInfo(9566115432l, "Purusho", 2020, 100);
	p.phoneInfo("All Details Not real");
		
		
	}
}
