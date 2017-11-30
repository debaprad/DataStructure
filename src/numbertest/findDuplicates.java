package numbertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {

	public static Object[] duplicates(Integer[] arr)
	{
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> set=new LinkedHashSet<>();
		for(Integer i:arr)
		{
			if(set.contains(i))
			{
				continue;
			}
			if(list.contains(i))
			{
				list.remove(i);
				set.add(i);
			}
			else
			{
				list.add(i);
			}
		}
		System.out.println(list);
		System.out.println(set);
		return set.toArray();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] x=duplicates(new Integer[]{1,1,2,3,4,3,4,6,2,2});
		for(Object i:x)
		{
			System.out.println(i.toString());
		}

	}

}
