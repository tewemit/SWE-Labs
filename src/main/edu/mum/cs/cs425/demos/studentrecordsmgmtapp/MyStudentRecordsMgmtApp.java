package main.edu.mum.cs.cs425.demos.studentrecordsmgmtapp;


import main.edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {
	public static void printListOfStudents(Student[] students) {
		Arrays.stream(students).sequential().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(student -> System.out.println(student));
	}
	public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
		return Arrays.stream(students).sequential()
				.filter(student -> student.getDateOfAdmission().before(new Date("01-01-1993")))
			.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Student[] students = new Student[]{new Student(110001, "Dave", new Date()),
				 new Student(110002, "Second", new Date()),
				new Student(110003, "Third", new Date()),
				new Student(110004, "fourth", new Date("12/09/1980"))
		};
		printListOfStudents(students);
	}

}


