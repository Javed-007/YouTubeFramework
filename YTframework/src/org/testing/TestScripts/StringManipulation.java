package org.testing.TestScripts;

import java.util.Scanner;

public class StringManipulation 
{
	public static void main(String[] args) {
		
		String reversestring="";
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		s=sc.nextLine();

		String rev[]=s.split(" ");
		
		int l=rev.length;
		
		for(int i=l-1;i>=0;i--)
		{
			reversestring=reversestring+rev[i]+" ";
		}
		System.out.println("Reverse sentence is:" +reversestring);
	}
	

}
