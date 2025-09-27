package practicejava;

public class String5 {

	public static void main(String[] args) {



		String a="welcome to java ";

		String A []=a.split(" ");
		String reverse="";

		for ( String x:A)
		{
			String reverseword= "";
			for (int i=x.length()-1;i>=0;i--)
			{

				reverseword=reverseword+x.charAt(i);
			}
			reverse=reverse+reverseword+" ";

		}

		System.out.println(reverse);





	}

}
