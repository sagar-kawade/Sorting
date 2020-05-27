package com.Collection.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Byname implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.name.equals(s2)) {
			new Byage().compare(s1, s2);
		}

		return s1.name.compareTo(s2.name);

	}

}
class Byage implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student e1=(Student)o1;
		Student e2=(Student)o2;
if(e1.age==e2.age)
	return 0;
else if(e1.age>e2.age)
	return -1;
else
	return 1;
	
	}
	
}

class Student1 {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + age;
	}
}

public class Sample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(101, "Ronh", 20));
		list.add(new Student(102, "Moony", 30));
		list.add(new Student(104, "Kran", 22));
		list.add(new Student(105, "Ronh", 40));
		list.add(new Student(103, "John", 42));
		list.add(new Student(106, "Ronh", 32));

		System.out.println(list);
		Collections.sort(list, new Byname());
		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			Student e2 = (Student) itr1.next();
			System.out.println(e2.id + " " + e2.name + " " + e2.age);

		}

	}
}
