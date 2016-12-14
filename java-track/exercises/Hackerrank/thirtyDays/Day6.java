package Hackerrank.thirtyDays;

import java.util.Scanner;
/*
 * Task 
 Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  
 space-separated strings on a single line (see the Sample below for more detail). 

Note:  is considered to be an even index. 

 */

public class Day6 {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    String s;

    for(int i=0;i<T;i++){
        s = scan.next();

        for(int j=0;j<s.length();j++){

            if(j%2 ==0){
                System.out.print(s.charAt(j));
            }
        } 
        System.out.print(" ");
        for(int j=0;j<s.length();j++){
            if(j%2==1){
                System.out.print(s.charAt(j));
            }

        }
        System.out.println();
    }
    scan.close();
    }

}
