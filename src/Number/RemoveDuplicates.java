package Number;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {

	public static Integer[] removeDuplicates(Integer[] arr)
	{
		List<Integer> list=new LinkedList<Integer>();
		for(Integer i:arr)
		{
			if(list.contains(i))
			{
				continue;
			}
			else
			{
				list.add(i);
			}
		}
		Object[] objarr=list.toArray();
		Integer[] integerArray = Arrays.copyOf(objarr, objarr.length, Integer[].class);
		return integerArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Integer i:removeDuplicates(new Integer[]{1,1,3,5,2,4,23,1,23,2}))
		{
			System.out.println(i);
		}
	}

}
