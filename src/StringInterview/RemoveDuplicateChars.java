package StringInterview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateChars {

	public static String removedulicates(String str) {
		//char[] ch=str.toCharArray();
		List<Character> l=new LinkedList<Character>();
		for(Character ch:str.toCharArray())
		{
			if(l.contains(ch))
			{
				continue;
			}
			else
			{
				l.add(ch);
			}
		}
		StringBuilder build=new StringBuilder();
		for(Character ch:l)
		{
			build.append(ch+" ");
		}
		return build.toString().trim();
	}
	public static void main(String[] args) {
		System.out.println(removedulicates("debasisha"));
	}
}
