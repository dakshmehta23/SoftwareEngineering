package lab3;

import java.util.Scanner;

public class sortrec {
	public static void bubblesortrec(int arr[], int n) 
	{ 
	    if (n == 1) 
	        return; 
	    for (int i=0; i<n-1; i++) 
	        if (arr[i] > arr[i+1]) {
	        	int temp=arr[i];
	        	arr[i]=arr[i+1];
	        	arr[i+1]=temp;
	        }

	    bubblesortrec(arr, n-1); 
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
		bubblesortrec(arr,arr.length);
		System.out.println("Sorted Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
}


