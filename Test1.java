package Inheritance;

public class Test1 {
	static int in = 345345;
	long lo = 2374623862l;
	static double ran = Math.random();
	static double db = 34.34d;
	static String str = "This is a double random number: ";
	char ch = 'a';
	public static double get_super_random() {
		double result = db+ran*db+in+in*ran;
		System.out.println(str);
		System.out.print(result);
		return result;
		
	}
	
		
	}
