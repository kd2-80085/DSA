
//3. Implement binary search algorithm if array is sorted in descending order.

import java.util.Scanner;

public class binarySearchMain {
	
	public static int binarySearchDesc(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
			
		while(left <= right) {
			
			mid = (left + right)/2;
			
			if(key == arr[mid])
				return mid;	
			//if key is less than middle element
			else if(key < arr[mid])
				left = mid + 1;	// search key into right sub array
					
			//if key is greater than middle element
			else
				right = mid - 1;	// search key into left sub array
		}
			return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {99,88,77,66,55,44,33,22,11};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearchDesc(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}

}
