package array;

import java.util.Scanner;

public class arrayPos {

	public static void main(String[] args) {
	
	
		int arr[]=new int[3];
		int i;
		System.out.println("Enter the elements:");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Printing all elements: ");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the location of insertion: ");
		int location=sc.nextInt();
		location=location-1;
		if(location>arr.length-1) {
			System.out.println("size exceeded");
		}
		else
		System.out.println("Enter the value of element: ");
		int value=sc.nextInt();
		for(i=arr.length;i>location;i++) {
			arr[location]=value;
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
