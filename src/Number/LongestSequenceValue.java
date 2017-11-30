package Number;

import java.util.HashSet;
import java.util.Set;

public class LongestSequenceValue {
	
	public static int count(int[] arr)
	{
		int max=0;
		int count=1;
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i+1]-arr[i]==1)
			{
				++count;
			}
			else
			{
				count=1;
			}
			//max=Math.max(max, count);
			max=max>count?max:count;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(count(new int[]{23,24,25,45,26,27,28,29,30}));
	}
}
