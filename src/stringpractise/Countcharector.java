package stringpractise;

import java.util.Scanner;

public class Countcharector {

	public static void main(String[] args) {
		String s= "hello who are you";

		int length=s.length();
		int length1=s.replaceAll("l", "").length();
		int length3=length-length1;		

		System.out.println(" charector count is "+length3);

		// reverse string 
		String str="MAHESH";

		String rev="";


		for (int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);





		// // reverse each word in string 
		String str2 =" are you mad ";

		String []words =str2.split(" ");

		String rev2="";
		String reverse="";

		for(String w: words )
		{
			for (int i=w.length()-1;i>=0;i--)
				rev2=rev2+w.charAt(i);
		}
		reverse = reverse+rev2+" ";
		System.out.println("reverse word is "+reverse);



		// 

		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String str1=	sc.next();
		String str3= str1;		
		String rev4="";
		int len=str3.length();
		for (int i=len-1;i>=0;i--)		
		{
			rev4=rev4+str3.charAt(i);
		}
		if(str3.equals(rev4))	
		{
			System.out.println(str3+"String is pallindrome ");
		}
		else 
		{
			System.out.println(str3+"String is not pallindrome ");
		}


	}

}
