package binarysearch;

public class binarysearch {
	public static void binsearch(int a[],int f, int l,int key) {
		int mid=(f+l)/2;
		while(f<=l) {
			if(a[mid]<key) {
				f=mid+1;
			}
			else if (a[mid]==key) {
				System.out.println("element found at "+mid);
				break;
			}
			else {
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		if(f>l) {
			System.out.println("element not found");
		}
	}

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8};
		int key=5;
		int l=a.length-1;
		binsearch(a,0,l,key);
		
		// TODO Auto-generated method stub

	}

}
