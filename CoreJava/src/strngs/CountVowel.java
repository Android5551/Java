package strngs;

public class CountVowel {

	public static void main(String[] args) {
		// TODO count number of vowels in string
		String x = "elephant";
//		String y = "aeiou";
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
//			for (int j = 0; j < y.length(); j++) {
//				if (x.charAt(i) == y.charAt(j)) {
			if (x.charAt(i)=='a' | x.charAt(i)=='e' | x.charAt(i)=='i'| x.charAt(i)=='o'| x.charAt(i)=='u')
					count = count + 1;
//				}
//			}

		}
		System.out.println("Total number of vowels in " + x + " are : " + count);
	}

	}


