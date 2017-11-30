package numbertest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

public class IntersectionOfTwoArray {

	public static void intersection(int[] arr1,int[] arr2)
	{
		Set<Integer> l=new LinkedHashSet<>();
		List<Integer> list=new ArrayList<>();
		for(int x:arr1)
		{
			for(int y:arr2)
			{
				if(x==y)
				{
					list.add(x);
				}
				else
				{
					l.add(x);
				}
			}
		}
		for(int x:list)
			l.remove(x);
		System.out.println(l);
	}
	public static void main(String[] args) {
		intersection(new int[]{12,1,2,3,4,5,13}, new int[]{12,13,14});
	}
}
