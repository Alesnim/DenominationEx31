package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scannerIn = new Scanner(System.in);
	    int n1 = scannerIn.nextInt();
	    int d1 = scannerIn.nextInt();
        System.out.println(String.format("%d / %d", n1, d1));
        int n2 = scannerIn.nextInt();
        int d2 = scannerIn.nextInt();
        System.out.println(String.format("%d / %d", n2, d2));
        // делим дроби - получаем новую дробь
        int an = n1 * d2;
        int ad = n2 * d1;


        if (an /ad  == 0){
            System.out.println(String.format("%d / %d", an, ad));
        }
        else {
            System.out.println(String.format("%d (%d/%d)",an/ad, an%ad, ad));
        }
    }
}
