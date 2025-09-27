package stringpractise;

public class String1 {
	
	
	

	public static void main(String[] args) {
		
		
		
		String  s =" Mahesh what are you doing ";
		
		int totalcount =s.length(); 
		int count2= s.replaceAll("a", "").length();
		int count3 = totalcount-count2;
		System.out.println(" a  count is "+count3);
		
		
		String s1= " are you stuppid  "; 
		
		int lenth1=s1.length();
		int length2= s1.replaceAll("e", "").length();
		int length3=lenth1-length2;
		System.out.println("count of e is "+length3);
		
		
		
		String reverseString="";
		
		
		String []words= s.split(" ");
		
		for (String w : words) 
		{
			
			String reverseword="";
			
			for (int i=w.length()-1;i>=0;i--)
			
			{
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString=reverseString+reverseword+" ";
			
			
		}
		
		
		System.out.println(reverseString);
		
		
		
		
		
	}

}
