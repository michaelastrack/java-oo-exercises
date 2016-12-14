package Hackerrank.Strings;

import java.util.Scanner;

public class StringCompare {
	
	/*
	 * Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat",
 "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy"
  and "Zoo" is smaller than "ball".]

	 */

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String S = scan.next();
        int k = scan.nextInt();
        scan.close();
        String first = S.substring(0, k);
        String last = S.substring(0, k);
        for (int i = 0; i+k <= S.length(); i++) {
            if(S.substring(i, i+k).compareTo(first)<0)
                first=S.substring(i, i+k);
        if(S.substring(i, i+k).compareTo(last)>0)
            last=S.substring(i, i+k);
            
        }
        System.out.println(first);
        System.out.println(last);

	}

}
