package practicejava;

public class SearchElement {

	public static void main(String[] args) {



		int a[]= {1,2,3,4,5,6};
		int searchElement=3;
		boolean status =false;

		for (int i=0;i<a.length;i++) 
		{


			if(a[i]==searchElement)

			{
				System.out.println("Element searchable");

				status= true;
				break;
			}
		}

		if (status==false) 
		{
			System.out.print("Element not searchable ");	
		}
	}








}