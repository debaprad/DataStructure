package StringInterview;

public class CountVowelsAndCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0;int cons=0;
		String str="debasishahjkiiiii";
		for(char ch:str.toCharArray())
		{
			switch(ch)
			{
			case 'a':++vowels;
			break;
			case 'e':++vowels;
			break;
			case 'i':++vowels;
			break;
			case 'o':++vowels;
			break;
			case 'u':++vowels;
			break;
			default: ++cons;
			break;
			}
		}
		System.out.println("vowels "+vowels+ " cons "+cons);
	}

}
