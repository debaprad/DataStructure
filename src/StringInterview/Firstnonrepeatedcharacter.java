package StringInterview;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Firstnonrepeatedcharacter {

	/*in this API
	 * list contains first non repeated char
	 * set contains first repeated char
	 * */
	public static Character test(String str)
	{
		List<Character> list=new ArrayList<Character>();
		Set<Character> set=new LinkedHashSet<Character>();
		for(Character ch:str.toCharArray())
		{
			if(set.contains(ch))
			{
				continue;
			}
			if(list.contains(ch))
			{
				list.remove(ch);
				set.add(ch);
			}
			else
			{
				list.add(ch);
			}
		}
		System.out.println(set);
		System.out.println(list);
		if(!list.isEmpty())
		return list.get(0);
		return null;
	}
	public static void main(String[] args) {
		String str="debadsishd";
		//System.out.println(getFirstNonRepeat(str));
		System.out.println(test("debaa"));
	}
}
