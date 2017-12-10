import java.util.Scanner;

public class input {
	Scanner sc = new Scanner(System.in);
	
	public double input(Scanner input, double h) {
	
	while(true) {
		if(input.hasNextDouble()) {
			h = input.nextDouble();
			if(h <= 0)
				System.out.print("ugyldigt input \nIndtast et tal. prøv igen: ");
			else break;		
		}
		else {
			System.out.print("ugyldigt input \nIndtast et tal. prøv igen: ");
			input.next();				
		}	
		return h;
	}
	}
}
