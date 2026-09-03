package scripts;

import java.util.Locale;
import java.util.Scanner;

public class Segunda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		imposto(3002);
		
		sc.close();
	}
	
	public static void norp(int a) {
		if (a >= 0) System.out.println("NÃO NEGATIVO");
		else System.out.println("NEGATIVO");
	}
	
	public static void imorpar(int a) {
		if (a % 2 == 0) System.out.println("PAR");
		else System.out.println("IMPAR");
	}
	
	public static void multiplos(int a, int b) {
		if (a % b == 0 || b % a == 0) System.out.println("São Multiplos");
		else System.out.println("Não são multiplos");
	}
	
	public static void horas(int a, int b) {
		int total = 0;
		if (a > b) total += (24 - a + b);
		else if (a == b) total = 24;
		else total += b - a;
		System.out.println("O JOGO DUROU " + total + " HORA(S)");
	}
	
	public static void lanche(int codigo, int quant) {
		double total = 0.0;
		
		switch (codigo) {
	    case 1:
	        total += quant * 4.00;
	        break;
	    case 2:
	        total += quant * 4.50;
	        break;
	    case 3:
	        total += quant * 5.00;
	        break;
	    case 4:
	        total += quant * 2.00;
	        break;
	    case 5:
	        total += quant * 1.50;
	        break;
	    default:
	        System.out.println("Código inválido.");
	        break;
	}
		
		System.out.printf("Total: R$ %.2f", total);
	}
	
	public static void intervalo(double a) {
		if (a < 0 || a > 100) System.out.println("Fora do intervalo");
		else if (a <= 25) System.out.println("Intervalo [0, 25]");
		else if (a <= 50) System.out.println("Intervalo [25, 50]");
		else if (a <= 75) System.out.println("Intervalo [50, 75]");
		else if (a <= 100) System.out.println("Intervalo [75, 100]");
	}
	
	public static void quadrantes(double a, double b) {
		if (a > 0) {
			if (b > 0) System.out.println("Q1");
			else System.out.println("Q4");
		} else if (a < 0) {
			if (b > 0) System.out.println("Q2");
			else System.out.println("Q3");
		} else if (a == 0 && b == 0) System.out.println("Origem");
		else System.out.println("Está entre 2 quadrantes");
	}
	
	public static void imposto(double salario) {
	    if (salario <= 2000.00) {
	        System.out.println("Isento");
	    } else if (salario <= 3000.00) {
	        double imposto = (salario - 2000.00) * 0.08;
	        System.out.printf("R$ %.2f\n", imposto);
	    } else if (salario <= 4500.00) {
	        double imposto = (salario - 3000.00) * 0.18 + 80.00;
	        System.out.printf("R$ %.2f\n", imposto);
	    } else {
	        double imposto = (salario - 4500.00) * 0.28 + 350.00; // 80.00 + 270.00
	        System.out.printf("R$ %.2f\n", imposto);
	    }
	}
}
