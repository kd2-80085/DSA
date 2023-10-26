
package com.sunbeam;
import java.util.Scanner;

//1. Write a program to print no of comparisions done to search a key in
//i. linear search
//ii. binary serach

public class TestCompCount {


	public static int linearSearch(int arr[],int key) 
	{
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(key==arr[i]) {
				return ++count;
			}
			++count;
		}
		return count;
	}
	
	public static int binarySearch(int arr[],int size,int key) {
		int count=1;
		int left=0,right=size-1;
		int mid;

		while(left<=right) 
		{
			mid=(left+right)/2;

			if(key==arr[mid]) {
				return count;
			}
			else if(key<arr[mid]) 
			{
				right=mid-1;
			}
			else //key>arr[mid])
			{
				left=mid+1;
			}
			count++;

		}

		return count;
	}






	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key,count;
		int linearArr[]= {11,55,33,44,66},
				binArr[]={11,22,33,44,55,66};

		//Linear search comparison counts
		System.out.println("Enter key to search in array using linear search :");
		key=sc.nextInt();

		count=linearSearch(linearArr, key);

		System.out.println("Total "+count+" comparisons for key "+key+" in array of size "+linearArr.length);

		//Binary search comparison counts
		System.out.println("Enter key to search in sorted array using binary search :");
		key=sc.nextInt();

		count=binarySearch(binArr,binArr.length, key);
		System.out.println("Comparions in Binary search");
		System.out.println("Total "+count+" comparisons for key "+key+" in array of size "+binArr.length);


	}

}
