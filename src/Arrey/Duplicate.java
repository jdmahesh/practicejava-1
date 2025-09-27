package Arrey;

public class Duplicate {

	public static void main(String[] args) {
		String []arr= {"java","c","c++","python","java"};


		boolean flag =false;
		for(  int i=0;i<arr.length;i++)
		{

			for (int j=i+1;j<arr.length;j++)

			{
				if (arr[i]==arr[j])
					System.out.println("duplicate arrey found"+" "+arr[i]);
				flag=true;
			}


		}
		if(flag==false)
		{
			System.out.println("duplicate arrey is not found");
		}

	}
	
	


}
