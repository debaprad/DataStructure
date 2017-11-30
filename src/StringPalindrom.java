
public class StringPalindrom {

	public static boolean paliTest(String str)
	{
		int high=str.length()-1;
		int low=0;
		while(low<=high)
		{
			if(str.charAt(low)!=str.charAt(high))
			{
				return false;
			}
			++low;
			--high;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(paliTest("dkjjkkd"));
	}
}
