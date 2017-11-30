package StringInterview;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static Map<Character, Integer> countChars(String str)
	{
		Map<Character, Integer> charMap=new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray())
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		return charMap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> m =countChars("debasisha");
		for(Map.Entry<Character, Integer> mm:m.entrySet())
		{
			System.out.println(mm.getKey() +" -- "+mm.getValue());
		}
	}

}
