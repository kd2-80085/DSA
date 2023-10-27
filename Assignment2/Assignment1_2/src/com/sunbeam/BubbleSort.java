package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {
	public static int bubbleSort(int []arr, int N) {
		int count=0;
		int flag;
		int passes=0;
		for(int pass=1;pass<N;pass++) 
		{
			flag=0;
			passes++;
			//for(int i=0;i<N-1;i++) //25 comparisons
			for(int i=0;i<N-pass;i++) //15 comparisons & extra comparisons from 2nd pass are reduced
			{
				if(arr[i]>arr[i+1]) 
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=1;
				}
				count++;
			}
			if(flag==0)//if no any element found i.e array is sorted and we can skip that pass
						//total comparisons 5 for sorted array
				 break;
			
		}
		System.out.println(passes);//only 3 passes after that passes loop will break
		return count;
	}
	public static void main(String[] args) {
		
//	int arr[] = {44, 11, 55, 22, 66, 33};
			//int arr[] = {11,22,33,44, 55, 66};
		int arr[] = {33,22,11,55,88,99,77};
			System.out.println("Array before sort : " + Arrays.toString(arr));
			System.out.println("Total No. of comparisons : "+bubbleSort(arr, arr.length));
			System.out.println("Array after sort : " + Arrays.toString(arr));
		}
	}


