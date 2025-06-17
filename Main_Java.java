package Inheritance;
import java.util.UUID;

public class Main_Java extends Scann_User {

	public static void main(String[] args) {
		
		
		if (Scann_this().matches("yes")) {
			System.out.println(UUID.randomUUID());
			
			
			
		}
		else {
		
		System.out.println("You must use argument limited to 6 digits for the get_super_random(your number here)");
		Random_Generator.get_super_random(200);
		}
		
		
		
		
	
	}

}
