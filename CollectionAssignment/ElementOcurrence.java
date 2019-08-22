package com.mit.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementOcurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("10");
		list.add("20");
		list.add("50");
		list.add("10");
		list.add("50");
		list.add("70");
		list.add("50");
		Set<String> set=new HashSet<String>(list);
		
		for(String n:set)
		    System.out.println(n+"  "+Collections.frequency(list, n));
	
		List<String> list1=new ArrayList<String>();
		list1.add("102");
		System.out.println(list1+"  ");
		//System.out.println(Collections.reverse(list1));
	}
	

}
