package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		System.out.println("\n\nUpdated data: " + name + ", $ " 
		+ String.format("%.2f%n", NetSalary() 
		+ grossSalary * (percentage/100)));
	}
}
