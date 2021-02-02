package linearrec;

public class linearrecursive {
	public static int rec(int a[], int first, int last, int key) {
		if (last < first)
			return -1;
		if (a[first]==key)
			return first;
		if (a[last]==key)
			return last;
		return rec(a,first+1,last-1,key);
		
		
	}

	public static void main(String[] args) {
		int a[]= {11,22,33,44,66,88};
		int key=60;
		int first=0;
		int last=a.length-1;
		int x=rec(a,first,last,key);
		if (x!= -1) {
			System.out.println("element is found at "+x);
		}
		else {
			System.out.println("element not found");
		}
		
		// TODO Auto-generated method stub

	}

}
