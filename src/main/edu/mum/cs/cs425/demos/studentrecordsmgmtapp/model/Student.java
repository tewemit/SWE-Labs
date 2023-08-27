package main.edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;


import java.util.Date;

public class Student {
	long id;
	String name;
	Date dateOfAdmission;

	public Student(long id, String name, Date dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfAdmission = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", dateOfBirth='" + dateOfAdmission + '\'' +
				'}';
	}
}
