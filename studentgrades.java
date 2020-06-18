import java.util.Scanner;

import java.util.HashMap;

public class StudentGrades {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter a student name: ");

		String studentName = scnr.nextLine();

		System.out.println("Enter new grade: ");

		double studentGrade = scnr.nextDouble();

		HashMap<String, Double> studentGrades = new HashMap<String, Double>();

		// Students' grades (pre-entered)

		studentGrades.put("David Kasunda", 85.4);

		studentGrades.put("Christian Bushiri", 94.3);

		studentGrades.put("Mariette Lukombo", 79.7);

		studentGrades.put("Arris Matonge", 69.3);

		studentGrades.put("Jeremie Lubila", 97.5);



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
