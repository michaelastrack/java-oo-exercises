package Hackerrank.Strings;

import java.util.Scanner;

public class StringsIntroduction {
	
	/*
	 * Given two strings of lowercase English letters,  and , perform the following operations:
1.Sum the lengths of  and .
2.Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
3.Capitalize the first letter in  and  and print them on a single line, separated by a space.

	 */

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
	    System.out.println(A.length() + B.length());

	    if(A.compareTo(B) > 0){
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
	    }

	    A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
	    B = (B.substring(0,1)).toUpperCase() + B.substring(1);
	    System.out.println(A + " " + B);

	}
}
