package Hackerrank.Introduction;

import java.util.Scanner;

public class Stdinpractice2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine(); // Necessary to clear the keyboard buffer in case the String s has multiple words
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}
