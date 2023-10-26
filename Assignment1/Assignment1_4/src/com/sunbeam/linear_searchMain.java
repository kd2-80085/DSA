package com.sunbeam;

import java.util.Scanner;

public class linear_searchMain {
	
	public static int linear_search(int arr[], int key,int occur) {
		int count=0;
        for(int i = 0 ; i < arr.length; i++) {
        	
        	if(arr[i] == key) 
        	{
        		count++;
        		if(count==occur) {
        			return i;
        		}
        	}
        }
        return -1;
	}

	public static void main(String[] args) {
		int arr[] = {66, 11, 22, 88, 22, 99, 77, 33};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		System.out.print("Enter occurrence of key : ");
		int occur=sc.nextInt();
		
		int index = linear_search(arr,key,occur);
		if(index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}

}



