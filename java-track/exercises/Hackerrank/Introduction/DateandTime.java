package Hackerrank.Introduction;

import java.time.LocalDate;
import java.util.Scanner;

public class DateandTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		in.close();
		LocalDate dt = LocalDate.of(year, month, day);
		System.out.print(dt.getDayOfWeek());

	}

}
