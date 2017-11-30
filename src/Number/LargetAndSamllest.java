package Number;

public class LargetAndSamllest {

	public static void main(String[] args) {
		int[] arr={12,3,5,32,43,34,32};
		int large=Integer.MIN_VALUE;
		int smal=Integer.MAX_VALUE;
		for (int i:arr) {
			if(i>large)
			{
				large=i;
			}
			else if(i<smal)
			{
				smal=i;
			}
		}
		System.out.println("small "+smal);
		System.out.println("large "+large);
	}
}
