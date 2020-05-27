package com.Collection.in;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetExample implements Comparable<TreeSetExample> {
	int id;
	String name;

	public TreeSetExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		TreeSetExample tx1 = new TreeSetExample(100, "sham");
		TreeSetExample tx2 = new TreeSetExample(101, "ram");
		TreeSetExample tx3 = new TreeSetExample(102, "moham");
		TreeSetExample tx4 = new TreeSetExample(104, "dam");
		TreeSetExample tx5 = new TreeSetExample(103, "mam");
		System.out.println("My TREE Set.....In DEcending order");
		
		Set<TreeSetExample> tset = new TreeSet();
        tset.add(tx1);
		tset.add(tx2);
		tset.add(tx3);
		tset.add(tx4);
		tset.add(tx5);
		
		System.out.println(tset);

	}
	public String toString() {
		return id + " " + name;
	}
	public int compareTo(TreeSetExample o) {
		if (id == o.id)
			return 0;
		else if (id < o.id)
			return 1;
		else
			return -1;
	}

}
