package practicejava;

public class String4 {

	public static void main(String[] args) {

		String s= " Welcome to java "; 

		String a[]=s.split(" ");

		String reversestring= "";


		for (String w:a)

		{
			String reversewords=" ";
			for(int i=w.length()-1;i>=0;i--)

			{
				reversewords=reversewords+w.charAt(i);
			}


			reversestring=reversestring+reversewords+" ";
		}

		System.out.println(reversestring);


	}

}
