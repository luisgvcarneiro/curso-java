package scripts;

import java.util.Locale;
import java.util.Scanner;

public class Terceiro03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int entrada = sc.nextInt(), alcool = 0, gasolina = 0, diesel = 0;
		
		while (entrada != 4) {
			switch (entrada) {
				case (1): 
					alcool++;
					break;
				case (2): 
					gasolina++;
					break;
				case (3): 
					diesel++;
					break;
				default: 
					break;
			}
			
			entrada = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
