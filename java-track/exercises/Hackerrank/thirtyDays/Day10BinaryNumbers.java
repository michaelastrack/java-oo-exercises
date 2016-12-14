package Hackerrank.thirtyDays;

import java.util.Scanner;

public class Day10BinaryNumbers {
	
	/*
	 * Given a base- integer,n, convert it to binary (base-2). Then find and print the base-10 
	 * integer denoting the maximum number of consecutive 1's in n's binary representation.
	 */

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        scan.close();
        int max = 0;
        int counter = 0;
        int r;
        
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                counter++;
            }
            else {
                counter = 0;
            }
            if (counter > max) {
                max = counter;
            }
            n = n/2;
        }
        System.out.println(max);

	}

}
