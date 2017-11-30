package StringInterview;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagramTest {

	public static boolean anagram(String str1,String str2)
	{
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("deba","abeD"));
	}

}
