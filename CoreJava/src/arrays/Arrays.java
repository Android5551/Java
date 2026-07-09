package arrays;

public class Arrays {
public static void main(String[] args) {
	int [] intarr = {1,3,4,5};
	System.out.println(intarr.length); //4 is length of array
	System.out.println(intarr[3]); // for index ; starts from 0
	// sum of array values
	System.out.println(intarr[0]+intarr[intarr.length-1]); // -1 otherwise outofbound
	// error ArrayIndexOutOfBoundsException
	// appending strings
    System.out.println(intarr[0]+" "+intarr[2]); 
	System.out.println("----------------");

    // printing all elements of array including index
    for(int i = 0; i < 4; i++) {
    	System.out.println("array index "+i+" array value "+intarr[i]);
    }
    System.out.println("----------------");
    // to print all elements of array without index
    // a is variable for each element in array
    for(int a: intarr) {
    	System.out.println(a);
    }
	System.out.println("----------------");
	int [] a = new int[3]; // 'new' limits the size of array to 3
	// adding elements to array
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	// a[3] = 5; // on adding 4th element
	// gets Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	// at CoreJava/arrays.PrintMaxAndMin.main(PrintMaxAndMin.java:14)
	
	for(int b:a) {
		System.out.println(b);
	}
	
	
}
}
