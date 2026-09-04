package scripts;

import java.util.Locale;
import java.util.Scanner;

public class Terceira01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int teste = sc.nextInt(), senha = 2002;
		
		if (teste != senha) {
			System.out.println("Senha incorreta!");
			teste = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
