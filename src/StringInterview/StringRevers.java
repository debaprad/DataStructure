package StringInterview;

public class StringRevers {

	public static String revers(String str)
	{
		if(str.length()==1)
		{
			return str.substring(0);
		}
		return str.charAt(str.length()-1)+revers(str.substring(0, str.length()-1));
	}
	public static void main(String[] args) {
		System.out.println(revRec("debasisha"));
		rev("debasisha");
		System.out.println(pallindrom("ctc"));
	}
	public static String revRec(String str)
	{
		if(str.length()<=1)
			return str;
		return revRec(str.substring(1))+str.charAt(0);
	}
	public static void rev(String str)
	{
		char[] ch=str.toCharArray();
		int l=0;
		int h=ch.length-1;
		while(l<h)
		{
			char c=ch[l];
			ch[l]=ch[h];
			ch[h]=c;
			++l;
			--h;
		}
		System.out.println(new String(ch));
	}
	
	public static boolean pallindrom(String str)
	{
		char[] ch=str.toCharArray();
		int l=0;
		int h=ch.length-1;
		while(l<h)
		{
			if(ch[l]!=ch[h])
				return false;
			++l;
			--h;
		}
		return true;
	}
}
