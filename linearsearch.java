import java.util.*;


public class linearsearch {

	public static void main(String[] args) {
		int i,n,key,array[];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        n=in.nextInt();
        array=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(i=0;i<n;i++)
        array[i]=in.nextInt();
        System.out.println("Enter the Key element");
        key=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(array[i]==key)
            {
                System.out.println("Element found at position "+(i+1)+" .");
                break;
            }
        }
        if(i==n) {
       	 System.out.println("Element not found");
            }
    }
}

		// TODO Auto-generated method stub

	


