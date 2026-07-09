package arrays;
// bubble sort
public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = { 20, 10, 50, 30, 40 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[j];   // temp = 10
					arr[j] = arr[i]; // 20, 10.. -> 20, 20..
					arr[i] = temp;   // 20, 20 .. -> temp, 20 -> 10, 20
				}
			}

			System.out.println(arr[i]);
		}

	}

}

