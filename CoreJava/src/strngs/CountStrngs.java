package strngs;

public class CountStrngs {

	public static void main(String[] args) {
		// TODO count number of characters in given String 
			String x = "Hello World";
			int count = 0;
			for (int i = 0; i< x.length(); i++) {
				count = count + 1;
			}
			System.out.println("Total number of characters in "+x+" are : "+count);
	}

}
