package StringInterview;

public class ReplaceEachCharWithOtherChar {

	public static String replaceChar(String str,char find,char repchar)
	{
		char[] ch=str.toCharArray();
		char[] newchar=new char[ch.length*3];
		int l=0;
		for (int i = 0; i < ch.length; i++)
		{
			
			if(ch[i]==find)
			{
				newchar[l]=repchar;
				l=newchar.length+2;
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		//System.out.println(replaceChar("debasisha", 'a', '%20'));
	}
}
