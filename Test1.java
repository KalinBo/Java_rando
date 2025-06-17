package Inheritance;

public class Test1 extends Scann_User {
	static int in = 345345;
	long lo = 2374623862l;
	static double ran = Math.random();
	static double db = 34.34d;
	static String str = "This is a double random number: ";
	char ch = 'a';
	public static double get_super_random(double db5) {
		double result = ran*ran*10000/ db5;
		if (result <= 0.01) {
			result = result * ran * 10000;
			System.out.println(result);
			return result;
			
		}
		
		System.out.print(result);
		return result;
		
					
		
	}
	
	
		
	}
