package com.mit.CollectionAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchElement {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("10");
	list.add("70");
	list.add("80");
	list.add("20");
	list.add("60");
	System.out.println("Enter the Element to search");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try {
		String s=br.readLine();
		if(list.contains(s))
		{
			System.out.println(s+" Element is present at "+list.indexOf(s));
		}
		else
			System.out.println("Not Present");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("using Elements are.......");
	ListIterator<String> li=list.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
}
}
