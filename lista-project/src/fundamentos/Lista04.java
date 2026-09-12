package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Lista04 {

	static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	public static void main(String[] args) {
		//impar(8);
		//regra(5);
		//peso(2);
		//pares(2);
		//fat(0);
		//divisores(6);
		last(5);
		sc.close();
	}
	
	public static void impar(int a) {
		for (int i = 1; i < a; i+=2) {
			System.out.println(i);
		}
	}

	public static void regra(int n) {
		int in = 0, out = 0, m = 0;
		for (int i = 0; i < n; i++) {
			m = sc.nextInt();
			if (m > 10 && m < 20) in++;
			else out++;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
	
	public static void peso(int n) {
		double pe_1 = 0, pe_2 = 0, pe_3 = 0, media = 0;
		
		for (int i = 0; i < n; i++) {
			pe_1 = sc.nextDouble();
			pe_2 = sc.nextDouble();
			pe_3 = sc.nextDouble();
			
			media = ((pe_1 * 2) + (pe_2 * 3) + (pe_3 * 5))/10;
			
			System.out.printf("%.1f", media);
		} 
	}
	
	public static void pares(int n) {
		double a = 0, b = 0;
		
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if (b == 0) System.out.println("divisão impossivel");
			else System.out.println(a / b);
		}
	}
	
	public static void fat(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total = total * i;
		}
		
		System.out.println(total);
	}
	
	public static void divisores(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void last(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
		}
	}
}
