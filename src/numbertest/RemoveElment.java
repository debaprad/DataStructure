package numbertest;

public class RemoveElment {

	public static void remove(int[] arr,int n)
	{
		int size=arr.length-1;
		for(int i=0; i<arr.length-1; i++)
	       {
	           if(arr[i] == n)
	           {
	        	   System.out.println("hi");
	               for(int j=i+1; j<arr.length-1; j++)
	               {
	                   arr[i] = arr[j];
	                   //++i;
	               }
	               
	               //break;
	           }
	       }
	}
	public static void main(String[] args) {
		int []arr=new int[]{1,2,3,4,5,6};
		remove(arr, 3);
		for(int x:arr)
			System.out.println(x);
	}
}
