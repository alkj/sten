import java.util.Scanner;

public class sten {

	public static void main(String[] args)
	{
		new sten().Sten();
	}

	public void Sten() {

		Scanner sc = new Scanner(System.in);

		System.out.println("velkommen til, vælg en af følgende 3 muligheder");
		System.out.println("1 find farten ved et fald på jorden");
		System.out.println("2 find farten ved et fald på månen");
		System.out.println("3 find farten ved et fald på jupiter");

		int i = sc.nextInt();

		if (i==1)
			fartVedFald(sc);
		if (i==2) 
			farVedFaldMåne(sc);
		if (i==3)
			fartVedFaldjupiter(sc);

		else

			sc.close();

	}



	private void farVedFaldMåne(Scanner sc) {
		System.out.print("Angiv hÃ¸jde: ");
		double h=0.0;

		while(true) {
			if(sc.hasNextDouble()) {
				h = sc.nextDouble();
				if(h <= 0)
					System.out.print("ugyldigt input \nIndtast et tal. prÃ¸v igen: ");
				else break;		
			}
			else {
				System.out.print("ugyldigt input \nIndtast et tal. prÃ¸v igen: ");
				sc.next();				
			}	
		}
		double v;
		double t;

		v = Math.sqrt(2 * 1.6 * h);
		t = v/1.6;

		System.out.println("HÃ¸jden er  \t" + h +" m");	
		System.out.print("Farten er \t");
		System.out.println(Math.round(v*100.0)/100.0 + " m/s");
		System.out.println("\t\t" + Math.round(v*3.6*100.0)/100.0 + " km/t");
		System.out.print("Tiden i luften er ");
		System.out.println(Math.round(t*100.0)/100.0 + " s");

	}

	private void fartVedFald(Scanner sc) {
		System.out.print("Angiv hÃ¸jde: ");
		double h=0.0;

		while(true) {
			if(sc.hasNextDouble()) {
				h = sc.nextDouble();
				if(h <= 0)
					System.out.print("ugyldigt input \nIndtast et tal. prÃ¸v igen: ");
				else break;		
			}
			else {
				System.out.print("ugyldigt input \nIndtast et tal. prÃ¸v igen: ");
				sc.next();				
			}	
		}
		double v;
		double t;

		v = Math.sqrt(2 * 9.82 * h);
		t = v/9.82;

		System.out.println("HÃ¸jden er  \t" + h +" m");	
		System.out.print("Farten er \t");
		System.out.println(Math.round(v*100.0)/100.0 + " m/s");
		System.out.println("\t\t" + Math.round(v*3.6*100.0)/100.0 + " km/t");
		System.out.print("Tiden i luften er ");
		System.out.println(Math.round(t*100.0)/100.0 + " s");

	}

	private void fartVedFaldjupiter(Scanner sc) {
		System.out.print("Angiv hÃ¸jde: ");
		//double h= input.nextDouble(); 
		double h = 0.0;

		while (true) {
			if(sc.hasNextDouble()) {
				h = sc.nextDouble();
				if(h <= 0)
					System.out.print("ugyldigt input \nIndtast et tal. prÃ¸v igen: ");
				else break;		
			}
			else {
				System.out.print("ugyldigt input \nIndtast et tal. prÃ¸v igen: ");
				sc.next();				
			}	
		}
		double v1;
		double t1;

		v1 = Math.sqrt(2 * 24.79 * h);
		t1 = v1/24.79;

		System.out.println("HÃ¸jden er  \t" + h +" m");	
		System.out.print("Farten er \t");
		System.out.println(Math.round(v1*100.0)/100.0 + " m/s");
		System.out.println("\t\t" + Math.round(v1*3.6*100.0)/100.0 + " km/t");
		System.out.print("Tiden i luften er ");
		System.out.println(Math.round(t1*100.0)/100.0 + " s");

	}
}



//-----------------------------------------------------------------------//
//Programmet udregner hastigheden af en sten efter at den er accelereret 
//fra en given hï¿½jde. 
//programmet er skrevet af Alexander Kjeldsen og Yoss Mellin.
//Dette er version 1.1
//15.09.2017
//der er nu lavet et loop, sï¿½ der ikke kommer en "error", nï¿½r man skriver
//et bogstav eller et negativt tal.
//----------------------------------------------------------------------//