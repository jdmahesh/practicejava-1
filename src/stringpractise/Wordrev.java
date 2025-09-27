package stringpractise;

public class Wordrev {

	public static void main(String[] args) {
		String s= "my car name is baleno ";
		String rev ="";
		String reverseword="";		
		String[]words=s.split(" ");

		for(String w: words )
		{
			for (int i=w.length()-1;i>=0;i--)
			
				rev=rev+w.charAt(i);
			}

			reverseword=reverseword+rev+" ";
			System.out.println(reverseword);

		

	}

}
