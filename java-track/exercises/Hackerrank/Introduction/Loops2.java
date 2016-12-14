package Hackerrank.Introduction;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String output;
        int s;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            s = 0;
            output = "";
            for (int j = 0; j < n; j++) {
            	if (j == 0) 
            		s = (int) (a + Math.pow(2, j) * b);
            	else 
            		s += Math.pow(2, j) * b;
           
            output += s + " ";
            }
            System.out.println(output);
        }
        in.close();

	}

}
