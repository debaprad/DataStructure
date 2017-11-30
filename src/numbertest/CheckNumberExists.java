package numbertest;

import java.util.Arrays;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

public class CheckNumberExists {

	public static boolean check(int[] arr,int k)
	{
		Arrays.sort(arr);
		return	(arr[search(arr, k)]==k)? true:false;
			
	}
	public static int search(int[] arr,int k)
	{
		int high=arr.length-1;
		int low=0;
		while(low<=high)
		{
			int mid=(low+high)>>>1;
			int midval=arr[mid];
			if(midval< k)
			{
				low=mid+1;
			}else if(midval>k)
			{
				high=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check(new int[]{1,2,3,4,5,6,7,8,9}, 4));;
	}

}
