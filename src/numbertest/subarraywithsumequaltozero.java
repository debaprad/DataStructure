package numbertest;

import java.util.HashMap;

public class subarraywithsumequaltozero {

	static Boolean printZeroSumSubarray(int arr[])
    {
        HashMap<Integer, Integer> hM = 
                          new HashMap<Integer, Integer>();
         
        int sum = 0;        
        for (int i = 0; i < arr.length; i++)
        {   
            // Add current element to sum
            sum += arr[i];
             
            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            //int x=hM.get(sum);
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                            
               return true;
             
            // Add sum to hash map
            hM.put(sum, i);
        }    
         
        // We reach here only when there is no subarray with 0 sum
        return false;
    }    
	
	public static void main(String[] args) {
		System.out.println(printZeroSumSubarray(new int[] {2, 3, 1, 6}));
	}
}
