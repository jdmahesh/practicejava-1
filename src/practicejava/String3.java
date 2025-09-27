package practicejava;

public class String3 {

	public static void main(String[] args) {
		String s= " java is programming language ";
		
		
		int  totallength=s.length();
		
		//System.out.println(totallength);
		
		int count =s.replace("a", "").length();
		
		int totalcount =totallength-count ;
		
		System.out.println("occuraance of a is " +totalcount);

		
	}

}
