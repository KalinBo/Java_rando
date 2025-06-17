package Inheritance;




public class Random_Generator extends Scann_User {

	static double ran = Math.random();
	
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
