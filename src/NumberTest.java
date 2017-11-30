import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NumberTest {

	public static void topTwo(int[] arr)
	{
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int x:arr)
		{
			if(x>max1)
			{
				max2=max1;
				max1=x;
			}
			else if(x>max2 && x!=max1)
			{
				max2=x;
			}
		}
		System.out.println("max1 : "+max1+" max2 :"+max2);
	}
	public static int reversNumber(int x)
	{
		int r=0;
		while(x>0)
		{
			int temp=x%10;
			r=r*10+temp;
			x=x/10;
		}
		return r;
	}
	public static void removeDuplicates(Integer[] arr)
	{
		List<Integer> list=Arrays.asList(arr);
		Set<Integer> set=new LinkedHashSet<>(list);
		Iterator<Integer> it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topTwo(new int[]{2,5,2,7,34,9,3,54});
		System.out.println(reversNumber(123));
		removeDuplicates(new Integer[]{2,5,2,7,34,9,3,54});
	}

}
