package Hackerrank.thirtyDays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionariesAndMaps {
	
	/*
	 * Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
	 * You will then be given an unknown number of names to query your phone book for. 
	 * For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; 
	 * if an entry for name is not found, print Not found instead. 
	 */

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            try{
            	int number = phoneBook.get(s);
            	System.out.println(s+"="+number);
            } catch (Exception e){
              	System.out.println("Not found");
            }
        }
        in.close();

	}

}
