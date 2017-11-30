import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRept {

	public static String firstnon(String str)
	{
		List<String> list=new ArrayList<String>();
		Set<String> set=new HashSet<String>();
		for(String s:str.split(" "))
		{
			if(list.contains(s))
			{
				list.remove(s);
				set.add(s);
			}
			else if(set.contains(s))
			{
				continue;
			}
			else
			{
				list.add(s);
			}
		}
		return list.get(0);
	}
	public static void main(String[] args) {
		//System.out.println(firstnon("deba d d d prad x prad y deba p ni ni p g h k g k"));
		//topTwo(new int[]{1,4,6,8,3,5});
		System.out.println(search(new int[]{1,4,6,8,9},9));
	}
	
	
	public static int search(int[] arr,int k)
	{
		int high=arr.length-1;
		int low=0;
		while(low<=high)
		{
			int mid=(low+high)>>>1;
			int midval=arr[mid];
			if(midval>k)
			{
				low=mid+1;
			}
			if(midval<k)
			{
				high=mid-1;
			}
			else
			{
				return mid;
			}
			
		}
		return -10;
	}
	
	public static void topTwo(int[] arr)
	{
		int low=Integer.MIN_VALUE;
		int high=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>high)
			{
				low=high;
				high=i;
			}
			else if(i>low && i !=high)
			{
				low=i;
			}
		}
		System.out.println(low);
		System.out.println(high);
	}
	
	
}
