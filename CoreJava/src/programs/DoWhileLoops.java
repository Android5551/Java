package programs;

public class DoWhileLoops {
	public static void main(String[] args) {
		// do runs no matter what
		// initializing
		int x = 0;
		// do this
		do {
			System.out.println("x in do: "+x);
			System.out.println("Runs no matter what! "+x);
			x++;
			System.out.println("after increment "+x);
		}
		while (x < 4);
		// the following will run only after loop ends!
		System.out.println(x+" < 4 is false so loop ends!");
	}
}