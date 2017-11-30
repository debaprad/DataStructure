package Number;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class KthSmallestNumber {

	public static int kthsmallest(Integer[] arr,int k)
	{
		List<Integer> list=Arrays.asList(arr);
		Set<Integer> set=new TreeSet<Integer>(list);
		System.out.println(set);
		Iterator<Integer> it=set.iterator();
		int count=1;
		while(it.hasNext())
		{
			if(count==k){
				return it.next();
			}
			it.next();
			count++;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(kthsmallest(new Integer[]{1,4,6,3,6}, 1));
	}
}
