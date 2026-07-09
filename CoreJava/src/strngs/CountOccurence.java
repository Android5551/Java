package strngs;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO count occurrence of character in string
		String s = "happy";
		char p = 'p';
		int count = 0;
		
		for(int i=0; i< s.length(); i++) {
			if (s.charAt(i) == p) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
