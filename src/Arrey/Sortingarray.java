package Arrey;

import java.util.Arrays;

public class Sortingarray {

	public static void main(String[] args) {

		int a[]= {5,3,2,4,1 };

		System.out.println("array before sorting "+Arrays.toString(a));

		int n=a.length;

		for (int i=0;i<n-1;i++)

		{
			for(int j=0;j<n-1;j++)

			{
				if(a[i]>a[j])

				{
					int temp=a[i];
					a[i]=a[j+1];
					a[j+1]=a[i];

				}

			}
		}



		System.out.println("array after sorting "+Arrays.toString(a));



	}

}
