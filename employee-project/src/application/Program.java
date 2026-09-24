package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.print("\nEmployee: " + emp.name 
		+ ", $ " + String.format("%.2f%n%n", emp.NetSalary()));
		
		System.out.print("Which percentage to increase salary? ");
		emp.IncreaseSalary(sc.nextDouble());
		
		sc.close();
	}
	
}
