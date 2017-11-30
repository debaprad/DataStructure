package Number;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.omg.PortableInterceptor.INACTIVE;

public class NdivideKtimes {

	/*Given an array of of size n and a number k, find all elements that appear more than n/k times?
*/
	public static void NKtimes(Integer[] arr,int k)
	{
		int n=arr.length;
		int size=n/k;
		Set<Integer> s=new LinkedHashSet<>();
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(Integer x:arr)
		{
			if(map.containsKey(x))
			{
				map.put(x, map.get(x)+1);
				if(map.get(x)>size)
				{
					s.add(x);
				}
			}
			else
			{
				map.put(x, 1);
			}
			
		}
	System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NKtimes(new Integer[]{3, 1, 2, 2, 1, 2, 3, 3},4);
	}

}
