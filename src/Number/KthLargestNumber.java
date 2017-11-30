package Number;

import java.util.Collections;
import java.util.List;

public class KthLargestNumber {

	public static void main(String[] args) {
		Integer[] numbers = {1,3,5,3,7,0,20,30,15,2,100};
		int position =9;
		System.out.println("Largest number on position "+position +" is: " +getNthLargestNumber(position, numbers));
	}
	
	public static int getNthLargestNumber(int position, Integer[] numbers){
		List<Integer> list = Arrays.asList(numbers);
		Collections.sort(list);
		for (int i=list.size()-1;i>=0;i--) {
			System.out.println("Position "+(list.size()-(i))+" = "+list.get(i));
		}
		return list.get(list.size()-position);
	}

}
