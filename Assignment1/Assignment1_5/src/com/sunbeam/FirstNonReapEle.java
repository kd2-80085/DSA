package com.sunbeam;


public class FirstNonReapEle {
	
	public static int linear_search(int arr[]) 
	{
		int key, countK;
        for(int i = 0 ; i < arr.length-1; i++) 
        {
        	key=arr[i];
        	countK=0;
        	for(int j = 0; j < arr.length-1; j++) {
        		if(key==arr[j])
        		{
        			++countK;
        		}	
        	}
        	if(countK==1) //here if element occurs only ones 
    			return i;
        }
        return -1;
	}
	
//	//find the first non-repeating element:
//	//Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
//	//Ouput: 3	
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int index = linear_search(arr);
		if(index != -1)
			System.out.println("Non repeating Element is : " + arr[index]);
		else
			System.out.println("Key is not found");
		
		
	}

}
