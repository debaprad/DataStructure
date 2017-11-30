package StringInterview;

public class Bomberman {

	public String bomber(String str)
	{
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			str=bom(str);
			l=str.length();
		}
		return str;
	}
	
	public String bom(String str)
	{
		String bomb="";
		char ch1;
		char ch2;
		for (int i = 0; i <str.length()-1; i++) {
			ch1=str.charAt(i);
			ch2=str.charAt(i+1);
			boolean flag=true;
			if(ch1==ch2)
			{
				if(bomb.isEmpty())
				{
					bomb=ch1+""+ch2;
					flag=false;
				}
				if(!bomb.isEmpty())
				{
					bomb=bomb+ch2;
				}
			}
		}
		System.out.println(bomb);
		String res=str.replace(bomb, "");
		//System.out.println(res);
		return res;
	}
    public static void main(String[] args) {
    	System.out.println(new Bomberman().bomber("aabbaggh"));
    }
}