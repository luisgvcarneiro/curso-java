package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Student stu = new Student();
		
		stu.name = sc.nextLine();
		
		do {
			stu.grade1 = sc.nextDouble();
		} while (stu.grade1 < 0 || stu.grade1 >30);
		
		do {
			stu.grade2 = sc.nextDouble();
		} while (stu.grade2 < 0 || stu.grade2 > 35);
		
		do {
			stu.grade3 = sc.nextDouble();
		} while (stu.grade3 < 0 || stu.grade3 > 35);
		
		stu.FinalGrade();
		sc.close();
	}
}
