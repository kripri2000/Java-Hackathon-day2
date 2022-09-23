import java.util.Scanner;

public class BinarySearch26 {

	public static void main(String ars[])
	{
		// TODO Auto-generated method stub
		int flag=0,mid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elts : ");
		int n = sc.nextInt();
		int low=0,high=n-1;
		mid = (low+high)/2;
		int arr[] = new int[n];
		System.out.println("Enter the elts in sorted order : ");
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		System.out.println("Enter the item : ");
		int item = sc.nextInt();
		
		while(low<=high) {
			if(arr[mid] == item) {
				System.out.println("Item found at position "+(mid+1));
				flag++;
				break;
			}
			else if(arr[mid]<item)
				low = mid+1;
			else
				high = mid-1;
			mid = (low+high)/2;
		}
		if(flag==0)
			System.out.println("Item not found");

	}

}
