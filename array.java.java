package linearsearch;

public class array {
	public static int arr(int[]a ,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;	
			}
		}
		return -1;
	}

public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int key=5;
	int x=arr(a,key);
	if(x==-1) {
		System.out.println("key not found");}
	else {
		System.out.println(key+" is found at positon "+x);}
	}
	
		// TODO Auto-generated method stub

	}


