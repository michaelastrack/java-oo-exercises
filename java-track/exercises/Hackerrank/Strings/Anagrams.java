package Hackerrank.Strings;

import java.util.Scanner;

public class Anagrams {
	
	/*
	 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. 
	 * The strings may consist at most  English characters; the comparison should NOT be case sensitive. 
	 */
	
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        a=a.toLowerCase();
        b=b.toLowerCase();
        int []array = new int[128];
        
        for(char c: a.toCharArray() ){
             array[(int)(c)]++;
        }
        for(char c: b.toCharArray() ){
            array[(int)(c)]--;
        }
        for(int i: array)
            if (i!=0) return false;
            
        
         return true;    
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
