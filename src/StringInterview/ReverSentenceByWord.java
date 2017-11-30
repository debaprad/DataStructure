package StringInterview;

public class ReverSentenceByWord {

	public static String revers(String str)
	{
		if(str.trim().isEmpty())
		{
			return str;
		}
			StringBuilder buil=new StringBuilder();
			String[] strArr=str.split("\\s");
			for (int i = strArr.length-1; i >0; i--) {
				buil.append(strArr[i]+" ");
			}
		return buil.toString().trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(revers("hello deba how are u"));
	}

}
