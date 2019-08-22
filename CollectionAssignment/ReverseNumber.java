package com.mit.CollectionAssignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseNumber {
//static int count=0;
	public static void main(String[] args) {
		
		int n= 123456;
		Integer rem=0;
		int sum=0,i=1;
		
		Stack<Integer> st=new Stack<Integer>();
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			st.push(rem);
			//count++;
		}
		System.out.println(st);
		//for(int i=1,j=0;j<count;i=i*10,j++)
		while(!st.empty()){
			int r=st.pop();
			sum=sum+r*i;
			i=i*10;
		}
		System.out.println("Reverse is "+sum);
	}

}
