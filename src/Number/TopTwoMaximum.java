package Number;

public class TopTwoMaximum {

	public static void topTwo(int[] arr)
	{
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>max1)
			{
				max2=max1;
				max1=i;
			}
			else if(i>max2 && i!=max1)
			{
				max2=i;
			}
		}
		System.out.println("max 1 : "+max1+" max 2 : "+max2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topTwo(new int[]{1,23,43,43,23});
	}

}
