
public class Stringrevers {

	public static String rever(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		return rever(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		System.out.println(rever("debasish"));
		System.out.println(revers(201));
		System.out.println(fact(6));
		fibo(5);
		prime(10);
	}
	public static int revers(int x)
	{
		int rev=0;
		while(x>0)
		{
			int i=x%10;
			rev =rev*10+i;
			x=x/10;
		}
			return rev;
	}
	public static int fact(int x)
	{
		if(x<=1)
		{
			return x;
		}
		return fact(x-1)*x;
	}
	
	public static void fibo(int x)
	{
		int prev,next,sum=0;
		prev=next=1;
		while(x>0)
		{
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
			--x;
		}
	}
	
	public static void prime(int x)
	{
		for(int i=0;i<x;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag)
				System.out.print(i+",");
		}
	}
}
