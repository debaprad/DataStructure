package Number;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {

	public static void removeDuplicate(int[] arr)
	{
		int next=0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-2; i++) {
			if(arr[i]-arr[i+1]==0)
			{
				arr[i+1]=arr[i+2];
			}
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		removeDuplicate(new int[]{1,2,2,1,3,5});
	}
}
