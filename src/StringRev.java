
public class StringRev {

	public static String rev(String str)
	{
		if(str.length() <= 1)
		{
			return str;
		}
		return rev(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rev("deba"));
	}

}