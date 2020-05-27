package com.Collection.in;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SampleBuffer implements Comparator<StringBuffer> {
	
	public static void main(String[] args) {
		System.out.println(" Custome StringBuffer Comparator");
		StringBuffer s1= new StringBuffer("java");
		StringBuffer s3= new StringBuffer("cpp");
		StringBuffer s2= new StringBuffer("python");
		StringBuffer s4= new StringBuffer("psudo");
		StringBuffer s5= new StringBuffer("compiler");
		
		Set<StringBuffer> treeSet =new TreeSet<>(new SampleBuffer());
		treeSet.add(s1);
		treeSet.add(s3);
		treeSet.add(s2);
		treeSet.add(s4);
		treeSet.add(s5);
		System.out.println(treeSet);
	}
	public int compare(StringBuffer o1, StringBuffer o2) {
		return o1.toString().compareTo(o2.toString());
	}

}
