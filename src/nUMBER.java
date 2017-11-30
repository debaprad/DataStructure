
public class nUMBER {

	public static void sortSelection(Comparable[] comparr)
	{
		for(int i=0;i<comparr.length;i++)
		{
			int min=i;
			for (int j = i+1; j < comparr.length; j++) {
				if(less(comparr[j],comparr[min]))
				{
					min=j;
				}
			}
			swap(comparr,i,min);
		}
	}
	public static void sortInsertion(Comparable[] comp)
	{
		for (int i = 0; i < comp.length; i++) {
			for (int j = i; j>0 && less(comp[j], comp[j-1]); j--) {
				swap(comp, j, j-1);
			}
		}
	}
	public static Comparable[] sortShell(Comparable[] comp)
	{
		int l=comp.length;
		int h=1;
		while(h<l/3)h=3*h+1;
		while(h>=1)
		{
			for (int i = 0; i < comp.length; i++) {
				for (int j = i; j>h && less(comp[j], comp[j-h]); j=j-h) {
					swap(comp, j, j-h);
				}
			}
			h=h/3;
		}
		return comp;
	}
	
	public static boolean less(Comparable comp1,Comparable comp2)
	{
		return comp1.compareTo(comp2) <0;
	}
	public static void  swap(Object[] obj,int x,int y)
	{
		Object temp=obj[x];
		obj[x]=obj[y];
		obj[y]=temp;
	}

	public static void main(String[] args) {
		Integer[] numArr = new Integer[] { 2, 4, 3, 6, 8, 4, 3, 8, 5 };
		sortSelection(numArr);
		for (int x : numArr) {
			System.out.print(x+",");
		}
		System.out.println();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer[] numArr1 = new Integer[] { 2, 4, 3, 6, 8, 4, 3, 8, 5 };
		sortInsertion(numArr1);
		for (int x : numArr1) {
			System.err.print(x+",");
		}
		System.out.println();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer[] numArr2 = new Integer[] { 2, 4, 3, 6, 8, 4, 3, 8, 5 };
		Comparable[] comp=sortShell(numArr2);
		for (int i = 0; i < comp.length; i++) {
			System.out.println(comp[i]);
		}
	}
}
