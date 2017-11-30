package numbertest;

public class MissingNumber {

	public static int missingNumber(int[] arr)
	{
		int nuSum=0;
		int arrtot=0;
		for (int i = 0; i < arr.length; i++) {
			arrtot+=arr[i];
		}
		System.out.println(arrtot);
		int lenght=arr.length+1;
		nuSum=(lenght*(lenght+1))/2;
		System.out.println(nuSum);
		return nuSum-arrtot;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[]{1,2,3,4,5,6,7,8}));
	}

}
