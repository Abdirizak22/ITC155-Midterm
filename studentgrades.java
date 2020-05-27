import java.util.Scanner;

import java.util.HashMap;

public class midertm {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a student name: ");

		String studentName = scnr.nextLine();

		System.out.println("Enter new grade: ");

		double studentGrade = scnr.nextDouble();

		HashMap<String, Double> studentGrades = new HashMap<String, Double>();

		// Students' grades (pre-entered)

		studentGrades.put("Shailen asunda", 88.4);

		studentGrades.put("Christian bentake", 94.3);

		studentGrades.put("zaha ", 80.7);

		studentGrades.put("kane harry", 68.3);

		studentGrades.put("modric Lucas", 93.5);


		if (studentGrades.containsKey(studentName)) {

			HashMap<String, Double> newStudentGrades = new HashMap<String, Double>();

			newStudentGrades.put(studentName, studentGrade);

			System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));

			System.out.println(studentName + "'s new grade: " + newStudentGrades.get(studentName));

			scnr.close();

		} else {

			studentGrades.put(studentName, studentGrade);

			System.out.println("New Student Added!");

			System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName));

		}



	}

}
