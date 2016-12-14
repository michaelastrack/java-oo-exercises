package Hackerrank.Introduction;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		int result;
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		scan.close();
		for (int i = 1; i < 11; i++) {
			result = n*i;
			System.out.println(n + " x " + i + " = " + result);
		}

	}

}
