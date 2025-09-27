package Arrey;

public class Searchelement {

	public static void main(String[] args) {

		int a[]= {10,20,30,40};

		int search_ele=50;

		boolean flag=false;
		for (int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("search elemet is "+a[i]);
				flag=true;

			}


		}
		if (flag==false)
		{
			System.out.println("search element is not present");
		}

	}

}
