package scripts;

import java.util.Locale;
import java.util.Scanner;

public class Terceiro02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int quadrante = -1;
		double x, y;
		
		while (quadrante != 0) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if (x > 0) {
				if (y > 0) System.out.println("Q1");
				else if (y < 0) System.out.println("Q4");
				else break;
			} else if (x < 0) {
				if (y > 0) System.out.println("Q2");
				else if (y < 0) System.out.println("Q3");
				else break;
			}else break;
		}
		
		sc.close();
		
	}

}
