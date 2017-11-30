package StringInterview;

public class StringPermutations {
	public static void main(String args[]) {
		permutation("123");
	}

	/*
	 * * A method exposed to client to calculate permutation of String in Java.
	 */
	public static void permutation(String input) {
		permutation("", input);
	}

	/*
	 * * Recursive method which actually prints all permutations * of given
	 * String, but since we are passing an empty String * as current permutation
	 * to start with, * I have made this method private and didn't exposed it to
	 * client.
	 */
	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.err.println("inside if :"+perm );
		} else {
			for (int i = 0; i < word.length(); i++) {
				/*try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String s1=perm + word.charAt(i);
				String s2=word.substring(0, i);
				String s3=word.substring(i + 1, word.length());
				System.out.println("part1 :"+s2+" part2 :"+s3);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("intput1 :"+perm + word.charAt(i)+ "  input2 :"+word.substring(0, i) + word.substring(i + 1, word.length()));*/
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}
}
