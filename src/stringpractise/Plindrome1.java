package stringpractise;

import java.util.Scanner;

public class Plindrome1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println(" enter string");
		String str=sc.next();

		String orgstring=str;

		String rev="";
		int length=orgstring.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+orgstring.charAt(i);
		}
		if(rev.equals(orgstring))
		{
			System.out.println(orgstring+"string is pallindrome");
		}
		else
		{
			System.out.println(orgstring+"string is not pallindrome");
		}

	}
}
