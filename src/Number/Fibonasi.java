package Number;

public class Fibonasi {
	public static void main(String[] args) {
		int n=5;
		int prev=0;
		int next=1;
		System.out.println(prev);
		while(n>0)
		{
			int sum=prev+next;
			System.out.println(sum);
			prev=next;
			next=sum;
			--n;
		}
	}
}
