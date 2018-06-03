package com.example;

public class ArrayRotate {
	
	public static void rotated(int a[], int k, int n) {
		int i,j,d, temp, sets= gcd(n,k);
		System.out.println("the GCD is"+ sets);
		for(i=0; i< sets; i++) {
		j=i;	
		temp= a[i];
		while(1 !=0) {
			d= (j+k)% n;
			if(d==i)
				break;
			a[j]= a[d];
			j=d;
			}
			a[j]= temp;
		}
		
	}
	
	public static void rotate(int a[], int k, int n) {
		int i,j,d, temp, sets= gcd(n,k);
		System.out.println("the GCD is"+ sets);
		for(i=0; i< sets; i++) {
		temp= a[i];
		for(j=i, d=(j+k)% n; d != i;j=d, d= (j+k)% n) {
		
			a[j]= a[d];
			
			
			}
			a[j]= temp;
		}
		
	}
	static int gcd(int a, int b) {
		int g=1;
		for(int i=2; i<=a && i<=b; i++)
			if((a%i==0) && (b%i==0))
				g=i;
		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
		rotated(arr,4,arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ "  ");
		System.out.println();

	}

}
