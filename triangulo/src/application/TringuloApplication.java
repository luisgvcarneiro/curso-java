package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class TringuloApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Passe o parametros do tringulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Passe o parametros do tringulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("X = %.2f\n", x.area());
		System.out.printf("Y = %.2f\n", y.area());
		
		System.out.println("O maior triangulo é o " + (x.area() > y.area()? "X" : "Y"));
		
		sc.close();
	}

}
