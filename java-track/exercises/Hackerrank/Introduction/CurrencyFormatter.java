package Hackerrank.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        Locale.setDefault(new Locale("en","IN"));
        String in = NumberFormat.getCurrencyInstance().format(payment);
        Locale.setDefault(Locale.CHINA);
        String ch = NumberFormat.getCurrencyInstance().format(payment);
        Locale.setDefault(Locale.US);
        String us = NumberFormat.getCurrencyInstance().format(payment);
        Locale.setDefault(Locale.FRANCE);
        String fr = NumberFormat.getCurrencyInstance().format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);

	}

}
