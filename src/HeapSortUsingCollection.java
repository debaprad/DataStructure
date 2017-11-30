import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSortUsingCollection {

	public static void test(Collection<Integer> c)
	{
		Queue<Integer> q=new PriorityQueue<>(c);
		List<Integer> l=new ArrayList<>();
		//l.addAll(q);
		while(!q.isEmpty())
		{
			l.add(q.remove());
		}
		System.out.println(l);
	}
	public static void main(String[] args) {
		
		test(new ArrayList<Integer>(Arrays.asList(new Integer[]{1,5,2,7,3,8,4})));
	}
}
