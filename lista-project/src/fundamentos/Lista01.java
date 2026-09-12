package fundamentos;

import java.util.Locale;
import java.util.Scanner;


public class Lista01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		System.out.println("Cite 2 numeros A e B e eu realizarei a soma:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		 	soma(a, b);
		
		System.out.println("O resultado é: " + total);
		
		double a = sc.nextDouble();
		
		double raio = raio(a);
		System.out.printf("%.4f", raio);
		
		int a, b, c, d, total;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		total = diferenca(a, b, c, d);
		System.out.println(total);

		int number;
		double hours, valueperhours;
		
		number = sc.nextInt();
		hours = sc.nextDouble();
		valueperhours = sc.nextDouble();
		
		hours(number, hours, valueperhours);
		
		int cod_1, cod_2;
		double qnt_1, qnt_2, val_1, val_2;
		
		cod_1 = sc.nextInt();
		qnt_1 = sc.nextDouble();
		val_1 = sc.nextDouble();
		
		double total = pecas(cod_1, qnt_1, val_1);

		cod_2 = sc.nextInt();
		qnt_2 = sc.nextDouble();
		val_2 = sc.nextDouble();
		
		total += pecas(cod_2, qnt_2, val_2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		 */ 
		
		area(3.0, 4.0, 5.2);
		
		sc.close();
	}
	
	
	public static void soma(int a, int b) {
		System.out.println(a + b);
	}
	
	public static double raio(double a) {
		return Math.PI * Math.pow(a, 2);
	}
	
	public static int diferenca(int a, int b, int c, int d) {
		return (a * b) - (c * d);
	}
	
	public static double pecas(int cod, double qnt, double val) {
		return qnt * val;
	}
	
	public static void hours(int number, double hours, double value) {
		System.out.println("NUMBER: " + number);
		System.out.printf("SALARY: %.2f", (hours * value));	
	}
	
	public static void area(double a, double b, double c) {
		System.out.printf("TRIANGULO: %.3f\n", ((a*c)/2));
		System.out.printf("CIRCULO: %.3f\n", (Math.PI * Math.pow(c, 2)));
		System.out.printf("TRAPEZIO: %.3f\n", (((a + b) * c)/2));
		System.out.printf("QUADRADO: %.3f\n", (Math.pow(b, 2)));
		System.out.printf("RETANGULO: %.3f\n", (a * b));
	}
}