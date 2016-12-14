package Hackerrank.Introduction;

import java.util.Scanner;

public class EndofFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String s;
		int i = 1;
		while (scan.hasNext()) {
			s = scan.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
		scan.close();

	}

}
