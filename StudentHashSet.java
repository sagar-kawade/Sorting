package com.Collection.in;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentHashSet {
	String sName;
	int Id;

	public StudentHashSet(String sName, int id) {
		super();
		this.sName = sName;
		Id = id;
	}

	public String toString() {
		return sName + "=" + Id;
	}

	public static void main(String[] args) {
		StudentHashSet s1 = new StudentHashSet("Rohn", 101);
		StudentHashSet s2 = new StudentHashSet("mohn", 101);
		StudentHashSet s3 = new StudentHashSet("Ram", 107);
		StudentHashSet s4 = new StudentHashSet("Rohan", 108);
		StudentHashSet s5 = new StudentHashSet("Guri", 103);

		Set<StudentHashSet> setI = new HashSet<>();
		setI.add(s1);
		setI.add(s2);
		setI.add(s3);
		setI.add(s4);
		setI.add(s5);
//1st Way
		System.out.println(setI);
//2nd way
		Iterator<StudentHashSet> itr = setI.iterator();
		for (StudentHashSet stud : setI) {

			System.out.println(stud.Id + " " + stud.sName);
		}
	}
}
