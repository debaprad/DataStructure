import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stringrevvs {

	public static String rev(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		return rev(str.substring(1))+str.charAt(0);
	}
	public static boolean checkPal(String str)
	{
		int low=0;
		int high=str.length()-1;
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
	public static boolean annagram(String str1,String str2)
	{
		char[] list1=str1.toLowerCase().toCharArray();
		char[] list2=str2.toLowerCase().toCharArray();
		Arrays.sort(list1);
		Arrays.sort(list2);
		return Arrays.equals(list1, list2);
	}
	public static String reverSentence(String str)
	{
		String[] strArr=str.split("\\s");
		StringBuilder builder=new StringBuilder();
		for(int i=strArr.length-1;i>=0;--i)
		{
			builder.append(strArr[i]+" ");
		}
		return builder.toString().trim();
	}
	public static String firstNonRepeated(String str)
	{
		String[] strArr=str.split("\\s");
		List<String> list=new ArrayList<String>();
		Set<String> set=new HashSet<String>();
		for (String s : strArr) {
			if(list.contains(s))
			{
				list.remove(s);
				set.add(s);
			}
			else if(set.contains(s))
			{
				continue;
			}
			else
			{
				list.add(s);
			}
		}
		return list.get(0);
	}
	public static void permutation(String word)
	{
		permutation("",word);
	}
	private static void permutation1(String pre,String word)
	{
		if(word.isEmpty())
		{
			System.err.println(pre);
		}
		else{
		for (int j = 0; j < word.length(); j++) {
			permutation(pre+word.charAt(j), word.substring(0,j)+word.substring(j+1,word.length()));
		}
		}
		
		
	}
	
	private static void permutation(String perm,String word)
	{
	if(word.isEmpty())
	{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(perm);
	}
	else
	{
		for (int i = 0; i < word.length(); i++) {
			System.out.println("perm :"+perm+"for i :"+i+" param1 :"+word.substring(0,i)+" parm2 :"+word.substring(i+1,word.length()));
			 permutation(perm+word.charAt(i), word.substring(0,i)+word.substring(i+1,word.length()));
		}
	}
	}
	public static void main(String[] args) {
		
		System.out.println(rev("deba"));
		System.out.println(checkPal("ded"));
		System.out.println(annagram("kdebak", "dekbak"));
		System.out.println(reverSentence("Hello debasish how are you"));
		System.out.println(firstNonRepeated("hi deba hi ishu love u ishu deba"));
		System.out.println("23".substring(0, 1));
		permutation("123");
	}
}
