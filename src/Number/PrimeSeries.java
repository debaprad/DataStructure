package Number;

public class PrimeSeries {
	
	public static void prime(int n)
	{
		for (int i = 1; i <= n; i++) {
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		prime(10);
	}
}
