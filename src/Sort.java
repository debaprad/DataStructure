
public class Sort {

	public static void sortBuble(Comparable[] comp)
	{
		for (int i = 0; i < comp.length; i++) {
			int min=i;
			for (int j = i+1; j < comp.length; j++) {
				if(less(comp[j],comp[min]))
				{
					min=j;
					
				}
				swap(comp,i,min);
			}
		}
	}
	public static boolean less(Comparable x,Comparable y)
	{
		return  x.compareTo(y) < 0;
	}
	public static void swap(Object[] obj,int x,int y)
	{
		Object temp=obj[x];
		obj[x]=obj[y];
		obj[y]=temp;
	}
	public static void main(String[] args) {
		Integer[] arr=new Integer[]{1,4,3,6,4,9,5};
		sortBuble(arr);
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}
