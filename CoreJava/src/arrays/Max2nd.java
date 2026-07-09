package arrays;

public class Max2nd {
	public static void main(String[] args) {
		int[] intarr = { 1, 10, 4, 5, 78 };
		// 0, 1, 2, 3, 4
		for (int i = 0; i < intarr.length; i++) {
			System.out.println("----------");
			System.out.println("i is: " + i);
			int z = intarr[i];
			System.out.println("z is : " + z);
//			if (i == intarr.length-1 )
			// j value keep on incrementing not j = 0 + 1 instead it will be 1,2,3,4
			for (int j = i + 1; j < intarr.length; j++) {
				System.out.println("j,i,z and intarr[j] is : " + j + "," + i + "," + z + " and " + intarr[j]);
				if (z > intarr[j]) {
					System.out.println("yes " + z + " is greater than " + intarr[j]);
				}
			}
		}
	

	}

}
