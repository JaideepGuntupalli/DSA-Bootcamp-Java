package com.jaideep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Principle: ");
	    int principle = input.nextInt();

		System.out.print("Time: ");
	    int time = input.nextInt();

		System.out.print("Rate: ");
	    int rate = input.nextInt();

        System.out.println( "Simple Interest: " + principle * time * rate ) ;
    }
}
