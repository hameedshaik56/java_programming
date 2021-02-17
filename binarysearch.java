package bs;

import java.util.Scanner;

public class binarysearch {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the values in array: ");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.print("Enter the key value ");
		int key=in.nextInt();
		int f=0;
		int l=n-1;
		int mid=0;
		while(f<=l) {
			mid=(f+l)/2;
			if(a[mid]==key) {
				System.out.println("Element found at "+(mid+1));
				break;
			}
			else if(a[mid]>key) {
				l=mid-1;
				
			}
			else if(a[mid]<key) {
				f=mid+1;
			}
			
		}
		if(f>l) {
			System.out.println("Value not found");
		}
		
		// TODO Auto-generated method stub

	}

}
