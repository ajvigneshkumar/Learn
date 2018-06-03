package com.example;

//Rearrange positive and negative numbers in O(n) time and O(1) extra space

public class AlternatePosNeg {

	public static void rearrange(int arr[], int n ) {
		int i=-1, temp = 0;
		
		for(int j =0; j<n; j++) {
			if(arr[j] <0) {
				temp= arr[++i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		int pos = i+1, neg=0;
		while(pos<n  && arr[neg] <0 ) {
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			neg+=2; pos++;
		}
		
	}
	
	static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {-1, -2, -3, 0, 0, 6, -7, -8, -9};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        printArray(arr,n);
    }

}
