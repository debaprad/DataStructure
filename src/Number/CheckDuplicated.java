package Number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicated {

	public static boolean duplicateCheck(Integer[] arr)
	{
		List<Integer> list=Arrays.asList(arr);
		Set<Integer> set=new HashSet<>(list);
		if(list.size()!=set.size())
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(duplicateCheck(new Integer[]{12,14,14}));
	}

}
