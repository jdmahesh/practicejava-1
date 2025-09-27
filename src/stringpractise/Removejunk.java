package stringpractise;

public class Removejunk {

	public static void main(String[] args) {
		
		String s= "@$^(&^$^srthe@%^#77Mahesh@1";
	String s1=	s.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(s1);

	}

}
