package numbertest;

public class BinarySearch {

	public static int  search(int[] arr,int k)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)>>>1;
			int midval=arr[mid];
			if(midval<k)
			{
				low=mid+1;
			}
			else if(midval>k)
			{
				high=mid-1;
			}
			else
			{
				return mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.err.println(search(new int[]{1,26,7,98,8,75,9}, 9));;
	}
}
