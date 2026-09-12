package application;

import java.util.Locale;
import java.util.Scanner;

//Codigo sem a implementação 
//de orientação a objetos

public class SemPOO {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Escreva os valores do tringulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Escreva os valores do tringulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = (xA + xB + xC)/2;
		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		double pY = (yA + yB + yC)/2;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - xC));
		
		System.out.println("Tringulo X: " + areaX);
		System.out.println("Tringulo X: " + areaY);

		System.out.println(areaX > areaY ? "Area x maior" : "Area y maior");
		
		sc.close();
	}
}
