package entities;

public class Student {
	public Double avarage = 60.00;
	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;
	
	public void FinalGrade(){
		double total = grade1 + grade2 + grade3;
		System.out.println("\nFINAL GRADE = " + String.format("%.2f",total));
		
		if (total >= avarage) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", (avarage - total)) + " POINTS");
		}
	}
}
