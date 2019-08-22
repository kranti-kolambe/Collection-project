package com.mit.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list=new ArrayList<Integer>(100);
              for(int i=0;i<=100;i++) {
    	      list.add(i);
    	      
       }
              
       System.out.println("Reverse Using ListIterator");       
       ListIterator<Integer> rev=list.listIterator(list.size());
       while(rev.hasPrevious())
       {
    	   System.out.print(" "+rev.previous());
       }
              System.out.println("\n Reverse Using Collections");
              Collections.reverse(list);
              System.out.print(list);
     
	}

}
