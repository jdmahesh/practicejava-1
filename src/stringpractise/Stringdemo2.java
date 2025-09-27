package stringpractise;

public class Stringdemo2 {

	public static void main(String[] args) {
	
		String s= "whjrrrddisnee"		;
		
		int length1=s.length();
		int length2= s.replaceAll("r","").length();
		int length3 =length1-length2;
		System.out.println("occurance of letter r is" +"  "+length3);
		
		
		
		
	}

}
