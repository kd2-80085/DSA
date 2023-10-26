package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class empSearch {

	public static int linearSearchName(Employee arr[],String key) {
		
        for(int i = 0 ; i < arr.length ; i++) {
		
        	if(arr[i].getName().equalsIgnoreCase(key))
        		return i;	
			
        }
        
        return -1;
	}
	public static int binarySearchId(Employee arr[],int key)//requires sorted empid
	{
		
		int left=0,right=arr.length-1;
		int mid;

		while(left<=right) 
		{
			mid=(left+right)/2;

			if(key == arr[mid].getEmpid()) {
				return mid;
			}
			else if(key<arr[mid].getEmpid()) 
			{
				right=mid-1;
			}
			else //key>arr[mid])
			{
				left=mid+1;
			}

		}

		return -1;
	}
	public static int binarySearchSal(Employee arr[],double key)//requires sorted empid
	{
		
		int left=0,right=arr.length-1;
		int mid;

		while(left<=right) 
		{
			mid=(left+right)/2;

			if(key == arr[mid].getSalary()) {
				return mid;
			}
			else if(key<arr[mid].getSalary()) 
			{
				right=mid-1;
			}
			else //key>arr[mid])
			{
				left=mid+1;
			}

		}

		return -1;
	}

//Create array of employees and search employee by 

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index,idkey;
		String namekey;
		double salkey;
		Employee e1=new Employee(1,"Sahil",22000);
		Employee e2=new Employee(2,"Akshay",12000);
		Employee e3=new Employee(3,"Akash",30000);
		Employee e4=new Employee(4,"Ajay",55000);
		Employee e5=new Employee(5,"Atul",50000);
		
		Employee arr[]={e1,e2,e3,e4};
		
		//i.search employee on empid- using binary search	
		System.out.println("Enter employee id to search : ");
		idkey=sc.nextInt();
		index=binarySearchId(arr,idkey);
		
		if(index>=0) {
		System.out.println("Employee found ");
		System.out.println(arr[index]);
		}
		else {
			System.out.println("Employee not found");
		}
		
		
//		ii.search employee on   name -using linear search

		System.out.println("Enter employee Name to search : ");
		namekey=sc.nextLine();
		index=linearSearchName(arr,namekey);
		
		if(index>=0) {
		System.out.println("Employee found ");
		System.out.println(arr[index]);
		}
		else {
			System.out.println("Employee not found");
		}
	
		
//		iii.search employee on  salary-  binary search
		Arrays.sort(arr);
		for(Employee emp:arr) {
			System.out.println(emp);
		}
		System.out.println("Enter employee salary to search : ");
		salkey=sc.nextDouble();
		index=binarySearchSal(arr,salkey);
		
		if(index>=0) {
		System.out.println("Employee found ");
		System.out.println(arr[index]);
		}
		else {
			System.out.println("Employee not found");
		}
	
		
		
	}

}
