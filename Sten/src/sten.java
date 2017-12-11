import java.util.Scanner;

public class sten {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("velkommen til, v�lg en af f�lgende 3 muligheder");
		System.out.println("1 find farten ved et fald p� jorden");
		System.out.println("2 find farten ved et fald p� m�nen\n");

		int i = sc.nextInt();

		if (i==1)
			fartVedFald(sc);
		if (i==2) 
			farVedFaldMane(sc);
		else
			sc.close();

	}

	private static void farVedFaldMane(Scanner sc) {
		System.out.print("Angiv højde: ");
		double h=0.0;

		while(true) {
			if(sc.hasNextDouble()) {
				h = sc.nextDouble();
				if(h <= 0)
					System.out.print("ugyldigt input \nIndtast et tal. prøv igen: ");
				else break;		
			}
			else {
				System.out.print("ugyldigt input \nIndtast et tal. prøv igen: ");
				sc.next();				
			}	
		}
		double v;
		double t;

		v = Math.sqrt(2 * 1.6 * h);
		t = v/1.6;

		System.out.println("Højden er  \t" + h +" m");	
		System.out.print("Farten er \t");
		System.out.println(Math.round(v*100.0)/100.0 + " m/s");
		System.out.println("\t\t" + Math.round(v*3.6*100.0)/100.0 + " km/t");
		System.out.print("Tiden i luften er ");
		System.out.println(Math.round(t*100.0)/100.0 + " s");

	}

	private static void fartVedFald(Scanner sc) {
		System.out.print("Angiv højde: ");
		//double h= input.nextDouble(); 
		double h=0.0;

		while(true) {
			if(sc.hasNextDouble()) {
				h = sc.nextDouble();
				if(h <= 0)
					System.out.print("ugyldigt input \nIndtast et tal. prøv igen: ");
				else break;		
			}
			else {
				System.out.print("ugyldigt input \nIndtast et tal. prøv igen: ");
				sc.next();				
			}	
		}
		double v;
		double t;

		v = Math.sqrt(2 * 9.82 * h);
		t = v/9.82;

		System.out.println("Højden er  \t" + h +" m");	
		System.out.print("Farten er \t");
		System.out.println(Math.round(v*100.0)/100.0 + " m/s");
		System.out.println("\t\t" + Math.round(v*3.6*100.0)/100.0 + " km/t");
		System.out.print("Tiden i luften er ");
		System.out.println(Math.round(t*100.0)/100.0 + " s");
	}
}


//-----------------------------------------------------------------------//
//Programmet udregner hastigheden af en sten efter at den er accelereret 
//fra en given h�jde. 
//programmet er skrevet af Alexander Kjeldsen og Yoss Mellin.
//Dette er version 1.1
//15.09.2017
//der er nu lavet et loop, s� der ikke kommer en "error", n�r man skriver
//et bogstav eller et negativt tal.
//----------------------------------------------------------------------//