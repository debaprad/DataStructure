package numbertest;

public class AllPairsSumEqualsGivenNumver {
	public static void sum(int[] arr, int x) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==x)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		sum(new int[]{1,2,3,4,5,6,7,8,9,-3}, 6);
	}
}
