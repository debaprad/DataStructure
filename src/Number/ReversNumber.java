package Number;

import org.apache.commons.lang3.ArrayUtils;

public class ReversNumber {

	public static void revers(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			++i;--j;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[]{12,4,3,54};
		revers(x);
		for(int r:x)
		System.out.println(r);
	}

}
