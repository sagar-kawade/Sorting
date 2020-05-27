package com.Collection.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


class Student {
	private String studentname;
	private int rollno;
	private int studentage;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

	@Override
	public String toString() {
		return rollno + " " + studentname + " " + studentage;
	}

	public static Comparator<Student> stuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String studentName1 = s1.getStudentname().toUpperCase();
			String studentName2 = s2.getStudentname().toUpperCase();
        if(studentName1.equals(studentName2))
        {
        	stuAgeComparator.compare(s1, s2);
        }
			return studentName1.compareTo(studentName2);

		}
	};
	public static Comparator<Student> stuAgeComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			if(s1.studentage==s2.studentage)
				return 0;
			else if (s1.studentage <s2.studentage)
				return 1;
			else 
				return -1;
		}
	};
}

public class SampleSort {

	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<Student>();
		l1.add(new Student(100, "Mony", 19));
		l1.add(new Student(103, "john", 20));
		l1.add(new Student(102, "ram", 21));
		l1.add(new Student(105, "sham", 24));
		l1.add(new Student(104, "Mony", 25));
		 System.out.println(l1);
		 
		 Collections.sort(l1, Student.stuNameComparator);
		 Iterator<Student>itr=l1.iterator();
		 while (itr.hasNext()) {
			 Student e2 = (Student) itr.next();
				System.out.println(e2.getRollno() + " " + e2.getStudentname() + " " + e2.getStudentage());

					
		}

	}

}