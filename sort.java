package lab3;
import java.util.*;

public class sort {
	
	public static void bubblesort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		bubblesort(arr);
		System.out.println("Sorted Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
