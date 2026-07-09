package date;

//import needed for root package other than java.lang
import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		System.out.println("today's: " + now);
		System.out.println("day of week: " + now.getDayOfWeek());
		System.out.println("day of month: " + now.getDayOfMonth());
		System.out.println("month: " + now.getMonth());
		System.out.println("day of year: " + now.getDayOfYear());
		System.out.println("year: " + now.getYear());

		System.out.println("--------------");
		
		LocalDate dob = LocalDate.of(2000, 03, 20);
		
		System.out.println("dob: " + dob);
		System.out.println("dob day of week: " + dob.getDayOfWeek());
		System.out.println("dob day of month: " + dob.getDayOfMonth());
		System.out.println("dob month: " + dob.getMonth());
		System.out.println("dob day of year: " + dob.getDayOfYear());
		System.out.println("dob year: " + dob.getYear());
		
		System.out.println("----------");
		System.out.println("age: " + (now.getYear() - dob.getYear()));
		
		

	}

}