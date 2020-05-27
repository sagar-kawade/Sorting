package com.Collection.in;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItr {

	public static void main(String[] args) {
List<Integer> mylist= new ArrayList<>();
mylist.add(16);
mylist.add(90);
mylist.add(19);
mylist.add(14);
mylist.add(56);
ListIterator<Integer>litr=mylist.listIterator();
for (Integer i : mylist) {
	System.out.println(litr.next());
	
}

	}

}
