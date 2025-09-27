package stringpractise;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		
		String str = sc.next();
		String 	org_str=str;
		
		String rev="";
		
		int length=org_str.length();
		
		for (int i=length-1;i>=0;i--)
		{
			rev=rev+org_str.charAt(i);// paap
		}
		if(org_str.equals(rev))
		{
			System.out.println(org_str +" "+ "String is palindrome ");
		}

		
		
		else {
			System.out.println(org_str +" "+ "String is not palindrome ");

		}




	}
}