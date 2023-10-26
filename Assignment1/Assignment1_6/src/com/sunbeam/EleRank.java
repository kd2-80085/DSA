
package com.sunbeam;

public class EleRank {

    public static int calculateRank(int arr[], int key) {
        int rank = 0;
        int elefound=0;
      
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] <=key) {
            	rank++;  
            	if(key==arr[i])
            		elefound=1; 	
            }
        }

        if (elefound==1) {
            return rank;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) 
    {
        int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
        int key = 4;

        int rank = calculateRank(arr, key);
        if (rank != -1)
            System.out.println("Rank of " + key + " is : " + rank);
        else
            System.out.println("Key is not found");
    }
}