package Hackerrank.Introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	static Scanner input = new Scanner(System.in);
	static boolean flag = true;
	static int Base = input.nextInt();
	static int Height = input.nextInt();

	static{
	    try{
	        if(Base <= 0 || Height <= 0){
	            flag = false;
	            throw new Exception("Breadth and height must be positive");
	        }
	    }catch(Exception e){
	        System.out.println(e);
	    }

	}

	public static void main(String[] args){
		if(flag){
			int area=Base*Height;
			System.out.print(area);
		}
		
	}


}
