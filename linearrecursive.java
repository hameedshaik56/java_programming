package linearrec;

import java.util.Scanner;

public class linearrecursive {
	public static int LSRecursion(int a[], int i, int n, int key)
	{
		if(n<i)
			return -1;
		if(a[i] == key)
				return i;
		if(a[n]==key)
			    return n;
		return LSRecursion(a,i+1,n-1, key);		
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = in.nextInt();
		System.out.println("Enter the elements: ");
		int a[] = new int[n];
		for (int i=0; i<n; i++)
			a[i] = in.nextInt();
		System.out.println("Enter key to search");
		int key = in.nextInt();
		int pos=LSRecursion(a,0, n-1, key);
		if(pos!=-1)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
	
}

